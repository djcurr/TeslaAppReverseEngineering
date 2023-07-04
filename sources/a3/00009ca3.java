package org.spongycastle.crypto.params;

import org.spongycastle.crypto.DerivationParameters;

/* loaded from: classes4.dex */
public class KDFParameters implements DerivationParameters {

    /* renamed from: iv  reason: collision with root package name */
    byte[] f43616iv;
    byte[] shared;

    public KDFParameters(byte[] bArr, byte[] bArr2) {
        this.shared = bArr;
        this.f43616iv = bArr2;
    }

    public byte[] getIV() {
        return this.f43616iv;
    }

    public byte[] getSharedSecret() {
        return this.shared;
    }
}