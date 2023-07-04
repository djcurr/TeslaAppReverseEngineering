package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a */
    int f16313a;

    /* renamed from: b */
    int f16314b;

    /* renamed from: c */
    k f16315c;

    /* loaded from: classes3.dex */
    public static final class b extends j {

        /* renamed from: d */
        private final byte[] f16316d;

        /* renamed from: e */
        private final boolean f16317e;

        /* renamed from: f */
        private int f16318f;

        /* renamed from: g */
        private int f16319g;

        /* renamed from: h */
        private int f16320h;

        /* renamed from: i */
        private int f16321i;

        /* renamed from: j */
        private int f16322j;

        /* renamed from: k */
        private boolean f16323k;

        /* renamed from: l */
        private int f16324l;

        private void K() {
            int i11 = this.f16318f + this.f16319g;
            this.f16318f = i11;
            int i12 = i11 - this.f16321i;
            int i13 = this.f16324l;
            if (i12 > i13) {
                int i14 = i12 - i13;
                this.f16319g = i14;
                this.f16318f = i11 - i14;
                return;
            }
            this.f16319g = 0;
        }

        private void N() {
            if (this.f16318f - this.f16320h >= 10) {
                O();
            } else {
                P();
            }
        }

        private void O() {
            for (int i11 = 0; i11 < 10; i11++) {
                byte[] bArr = this.f16316d;
                int i12 = this.f16320h;
                this.f16320h = i12 + 1;
                if (bArr[i12] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void P() {
            for (int i11 = 0; i11 < 10; i11++) {
                if (D() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int A() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public long B() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public boolean C(int i11) {
            int b11 = r1.b(i11);
            if (b11 == 0) {
                N();
                return true;
            } else if (b11 == 1) {
                M(8);
                return true;
            } else if (b11 == 2) {
                M(H());
                return true;
            } else if (b11 == 3) {
                L();
                a(r1.c(r1.a(i11), 4));
                return true;
            } else if (b11 != 4) {
                if (b11 == 5) {
                    M(4);
                    return true;
                }
                throw InvalidProtocolBufferException.d();
            } else {
                return false;
            }
        }

        public byte D() {
            int i11 = this.f16320h;
            if (i11 != this.f16318f) {
                byte[] bArr = this.f16316d;
                this.f16320h = i11 + 1;
                return bArr[i11];
            }
            throw InvalidProtocolBufferException.j();
        }

        public byte[] E(int i11) {
            if (i11 > 0) {
                int i12 = this.f16318f;
                int i13 = this.f16320h;
                if (i11 <= i12 - i13) {
                    int i14 = i11 + i13;
                    this.f16320h = i14;
                    return Arrays.copyOfRange(this.f16316d, i13, i14);
                }
            }
            if (i11 <= 0) {
                if (i11 == 0) {
                    return a0.f16231b;
                }
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.j();
        }

        public int F() {
            int i11 = this.f16320h;
            if (this.f16318f - i11 >= 4) {
                byte[] bArr = this.f16316d;
                this.f16320h = i11 + 4;
                return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.j();
        }

        public long G() {
            int i11 = this.f16320h;
            if (this.f16318f - i11 >= 8) {
                byte[] bArr = this.f16316d;
                this.f16320h = i11 + 8;
                return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
            }
            throw InvalidProtocolBufferException.j();
        }

        /* JADX WARN: Code restructure failed: missing block: B:71:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int H() {
            /*
                r5 = this;
                int r0 = r5.f16320h
                int r1 = r5.f16318f
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f16316d
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f16320h = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.J()
                int r0 = (int) r0
                return r0
            L70:
                r5.f16320h = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.j.b.H():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:85:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long I() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.j.b.I():long");
        }

        long J() {
            long j11 = 0;
            for (int i11 = 0; i11 < 64; i11 += 7) {
                byte D = D();
                j11 |= (D & Byte.MAX_VALUE) << i11;
                if ((D & 128) == 0) {
                    return j11;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public void L() {
            int z11;
            do {
                z11 = z();
                if (z11 == 0) {
                    return;
                }
            } while (C(z11));
        }

        public void M(int i11) {
            if (i11 >= 0) {
                int i12 = this.f16318f;
                int i13 = this.f16320h;
                if (i11 <= i12 - i13) {
                    this.f16320h = i13 + i11;
                    return;
                }
            }
            if (i11 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.j();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public void a(int i11) {
            if (this.f16322j != i11) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int d() {
            return this.f16320h - this.f16321i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public boolean e() {
            return this.f16320h == this.f16318f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public void i(int i11) {
            this.f16324l = i11;
            K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int j(int i11) {
            if (i11 >= 0) {
                int d11 = i11 + d();
                int i12 = this.f16324l;
                if (d11 <= i12) {
                    this.f16324l = d11;
                    K();
                    return i12;
                }
                throw InvalidProtocolBufferException.j();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public boolean k() {
            return I() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public i l() {
            i h11;
            int H = H();
            if (H > 0) {
                int i11 = this.f16318f;
                int i12 = this.f16320h;
                if (H <= i11 - i12) {
                    if (this.f16317e && this.f16323k) {
                        h11 = i.A(this.f16316d, i12, H);
                    } else {
                        h11 = i.h(this.f16316d, i12, H);
                    }
                    this.f16320h += H;
                    return h11;
                }
            }
            if (H == 0) {
                return i.f16278b;
            }
            return i.z(E(H));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public double m() {
            return Double.longBitsToDouble(G());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int n() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int o() {
            return F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public long p() {
            return G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public float q() {
            return Float.intBitsToFloat(F());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int r() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public long s() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int t() {
            return F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public long u() {
            return G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int v() {
            return j.b(H());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public long w() {
            return j.c(I());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public String x() {
            int H = H();
            if (H > 0) {
                int i11 = this.f16318f;
                int i12 = this.f16320h;
                if (H <= i11 - i12) {
                    String str = new String(this.f16316d, i12, H, a0.f16230a);
                    this.f16320h += H;
                    return str;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.j();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public String y() {
            int H = H();
            if (H > 0) {
                int i11 = this.f16318f;
                int i12 = this.f16320h;
                if (H <= i11 - i12) {
                    String e11 = q1.e(this.f16316d, i12, H);
                    this.f16320h += H;
                    return e11;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.j();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j
        public int z() {
            if (e()) {
                this.f16322j = 0;
                return 0;
            }
            int H = H();
            this.f16322j = H;
            if (r1.a(H) != 0) {
                return this.f16322j;
            }
            throw InvalidProtocolBufferException.b();
        }

        private b(byte[] bArr, int i11, int i12, boolean z11) {
            super();
            this.f16324l = Integer.MAX_VALUE;
            this.f16316d = bArr;
            this.f16318f = i12 + i11;
            this.f16320h = i11;
            this.f16321i = i11;
            this.f16317e = z11;
        }
    }

    public static int b(int i11) {
        return (-(i11 & 1)) ^ (i11 >>> 1);
    }

    public static long c(long j11) {
        return (-(j11 & 1)) ^ (j11 >>> 1);
    }

    public static j f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static j g(byte[] bArr, int i11, int i12) {
        return h(bArr, i11, i12, false);
    }

    public static j h(byte[] bArr, int i11, int i12, boolean z11) {
        b bVar = new b(bArr, i11, i12, z11);
        try {
            bVar.j(i12);
            return bVar;
        } catch (InvalidProtocolBufferException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i11);

    public abstract void a(int i11);

    public abstract int d();

    public abstract boolean e();

    public abstract void i(int i11);

    public abstract int j(int i11);

    public abstract boolean k();

    public abstract i l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();

    private j() {
        this.f16314b = 100;
    }
}