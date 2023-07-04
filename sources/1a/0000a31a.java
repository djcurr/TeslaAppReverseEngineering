package org.spongycastle.operator;

import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.cert.X509CertificateHolder;

/* loaded from: classes4.dex */
public interface ContentVerifierProvider {
    ContentVerifier get(AlgorithmIdentifier algorithmIdentifier);

    X509CertificateHolder getAssociatedCertificate();

    boolean hasAssociatedCertificate();
}