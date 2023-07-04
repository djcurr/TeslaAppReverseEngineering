package org.spongycastle.cert;

import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.operator.ContentVerifierProvider;

/* loaded from: classes5.dex */
public interface X509ContentVerifierProviderBuilder {
    ContentVerifierProvider build(SubjectPublicKeyInfo subjectPublicKeyInfo);

    ContentVerifierProvider build(X509CertificateHolder x509CertificateHolder);
}