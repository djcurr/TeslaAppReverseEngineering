package okio;

import ch.qos.logback.core.CoreConstants;
import java.util.zip.Deflater;

/* loaded from: classes5.dex */
public final class j implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f42661a;

    /* renamed from: b  reason: collision with root package name */
    private final g f42662b;

    /* renamed from: c  reason: collision with root package name */
    private final Deflater f42663c;

    public j(g sink, Deflater deflater) {
        kotlin.jvm.internal.s.g(sink, "sink");
        kotlin.jvm.internal.s.g(deflater, "deflater");
        this.f42662b = sink;
        this.f42663c = deflater;
    }

    private final void a(boolean z11) {
        z S0;
        int deflate;
        f b11 = this.f42662b.b();
        while (true) {
            S0 = b11.S0(1);
            if (z11) {
                Deflater deflater = this.f42663c;
                byte[] bArr = S0.f42701a;
                int i11 = S0.f42703c;
                deflate = deflater.deflate(bArr, i11, 8192 - i11, 2);
            } else {
                Deflater deflater2 = this.f42663c;
                byte[] bArr2 = S0.f42701a;
                int i12 = S0.f42703c;
                deflate = deflater2.deflate(bArr2, i12, 8192 - i12);
            }
            if (deflate > 0) {
                S0.f42703c += deflate;
                b11.J0(b11.P0() + deflate);
                this.f42662b.I();
            } else if (this.f42663c.needsInput()) {
                break;
            }
        }
        if (S0.f42702b == S0.f42703c) {
            b11.f42645a = S0.b();
            a0.b(S0);
        }
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f42661a) {
            return;
        }
        Throwable th2 = null;
        try {
            g();
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            this.f42663c.end();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        try {
            this.f42662b.close();
        } catch (Throwable th5) {
            if (th2 == null) {
                th2 = th5;
            }
        }
        this.f42661a = true;
        if (th2 != null) {
            throw th2;
        }
    }

    @Override // okio.c0, java.io.Flushable
    public void flush() {
        a(true);
        this.f42662b.flush();
    }

    public final void g() {
        this.f42663c.finish();
        a(false);
    }

    @Override // okio.c0
    public f0 timeout() {
        return this.f42662b.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f42662b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // okio.c0
    public void write(f source, long j11) {
        kotlin.jvm.internal.s.g(source, "source");
        c.b(source.P0(), 0L, j11);
        while (j11 > 0) {
            z zVar = source.f42645a;
            kotlin.jvm.internal.s.e(zVar);
            int min = (int) Math.min(j11, zVar.f42703c - zVar.f42702b);
            this.f42663c.setInput(zVar.f42701a, zVar.f42702b, min);
            a(false);
            long j12 = min;
            source.J0(source.P0() - j12);
            int i11 = zVar.f42702b + min;
            zVar.f42702b = i11;
            if (i11 == zVar.f42703c) {
                source.f42645a = zVar.b();
                a0.b(zVar);
            }
            j11 -= j12;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(c0 sink, Deflater deflater) {
        this(r.c(sink), deflater);
        kotlin.jvm.internal.s.g(sink, "sink");
        kotlin.jvm.internal.s.g(deflater, "deflater");
    }
}