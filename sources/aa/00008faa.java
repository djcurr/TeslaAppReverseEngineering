package okio;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class q implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f42679a;

    /* renamed from: b  reason: collision with root package name */
    private final f0 f42680b;

    public q(InputStream input, f0 timeout) {
        kotlin.jvm.internal.s.g(input, "input");
        kotlin.jvm.internal.s.g(timeout, "timeout");
        this.f42679a = input;
        this.f42680b = timeout;
    }

    @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f42679a.close();
    }

    @Override // okio.e0
    public long read(f sink, long j11) {
        kotlin.jvm.internal.s.g(sink, "sink");
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i11 == 0) {
            return 0L;
        }
        if (i11 >= 0) {
            try {
                this.f42680b.throwIfReached();
                z S0 = sink.S0(1);
                int read = this.f42679a.read(S0.f42701a, S0.f42703c, (int) Math.min(j11, 8192 - S0.f42703c));
                if (read == -1) {
                    if (S0.f42702b == S0.f42703c) {
                        sink.f42645a = S0.b();
                        a0.b(S0);
                        return -1L;
                    }
                    return -1L;
                }
                S0.f42703c += read;
                long j12 = read;
                sink.J0(sink.P0() + j12);
                return j12;
            } catch (AssertionError e11) {
                if (r.e(e11)) {
                    throw new IOException(e11);
                }
                throw e11;
            }
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
    }

    @Override // okio.e0
    public f0 timeout() {
        return this.f42680b;
    }

    public String toString() {
        return "source(" + this.f42679a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}