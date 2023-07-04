package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes5.dex */
public final class o implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private byte f42670a;

    /* renamed from: b  reason: collision with root package name */
    private final y f42671b;

    /* renamed from: c  reason: collision with root package name */
    private final Inflater f42672c;

    /* renamed from: d  reason: collision with root package name */
    private final p f42673d;

    /* renamed from: e  reason: collision with root package name */
    private final CRC32 f42674e;

    public o(e0 source) {
        kotlin.jvm.internal.s.g(source, "source");
        y yVar = new y(source);
        this.f42671b = yVar;
        Inflater inflater = new Inflater(true);
        this.f42672c = inflater;
        this.f42673d = new p((h) yVar, inflater);
        this.f42674e = new CRC32();
    }

    private final void a(String str, int i11, int i12) {
        if (i12 == i11) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i12), Integer.valueOf(i11)}, 3));
        kotlin.jvm.internal.s.f(format, "java.lang.String.format(this, *args)");
        throw new IOException(format);
    }

    private final void g() {
        this.f42671b.m0(10L);
        byte J = this.f42671b.f42697a.J(3L);
        boolean z11 = ((J >> 1) & 1) == 1;
        if (z11) {
            l(this.f42671b.f42697a, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f42671b.readShort());
        this.f42671b.skip(8L);
        if (((J >> 2) & 1) == 1) {
            this.f42671b.m0(2L);
            if (z11) {
                l(this.f42671b.f42697a, 0L, 2L);
            }
            long D0 = this.f42671b.f42697a.D0();
            this.f42671b.m0(D0);
            if (z11) {
                l(this.f42671b.f42697a, 0L, D0);
            }
            this.f42671b.skip(D0);
        }
        if (((J >> 3) & 1) == 1) {
            long a11 = this.f42671b.a((byte) 0);
            if (a11 != -1) {
                if (z11) {
                    l(this.f42671b.f42697a, 0L, a11 + 1);
                }
                this.f42671b.skip(a11 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((J >> 4) & 1) == 1) {
            long a12 = this.f42671b.a((byte) 0);
            if (a12 != -1) {
                if (z11) {
                    l(this.f42671b.f42697a, 0L, a12 + 1);
                }
                this.f42671b.skip(a12 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z11) {
            a("FHCRC", this.f42671b.p(), (short) this.f42674e.getValue());
            this.f42674e.reset();
        }
    }

    private final void j() {
        a("CRC", this.f42671b.r1(), (int) this.f42674e.getValue());
        a("ISIZE", this.f42671b.r1(), (int) this.f42672c.getBytesWritten());
    }

    private final void l(f fVar, long j11, long j12) {
        int i11;
        z zVar = fVar.f42645a;
        kotlin.jvm.internal.s.e(zVar);
        while (true) {
            int i12 = zVar.f42703c;
            int i13 = zVar.f42702b;
            if (j11 < i12 - i13) {
                break;
            }
            j11 -= i12 - i13;
            zVar = zVar.f42706f;
            kotlin.jvm.internal.s.e(zVar);
        }
        while (j12 > 0) {
            int min = (int) Math.min(zVar.f42703c - i11, j12);
            this.f42674e.update(zVar.f42701a, (int) (zVar.f42702b + j11), min);
            j12 -= min;
            zVar = zVar.f42706f;
            kotlin.jvm.internal.s.e(zVar);
            j11 = 0;
        }
    }

    @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f42673d.close();
    }

    @Override // okio.e0
    public long read(f sink, long j11) {
        kotlin.jvm.internal.s.g(sink, "sink");
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        } else if (i11 == 0) {
            return 0L;
        } else {
            if (this.f42670a == 0) {
                g();
                this.f42670a = (byte) 1;
            }
            if (this.f42670a == 1) {
                long P0 = sink.P0();
                long read = this.f42673d.read(sink, j11);
                if (read != -1) {
                    l(sink, P0, read);
                    return read;
                }
                this.f42670a = (byte) 2;
            }
            if (this.f42670a == 2) {
                j();
                this.f42670a = (byte) 3;
                if (!this.f42671b.N0()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
    }

    @Override // okio.e0
    public f0 timeout() {
        return this.f42671b.timeout();
    }
}