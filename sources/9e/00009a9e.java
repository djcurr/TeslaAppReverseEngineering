package org.spongycastle.cms;

import org.spongycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: classes5.dex */
public interface CMSSignatureAlgorithmNameGenerator {
    String getSignatureName(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2);
}