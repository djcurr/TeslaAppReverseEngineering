package org.spongycastle.openssl;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.cms.ContentInfo;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.DSAParameter;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.cert.X509AttributeCertificateHolder;
import org.spongycastle.cert.X509CRLHolder;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.pkcs.PKCS10CertificationRequest;
import org.spongycastle.pkcs.PKCS8EncryptedPrivateKeyInfo;
import org.spongycastle.util.Strings;
import org.spongycastle.util.io.pem.PemGenerationException;
import org.spongycastle.util.io.pem.PemHeader;
import org.spongycastle.util.io.pem.PemObject;
import org.spongycastle.util.io.pem.PemObjectGenerator;

/* loaded from: classes4.dex */
public class MiscPEMGenerator implements PemObjectGenerator {
    private static final ASN1ObjectIdentifier[] dsaOids = {X9ObjectIdentifiers.id_dsa, OIWObjectIdentifiers.dsaWithSHA1};
    private static final byte[] hexEncodingTable = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
    private final PEMEncryptor encryptor;
    private final Object obj;

    public MiscPEMGenerator(Object obj) {
        this.obj = obj;
        this.encryptor = null;
    }

    private PemObject createPemObject(Object obj) {
        byte[] encoded;
        String str;
        if (obj instanceof PemObject) {
            return (PemObject) obj;
        }
        if (obj instanceof PemObjectGenerator) {
            return ((PemObjectGenerator) obj).generate();
        }
        if (obj instanceof X509CertificateHolder) {
            encoded = ((X509CertificateHolder) obj).getEncoded();
            str = "CERTIFICATE";
        } else if (obj instanceof X509CRLHolder) {
            encoded = ((X509CRLHolder) obj).getEncoded();
            str = "X509 CRL";
        } else if (obj instanceof X509TrustedCertificateBlock) {
            encoded = ((X509TrustedCertificateBlock) obj).getEncoded();
            str = "TRUSTED CERTIFICATE";
        } else if (obj instanceof PrivateKeyInfo) {
            PrivateKeyInfo privateKeyInfo = (PrivateKeyInfo) obj;
            ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
            if (algorithm.equals(PKCSObjectIdentifiers.rsaEncryption)) {
                encoded = privateKeyInfo.parsePrivateKey().toASN1Primitive().getEncoded();
                str = "RSA PRIVATE KEY";
            } else {
                ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = dsaOids;
                if (!algorithm.equals(aSN1ObjectIdentifierArr[0]) && !algorithm.equals(aSN1ObjectIdentifierArr[1])) {
                    if (algorithm.equals(X9ObjectIdentifiers.id_ecPublicKey)) {
                        encoded = privateKeyInfo.parsePrivateKey().toASN1Primitive().getEncoded();
                        str = "EC PRIVATE KEY";
                    } else {
                        throw new IOException("Cannot identify private key");
                    }
                } else {
                    DSAParameter dSAParameter = DSAParameter.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
                    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                    aSN1EncodableVector.add(new ASN1Integer(0L));
                    aSN1EncodableVector.add(new ASN1Integer(dSAParameter.getP()));
                    aSN1EncodableVector.add(new ASN1Integer(dSAParameter.getQ()));
                    aSN1EncodableVector.add(new ASN1Integer(dSAParameter.getG()));
                    BigInteger value = ASN1Integer.getInstance(privateKeyInfo.parsePrivateKey()).getValue();
                    aSN1EncodableVector.add(new ASN1Integer(dSAParameter.getG().modPow(value, dSAParameter.getP())));
                    aSN1EncodableVector.add(new ASN1Integer(value));
                    encoded = new DERSequence(aSN1EncodableVector).getEncoded();
                    str = "DSA PRIVATE KEY";
                }
            }
        } else if (obj instanceof SubjectPublicKeyInfo) {
            encoded = ((SubjectPublicKeyInfo) obj).getEncoded();
            str = "PUBLIC KEY";
        } else if (obj instanceof X509AttributeCertificateHolder) {
            encoded = ((X509AttributeCertificateHolder) obj).getEncoded();
            str = "ATTRIBUTE CERTIFICATE";
        } else if (obj instanceof PKCS10CertificationRequest) {
            encoded = ((PKCS10CertificationRequest) obj).getEncoded();
            str = "CERTIFICATE REQUEST";
        } else if (obj instanceof PKCS8EncryptedPrivateKeyInfo) {
            encoded = ((PKCS8EncryptedPrivateKeyInfo) obj).getEncoded();
            str = "ENCRYPTED PRIVATE KEY";
        } else if (obj instanceof ContentInfo) {
            encoded = ((ContentInfo) obj).getEncoded();
            str = "PKCS7";
        } else {
            throw new PemGenerationException("unknown object passed - can't encode.");
        }
        PEMEncryptor pEMEncryptor = this.encryptor;
        if (pEMEncryptor != null) {
            String upperCase = Strings.toUpperCase(pEMEncryptor.getAlgorithm());
            if (upperCase.equals("DESEDE")) {
                upperCase = "DES-EDE3-CBC";
            }
            byte[] iv2 = this.encryptor.getIV();
            byte[] encrypt = this.encryptor.encrypt(encoded);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new PemHeader("Proc-Type", "4,ENCRYPTED"));
            arrayList.add(new PemHeader("DEK-Info", upperCase + "," + getHexEncoded(iv2)));
            return new PemObject(str, arrayList, encrypt);
        }
        return new PemObject(str, encoded);
    }

    private String getHexEncoded(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i11 = 0; i11 != bArr.length; i11++) {
            int i12 = bArr[i11] & 255;
            int i13 = i11 * 2;
            byte[] bArr2 = hexEncodingTable;
            cArr[i13] = (char) bArr2[i12 >>> 4];
            cArr[i13 + 1] = (char) bArr2[i12 & 15];
        }
        return new String(cArr);
    }

    @Override // org.spongycastle.util.io.pem.PemObjectGenerator
    public PemObject generate() {
        try {
            return createPemObject(this.obj);
        } catch (IOException e11) {
            throw new PemGenerationException("encoding exception: " + e11.getMessage(), e11);
        }
    }

    public MiscPEMGenerator(Object obj, PEMEncryptor pEMEncryptor) {
        this.obj = obj;
        this.encryptor = pEMEncryptor;
    }
}