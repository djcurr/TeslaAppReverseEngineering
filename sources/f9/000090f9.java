package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
class q1 extends u1 {

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f43087e = new byte[0];

    /* renamed from: c  reason: collision with root package name */
    private final int f43088c;

    /* renamed from: d  reason: collision with root package name */
    private int f43089d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q1(InputStream inputStream, int i11, int i12) {
        super(inputStream, i12);
        if (i11 < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.f43088c = i11;
        this.f43089d = i11;
        if (i11 == 0) {
            g(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f43089d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(byte[] bArr) {
        int i11 = this.f43089d;
        if (i11 != bArr.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i11 == 0) {
            return;
        }
        int a11 = a();
        int i12 = this.f43089d;
        if (i12 >= a11) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.f43089d + " >= " + a11);
        }
        int e11 = i12 - t70.a.e(this.f43106a, bArr);
        this.f43089d = e11;
        if (e11 == 0) {
            g(true);
            return;
        }
        throw new EOFException("DEF length " + this.f43088c + " object truncated by " + this.f43089d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] m() {
        if (this.f43089d == 0) {
            return f43087e;
        }
        int a11 = a();
        int i11 = this.f43089d;
        if (i11 >= a11) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.f43089d + " >= " + a11);
        }
        byte[] bArr = new byte[i11];
        int e11 = i11 - t70.a.e(this.f43106a, bArr);
        this.f43089d = e11;
        if (e11 == 0) {
            g(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this.f43088c + " object truncated by " + this.f43089d);
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f43089d == 0) {
            return -1;
        }
        int read = this.f43106a.read();
        if (read >= 0) {
            int i11 = this.f43089d - 1;
            this.f43089d = i11;
            if (i11 == 0) {
                g(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f43088c + " object truncated by " + this.f43089d);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        int i13 = this.f43089d;
        if (i13 == 0) {
            return -1;
        }
        int read = this.f43106a.read(bArr, i11, Math.min(i12, i13));
        if (read >= 0) {
            int i14 = this.f43089d - read;
            this.f43089d = i14;
            if (i14 == 0) {
                g(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f43088c + " object truncated by " + this.f43089d);
    }
}