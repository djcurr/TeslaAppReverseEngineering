package org.spongycastle.openssl.jcajce;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.openssl.PEMException;
import org.spongycastle.openssl.PEMKeyPair;

/* loaded from: classes4.dex */
public class JcaPEMKeyConverter {
    private static final Map algorithms;
    private JcaJceHelper helper = new DefaultJcaJceHelper();

    static {
        HashMap hashMap = new HashMap();
        algorithms = hashMap;
        hashMap.put(X9ObjectIdentifiers.id_ecPublicKey, "ECDSA");
        hashMap.put(PKCSObjectIdentifiers.rsaEncryption, "RSA");
        hashMap.put(X9ObjectIdentifiers.id_dsa, "DSA");
    }

    private KeyFactory getKeyFactory(AlgorithmIdentifier algorithmIdentifier) {
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        String str = (String) algorithms.get(algorithm);
        if (str == null) {
            str = algorithm.getId();
        }
        try {
            return this.helper.createKeyFactory(str);
        } catch (NoSuchAlgorithmException e11) {
            if (str.equals("ECDSA")) {
                return this.helper.createKeyFactory("EC");
            }
            throw e11;
        }
    }

    public KeyPair getKeyPair(PEMKeyPair pEMKeyPair) {
        try {
            KeyFactory keyFactory = getKeyFactory(pEMKeyPair.getPrivateKeyInfo().getPrivateKeyAlgorithm());
            return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(pEMKeyPair.getPublicKeyInfo().getEncoded())), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(pEMKeyPair.getPrivateKeyInfo().getEncoded())));
        } catch (Exception e11) {
            throw new PEMException("unable to convert key pair: " + e11.getMessage(), e11);
        }
    }

    public PrivateKey getPrivateKey(PrivateKeyInfo privateKeyInfo) {
        try {
            return getKeyFactory(privateKeyInfo.getPrivateKeyAlgorithm()).generatePrivate(new PKCS8EncodedKeySpec(privateKeyInfo.getEncoded()));
        } catch (Exception e11) {
            throw new PEMException("unable to convert key pair: " + e11.getMessage(), e11);
        }
    }

    public PublicKey getPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            return getKeyFactory(subjectPublicKeyInfo.getAlgorithm()).generatePublic(new X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
        } catch (Exception e11) {
            throw new PEMException("unable to convert key pair: " + e11.getMessage(), e11);
        }
    }

    public JcaPEMKeyConverter setProvider(Provider provider) {
        this.helper = new ProviderJcaJceHelper(provider);
        return this;
    }

    public JcaPEMKeyConverter setProvider(String str) {
        this.helper = new NamedJcaJceHelper(str);
        return this;
    }
}