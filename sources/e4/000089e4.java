package n60;

import java.math.BigInteger;
import java.util.Random;

/* loaded from: classes5.dex */
public abstract class f implements n60.d {

    /* loaded from: classes5.dex */
    public static abstract class a extends f {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [n60.f] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r4v3, types: [n60.f] */
        public f u() {
            int f11 = f();
            if ((f11 & 1) != 0) {
                int i11 = (f11 + 1) >>> 1;
                int a11 = 31 - r70.f.a(i11);
                f fVar = this;
                int i12 = 1;
                while (a11 > 0) {
                    fVar = fVar.q(i12 << 1).a(fVar);
                    a11--;
                    i12 = i11 >>> a11;
                    if ((i12 & 1) != 0) {
                        fVar = fVar.q(2).a(this);
                    }
                }
                return fVar;
            }
            throw new IllegalStateException("Half-trace only defined for odd m");
        }

        public boolean v() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [n60.f] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r4v2, types: [n60.f] */
        public int w() {
            int f11 = f();
            int a11 = 31 - r70.f.a(f11);
            f fVar = this;
            int i11 = 1;
            while (a11 > 0) {
                fVar = fVar.q(i11).a(fVar);
                a11--;
                i11 = f11 >>> a11;
                if ((i11 & 1) != 0) {
                    fVar = fVar.o().a(this);
                }
            }
            if (fVar.i()) {
                return 0;
            }
            if (fVar.h()) {
                return 1;
            }
            throw new IllegalStateException("Internal error in trace calculation");
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class b extends f {
    }

    /* loaded from: classes5.dex */
    public static class c extends a {

        /* renamed from: g  reason: collision with root package name */
        private int f40620g;

        /* renamed from: h  reason: collision with root package name */
        private int f40621h;

        /* renamed from: i  reason: collision with root package name */
        private int[] f40622i;

        /* renamed from: j  reason: collision with root package name */
        o f40623j;

        public c(int i11, int i12, int i13, int i14, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i11) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i13 == 0 && i14 == 0) {
                this.f40620g = 2;
                this.f40622i = new int[]{i12};
            } else if (i13 >= i14) {
                throw new IllegalArgumentException("k2 must be smaller than k3");
            } else {
                if (i13 <= 0) {
                    throw new IllegalArgumentException("k2 must be larger than 0");
                }
                this.f40620g = 3;
                this.f40622i = new int[]{i12, i13, i14};
            }
            this.f40621h = i11;
            this.f40623j = new o(bigInteger);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(int i11, int[] iArr, o oVar) {
            this.f40621h = i11;
            this.f40620g = iArr.length == 1 ? 2 : 3;
            this.f40622i = iArr;
            this.f40623j = oVar;
        }

        @Override // n60.f
        public f a(f fVar) {
            o oVar = (o) this.f40623j.clone();
            oVar.f(((c) fVar).f40623j, 0);
            return new c(this.f40621h, this.f40622i, oVar);
        }

        @Override // n60.f
        public f b() {
            return new c(this.f40621h, this.f40622i, this.f40623j.d());
        }

        @Override // n60.f
        public int c() {
            return this.f40623j.k();
        }

        @Override // n60.f
        public f d(f fVar) {
            return j(fVar.g());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f40621h == cVar.f40621h && this.f40620g == cVar.f40620g && org.bouncycastle.util.a.e(this.f40622i, cVar.f40622i) && this.f40623j.equals(cVar.f40623j);
            }
            return false;
        }

        @Override // n60.f
        public int f() {
            return this.f40621h;
        }

        @Override // n60.f
        public f g() {
            int i11 = this.f40621h;
            int[] iArr = this.f40622i;
            return new c(i11, iArr, this.f40623j.u(i11, iArr));
        }

        @Override // n60.f
        public boolean h() {
            return this.f40623j.s();
        }

        public int hashCode() {
            return (this.f40623j.hashCode() ^ this.f40621h) ^ org.bouncycastle.util.a.I(this.f40622i);
        }

        @Override // n60.f
        public boolean i() {
            return this.f40623j.t();
        }

        @Override // n60.f
        public f j(f fVar) {
            int i11 = this.f40621h;
            int[] iArr = this.f40622i;
            return new c(i11, iArr, this.f40623j.v(((c) fVar).f40623j, i11, iArr));
        }

        @Override // n60.f
        public f k(f fVar, f fVar2, f fVar3) {
            return l(fVar, fVar2, fVar3);
        }

