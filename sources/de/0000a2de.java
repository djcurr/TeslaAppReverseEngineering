package org.spongycastle.mozilla.jcajce;

import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.mozilla.SignedPublicKeyAndChallenge;

/* loaded from: classes4.dex */
public class JcaSignedPublicKeyAndChallenge extends SignedPublicKeyAndChallenge {
    JcaJceHelper helper;

    private JcaSignedPublicKeyAndChallenge(org.spongycastle.asn1.mozilla.SignedPublicKeyAndChallenge signedPublicKeyAndChallenge, JcaJceHelper jcaJceHelper) {
        super(signedPublicKeyAndChallenge);
        this.helper = new DefaultJcaJceHelper();
        this.helper = jcaJceHelper;
    }

    public PublicKey getPublicKey() {
        try {
            SubjectPublicKeyInfo subjectPublicKeyInfo = this.spkacSeq.getPublicKeyAndChallenge().getSubjectPublicKeyInfo();
            return this.helper.createKeyFactory(subjectPublicKeyInfo.getAlgorithm().getAlgorithm().getId()).generatePublic(new X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
        } catch (Exception unused) {
            throw new InvalidKeyException("error encoding public key");
        }
    }

    public JcaSignedPublicKeyAndChallenge setProvider(String str) {
        return new JcaSignedPublicKeyAndChallenge(this.spkacSeq, new NamedJcaJceHelper(str));
    }

    public JcaSignedPublicKeyAndChallenge setProvider(Provider provider) {
        return new JcaSignedPublicKeyAndChallenge(this.spkacSeq, new ProviderJcaJceHelper(provider));
    }

    public JcaSignedPublicKeyAndChallenge(byte[] bArr) {
        super(bArr);
        this.helper = new DefaultJcaJceHelper();
    }
}