package org.spongycastle.jcajce.provider.keystore.bcfks;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.bc.EncryptedObjectStoreData;
import org.spongycastle.asn1.bc.EncryptedPrivateKeyData;
import org.spongycastle.asn1.bc.EncryptedSecretKeyData;
import org.spongycastle.asn1.bc.ObjectData;
import org.spongycastle.asn1.bc.ObjectDataSequence;
import org.spongycastle.asn1.bc.ObjectStore;
import org.spongycastle.asn1.bc.ObjectStoreData;
import org.spongycastle.asn1.bc.ObjectStoreIntegrityCheck;
import org.spongycastle.asn1.bc.PbkdMacIntegrityCheck;
import org.spongycastle.asn1.bc.SecretKeyData;
import org.spongycastle.asn1.cms.CCMParameters;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.spongycastle.asn1.pkcs.EncryptionScheme;
import org.spongycastle.asn1.pkcs.KeyDerivationFunc;
import org.spongycastle.asn1.pkcs.PBES2Parameters;
import org.spongycastle.asn1.pkcs.PBKDF2Params;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;

/* loaded from: classes4.dex */
class BcFKSKeyStoreSpi extends KeyStoreSpi {
    private static final BigInteger CERTIFICATE;
    private static final BigInteger PRIVATE_KEY;
    private static final BigInteger PROTECTED_PRIVATE_KEY;
    private static final BigInteger PROTECTED_SECRET_KEY;
    private static final BigInteger SECRET_KEY;
    private static final Map<String, ASN1ObjectIdentifier> oidMap;
    private static final Map<ASN1ObjectIdentifier, String> publicAlgMap;
    private Date creationDate;
    private AlgorithmIdentifier hmacAlgorithm;
    private KeyDerivationFunc hmacPkbdAlgorithm;
    private Date lastModifiedDate;
    private final BouncyCastleProvider provider;
    private final Map<String, ObjectData> entries = new HashMap();
    private final Map<String, PrivateKey> privateKeyCache = new HashMap();

