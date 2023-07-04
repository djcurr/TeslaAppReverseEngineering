package org.spongycastle.operator.jcajce;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.bsi.BSIObjectIdentifiers;
import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.asn1.eac.EACObjectIdentifiers;
import org.spongycastle.asn1.kisa.KISAObjectIdentifiers;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.ntt.NTTObjectIdentifiers;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.RSASSAPSSparams;
import org.spongycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.jcajce.util.AlgorithmParametersUtils;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jcajce.util.MessageDigestUtils;
import org.spongycastle.operator.OperatorCreationException;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.spongycastle.util.Integers;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class OperatorHelper {
    private static final Map asymmetricWrapperAlgNames;
    private static final Map oids;
    private static final Map symmetricKeyAlgNames;
    private static final Map symmetricWrapperAlgNames;
    private static final Map symmetricWrapperKeySizes;
    private JcaJceHelper helper;

    /* loaded from: classes4.dex */
    private static class OpCertificateException extends CertificateException {
        private Throwable cause;

        public OpCertificateException(String str, Throwable th2) {
            super(str);
            this.cause = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        oids = hashMap;
        HashMap hashMap2 = new HashMap();
        asymmetricWrapperAlgNames = hashMap2;
        HashMap hashMap3 = new HashMap();
        symmetricWrapperAlgNames = hashMap3;
        HashMap hashMap4 = new HashMap();
        symmetricKeyAlgNames = hashMap4;
        HashMap hashMap5 = new HashMap();
        symmetricWrapperKeySizes = hashMap5;
        hashMap.put(new ASN1ObjectIdentifier("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        hashMap.put(PKCSObjectIdentifiers.sha224WithRSAEncryption, "SHA224WITHRSA");
        hashMap.put(PKCSObjectIdentifiers.sha256WithRSAEncryption, "SHA256WITHRSA");
        hashMap.put(PKCSObjectIdentifiers.sha384WithRSAEncryption, "SHA384WITHRSA");
        hashMap.put(PKCSObjectIdentifiers.sha512WithRSAEncryption, "SHA512WITHRSA");
        hashMap.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, "GOST3411WITHGOST3410");
        hashMap.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, "GOST3411WITHECGOST3410");
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA1, "SHA1WITHPLAIN-ECDSA");
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA224, "SHA224WITHPLAIN-ECDSA");
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA256, "SHA256WITHPLAIN-ECDSA");
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA384, "SHA384WITHPLAIN-ECDSA");
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_SHA512, "SHA512WITHPLAIN-ECDSA");
        hashMap.put(BSIObjectIdentifiers.ecdsa_plain_RIPEMD160, "RIPEMD160WITHPLAIN-ECDSA");
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_1, "SHA1WITHCVC-ECDSA");
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_224, "SHA224WITHCVC-ECDSA");
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_256, "SHA256WITHCVC-ECDSA");
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_384, "SHA384WITHCVC-ECDSA");
        hashMap.put(EACObjectIdentifiers.id_TA_ECDSA_SHA_512, "SHA512WITHCVC-ECDSA");
        hashMap.put(new ASN1ObjectIdentifier("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        hashMap.put(new ASN1ObjectIdentifier("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        hashMap.put(new ASN1ObjectIdentifier("1.2.840.10040.4.3"), "SHA1WITHDSA");
        hashMap.put(X9ObjectIdentifiers.ecdsa_with_SHA1, "SHA1WITHECDSA");
        hashMap.put(X9ObjectIdentifiers.ecdsa_with_SHA224, "SHA224WITHECDSA");
        hashMap.put(X9ObjectIdentifiers.ecdsa_with_SHA256, "SHA256WITHECDSA");
        hashMap.put(X9ObjectIdentifiers.ecdsa_with_SHA384, "SHA384WITHECDSA");
        hashMap.put(X9ObjectIdentifiers.ecdsa_with_SHA512, "SHA512WITHECDSA");
        hashMap.put(OIWObjectIdentifiers.sha1WithRSA, "SHA1WITHRSA");
        hashMap.put(OIWObjectIdentifiers.dsaWithSHA1, "SHA1WITHDSA");
        hashMap.put(NISTObjectIdentifiers.dsa_with_sha224, "SHA224WITHDSA");
        hashMap.put(NISTObjectIdentifiers.dsa_with_sha256, "SHA256WITHDSA");
        hashMap.put(OIWObjectIdentifiers.idSHA1, McElieceCCA2KeyGenParameterSpec.SHA1);
        hashMap.put(NISTObjectIdentifiers.id_sha224, McElieceCCA2KeyGenParameterSpec.SHA224);
        hashMap.put(NISTObjectIdentifiers.id_sha256, McElieceCCA2KeyGenParameterSpec.SHA256);
        hashMap.put(NISTObjectIdentifiers.id_sha384, McElieceCCA2KeyGenParameterSpec.SHA384);
        hashMap.put(NISTObjectIdentifiers.id_sha512, McElieceCCA2KeyGenParameterSpec.SHA512);
        hashMap.put(TeleTrusTObjectIdentifiers.ripemd128, "RIPEMD128");
        hashMap.put(TeleTrusTObjectIdentifiers.ripemd160, "RIPEMD160");
        hashMap.put(TeleTrusTObjectIdentifiers.ripemd256, "RIPEMD256");
        hashMap2.put(PKCSObjectIdentifiers.rsaEncryption, "RSA/ECB/PKCS1Padding");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_alg_CMS3DESwrap;
        hashMap3.put(aSN1ObjectIdentifier, "DESEDEWrap");
        hashMap3.put(PKCSObjectIdentifiers.id_alg_CMSRC2wrap, "RC2Wrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes128_wrap;
        hashMap3.put(aSN1ObjectIdentifier2, "AESWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_aes192_wrap;
        hashMap3.put(aSN1ObjectIdentifier3, "AESWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_aes256_wrap;
        hashMap3.put(aSN1ObjectIdentifier4, "AESWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NTTObjectIdentifiers.id_camellia128_wrap;
        hashMap3.put(aSN1ObjectIdentifier5, "CamelliaWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NTTObjectIdentifiers.id_camellia192_wrap;
        hashMap3.put(aSN1ObjectIdentifier6, "CamelliaWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NTTObjectIdentifiers.id_camellia256_wrap;
        hashMap3.put(aSN1ObjectIdentifier7, "CamelliaWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap;
        hashMap3.put(aSN1ObjectIdentifier8, "SEEDWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = PKCSObjectIdentifiers.des_EDE3_CBC;
        hashMap3.put(aSN1ObjectIdentifier9, "DESede");
        hashMap5.put(aSN1ObjectIdentifier, Integers.valueOf(192));
        hashMap5.put(aSN1ObjectIdentifier2, Integers.valueOf(128));
        hashMap5.put(aSN1ObjectIdentifier3, Integers.valueOf(192));
        hashMap5.put(aSN1ObjectIdentifier4, Integers.valueOf(256));
        hashMap5.put(aSN1ObjectIdentifier5, Integers.valueOf(128));
        hashMap5.put(aSN1ObjectIdentifier6, Integers.valueOf(192));
        hashMap5.put(aSN1ObjectIdentifier7, Integers.valueOf(256));
        hashMap5.put(aSN1ObjectIdentifier8, Integers.valueOf(128));
        hashMap5.put(aSN1ObjectIdentifier9, Integers.valueOf(192));
        hashMap4.put(NISTObjectIdentifiers.aes, "AES");
        hashMap4.put(NISTObjectIdentifiers.id_aes128_CBC, "AES");
        hashMap4.put(NISTObjectIdentifiers.id_aes192_CBC, "AES");
        hashMap4.put(NISTObjectIdentifiers.id_aes256_CBC, "AES");
        hashMap4.put(aSN1ObjectIdentifier9, "DESede");
        hashMap4.put(PKCSObjectIdentifiers.RC2_CBC, "RC2");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OperatorHelper(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
    }

    private static String getDigestName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String digestName = MessageDigestUtils.getDigestName(aSN1ObjectIdentifier);
        int indexOf = digestName.indexOf(45);
        if (indexOf > 0 && !digestName.startsWith("SHA3")) {
            return digestName.substring(0, indexOf) + digestName.substring(indexOf + 1);
        }
        return MessageDigestUtils.getDigestName(aSN1ObjectIdentifier);
    }

    private static String getSignatureName(AlgorithmIdentifier algorithmIdentifier) {
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (parameters != null && !DERNull.INSTANCE.equals(parameters) && algorithmIdentifier.getAlgorithm().equals(PKCSObjectIdentifiers.id_RSASSA_PSS)) {
            RSASSAPSSparams rSASSAPSSparams = RSASSAPSSparams.getInstance(parameters);
            return getDigestName(rSASSAPSSparams.getHashAlgorithm().getAlgorithm()) + "WITHRSAANDMGF1";
        }
        Map map = oids;
        if (map.containsKey(algorithmIdentifier.getAlgorithm())) {
            return (String) map.get(algorithmIdentifier.getAlgorithm());
        }
        return algorithmIdentifier.getAlgorithm().getId();
    }

    public X509Certificate convertCertificate(X509CertificateHolder x509CertificateHolder) {
        try {
            return (X509Certificate) this.helper.createCertificateFactory("X.509").generateCertificate(new ByteArrayInputStream(x509CertificateHolder.getEncoded()));
        } catch (IOException e11) {
            throw new OpCertificateException("cannot get encoded form of certificate: " + e11.getMessage(), e11);
        } catch (NoSuchProviderException e12) {
            throw new OpCertificateException("cannot find factory provider: " + e12.getMessage(), e12);
        }
    }

    public PublicKey convertPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            return this.helper.createKeyFactory(subjectPublicKeyInfo.getAlgorithm().getAlgorithm().getId()).generatePublic(new X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
        } catch (IOException e11) {
            throw new OperatorCreationException("cannot get encoded form of key: " + e11.getMessage(), e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new OperatorCreationException("cannot create key factory: " + e12.getMessage(), e12);
        } catch (NoSuchProviderException e13) {
            throw new OperatorCreationException("cannot find factory provider: " + e13.getMessage(), e13);
        } catch (InvalidKeySpecException e14) {
            throw new OperatorCreationException("cannot create key factory: " + e14.getMessage(), e14);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AlgorithmParameters createAlgorithmParameters(AlgorithmIdentifier algorithmIdentifier) {
        if (algorithmIdentifier.getAlgorithm().equals(PKCSObjectIdentifiers.rsaEncryption)) {
            return null;
        }
        try {
            AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters(algorithmIdentifier.getAlgorithm().getId());
            try {
                createAlgorithmParameters.init(algorithmIdentifier.getParameters().toASN1Primitive().getEncoded());
                return createAlgorithmParameters;
            } catch (IOException e11) {
                throw new OperatorCreationException("cannot initialise algorithm parameters: " + e11.getMessage(), e11);
            }
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (NoSuchProviderException e12) {
            throw new OperatorCreationException("cannot create algorithm parameters: " + e12.getMessage(), e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Cipher createAsymmetricWrapper(ASN1ObjectIdentifier aSN1ObjectIdentifier, Map map) {
        try {
            String str = map.isEmpty() ? null : (String) map.get(aSN1ObjectIdentifier);
            if (str == null) {
                str = (String) asymmetricWrapperAlgNames.get(aSN1ObjectIdentifier);
            }
            if (str != null) {
                try {
                    return this.helper.createCipher(str);
                } catch (NoSuchAlgorithmException unused) {
                    if (str.equals("RSA/ECB/PKCS1Padding")) {
                        try {
                            return this.helper.createCipher("RSA/NONE/PKCS1Padding");
                        } catch (NoSuchAlgorithmException unused2) {
                        }
                    }
                }
            }
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e11) {
            throw new OperatorCreationException("cannot create cipher: " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageDigest createDigest(AlgorithmIdentifier algorithmIdentifier) {
        try {
            return this.helper.createDigest(MessageDigestUtils.getDigestName(algorithmIdentifier.getAlgorithm()));
        } catch (NoSuchAlgorithmException e11) {
            Map map = oids;
            if (map.get(algorithmIdentifier.getAlgorithm()) != null) {
                return this.helper.createDigest((String) map.get(algorithmIdentifier.getAlgorithm()));
            }
            throw e11;
        }
    }

    public Signature createRawSignature(AlgorithmIdentifier algorithmIdentifier) {
        try {
            String signatureName = getSignatureName(algorithmIdentifier);
            String str = "NONE" + signatureName.substring(signatureName.indexOf("WITH"));
            Signature createSignature = this.helper.createSignature(str);
            if (algorithmIdentifier.getAlgorithm().equals(PKCSObjectIdentifiers.id_RSASSA_PSS)) {
                AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters(str);
                AlgorithmParametersUtils.loadParameters(createAlgorithmParameters, algorithmIdentifier.getParameters());
                createSignature.setParameter((PSSParameterSpec) createAlgorithmParameters.getParameterSpec(PSSParameterSpec.class));
            }
            return createSignature;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Signature createSignature(AlgorithmIdentifier algorithmIdentifier) {
        try {
            return this.helper.createSignature(getSignatureName(algorithmIdentifier));
        } catch (NoSuchAlgorithmException e11) {
            Map map = oids;
            if (map.get(algorithmIdentifier.getAlgorithm()) != null) {
                return this.helper.createSignature((String) map.get(algorithmIdentifier.getAlgorithm()));
            }
            throw e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Cipher createSymmetricWrapper(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        try {
            String str = (String) symmetricWrapperAlgNames.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createCipher(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e11) {
            throw new OperatorCreationException("cannot create cipher: " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getKeyAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) symmetricKeyAlgNames.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    int getKeySizeInBits(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return ((Integer) symmetricWrapperKeySizes.get(aSN1ObjectIdentifier)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getWrappingAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) symmetricWrapperAlgNames.get(aSN1ObjectIdentifier);
    }
}