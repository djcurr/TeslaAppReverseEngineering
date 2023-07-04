package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes5.dex */
public final class p implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private int f42675a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f42676b;

    /* renamed from: c  reason: collision with root package name */
    private final h f42677c;

    /* renamed from: d  reason: collision with root package name */
    private final Inflater f42678d;

    public p(h source, Inflater inflater) {
        kotlin.jvm.internal.s.g(source, "source");
        kotlin.jvm.internal.s.g(inflater, "inflater");
        this.f42677c = source;
        this.f42678d = inflater;
    }

    private final void j() {
        int i11 = this.f42675a;
        if (i11 == 0) {
            return;
        }
        int remaining = i11 - this.f42678d.getRemaining();
        this.f42675a -= remaining;
        this.f42677c.skip(remaining);
    }

    public final long a(f sink, long j11) {
        kotlin.jvm.internal.s.g(sink, "sink");
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i11 >= 0) {
            if (!this.f42676b) {
                if (i11 == 0) {
                    return 0L;
                }
                try {
                    z S0 = sink.S0(1);
                    g();
                    int inflate = this.f42678d.inflate(S0.f42701a, S0.f42703c, (int) Math.min(j11, 8192 - S0.f42703c));
                    j();
                    if (inflate > 0) {
                        S0.f42703c += inflate;
                        long j12 = inflate;
                        sink.J0(sink.P0() + j12);
                        return j12;
                    }
                    if (S0.f42702b == S0.f42703c) {
                        sink.f42645a = S0.b();
                        a0.b(S0);
                    }
                    return 0L;
                } catch (DataFormatException e11) {
                    throw new IOException(e11);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
    }

    @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f42676b) {
            return;
        }
        this.f42678d.end();
        this.f42676b = true;
        this.f42677c.close();
    }

    public final boolean g() {
        if (this.f42678d.needsInput()) {
            if (this.f42677c.N0()) {
                return true;
            }
            z zVar = this.f42677c.b().f42645a;
            kotlin.jvm.internal.s.e(zVar);
            int i11 = zVar.f42703c;
            int i12 = zVar.f42702b;
            int i13 = i11 - i12;
            this.f42675a = i13;
            this.f42678d.setInput(zVar.f42701a, i12, i13);
            return false;
        }
        return false;
    }

    @Override // okio.e0
    public long read(f sink, long j11) {
        kotlin.jvm.internal.s.g(sink, "sink");
        do {
            long a11 = a(sink, j11);
            if (a11 > 0) {
                return a11;
            }
            if (this.f42678d.finished() || this.f42678d.needsDictionary()) {
                return -1L;
            }
        } while (!this.f42677c.N0());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // okio.e0
    public f0 timeout() {
        return this.f42677c.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(e0 source, Inflater inflater) {
        this(r.d(source), inflater);
        kotlin.jvm.internal.s.g(source, "source");
        kotlin.jvm.internal.s.g(inflater, "inflater");
    }
}