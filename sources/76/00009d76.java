package org.spongycastle.crypto.tls;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class TlsOutputStream extends OutputStream {
    private byte[] buf = new byte[1];
    private TlsProtocol handler;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TlsOutputStream(TlsProtocol tlsProtocol) {
        this.handler = tlsProtocol;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.handler.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.handler.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        this.handler.writeData(bArr, i11, i12);
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        byte[] bArr = this.buf;
        bArr[0] = (byte) i11;
        write(bArr, 0, 1);
    }
}