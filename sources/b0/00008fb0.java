package okio;

import ch.qos.logback.core.CoreConstants;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class v implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f42685a;

    /* renamed from: b  reason: collision with root package name */
    private final f0 f42686b;

    public v(OutputStream out, f0 timeout) {
        kotlin.jvm.internal.s.g(out, "out");
        kotlin.jvm.internal.s.g(timeout, "timeout");
        this.f42685a = out;
        this.f42686b = timeout;
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f42685a.close();
    }

    @Override // okio.c0, java.io.Flushable
    public void flush() {
        this.f42685a.flush();
    }

    @Override // okio.c0
    public f0 timeout() {
        return this.f42686b;
    }

    public String toString() {
        return "sink(" + this.f42685a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // okio.c0
    public void write(f source, long j11) {
        kotlin.jvm.internal.s.g(source, "source");
        c.b(source.P0(), 0L, j11);
        while (j11 > 0) {
            this.f42686b.throwIfReached();
            z zVar = source.f42645a;
            kotlin.jvm.internal.s.e(zVar);
            int min = (int) Math.min(j11, zVar.f42703c - zVar.f42702b);
            this.f42685a.write(zVar.f42701a, zVar.f42702b, min);
            zVar.f42702b += min;
            long j12 = min;
            j11 -= j12;
            source.J0(source.P0() - j12);
            if (zVar.f42702b == zVar.f42703c) {
                source.f42645a = zVar.b();
                a0.b(zVar);
            }
        }
    }
}