package z50;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import r70.m;

/* loaded from: classes5.dex */
class h {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f60338a = new ByteArrayOutputStream();

    public byte[] a() {
        return this.f60338a.toByteArray();
    }

    public byte[] b() {
        return c(8);
    }

    public byte[] c(int i11) {
        int size = this.f60338a.size() % i11;
        if (size != 0) {
            int i12 = i11 - size;
            for (int i13 = 1; i13 <= i12; i13++) {
                this.f60338a.write(i13);
            }
        }
        return this.f60338a.toByteArray();
    }

    public void d(int i11) {
        this.f60338a.write((i11 >>> 24) & 255);
        this.f60338a.write((i11 >>> 16) & 255);
        this.f60338a.write((i11 >>> 8) & 255);
        this.f60338a.write(i11 & 255);
    }

    public void e(BigInteger bigInteger) {
        f(bigInteger.toByteArray());
    }

    public void f(byte[] bArr) {
        d(bArr.length);
        try {
            this.f60338a.write(bArr);
        } catch (IOException e11) {
            throw new IllegalStateException(e11.getMessage(), e11);
        }
    }

    public void g(byte[] bArr) {
        try {
            this.f60338a.write(bArr);
        } catch (IOException e11) {
            throw new IllegalStateException(e11.getMessage(), e11);
        }
    }

    public void h(String str) {
        f(m.f(str));
    }
}