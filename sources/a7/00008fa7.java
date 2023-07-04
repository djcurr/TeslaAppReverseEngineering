package okio;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* loaded from: classes5.dex */
public final class n implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final x f42665a;

    /* renamed from: b  reason: collision with root package name */
    private final Deflater f42666b;

    /* renamed from: c  reason: collision with root package name */
    private final j f42667c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f42668d;

    /* renamed from: e  reason: collision with root package name */
    private final CRC32 f42669e;

    public n(c0 sink) {
        kotlin.jvm.internal.s.g(sink, "sink");
        x xVar = new x(sink);
        this.f42665a = xVar;
        Deflater deflater = new Deflater(-1, true);
        this.f42666b = deflater;
        this.f42667c = new j((g) xVar, deflater);
        this.f42669e = new CRC32();
        f fVar = xVar.f42693a;
        fVar.E0(8075);
        fVar.O0(8);
        fVar.O0(0);
        fVar.x(0);
        fVar.O0(0);
        fVar.O0(0);
    }

    private final void a(f fVar, long j11) {
        z zVar = fVar.f42645a;
        kotlin.jvm.internal.s.e(zVar);
        while (j11 > 0) {
            int min = (int) Math.min(j11, zVar.f42703c - zVar.f42702b);
            this.f42669e.update(zVar.f42701a, zVar.f42702b, min);
            j11 -= min;
            zVar = zVar.f42706f;
            kotlin.jvm.internal.s.e(zVar);
        }
    }

    private final void g() {
        this.f42665a.L0((int) this.f42669e.getValue());
        this.f42665a.L0((int) this.f42666b.getBytesRead());
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f42668d) {
            return;
        }
        Throwable th2 = null;
        try {
            this.f42667c.g();
            g();
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            this.f42666b.end();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        try {
            this.f42665a.close();
        } catch (Throwable th5) {
            if (th2 == null) {
                th2 = th5;
            }
        }
        this.f42668d = true;
        if (th2 != null) {
            throw th2;
        }
    }

    @Override // okio.c0, java.io.Flushable
    public void flush() {
        this.f42667c.flush();
    }

    @Override // okio.c0
    public f0 timeout() {
        return this.f42665a.timeout();
    }

    @Override // okio.c0
    public void write(f source, long j11) {
        kotlin.jvm.internal.s.g(source, "source");
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        } else if (i11 == 0) {
        } else {
            a(source, j11);
            this.f42667c.write(source, j11);
        }
    }
}