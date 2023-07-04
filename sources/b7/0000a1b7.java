package org.spongycastle.jce;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DEROutputStream;
import org.spongycastle.asn1.pkcs.ContentInfo;
import org.spongycastle.asn1.pkcs.MacData;
import org.spongycastle.asn1.pkcs.Pfx;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.DigestInfo;

/* loaded from: classes4.dex */
public class PKCS12Util {
    private static byte[] calculatePbeMac(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr, int i11, char[] cArr, byte[] bArr2, String str) {
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(aSN1ObjectIdentifier.getId(), str);
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i11);
        SecretKey generateSecret = secretKeyFactory.generateSecret(new PBEKeySpec(cArr));
        Mac mac = Mac.getInstance(aSN1ObjectIdentifier.getId(), str);
        mac.init(generateSecret, pBEParameterSpec);
        mac.update(bArr2);
        return mac.doFinal();
    }

    public static byte[] convertToDefiniteLength(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DEROutputStream dEROutputStream = new DEROutputStream(byteArrayOutputStream);
        Pfx pfx = Pfx.getInstance(bArr);
        byteArrayOutputStream.reset();
        dEROutputStream.writeObject(pfx);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] convertToDefiniteLength(byte[] bArr, char[] cArr, String str) {
        Pfx pfx = Pfx.getInstance(bArr);
        ContentInfo authSafe = pfx.getAuthSafe();
        ASN1OctetString aSN1OctetString = ASN1OctetString.getInstance(authSafe.getContent());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DEROutputStream dEROutputStream = new DEROutputStream(byteArrayOutputStream);
        dEROutputStream.writeObject(new ASN1InputStream(aSN1OctetString.getOctets()).readObject());
        ContentInfo contentInfo = new ContentInfo(authSafe.getContentType(), new DEROctetString(byteArrayOutputStream.toByteArray()));
        MacData macData = pfx.getMacData();
        try {
            int intValue = macData.getIterationCount().intValue();
            Pfx pfx2 = new Pfx(contentInfo, new MacData(new DigestInfo(new AlgorithmIdentifier(macData.getMac().getAlgorithmId().getAlgorithm(), DERNull.INSTANCE), calculatePbeMac(macData.getMac().getAlgorithmId().getAlgorithm(), macData.getSalt(), intValue, cArr, ASN1OctetString.getInstance(contentInfo.getContent()).getOctets(), str)), macData.getSalt(), intValue));
            byteArrayOutputStream.reset();
            dEROutputStream.writeObject(pfx2);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e11) {
            throw new IOException("error constructing MAC: " + e11.toString());
        }
    }
}