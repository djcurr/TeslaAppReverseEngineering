package org.spongycastle.operator;

import org.spongycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: classes4.dex */
public interface SignatureAlgorithmIdentifierFinder {
    AlgorithmIdentifier find(String str);
}