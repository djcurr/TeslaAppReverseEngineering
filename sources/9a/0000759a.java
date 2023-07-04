package in;

import com.google.firebase.perf.util.h;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class a extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f30479a;

    /* renamed from: b  reason: collision with root package name */
    private final gn.c f30480b;

    /* renamed from: c  reason: collision with root package name */
    private final h f30481c;

    /* renamed from: e  reason: collision with root package name */
    private long f30483e;

    /* renamed from: d  reason: collision with root package name */
    private long f30482d = -1;

    /* renamed from: f  reason: collision with root package name */
    private long f30484f = -1;

    public a(InputStream inputStream, gn.c cVar, h hVar) {
        this.f30481c = hVar;
        this.f30479a = inputStream;
        this.f30480b = cVar;
        this.f30483e = cVar.e();
    }

    @Override // java.io.InputStream
    public int available() {
        try {
            return this.f30479a.available();
        } catch (IOException e11) {
            this.f30480b.t(this.f30481c.b());
            d.d(this.f30480b);
            throw e11;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long b11 = this.f30481c.b();
        if (this.f30484f == -1) {
            this.f30484f = b11;
        }
        try {
            this.f30479a.close();
            long j11 = this.f30482d;
            if (j11 != -1) {
                this.f30480b.r(j11);
            }
            long j12 = this.f30483e;
            if (j12 != -1) {
                this.f30480b.u(j12);
            }
            this.f30480b.t(this.f30484f);
            this.f30480b.b();
        } catch (IOException e11) {
            this.f30480b.t(this.f30481c.b());
            d.d(this.f30480b);
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        this.f30479a.mark(i11);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f30479a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            int read = this.f30479a.read();
            long b11 = this.f30481c.b();
            if (this.f30483e == -1) {
                this.f30483e = b11;
            }
            if (read == -1 && this.f30484f == -1) {
                this.f30484f = b11;
                this.f30480b.t(b11);
                this.f30480b.b();
            } else {
                long j11 = this.f30482d + 1;
                this.f30482d = j11;
                this.f30480b.r(j11);
            }
            return read;
        } catch (IOException e11) {
            this.f30480b.t(this.f30481c.b());
            d.d(this.f30480b);
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        try {
            this.f30479a.reset();
        } catch (IOException e11) {
            this.f30480b.t(this.f30481c.b());
            d.d(this.f30480b);
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j11) {
        try {
            long skip = this.f30479a.skip(j11);
            long b11 = this.f30481c.b();
            if (this.f30483e == -1) {
                this.f30483e = b11;
            }
            if (skip == -1 && this.f30484f == -1) {
                this.f30484f = b11;
                this.f30480b.t(b11);
            } else {
                long j12 = this.f30482d + skip;
                this.f30482d = j12;
                this.f30480b.r(j12);
            }
            return skip;
        } catch (IOException e11) {
            this.f30480b.t(this.f30481c.b());
            d.d(this.f30480b);
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        try {
            int read = this.f30479a.read(bArr, i11, i12);
            long b11 = this.f30481c.b();
            if (this.f30483e == -1) {
                this.f30483e = b11;
            }
            if (read == -1 && this.f30484f == -1) {
                this.f30484f = b11;
                this.f30480b.t(b11);
                this.f30480b.b();
            } else {
                long j11 = this.f30482d + read;
                this.f30482d = j11;
                this.f30480b.r(j11);
            }
            return read;
        } catch (IOException e11) {
            this.f30480b.t(this.f30481c.b());
            d.d(this.f30480b);
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            int read = this.f30479a.read(bArr);
            long b11 = this.f30481c.b();
            if (this.f30483e == -1) {
                this.f30483e = b11;
            }
            if (read == -1 && this.f30484f == -1) {
                this.f30484f = b11;
                this.f30480b.t(b11);
                this.f30480b.b();
            } else {
                long j11 = this.f30482d + read;
                this.f30482d = j11;
                this.f30480b.r(j11);
            }
            return read;
        } catch (IOException e11) {
            this.f30480b.t(this.f30481c.b());
            d.d(this.f30480b);
            throw e11;
        }
    }
}