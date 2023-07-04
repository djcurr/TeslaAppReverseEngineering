package org.spongycastle.cert.jcajce;

import java.security.Provider;
import java.security.cert.CertificateException;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.cert.X509ContentVerifierProviderBuilder;
import org.spongycastle.operator.ContentVerifierProvider;
import org.spongycastle.operator.OperatorCreationException;
import org.spongycastle.operator.jcajce.JcaContentVerifierProviderBuilder;

/* loaded from: classes5.dex */
public class JcaX509ContentVerifierProviderBuilder implements X509ContentVerifierProviderBuilder {
    private JcaContentVerifierProviderBuilder builder = new JcaContentVerifierProviderBuilder();

    @Override // org.spongycastle.cert.X509ContentVerifierProviderBuilder
    public ContentVerifierProvider build(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return this.builder.build(subjectPublicKeyInfo);
    }

    public JcaX509ContentVerifierProviderBuilder setProvider(Provider provider) {
        this.builder.setProvider(provider);
        return this;
    }

    @Override // org.spongycastle.cert.X509ContentVerifierProviderBuilder
    public ContentVerifierProvider build(X509CertificateHolder x509CertificateHolder) {
        try {
            return this.builder.build(x509CertificateHolder);
        } catch (CertificateException e11) {
            throw new OperatorCreationException("Unable to process certificate: " + e11.getMessage(), e11);
        }
    }

    public JcaX509ContentVerifierProviderBuilder setProvider(String str) {
        this.builder.setProvider(str);
        return this;
    }
}