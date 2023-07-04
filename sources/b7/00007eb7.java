package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.o;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a */
    private final byte[] f34977a;

    /* renamed from: b */
    private final boolean f34978b;

    /* renamed from: c */
    private int f34979c;

    /* renamed from: d */
    private int f34980d;

    /* renamed from: e */
    private int f34981e;

    /* renamed from: f */
    private final InputStream f34982f;

    /* renamed from: g */
    private int f34983g;

    /* renamed from: h */
    private boolean f34984h;

    /* renamed from: i */
    private int f34985i;

    /* renamed from: j */
    private int f34986j;

    /* renamed from: k */
    private int f34987k;

    /* renamed from: l */
    private int f34988l;

    /* renamed from: m */
    private int f34989m;

    /* renamed from: n */
    private a f34990n;

    /* loaded from: classes5.dex */
    public interface a {
        void onRefill();
    }

    private e(InputStream inputStream) {
        this.f34984h = false;
        this.f34986j = Integer.MAX_VALUE;
        this.f34988l = 64;
        this.f34989m = 67108864;
        this.f34990n = null;
        this.f34977a = new byte[4096];
        this.f34979c = 0;
        this.f34981e = 0;
        this.f34985i = 0;
        this.f34982f = inputStream;
        this.f34978b = false;
    }

    public static int B(int i11, InputStream inputStream) {
        if ((i11 & 128) == 0) {
            return i11;
        }
        int i12 = i11 & 127;
        int i13 = 7;
        while (i13 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.k();
            }
            i12 |= (read & 127) << i13;
            if ((read & 128) == 0) {
                return i12;
            }
            i13 += 7;
        }
        while (i13 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.k();
            }
            if ((read2 & 128) == 0) {
                return i12;
            }
            i13 += 7;
        }
        throw InvalidProtocolBufferException.f();
    }

    private void N() {
        int i11 = this.f34979c + this.f34980d;
        this.f34979c = i11;
        int i12 = this.f34985i + i11;
        int i13 = this.f34986j;
        if (i12 > i13) {
            int i14 = i12 - i13;
            this.f34980d = i14;
            this.f34979c = i11 - i14;
            return;
        }
        this.f34980d = 0;
    }

    private void O(int i11) {
        if (!T(i11)) {
            throw InvalidProtocolBufferException.k();
        }
    }

    private void S(int i11) {
        if (i11 >= 0) {
            int i12 = this.f34985i;
            int i13 = this.f34981e;
            int i14 = i12 + i13 + i11;
            int i15 = this.f34986j;
            if (i14 <= i15) {
                int i16 = this.f34979c;
                int i17 = i16 - i13;
                this.f34981e = i16;
                O(1);
                while (true) {
                    int i18 = i11 - i17;
                    int i19 = this.f34979c;
                    if (i18 > i19) {
                        i17 += i19;
                        this.f34981e = i19;
                        O(1);
                    } else {
                        this.f34981e = i18;
                        return;
                    }
                }
            } else {
                R((i15 - i12) - i13);
                throw InvalidProtocolBufferException.k();
            }
        } else {
            throw InvalidProtocolBufferException.g();
        }
    }

    private boolean T(int i11) {
        int i12 = this.f34981e;
        if (i12 + i11 > this.f34979c) {
            if (this.f34985i + i12 + i11 > this.f34986j) {
                return false;
            }
            a aVar = this.f34990n;
            if (aVar != null) {
                aVar.onRefill();
            }
            if (this.f34982f != null) {
                int i13 = this.f34981e;
                if (i13 > 0) {
                    int i14 = this.f34979c;
                    if (i14 > i13) {
                        byte[] bArr = this.f34977a;
                        System.arraycopy(bArr, i13, bArr, 0, i14 - i13);
                    }
                    this.f34985i += i13;
                    this.f34979c -= i13;
                    this.f34981e = 0;
                }
                InputStream inputStream = this.f34982f;
                byte[] bArr2 = this.f34977a;
                int i15 = this.f34979c;
                int read = inputStream.read(bArr2, i15, bArr2.length - i15);
                if (read == 0 || read < -1 || read > this.f34977a.length) {
                    StringBuilder sb2 = new StringBuilder(102);
                    sb2.append("InputStream#read(byte[]) returned invalid result: ");
                    sb2.append(read);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                } else if (read > 0) {
                    this.f34979c += read;
                    if ((this.f34985i + i11) - this.f34989m <= 0) {
                        N();
                        if (this.f34979c >= i11) {
                            return true;
                        }
                        return T(i11);
                    }
                    throw InvalidProtocolBufferException.j();
                }
            }
            return false;
        }
        StringBuilder sb3 = new StringBuilder(77);
        sb3.append("refillBuffer() called when ");
        sb3.append(i11);
        sb3.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb3.toString());
    }

    public static int b(int i11) {
        return (-(i11 & 1)) ^ (i11 >>> 1);
    }

    public static long c(long j11) {
        return (-(j11 & 1)) ^ (j11 >>> 1);
    }

    private void d(int i11) {
        if (this.f34979c - this.f34981e < i11) {
            O(i11);
        }
    }

    public static e g(InputStream inputStream) {
        return new e(inputStream);
    }

    public static e h(n nVar) {
        e eVar = new e(nVar);
        try {
            eVar.j(nVar.size());
            return eVar;
        } catch (InvalidProtocolBufferException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    private byte[] x(int i11) {
        if (i11 <= 0) {
            if (i11 == 0) {
                return i.f35020a;
            }
            throw InvalidProtocolBufferException.g();
        }
        int i12 = this.f34985i;
        int i13 = this.f34981e;
        int i14 = i12 + i13 + i11;
        int i15 = this.f34986j;
        if (i14 > i15) {
            R((i15 - i12) - i13);
            throw InvalidProtocolBufferException.k();
        } else if (i11 < 4096) {
            byte[] bArr = new byte[i11];
            int i16 = this.f34979c - i13;
            System.arraycopy(this.f34977a, i13, bArr, 0, i16);
            this.f34981e = this.f34979c;
            int i17 = i11 - i16;
            d(i17);
            System.arraycopy(this.f34977a, 0, bArr, i16, i17);
            this.f34981e = i17;
            return bArr;
        } else {
            int i18 = this.f34979c;
            this.f34985i = i12 + i18;
            this.f34981e = 0;
            this.f34979c = 0;
            int i19 = i18 - i13;
            int i21 = i11 - i19;
            ArrayList<byte[]> arrayList = new ArrayList();
            while (i21 > 0) {
                int min = Math.min(i21, 4096);
                byte[] bArr2 = new byte[min];
                int i22 = 0;
                while (i22 < min) {
                    InputStream inputStream = this.f34982f;
                    int read = inputStream == null ? -1 : inputStream.read(bArr2, i22, min - i22);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.k();
                    }
                    this.f34985i += read;
                    i22 += read;
                }
                i21 -= min;
                arrayList.add(bArr2);
            }
            byte[] bArr3 = new byte[i11];
            System.arraycopy(this.f34977a, i13, bArr3, 0, i19);
            for (byte[] bArr4 : arrayList) {
                System.arraycopy(bArr4, 0, bArr3, i19, bArr4.length);
                i19 += bArr4.length;
            }
            return bArr3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x007a, code lost:
        if (r2[r3] < 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A() {
        /*
            r9 = this;
            int r0 = r9.f34981e
            int r1 = r9.f34979c
            if (r1 != r0) goto L8
            goto L7c
        L8:
            byte[] r2 = r9.f34977a
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L13
            r9.f34981e = r3
            return r0
        L13:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L19
            goto L7c
        L19:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2d
            r5 = -128(0xffffffffffffff80, double:NaN)
        L29:
            long r2 = r3 ^ r5
            int r0 = (int) r2
            goto L82
        L2d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L3f
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L3d:
            r1 = r3
            goto L82
        L3f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L4f
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L29
        L4f:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L82
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L82
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L82
        L7c:
            long r0 = r9.D()
            int r0 = (int) r0
            return r0
        L82:
            r9.f34981e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.e.A():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b6, code lost:
        if (r2[r0] < 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long C() {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.e.C():long");
    }

    long D() {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            byte w11 = w();
            j11 |= (w11 & Byte.MAX_VALUE) << i11;
            if ((w11 & 128) == 0) {
                return j11;
            }
        }
        throw InvalidProtocolBufferException.f();
    }

    public int E() {
        return y();
    }

    public long F() {
        return z();
    }

    public int G() {
        return b(A());
    }

    public long H() {
        return c(C());
    }

    public String I() {
        int A = A();
        int i11 = this.f34979c;
        int i12 = this.f34981e;
        if (A > i11 - i12 || A <= 0) {
            return A == 0 ? "" : new String(x(A), "UTF-8");
        }
        String str = new String(this.f34977a, i12, A, "UTF-8");
        this.f34981e += A;
        return str;
    }

    public String J() {
        byte[] x11;
        int A = A();
        int i11 = this.f34981e;
        if (A <= this.f34979c - i11 && A > 0) {
            x11 = this.f34977a;
            this.f34981e = i11 + A;
        } else if (A == 0) {
            return "";
        } else {
            x11 = x(A);
            i11 = 0;
        }
        if (v.f(x11, i11, i11 + A)) {
            return new String(x11, i11, A, "UTF-8");
        }
        throw InvalidProtocolBufferException.d();
    }

    public int K() {
        if (f()) {
            this.f34983g = 0;
            return 0;
        }
        int A = A();
        this.f34983g = A;
        if (w.a(A) != 0) {
            return this.f34983g;
        }
        throw InvalidProtocolBufferException.c();
    }

    public int L() {
        return A();
    }

    public long M() {
        return C();
    }

    public boolean P(int i11, CodedOutputStream codedOutputStream) {
        int b11 = w.b(i11);
        if (b11 == 0) {
            long t11 = t();
            codedOutputStream.o0(i11);
            codedOutputStream.z0(t11);
            return true;
        } else if (b11 == 1) {
            long z11 = z();
            codedOutputStream.o0(i11);
            codedOutputStream.V(z11);
            return true;
        } else if (b11 == 2) {
            d l11 = l();
            codedOutputStream.o0(i11);
            codedOutputStream.P(l11);
            return true;
        } else if (b11 == 3) {
            codedOutputStream.o0(i11);
            Q(codedOutputStream);
            int c11 = w.c(w.a(i11), 4);
            a(c11);
            codedOutputStream.o0(c11);
            return true;
        } else if (b11 != 4) {
            if (b11 == 5) {
                int y11 = y();
                codedOutputStream.o0(i11);
                codedOutputStream.U(y11);
                return true;
            }
            throw InvalidProtocolBufferException.e();
        } else {
            return false;
        }
    }

    public void Q(CodedOutputStream codedOutputStream) {
        int K;
        do {
            K = K();
            if (K == 0) {
                return;
            }
        } while (P(K, codedOutputStream));
    }

    public void R(int i11) {
        int i12 = this.f34979c;
        int i13 = this.f34981e;
        if (i11 <= i12 - i13 && i11 >= 0) {
            this.f34981e = i13 + i11;
        } else {
            S(i11);
        }
    }

    public void a(int i11) {
        if (this.f34983g != i11) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public int e() {
        int i11 = this.f34986j;
        if (i11 == Integer.MAX_VALUE) {
            return -1;
        }
        return i11 - (this.f34985i + this.f34981e);
    }

    public boolean f() {
        return this.f34981e == this.f34979c && !T(1);
    }

    public void i(int i11) {
        this.f34986j = i11;
        N();
    }

    public int j(int i11) {
        if (i11 >= 0) {
            int i12 = i11 + this.f34985i + this.f34981e;
            int i13 = this.f34986j;
            if (i12 <= i13) {
                this.f34986j = i12;
                N();
                return i13;
            }
            throw InvalidProtocolBufferException.k();
        }
        throw InvalidProtocolBufferException.g();
    }

    public boolean k() {
        return C() != 0;
    }

    public d l() {
        int A = A();
        int i11 = this.f34979c;
        int i12 = this.f34981e;
        if (A > i11 - i12 || A <= 0) {
            if (A == 0) {
                return d.f34970a;
            }
            return new n(x(A));
        }
        d cVar = (this.f34978b && this.f34984h) ? new c(this.f34977a, this.f34981e, A) : d.f(this.f34977a, i12, A);
        this.f34981e += A;
        return cVar;
    }

    public double m() {
        return Double.longBitsToDouble(z());
    }

    public int n() {
        return A();
    }

    public int o() {
        return y();
    }

    public long p() {
        return z();
    }

    public float q() {
        return Float.intBitsToFloat(y());
    }

    public void r(int i11, o.a aVar, f fVar) {
        int i12 = this.f34987k;
        if (i12 < this.f34988l) {
            this.f34987k = i12 + 1;
            aVar.D(this, fVar);
            a(w.c(i11, 4));
            this.f34987k--;
            return;
        }
        throw InvalidProtocolBufferException.h();
    }

    public int s() {
        return A();
    }

    public long t() {
        return C();
    }

    public <T extends o> T u(q<T> qVar, f fVar) {
        int A = A();
        if (this.f34987k < this.f34988l) {
            int j11 = j(A);
            this.f34987k++;
            T c11 = qVar.c(this, fVar);
            a(0);
            this.f34987k--;
            i(j11);
            return c11;
        }
        throw InvalidProtocolBufferException.h();
    }

    public void v(o.a aVar, f fVar) {
        int A = A();
        if (this.f34987k < this.f34988l) {
            int j11 = j(A);
            this.f34987k++;
            aVar.D(this, fVar);
            a(0);
            this.f34987k--;
            i(j11);
            return;
        }
        throw InvalidProtocolBufferException.h();
    }

    public byte w() {
        if (this.f34981e == this.f34979c) {
            O(1);
        }
        byte[] bArr = this.f34977a;
        int i11 = this.f34981e;
        this.f34981e = i11 + 1;
        return bArr[i11];
    }

    public int y() {
        int i11 = this.f34981e;
        if (this.f34979c - i11 < 4) {
            O(4);
            i11 = this.f34981e;
        }
        byte[] bArr = this.f34977a;
        this.f34981e = i11 + 4;
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public long z() {
        int i11 = this.f34981e;
        if (this.f34979c - i11 < 8) {
            O(8);
            i11 = this.f34981e;
        }
        byte[] bArr = this.f34977a;
        this.f34981e = i11 + 8;
        return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
    }

    private e(n nVar) {
        this.f34984h = false;
        this.f34986j = Integer.MAX_VALUE;
        this.f34988l = 64;
        this.f34989m = 67108864;
        this.f34990n = null;
        this.f34977a = nVar.f35030b;
        int B = nVar.B();
        this.f34981e = B;
        this.f34979c = B + nVar.size();
        this.f34985i = -this.f34981e;
        this.f34982f = null;
        this.f34978b = true;
    }
}