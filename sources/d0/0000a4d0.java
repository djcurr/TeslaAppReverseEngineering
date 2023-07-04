package org.spongycastle.util.io;

import java.io.OutputStream;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class BufferingOutputStream extends OutputStream {
    private final byte[] buf;
    private int bufOff;
    private final OutputStream other;

    public BufferingOutputStream(OutputStream outputStream) {
        this.other = outputStream;
        this.buf = new byte[4096];
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        flush();
        this.other.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.other.write(this.buf, 0, this.bufOff);
        this.bufOff = 0;
        Arrays.fill(this.buf, (byte) 0);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        byte[] bArr2;
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i13 = this.bufOff;
        if (i12 < length - i13) {
            System.arraycopy(bArr, i11, bArr3, i13, i12);
            this.bufOff += i12;
            return;
        }
        int length2 = bArr3.length - i13;
        System.arraycopy(bArr, i11, bArr3, i13, length2);
        this.bufOff += length2;
        flush();
        int i14 = i11 + length2;
        int i15 = i12 - length2;
        while (true) {
            bArr2 = this.buf;
            if (i15 < bArr2.length) {
                break;
            }
            this.other.write(bArr, i14, bArr2.length);
            byte[] bArr4 = this.buf;
            i14 += bArr4.length;
            i15 -= bArr4.length;
        }
        if (i15 > 0) {
            System.arraycopy(bArr, i14, bArr2, this.bufOff, i15);
            this.bufOff += i15;
        }
    }

    public BufferingOutputStream(OutputStream outputStream, int i11) {
        this.other = outputStream;
        this.buf = new byte[i11];
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        byte[] bArr = this.buf;
        int i12 = this.bufOff;
        int i13 = i12 + 1;
        this.bufOff = i13;
        bArr[i12] = (byte) i11;
        if (i13 == bArr.length) {
            flush();
        }
    }
}