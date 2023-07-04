package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class h0 extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final r f43049a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f43050b = true;

    /* renamed from: c  reason: collision with root package name */
    private InputStream f43051c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(r rVar) {
        this.f43049a = rVar;
    }

    private e40.d a() {
        e40.b b11 = this.f43049a.b();
        if (b11 == null) {
            return null;
        }
        if (b11 instanceof e40.d) {
            return (e40.d) b11;
        }
        throw new IOException("unknown object encountered: " + b11.getClass());
    }

    @Override // java.io.InputStream
    public int read() {
        e40.d a11;
        if (this.f43051c == null) {
            if (!this.f43050b || (a11 = a()) == null) {
                return -1;
            }
            this.f43050b = false;
            this.f43051c = a11.getOctetStream();
        }
        while (true) {
            int read = this.f43051c.read();
            if (read >= 0) {
                return read;
            }
            e40.d a12 = a();
            if (a12 == null) {
                this.f43051c = null;
                return -1;
            }
            this.f43051c = a12.getOctetStream();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        e40.d a11;
        int i13 = 0;
        if (this.f43051c == null) {
            if (!this.f43050b || (a11 = a()) == null) {
                return -1;
            }
            this.f43050b = false;
            this.f43051c = a11.getOctetStream();
        }
        while (true) {
            int read = this.f43051c.read(bArr, i11 + i13, i12 - i13);
            if (read >= 0) {
                i13 += read;
                if (i13 == i12) {
                    return i13;
                }
            } else {
                e40.d a12 = a();
                if (a12 == null) {
                    this.f43051c = null;
                    if (i13 < 1) {
                        return -1;
                    }
                    return i13;
                }
                this.f43051c = a12.getOctetStream();
            }
        }
    }
}