package okio;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class x implements g {

    /* renamed from: a  reason: collision with root package name */
    public final f f42693a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42694b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f42695c;

    public x(c0 sink) {
        kotlin.jvm.internal.s.g(sink, "sink");
        this.f42695c = sink;
        this.f42693a = new f();
    }

    @Override // okio.g
    public g E0(int i11) {
        if (!this.f42694b) {
            this.f42693a.E0(i11);
            return I();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.g
    public OutputStream G1() {
        return new a();
    }

    @Override // okio.g
    public g I() {
        if (!this.f42694b) {
            long j11 = this.f42693a.j();
            if (j11 > 0) {
                this.f42695c.write(this.f42693a, j11);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.g
    public g L0(int i11) {
        if (!this.f42694b) {
            this.f42693a.L0(i11);
            return I();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.g
    public g O0(int i11) {
        if (!this.f42694b) {
            this.f42693a.O0(i11);
            return I();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.g
    public g T(String string) {
        kotlin.jvm.internal.s.g(string, "string");
        if (!this.f42694b) {
            this.f42693a.T(string);
            return I();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.g
    public g Z(String string, int i11, int i12) {
        kotlin.jvm.internal.s.g(string, "string");
        if (!this.f42694b) {
            this.f42693a.Z(string, i11, i12);
            return I();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.g
    public f b() {
        return this.f42693a;
    }

    @Override // okio.g
    public long b0(e0 source) {
        kotlin.jvm.internal.s.g(source, "source");
        long j11 = 0;
        while (true) {
            long read = source.read(this.f42693a, (long) PKIFailureInfo.certRevoked);
            if (read == -1) {
                return j11;
            }
            j11 += read;
            I();
        }
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f42694b) {
            return;
        }
        Throwable th2 = null;
        try {
            if (this.f42693a.P0() > 0) {
                c0 c0Var = this.f42695c;
                f fVar = this.f42693a;
                c0Var.write(fVar, fVar.P0());
            }
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            this.f42695c.close();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        this.f42694b = true;
        if (th2 != null) {
            throw th2;
        }
    }

    @Override // okio.g, okio.c0, java.io.Flushable
    public void flush() {
        if (!this.f42694b) {
            if (this.f42693a.P0() > 0) {
                c0 c0Var = this.f42695c;
                f fVar = this.f42693a;
                c0Var.write(fVar, fVar.P0());
            }
            this.f42695c.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.g
    public g i1(long j11) {
        if (!this.f42694b) {
            this.f42693a.i1(j11);
            return I();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f42694b;
    }

    @Override // okio.g
    public g j0(byte[] source) {
        kotlin.jvm.internal.s.g(source, "source");
        if (!this.f42694b) {
            this.f42693a.j0(source);
            return I();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.g
    public g o(byte[] source, int i11, int i12) {
        kotlin.jvm.internal.s.g(source, "source");
        if (!this.f42694b) {
            this.f42693a.o(source, i11, i12);
            return I();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.g
    public g q0(long j11) {
        if (!this.f42694b) {
            this.f42693a.q0(j11);
            return I();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.c0
    public f0 timeout() {
        return this.f42695c.timeout();
    }

    public String toString() {
        return "buffer(" + this.f42695c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // okio.g
    public g v() {
        if (!this.f42694b) {
            long P0 = this.f42693a.P0();
            if (P0 > 0) {
                this.f42695c.write(this.f42693a, P0);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.g
    public g w1(i byteString) {
        kotlin.jvm.internal.s.g(byteString, "byteString");
        if (!this.f42694b) {
            this.f42693a.w1(byteString);
            return I();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        kotlin.jvm.internal.s.g(source, "source");
        if (!this.f42694b) {
            int write = this.f42693a.write(source);
            I();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.g
    public g x(int i11) {
        if (!this.f42694b) {
            this.f42693a.x(i11);
            return I();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.g
    public g z(long j11) {
        if (!this.f42694b) {
            this.f42693a.z(j11);
            return I();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* loaded from: classes5.dex */
    public static final class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            x.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            x xVar = x.this;
            if (xVar.f42694b) {
                return;
            }
            xVar.flush();
        }

        public String toString() {
            return x.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
            x xVar = x.this;
            if (!xVar.f42694b) {
                xVar.f42693a.O0((byte) i11);
                x.this.I();
                return;
            }
            throw new IOException("closed");
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i11, int i12) {
            kotlin.jvm.internal.s.g(data, "data");
            x xVar = x.this;
            if (!xVar.f42694b) {
                xVar.f42693a.o(data, i11, i12);
                x.this.I();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // okio.c0
    public void write(f source, long j11) {
        kotlin.jvm.internal.s.g(source, "source");
        if (!this.f42694b) {
            this.f42693a.write(source, j11);
            I();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}