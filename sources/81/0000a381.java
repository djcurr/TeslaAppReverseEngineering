package org.spongycastle.pkcs;

import java.io.IOException;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.pkcs.ContentInfo;
import org.spongycastle.asn1.pkcs.MacData;
import org.spongycastle.asn1.pkcs.PKCS12PBEParams;
import org.spongycastle.asn1.pkcs.Pfx;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class PKCS12PfxPdu {
    private Pfx pfx;

    public PKCS12PfxPdu(Pfx pfx) {
        this.pfx = pfx;
    }

    private static Pfx parseBytes(byte[] bArr) {
        try {
            return Pfx.getInstance(ASN1Primitive.fromByteArray(bArr));
        } catch (ClassCastException e11) {
            throw new PKCSIOException("malformed data: " + e11.getMessage(), e11);
        } catch (IllegalArgumentException e12) {
            throw new PKCSIOException("malformed data: " + e12.getMessage(), e12);
        }
    }

    public ContentInfo[] getContentInfos() {
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(ASN1OctetString.getInstance(this.pfx.getAuthSafe().getContent()).getOctets());
        ContentInfo[] contentInfoArr = new ContentInfo[aSN1Sequence.size()];
        for (int i11 = 0; i11 != aSN1Sequence.size(); i11++) {
            contentInfoArr[i11] = ContentInfo.getInstance(aSN1Sequence.getObjectAt(i11));
        }
        return contentInfoArr;
    }

    public byte[] getEncoded() {
        return toASN1Structure().getEncoded();
    }

    public AlgorithmIdentifier getMacAlgorithmID() {
        MacData macData = this.pfx.getMacData();
        if (macData != null) {
            return macData.getMac().getAlgorithmId();
        }
        return null;
    }

    public boolean hasMac() {
        return this.pfx.getMacData() != null;
    }

    public boolean isMacValid(PKCS12MacCalculatorBuilderProvider pKCS12MacCalculatorBuilderProvider, char[] cArr) {
        if (hasMac()) {
            MacData macData = this.pfx.getMacData();
            try {
                return Arrays.constantTimeAreEqual(new MacDataGenerator(pKCS12MacCalculatorBuilderProvider.get(new AlgorithmIdentifier(macData.getMac().getAlgorithmId().getAlgorithm(), new PKCS12PBEParams(macData.getSalt(), macData.getIterationCount().intValue())))).build(cArr, ASN1OctetString.getInstance(this.pfx.getAuthSafe().getContent()).getOctets()).getEncoded(), this.pfx.getMacData().getEncoded());
            } catch (IOException e11) {
                throw new PKCSException("unable to process AuthSafe: " + e11.getMessage());
            }
        }
        throw new IllegalStateException("no MAC present on PFX");
    }

    public Pfx toASN1Structure() {
        return this.pfx;
    }

    public byte[] getEncoded(String str) {
        return toASN1Structure().getEncoded(str);
    }

    public PKCS12PfxPdu(byte[] bArr) {
        this(parseBytes(bArr));
    }
}