package ti;

import ji.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class x extends ji.a {

    /* loaded from: classes3.dex */
    private static final class b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final ak.g0 f52304a;

        /* renamed from: b  reason: collision with root package name */
        private final ak.v f52305b;

        private a.e c(ak.v vVar, long j11, long j12) {
            int i11 = -1;
            int i12 = -1;
            long j13 = -9223372036854775807L;
            while (vVar.a() >= 4) {
                if (x.k(vVar.d(), vVar.e()) != 442) {
                    vVar.P(1);
                } else {
                    vVar.P(4);
                    long l11 = y.l(vVar);
                    if (l11 != -9223372036854775807L) {
                        long b11 = this.f52304a.b(l11);
                        if (b11 > j11) {
                            if (j13 == -9223372036854775807L) {
                                return a.e.d(b11, j12);
                            }
                            return a.e.e(j12 + i12);
                        } else if (100000 + b11 > j11) {
                            return a.e.e(j12 + vVar.e());
                        } else {
                            i12 = vVar.e();
                            j13 = b11;
                        }
                    }
                    d(vVar);
                    i11 = vVar.e();
                }
            }
            if (j13 != -9223372036854775807L) {
                return a.e.f(j13, j12 + i11);
            }
            return a.e.f33705d;
        }

        private static void d(ak.v vVar) {
            int k11;
            int f11 = vVar.f();
            if (vVar.a() < 10) {
                vVar.O(f11);
                return;
            }
            vVar.P(9);
            int C = vVar.C() & 7;
            if (vVar.a() < C) {
                vVar.O(f11);
                return;
            }
            vVar.P(C);
            if (vVar.a() >= 4) {
                if (x.k(vVar.d(), vVar.e()) == 443) {
                    vVar.P(4);
                    int I = vVar.I();
                    if (vVar.a() < I) {
                        vVar.O(f11);
                        return;
                    }
                    vVar.P(I);
                }
                while (vVar.a() >= 4 && (k11 = x.k(vVar.d(), vVar.e())) != 442 && k11 != 441 && (k11 >>> 8) == 1) {
                    vVar.P(4);
                    if (vVar.a() < 2) {
                        vVar.O(f11);
                        return;
                    }
                    vVar.O(Math.min(vVar.f(), vVar.e() + vVar.I()));
                }
                return;
            }
            vVar.O(f11);
        }

        @Override // ji.a.f
        public void a() {
            this.f52305b.L(ak.k0.f482f);
        }

        @Override // ji.a.f
        public a.e b(ji.i iVar, long j11) {
            long position = iVar.getPosition();
            int min = (int) Math.min(20000L, iVar.getLength() - position);
            this.f52305b.K(min);
            iVar.n(this.f52305b.d(), 0, min);
            return c(this.f52305b, j11, position);
        }

        private b(ak.g0 g0Var) {
            this.f52304a = g0Var;
            this.f52305b = new ak.v();
        }
    }

    public x(ak.g0 g0Var, long j11, long j12) {
        super(new a.b(), new b(g0Var), j11, 0L, j11 + 1, 0L, j12, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }
}