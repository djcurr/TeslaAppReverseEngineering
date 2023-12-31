package org.spongycastle.operator.jcajce;

import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.kisa.KISAObjectIdentifiers;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.ntt.NTTObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.operator.GenericKey;
import org.spongycastle.operator.OperatorException;
import org.spongycastle.operator.SymmetricKeyWrapper;

/* loaded from: classes4.dex */
public class JceSymmetricKeyWrapper extends SymmetricKeyWrapper {
    private OperatorHelper helper;
    private SecureRandom random;
    private SecretKey wrappingKey;

    public JceSymmetricKeyWrapper(SecretKey secretKey) {
        super(determineKeyEncAlg(secretKey));
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.wrappingKey = secretKey;
    }

    private static AlgorithmIdentifier determineKeyEncAlg(SecretKey secretKey) {
        return determineKeyEncAlg(secretKey.getAlgorithm(), secretKey.getEncoded().length * 8);
    }

    @Override // org.spongycastle.operator.KeyWrapper
    public byte[] generateWrappedKey(GenericKey genericKey) {
        Key jceKey = OperatorUtils.getJceKey(genericKey);
        Cipher createSymmetricWrapper = this.helper.createSymmetricWrapper(getAlgorithmIdentifier().getAlgorithm());
        try {
            createSymmetricWrapper.init(3, this.wrappingKey, this.random);
            return createSymmetricWrapper.wrap(jceKey);
        } catch (GeneralSecurityException e11) {
            throw new OperatorException("cannot wrap key: " + e11.getMessage(), e11);
        }
    }

    public JceSymmetricKeyWrapper setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }

    public JceSymmetricKeyWrapper setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AlgorithmIdentifier determineKeyEncAlg(String str, int i11) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2;
        if (!str.startsWith("DES") && !str.startsWith("TripleDES")) {
            if (str.startsWith("RC2")) {
                return new AlgorithmIdentifier(new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.3.7"), new ASN1Integer(58L));
            }
            if (str.startsWith("AES")) {
                if (i11 == 128) {
                    aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes128_wrap;
                } else if (i11 == 192) {
                    aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes192_wrap;
                } else if (i11 == 256) {
                    aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes256_wrap;
                } else {
                    throw new IllegalArgumentException("illegal keysize in AES");
                }
                return new AlgorithmIdentifier(aSN1ObjectIdentifier2);
            } else if (str.startsWith("SEED")) {
                return new AlgorithmIdentifier(KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap);
            } else {
                if (str.startsWith("Camellia")) {
                    if (i11 == 128) {
                        aSN1ObjectIdentifier = NTTObjectIdentifiers.id_camellia128_wrap;
                    } else if (i11 == 192) {
                        aSN1ObjectIdentifier = NTTObjectIdentifiers.id_camellia192_wrap;
                    } else if (i11 == 256) {
                        aSN1ObjectIdentifier = NTTObjectIdentifiers.id_camellia256_wrap;
                    } else {
                        throw new IllegalArgumentException("illegal keysize in Camellia");
                    }
                    return new AlgorithmIdentifier(aSN1ObjectIdentifier);
                }
                throw new IllegalArgumentException("unknown algorithm");
            }
        }
        return new AlgorithmIdentifier(PKCSObjectIdentifiers.id_alg_CMS3DESwrap, DERNull.INSTANCE);
    }

    public JceSymmetricKeyWrapper setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }
}