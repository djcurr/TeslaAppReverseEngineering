package pd;

import java.io.IOException;
import java.io.InputStream;
import md.k;

/* loaded from: classes.dex */
public class f extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f46423a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f46424b;

    /* renamed from: c  reason: collision with root package name */
    private final qd.h<byte[]> f46425c;

    /* renamed from: d  reason: collision with root package name */
    private int f46426d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f46427e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f46428f = false;

    public f(InputStream inputStream, byte[] bArr, qd.h<byte[]> hVar) {
        this.f46423a = (InputStream) k.g(inputStream);
        this.f46424b = (byte[]) k.g(bArr);
        this.f46425c = (qd.h) k.g(hVar);
    }

    private boolean a() {
        if (this.f46427e < this.f46426d) {
            return true;
        }
        int read = this.f46423a.read(this.f46424b);
        if (read <= 0) {
            return false;
        }
        this.f46426d = read;
        this.f46427e = 0;
        return true;
    }

    private void g() {
        if (this.f46428f) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public int available() {
        k.i(this.f46427e <= this.f46426d);
        g();
        return (this.f46426d - this.f46427e) + this.f46423a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f46428f) {
            return;
        }
        this.f46428f = true;
        this.f46425c.a(this.f46424b);
        super.close();
    }

    protected void finalize() {
        if (!this.f46428f) {
            nd.a.j("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public int read() {
        k.i(this.f46427e <= this.f46426d);
        g();
        if (a()) {
            byte[] bArr = this.f46424b;
            int i11 = this.f46427e;
            this.f46427e = i11 + 1;
            return bArr[i11] & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public long skip(long j11) {
        k.i(this.f46427e <= this.f46426d);
        g();
        int i11 = this.f46426d;
        int i12 = this.f46427e;
        long j12 = i11 - i12;
        if (j12 >= j11) {
            this.f46427e = (int) (i12 + j11);
            return j11;
        }
        this.f46427e = i11;
        return j12 + this.f46423a.skip(j11 - j12);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        k.i(this.f46427e <= this.f46426d);
        g();
        if (a()) {
            int min = Math.min(this.f46426d - this.f46427e, i12);
            System.arraycopy(this.f46424b, this.f46427e, bArr, i11, min);
            this.f46427e += min;
            return min;
        }
        return -1;
    }
}