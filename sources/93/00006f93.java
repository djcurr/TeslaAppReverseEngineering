package g3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f3.d;
import f3.e;
import g3.f;
import g3.p;

/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public f f27531k;

    /* renamed from: l  reason: collision with root package name */
    g f27532l;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27533a;

        static {
            int[] iArr = new int[p.b.values().length];
            f27533a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27533a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27533a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(f3.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f27531k = fVar;
        this.f27532l = null;
        this.f27547h.f27514e = f.a.TOP;
        this.f27548i.f27514e = f.a.BOTTOM;
        fVar.f27514e = f.a.BASELINE;
        this.f27545f = 1;
    }

    @Override // g3.p, g3.d
    public void a(d dVar) {
        g gVar;
        float f11;
        float t11;
        float f12;
        int i11;
        f3.e eVar;
        int i12 = a.f27533a[this.f27549j.ordinal()];
        if (i12 == 1) {
            p(dVar);
        } else if (i12 == 2) {
            o(dVar);
        } else if (i12 == 3) {
            f3.e eVar2 = this.f27541b;
            n(dVar, eVar2.N, eVar2.P, 1);
            return;
        }
        g gVar2 = this.f27544e;
        if (gVar2.f27512c && !gVar2.f27519j && this.f27543d == e.b.MATCH_CONSTRAINT) {
            f3.e eVar3 = this.f27541b;
            int i13 = eVar3.f25744v;
            if (i13 != 2) {
                if (i13 == 3 && eVar3.f25708d.f27544e.f27519j) {
                    int u11 = eVar3.u();
                    if (u11 == -1) {
                        f3.e eVar4 = this.f27541b;
                        f11 = eVar4.f25708d.f27544e.f27516g;
                        t11 = eVar4.t();
                    } else if (u11 == 0) {
                        f12 = eVar.f25708d.f27544e.f27516g * this.f27541b.t();
                        i11 = (int) (f12 + 0.5f);
                        this.f27544e.d(i11);
                    } else if (u11 == 1) {
                        f3.e eVar5 = this.f27541b;
                        f11 = eVar5.f25708d.f27544e.f27516g;
                        t11 = eVar5.t();
                    } else {
                        i11 = 0;
                        this.f27544e.d(i11);
                    }
                    f12 = f11 / t11;
                    i11 = (int) (f12 + 0.5f);
                    this.f27544e.d(i11);
                }
            } else {
                f3.e J = eVar3.J();
                if (J != null) {
                    if (J.f25710e.f27544e.f27519j) {
                        this.f27544e.d((int) ((gVar.f27516g * this.f27541b.C) + 0.5f));
                    }
                }
            }
        }
        f fVar = this.f27547h;
        if (fVar.f27512c) {
            f fVar2 = this.f27548i;
            if (fVar2.f27512c) {
                if (fVar.f27519j && fVar2.f27519j && this.f27544e.f27519j) {
                    return;
                }
                if (!this.f27544e.f27519j && this.f27543d == e.b.MATCH_CONSTRAINT) {
                    f3.e eVar6 = this.f27541b;
                    if (eVar6.f25742u == 0 && !eVar6.k0()) {
                        int i14 = this.f27547h.f27521l.get(0).f27516g;
                        f fVar3 = this.f27547h;
                        int i15 = i14 + fVar3.f27515f;
                        int i16 = this.f27548i.f27521l.get(0).f27516g + this.f27548i.f27515f;
                        fVar3.d(i15);
                        this.f27548i.d(i16);
                        this.f27544e.d(i16 - i15);
                        return;
                    }
                }
                if (!this.f27544e.f27519j && this.f27543d == e.b.MATCH_CONSTRAINT && this.f27540a == 1 && this.f27547h.f27521l.size() > 0 && this.f27548i.f27521l.size() > 0) {
                    int i17 = (this.f27548i.f27521l.get(0).f27516g + this.f27548i.f27515f) - (this.f27547h.f27521l.get(0).f27516g + this.f27547h.f27515f);
                    g gVar3 = this.f27544e;
                    int i18 = gVar3.f27522m;
                    if (i17 < i18) {
                        gVar3.d(i17);
                    } else {
                        gVar3.d(i18);
                    }
                }
                if (this.f27544e.f27519j && this.f27547h.f27521l.size() > 0 && this.f27548i.f27521l.size() > 0) {
                    f fVar4 = this.f27547h.f27521l.get(0);
                    f fVar5 = this.f27548i.f27521l.get(0);
                    int i19 = fVar4.f27516g + this.f27547h.f27515f;
                    int i21 = fVar5.f27516g + this.f27548i.f27515f;
                    float R = this.f27541b.R();
                    if (fVar4 == fVar5) {
                        i19 = fVar4.f27516g;
                        i21 = fVar5.f27516g;
                        R = 0.5f;
                    }
                    this.f27547h.d((int) (i19 + 0.5f + (((i21 - i19) - this.f27544e.f27516g) * R)));
                    this.f27548i.d(this.f27547h.f27516g + this.f27544e.f27516g);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g3.p
    public void d() {
        f3.e J;
        f3.e J2;
        f3.e eVar = this.f27541b;
        if (eVar.f25702a) {
            this.f27544e.d(eVar.v());
        }
        if (!this.f27544e.f27519j) {
            this.f27543d = this.f27541b.T();
            if (this.f27541b.Z()) {
                this.f27532l = new g3.a(this);
            }
            e.b bVar = this.f27543d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (J2 = this.f27541b.J()) != null && J2.T() == e.b.FIXED) {
                    int v11 = (J2.v() - this.f27541b.N.e()) - this.f27541b.P.e();
                    b(this.f27547h, J2.f25710e.f27547h, this.f27541b.N.e());
                    b(this.f27548i, J2.f25710e.f27548i, -this.f27541b.P.e());
                    this.f27544e.d(v11);
                    return;
                } else if (this.f27543d == e.b.FIXED) {
                    this.f27544e.d(this.f27541b.v());
                }
            }
        } else if (this.f27543d == e.b.MATCH_PARENT && (J = this.f27541b.J()) != null && J.T() == e.b.FIXED) {
            b(this.f27547h, J.f25710e.f27547h, this.f27541b.N.e());
            b(this.f27548i, J.f25710e.f27548i, -this.f27541b.P.e());
            return;
        }
        g gVar = this.f27544e;
        boolean z11 = gVar.f27519j;
        if (z11) {
            f3.e eVar2 = this.f27541b;
            if (eVar2.f25702a) {
                f3.d[] dVarArr = eVar2.U;
                if (dVarArr[2].f25696f != null && dVarArr[3].f25696f != null) {
                    if (eVar2.k0()) {
                        this.f27547h.f27515f = this.f27541b.U[2].e();
                        this.f27548i.f27515f = -this.f27541b.U[3].e();
                    } else {
                        f h11 = h(this.f27541b.U[2]);
                        if (h11 != null) {
                            b(this.f27547h, h11, this.f27541b.U[2].e());
                        }
                        f h12 = h(this.f27541b.U[3]);
                        if (h12 != null) {
                            b(this.f27548i, h12, -this.f27541b.U[3].e());
                        }
                        this.f27547h.f27511b = true;
                        this.f27548i.f27511b = true;
                    }
                    if (this.f27541b.Z()) {
                        b(this.f27531k, this.f27547h, this.f27541b.n());
                        return;
                    }
                    return;
                } else if (dVarArr[2].f25696f != null) {
                    f h13 = h(dVarArr[2]);
                    if (h13 != null) {
                        b(this.f27547h, h13, this.f27541b.U[2].e());
                        b(this.f27548i, this.f27547h, this.f27544e.f27516g);
                        if (this.f27541b.Z()) {
                            b(this.f27531k, this.f27547h, this.f27541b.n());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (dVarArr[3].f25696f != null) {
                    f h14 = h(dVarArr[3]);
                    if (h14 != null) {
                        b(this.f27548i, h14, -this.f27541b.U[3].e());
                        b(this.f27547h, this.f27548i, -this.f27544e.f27516g);
                    }
                    if (this.f27541b.Z()) {
                        b(this.f27531k, this.f27547h, this.f27541b.n());
                        return;
                    }
                    return;
                } else if (dVarArr[4].f25696f != null) {
                    f h15 = h(dVarArr[4]);
                    if (h15 != null) {
                        b(this.f27531k, h15, 0);
                        b(this.f27547h, this.f27531k, -this.f27541b.n());
                        b(this.f27548i, this.f27547h, this.f27544e.f27516g);
                        return;
                    }
                    return;
                } else if ((eVar2 instanceof f3.h) || eVar2.J() == null || this.f27541b.m(d.b.CENTER).f25696f != null) {
                    return;
                } else {
                    b(this.f27547h, this.f27541b.J().f25710e.f27547h, this.f27541b.Y());
                    b(this.f27548i, this.f27547h, this.f27544e.f27516g);
                    if (this.f27541b.Z()) {
                        b(this.f27531k, this.f27547h, this.f27541b.n());
                        return;
                    }
                    return;
                }
            }
        }
        if (!z11 && this.f27543d == e.b.MATCH_CONSTRAINT) {
            f3.e eVar3 = this.f27541b;
            int i11 = eVar3.f25744v;
            if (i11 != 2) {
                if (i11 == 3 && !eVar3.k0()) {
                    f3.e eVar4 = this.f27541b;
                    if (eVar4.f25742u != 3) {
                        g gVar2 = eVar4.f25708d.f27544e;
                        this.f27544e.f27521l.add(gVar2);
                        gVar2.f27520k.add(this.f27544e);
                        g gVar3 = this.f27544e;
                        gVar3.f27511b = true;
                        gVar3.f27520k.add(this.f27547h);
                        this.f27544e.f27520k.add(this.f27548i);
                    }
                }
            } else {
                f3.e J3 = eVar3.J();
                if (J3 != null) {
                    g gVar4 = J3.f25710e.f27544e;
                    this.f27544e.f27521l.add(gVar4);
                    gVar4.f27520k.add(this.f27544e);
                    g gVar5 = this.f27544e;
                    gVar5.f27511b = true;
                    gVar5.f27520k.add(this.f27547h);
                    this.f27544e.f27520k.add(this.f27548i);
                }
            }
        } else {
            gVar.b(this);
        }
        f3.e eVar5 = this.f27541b;
        f3.d[] dVarArr2 = eVar5.U;
        if (dVarArr2[2].f25696f != null && dVarArr2[3].f25696f != null) {
            if (eVar5.k0()) {
                this.f27547h.f27515f = this.f27541b.U[2].e();
                this.f27548i.f27515f = -this.f27541b.U[3].e();
            } else {
                f h16 = h(this.f27541b.U[2]);
                f h17 = h(this.f27541b.U[3]);
                if (h16 != null) {
                    h16.b(this);
                }
                if (h17 != null) {
                    h17.b(this);
                }
                this.f27549j = p.b.CENTER;
            }
            if (this.f27541b.Z()) {
                c(this.f27531k, this.f27547h, 1, this.f27532l);
            }
        } else if (dVarArr2[2].f25696f != null) {
            f h18 = h(dVarArr2[2]);
            if (h18 != null) {
                b(this.f27547h, h18, this.f27541b.U[2].e());
                c(this.f27548i, this.f27547h, 1, this.f27544e);
                if (this.f27541b.Z()) {
                    c(this.f27531k, this.f27547h, 1, this.f27532l);
                }
                e.b bVar2 = this.f27543d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f27541b.t() > BitmapDescriptorFactory.HUE_RED) {
                    l lVar = this.f27541b.f25708d;
                    if (lVar.f27543d == bVar3) {
                        lVar.f27544e.f27520k.add(this.f27544e);
                        this.f27544e.f27521l.add(this.f27541b.f25708d.f27544e);
                        this.f27544e.f27510a = this;
                    }
                }
            }
        } else if (dVarArr2[3].f25696f != null) {
            f h19 = h(dVarArr2[3]);
            if (h19 != null) {
                b(this.f27548i, h19, -this.f27541b.U[3].e());
                c(this.f27547h, this.f27548i, -1, this.f27544e);
                if (this.f27541b.Z()) {
                    c(this.f27531k, this.f27547h, 1, this.f27532l);
                }
            }
        } else if (dVarArr2[4].f25696f != null) {
            f h21 = h(dVarArr2[4]);
            if (h21 != null) {
                b(this.f27531k, h21, 0);
                c(this.f27547h, this.f27531k, -1, this.f27532l);
                c(this.f27548i, this.f27547h, 1, this.f27544e);
            }
        } else if (!(eVar5 instanceof f3.h) && eVar5.J() != null) {
            b(this.f27547h, this.f27541b.J().f25710e.f27547h, this.f27541b.Y());
            c(this.f27548i, this.f27547h, 1, this.f27544e);
            if (this.f27541b.Z()) {
                c(this.f27531k, this.f27547h, 1, this.f27532l);
            }
            e.b bVar4 = this.f27543d;
            e.b bVar5 = e.b.MATCH_CONSTRAINT;
            if (bVar4 == bVar5 && this.f27541b.t() > BitmapDescriptorFactory.HUE_RED) {
                l lVar2 = this.f27541b.f25708d;
                if (lVar2.f27543d == bVar5) {
                    lVar2.f27544e.f27520k.add(this.f27544e);
                    this.f27544e.f27521l.add(this.f27541b.f25708d.f27544e);
                    this.f27544e.f27510a = this;
                }
            }
        }
        if (this.f27544e.f27521l.size() == 0) {
            this.f27544e.f27512c = true;
        }
    }

    @Override // g3.p
    public void e() {
        f fVar = this.f27547h;
        if (fVar.f27519j) {
            this.f27541b.m1(fVar.f27516g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g3.p
    public void f() {
        this.f27542c = null;
        this.f27547h.c();
        this.f27548i.c();
        this.f27531k.c();
        this.f27544e.c();
        this.f27546g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g3.p
    public boolean m() {
        return this.f27543d != e.b.MATCH_CONSTRAINT || this.f27541b.f25744v == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        this.f27546g = false;
        this.f27547h.c();
        this.f27547h.f27519j = false;
        this.f27548i.c();
        this.f27548i.f27519j = false;
        this.f27531k.c();
        this.f27531k.f27519j = false;
        this.f27544e.f27519j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f27541b.r();
    }
}