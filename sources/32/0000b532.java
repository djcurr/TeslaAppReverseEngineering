package ti;

import ji.a;

/* loaded from: classes3.dex */
final class e0 extends ji.a {

    /* loaded from: classes3.dex */
    private static final class a implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final ak.g0 f52001a;

        /* renamed from: b  reason: collision with root package name */
        private final ak.v f52002b = new ak.v();

        /* renamed from: c  reason: collision with root package name */
        private final int f52003c;

        /* renamed from: d  reason: collision with root package name */
        private final int f52004d;

        public a(int i11, ak.g0 g0Var, int i12) {
            this.f52003c = i11;
            this.f52001a = g0Var;
            this.f52004d = i12;
        }

        private a.e c(ak.v vVar, long j11, long j12) {
            int a11;
            int a12;
            int f11 = vVar.f();
            long j13 = -1;
            long j14 = -1;
            long j15 = -9223372036854775807L;
            while (vVar.a() >= 188 && (a12 = (a11 = j0.a(vVar.d(), vVar.e(), f11)) + 188) <= f11) {
                long b11 = j0.b(vVar, a11, this.f52003c);
                if (b11 != -9223372036854775807L) {
                    long b12 = this.f52001a.b(b11);
                    if (b12 > j11) {
                        if (j15 == -9223372036854775807L) {
                            return a.e.d(b12, j12);
                        }
                        return a.e.e(j12 + j14);
                    } else if (100000 + b12 > j11) {
                        return a.e.e(j12 + a11);
                    } else {
                        j14 = a11;
                        j15 = b12;
                    }
                }
                vVar.O(a12);
                j13 = a12;
            }
            if (j15 != -9223372036854775807L) {
                return a.e.f(j15, j12 + j13);
            }
            return a.e.f33705d;
        }

        @Override // ji.a.f
        public void a() {
            this.f52002b.L(ak.k0.f482f);
        }

        @Override // ji.a.f
        public a.e b(ji.i iVar, long j11) {
            long position = iVar.getPosition();
            int min = (int) Math.min(this.f52004d, iVar.getLength() - position);
            this.f52002b.K(min);
            iVar.n(this.f52002b.d(), 0, min);
            return c(this.f52002b, j11, position);
        }
    }

    public e0(ak.g0 g0Var, long j11, long j12, int i11, int i12) {
        super(new a.b(), new a(i11, g0Var, i12), j11, 0L, j11 + 1, 0L, j12, 188L, 940);
    }
}