    /* loaded from: classes4.dex */
    public static class Def extends BcFKSKeyStoreSpi {
        public Def() {
            super(null);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) {
            super.engineDeleteEntry(str);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class ExtKeyStoreException extends KeyStoreException {
        private final Throwable cause;

        ExtKeyStoreException(String str, Throwable th2) {
            super(str);
            this.cause = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    /* loaded from: classes4.dex */
    public static class Std extends BcFKSKeyStoreSpi {
        public Std() {
            super(new BouncyCastleProvider());
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) {
            super.engineDeleteEntry(str);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        oidMap = hashMap;
        HashMap hashMap2 = new HashMap();
        publicAlgMap = hashMap2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = OIWObjectIdentifiers.desEDE;
        hashMap.put("DESEDE", aSN1ObjectIdentifier);
        hashMap.put("TRIPLEDES", aSN1ObjectIdentifier);
        hashMap.put("TDEA", aSN1ObjectIdentifier);
        hashMap.put("HMACSHA1", PKCSObjectIdentifiers.id_hmacWithSHA1);
        hashMap.put("HMACSHA224", PKCSObjectIdentifiers.id_hmacWithSHA224);
        hashMap.put("HMACSHA256", PKCSObjectIdentifiers.id_hmacWithSHA256);
        hashMap.put("HMACSHA384", PKCSObjectIdentifiers.id_hmacWithSHA384);
        hashMap.put("HMACSHA512", PKCSObjectIdentifiers.id_hmacWithSHA512);
        hashMap2.put(PKCSObjectIdentifiers.rsaEncryption, "RSA");
        hashMap2.put(X9ObjectIdentifiers.id_ecPublicKey, "EC");
        hashMap2.put(OIWObjectIdentifiers.elGamalAlgorithm, "DH");
        hashMap2.put(PKCSObjectIdentifiers.dhKeyAgreement, "DH");
        hashMap2.put(X9ObjectIdentifiers.id_dsa, "DSA");
        CERTIFICATE = BigInteger.valueOf(0L);
        PRIVATE_KEY = BigInteger.valueOf(1L);
        SECRET_KEY = BigInteger.valueOf(2L);
        PROTECTED_PRIVATE_KEY = BigInteger.valueOf(3L);
        PROTECTED_SECRET_KEY = BigInteger.valueOf(4L);
    }

    BcFKSKeyStoreSpi(BouncyCastleProvider bouncyCastleProvider) {
        this.provider = bouncyCastleProvider;
    }

    private byte[] calculateMac(byte[] bArr, AlgorithmIdentifier algorithmIdentifier, KeyDerivationFunc keyDerivationFunc, char[] cArr) {
        Mac mac;
        String id2 = algorithmIdentifier.getAlgorithm().getId();
        BouncyCastleProvider bouncyCastleProvider = this.provider;
        if (bouncyCastleProvider != null) {
            mac = Mac.getInstance(id2, bouncyCastleProvider);
        } else {
            mac = Mac.getInstance(id2);
        }
        try {
            if (cArr == null) {
                cArr = new char[0];
            }
            mac.init(new SecretKeySpec(generateKey(keyDerivationFunc, "INTEGRITY_CHECK", cArr), id2));
            return mac.doFinal(bArr);
        } catch (InvalidKeyException e11) {
            throw new IOException("Cannot set up MAC calculation: " + e11.getMessage());
        }
    }

    private EncryptedPrivateKeyData createPrivateKeySequence(EncryptedPrivateKeyInfo encryptedPrivateKeyInfo, Certificate[] certificateArr) {
        org.spongycastle.asn1.x509.Certificate[] certificateArr2 = new org.spongycastle.asn1.x509.Certificate[certificateArr.length];
        for (int i11 = 0; i11 != certificateArr.length; i11++) {
            certificateArr2[i11] = org.spongycastle.asn1.x509.Certificate.getInstance(certificateArr[i11].getEncoded());
        }
        return new EncryptedPrivateKeyData(encryptedPrivateKeyInfo, certificateArr2);
    }

    private Certificate decodeCertificate(Object obj) {
        BouncyCastleProvider bouncyCastleProvider = this.provider;
        if (bouncyCastleProvider != null) {
            try {
                return CertificateFactory.getInstance("X.509", bouncyCastleProvider).generateCertificate(new ByteArrayInputStream(org.spongycastle.asn1.x509.Certificate.getInstance(obj).getEncoded()));
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(org.spongycastle.asn1.x509.Certificate.getInstance(obj).getEncoded()));
        } catch (Exception unused2) {
            return null;
        }
    }

    private byte[] decryptData(String str, AlgorithmIdentifier algorithmIdentifier, char[] cArr, byte[] bArr) {
        Cipher cipher;
        AlgorithmParameters algorithmParameters;
        if (algorithmIdentifier.getAlgorithm().equals(PKCSObjectIdentifiers.id_PBES2)) {
            PBES2Parameters pBES2Parameters = PBES2Parameters.getInstance(algorithmIdentifier.getParameters());
            EncryptionScheme encryptionScheme = pBES2Parameters.getEncryptionScheme();
            if (encryptionScheme.getAlgorithm().equals(NISTObjectIdentifiers.id_aes256_CCM)) {
                try {
                    CCMParameters cCMParameters = CCMParameters.getInstance(encryptionScheme.getParameters());
                    BouncyCastleProvider bouncyCastleProvider = this.provider;
                    if (bouncyCastleProvider == null) {
                        cipher = Cipher.getInstance("AES/CCM/NoPadding");
                        algorithmParameters = AlgorithmParameters.getInstance("CCM");
                    } else {
                        cipher = Cipher.getInstance("AES/CCM/NoPadding", bouncyCastleProvider);
                        algorithmParameters = AlgorithmParameters.getInstance("CCM", this.provider);
                    }
                    algorithmParameters.init(cCMParameters.getEncoded());
                    KeyDerivationFunc keyDerivationFunc = pBES2Parameters.getKeyDerivationFunc();
                    if (cArr == null) {
                        cArr = new char[0];
                    }
                    cipher.init(2, new SecretKeySpec(generateKey(keyDerivationFunc, str, cArr), "AES"), algorithmParameters);
                    return cipher.doFinal(bArr);
                } catch (Exception e11) {
                    throw new IOException(e11.toString());
                }
            }
            throw new IOException("BCFKS KeyStore cannot recognize protection encryption algorithm.");
        }
        throw new IOException("BCFKS KeyStore cannot recognize protection algorithm.");
    }

    private Date extractCreationDate(ObjectData objectData, Date date) {
        try {
            return objectData.getCreationDate().getDate();
        } catch (ParseException unused) {
            return date;
        }
    }

    private byte[] generateKey(KeyDerivationFunc keyDerivationFunc, String str, char[] cArr) {
        byte[] PKCS12PasswordToBytes = PBEParametersGenerator.PKCS12PasswordToBytes(cArr);
        byte[] PKCS12PasswordToBytes2 = PBEParametersGenerator.PKCS12PasswordToBytes(str.toCharArray());
        PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA512Digest());
        if (keyDerivationFunc.getAlgorithm().equals(PKCSObjectIdentifiers.id_PBKDF2)) {
            PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(keyDerivationFunc.getParameters());
            if (pBKDF2Params.getPrf().getAlgorithm().equals(PKCSObjectIdentifiers.id_hmacWithSHA512)) {
                pKCS5S2ParametersGenerator.init(Arrays.concatenate(PKCS12PasswordToBytes, PKCS12PasswordToBytes2), pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue());
                return ((KeyParameter) pKCS5S2ParametersGenerator.generateDerivedParameters(pBKDF2Params.getKeyLength().intValue() * 8)).getKey();
            }
            throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD PRF.");
        }
        throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD.");
    }

    private KeyDerivationFunc generatePkbdAlgorithmIdentifier(int i11) {
        byte[] bArr = new byte[64];
        getDefaultSecureRandom().nextBytes(bArr);
        return new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, new PBKDF2Params(bArr, 1024, i11, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE)));
    }

    private SecureRandom getDefaultSecureRandom() {
        return new SecureRandom();
    }

    private static String getPublicKeyAlg(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = publicAlgMap.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    private void verifyMac(byte[] bArr, PbkdMacIntegrityCheck pbkdMacIntegrityCheck, char[] cArr) {
        if (!Arrays.constantTimeAreEqual(calculateMac(bArr, pbkdMacIntegrityCheck.getMacAlgorithm(), pbkdMacIntegrityCheck.getPbkdAlgorithm(), cArr), pbkdMacIntegrityCheck.getMac())) {
            throw new IOException("BCFKS KeyStore corrupted: MAC calculation failed.");
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration<String> engineAliases() {
        final Iterator it2 = new HashSet(this.entries.keySet()).iterator();
        return new Enumeration() { // from class: org.spongycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.1
            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return it2.hasNext();
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                return it2.next();
            }
        };
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        Objects.requireNonNull(str, "alias value is null");
        return this.entries.containsKey(str);
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        if (this.entries.get(str) == null) {
            return;
        }
        this.privateKeyCache.remove(str);
        this.entries.remove(str);
        this.lastModifiedDate = new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        ObjectData objectData = this.entries.get(str);
        if (objectData != null) {
            if (!objectData.getType().equals(PRIVATE_KEY) && !objectData.getType().equals(PROTECTED_PRIVATE_KEY)) {
                if (objectData.getType().equals(CERTIFICATE)) {
                    return decodeCertificate(objectData.getData());
                }
                return null;
            }
            return decodeCertificate(EncryptedPrivateKeyData.getInstance(objectData.getData()).getCertificateChain()[0]);
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        if (certificate == null) {
            return null;
        }
        try {
            byte[] encoded = certificate.getEncoded();
            for (String str : this.entries.keySet()) {
                ObjectData objectData = this.entries.get(str);
                if (objectData.getType().equals(CERTIFICATE)) {
                    if (Arrays.areEqual(objectData.getData(), encoded)) {
                        return str;
                    }
                } else if (objectData.getType().equals(PRIVATE_KEY) || objectData.getType().equals(PROTECTED_PRIVATE_KEY)) {
                    try {
                        if (Arrays.areEqual(EncryptedPrivateKeyData.getInstance(objectData.getData()).getCertificateChain()[0].toASN1Primitive().getEncoded(), encoded)) {
                            return str;
                        }
                    } catch (IOException unused) {
                        continue;
                    }
                }
            }
        } catch (CertificateEncodingException unused2) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        ObjectData objectData = this.entries.get(str);
        if (objectData != null) {
            if (objectData.getType().equals(PRIVATE_KEY) || objectData.getType().equals(PROTECTED_PRIVATE_KEY)) {
                org.spongycastle.asn1.x509.Certificate[] certificateChain = EncryptedPrivateKeyData.getInstance(objectData.getData()).getCertificateChain();
                int length = certificateChain.length;
                X509Certificate[] x509CertificateArr = new X509Certificate[length];
                for (int i11 = 0; i11 != length; i11++) {
                    x509CertificateArr[i11] = decodeCertificate(certificateChain[i11]);
                }
                return x509CertificateArr;
            }
            return null;
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        ObjectData objectData = this.entries.get(str);
        if (objectData != null) {
            try {
                return objectData.getLastModifiedDate().getDate();
            } catch (ParseException unused) {
                return new Date();
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) {
        KeyFactory keyFactory;
        SecretKeyFactory secretKeyFactory;
        ObjectData objectData = this.entries.get(str);
        if (objectData != null) {
            if (!objectData.getType().equals(PRIVATE_KEY) && !objectData.getType().equals(PROTECTED_PRIVATE_KEY)) {
                if (!objectData.getType().equals(SECRET_KEY) && !objectData.getType().equals(PROTECTED_SECRET_KEY)) {
                    throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + str + "): type not recognized");
                }
                EncryptedSecretKeyData encryptedSecretKeyData = EncryptedSecretKeyData.getInstance(objectData.getData());
                try {
                    SecretKeyData secretKeyData = SecretKeyData.getInstance(decryptData("SECRET_KEY_ENCRYPTION", encryptedSecretKeyData.getKeyEncryptionAlgorithm(), cArr, encryptedSecretKeyData.getEncryptedKeyData()));
                    if (this.provider != null) {
                        secretKeyFactory = SecretKeyFactory.getInstance(secretKeyData.getKeyAlgorithm().getId(), this.provider);
                    } else {
                        secretKeyFactory = SecretKeyFactory.getInstance(secretKeyData.getKeyAlgorithm().getId());
                    }
                    return secretKeyFactory.generateSecret(new SecretKeySpec(secretKeyData.getKeyBytes(), secretKeyData.getKeyAlgorithm().getId()));
                } catch (Exception e11) {
                    throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + str + "): " + e11.getMessage());
                }
            }
            PrivateKey privateKey = this.privateKeyCache.get(str);
            if (privateKey != null) {
                return privateKey;
            }
            EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = EncryptedPrivateKeyInfo.getInstance(EncryptedPrivateKeyData.getInstance(objectData.getData()).getEncryptedPrivateKeyInfo());
            try {
                PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(decryptData("PRIVATE_KEY_ENCRYPTION", encryptedPrivateKeyInfo.getEncryptionAlgorithm(), cArr, encryptedPrivateKeyInfo.getEncryptedData()));
                if (this.provider != null) {
                    keyFactory = KeyFactory.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm().getId(), this.provider);
                } else {
                    keyFactory = KeyFactory.getInstance(getPublicKeyAlg(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()));
                }
                PrivateKey generatePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(privateKeyInfo.getEncoded()));
                this.privateKeyCache.put(str, generatePrivate);
                return generatePrivate;
            } catch (Exception e12) {
                throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover private key (" + str + "): " + e12.getMessage());
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        ObjectData objectData = this.entries.get(str);
        if (objectData != null) {
            return objectData.getType().equals(CERTIFICATE);
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        ObjectData objectData = this.entries.get(str);
        if (objectData != null) {
            BigInteger type = objectData.getType();
            return type.equals(PRIVATE_KEY) || type.equals(SECRET_KEY) || type.equals(PROTECTED_PRIVATE_KEY) || type.equals(PROTECTED_SECRET_KEY);
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) {
        ObjectStoreData objectStoreData;
        this.entries.clear();
        this.privateKeyCache.clear();
        this.creationDate = null;
        this.lastModifiedDate = null;
        this.hmacAlgorithm = null;
        if (inputStream == null) {
            Date date = new Date();
            this.creationDate = date;
            this.lastModifiedDate = date;
            this.hmacAlgorithm = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(64);
            return;
        }
        ObjectStore objectStore = ObjectStore.getInstance(new ASN1InputStream(inputStream).readObject());
        ObjectStoreIntegrityCheck integrityCheck = objectStore.getIntegrityCheck();
        if (integrityCheck.getType() == 0) {
            PbkdMacIntegrityCheck pbkdMacIntegrityCheck = PbkdMacIntegrityCheck.getInstance(integrityCheck.getIntegrityCheck());
            this.hmacAlgorithm = pbkdMacIntegrityCheck.getMacAlgorithm();
            this.hmacPkbdAlgorithm = pbkdMacIntegrityCheck.getPbkdAlgorithm();
            verifyMac(objectStore.getStoreData().toASN1Primitive().getEncoded(), pbkdMacIntegrityCheck, cArr);
            ASN1Encodable storeData = objectStore.getStoreData();
            if (storeData instanceof EncryptedObjectStoreData) {
                EncryptedObjectStoreData encryptedObjectStoreData = (EncryptedObjectStoreData) storeData;
                objectStoreData = ObjectStoreData.getInstance(decryptData("STORE_ENCRYPTION", encryptedObjectStoreData.getEncryptionAlgorithm(), cArr, encryptedObjectStoreData.getEncryptedContent().getOctets()));
            } else {
                objectStoreData = ObjectStoreData.getInstance(storeData);
            }
            try {
                this.creationDate = objectStoreData.getCreationDate().getDate();
                this.lastModifiedDate = objectStoreData.getLastModifiedDate().getDate();
                if (objectStoreData.getIntegrityAlgorithm().equals(this.hmacAlgorithm)) {
                    Iterator<ASN1Encodable> it2 = objectStoreData.getObjectDataSequence().iterator();
                    while (it2.hasNext()) {
                        ObjectData objectData = ObjectData.getInstance(it2.next());
                        this.entries.put(objectData.getIdentifier(), objectData);
                    }
                    return;
                }
                throw new IOException("BCFKS KeyStore storeData integrity algorithm does not match store integrity algorithm.");
            } catch (ParseException unused) {
                throw new IOException("BCFKS KeyStore unable to parse store data information.");
            }
        }
        throw new IOException("BCFKS KeyStore unable to recognize integrity check.");
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) {
        Date date;
        ObjectData objectData = this.entries.get(str);
        Date date2 = new Date();
        if (objectData == null) {
            date = date2;
        } else if (objectData.getType().equals(CERTIFICATE)) {
            date = extractCreationDate(objectData, date2);
        } else {
            throw new KeyStoreException("BCFKS KeyStore already has a key entry with alias " + str);
        }
        try {
            this.entries.put(str, new ObjectData(CERTIFICATE, str, date, date2, certificate.getEncoded(), null));
            this.lastModifiedDate = date2;
        } catch (CertificateEncodingException e11) {
            throw new ExtKeyStoreException("BCFKS KeyStore unable to handle certificate: " + e11.getMessage(), e11);
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
        Cipher cipher;
        byte[] doFinal;
        Cipher cipher2;
        Date date = new Date();
        ObjectData objectData = this.entries.get(str);
        Date extractCreationDate = objectData != null ? extractCreationDate(objectData, date) : date;
        this.privateKeyCache.remove(str);
        if (key instanceof PrivateKey) {
            if (certificateArr != null) {
                try {
                    byte[] encoded = key.getEncoded();
                    KeyDerivationFunc generatePkbdAlgorithmIdentifier = generatePkbdAlgorithmIdentifier(32);
                    if (cArr == null) {
                        cArr = new char[0];
                    }
                    byte[] generateKey = generateKey(generatePkbdAlgorithmIdentifier, "PRIVATE_KEY_ENCRYPTION", cArr);
                    BouncyCastleProvider bouncyCastleProvider = this.provider;
                    if (bouncyCastleProvider == null) {
                        cipher2 = Cipher.getInstance("AES/CCM/NoPadding");
                    } else {
                        cipher2 = Cipher.getInstance("AES/CCM/NoPadding", bouncyCastleProvider);
                    }
                    cipher2.init(1, new SecretKeySpec(generateKey, "AES"));
                    this.entries.put(str, new ObjectData(PRIVATE_KEY, str, extractCreationDate, date, createPrivateKeySequence(new EncryptedPrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(generatePkbdAlgorithmIdentifier, new EncryptionScheme(NISTObjectIdentifiers.id_aes256_CCM, CCMParameters.getInstance(cipher2.getParameters().getEncoded())))), cipher2.doFinal(encoded)), certificateArr).getEncoded(), null));
                } catch (Exception e11) {
                    throw new ExtKeyStoreException("BCFKS KeyStore exception storing private key: " + e11.toString(), e11);
                }
            } else {
                throw new KeyStoreException("BCFKS KeyStore requires a certificate chain for private key storage.");
            }
        } else if (!(key instanceof SecretKey)) {
            throw new KeyStoreException("BCFKS KeyStore unable to recognize key.");
        } else {
            if (certificateArr == null) {
                try {
                    byte[] encoded2 = key.getEncoded();
                    KeyDerivationFunc generatePkbdAlgorithmIdentifier2 = generatePkbdAlgorithmIdentifier(32);
                    if (cArr == null) {
                        cArr = new char[0];
                    }
                    byte[] generateKey2 = generateKey(generatePkbdAlgorithmIdentifier2, "SECRET_KEY_ENCRYPTION", cArr);
                    BouncyCastleProvider bouncyCastleProvider2 = this.provider;
                    if (bouncyCastleProvider2 == null) {
                        cipher = Cipher.getInstance("AES/CCM/NoPadding");
                    } else {
                        cipher = Cipher.getInstance("AES/CCM/NoPadding", bouncyCastleProvider2);
                    }
                    cipher.init(1, new SecretKeySpec(generateKey2, "AES"));
                    String upperCase = Strings.toUpperCase(key.getAlgorithm());
                    if (upperCase.indexOf("AES") > -1) {
                        doFinal = cipher.doFinal(new SecretKeyData(NISTObjectIdentifiers.aes, encoded2).getEncoded());
                    } else {
                        ASN1ObjectIdentifier aSN1ObjectIdentifier = oidMap.get(upperCase);
                        if (aSN1ObjectIdentifier != null) {
                            doFinal = cipher.doFinal(new SecretKeyData(aSN1ObjectIdentifier, encoded2).getEncoded());
                        } else {
                            throw new KeyStoreException("BCFKS KeyStore cannot recognize secret key (" + upperCase + ") for storage.");
                        }
                    }
                    this.entries.put(str, new ObjectData(SECRET_KEY, str, extractCreationDate, date, new EncryptedSecretKeyData(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(generatePkbdAlgorithmIdentifier2, new EncryptionScheme(NISTObjectIdentifiers.id_aes256_CCM, CCMParameters.getInstance(cipher.getParameters().getEncoded())))), doFinal).getEncoded(), null));
                } catch (Exception e12) {
                    throw new ExtKeyStoreException("BCFKS KeyStore exception storing private key: " + e12.toString(), e12);
                }
            } else {
                throw new KeyStoreException("BCFKS KeyStore cannot store certificate chain with secret key.");
            }
        }
        this.lastModifiedDate = date;
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.entries.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) {
        Cipher cipher;
        ObjectData[] objectDataArr = (ObjectData[]) this.entries.values().toArray(new ObjectData[this.entries.size()]);
        KeyDerivationFunc generatePkbdAlgorithmIdentifier = generatePkbdAlgorithmIdentifier(32);
        byte[] generateKey = generateKey(generatePkbdAlgorithmIdentifier, "STORE_ENCRYPTION", cArr != null ? cArr : new char[0]);
        ObjectStoreData objectStoreData = new ObjectStoreData(this.hmacAlgorithm, this.creationDate, this.lastModifiedDate, new ObjectDataSequence(objectDataArr), null);
        try {
            BouncyCastleProvider bouncyCastleProvider = this.provider;
            if (bouncyCastleProvider == null) {
                cipher = Cipher.getInstance("AES/CCM/NoPadding");
            } else {
                cipher = Cipher.getInstance("AES/CCM/NoPadding", bouncyCastleProvider);
            }
            cipher.init(1, new SecretKeySpec(generateKey, "AES"));
            EncryptedObjectStoreData encryptedObjectStoreData = new EncryptedObjectStoreData(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(generatePkbdAlgorithmIdentifier, new EncryptionScheme(NISTObjectIdentifiers.id_aes256_CCM, CCMParameters.getInstance(cipher.getParameters().getEncoded())))), cipher.doFinal(objectStoreData.getEncoded()));
            PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(this.hmacPkbdAlgorithm.getParameters());
            byte[] bArr = new byte[pBKDF2Params.getSalt().length];
            getDefaultSecureRandom().nextBytes(bArr);
            this.hmacPkbdAlgorithm = new KeyDerivationFunc(this.hmacPkbdAlgorithm.getAlgorithm(), new PBKDF2Params(bArr, pBKDF2Params.getIterationCount().intValue(), pBKDF2Params.getKeyLength().intValue(), pBKDF2Params.getPrf()));
            outputStream.write(new ObjectStore(encryptedObjectStoreData, new ObjectStoreIntegrityCheck(new PbkdMacIntegrityCheck(this.hmacAlgorithm, this.hmacPkbdAlgorithm, calculateMac(encryptedObjectStoreData.getEncoded(), this.hmacAlgorithm, this.hmacPkbdAlgorithm, cArr)))).getEncoded());
            outputStream.flush();
        } catch (InvalidKeyException e11) {
            throw new IOException(e11.toString());
        } catch (BadPaddingException e12) {
            throw new IOException(e12.toString());
        } catch (IllegalBlockSizeException e13) {
            throw new IOException(e13.toString());
        } catch (NoSuchPaddingException e14) {
            throw new NoSuchAlgorithmException(e14.toString());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        Date date = new Date();
        ObjectData objectData = this.entries.get(str);
        Date extractCreationDate = objectData != null ? extractCreationDate(objectData, date) : date;
        if (certificateArr != null) {
            try {
                EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = EncryptedPrivateKeyInfo.getInstance(bArr);
                try {
                    this.privateKeyCache.remove(str);
                    this.entries.put(str, new ObjectData(PROTECTED_PRIVATE_KEY, str, extractCreationDate, date, createPrivateKeySequence(encryptedPrivateKeyInfo, certificateArr).getEncoded(), null));
                } catch (Exception e11) {
                    throw new ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + e11.toString(), e11);
                }
            } catch (Exception e12) {
                throw new ExtKeyStoreException("BCFKS KeyStore private key encoding must be an EncryptedPrivateKeyInfo.", e12);
            }
        } else {
            try {
                this.entries.put(str, new ObjectData(PROTECTED_SECRET_KEY, str, extractCreationDate, date, bArr, null));
            } catch (Exception e13) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + e13.toString(), e13);
            }
        }
        this.lastModifiedDate = date;
    }
}