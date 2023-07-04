package org.spongycastle.crypto.tls;

import java.io.OutputStream;

/* loaded from: classes4.dex */
public class ByteQueueOutputStream extends OutputStream {
    private ByteQueue buffer = new ByteQueue();

    public ByteQueue getBuffer() {
        return this.buffer;
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        this.buffer.addData(new byte[]{(byte) i11}, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        this.buffer.addData(bArr, i11, i12);
    }
}