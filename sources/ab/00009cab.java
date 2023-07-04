package org.spongycastle.crypto.params;

import org.spongycastle.crypto.CipherParameters;

/* loaded from: classes4.dex */
public class ParametersWithIV implements CipherParameters {

    /* renamed from: iv  reason: collision with root package name */
    private byte[] f43619iv;
    private CipherParameters parameters;

    public ParametersWithIV(CipherParameters cipherParameters, byte[] bArr) {
        this(cipherParameters, bArr, 0, bArr.length);
    }

    public byte[] getIV() {
        return this.f43619iv;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }

    public ParametersWithIV(CipherParameters cipherParameters, byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        this.f43619iv = bArr2;
        this.parameters = cipherParameters;
        System.arraycopy(bArr, i11, bArr2, 0, i12);
    }
}