        @Override // n60.f
        public f l(f fVar, f fVar2, f fVar3) {
            o oVar = this.f40623j;
            o oVar2 = ((c) fVar).f40623j;
            o oVar3 = ((c) fVar2).f40623j;
            o oVar4 = ((c) fVar3).f40623j;
            o y11 = oVar.y(oVar2, this.f40621h, this.f40622i);
            o y12 = oVar3.y(oVar4, this.f40621h, this.f40622i);
            if (y11 == oVar || y11 == oVar2) {
                y11 = (o) y11.clone();
            }
            y11.f(y12, 0);
            y11.A(this.f40621h, this.f40622i);
            return new c(this.f40621h, this.f40622i, y11);
        }

        @Override // n60.f
        public f m() {
            return this;
        }

        @Override // n60.f
        public f n() {
            return (this.f40623j.t() || this.f40623j.s()) ? this : q(this.f40621h - 1);
        }

        @Override // n60.f
        public f o() {
            int i11 = this.f40621h;
            int[] iArr = this.f40622i;
            return new c(i11, iArr, this.f40623j.w(i11, iArr));
        }

        @Override // n60.f
        public f p(f fVar, f fVar2) {
            o oVar = this.f40623j;
            o oVar2 = ((c) fVar).f40623j;
            o oVar3 = ((c) fVar2).f40623j;
            o L = oVar.L(this.f40621h, this.f40622i);
            o y11 = oVar2.y(oVar3, this.f40621h, this.f40622i);
            if (L == oVar) {
                L = (o) L.clone();
            }
            L.f(y11, 0);
            L.A(this.f40621h, this.f40622i);
            return new c(this.f40621h, this.f40622i, L);
        }

        @Override // n60.f
        public f q(int i11) {
            if (i11 < 1) {
                return this;
            }
            int i12 = this.f40621h;
            int[] iArr = this.f40622i;
            return new c(i12, iArr, this.f40623j.x(i11, i12, iArr));
        }

        @Override // n60.f
        public f r(f fVar) {
            return a(fVar);
        }

        @Override // n60.f
        public boolean s() {
            return this.f40623j.O();
        }

        @Override // n60.f
        public BigInteger t() {
            return this.f40623j.P();
        }
    }

    /* loaded from: classes5.dex */
    public static class d extends b {

        /* renamed from: g  reason: collision with root package name */
        BigInteger f40624g;

        /* renamed from: h  reason: collision with root package name */
        BigInteger f40625h;

        /* renamed from: i  reason: collision with root package name */
        BigInteger f40626i;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.f40624g = bigInteger;
            this.f40625h = bigInteger2;
            this.f40626i = bigInteger3;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static BigInteger u(BigInteger bigInteger) {
            int bitLength = bigInteger.bitLength();
            if (bitLength < 96 || bigInteger.shiftRight(bitLength - 64).longValue() != -1) {
                return null;
            }
            return n60.d.f40585b.shiftLeft(bitLength).subtract(bigInteger);
        }

        private f v(f fVar) {
            if (fVar.o().equals(this)) {
                return fVar;
            }
            return null;
        }

