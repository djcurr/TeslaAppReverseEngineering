package g3;

import f3.d;
import f3.e;
import g3.f;
import g3.p;

/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k  reason: collision with root package name */
    private static int[] f27526k = new int[2];

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27527a;

        static {
            int[] iArr = new int[p.b.values().length];
            f27527a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27527a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27527a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(f3.e eVar) {
        super(eVar);
        this.f27547h.f27514e = f.a.LEFT;
        this.f27548i.f27514e = f.a.RIGHT;
        this.f27545f = 0;
    }

    private void q(int[] iArr, int i11, int i12, int i13, int i14, float f11, int i15) {
        int i16 = i12 - i11;
        int i17 = i14 - i13;
        if (i15 != -1) {
            if (i15 == 0) {
                iArr[0] = (int) ((i17 * f11) + 0.5f);
                iArr[1] = i17;
                return;
            } else if (i15 != 1) {
                return;
            } else {
                iArr[0] = i16;
                iArr[1] = (int) ((i16 * f11) + 0.5f);
                return;
            }
        }
        int i18 = (int) ((i17 * f11) + 0.5f);
        int i19 = (int) ((i16 / f11) + 0.5f);
        if (i18 <= i16) {
            iArr[0] = i18;
            iArr[1] = i17;
        } else if (i19 <= i17) {
            iArr[0] = i16;
            iArr[1] = i19;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02b9, code lost:
        if (r14 != 1) goto L131;
     */
    @Override // g3.p, g3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(g3.d r17) {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.l.a(g3.d):void");
    }

    @Override // g3.p
    void d() {
        f3.e J;
        f3.e J2;
        f3.e eVar = this.f27541b;
        if (eVar.f25702a) {
            this.f27544e.d(eVar.W());
        }
        if (!this.f27544e.f27519j) {
            e.b y11 = this.f27541b.y();
            this.f27543d = y11;
            if (y11 != e.b.MATCH_CONSTRAINT) {
                e.b bVar = e.b.MATCH_PARENT;
                if (y11 == bVar && (J2 = this.f27541b.J()) != null && (J2.y() == e.b.FIXED || J2.y() == bVar)) {
                    int W = (J2.W() - this.f27541b.M.e()) - this.f27541b.O.e();
                    b(this.f27547h, J2.f25708d.f27547h, this.f27541b.M.e());
                    b(this.f27548i, J2.f25708d.f27548i, -this.f27541b.O.e());
                    this.f27544e.d(W);
                    return;
                } else if (this.f27543d == e.b.FIXED) {
                    this.f27544e.d(this.f27541b.W());
                }
            }
        } else {
            e.b bVar2 = this.f27543d;
            e.b bVar3 = e.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (J = this.f27541b.J()) != null && (J.y() == e.b.FIXED || J.y() == bVar3)) {
                b(this.f27547h, J.f25708d.f27547h, this.f27541b.M.e());
                b(this.f27548i, J.f25708d.f27548i, -this.f27541b.O.e());
                return;
            }
        }
        g gVar = this.f27544e;
        if (gVar.f27519j) {
            f3.e eVar2 = this.f27541b;
            if (eVar2.f25702a) {
                f3.d[] dVarArr = eVar2.U;
                if (dVarArr[0].f25696f != null && dVarArr[1].f25696f != null) {
                    if (eVar2.i0()) {
                        this.f27547h.f27515f = this.f27541b.U[0].e();
                        this.f27548i.f27515f = -this.f27541b.U[1].e();
                        return;
                    }
                    f h11 = h(this.f27541b.U[0]);
                    if (h11 != null) {
                        b(this.f27547h, h11, this.f27541b.U[0].e());
                    }
                    f h12 = h(this.f27541b.U[1]);
                    if (h12 != null) {
                        b(this.f27548i, h12, -this.f27541b.U[1].e());
                    }
                    this.f27547h.f27511b = true;
                    this.f27548i.f27511b = true;
                    return;
                } else if (dVarArr[0].f25696f != null) {
                    f h13 = h(dVarArr[0]);
                    if (h13 != null) {
                        b(this.f27547h, h13, this.f27541b.U[0].e());
                        b(this.f27548i, this.f27547h, this.f27544e.f27516g);
                        return;
                    }
                    return;
                } else if (dVarArr[1].f25696f != null) {
                    f h14 = h(dVarArr[1]);
                    if (h14 != null) {
                        b(this.f27548i, h14, -this.f27541b.U[1].e());
                        b(this.f27547h, this.f27548i, -this.f27544e.f27516g);
                        return;
                    }
                    return;
                } else if ((eVar2 instanceof f3.h) || eVar2.J() == null || this.f27541b.m(d.b.CENTER).f25696f != null) {
                    return;
                } else {
                    b(this.f27547h, this.f27541b.J().f25708d.f27547h, this.f27541b.X());
                    b(this.f27548i, this.f27547h, this.f27544e.f27516g);
                    return;
                }
            }
        }
        if (this.f27543d == e.b.MATCH_CONSTRAINT) {
            f3.e eVar3 = this.f27541b;
            int i11 = eVar3.f25742u;
            if (i11 == 2) {
                f3.e J3 = eVar3.J();
                if (J3 != null) {
                    g gVar2 = J3.f25710e.f27544e;
                    this.f27544e.f27521l.add(gVar2);
                    gVar2.f27520k.add(this.f27544e);
                    g gVar3 = this.f27544e;
                    gVar3.f27511b = true;
                    gVar3.f27520k.add(this.f27547h);
                    this.f27544e.f27520k.add(this.f27548i);
                }
            } else if (i11 == 3) {
                if (eVar3.f25744v == 3) {
                    this.f27547h.f27510a = this;
                    this.f27548i.f27510a = this;
                    n nVar = eVar3.f25710e;
                    nVar.f27547h.f27510a = this;
                    nVar.f27548i.f27510a = this;
                    gVar.f27510a = this;
                    if (eVar3.k0()) {
                        this.f27544e.f27521l.add(this.f27541b.f25710e.f27544e);
                        this.f27541b.f25710e.f27544e.f27520k.add(this.f27544e);
                        n nVar2 = this.f27541b.f25710e;
                        nVar2.f27544e.f27510a = this;
                        this.f27544e.f27521l.add(nVar2.f27547h);
                        this.f27544e.f27521l.add(this.f27541b.f25710e.f27548i);
                        this.f27541b.f25710e.f27547h.f27520k.add(this.f27544e);
                        this.f27541b.f25710e.f27548i.f27520k.add(this.f27544e);
                    } else if (this.f27541b.i0()) {
                        this.f27541b.f25710e.f27544e.f27521l.add(this.f27544e);
                        this.f27544e.f27520k.add(this.f27541b.f25710e.f27544e);
                    } else {
                        this.f27541b.f25710e.f27544e.f27521l.add(this.f27544e);
                    }
                } else {
                    g gVar4 = eVar3.f25710e.f27544e;
                    gVar.f27521l.add(gVar4);
                    gVar4.f27520k.add(this.f27544e);
                    this.f27541b.f25710e.f27547h.f27520k.add(this.f27544e);
                    this.f27541b.f25710e.f27548i.f27520k.add(this.f27544e);
                    g gVar5 = this.f27544e;
                    gVar5.f27511b = true;
                    gVar5.f27520k.add(this.f27547h);
                    this.f27544e.f27520k.add(this.f27548i);
                    this.f27547h.f27521l.add(this.f27544e);
                    this.f27548i.f27521l.add(this.f27544e);
                }
            }
        }
        f3.e eVar4 = this.f27541b;
        f3.d[] dVarArr2 = eVar4.U;
        if (dVarArr2[0].f25696f != null && dVarArr2[1].f25696f != null) {
            if (eVar4.i0()) {
                this.f27547h.f27515f = this.f27541b.U[0].e();
                this.f27548i.f27515f = -this.f27541b.U[1].e();
                return;
            }
            f h15 = h(this.f27541b.U[0]);
            f h16 = h(this.f27541b.U[1]);
            if (h15 != null) {
                h15.b(this);
            }
            if (h16 != null) {
                h16.b(this);
            }
            this.f27549j = p.b.CENTER;
        } else if (dVarArr2[0].f25696f != null) {
            f h17 = h(dVarArr2[0]);
            if (h17 != null) {
                b(this.f27547h, h17, this.f27541b.U[0].e());
                c(this.f27548i, this.f27547h, 1, this.f27544e);
            }
        } else if (dVarArr2[1].f25696f != null) {
            f h18 = h(dVarArr2[1]);
            if (h18 != null) {
                b(this.f27548i, h18, -this.f27541b.U[1].e());
                c(this.f27547h, this.f27548i, -1, this.f27544e);
            }
        } else if ((eVar4 instanceof f3.h) || eVar4.J() == null) {
        } else {
            b(this.f27547h, this.f27541b.J().f25708d.f27547h, this.f27541b.X());
            c(this.f27548i, this.f27547h, 1, this.f27544e);
        }
    }

    @Override // g3.p
    public void e() {
        f fVar = this.f27547h;
        if (fVar.f27519j) {
            this.f27541b.l1(fVar.f27516g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g3.p
    public void f() {
        this.f27542c = null;
        this.f27547h.c();
        this.f27548i.c();
        this.f27544e.c();
        this.f27546g = false;
    }

    @Override // g3.p
    boolean m() {
        return this.f27543d != e.b.MATCH_CONSTRAINT || this.f27541b.f25742u == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        this.f27546g = false;
        this.f27547h.c();
        this.f27547h.f27519j = false;
        this.f27548i.c();
        this.f27548i.f27519j = false;
        this.f27544e.f27519j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f27541b.r();
    }
}