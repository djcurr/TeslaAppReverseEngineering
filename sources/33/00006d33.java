package f3;

import f3.d;
import f3.e;

/* loaded from: classes.dex */
public class g extends e {
    private boolean C0;

    /* renamed from: x0  reason: collision with root package name */
    protected float f25754x0 = -1.0f;

    /* renamed from: y0  reason: collision with root package name */
    protected int f25755y0 = -1;

    /* renamed from: z0  reason: collision with root package name */
    protected int f25756z0 = -1;
    private d A0 = this.N;
    private int B0 = 0;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f25757a;

        static {
            int[] iArr = new int[d.b.values().length];
            f25757a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25757a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25757a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25757a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25757a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25757a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25757a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25757a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25757a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public g() {
        this.V.clear();
        this.V.add(this.A0);
        int length = this.U.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.U[i11] = this.A0;
        }
    }

    @Override // f3.e
    public void g(a3.d dVar, boolean z11) {
        f fVar = (f) J();
        if (fVar == null) {
            return;
        }
        d m11 = fVar.m(d.b.LEFT);
        d m12 = fVar.m(d.b.RIGHT);
        e eVar = this.Y;
        boolean z12 = true;
        boolean z13 = eVar != null && eVar.X[0] == e.b.WRAP_CONTENT;
        if (this.B0 == 0) {
            m11 = fVar.m(d.b.TOP);
            m12 = fVar.m(d.b.BOTTOM);
            e eVar2 = this.Y;
            if (eVar2 == null || eVar2.X[1] != e.b.WRAP_CONTENT) {
                z12 = false;
            }
            z13 = z12;
        }
        if (this.C0 && this.A0.m()) {
            a3.i q11 = dVar.q(this.A0);
            dVar.f(q11, this.A0.d());
            if (this.f25755y0 != -1) {
                if (z13) {
                    dVar.h(dVar.q(m12), q11, 0, 5);
                }
            } else if (this.f25756z0 != -1 && z13) {
                a3.i q12 = dVar.q(m12);
                dVar.h(q11, dVar.q(m11), 0, 5);
                dVar.h(q12, q11, 0, 5);
            }
            this.C0 = false;
        } else if (this.f25755y0 != -1) {
            a3.i q13 = dVar.q(this.A0);
            dVar.e(q13, dVar.q(m11), this.f25755y0, 8);
            if (z13) {
                dVar.h(dVar.q(m12), q13, 0, 5);
            }
        } else if (this.f25756z0 != -1) {
            a3.i q14 = dVar.q(this.A0);
            a3.i q15 = dVar.q(m12);
            dVar.e(q14, q15, -this.f25756z0, 8);
            if (z13) {
                dVar.h(q14, dVar.q(m11), 0, 5);
                dVar.h(q15, q14, 0, 5);
            }
        } else if (this.f25754x0 != -1.0f) {
            dVar.d(a3.d.s(dVar, dVar.q(this.A0), dVar.q(m12), this.f25754x0));
        }
    }

    @Override // f3.e
    public boolean h() {
        return true;
    }

    @Override // f3.e
    public d m(d.b bVar) {
        int i11 = a.f25757a[bVar.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if ((i11 == 3 || i11 == 4) && this.B0 == 0) {
                return this.A0;
            }
            return null;
        } else if (this.B0 == 1) {
            return this.A0;
        } else {
            return null;
        }
    }

    @Override // f3.e
    public boolean n0() {
        return this.C0;
    }

    @Override // f3.e
    public boolean o0() {
        return this.C0;
    }

    @Override // f3.e
    public void p1(a3.d dVar, boolean z11) {
        if (J() == null) {
            return;
        }
        int y11 = dVar.y(this.A0);
        if (this.B0 == 1) {
            l1(y11);
            m1(0);
            K0(J().v());
            j1(0);
            return;
        }
        l1(0);
        m1(y11);
        j1(J().W());
        K0(0);
    }

    public d q1() {
        return this.A0;
    }

    public int r1() {
        return this.B0;
    }

    public int s1() {
        return this.f25755y0;
    }

    public int t1() {
        return this.f25756z0;
    }

    public float u1() {
        return this.f25754x0;
    }

    public void v1(int i11) {
        this.A0.s(i11);
        this.C0 = true;
    }

    public void w1(int i11) {
        if (i11 > -1) {
            this.f25754x0 = -1.0f;
            this.f25755y0 = i11;
            this.f25756z0 = -1;
        }
    }

    public void x1(int i11) {
        if (i11 > -1) {
            this.f25754x0 = -1.0f;
            this.f25755y0 = -1;
            this.f25756z0 = i11;
        }
    }

    public void y1(float f11) {
        if (f11 > -1.0f) {
            this.f25754x0 = f11;
            this.f25755y0 = -1;
            this.f25756z0 = -1;
        }
    }

    public void z1(int i11) {
        if (this.B0 == i11) {
            return;
        }
        this.B0 = i11;
        this.V.clear();
        if (this.B0 == 1) {
            this.A0 = this.M;
        } else {
            this.A0 = this.N;
        }
        this.V.add(this.A0);
        int length = this.U.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.U[i12] = this.A0;
        }
    }
}