package org.spongycastle.cms.jcajce;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.cms.KeyAgreeRecipientIdentifier;
import org.spongycastle.asn1.cms.OriginatorPublicKey;
import org.spongycastle.asn1.cms.RecipientEncryptedKey;
import org.spongycastle.asn1.cms.RecipientKeyIdentifier;
import org.spongycastle.asn1.cms.ecc.MQVuserKeyingMaterial;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.cms.CMSException;
import org.spongycastle.cms.KeyAgreeRecipientInfoGenerator;
import org.spongycastle.jcajce.spec.MQVParameterSpec;
import org.spongycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.spongycastle.operator.DefaultSecretKeySizeProvider;
import org.spongycastle.operator.GenericKey;
import org.spongycastle.operator.SecretKeySizeProvider;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class JceKeyAgreeRecipientInfoGenerator extends KeyAgreeRecipientInfoGenerator {
    private static KeyMaterialGenerator ecc_cms_Generator = new RFC5753KeyMaterialGenerator();
    private KeyPair ephemeralKP;
    private EnvelopedDataHelper helper;
    private SecretKeySizeProvider keySizeProvider;
    private SecureRandom random;
    private List recipientIDs;
    private List recipientKeys;
    private PrivateKey senderPrivateKey;
    private PublicKey senderPublicKey;
    private byte[] userKeyingMaterial;

    public JceKeyAgreeRecipientInfoGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier, PrivateKey privateKey, PublicKey publicKey, ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        super(aSN1ObjectIdentifier, SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()), aSN1ObjectIdentifier2);
        this.keySizeProvider = new DefaultSecretKeySizeProvider();
        this.recipientIDs = new ArrayList();
        this.recipientKeys = new ArrayList();
        this.helper = new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
        this.senderPublicKey = publicKey;
        this.senderPrivateKey = privateKey;
    }

    private void init(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (this.random == null) {
            this.random = new SecureRandom();
        }
        if (CMSUtils.isMQV(aSN1ObjectIdentifier) && this.ephemeralKP == null) {
            try {
                SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(this.senderPublicKey.getEncoded());
                AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters(aSN1ObjectIdentifier);
                createAlgorithmParameters.init(subjectPublicKeyInfo.getAlgorithm().getParameters().toASN1Primitive().getEncoded());
                KeyPairGenerator createKeyPairGenerator = this.helper.createKeyPairGenerator(aSN1ObjectIdentifier);
                createKeyPairGenerator.initialize(createAlgorithmParameters.getParameterSpec(AlgorithmParameterSpec.class), this.random);
                this.ephemeralKP = createKeyPairGenerator.generateKeyPair();
            } catch (Exception e11) {
                throw new CMSException("cannot determine MQV ephemeral key pair parameters from public key: " + e11, e11);
            }
        }
    }

    public JceKeyAgreeRecipientInfoGenerator addRecipient(X509Certificate x509Certificate) {
        this.recipientIDs.add(new KeyAgreeRecipientIdentifier(CMSUtils.getIssuerAndSerialNumber(x509Certificate)));
        this.recipientKeys.add(x509Certificate.getPublicKey());
        return this;
    }

    @Override // org.spongycastle.cms.KeyAgreeRecipientInfoGenerator
    public ASN1Sequence generateRecipientEncryptedKeys(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, GenericKey genericKey) {
        AlgorithmParameterSpec algorithmParameterSpec;
        AlgorithmParameterSpec userKeyingMaterialSpec;
        if (!this.recipientIDs.isEmpty()) {
            init(algorithmIdentifier.getAlgorithm());
            PrivateKey privateKey = this.senderPrivateKey;
            ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            for (int i11 = 0; i11 != this.recipientIDs.size(); i11++) {
                PublicKey publicKey = (PublicKey) this.recipientKeys.get(i11);
                KeyAgreeRecipientIdentifier keyAgreeRecipientIdentifier = (KeyAgreeRecipientIdentifier) this.recipientIDs.get(i11);
                try {
                    if (CMSUtils.isMQV(algorithm)) {
                        algorithmParameterSpec = new MQVParameterSpec(this.ephemeralKP, publicKey, this.userKeyingMaterial);
                    } else {
                        if (CMSUtils.isEC(algorithm)) {
                            userKeyingMaterialSpec = new UserKeyingMaterialSpec(ecc_cms_Generator.generateKDFMaterial(algorithmIdentifier2, this.keySizeProvider.getKeySize(algorithmIdentifier2.getAlgorithm()), this.userKeyingMaterial));
                        } else if (CMSUtils.isRFC2631(algorithm)) {
                            byte[] bArr = this.userKeyingMaterial;
                            if (bArr != null) {
                                userKeyingMaterialSpec = new UserKeyingMaterialSpec(bArr);
                            } else if (algorithm.equals(PKCSObjectIdentifiers.id_alg_SSDH)) {
                                throw new CMSException("User keying material must be set for static keys.");
                            } else {
                                algorithmParameterSpec = null;
                            }
                        } else {
                            throw new CMSException("Unknown key agreement algorithm: " + algorithm);
                        }
                        algorithmParameterSpec = userKeyingMaterialSpec;
                    }
                    KeyAgreement createKeyAgreement = this.helper.createKeyAgreement(algorithm);
                    createKeyAgreement.init(privateKey, algorithmParameterSpec, this.random);
                    createKeyAgreement.doPhase(publicKey, true);
                    SecretKey generateSecret = createKeyAgreement.generateSecret(algorithmIdentifier2.getAlgorithm().getId());
                    Cipher createCipher = this.helper.createCipher(algorithmIdentifier2.getAlgorithm());
                    createCipher.init(3, generateSecret, this.random);
                    aSN1EncodableVector.add(new RecipientEncryptedKey(keyAgreeRecipientIdentifier, new DEROctetString(createCipher.wrap(this.helper.getJceKey(genericKey)))));
                } catch (GeneralSecurityException e11) {
                    throw new CMSException("Cannot perform agreement step: " + e11.getMessage(), e11);
                }
            }
            return new DERSequence(aSN1EncodableVector);
        }
        throw new CMSException("No recipients associated with generator - use addRecipient()");
    }

    @Override // org.spongycastle.cms.KeyAgreeRecipientInfoGenerator
    protected byte[] getUserKeyingMaterial(AlgorithmIdentifier algorithmIdentifier) {
        init(algorithmIdentifier.getAlgorithm());
        KeyPair keyPair = this.ephemeralKP;
        if (keyPair != null) {
            OriginatorPublicKey createOriginatorPublicKey = createOriginatorPublicKey(SubjectPublicKeyInfo.getInstance(keyPair.getPublic().getEncoded()));
            try {
                byte[] bArr = this.userKeyingMaterial;
                if (bArr != null) {
                    return new MQVuserKeyingMaterial(createOriginatorPublicKey, new DEROctetString(bArr)).getEncoded();
                }
                return new MQVuserKeyingMaterial(createOriginatorPublicKey, null).getEncoded();
            } catch (IOException e11) {
                throw new CMSException("unable to encode user keying material: " + e11.getMessage(), e11);
            }
        }
        return this.userKeyingMaterial;
    }

    public JceKeyAgreeRecipientInfoGenerator setProvider(Provider provider) {
        this.helper = new EnvelopedDataHelper(new ProviderJcaJceExtHelper(provider));
        return this;
    }

    public JceKeyAgreeRecipientInfoGenerator setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public JceKeyAgreeRecipientInfoGenerator setUserKeyingMaterial(byte[] bArr) {
        this.userKeyingMaterial = Arrays.clone(bArr);
        return this;
    }

    public JceKeyAgreeRecipientInfoGenerator setProvider(String str) {
        this.helper = new EnvelopedDataHelper(new NamedJcaJceExtHelper(str));
        return this;
    }

    public JceKeyAgreeRecipientInfoGenerator addRecipient(byte[] bArr, PublicKey publicKey) {
        this.recipientIDs.add(new KeyAgreeRecipientIdentifier(new RecipientKeyIdentifier(bArr)));
        this.recipientKeys.add(publicKey);
        return this;
    }
}