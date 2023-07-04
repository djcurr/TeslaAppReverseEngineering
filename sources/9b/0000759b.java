package in;

import com.google.firebase.perf.util.h;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class b extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f30485a;

    /* renamed from: b  reason: collision with root package name */
    private final h f30486b;

    /* renamed from: c  reason: collision with root package name */
    gn.c f30487c;

    /* renamed from: d  reason: collision with root package name */
    long f30488d = -1;

    public b(OutputStream outputStream, gn.c cVar, h hVar) {
        this.f30485a = outputStream;
        this.f30487c = cVar;
        this.f30486b = hVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j11 = this.f30488d;
        if (j11 != -1) {
            this.f30487c.o(j11);
        }
        this.f30487c.s(this.f30486b.b());
        try {
            this.f30485a.close();
        } catch (IOException e11) {
            this.f30487c.t(this.f30486b.b());
            d.d(this.f30487c);
            throw e11;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        try {
            this.f30485a.flush();
        } catch (IOException e11) {
            this.f30487c.t(this.f30486b.b());
            d.d(this.f30487c);
            throw e11;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        try {
            this.f30485a.write(i11);
            long j11 = this.f30488d + 1;
            this.f30488d = j11;
            this.f30487c.o(j11);
        } catch (IOException e11) {
            this.f30487c.t(this.f30486b.b());
            d.d(this.f30487c);
            throw e11;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            this.f30485a.write(bArr);
            long length = this.f30488d + bArr.length;
            this.f30488d = length;
            this.f30487c.o(length);
        } catch (IOException e11) {
            this.f30487c.t(this.f30486b.b());
            d.d(this.f30487c);
            throw e11;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        try {
            this.f30485a.write(bArr, i11, i12);
            long j11 = this.f30488d + i12;
            this.f30488d = j11;
            this.f30487c.o(j11);
        } catch (IOException e11) {
            this.f30487c.t(this.f30486b.b());
            d.d(this.f30487c);
            throw e11;
        }
    }
}