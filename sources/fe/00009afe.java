package org.spongycastle.cms.jcajce;

import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.X509Certificate;
import org.spongycastle.asn1.cms.AttributeTable;
import org.spongycastle.cert.jcajce.JcaX509CertificateHolder;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import org.spongycastle.cms.DefaultSignedAttributeTableGenerator;
import org.spongycastle.cms.SignerInfoGenerator;
import org.spongycastle.cms.SignerInfoGeneratorBuilder;
import org.spongycastle.operator.ContentSigner;
import org.spongycastle.operator.DigestCalculatorProvider;
import org.spongycastle.operator.jcajce.JcaContentSignerBuilder;
import org.spongycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;

/* loaded from: classes4.dex */
public class JcaSimpleSignerInfoGeneratorBuilder {
    private boolean hasNoSignedAttributes;
    private Helper helper = new Helper();
    private CMSAttributeTableGenerator signedGen;
    private CMSAttributeTableGenerator unsignedGen;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class Helper {
        private Helper() {
        }

        ContentSigner createContentSigner(String str, PrivateKey privateKey) {
            return new JcaContentSignerBuilder(str).build(privateKey);
        }

        DigestCalculatorProvider createDigestCalculatorProvider() {
            return new JcaDigestCalculatorProviderBuilder().build();
        }
    }

    /* loaded from: classes4.dex */
    private class NamedHelper extends Helper {
        private final String providerName;

        public NamedHelper(String str) {
            super();
            this.providerName = str;
        }

        @Override // org.spongycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.Helper
        ContentSigner createContentSigner(String str, PrivateKey privateKey) {
            return new JcaContentSignerBuilder(str).setProvider(this.providerName).build(privateKey);
        }

        @Override // org.spongycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.Helper
        DigestCalculatorProvider createDigestCalculatorProvider() {
            return new JcaDigestCalculatorProviderBuilder().setProvider(this.providerName).build();
        }
    }

    /* loaded from: classes4.dex */
    private class ProviderHelper extends Helper {
        private final Provider provider;

        public ProviderHelper(Provider provider) {
            super();
            this.provider = provider;
        }

        @Override // org.spongycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.Helper
        ContentSigner createContentSigner(String str, PrivateKey privateKey) {
            return new JcaContentSignerBuilder(str).setProvider(this.provider).build(privateKey);
        }

        @Override // org.spongycastle.cms.jcajce.JcaSimpleSignerInfoGeneratorBuilder.Helper
        DigestCalculatorProvider createDigestCalculatorProvider() {
            return new JcaDigestCalculatorProviderBuilder().setProvider(this.provider).build();
        }
    }

    private SignerInfoGeneratorBuilder configureAndBuild() {
        SignerInfoGeneratorBuilder signerInfoGeneratorBuilder = new SignerInfoGeneratorBuilder(this.helper.createDigestCalculatorProvider());
        signerInfoGeneratorBuilder.setDirectSignature(this.hasNoSignedAttributes);
        signerInfoGeneratorBuilder.setSignedAttributeGenerator(this.signedGen);
        signerInfoGeneratorBuilder.setUnsignedAttributeGenerator(this.unsignedGen);
        return signerInfoGeneratorBuilder;
    }

    public SignerInfoGenerator build(String str, PrivateKey privateKey, X509Certificate x509Certificate) {
        return configureAndBuild().build(this.helper.createContentSigner(str, privateKey), new JcaX509CertificateHolder(x509Certificate));
    }

    public JcaSimpleSignerInfoGeneratorBuilder setDirectSignature(boolean z11) {
        this.hasNoSignedAttributes = z11;
        return this;
    }

    public JcaSimpleSignerInfoGeneratorBuilder setProvider(String str) {
        this.helper = new NamedHelper(str);
        return this;
    }

    public JcaSimpleSignerInfoGeneratorBuilder setSignedAttributeGenerator(CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.signedGen = cMSAttributeTableGenerator;
        return this;
    }

    public JcaSimpleSignerInfoGeneratorBuilder setUnsignedAttributeGenerator(CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.unsignedGen = cMSAttributeTableGenerator;
        return this;
    }

    public JcaSimpleSignerInfoGeneratorBuilder setProvider(Provider provider) {
        this.helper = new ProviderHelper(provider);
        return this;
    }

    public JcaSimpleSignerInfoGeneratorBuilder setSignedAttributeGenerator(AttributeTable attributeTable) {
        this.signedGen = new DefaultSignedAttributeTableGenerator(attributeTable);
        return this;
    }

    public SignerInfoGenerator build(String str, PrivateKey privateKey, byte[] bArr) {
        return configureAndBuild().build(this.helper.createContentSigner(str, privateKey), bArr);
    }
}