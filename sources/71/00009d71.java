package org.spongycastle.crypto.tls;

import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class TlsInputStream extends InputStream {
    private byte[] buf = new byte[1];
    private TlsProtocol handler;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TlsInputStream(TlsProtocol tlsProtocol) {
        this.handler = null;
        this.handler = tlsProtocol;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.handler.applicationDataAvailable();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.handler.close();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        return this.handler.readApplicationData(bArr, i11, i12);
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.buf) < 0) {
            return -1;
        }
        return this.buf[0] & 255;
    }
}