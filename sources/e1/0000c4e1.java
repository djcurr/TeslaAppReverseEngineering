package zj;

import java.io.InputStream;

/* loaded from: classes3.dex */
public final class h extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.a f60440a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f60441b;

    /* renamed from: f  reason: collision with root package name */
    private long f60445f;

    /* renamed from: d  reason: collision with root package name */
    private boolean f60443d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f60444e = false;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f60442c = new byte[1];

    public h(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar) {
        this.f60440a = aVar;
        this.f60441b = bVar;
    }

    private void a() {
        if (this.f60443d) {
            return;
        }
        this.f60440a.i(this.f60441b);
        this.f60443d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f60444e) {
            return;
        }
        this.f60440a.close();
        this.f60444e = true;
    }

    public void g() {
        a();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f60442c) == -1) {
            return -1;
        }
        return this.f60442c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        ak.a.f(!this.f60444e);
        a();
        int read = this.f60440a.read(bArr, i11, i12);
        if (read == -1) {
            return -1;
        }
        this.f60445f += read;
        return read;
    }
}