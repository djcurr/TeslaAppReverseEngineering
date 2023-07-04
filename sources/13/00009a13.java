package org.spongycastle.cert.crmf.jcajce;

import java.io.IOException;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Null;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.iana.IANAObjectIdentifiers;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.cert.crmf.CRMFException;
import org.spongycastle.cms.CMSAlgorithm;
import org.spongycastle.jcajce.util.AlgorithmParametersUtils;
import org.spongycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class CRMFHelper {
    protected static final Map BASE_CIPHER_NAMES;
    protected static final Map CIPHER_ALG_NAMES;
    protected static final Map DIGEST_ALG_NAMES;
    protected static final Map KEY_ALG_NAMES;
    protected static final Map MAC_ALG_NAMES;
    private JcaJceHelper helper;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface JCECallback {
        Object doInJCE();
    }

    static {
        HashMap hashMap = new HashMap();
        BASE_CIPHER_NAMES = hashMap;
        HashMap hashMap2 = new HashMap();
        CIPHER_ALG_NAMES = hashMap2;
        HashMap hashMap3 = new HashMap();
        DIGEST_ALG_NAMES = hashMap3;
        HashMap hashMap4 = new HashMap();
        KEY_ALG_NAMES = hashMap4;
        HashMap hashMap5 = new HashMap();
        MAC_ALG_NAMES = hashMap5;
        hashMap.put(PKCSObjectIdentifiers.des_EDE3_CBC, "DESEDE");
        hashMap.put(NISTObjectIdentifiers.id_aes128_CBC, "AES");
        hashMap.put(NISTObjectIdentifiers.id_aes192_CBC, "AES");
        hashMap.put(NISTObjectIdentifiers.id_aes256_CBC, "AES");
        hashMap2.put(CMSAlgorithm.DES_EDE3_CBC, "DESEDE/CBC/PKCS5Padding");
        hashMap2.put(CMSAlgorithm.AES128_CBC, "AES/CBC/PKCS5Padding");
        hashMap2.put(CMSAlgorithm.AES192_CBC, "AES/CBC/PKCS5Padding");
        hashMap2.put(CMSAlgorithm.AES256_CBC, "AES/CBC/PKCS5Padding");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.rsaEncryption;
        hashMap2.put(new ASN1ObjectIdentifier(aSN1ObjectIdentifier.getId()), "RSA/ECB/PKCS1Padding");
        hashMap3.put(OIWObjectIdentifiers.idSHA1, "SHA1");
        hashMap3.put(NISTObjectIdentifiers.id_sha224, "SHA224");
        hashMap3.put(NISTObjectIdentifiers.id_sha256, "SHA256");
        hashMap3.put(NISTObjectIdentifiers.id_sha384, "SHA384");
        hashMap3.put(NISTObjectIdentifiers.id_sha512, "SHA512");
        hashMap5.put(IANAObjectIdentifiers.hmacSHA1, "HMACSHA1");
        hashMap5.put(PKCSObjectIdentifiers.id_hmacWithSHA1, "HMACSHA1");
        hashMap5.put(PKCSObjectIdentifiers.id_hmacWithSHA224, "HMACSHA224");
        hashMap5.put(PKCSObjectIdentifiers.id_hmacWithSHA256, "HMACSHA256");
        hashMap5.put(PKCSObjectIdentifiers.id_hmacWithSHA384, "HMACSHA384");
        hashMap5.put(PKCSObjectIdentifiers.id_hmacWithSHA512, "HMACSHA512");
        hashMap4.put(aSN1ObjectIdentifier, "RSA");
        hashMap4.put(X9ObjectIdentifiers.id_dsa, "DSA");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CRMFHelper(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
    }

    static Object execute(JCECallback jCECallback) {
        try {
            return jCECallback.doInJCE();
        } catch (InvalidAlgorithmParameterException e11) {
            throw new CRMFException("algorithm parameters invalid.", e11);
        } catch (InvalidKeyException e12) {
            throw new CRMFException("key invalid in message.", e12);
        } catch (NoSuchAlgorithmException e13) {
            throw new CRMFException("can't find algorithm.", e13);
        } catch (NoSuchProviderException e14) {
            throw new CRMFException("can't find provider.", e14);
        } catch (InvalidParameterSpecException e15) {
            throw new CRMFException("MAC algorithm parameter spec invalid.", e15);
        } catch (NoSuchPaddingException e16) {
            throw new CRMFException("required padding not supported.", e16);
        }
    }

    AlgorithmParameterGenerator createAlgorithmParameterGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        if (str != null) {
            try {
                return this.helper.createAlgorithmParameterGenerator(str);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return this.helper.createAlgorithmParameterGenerator(aSN1ObjectIdentifier.getId());
    }

    AlgorithmParameters createAlgorithmParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        if (str != null) {
            try {
                return this.helper.createAlgorithmParameters(str);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return this.helper.createAlgorithmParameters(aSN1ObjectIdentifier.getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Cipher createCipher(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        try {
            String str = (String) CIPHER_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createCipher(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e11) {
            throw new CRMFException("cannot create cipher: " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Cipher createContentCipher(final Key key, final AlgorithmIdentifier algorithmIdentifier) {
        return (Cipher) execute(new JCECallback() { // from class: org.spongycastle.cert.crmf.jcajce.CRMFHelper.1
            @Override // org.spongycastle.cert.crmf.jcajce.CRMFHelper.JCECallback
            public Object doInJCE() {
                Cipher createCipher = CRMFHelper.this.createCipher(algorithmIdentifier.getAlgorithm());
                ASN1Primitive aSN1Primitive = (ASN1Primitive) algorithmIdentifier.getParameters();
                ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
                if (aSN1Primitive != null && !(aSN1Primitive instanceof ASN1Null)) {
                    try {
                        AlgorithmParameters createAlgorithmParameters = CRMFHelper.this.createAlgorithmParameters(algorithmIdentifier.getAlgorithm());
                        try {
                            AlgorithmParametersUtils.loadParameters(createAlgorithmParameters, aSN1Primitive);
                            createCipher.init(2, key, createAlgorithmParameters);
                        } catch (IOException e11) {
                            throw new CRMFException("error decoding algorithm parameters.", e11);
                        }
                    } catch (NoSuchAlgorithmException e12) {
                        if (!algorithm.equals(CMSAlgorithm.DES_EDE3_CBC) && !algorithm.equals(CMSAlgorithm.IDEA_CBC) && !algorithm.equals(CMSAlgorithm.AES128_CBC) && !algorithm.equals(CMSAlgorithm.AES192_CBC) && !algorithm.equals(CMSAlgorithm.AES256_CBC)) {
                            throw e12;
                        }
                        createCipher.init(2, key, new IvParameterSpec(ASN1OctetString.getInstance(aSN1Primitive).getOctets()));
                    }
                } else if (!algorithm.equals(CMSAlgorithm.DES_EDE3_CBC) && !algorithm.equals(CMSAlgorithm.IDEA_CBC) && !algorithm.equals(CMSAlgorithm.CAST5_CBC)) {
                    createCipher.init(2, key);
                } else {
                    createCipher.init(2, key, new IvParameterSpec(new byte[8]));
                }
                return createCipher;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageDigest createDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        try {
            String str = (String) DIGEST_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createDigest(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createDigest(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e11) {
            throw new CRMFException("cannot create cipher: " + e11.getMessage(), e11);
        }
    }

    KeyFactory createKeyFactory(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        try {
            String str = (String) KEY_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createKeyFactory(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createKeyFactory(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e11) {
            throw new CRMFException("cannot create cipher: " + e11.getMessage(), e11);
        }
    }

    public KeyGenerator createKeyGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        try {
            String str = (String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createKeyGenerator(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createKeyGenerator(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e11) {
            throw new CRMFException("cannot create key generator: " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Mac createMac(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        try {
            String str = (String) MAC_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createMac(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createMac(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e11) {
            throw new CRMFException("cannot create mac: " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AlgorithmParameters generateParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, SecretKey secretKey, SecureRandom secureRandom) {
        try {
            AlgorithmParameterGenerator createAlgorithmParameterGenerator = createAlgorithmParameterGenerator(aSN1ObjectIdentifier);
            if (aSN1ObjectIdentifier.equals(CMSAlgorithm.RC2_CBC)) {
                byte[] bArr = new byte[8];
                secureRandom.nextBytes(bArr);
                try {
                    createAlgorithmParameterGenerator.init(new RC2ParameterSpec(secretKey.getEncoded().length * 8, bArr), secureRandom);
                } catch (InvalidAlgorithmParameterException e11) {
                    throw new CRMFException("parameters generation error: " + e11, e11);
                }
            }
            return createAlgorithmParameterGenerator.generateParameters();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (GeneralSecurityException e12) {
            throw new CRMFException("exception creating algorithm parameter generator: " + e12, e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AlgorithmIdentifier getAlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmParameters algorithmParameters) {
        ASN1Encodable extractParameters;
        if (algorithmParameters != null) {
            try {
                extractParameters = AlgorithmParametersUtils.extractParameters(algorithmParameters);
            } catch (IOException e11) {
                throw new CRMFException("cannot encode parameters: " + e11.getMessage(), e11);
            }
        } else {
            extractParameters = DERNull.INSTANCE;
        }
        return new AlgorithmIdentifier(aSN1ObjectIdentifier, extractParameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PublicKey toPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            return createKeyFactory(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()).generatePublic(new X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
        } catch (Exception e11) {
            throw new CRMFException("invalid key: " + e11.getMessage(), e11);
        }
    }
}