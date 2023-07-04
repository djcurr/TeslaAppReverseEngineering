package org.spongycastle.cms.jcajce;

import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.cms.DefaultCMSSignatureAlgorithmNameGenerator;
import org.spongycastle.cms.SignerInformationVerifier;
import org.spongycastle.operator.ContentVerifierProvider;
import org.spongycastle.operator.DefaultSignatureAlgorithmIdentifierFinder;
import org.spongycastle.operator.DigestCalculatorProvider;
import org.spongycastle.operator.jcajce.JcaContentVerifierProviderBuilder;
import org.spongycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;

/* loaded from: classes4.dex */
public class JcaSimpleSignerInfoVerifierBuilder {
    private Helper helper = new Helper();

    /* loaded from: classes4.dex */
    private class Helper {
        private Helper() {
        }

        ContentVerifierProvider createContentVerifierProvider(PublicKey publicKey) {
            return new JcaContentVerifierProviderBuilder().build(publicKey);
        }

        DigestCalculatorProvider createDigestCalculatorProvider() {
            return new JcaDigestCalculatorProviderBuilder().build();
        }

        ContentVerifierProvider createContentVerifierProvider(X509Certificate x509Certificate) {
            return new JcaContentVerifierProviderBuilder().build(x509Certificate);
        }

        ContentVerifierProvider createContentVerifierProvider(X509CertificateHolder x509CertificateHolder) {
            return new JcaContentVerifierProviderBuilder().build(x509CertificateHolder);
        }
    }

    /* loaded from: classes4.dex */
    private class NamedHelper extends Helper {
        private final String providerName;

        public NamedHelper(String str) {
            super();
            this.providerName = str;
        }

        @Override // org.spongycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper
        ContentVerifierProvider createContentVerifierProvider(PublicKey publicKey) {
            return new JcaContentVerifierProviderBuilder().setProvider(this.providerName).build(publicKey);
        }

        @Override // org.spongycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper
        DigestCalculatorProvider createDigestCalculatorProvider() {
            return new JcaDigestCalculatorProviderBuilder().setProvider(this.providerName).build();
        }

        @Override // org.spongycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper
        ContentVerifierProvider createContentVerifierProvider(X509Certificate x509Certificate) {
            return new JcaContentVerifierProviderBuilder().setProvider(this.providerName).build(x509Certificate);
        }

        @Override // org.spongycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper
        ContentVerifierProvider createContentVerifierProvider(X509CertificateHolder x509CertificateHolder) {
            return new JcaContentVerifierProviderBuilder().setProvider(this.providerName).build(x509CertificateHolder);
        }
    }

    /* loaded from: classes4.dex */
    private class ProviderHelper extends Helper {
        private final Provider provider;

        public ProviderHelper(Provider provider) {
            super();
            this.provider = provider;
        }

        @Override // org.spongycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper
        ContentVerifierProvider createContentVerifierProvider(PublicKey publicKey) {
            return new JcaContentVerifierProviderBuilder().setProvider(this.provider).build(publicKey);
        }

        @Override // org.spongycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper
        DigestCalculatorProvider createDigestCalculatorProvider() {
            return new JcaDigestCalculatorProviderBuilder().setProvider(this.provider).build();
        }

        @Override // org.spongycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper
        ContentVerifierProvider createContentVerifierProvider(X509Certificate x509Certificate) {
            return new JcaContentVerifierProviderBuilder().setProvider(this.provider).build(x509Certificate);
        }

        @Override // org.spongycastle.cms.jcajce.JcaSimpleSignerInfoVerifierBuilder.Helper
        ContentVerifierProvider createContentVerifierProvider(X509CertificateHolder x509CertificateHolder) {
            return new JcaContentVerifierProviderBuilder().setProvider(this.provider).build(x509CertificateHolder);
        }
    }

    public SignerInformationVerifier build(X509CertificateHolder x509CertificateHolder) {
        return new SignerInformationVerifier(new DefaultCMSSignatureAlgorithmNameGenerator(), new DefaultSignatureAlgorithmIdentifierFinder(), this.helper.createContentVerifierProvider(x509CertificateHolder), this.helper.createDigestCalculatorProvider());
    }

    public JcaSimpleSignerInfoVerifierBuilder setProvider(Provider provider) {
        this.helper = new ProviderHelper(provider);
        return this;
    }

    public SignerInformationVerifier build(X509Certificate x509Certificate) {
        return new SignerInformationVerifier(new DefaultCMSSignatureAlgorithmNameGenerator(), new DefaultSignatureAlgorithmIdentifierFinder(), this.helper.createContentVerifierProvider(x509Certificate), this.helper.createDigestCalculatorProvider());
    }

    public JcaSimpleSignerInfoVerifierBuilder setProvider(String str) {
        this.helper = new NamedHelper(str);
        return this;
    }

    public SignerInformationVerifier build(PublicKey publicKey) {
        return new SignerInformationVerifier(new DefaultCMSSignatureAlgorithmNameGenerator(), new DefaultSignatureAlgorithmIdentifierFinder(), this.helper.createContentVerifierProvider(publicKey), this.helper.createDigestCalculatorProvider());
    }
}