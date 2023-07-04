package org.spongycastle.cms;

/* loaded from: classes5.dex */
public interface SignerInformationVerifierProvider {
    SignerInformationVerifier get(SignerId signerId);
}