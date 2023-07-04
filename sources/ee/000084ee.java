package lx;

import java.io.OutputStream;

/* loaded from: classes5.dex */
class d extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f37769a;

    /* renamed from: b  reason: collision with root package name */
    private final a f37770b;

    /* renamed from: c  reason: collision with root package name */
    private long f37771c;

    /* renamed from: d  reason: collision with root package name */
    private long f37772d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(OutputStream outputStream, a aVar, long j11) {
        this.f37769a = outputStream;
        this.f37770b = aVar;
        this.f37771c = j11;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        OutputStream outputStream = this.f37769a;
        if (outputStream != null) {
            outputStream.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        OutputStream outputStream = this.f37769a;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        this.f37769a.write(bArr, i11, i12);
        long j11 = this.f37771c;
        if (j11 < 0) {
            this.f37770b.a(-1L, -1L, -1.0f);
            return;
        }
        if (i12 < bArr.length) {
            this.f37772d += i12;
        } else {
            this.f37772d += bArr.length;
        }
        a aVar = this.f37770b;
        long j12 = this.f37772d;
        aVar.a(j12, j11, (((float) j12) * 1.0f) / ((float) j11));
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        this.f37769a.write(i11);
        long j11 = this.f37771c;
        if (j11 < 0) {
            this.f37770b.a(-1L, -1L, -1.0f);
            return;
        }
        long j12 = 1 + this.f37772d;
        this.f37772d = j12;
        this.f37770b.a(j12, j11, (((float) j12) * 1.0f) / ((float) j11));
    }
}