        private BigInteger[] w(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int bitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigInteger4 = n60.d.f40585b;
            BigInteger bigInteger5 = bigInteger;
            BigInteger bigInteger6 = bigInteger4;
            BigInteger bigInteger7 = n60.d.f40586c;
            BigInteger bigInteger8 = bigInteger6;
            for (int i11 = bitLength - 1; i11 >= lowestSetBit + 1; i11--) {
                bigInteger4 = B(bigInteger4, bigInteger8);
                if (bigInteger3.testBit(i11)) {
                    bigInteger8 = B(bigInteger4, bigInteger2);
                    bigInteger6 = B(bigInteger6, bigInteger5);
                    bigInteger7 = C(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger5 = C(bigInteger5.multiply(bigInteger5).subtract(bigInteger8.shiftLeft(1)));
                } else {
                    BigInteger C = C(bigInteger6.multiply(bigInteger7).subtract(bigInteger4));
                    BigInteger C2 = C(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger7 = C(bigInteger7.multiply(bigInteger7).subtract(bigInteger4.shiftLeft(1)));
                    bigInteger5 = C2;
                    bigInteger6 = C;
                    bigInteger8 = bigInteger4;
                }
            }
            BigInteger B = B(bigInteger4, bigInteger8);
            BigInteger B2 = B(B, bigInteger2);
            BigInteger C3 = C(bigInteger6.multiply(bigInteger7).subtract(B));
            BigInteger C4 = C(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(B)));
            BigInteger B3 = B(B, B2);
            for (int i12 = 1; i12 <= lowestSetBit; i12++) {
                C3 = B(C3, C4);
                C4 = C(C4.multiply(C4).subtract(B3.shiftLeft(1)));
                B3 = B(B3, B3);
            }
            return new BigInteger[]{C3, C4};
        }

        protected BigInteger A(BigInteger bigInteger) {
            return r70.a.j(this.f40624g, bigInteger);
        }

        protected BigInteger B(BigInteger bigInteger, BigInteger bigInteger2) {
            return C(bigInteger.multiply(bigInteger2));
        }

        protected BigInteger C(BigInteger bigInteger) {
            if (this.f40625h != null) {
                boolean z11 = bigInteger.signum() < 0;
                if (z11) {
                    bigInteger = bigInteger.abs();
                }
                int bitLength = this.f40624g.bitLength();
                boolean equals = this.f40625h.equals(n60.d.f40585b);
                while (bigInteger.bitLength() > bitLength + 1) {
                    BigInteger shiftRight = bigInteger.shiftRight(bitLength);
                    BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
                    if (!equals) {
                        shiftRight = shiftRight.multiply(this.f40625h);
                    }
                    bigInteger = shiftRight.add(subtract);
                }
                while (bigInteger.compareTo(this.f40624g) >= 0) {
                    bigInteger = bigInteger.subtract(this.f40624g);
                }
                return (!z11 || bigInteger.signum() == 0) ? bigInteger : this.f40624g.subtract(bigInteger);
            }
            return bigInteger.mod(this.f40624g);
        }

        protected BigInteger D(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger subtract = bigInteger.subtract(bigInteger2);
            return subtract.signum() < 0 ? subtract.add(this.f40624g) : subtract;
        }

        @Override // n60.f
        public f a(f fVar) {
            return new d(this.f40624g, this.f40625h, x(this.f40626i, fVar.t()));
        }

        @Override // n60.f
        public f b() {
            BigInteger add = this.f40626i.add(n60.d.f40585b);
            if (add.compareTo(this.f40624g) == 0) {
                add = n60.d.f40584a;
            }
            return new d(this.f40624g, this.f40625h, add);
        }

        @Override // n60.f
        public f d(f fVar) {
            return new d(this.f40624g, this.f40625h, B(this.f40626i, A(fVar.t())));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f40624g.equals(dVar.f40624g) && this.f40626i.equals(dVar.f40626i);
            }
            return false;
        }

        @Override // n60.f
        public int f() {
            return this.f40624g.bitLength();
        }

        @Override // n60.f
        public f g() {
            return new d(this.f40624g, this.f40625h, A(this.f40626i));
        }

        public int hashCode() {
            return this.f40624g.hashCode() ^ this.f40626i.hashCode();
        }

        @Override // n60.f
        public f j(f fVar) {
            return new d(this.f40624g, this.f40625h, B(this.f40626i, fVar.t()));
        }

        @Override // n60.f
        public f k(f fVar, f fVar2, f fVar3) {
            BigInteger bigInteger = this.f40626i;
            BigInteger t11 = fVar.t();
            BigInteger t12 = fVar2.t();
            BigInteger t13 = fVar3.t();
            return new d(this.f40624g, this.f40625h, C(bigInteger.multiply(t11).subtract(t12.multiply(t13))));
        }

        @Override // n60.f
        public f l(f fVar, f fVar2, f fVar3) {
            BigInteger bigInteger = this.f40626i;
            BigInteger t11 = fVar.t();
            BigInteger t12 = fVar2.t();
            BigInteger t13 = fVar3.t();
            return new d(this.f40624g, this.f40625h, C(bigInteger.multiply(t11).add(t12.multiply(t13))));
        }

