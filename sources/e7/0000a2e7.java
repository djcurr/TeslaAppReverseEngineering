package org.spongycastle.openssl;

import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;

/* loaded from: classes4.dex */
public class PEMKeyPair {
    private final PrivateKeyInfo privateKeyInfo;
    private final SubjectPublicKeyInfo publicKeyInfo;

    public PEMKeyPair(SubjectPublicKeyInfo subjectPublicKeyInfo, PrivateKeyInfo privateKeyInfo) {
        this.publicKeyInfo = subjectPublicKeyInfo;
        this.privateKeyInfo = privateKeyInfo;
    }

    public PrivateKeyInfo getPrivateKeyInfo() {
        return this.privateKeyInfo;
    }

    public SubjectPublicKeyInfo getPublicKeyInfo() {
        return this.publicKeyInfo;
    }
}