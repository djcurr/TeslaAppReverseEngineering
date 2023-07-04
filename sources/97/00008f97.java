package okio;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Objects;
import okhttp3.internal.connection.RealConnection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: a */
    public z f42645a;

    /* renamed from: b */
    private long f42646b;

    /* loaded from: classes5.dex */
    public static final class a implements Closeable {

        /* renamed from: a */
        public f f42647a;

        /* renamed from: b */
        public boolean f42648b;

        /* renamed from: c */
        private z f42649c;

        /* renamed from: e */
        public byte[] f42651e;

        /* renamed from: d */
        public long f42650d = -1;

        /* renamed from: f */
        public int f42652f = -1;

        /* renamed from: g */
        public int f42653g = -1;

        public final z a() {
            return this.f42649c;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f42647a != null) {
                this.f42647a = null;
                m(null);
                this.f42650d = -1L;
                this.f42651e = null;
                this.f42652f = -1;
                this.f42653g = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final int g() {
            long j11 = this.f42650d;
            f fVar = this.f42647a;
            kotlin.jvm.internal.s.e(fVar);
            if (j11 != fVar.P0()) {
                long j12 = this.f42650d;
                return l(j12 == -1 ? 0L : j12 + (this.f42653g - this.f42652f));
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        public final long j(long j11) {
            f fVar = this.f42647a;
            if (fVar != null) {
                if (this.f42648b) {
                    long P0 = fVar.P0();
                    int i11 = (j11 > P0 ? 1 : (j11 == P0 ? 0 : -1));
                    int i12 = 1;
                    if (i11 <= 0) {
                        if (j11 >= 0) {
                            long j12 = P0 - j11;
                            while (true) {
                                if (j12 <= 0) {
                                    break;
                                }
                                z zVar = fVar.f42645a;
                                kotlin.jvm.internal.s.e(zVar);
                                z zVar2 = zVar.f42707g;
                                kotlin.jvm.internal.s.e(zVar2);
                                int i13 = zVar2.f42703c;
                                long j13 = i13 - zVar2.f42702b;
                                if (j13 <= j12) {
                                    fVar.f42645a = zVar2.b();
                                    a0.b(zVar2);
                                    j12 -= j13;
                                } else {
                                    zVar2.f42703c = i13 - ((int) j12);
                                    break;
                                }
                            }
                            m(null);
                            this.f42650d = j11;
                            this.f42651e = null;
                            this.f42652f = -1;
                            this.f42653g = -1;
                        } else {
                            throw new IllegalArgumentException(("newSize < 0: " + j11).toString());
                        }
                    } else if (i11 > 0) {
                        long j14 = j11 - P0;
                        boolean z11 = true;
                        while (j14 > 0) {
                            z S0 = fVar.S0(i12);
                            int min = (int) Math.min(j14, 8192 - S0.f42703c);
                            S0.f42703c += min;
                            j14 -= min;
                            if (z11) {
                                m(S0);
                                this.f42650d = P0;
                                this.f42651e = S0.f42701a;
                                int i14 = S0.f42703c;
                                this.f42652f = i14 - min;
                                this.f42653g = i14;
                                z11 = false;
                            }
                            i12 = 1;
                        }
                    }
                    fVar.J0(j11);
                    return P0;
                }
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final int l(long j11) {
            z zVar;
            f fVar = this.f42647a;
            if (fVar != null) {
                if (j11 >= -1 && j11 <= fVar.P0()) {
                    if (j11 != -1 && j11 != fVar.P0()) {
                        long j12 = 0;
                        long P0 = fVar.P0();
                        z zVar2 = fVar.f42645a;
                        if (a() != null) {
                            long j13 = this.f42650d;
                            int i11 = this.f42652f;
                            z a11 = a();
                            kotlin.jvm.internal.s.e(a11);
                            long j14 = j13 - (i11 - a11.f42702b);
                            if (j14 > j11) {
                                zVar2 = a();
                                P0 = j14;
                                zVar = zVar2;
                            } else {
                                zVar = a();
                                j12 = j14;
                            }
                        } else {
                            zVar = zVar2;
                        }
                        if (P0 - j11 > j11 - j12) {
                            while (true) {
                                kotlin.jvm.internal.s.e(zVar);
                                int i12 = zVar.f42703c;
                                int i13 = zVar.f42702b;
                                if (j11 < (i12 - i13) + j12) {
                                    break;
                                }
                                j12 += i12 - i13;
                                zVar = zVar.f42706f;
                            }
                        } else {
                            while (P0 > j11) {
                                kotlin.jvm.internal.s.e(zVar2);
                                zVar2 = zVar2.f42707g;
                                kotlin.jvm.internal.s.e(zVar2);
                                P0 -= zVar2.f42703c - zVar2.f42702b;
                            }
                            j12 = P0;
                            zVar = zVar2;
                        }
                        if (this.f42648b) {
                            kotlin.jvm.internal.s.e(zVar);
                            if (zVar.f42704d) {
                                z f11 = zVar.f();
                                if (fVar.f42645a == zVar) {
                                    fVar.f42645a = f11;
                                }
                                zVar = zVar.c(f11);
                                z zVar3 = zVar.f42707g;
                                kotlin.jvm.internal.s.e(zVar3);
                                zVar3.b();
                            }
                        }
                        m(zVar);
                        this.f42650d = j11;
                        kotlin.jvm.internal.s.e(zVar);
                        this.f42651e = zVar.f42701a;
                        int i14 = zVar.f42702b + ((int) (j11 - j12));
                        this.f42652f = i14;
                        int i15 = zVar.f42703c;
                        this.f42653g = i15;
                        return i15 - i14;
                    }
                    m(null);
                    this.f42650d = j11;
                    this.f42651e = null;
                    this.f42652f = -1;
                    this.f42653g = -1;
                    return -1;
                }
                throw new ArrayIndexOutOfBoundsException("offset=" + j11 + " > size=" + fVar.P0());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final void m(z zVar) {
            this.f42649c = zVar;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends OutputStream {
        c() {
            f.this = r1;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return f.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
            f.this.O0(i11);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i11, int i12) {
            kotlin.jvm.internal.s.g(data, "data");
            f.this.o(data, i11, i12);
        }
    }

    public static /* synthetic */ a u0(f fVar, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = new a();
        }
        return fVar.t0(aVar);
    }

    @Override // okio.h
    public long B(i bytes) {
        kotlin.jvm.internal.s.g(bytes, "bytes");
        return R(bytes, 0L);
    }

    @Override // okio.g
    /* renamed from: C */
    public f I() {
        return this;
    }

    @Override // okio.h
    public long C1(c0 sink) {
        kotlin.jvm.internal.s.g(sink, "sink");
        long P0 = P0();
        if (P0 > 0) {
            sink.write(this, P0);
        }
        return P0;
    }

    public short D0() {
        return okio.c.e(readShort());
    }

    public f D1(long j11) {
        z S0 = S0(8);
        byte[] bArr = S0.f42701a;
        int i11 = S0.f42703c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((j11 >>> 56) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((j11 >>> 48) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((j11 >>> 40) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((j11 >>> 32) & 255);
        int i16 = i15 + 1;
        bArr[i15] = (byte) ((j11 >>> 24) & 255);
        int i17 = i16 + 1;
        bArr[i16] = (byte) ((j11 >>> 16) & 255);
        int i18 = i17 + 1;
        bArr[i17] = (byte) ((j11 >>> 8) & 255);
        bArr[i18] = (byte) (j11 & 255);
        S0.f42703c = i18 + 1;
        J0(P0() + 8);
        return this;
    }

    public String F0(long j11, Charset charset) {
        kotlin.jvm.internal.s.g(charset, "charset");
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i11 >= 0 && j11 <= ((long) Integer.MAX_VALUE)) {
            if (this.f42646b >= j11) {
                if (i11 == 0) {
                    return "";
                }
                z zVar = this.f42645a;
                kotlin.jvm.internal.s.e(zVar);
                int i12 = zVar.f42702b;
                if (i12 + j11 > zVar.f42703c) {
                    return new String(i0(j11), charset);
                }
                int i13 = (int) j11;
                String str = new String(zVar.f42701a, i12, i13, charset);
                int i14 = zVar.f42702b + i13;
                zVar.f42702b = i14;
                this.f42646b -= j11;
                if (i14 == zVar.f42703c) {
                    this.f42645a = zVar.b();
                    a0.b(zVar);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j11).toString());
    }

    @Override // okio.g
    /* renamed from: F1 */
    public f z(long j11) {
        return D1(okio.c.d(j11));
    }

    @Override // okio.h
    public void G(f sink, long j11) {
        kotlin.jvm.internal.s.g(sink, "sink");
        if (P0() >= j11) {
            sink.write(this, j11);
        } else {
            sink.write(this, P0());
            throw new EOFException();
        }
    }

    public String G0() {
        return F0(this.f42646b, kotlin.text.d.f35187b);
    }

    @Override // okio.g
    public OutputStream G1() {
        return new c();
    }

    @Override // okio.h
    public long H(i targetBytes) {
        kotlin.jvm.internal.s.g(targetBytes, "targetBytes");
        return n0(targetBytes, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ae A[EDGE_INSN: B:90:0x00ae->B:85:0x00ae ?: BREAK  , SYNTHETIC] */
    @Override // okio.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long H1() {
        /*
            r14 = this;
            long r0 = r14.P0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb8
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            okio.z r6 = r14.f42645a
            kotlin.jvm.internal.s.e(r6)
            byte[] r7 = r6.f42701a
            int r8 = r6.f42702b
            int r9 = r6.f42703c
        L18:
            if (r8 >= r9) goto L9a
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L43
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L38
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L38
        L33:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L43
        L38:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7b
            goto L33
        L43:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L53
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L53:
            okio.f r0 = new okio.f
            r0.<init>()
            okio.f r0 = r0.i1(r4)
            okio.f r0 = r0.O0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.G0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L7b:
            if (r0 == 0) goto L7f
            r1 = 1
            goto L9a
        L7f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = okio.c.f(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9a:
            if (r8 != r9) goto La6
            okio.z r7 = r6.b()
            r14.f42645a = r7
            okio.a0.b(r6)
            goto La8
        La6:
            r6.f42702b = r8
        La8:
            if (r1 != 0) goto Lae
            okio.z r6 = r14.f42645a
            if (r6 != 0) goto Ld
        Lae:
            long r1 = r14.P0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.J0(r1)
            return r4
        Lb8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.f.H1():long");
    }

    public int I0() {
        int i11;
        int i12;
        int i13;
        if (P0() != 0) {
            byte J = J(0L);
            if ((J & 128) == 0) {
                i11 = J & Byte.MAX_VALUE;
                i13 = 0;
                i12 = 1;
            } else if ((J & 224) == 192) {
                i11 = J & 31;
                i12 = 2;
                i13 = 128;
            } else if ((J & 240) == 224) {
                i11 = J & 15;
                i12 = 3;
                i13 = 2048;
            } else if ((J & 248) != 240) {
                skip(1L);
                return 65533;
            } else {
                i11 = J & 7;
                i12 = 4;
                i13 = 65536;
            }
            long j11 = i12;
            if (P0() >= j11) {
                for (int i14 = 1; i14 < i12; i14++) {
                    long j12 = i14;
                    byte J2 = J(j12);
                    if ((J2 & 192) != 128) {
                        skip(j12);
                        return 65533;
                    }
                    i11 = (i11 << 6) | (J2 & 63);
                }
                skip(j11);
                if (i11 > 1114111) {
                    return 65533;
                }
                if ((55296 <= i11 && 57343 >= i11) || i11 < i13) {
                    return 65533;
                }
                return i11;
            }
            throw new EOFException("size < " + i12 + ": " + P0() + " (to read code point prefixed 0x" + okio.c.f(J) + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        throw new EOFException();
    }

    @Override // okio.h
    public InputStream I1() {
        return new b();
    }

    public final byte J(long j11) {
        okio.c.b(P0(), j11, 1L);
        z zVar = this.f42645a;
        if (zVar != null) {
            if (P0() - j11 < j11) {
                long P0 = P0();
                while (P0 > j11) {
                    zVar = zVar.f42707g;
                    kotlin.jvm.internal.s.e(zVar);
                    P0 -= zVar.f42703c - zVar.f42702b;
                }
                kotlin.jvm.internal.s.e(zVar);
                return zVar.f42701a[(int) ((zVar.f42702b + j11) - P0)];
            }
            long j12 = 0;
            while (true) {
                long j13 = (zVar.f42703c - zVar.f42702b) + j12;
                if (j13 > j11) {
                    kotlin.jvm.internal.s.e(zVar);
                    return zVar.f42701a[(int) ((zVar.f42702b + j11) - j12)];
                }
                zVar = zVar.f42706f;
                kotlin.jvm.internal.s.e(zVar);
                j12 = j13;
            }
        } else {
            kotlin.jvm.internal.s.e(null);
            throw null;
        }
    }

    public final void J0(long j11) {
        this.f42646b = j11;
    }

    @Override // okio.h
    public int J1(u options) {
        kotlin.jvm.internal.s.g(options, "options");
        int f11 = q30.a.f(this, options, false, 2, null);
        if (f11 == -1) {
            return -1;
        }
        skip(options.f()[f11].z());
        return f11;
    }

    @Override // okio.h
    public String K(long j11) {
        if (j11 >= 0) {
            long j12 = j11 != Long.MAX_VALUE ? j11 + 1 : Long.MAX_VALUE;
            byte b11 = (byte) 10;
            long L = L(b11, 0L, j12);
            if (L != -1) {
                return q30.a.d(this, L);
            }
            if (j12 < P0() && J(j12 - 1) == ((byte) 13) && J(j12) == b11) {
                return q30.a.d(this, j12);
            }
            f fVar = new f();
            m(fVar, 0L, Math.min(32, P0()));
            throw new EOFException("\\n not found: limit=" + Math.min(P0(), j11) + " content=" + fVar.j1().n() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j11).toString());
    }

    @Override // okio.h
    public byte[] K0() {
        return i0(P0());
    }

    @Override // okio.g
    /* renamed from: K1 */
    public f E0(int i11) {
        z S0 = S0(2);
        byte[] bArr = S0.f42701a;
        int i12 = S0.f42703c;
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i11 >>> 8) & 255);
        bArr[i13] = (byte) (i11 & 255);
        S0.f42703c = i13 + 1;
        J0(P0() + 2);
        return this;
    }

    public long L(byte b11, long j11, long j12) {
        z zVar;
        int i11;
        long j13 = 0;
        if (0 <= j11 && j12 >= j11) {
            if (j12 > P0()) {
                j12 = P0();
            }
            if (j11 == j12 || (zVar = this.f42645a) == null) {
                return -1L;
            }
            if (P0() - j11 < j11) {
                j13 = P0();
                while (j13 > j11) {
                    zVar = zVar.f42707g;
                    kotlin.jvm.internal.s.e(zVar);
                    j13 -= zVar.f42703c - zVar.f42702b;
                }
                while (j13 < j12) {
                    byte[] bArr = zVar.f42701a;
                    int min = (int) Math.min(zVar.f42703c, (zVar.f42702b + j12) - j13);
                    i11 = (int) ((zVar.f42702b + j11) - j13);
                    while (i11 < min) {
                        if (bArr[i11] != b11) {
                            i11++;
                        }
                    }
                    j13 += zVar.f42703c - zVar.f42702b;
                    zVar = zVar.f42706f;
                    kotlin.jvm.internal.s.e(zVar);
                    j11 = j13;
                }
                return -1L;
            }
            while (true) {
                long j14 = (zVar.f42703c - zVar.f42702b) + j13;
                if (j14 > j11) {
                    break;
                }
                zVar = zVar.f42706f;
                kotlin.jvm.internal.s.e(zVar);
                j13 = j14;
            }
            while (j13 < j12) {
                byte[] bArr2 = zVar.f42701a;
                int min2 = (int) Math.min(zVar.f42703c, (zVar.f42702b + j12) - j13);
                i11 = (int) ((zVar.f42702b + j11) - j13);
                while (i11 < min2) {
                    if (bArr2[i11] != b11) {
                        i11++;
                    }
                }
                j13 += zVar.f42703c - zVar.f42702b;
                zVar = zVar.f42706f;
                kotlin.jvm.internal.s.e(zVar);
                j11 = j13;
            }
            return -1L;
            return (i11 - zVar.f42702b) + j13;
        }
        throw new IllegalArgumentException(("size=" + P0() + " fromIndex=" + j11 + " toIndex=" + j12).toString());
    }

    public f L1(String string, int i11, int i12, Charset charset) {
        kotlin.jvm.internal.s.g(string, "string");
        kotlin.jvm.internal.s.g(charset, "charset");
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i11).toString());
        }
        if (i12 >= i11) {
            if (i12 <= string.length()) {
                if (kotlin.jvm.internal.s.c(charset, kotlin.text.d.f35187b)) {
                    return Z(string, i11, i12);
                }
                String substring = string.substring(i11, i12);
                kotlin.jvm.internal.s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                byte[] bytes = substring.getBytes(charset);
                kotlin.jvm.internal.s.f(bytes, "(this as java.lang.String).getBytes(charset)");
                return o(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException(("endIndex > string.length: " + i12 + " > " + string.length()).toString());
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i12 + " < " + i11).toString());
    }

    public f M1(String string, Charset charset) {
        kotlin.jvm.internal.s.g(string, "string");
        kotlin.jvm.internal.s.g(charset, "charset");
        return L1(string, 0, string.length(), charset);
    }

    @Override // okio.h
    public boolean N0() {
        return this.f42646b == 0;
    }

    public final f N1(OutputStream out, long j11) {
        kotlin.jvm.internal.s.g(out, "out");
        okio.c.b(this.f42646b, 0L, j11);
        z zVar = this.f42645a;
        while (j11 > 0) {
            kotlin.jvm.internal.s.e(zVar);
            int min = (int) Math.min(j11, zVar.f42703c - zVar.f42702b);
            out.write(zVar.f42701a, zVar.f42702b, min);
            int i11 = zVar.f42702b + min;
            zVar.f42702b = i11;
            long j12 = min;
            this.f42646b -= j12;
            j11 -= j12;
            if (i11 == zVar.f42703c) {
                z b11 = zVar.b();
                this.f42645a = b11;
                a0.b(zVar);
                zVar = b11;
            }
        }
        return this;
    }

    @Override // okio.g
    /* renamed from: O1 */
    public f T(String string) {
        kotlin.jvm.internal.s.g(string, "string");
        return Z(string, 0, string.length());
    }

    public final long P0() {
        return this.f42646b;
    }

    @Override // okio.g
    /* renamed from: P1 */
    public f Z(String string, int i11, int i12) {
        kotlin.jvm.internal.s.g(string, "string");
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i11).toString());
        }
        if (i12 >= i11) {
            if (!(i12 <= string.length())) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i12 + " > " + string.length()).toString());
            }
            while (i11 < i12) {
                char charAt = string.charAt(i11);
                if (charAt < 128) {
                    z S0 = S0(1);
                    byte[] bArr = S0.f42701a;
                    int i13 = S0.f42703c - i11;
                    int min = Math.min(i12, 8192 - i13);
                    int i14 = i11 + 1;
                    bArr[i11 + i13] = (byte) charAt;
                    while (i14 < min) {
                        char charAt2 = string.charAt(i14);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i14 + i13] = (byte) charAt2;
                        i14++;
                    }
                    int i15 = S0.f42703c;
                    int i16 = (i13 + i14) - i15;
                    S0.f42703c = i15 + i16;
                    J0(P0() + i16);
                    i11 = i14;
                } else {
                    if (charAt < 2048) {
                        z S02 = S0(2);
                        byte[] bArr2 = S02.f42701a;
                        int i17 = S02.f42703c;
                        bArr2[i17] = (byte) ((charAt >> 6) | 192);
                        bArr2[i17 + 1] = (byte) ((charAt & '?') | 128);
                        S02.f42703c = i17 + 2;
                        J0(P0() + 2);
                    } else if (charAt >= 55296 && charAt <= 57343) {
                        int i18 = i11 + 1;
                        char charAt3 = i18 < i12 ? string.charAt(i18) : (char) 0;
                        if (charAt <= 56319 && 56320 <= charAt3 && 57343 >= charAt3) {
                            int i19 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 65536;
                            z S03 = S0(4);
                            byte[] bArr3 = S03.f42701a;
                            int i21 = S03.f42703c;
                            bArr3[i21] = (byte) ((i19 >> 18) | 240);
                            bArr3[i21 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                            bArr3[i21 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                            bArr3[i21 + 3] = (byte) ((i19 & 63) | 128);
                            S03.f42703c = i21 + 4;
                            J0(P0() + 4);
                            i11 += 2;
                        } else {
                            O0(63);
                            i11 = i18;
                        }
                    } else {
                        z S04 = S0(3);
                        byte[] bArr4 = S04.f42701a;
                        int i22 = S04.f42703c;
                        bArr4[i22] = (byte) ((charAt >> '\f') | 224);
                        bArr4[i22 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                        bArr4[i22 + 2] = (byte) ((charAt & '?') | 128);
                        S04.f42703c = i22 + 3;
                        J0(P0() + 3);
                    }
                    i11++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i12 + " < " + i11).toString());
    }

    public final i Q0() {
        if (P0() <= ((long) Integer.MAX_VALUE)) {
            return R0((int) P0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + P0()).toString());
    }

    public f Q1(int i11) {
        if (i11 < 128) {
            O0(i11);
        } else if (i11 < 2048) {
            z S0 = S0(2);
            byte[] bArr = S0.f42701a;
            int i12 = S0.f42703c;
            bArr[i12] = (byte) ((i11 >> 6) | 192);
            bArr[i12 + 1] = (byte) ((i11 & 63) | 128);
            S0.f42703c = i12 + 2;
            J0(P0() + 2);
        } else if (55296 <= i11 && 57343 >= i11) {
            O0(63);
        } else if (i11 < 65536) {
            z S02 = S0(3);
            byte[] bArr2 = S02.f42701a;
            int i13 = S02.f42703c;
            bArr2[i13] = (byte) ((i11 >> 12) | 224);
            bArr2[i13 + 1] = (byte) (((i11 >> 6) & 63) | 128);
            bArr2[i13 + 2] = (byte) ((i11 & 63) | 128);
            S02.f42703c = i13 + 3;
            J0(P0() + 3);
        } else if (i11 <= 1114111) {
            z S03 = S0(4);
            byte[] bArr3 = S03.f42701a;
            int i14 = S03.f42703c;
            bArr3[i14] = (byte) ((i11 >> 18) | 240);
            bArr3[i14 + 1] = (byte) (((i11 >> 12) & 63) | 128);
            bArr3[i14 + 2] = (byte) (((i11 >> 6) & 63) | 128);
            bArr3[i14 + 3] = (byte) ((i11 & 63) | 128);
            S03.f42703c = i14 + 4;
            J0(P0() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + okio.c.g(i11));
        }
        return this;
    }

    public long R(i bytes, long j11) {
        long j12 = j11;
        kotlin.jvm.internal.s.g(bytes, "bytes");
        if (bytes.z() > 0) {
            long j13 = 0;
            if (j12 >= 0) {
                z zVar = this.f42645a;
                if (zVar != null) {
                    if (P0() - j12 < j12) {
                        long P0 = P0();
                        while (P0 > j12) {
                            zVar = zVar.f42707g;
                            kotlin.jvm.internal.s.e(zVar);
                            P0 -= zVar.f42703c - zVar.f42702b;
                        }
                        byte[] o11 = bytes.o();
                        byte b11 = o11[0];
                        int z11 = bytes.z();
                        long P02 = (P0() - z11) + 1;
                        while (P0 < P02) {
                            byte[] bArr = zVar.f42701a;
                            long j14 = P0;
                            int min = (int) Math.min(zVar.f42703c, (zVar.f42702b + P02) - P0);
                            for (int i11 = (int) ((zVar.f42702b + j12) - j14); i11 < min; i11++) {
                                if (bArr[i11] == b11 && q30.a.c(zVar, i11 + 1, o11, 1, z11)) {
                                    return (i11 - zVar.f42702b) + j14;
                                }
                            }
                            P0 = j14 + (zVar.f42703c - zVar.f42702b);
                            zVar = zVar.f42706f;
                            kotlin.jvm.internal.s.e(zVar);
                            j12 = P0;
                        }
                    } else {
                        while (true) {
                            long j15 = (zVar.f42703c - zVar.f42702b) + j13;
                            if (j15 > j12) {
                                break;
                            }
                            zVar = zVar.f42706f;
                            kotlin.jvm.internal.s.e(zVar);
                            j13 = j15;
                        }
                        byte[] o12 = bytes.o();
                        byte b12 = o12[0];
                        int z12 = bytes.z();
                        long P03 = (P0() - z12) + 1;
                        while (j13 < P03) {
                            byte[] bArr2 = zVar.f42701a;
                            long j16 = P03;
                            int min2 = (int) Math.min(zVar.f42703c, (zVar.f42702b + P03) - j13);
                            for (int i12 = (int) ((zVar.f42702b + j12) - j13); i12 < min2; i12++) {
                                if (bArr2[i12] == b12 && q30.a.c(zVar, i12 + 1, o12, 1, z12)) {
                                    return (i12 - zVar.f42702b) + j13;
                                }
                            }
                            j13 += zVar.f42703c - zVar.f42702b;
                            zVar = zVar.f42706f;
                            kotlin.jvm.internal.s.e(zVar);
                            j12 = j13;
                            P03 = j16;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j12).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public final i R0(int i11) {
        if (i11 == 0) {
            return i.f42656d;
        }
        okio.c.b(P0(), 0L, i11);
        z zVar = this.f42645a;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            kotlin.jvm.internal.s.e(zVar);
            int i15 = zVar.f42703c;
            int i16 = zVar.f42702b;
            if (i15 != i16) {
                i13 += i15 - i16;
                i14++;
                zVar = zVar.f42706f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i14];
        int[] iArr = new int[i14 * 2];
        z zVar2 = this.f42645a;
        int i17 = 0;
        while (i12 < i11) {
            kotlin.jvm.internal.s.e(zVar2);
            bArr[i17] = zVar2.f42701a;
            i12 += zVar2.f42703c - zVar2.f42702b;
            iArr[i17] = Math.min(i12, i11);
            iArr[i17 + i14] = zVar2.f42702b;
            zVar2.f42704d = true;
            i17++;
            zVar2 = zVar2.f42706f;
        }
        return new b0(bArr, iArr);
    }

    public final z S0(int i11) {
        boolean z11 = true;
        if ((i11 < 1 || i11 > 8192) ? false : false) {
            z zVar = this.f42645a;
            if (zVar == null) {
                z c11 = a0.c();
                this.f42645a = c11;
                c11.f42707g = c11;
                c11.f42706f = c11;
                return c11;
            }
            kotlin.jvm.internal.s.e(zVar);
            z zVar2 = zVar.f42707g;
            kotlin.jvm.internal.s.e(zVar2);
            return (zVar2.f42703c + i11 > 8192 || !zVar2.f42705e) ? zVar2.c(a0.c()) : zVar2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00c1 A[EDGE_INSN: B:109:0x00c1->B:100:0x00c1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00bd  */
    @Override // okio.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long T0() {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.f.T0():long");
    }

    @Override // okio.h
    public boolean V(long j11, i bytes) {
        kotlin.jvm.internal.s.g(bytes, "bytes");
        return p0(j11, bytes, 0, bytes.z());
    }

    @Override // okio.g
    /* renamed from: X0 */
    public f w1(i byteString) {
        kotlin.jvm.internal.s.g(byteString, "byteString");
        byteString.G(this, 0, byteString.z());
        return this;
    }

    public f Z0(e0 source, long j11) {
        kotlin.jvm.internal.s.g(source, "source");
        while (j11 > 0) {
            long read = source.read(this, j11);
            if (read == -1) {
                throw new EOFException();
            }
            j11 -= read;
        }
        return this;
    }

    public final void a() {
        skip(P0());
    }

    @Override // okio.h, okio.g
    public f b() {
        return this;
    }

    @Override // okio.g
    public long b0(e0 source) {
        kotlin.jvm.internal.s.g(source, "source");
        long j11 = 0;
        while (true) {
            long read = source.read(this, (long) PKIFailureInfo.certRevoked);
            if (read == -1) {
                return j11;
            }
            j11 += read;
        }
    }

    @Override // okio.g
    /* renamed from: b1 */
    public f j0(byte[] source) {
        kotlin.jvm.internal.s.g(source, "source");
        return o(source, 0, source.length);
    }

    @Override // okio.h
    public String c1(Charset charset) {
        kotlin.jvm.internal.s.g(charset, "charset");
        return F0(this.f42646b, charset);
    }

    @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (P0() != fVar.P0()) {
                return false;
            }
            if (P0() != 0) {
                z zVar = this.f42645a;
                kotlin.jvm.internal.s.e(zVar);
                z zVar2 = fVar.f42645a;
                kotlin.jvm.internal.s.e(zVar2);
                int i11 = zVar.f42702b;
                int i12 = zVar2.f42702b;
                long j11 = 0;
                while (j11 < P0()) {
                    long min = Math.min(zVar.f42703c - i11, zVar2.f42703c - i12);
                    long j12 = 0;
                    while (j12 < min) {
                        int i13 = i11 + 1;
                        int i14 = i12 + 1;
                        if (zVar.f42701a[i11] != zVar2.f42701a[i12]) {
                            return false;
                        }
                        j12++;
                        i11 = i13;
                        i12 = i14;
                    }
                    if (i11 == zVar.f42703c) {
                        zVar = zVar.f42706f;
                        kotlin.jvm.internal.s.e(zVar);
                        i11 = zVar.f42702b;
                    }
                    if (i12 == zVar2.f42703c) {
                        zVar2 = zVar2.f42706f;
                        kotlin.jvm.internal.s.e(zVar2);
                        i12 = zVar2.f42702b;
                    }
                    j11 += min;
                }
            }
        }
        return true;
    }

    @Override // okio.h
    public String f0() {
        return K(Long.MAX_VALUE);
    }

    @Override // okio.g, okio.c0, java.io.Flushable
    public void flush() {
    }

    /* renamed from: g */
    public f clone() {
        return l();
    }

    @Override // okio.g
    /* renamed from: h1 */
    public f o(byte[] source, int i11, int i12) {
        kotlin.jvm.internal.s.g(source, "source");
        long j11 = i12;
        okio.c.b(source.length, i11, j11);
        int i13 = i12 + i11;
        while (i11 < i13) {
            z S0 = S0(1);
            int min = Math.min(i13 - i11, 8192 - S0.f42703c);
            int i14 = i11 + min;
            wz.o.f(source, S0.f42701a, S0.f42703c, i11, i14);
            S0.f42703c += min;
            i11 = i14;
        }
        J0(P0() + j11);
        return this;
    }

    public int hashCode() {
        z zVar = this.f42645a;
        if (zVar != null) {
            int i11 = 1;
            do {
                int i12 = zVar.f42703c;
                for (int i13 = zVar.f42702b; i13 < i12; i13++) {
                    i11 = (i11 * 31) + zVar.f42701a[i13];
                }
                zVar = zVar.f42706f;
                kotlin.jvm.internal.s.e(zVar);
            } while (zVar != this.f42645a);
            return i11;
        }
        return 0;
    }

    @Override // okio.h
    public byte[] i0(long j11) {
        if (j11 >= 0 && j11 <= ((long) Integer.MAX_VALUE)) {
            if (P0() >= j11) {
                byte[] bArr = new byte[(int) j11];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j11).toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final long j() {
        long P0 = P0();
        if (P0 == 0) {
            return 0L;
        }
        z zVar = this.f42645a;
        kotlin.jvm.internal.s.e(zVar);
        z zVar2 = zVar.f42707g;
        kotlin.jvm.internal.s.e(zVar2);
        int i11 = zVar2.f42703c;
        if (i11 < 8192 && zVar2.f42705e) {
            P0 -= i11 - zVar2.f42702b;
        }
        return P0;
    }

    @Override // okio.h
    public i j1() {
        return z0(P0());
    }

    @Override // okio.h
    public long k0() {
        return okio.c.d(readLong());
    }

    public final f l() {
        f fVar = new f();
        if (P0() != 0) {
            z zVar = this.f42645a;
            kotlin.jvm.internal.s.e(zVar);
            z d11 = zVar.d();
            fVar.f42645a = d11;
            d11.f42707g = d11;
            d11.f42706f = d11;
            for (z zVar2 = zVar.f42706f; zVar2 != zVar; zVar2 = zVar2.f42706f) {
                z zVar3 = d11.f42707g;
                kotlin.jvm.internal.s.e(zVar3);
                kotlin.jvm.internal.s.e(zVar2);
                zVar3.c(zVar2.d());
            }
            fVar.J0(P0());
        }
        return fVar;
    }

    public final f m(f out, long j11, long j12) {
        kotlin.jvm.internal.s.g(out, "out");
        okio.c.b(P0(), j11, j12);
        if (j12 != 0) {
            out.J0(out.P0() + j12);
            z zVar = this.f42645a;
            while (true) {
                kotlin.jvm.internal.s.e(zVar);
                int i11 = zVar.f42703c;
                int i12 = zVar.f42702b;
                if (j11 < i11 - i12) {
                    break;
                }
                j11 -= i11 - i12;
                zVar = zVar.f42706f;
            }
            while (j12 > 0) {
                kotlin.jvm.internal.s.e(zVar);
                z d11 = zVar.d();
                int i13 = d11.f42702b + ((int) j11);
                d11.f42702b = i13;
                d11.f42703c = Math.min(i13 + ((int) j12), d11.f42703c);
                z zVar2 = out.f42645a;
                if (zVar2 == null) {
                    d11.f42707g = d11;
                    d11.f42706f = d11;
                    out.f42645a = d11;
                } else {
                    kotlin.jvm.internal.s.e(zVar2);
                    z zVar3 = zVar2.f42707g;
                    kotlin.jvm.internal.s.e(zVar3);
                    zVar3.c(d11);
                }
                j12 -= d11.f42703c - d11.f42702b;
                zVar = zVar.f42706f;
                j11 = 0;
            }
        }
        return this;
    }

    @Override // okio.h
    public void m0(long j11) {
        if (this.f42646b < j11) {
            throw new EOFException();
        }
    }

    public long n0(i targetBytes, long j11) {
        int i11;
        int i12;
        kotlin.jvm.internal.s.g(targetBytes, "targetBytes");
        long j12 = 0;
        if (j11 >= 0) {
            z zVar = this.f42645a;
            if (zVar != null) {
                if (P0() - j11 < j11) {
                    j12 = P0();
                    while (j12 > j11) {
                        zVar = zVar.f42707g;
                        kotlin.jvm.internal.s.e(zVar);
                        j12 -= zVar.f42703c - zVar.f42702b;
                    }
                    if (targetBytes.z() == 2) {
                        byte g11 = targetBytes.g(0);
                        byte g12 = targetBytes.g(1);
                        while (j12 < P0()) {
                            byte[] bArr = zVar.f42701a;
                            i11 = (int) ((zVar.f42702b + j11) - j12);
                            int i13 = zVar.f42703c;
                            while (i11 < i13) {
                                byte b11 = bArr[i11];
                                if (b11 != g11 && b11 != g12) {
                                    i11++;
                                }
                                i12 = zVar.f42702b;
                            }
                            j12 += zVar.f42703c - zVar.f42702b;
                            zVar = zVar.f42706f;
                            kotlin.jvm.internal.s.e(zVar);
                            j11 = j12;
                        }
                        return -1L;
                    }
                    byte[] o11 = targetBytes.o();
                    while (j12 < P0()) {
                        byte[] bArr2 = zVar.f42701a;
                        i11 = (int) ((zVar.f42702b + j11) - j12);
                        int i14 = zVar.f42703c;
                        while (i11 < i14) {
                            byte b12 = bArr2[i11];
                            for (byte b13 : o11) {
                                if (b12 == b13) {
                                    i12 = zVar.f42702b;
                                }
                            }
                            i11++;
                        }
                        j12 += zVar.f42703c - zVar.f42702b;
                        zVar = zVar.f42706f;
                        kotlin.jvm.internal.s.e(zVar);
                        j11 = j12;
                    }
                    return -1L;
                }
                while (true) {
                    long j13 = (zVar.f42703c - zVar.f42702b) + j12;
                    if (j13 > j11) {
                        break;
                    }
                    zVar = zVar.f42706f;
                    kotlin.jvm.internal.s.e(zVar);
                    j12 = j13;
                }
                if (targetBytes.z() == 2) {
                    byte g13 = targetBytes.g(0);
                    byte g14 = targetBytes.g(1);
                    while (j12 < P0()) {
                        byte[] bArr3 = zVar.f42701a;
                        i11 = (int) ((zVar.f42702b + j11) - j12);
                        int i15 = zVar.f42703c;
                        while (i11 < i15) {
                            byte b14 = bArr3[i11];
                            if (b14 != g13 && b14 != g14) {
                                i11++;
                            }
                            i12 = zVar.f42702b;
                        }
                        j12 += zVar.f42703c - zVar.f42702b;
                        zVar = zVar.f42706f;
                        kotlin.jvm.internal.s.e(zVar);
                        j11 = j12;
                    }
                    return -1L;
                }
                byte[] o12 = targetBytes.o();
                while (j12 < P0()) {
                    byte[] bArr4 = zVar.f42701a;
                    i11 = (int) ((zVar.f42702b + j11) - j12);
                    int i16 = zVar.f42703c;
                    while (i11 < i16) {
                        byte b15 = bArr4[i11];
                        for (byte b16 : o12) {
                            if (b15 == b16) {
                                i12 = zVar.f42702b;
                            }
                        }
                        i11++;
                    }
                    j12 += zVar.f42703c - zVar.f42702b;
                    zVar = zVar.f42706f;
                    kotlin.jvm.internal.s.e(zVar);
                    j11 = j12;
                }
                return -1L;
                return (i11 - i12) + j12;
            }
            return -1L;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
    }

    @Override // okio.g
    /* renamed from: p */
    public f v() {
        return this;
    }

    public boolean p0(long j11, i bytes, int i11, int i12) {
        kotlin.jvm.internal.s.g(bytes, "bytes");
        if (j11 < 0 || i11 < 0 || i12 < 0 || P0() - j11 < i12 || bytes.z() - i11 < i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (J(i13 + j11) != bytes.g(i11 + i13)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.g
    /* renamed from: p1 */
    public f O0(int i11) {
        z S0 = S0(1);
        byte[] bArr = S0.f42701a;
        int i12 = S0.f42703c;
        S0.f42703c = i12 + 1;
        bArr[i12] = (byte) i11;
        J0(P0() + 1);
        return this;
    }

    @Override // okio.h
    public h peek() {
        return r.d(new w(this));
    }

    @Override // okio.h
    public int r1() {
        return okio.c.c(readInt());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.s.g(sink, "sink");
        z zVar = this.f42645a;
        if (zVar != null) {
            int min = Math.min(sink.remaining(), zVar.f42703c - zVar.f42702b);
            sink.put(zVar.f42701a, zVar.f42702b, min);
            int i11 = zVar.f42702b + min;
            zVar.f42702b = i11;
            this.f42646b -= min;
            if (i11 == zVar.f42703c) {
                this.f42645a = zVar.b();
                a0.b(zVar);
            }
            return min;
        }
        return -1;
    }

    @Override // okio.h
    public byte readByte() {
        if (P0() != 0) {
            z zVar = this.f42645a;
            kotlin.jvm.internal.s.e(zVar);
            int i11 = zVar.f42702b;
            int i12 = zVar.f42703c;
            int i13 = i11 + 1;
            byte b11 = zVar.f42701a[i11];
            J0(P0() - 1);
            if (i13 == i12) {
                this.f42645a = zVar.b();
                a0.b(zVar);
            } else {
                zVar.f42702b = i13;
            }
            return b11;
        }
        throw new EOFException();
    }

    @Override // okio.h
    public void readFully(byte[] sink) {
        kotlin.jvm.internal.s.g(sink, "sink");
        int i11 = 0;
        while (i11 < sink.length) {
            int read = read(sink, i11, sink.length - i11);
            if (read == -1) {
                throw new EOFException();
            }
            i11 += read;
        }
    }

    @Override // okio.h
    public int readInt() {
        if (P0() >= 4) {
            z zVar = this.f42645a;
            kotlin.jvm.internal.s.e(zVar);
            int i11 = zVar.f42702b;
            int i12 = zVar.f42703c;
            if (i12 - i11 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = zVar.f42701a;
            int i13 = i11 + 1;
            int i14 = i13 + 1;
            int i15 = ((bArr[i11] & 255) << 24) | ((bArr[i13] & 255) << 16);
            int i16 = i14 + 1;
            int i17 = i15 | ((bArr[i14] & 255) << 8);
            int i18 = i16 + 1;
            int i19 = i17 | (bArr[i16] & 255);
            J0(P0() - 4);
            if (i18 == i12) {
                this.f42645a = zVar.b();
                a0.b(zVar);
            } else {
                zVar.f42702b = i18;
            }
            return i19;
        }
        throw new EOFException();
    }

    @Override // okio.h
    public long readLong() {
        if (P0() >= 8) {
            z zVar = this.f42645a;
            kotlin.jvm.internal.s.e(zVar);
            int i11 = zVar.f42702b;
            int i12 = zVar.f42703c;
            if (i12 - i11 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = zVar.f42701a;
            int i13 = i11 + 1;
            int i14 = i13 + 1;
            int i15 = i14 + 1;
            int i16 = i15 + 1;
            int i17 = i16 + 1;
            int i18 = i17 + 1;
            long j11 = ((bArr[i11] & 255) << 56) | ((bArr[i13] & 255) << 48) | ((bArr[i14] & 255) << 40) | ((bArr[i15] & 255) << 32) | ((bArr[i16] & 255) << 24) | ((bArr[i17] & 255) << 16);
            int i19 = i18 + 1;
            int i21 = i19 + 1;
            long j12 = j11 | ((bArr[i18] & 255) << 8) | (bArr[i19] & 255);
            J0(P0() - 8);
            if (i21 == i12) {
                this.f42645a = zVar.b();
                a0.b(zVar);
            } else {
                zVar.f42702b = i21;
            }
            return j12;
        }
        throw new EOFException();
    }

    @Override // okio.h
    public short readShort() {
        if (P0() >= 2) {
            z zVar = this.f42645a;
            kotlin.jvm.internal.s.e(zVar);
            int i11 = zVar.f42702b;
            int i12 = zVar.f42703c;
            if (i12 - i11 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = zVar.f42701a;
            int i13 = i11 + 1;
            int i14 = i13 + 1;
            int i15 = ((bArr[i11] & 255) << 8) | (bArr[i13] & 255);
            J0(P0() - 2);
            if (i14 == i12) {
                this.f42645a = zVar.b();
                a0.b(zVar);
            } else {
                zVar.f42702b = i14;
            }
            return (short) i15;
        }
        throw new EOFException();
    }

    @Override // okio.h
    public boolean request(long j11) {
        return this.f42646b >= j11;
    }

    @Override // okio.h
    public void skip(long j11) {
        while (j11 > 0) {
            z zVar = this.f42645a;
            if (zVar != null) {
                int min = (int) Math.min(j11, zVar.f42703c - zVar.f42702b);
                long j12 = min;
                J0(P0() - j12);
                j11 -= j12;
                int i11 = zVar.f42702b + min;
                zVar.f42702b = i11;
                if (i11 == zVar.f42703c) {
                    this.f42645a = zVar.b();
                    a0.b(zVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // okio.h
    public f t() {
        return this;
    }

    public final a t0(a unsafeCursor) {
        kotlin.jvm.internal.s.g(unsafeCursor, "unsafeCursor");
        return q30.a.a(this, unsafeCursor);
    }

    @Override // okio.g
    /* renamed from: t1 */
    public f q0(long j11) {
        int i11;
        int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i12 == 0) {
            return O0(48);
        }
        boolean z11 = false;
        int i13 = 1;
        if (i12 < 0) {
            j11 = -j11;
            if (j11 < 0) {
                return T("-9223372036854775808");
            }
            z11 = true;
        }
        if (j11 < 100000000) {
            if (j11 >= AbstractComponentTracker.LINGERING_TIMEOUT) {
                i11 = j11 < 1000000 ? j11 < 100000 ? 5 : 6 : j11 < 10000000 ? 7 : 8;
            } else if (j11 >= 100) {
                i11 = j11 < 1000 ? 3 : 4;
            } else if (j11 >= 10) {
                i13 = 2;
            }
            i13 = i11;
        } else if (j11 < 1000000000000L) {
            if (j11 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i13 = j11 < 1000000000 ? 9 : 10;
            } else {
                i11 = j11 < 100000000000L ? 11 : 12;
                i13 = i11;
            }
        } else if (j11 >= 1000000000000000L) {
            i13 = j11 < 100000000000000000L ? j11 < 10000000000000000L ? 16 : 17 : j11 < 1000000000000000000L ? 18 : 19;
        } else if (j11 < 10000000000000L) {
            i13 = 13;
        } else {
            i11 = j11 < 100000000000000L ? 14 : 15;
            i13 = i11;
        }
        if (z11) {
            i13++;
        }
        z S0 = S0(i13);
        byte[] bArr = S0.f42701a;
        int i14 = S0.f42703c + i13;
        while (j11 != 0) {
            long j12 = 10;
            i14--;
            bArr[i14] = q30.a.b()[(int) (j11 % j12)];
            j11 /= j12;
        }
        if (z11) {
            bArr[i14 - 1] = (byte) 45;
        }
        S0.f42703c += i13;
        J0(P0() + i13);
        return this;
    }

    @Override // okio.e0
    public f0 timeout() {
        return f0.NONE;
    }

    public String toString() {
        return Q0().toString();
    }

    @Override // okio.g
    /* renamed from: v1 */
    public f i1(long j11) {
        if (j11 == 0) {
            return O0(48);
        }
        long j12 = (j11 >>> 1) | j11;
        long j13 = j12 | (j12 >>> 2);
        long j14 = j13 | (j13 >>> 4);
        long j15 = j14 | (j14 >>> 8);
        long j16 = j15 | (j15 >>> 16);
        long j17 = j16 | (j16 >>> 32);
        long j18 = j17 - ((j17 >>> 1) & 6148914691236517205L);
        long j19 = ((j18 >>> 2) & 3689348814741910323L) + (j18 & 3689348814741910323L);
        long j21 = ((j19 >>> 4) + j19) & 1085102592571150095L;
        long j22 = j21 + (j21 >>> 8);
        long j23 = j22 + (j22 >>> 16);
        int i11 = (int) ((((j23 & 63) + ((j23 >>> 32) & 63)) + 3) / 4);
        z S0 = S0(i11);
        byte[] bArr = S0.f42701a;
        int i12 = S0.f42703c;
        for (int i13 = (i12 + i11) - 1; i13 >= i12; i13--) {
            bArr[i13] = q30.a.b()[(int) (15 & j11)];
            j11 >>>= 4;
        }
        S0.f42703c += i11;
        J0(P0() + i11);
        return this;
    }

    @Override // okio.h
    public String w0(long j11) {
        return F0(j11, kotlin.text.d.f35187b);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        kotlin.jvm.internal.s.g(source, "source");
        int remaining = source.remaining();
        int i11 = remaining;
        while (i11 > 0) {
            z S0 = S0(1);
            int min = Math.min(i11, 8192 - S0.f42703c);
            source.get(S0.f42701a, S0.f42703c, min);
            i11 -= min;
            S0.f42703c += min;
        }
        this.f42646b += remaining;
        return remaining;
    }

    @Override // okio.g
    /* renamed from: y1 */
    public f x(int i11) {
        z S0 = S0(4);
        byte[] bArr = S0.f42701a;
        int i12 = S0.f42703c;
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i11 >>> 24) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i11 >>> 16) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((i11 >>> 8) & 255);
        bArr[i15] = (byte) (i11 & 255);
        S0.f42703c = i15 + 1;
        J0(P0() + 4);
        return this;
    }

    @Override // okio.h
    public i z0(long j11) {
        if (j11 >= 0 && j11 <= ((long) Integer.MAX_VALUE)) {
            if (P0() >= j11) {
                if (j11 >= 4096) {
                    i R0 = R0((int) j11);
                    skip(j11);
                    return R0;
                }
                return new i(i0(j11));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j11).toString());
    }

    @Override // okio.g
    /* renamed from: z1 */
    public f L0(int i11) {
        return x(okio.c.c(i11));
    }

    /* loaded from: classes5.dex */
    public static final class b extends InputStream {
        b() {
            f.this = r1;
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(f.this.P0(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (f.this.P0() > 0) {
                return f.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return f.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i11, int i12) {
            kotlin.jvm.internal.s.g(sink, "sink");
            return f.this.read(sink, i11, i12);
        }
    }

    @Override // okio.c0
    public void write(f source, long j11) {
        z zVar;
        z zVar2;
        kotlin.jvm.internal.s.g(source, "source");
        if (source != this) {
            okio.c.b(source.P0(), 0L, j11);
            while (j11 > 0) {
                z zVar3 = source.f42645a;
                kotlin.jvm.internal.s.e(zVar3);
                int i11 = zVar3.f42703c;
                kotlin.jvm.internal.s.e(source.f42645a);
                if (j11 < i11 - zVar.f42702b) {
                    z zVar4 = this.f42645a;
                    if (zVar4 != null) {
                        kotlin.jvm.internal.s.e(zVar4);
                        zVar2 = zVar4.f42707g;
                    } else {
                        zVar2 = null;
                    }
                    if (zVar2 != null && zVar2.f42705e) {
                        if ((zVar2.f42703c + j11) - (zVar2.f42704d ? 0 : zVar2.f42702b) <= ((long) PKIFailureInfo.certRevoked)) {
                            z zVar5 = source.f42645a;
                            kotlin.jvm.internal.s.e(zVar5);
                            zVar5.g(zVar2, (int) j11);
                            source.J0(source.P0() - j11);
                            J0(P0() + j11);
                            return;
                        }
                    }
                    z zVar6 = source.f42645a;
                    kotlin.jvm.internal.s.e(zVar6);
                    source.f42645a = zVar6.e((int) j11);
                }
                z zVar7 = source.f42645a;
                kotlin.jvm.internal.s.e(zVar7);
                long j12 = zVar7.f42703c - zVar7.f42702b;
                source.f42645a = zVar7.b();
                z zVar8 = this.f42645a;
                if (zVar8 == null) {
                    this.f42645a = zVar7;
                    zVar7.f42707g = zVar7;
                    zVar7.f42706f = zVar7;
                } else {
                    kotlin.jvm.internal.s.e(zVar8);
                    z zVar9 = zVar8.f42707g;
                    kotlin.jvm.internal.s.e(zVar9);
                    zVar9.c(zVar7).a();
                }
                source.J0(source.P0() - j12);
                J0(P0() + j12);
                j11 -= j12;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public int read(byte[] sink, int i11, int i12) {
        kotlin.jvm.internal.s.g(sink, "sink");
        okio.c.b(sink.length, i11, i12);
        z zVar = this.f42645a;
        if (zVar != null) {
            int min = Math.min(i12, zVar.f42703c - zVar.f42702b);
            byte[] bArr = zVar.f42701a;
            int i13 = zVar.f42702b;
            wz.o.f(bArr, sink, i11, i13, i13 + min);
            zVar.f42702b += min;
            J0(P0() - min);
            if (zVar.f42702b == zVar.f42703c) {
                this.f42645a = zVar.b();
                a0.b(zVar);
                return min;
            }
            return min;
        }
        return -1;
    }

    @Override // okio.e0
    public long read(f sink, long j11) {
        kotlin.jvm.internal.s.g(sink, "sink");
        if (j11 >= 0) {
            if (P0() == 0) {
                return -1L;
            }
            if (j11 > P0()) {
                j11 = P0();
            }
            sink.write(this, j11);
            return j11;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
    }
}