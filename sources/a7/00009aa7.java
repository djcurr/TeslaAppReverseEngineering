package org.spongycastle.cms;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.cms.OtherRevocationInfoFormat;
import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.asn1.eac.EACObjectIdentifiers;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.AttributeCertificate;
import org.spongycastle.asn1.x509.Certificate;
import org.spongycastle.asn1.x509.CertificateList;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.cert.X509AttributeCertificateHolder;
import org.spongycastle.cert.X509CRLHolder;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.spongycastle.util.CollectionStore;
import org.spongycastle.util.Store;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class CMSSignedHelper {
    static final CMSSignedHelper INSTANCE = new CMSSignedHelper();
    private static final Map digestAlgs;
    private static final Map digestAliases;
    private static final Map encryptionAlgs;

    static {
        HashMap hashMap = new HashMap();
        encryptionAlgs = hashMap;
        HashMap hashMap2 = new HashMap();
        digestAlgs = hashMap2;
        HashMap hashMap3 = new HashMap();
        digestAliases = hashMap3;
        addEntries(NISTObjectIdentifiers.dsa_with_sha224, "SHA224", "DSA");
        addEntries(NISTObjectIdentifiers.dsa_with_sha256, "SHA256", "DSA");
        addEntries(NISTObjectIdentifiers.dsa_with_sha384, "SHA384", "DSA");
        addEntries(NISTObjectIdentifiers.dsa_with_sha512, "SHA512", "DSA");
        addEntries(OIWObjectIdentifiers.dsaWithSHA1, "SHA1", "DSA");
        addEntries(OIWObjectIdentifiers.md4WithRSA, "MD4", "RSA");
        addEntries(OIWObjectIdentifiers.md4WithRSAEncryption, "MD4", "RSA");
        addEntries(OIWObjectIdentifiers.md5WithRSA, "MD5", "RSA");
        addEntries(OIWObjectIdentifiers.sha1WithRSA, "SHA1", "RSA");
        addEntries(PKCSObjectIdentifiers.md2WithRSAEncryption, "MD2", "RSA");
        addEntries(PKCSObjectIdentifiers.md4WithRSAEncryption, "MD4", "RSA");
        addEntries(PKCSObjectIdentifiers.md5WithRSAEncryption, "MD5", "RSA");
        addEntries(PKCSObjectIdentifiers.sha1WithRSAEncryption, "SHA1", "RSA");
        addEntries(PKCSObjectIdentifiers.sha224WithRSAEncryption, "SHA224", "RSA");
        addEntries(PKCSObjectIdentifiers.sha256WithRSAEncryption, "SHA256", "RSA");
        addEntries(PKCSObjectIdentifiers.sha384WithRSAEncryption, "SHA384", "RSA");
        addEntries(PKCSObjectIdentifiers.sha512WithRSAEncryption, "SHA512", "RSA");
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA1, "SHA1", "ECDSA");
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA224, "SHA224", "ECDSA");
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA256, "SHA256", "ECDSA");
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA384, "SHA384", "ECDSA");
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA512, "SHA512", "ECDSA");
        addEntries(X9ObjectIdentifiers.id_dsa_with_sha1, "SHA1", "DSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_1, "SHA1", "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_224, "SHA224", "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_256, "SHA256", "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_384, "SHA384", "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_512, "SHA512", "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1, "SHA1", "RSA");
        addEntries(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256, "SHA256", "RSA");
        addEntries(EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1, "SHA1", "RSAandMGF1");
        addEntries(EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256, "SHA256", "RSAandMGF1");
        hashMap.put(X9ObjectIdentifiers.id_dsa.getId(), "DSA");
        hashMap.put(PKCSObjectIdentifiers.rsaEncryption.getId(), "RSA");
        hashMap.put(TeleTrusTObjectIdentifiers.teleTrusTRSAsignatureAlgorithm, "RSA");
        hashMap.put(X509ObjectIdentifiers.id_ea_rsa.getId(), "RSA");
        hashMap.put(CMSSignedGenerator.ENCRYPTION_RSA_PSS, "RSAandMGF1");
        hashMap.put(CryptoProObjectIdentifiers.gostR3410_94.getId(), "GOST3410");
        hashMap.put(CryptoProObjectIdentifiers.gostR3410_2001.getId(), "ECGOST3410");
        hashMap.put("1.3.6.1.4.1.5849.1.6.2", "ECGOST3410");
        hashMap.put("1.3.6.1.4.1.5849.1.1.5", "GOST3410");
        hashMap.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001.getId(), "ECGOST3410");
        hashMap.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94.getId(), "GOST3410");
        hashMap2.put(PKCSObjectIdentifiers.md2.getId(), "MD2");
        hashMap2.put(PKCSObjectIdentifiers.md4.getId(), "MD4");
        hashMap2.put(PKCSObjectIdentifiers.md5.getId(), "MD5");
        hashMap2.put(OIWObjectIdentifiers.idSHA1.getId(), "SHA1");
        hashMap2.put(NISTObjectIdentifiers.id_sha224.getId(), "SHA224");
        hashMap2.put(NISTObjectIdentifiers.id_sha256.getId(), "SHA256");
        hashMap2.put(NISTObjectIdentifiers.id_sha384.getId(), "SHA384");
        hashMap2.put(NISTObjectIdentifiers.id_sha512.getId(), "SHA512");
        hashMap2.put(TeleTrusTObjectIdentifiers.ripemd128.getId(), "RIPEMD128");
        hashMap2.put(TeleTrusTObjectIdentifiers.ripemd160.getId(), "RIPEMD160");
        hashMap2.put(TeleTrusTObjectIdentifiers.ripemd256.getId(), "RIPEMD256");
        hashMap2.put(CryptoProObjectIdentifiers.gostR3411.getId(), "GOST3411");
        hashMap2.put("1.3.6.1.4.1.5849.1.2.1", "GOST3411");
        hashMap3.put("SHA1", new String[]{McElieceCCA2KeyGenParameterSpec.SHA1});
        hashMap3.put("SHA224", new String[]{McElieceCCA2KeyGenParameterSpec.SHA224});
        hashMap3.put("SHA256", new String[]{McElieceCCA2KeyGenParameterSpec.SHA256});
        hashMap3.put("SHA384", new String[]{McElieceCCA2KeyGenParameterSpec.SHA384});
        hashMap3.put("SHA512", new String[]{McElieceCCA2KeyGenParameterSpec.SHA512});
    }

    CMSSignedHelper() {
    }

    private static void addEntries(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, String str2) {
        digestAlgs.put(aSN1ObjectIdentifier.getId(), str);
        encryptionAlgs.put(aSN1ObjectIdentifier.getId(), str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AlgorithmIdentifier fixAlgID(AlgorithmIdentifier algorithmIdentifier) {
        return algorithmIdentifier.getParameters() == null ? new AlgorithmIdentifier(algorithmIdentifier.getAlgorithm(), DERNull.INSTANCE) : algorithmIdentifier;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Store getAttributeCertificates(ASN1Set aSN1Set) {
        if (aSN1Set != null) {
            ArrayList arrayList = new ArrayList(aSN1Set.size());
            Enumeration objects = aSN1Set.getObjects();
            while (objects.hasMoreElements()) {
                ASN1Primitive aSN1Primitive = ((ASN1Encodable) objects.nextElement()).toASN1Primitive();
                if (aSN1Primitive instanceof ASN1TaggedObject) {
                    arrayList.add(new X509AttributeCertificateHolder(AttributeCertificate.getInstance(((ASN1TaggedObject) aSN1Primitive).getObject())));
                }
            }
            return new CollectionStore(arrayList);
        }
        return new CollectionStore(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Store getCRLs(ASN1Set aSN1Set) {
        if (aSN1Set != null) {
            ArrayList arrayList = new ArrayList(aSN1Set.size());
            Enumeration objects = aSN1Set.getObjects();
            while (objects.hasMoreElements()) {
                ASN1Primitive aSN1Primitive = ((ASN1Encodable) objects.nextElement()).toASN1Primitive();
                if (aSN1Primitive instanceof ASN1Sequence) {
                    arrayList.add(new X509CRLHolder(CertificateList.getInstance(aSN1Primitive)));
                }
            }
            return new CollectionStore(arrayList);
        }
        return new CollectionStore(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Store getCertificates(ASN1Set aSN1Set) {
        if (aSN1Set != null) {
            ArrayList arrayList = new ArrayList(aSN1Set.size());
            Enumeration objects = aSN1Set.getObjects();
            while (objects.hasMoreElements()) {
                ASN1Primitive aSN1Primitive = ((ASN1Encodable) objects.nextElement()).toASN1Primitive();
                if (aSN1Primitive instanceof ASN1Sequence) {
                    arrayList.add(new X509CertificateHolder(Certificate.getInstance(aSN1Primitive)));
                }
            }
            return new CollectionStore(arrayList);
        }
        return new CollectionStore(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getEncryptionAlgName(String str) {
        String str2 = (String) encryptionAlgs.get(str);
        return str2 != null ? str2 : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Store getOtherRevocationInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Set aSN1Set) {
        if (aSN1Set != null) {
            ArrayList arrayList = new ArrayList(aSN1Set.size());
            Enumeration objects = aSN1Set.getObjects();
            while (objects.hasMoreElements()) {
                ASN1Primitive aSN1Primitive = ((ASN1Encodable) objects.nextElement()).toASN1Primitive();
                if (aSN1Primitive instanceof ASN1TaggedObject) {
                    ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Primitive);
                    if (aSN1TaggedObject.getTagNo() == 1) {
                        OtherRevocationInfoFormat otherRevocationInfoFormat = OtherRevocationInfoFormat.getInstance(aSN1TaggedObject, false);
                        if (aSN1ObjectIdentifier.equals(otherRevocationInfoFormat.getInfoFormat())) {
                            arrayList.add(otherRevocationInfoFormat.getInfo());
                        }
                    }
                }
            }
            return new CollectionStore(arrayList);
        }
        return new CollectionStore(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSigningDigestAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        digestAlgs.put(aSN1ObjectIdentifier.getId(), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSigningEncryptionAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        encryptionAlgs.put(aSN1ObjectIdentifier.getId(), str);
    }
}