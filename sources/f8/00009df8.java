package org.spongycastle.jcajce.io;

import java.io.OutputStream;
import javax.crypto.Mac;

/* loaded from: classes4.dex */
public final class MacOutputStream extends OutputStream {
    private Mac mac;

    public MacOutputStream(Mac mac) {
        this.mac = mac;
    }

    public byte[] getMac() {
        return this.mac.doFinal();
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        this.mac.update((byte) i11);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        this.mac.update(bArr, i11, i12);
    }
}