        @Override // n60.f
        public f m() {
            if (this.f40626i.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.f40624g;
            return new d(bigInteger, this.f40625h, bigInteger.subtract(this.f40626i));
        }

        @Override // n60.f
        public f n() {
            if (i() || h()) {
                return this;
            }
            if (!this.f40624g.testBit(0)) {
                throw new RuntimeException("not done yet");
            }
            if (this.f40624g.testBit(1)) {
                BigInteger add = this.f40624g.shiftRight(2).add(n60.d.f40585b);
                BigInteger bigInteger = this.f40624g;
                return v(new d(bigInteger, this.f40625h, this.f40626i.modPow(add, bigInteger)));
            } else if (this.f40624g.testBit(2)) {
                BigInteger modPow = this.f40626i.modPow(this.f40624g.shiftRight(3), this.f40624g);
                BigInteger B = B(modPow, this.f40626i);
                if (B(B, modPow).equals(n60.d.f40585b)) {
                    return v(new d(this.f40624g, this.f40625h, B));
                }
                return v(new d(this.f40624g, this.f40625h, B(B, n60.d.f40586c.modPow(this.f40624g.shiftRight(2), this.f40624g))));
            } else {
                BigInteger shiftRight = this.f40624g.shiftRight(1);
                BigInteger modPow2 = this.f40626i.modPow(shiftRight, this.f40624g);
                BigInteger bigInteger2 = n60.d.f40585b;
                if (!modPow2.equals(bigInteger2)) {
                    return null;
                }
                BigInteger bigInteger3 = this.f40626i;
                BigInteger y11 = y(y(bigInteger3));
                BigInteger add2 = shiftRight.add(bigInteger2);
                BigInteger subtract = this.f40624g.subtract(bigInteger2);
                Random random = new Random();
                while (true) {
                    BigInteger bigInteger4 = new BigInteger(this.f40624g.bitLength(), random);
                    if (bigInteger4.compareTo(this.f40624g) < 0 && C(bigInteger4.multiply(bigInteger4).subtract(y11)).modPow(shiftRight, this.f40624g).equals(subtract)) {
                        BigInteger[] w11 = w(bigInteger4, bigInteger3, add2);
                        BigInteger bigInteger5 = w11[0];
                        BigInteger bigInteger6 = w11[1];
                        if (B(bigInteger6, bigInteger6).equals(y11)) {
                            return new d(this.f40624g, this.f40625h, z(bigInteger6));
                        }
                        if (!bigInteger5.equals(n60.d.f40585b) && !bigInteger5.equals(subtract)) {
                            return null;
                        }
                    }
                }
            }
        }

        @Override // n60.f
        public f o() {
            BigInteger bigInteger = this.f40624g;
            BigInteger bigInteger2 = this.f40625h;
            BigInteger bigInteger3 = this.f40626i;
            return new d(bigInteger, bigInteger2, B(bigInteger3, bigInteger3));
        }

        @Override // n60.f
        public f p(f fVar, f fVar2) {
            BigInteger bigInteger = this.f40626i;
            BigInteger t11 = fVar.t();
            BigInteger t12 = fVar2.t();
            return new d(this.f40624g, this.f40625h, C(bigInteger.multiply(bigInteger).add(t11.multiply(t12))));
        }

        @Override // n60.f
        public f r(f fVar) {
            return new d(this.f40624g, this.f40625h, D(this.f40626i, fVar.t()));
        }

        @Override // n60.f
        public BigInteger t() {
            return this.f40626i;
        }

        protected BigInteger x(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger add = bigInteger.add(bigInteger2);
            return add.compareTo(this.f40624g) >= 0 ? add.subtract(this.f40624g) : add;
        }

        protected BigInteger y(BigInteger bigInteger) {
            BigInteger shiftLeft = bigInteger.shiftLeft(1);
            return shiftLeft.compareTo(this.f40624g) >= 0 ? shiftLeft.subtract(this.f40624g) : shiftLeft;
        }

        protected BigInteger z(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f40624g.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }
    }

    public abstract f a(f fVar);

    public abstract f b();

    public int c() {
        return t().bitLength();
    }

    public abstract f d(f fVar);

    public byte[] e() {
        return r70.a.b((f() + 7) / 8, t());
    }

    public abstract int f();

    public abstract f g();

    public boolean h() {
        return c() == 1;
    }

    public boolean i() {
        return t().signum() == 0;
    }

    public abstract f j(f fVar);

    public f k(f fVar, f fVar2, f fVar3) {
        return j(fVar).r(fVar2.j(fVar3));
    }

    public f l(f fVar, f fVar2, f fVar3) {
        return j(fVar).a(fVar2.j(fVar3));
    }

    public abstract f m();

    public abstract f n();

    public abstract f o();

    public f p(f fVar, f fVar2) {
        return o().a(fVar.j(fVar2));
    }

    public f q(int i11) {
        f fVar = this;
        for (int i12 = 0; i12 < i11; i12++) {
            fVar = fVar.o();
        }
        return fVar;
    }

    public abstract f r(f fVar);

    public boolean s() {
        return t().testBit(0);
    }

    public abstract BigInteger t();

    public String toString() {
        return t().toString(16);
    }
}