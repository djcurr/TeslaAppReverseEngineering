package org.spongycastle.operator.bc;

import java.io.OutputStream;
import org.spongycastle.crypto.Signer;

/* loaded from: classes4.dex */
public class BcSignerOutputStream extends OutputStream {
    private Signer sig;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BcSignerOutputStream(Signer signer) {
        this.sig = signer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] getSignature() {
        return this.sig.generateSignature();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean verify(byte[] bArr) {
        return this.sig.verifySignature(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        this.sig.update(bArr, i11, i12);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.sig.update(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        this.sig.update((byte) i11);
    }
}