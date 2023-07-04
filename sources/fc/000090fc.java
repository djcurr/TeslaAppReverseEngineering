package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class r1 extends u1 {

    /* renamed from: c  reason: collision with root package name */
    private int f43094c;

    /* renamed from: d  reason: collision with root package name */
    private int f43095d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f43096e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f43097f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r1(InputStream inputStream, int i11) {
        super(inputStream, i11);
        this.f43096e = false;
        this.f43097f = true;
        this.f43094c = inputStream.read();
        int read = inputStream.read();
        this.f43095d = read;
        if (read < 0) {
            throw new EOFException();
        }
        j();
    }

    private boolean j() {
        if (!this.f43096e && this.f43097f && this.f43094c == 0 && this.f43095d == 0) {
            this.f43096e = true;
            g(true);
        }
        return this.f43096e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(boolean z11) {
        this.f43097f = z11;
        j();
    }

    @Override // java.io.InputStream
    public int read() {
        if (j()) {
            return -1;
        }
        int read = this.f43106a.read();
        if (read >= 0) {
            int i11 = this.f43094c;
            this.f43094c = this.f43095d;
            this.f43095d = read;
            return i11;
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        if (this.f43097f || i12 < 3) {
            return super.read(bArr, i11, i12);
        }
        if (this.f43096e) {
            return -1;
        }
        int read = this.f43106a.read(bArr, i11 + 2, i12 - 2);
        if (read >= 0) {
            bArr[i11] = (byte) this.f43094c;
            bArr[i11 + 1] = (byte) this.f43095d;
            this.f43094c = this.f43106a.read();
            int read2 = this.f43106a.read();
            this.f43095d = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }
}