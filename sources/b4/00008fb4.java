package okio;

import ch.qos.logback.core.CoreConstants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class y implements h {

    /* renamed from: a  reason: collision with root package name */
    public final f f42697a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42698b;

    /* renamed from: c  reason: collision with root package name */
    public final e0 f42699c;

    public y(e0 source) {
        kotlin.jvm.internal.s.g(source, "source");
        this.f42699c = source;
        this.f42697a = new f();
    }

    @Override // okio.h
    public long B(i bytes) {
        kotlin.jvm.internal.s.g(bytes, "bytes");
        return j(bytes, 0L);
    }

    @Override // okio.h
    public long C1(c0 sink) {
        kotlin.jvm.internal.s.g(sink, "sink");
        long j11 = 0;
        while (this.f42699c.read(this.f42697a, (long) PKIFailureInfo.certRevoked) != -1) {
            long j12 = this.f42697a.j();
            if (j12 > 0) {
                j11 += j12;
                sink.write(this.f42697a, j12);
            }
        }
        if (this.f42697a.P0() > 0) {
            long P0 = j11 + this.f42697a.P0();
            f fVar = this.f42697a;
            sink.write(fVar, fVar.P0());
            return P0;
        }
        return j11;
    }

    @Override // okio.h
    public void G(f sink, long j11) {
        kotlin.jvm.internal.s.g(sink, "sink");
        try {
            m0(j11);
            this.f42697a.G(sink, j11);
        } catch (EOFException e11) {
            sink.b0(this.f42697a);
            throw e11;
        }
    }

    @Override // okio.h
    public long H(i targetBytes) {
        kotlin.jvm.internal.s.g(targetBytes, "targetBytes");
        return l(targetBytes, 0L);
    }

    @Override // okio.h
    public long H1() {
        byte J;
        int a11;
        int a12;
        m0(1L);
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            if (!request(i12)) {
                break;
            }
            J = this.f42697a.J(i11);
            if ((J < ((byte) 48) || J > ((byte) 57)) && ((J < ((byte) 97) || J > ((byte) 102)) && (J < ((byte) 65) || J > ((byte) 70)))) {
                break;
            }
            i11 = i12;
        }
        if (i11 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            a11 = kotlin.text.b.a(16);
            a12 = kotlin.text.b.a(a11);
            String num = Integer.toString(J, a12);
            kotlin.jvm.internal.s.f(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb2.append(num);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f42697a.H1();
    }

    @Override // okio.h
    public InputStream I1() {
        return new a();
    }

    @Override // okio.h
    public int J1(u options) {
        kotlin.jvm.internal.s.g(options, "options");
        if (!this.f42698b) {
            while (true) {
                int e11 = q30.a.e(this.f42697a, options, true);
                if (e11 == -2) {
                    if (this.f42699c.read(this.f42697a, (long) PKIFailureInfo.certRevoked) == -1) {
                        break;
                    }
                } else if (e11 != -1) {
                    this.f42697a.skip(options.f()[e11].z());
                    return e11;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.h
    public String K(long j11) {
        if (j11 >= 0) {
            long j12 = j11 == Long.MAX_VALUE ? Long.MAX_VALUE : j11 + 1;
            byte b11 = (byte) 10;
            long g11 = g(b11, 0L, j12);
            if (g11 != -1) {
                return q30.a.d(this.f42697a, g11);
            }
            if (j12 < Long.MAX_VALUE && request(j12) && this.f42697a.J(j12 - 1) == ((byte) 13) && request(1 + j12) && this.f42697a.J(j12) == b11) {
                return q30.a.d(this.f42697a, j12);
            }
            f fVar = new f();
            f fVar2 = this.f42697a;
            fVar2.m(fVar, 0L, Math.min(32, fVar2.P0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f42697a.P0(), j11) + " content=" + fVar.j1().n() + "…");
        }
        throw new IllegalArgumentException(("limit < 0: " + j11).toString());
    }

    @Override // okio.h
    public byte[] K0() {
        this.f42697a.b0(this.f42699c);
        return this.f42697a.K0();
    }

    @Override // okio.h
    public boolean N0() {
        if (!this.f42698b) {
            return this.f42697a.N0() && this.f42699c.read(this.f42697a, (long) PKIFailureInfo.certRevoked) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r4 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9] or '-' character but was 0x");
        r2 = kotlin.text.b.a(16);
        r2 = kotlin.text.b.a(r2);
        r2 = java.lang.Integer.toString(r8, r2);
        kotlin.jvm.internal.s.f(r2, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // okio.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long T0() {
        /*
            r10 = this;
            r0 = 1
            r10.m0(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L59
            okio.f r8 = r10.f42697a
            byte r8 = r8.J(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L20
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L2a
        L20:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            r5 = 45
            byte r5 = (byte) r5
            if (r8 == r5) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L8
        L2c:
            if (r4 == 0) goto L2f
            goto L59
        L2f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.append(r2)
            r2 = 16
            int r2 = kotlin.text.a.a(r2)
            int r2 = kotlin.text.a.a(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.s.f(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L59:
            okio.f r0 = r10.f42697a
            long r0 = r0.T0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.y.T0():long");
    }

    @Override // okio.h
    public boolean V(long j11, i bytes) {
        kotlin.jvm.internal.s.g(bytes, "bytes");
        return m(j11, bytes, 0, bytes.z());
    }

    public long a(byte b11) {
        return g(b11, 0L, Long.MAX_VALUE);
    }

    @Override // okio.h, okio.g
    public f b() {
        return this.f42697a;
    }

    @Override // okio.h
    public String c1(Charset charset) {
        kotlin.jvm.internal.s.g(charset, "charset");
        this.f42697a.b0(this.f42699c);
        return this.f42697a.c1(charset);
    }

    @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f42698b) {
            return;
        }
        this.f42698b = true;
        this.f42699c.close();
        this.f42697a.a();
    }

    @Override // okio.h
    public String f0() {
        return K(Long.MAX_VALUE);
    }

    public long g(byte b11, long j11, long j12) {
        boolean z11 = true;
        if (!this.f42698b) {
            if (!((0 > j11 || j12 < j11) ? false : false)) {
                throw new IllegalArgumentException(("fromIndex=" + j11 + " toIndex=" + j12).toString());
            }
            while (j11 < j12) {
                long L = this.f42697a.L(b11, j11, j12);
                if (L != -1) {
                    return L;
                }
                long P0 = this.f42697a.P0();
                if (P0 >= j12 || this.f42699c.read(this.f42697a, (long) PKIFailureInfo.certRevoked) == -1) {
                    return -1L;
                }
                j11 = Math.max(j11, P0);
            }
            return -1L;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.h
    public byte[] i0(long j11) {
        m0(j11);
        return this.f42697a.i0(j11);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f42698b;
    }

    public long j(i bytes, long j11) {
        kotlin.jvm.internal.s.g(bytes, "bytes");
        if (!(!this.f42698b)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long R = this.f42697a.R(bytes, j11);
            if (R != -1) {
                return R;
            }
            long P0 = this.f42697a.P0();
            if (this.f42699c.read(this.f42697a, (long) PKIFailureInfo.certRevoked) == -1) {
                return -1L;
            }
            j11 = Math.max(j11, (P0 - bytes.z()) + 1);
        }
    }

    @Override // okio.h
    public i j1() {
        this.f42697a.b0(this.f42699c);
        return this.f42697a.j1();
    }

    @Override // okio.h
    public long k0() {
        m0(8L);
        return this.f42697a.k0();
    }

    public long l(i targetBytes, long j11) {
        kotlin.jvm.internal.s.g(targetBytes, "targetBytes");
        if (!(!this.f42698b)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long n02 = this.f42697a.n0(targetBytes, j11);
            if (n02 != -1) {
                return n02;
            }
            long P0 = this.f42697a.P0();
            if (this.f42699c.read(this.f42697a, (long) PKIFailureInfo.certRevoked) == -1) {
                return -1L;
            }
            j11 = Math.max(j11, P0);
        }
    }

    public boolean m(long j11, i bytes, int i11, int i12) {
        int i13;
        kotlin.jvm.internal.s.g(bytes, "bytes");
        if (!this.f42698b) {
            if (j11 >= 0 && i11 >= 0 && i12 >= 0 && bytes.z() - i11 >= i12) {
                for (i13 = 0; i13 < i12; i13 = i13 + 1) {
                    long j12 = i13 + j11;
                    i13 = (request(1 + j12) && this.f42697a.J(j12) == bytes.g(i11 + i13)) ? i13 + 1 : 0;
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // okio.h
    public void m0(long j11) {
        if (!request(j11)) {
            throw new EOFException();
        }
    }

    public short p() {
        m0(2L);
        return this.f42697a.D0();
    }

    @Override // okio.h
    public h peek() {
        return r.d(new w(this));
    }

    @Override // okio.h
    public int r1() {
        m0(4L);
        return this.f42697a.r1();
    }

    @Override // okio.e0
    public long read(f sink, long j11) {
        kotlin.jvm.internal.s.g(sink, "sink");
        if (j11 >= 0) {
            if (!this.f42698b) {
                if (this.f42697a.P0() == 0 && this.f42699c.read(this.f42697a, (long) PKIFailureInfo.certRevoked) == -1) {
                    return -1L;
                }
                return this.f42697a.read(sink, Math.min(j11, this.f42697a.P0()));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
    }

    @Override // okio.h
    public byte readByte() {
        m0(1L);
        return this.f42697a.readByte();
    }

    @Override // okio.h
    public void readFully(byte[] sink) {
        kotlin.jvm.internal.s.g(sink, "sink");
        try {
            m0(sink.length);
            this.f42697a.readFully(sink);
        } catch (EOFException e11) {
            int i11 = 0;
            while (this.f42697a.P0() > 0) {
                f fVar = this.f42697a;
                int read = fVar.read(sink, i11, (int) fVar.P0());
                if (read == -1) {
                    throw new AssertionError();
                }
                i11 += read;
            }
            throw e11;
        }
    }

    @Override // okio.h
    public int readInt() {
        m0(4L);
        return this.f42697a.readInt();
    }

    @Override // okio.h
    public long readLong() {
        m0(8L);
        return this.f42697a.readLong();
    }

    @Override // okio.h
    public short readShort() {
        m0(2L);
        return this.f42697a.readShort();
    }

    @Override // okio.h
    public boolean request(long j11) {
        if (j11 >= 0) {
            if (!this.f42698b) {
                while (this.f42697a.P0() < j11) {
                    if (this.f42699c.read(this.f42697a, (long) PKIFailureInfo.certRevoked) == -1) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
    }

    @Override // okio.h
    public void skip(long j11) {
        if (!(!this.f42698b)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j11 > 0) {
            if (this.f42697a.P0() == 0 && this.f42699c.read(this.f42697a, (long) PKIFailureInfo.certRevoked) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j11, this.f42697a.P0());
            this.f42697a.skip(min);
            j11 -= min;
        }
    }

    @Override // okio.h
    public f t() {
        return this.f42697a;
    }

    @Override // okio.e0
    public f0 timeout() {
        return this.f42699c.timeout();
    }

    public String toString() {
        return "buffer(" + this.f42699c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // okio.h
    public String w0(long j11) {
        m0(j11);
        return this.f42697a.w0(j11);
    }

    @Override // okio.h
    public i z0(long j11) {
        m0(j11);
        return this.f42697a.z0(j11);
    }

    /* loaded from: classes5.dex */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            y yVar = y.this;
            if (!yVar.f42698b) {
                return (int) Math.min(yVar.f42697a.P0(), Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            y.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            y yVar = y.this;
            if (!yVar.f42698b) {
                if (yVar.f42697a.P0() == 0) {
                    y yVar2 = y.this;
                    if (yVar2.f42699c.read(yVar2.f42697a, (long) PKIFailureInfo.certRevoked) == -1) {
                        return -1;
                    }
                }
                return y.this.f42697a.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return y.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i11, int i12) {
            kotlin.jvm.internal.s.g(data, "data");
            if (!y.this.f42698b) {
                c.b(data.length, i11, i12);
                if (y.this.f42697a.P0() == 0) {
                    y yVar = y.this;
                    if (yVar.f42699c.read(yVar.f42697a, (long) PKIFailureInfo.certRevoked) == -1) {
                        return -1;
                    }
                }
                return y.this.f42697a.read(data, i11, i12);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.s.g(sink, "sink");
        if (this.f42697a.P0() == 0 && this.f42699c.read(this.f42697a, (long) PKIFailureInfo.certRevoked) == -1) {
            return -1;
        }
        return this.f42697a.read(sink);
    }
}