package g3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f3.e;
import g3.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private f3.f f27502a;

    /* renamed from: d  reason: collision with root package name */
    private f3.f f27505d;

    /* renamed from: f  reason: collision with root package name */
    private b.InterfaceC0524b f27507f;

    /* renamed from: g  reason: collision with root package name */
    private b.a f27508g;

    /* renamed from: h  reason: collision with root package name */
    ArrayList<m> f27509h;

    /* renamed from: b  reason: collision with root package name */
    private boolean f27503b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27504c = true;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<p> f27506e = new ArrayList<>();

    public e(f3.f fVar) {
        new ArrayList();
        this.f27507f = null;
        this.f27508g = new b.a();
        this.f27509h = new ArrayList<>();
        this.f27502a = fVar;
        this.f27505d = fVar;
    }

    private void a(f fVar, int i11, int i12, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f27513d;
        if (pVar.f27542c == null) {
            f3.f fVar3 = this.f27502a;
            if (pVar == fVar3.f25708d || pVar == fVar3.f25710e) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i12);
                arrayList.add(mVar);
            }
            pVar.f27542c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.f27547h.f27520k) {
                if (dVar instanceof f) {
                    a((f) dVar, i11, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.f27548i.f27520k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i11, 1, fVar2, arrayList, mVar);
                }
            }
            if (i11 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f27531k.f27520k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i11, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f27547h.f27521l) {
                a(fVar4, i11, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.f27548i.f27521l) {
                a(fVar5, i11, 1, fVar2, arrayList, mVar);
            }
            if (i11 == 1 && (pVar instanceof n)) {
                for (f fVar6 : ((n) pVar).f27531k.f27521l) {
                    a(fVar6, i11, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    private boolean b(f3.f fVar) {
        int i11;
        e.b bVar;
        int i12;
        e.b bVar2;
        e.b bVar3;
        e.b bVar4;
        Iterator<f3.e> it2 = fVar.f25762x0.iterator();
        while (it2.hasNext()) {
            f3.e next = it2.next();
            e.b[] bVarArr = next.X;
            e.b bVar5 = bVarArr[0];
            e.b bVar6 = bVarArr[1];
            if (next.V() == 8) {
                next.f25702a = true;
            } else {
                if (next.f25749z < 1.0f && bVar5 == e.b.MATCH_CONSTRAINT) {
                    next.f25742u = 2;
                }
                if (next.C < 1.0f && bVar6 == e.b.MATCH_CONSTRAINT) {
                    next.f25744v = 2;
                }
                if (next.t() > BitmapDescriptorFactory.HUE_RED) {
                    e.b bVar7 = e.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == e.b.WRAP_CONTENT || bVar6 == e.b.FIXED)) {
                        next.f25742u = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == e.b.WRAP_CONTENT || bVar5 == e.b.FIXED)) {
                        next.f25744v = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (next.f25742u == 0) {
                            next.f25742u = 3;
                        }
                        if (next.f25744v == 0) {
                            next.f25744v = 3;
                        }
                    }
                }
                e.b bVar8 = e.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && next.f25742u == 1 && (next.M.f25696f == null || next.O.f25696f == null)) {
                    bVar5 = e.b.WRAP_CONTENT;
                }
                e.b bVar9 = bVar5;
                if (bVar6 == bVar8 && next.f25744v == 1 && (next.N.f25696f == null || next.P.f25696f == null)) {
                    bVar6 = e.b.WRAP_CONTENT;
                }
                e.b bVar10 = bVar6;
                l lVar = next.f25708d;
                lVar.f27543d = bVar9;
                int i13 = next.f25742u;
                lVar.f27540a = i13;
                n nVar = next.f25710e;
                nVar.f27543d = bVar10;
                int i14 = next.f25744v;
                nVar.f27540a = i14;
                e.b bVar11 = e.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == e.b.FIXED || bVar9 == e.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == e.b.FIXED || bVar10 == e.b.WRAP_CONTENT)) {
                    int W = next.W();
                    if (bVar9 == bVar11) {
                        i11 = (fVar.W() - next.M.f25697g) - next.O.f25697g;
                        bVar = e.b.FIXED;
                    } else {
                        i11 = W;
                        bVar = bVar9;
                    }
                    int v11 = next.v();
                    if (bVar10 == bVar11) {
                        i12 = (fVar.v() - next.N.f25697g) - next.P.f25697g;
                        bVar2 = e.b.FIXED;
                    } else {
                        i12 = v11;
                        bVar2 = bVar10;
                    }
                    l(next, bVar, i11, bVar2, i12);
                    next.f25708d.f27544e.d(next.W());
                    next.f25710e.f27544e.d(next.v());
                    next.f25702a = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = e.b.WRAP_CONTENT) || bVar10 == e.b.FIXED)) {
                        if (i13 == 3) {
                            if (bVar10 == bVar4) {
                                l(next, bVar4, 0, bVar4, 0);
                            }
                            int v12 = next.v();
                            e.b bVar12 = e.b.FIXED;
                            l(next, bVar12, (int) ((v12 * next.f25705b0) + 0.5f), bVar12, v12);
                            next.f25708d.f27544e.d(next.W());
                            next.f25710e.f27544e.d(next.v());
                            next.f25702a = true;
                        } else if (i13 == 1) {
                            l(next, bVar4, 0, bVar10, 0);
                            next.f25708d.f27544e.f27522m = next.W();
                        } else if (i13 == 2) {
                            e.b[] bVarArr2 = fVar.X;
                            e.b bVar13 = bVarArr2[0];
                            e.b bVar14 = e.b.FIXED;
                            if (bVar13 == bVar14 || bVarArr2[0] == bVar11) {
                                l(next, bVar14, (int) ((next.f25749z * fVar.W()) + 0.5f), bVar10, next.v());
                                next.f25708d.f27544e.d(next.W());
                                next.f25710e.f27544e.d(next.v());
                                next.f25702a = true;
                            }
                        } else {
                            f3.d[] dVarArr = next.U;
                            if (dVarArr[0].f25696f == null || dVarArr[1].f25696f == null) {
                                l(next, bVar4, 0, bVar10, 0);
                                next.f25708d.f27544e.d(next.W());
                                next.f25710e.f27544e.d(next.v());
                                next.f25702a = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = e.b.WRAP_CONTENT) || bVar9 == e.b.FIXED)) {
                        if (i14 == 3) {
                            if (bVar9 == bVar3) {
                                l(next, bVar3, 0, bVar3, 0);
                            }
                            int W2 = next.W();
                            float f11 = next.f25705b0;
                            if (next.u() == -1) {
                                f11 = 1.0f / f11;
                            }
                            e.b bVar15 = e.b.FIXED;
                            l(next, bVar15, W2, bVar15, (int) ((W2 * f11) + 0.5f));
                            next.f25708d.f27544e.d(next.W());
                            next.f25710e.f27544e.d(next.v());
                            next.f25702a = true;
                        } else if (i14 == 1) {
                            l(next, bVar9, 0, bVar3, 0);
                            next.f25710e.f27544e.f27522m = next.v();
                        } else if (i14 == 2) {
                            e.b[] bVarArr3 = fVar.X;
                            e.b bVar16 = bVarArr3[1];
                            e.b bVar17 = e.b.FIXED;
                            if (bVar16 == bVar17 || bVarArr3[1] == bVar11) {
                                l(next, bVar9, next.W(), bVar17, (int) ((next.C * fVar.v()) + 0.5f));
                                next.f25708d.f27544e.d(next.W());
                                next.f25710e.f27544e.d(next.v());
                                next.f25702a = true;
                            }
                        } else {
                            f3.d[] dVarArr2 = next.U;
                            if (dVarArr2[2].f25696f == null || dVarArr2[3].f25696f == null) {
                                l(next, bVar3, 0, bVar10, 0);
                                next.f25708d.f27544e.d(next.W());
                                next.f25710e.f27544e.d(next.v());
                                next.f25702a = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i13 == 1 || i14 == 1) {
                            e.b bVar18 = e.b.WRAP_CONTENT;
                            l(next, bVar18, 0, bVar18, 0);
                            next.f25708d.f27544e.f27522m = next.W();
                            next.f25710e.f27544e.f27522m = next.v();
                        } else if (i14 == 2 && i13 == 2) {
                            e.b[] bVarArr4 = fVar.X;
                            e.b bVar19 = bVarArr4[0];
                            e.b bVar20 = e.b.FIXED;
                            if (bVar19 == bVar20 && bVarArr4[1] == bVar20) {
                                l(next, bVar20, (int) ((next.f25749z * fVar.W()) + 0.5f), bVar20, (int) ((next.C * fVar.v()) + 0.5f));
                                next.f25708d.f27544e.d(next.W());
                                next.f25710e.f27544e.d(next.v());
                                next.f25702a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int e(f3.f fVar, int i11) {
        int size = this.f27509h.size();
        long j11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            j11 = Math.max(j11, this.f27509h.get(i12).b(fVar, i11));
        }
        return (int) j11;
    }

    private void i(p pVar, int i11, ArrayList<m> arrayList) {
        for (d dVar : pVar.f27547h.f27520k) {
            if (dVar instanceof f) {
                a((f) dVar, i11, 0, pVar.f27548i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f27547h, i11, 0, pVar.f27548i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f27548i.f27520k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i11, 1, pVar.f27547h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f27548i, i11, 1, pVar.f27547h, arrayList, null);
            }
        }
        if (i11 == 1) {
            for (d dVar3 : ((n) pVar).f27531k.f27520k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i11, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(f3.e eVar, e.b bVar, int i11, e.b bVar2, int i12) {
        b.a aVar = this.f27508g;
        aVar.f27490a = bVar;
        aVar.f27491b = bVar2;
        aVar.f27492c = i11;
        aVar.f27493d = i12;
        this.f27507f.b(eVar, aVar);
        eVar.j1(this.f27508g.f27494e);
        eVar.K0(this.f27508g.f27495f);
        eVar.J0(this.f27508g.f27497h);
        eVar.z0(this.f27508g.f27496g);
    }

    public void c() {
        d(this.f27506e);
        this.f27509h.clear();
        m.f27528c = 0;
        i(this.f27502a.f25708d, 0, this.f27509h);
        i(this.f27502a.f25710e, 1, this.f27509h);
        this.f27503b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f27505d.f25708d.f();
        this.f27505d.f25710e.f();
        arrayList.add(this.f27505d.f25708d);
        arrayList.add(this.f27505d.f25710e);
        Iterator<f3.e> it2 = this.f27505d.f25762x0.iterator();
        HashSet hashSet = null;
        while (it2.hasNext()) {
            f3.e next = it2.next();
            if (next instanceof f3.g) {
                arrayList.add(new j(next));
            } else {
                if (next.i0()) {
                    if (next.f25704b == null) {
                        next.f25704b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f25704b);
                } else {
                    arrayList.add(next.f25708d);
                }
                if (next.k0()) {
                    if (next.f25706c == null) {
                        next.f25706c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f25706c);
                } else {
                    arrayList.add(next.f25710e);
                }
                if (next instanceof f3.i) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            it3.next().f();
        }
        Iterator<p> it4 = arrayList.iterator();
        while (it4.hasNext()) {
            p next2 = it4.next();
            if (next2.f27541b != this.f27505d) {
                next2.d();
            }
        }
    }

    public boolean f(boolean z11) {
        boolean z12;
        boolean z13 = true;
        boolean z14 = z11 & true;
        if (this.f27503b || this.f27504c) {
            Iterator<f3.e> it2 = this.f27502a.f25762x0.iterator();
            while (it2.hasNext()) {
                f3.e next = it2.next();
                next.l();
                next.f25702a = false;
                next.f25708d.r();
                next.f25710e.q();
            }
            this.f27502a.l();
            f3.f fVar = this.f27502a;
            fVar.f25702a = false;
            fVar.f25708d.r();
            this.f27502a.f25710e.q();
            this.f27504c = false;
        }
        if (b(this.f27505d)) {
            return false;
        }
        this.f27502a.l1(0);
        this.f27502a.m1(0);
        e.b s11 = this.f27502a.s(0);
        e.b s12 = this.f27502a.s(1);
        if (this.f27503b) {
            c();
        }
        int X = this.f27502a.X();
        int Y = this.f27502a.Y();
        this.f27502a.f25708d.f27547h.d(X);
        this.f27502a.f25710e.f27547h.d(Y);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (s11 == bVar || s12 == bVar) {
            if (z14) {
                Iterator<p> it3 = this.f27506e.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    } else if (!it3.next().m()) {
                        z14 = false;
                        break;
                    }
                }
            }
            if (z14 && s11 == e.b.WRAP_CONTENT) {
                this.f27502a.O0(e.b.FIXED);
                f3.f fVar2 = this.f27502a;
                fVar2.j1(e(fVar2, 0));
                f3.f fVar3 = this.f27502a;
                fVar3.f25708d.f27544e.d(fVar3.W());
            }
            if (z14 && s12 == e.b.WRAP_CONTENT) {
                this.f27502a.f1(e.b.FIXED);
                f3.f fVar4 = this.f27502a;
                fVar4.K0(e(fVar4, 1));
                f3.f fVar5 = this.f27502a;
                fVar5.f25710e.f27544e.d(fVar5.v());
            }
        }
        f3.f fVar6 = this.f27502a;
        e.b[] bVarArr = fVar6.X;
        e.b bVar2 = bVarArr[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == e.b.MATCH_PARENT) {
            int W = fVar6.W() + X;
            this.f27502a.f25708d.f27548i.d(W);
            this.f27502a.f25708d.f27544e.d(W - X);
            m();
            f3.f fVar7 = this.f27502a;
            e.b[] bVarArr2 = fVar7.X;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == e.b.MATCH_PARENT) {
                int v11 = fVar7.v() + Y;
                this.f27502a.f25710e.f27548i.d(v11);
                this.f27502a.f25710e.f27544e.d(v11 - Y);
            }
            m();
            z12 = true;
        } else {
            z12 = false;
        }
        Iterator<p> it4 = this.f27506e.iterator();
        while (it4.hasNext()) {
            p next2 = it4.next();
            if (next2.f27541b != this.f27502a || next2.f27546g) {
                next2.e();
            }
        }
        Iterator<p> it5 = this.f27506e.iterator();
        while (it5.hasNext()) {
            p next3 = it5.next();
            if (z12 || next3.f27541b != this.f27502a) {
                if (!next3.f27547h.f27519j || ((!next3.f27548i.f27519j && !(next3 instanceof j)) || (!next3.f27544e.f27519j && !(next3 instanceof c) && !(next3 instanceof j)))) {
                    z13 = false;
                    break;
                }
            }
        }
        this.f27502a.O0(s11);
        this.f27502a.f1(s12);
        return z13;
    }

    public boolean g(boolean z11) {
        if (this.f27503b) {
            Iterator<f3.e> it2 = this.f27502a.f25762x0.iterator();
            while (it2.hasNext()) {
                f3.e next = it2.next();
                next.l();
                next.f25702a = false;
                l lVar = next.f25708d;
                lVar.f27544e.f27519j = false;
                lVar.f27546g = false;
                lVar.r();
                n nVar = next.f25710e;
                nVar.f27544e.f27519j = false;
                nVar.f27546g = false;
                nVar.q();
            }
            this.f27502a.l();
            f3.f fVar = this.f27502a;
            fVar.f25702a = false;
            l lVar2 = fVar.f25708d;
            lVar2.f27544e.f27519j = false;
            lVar2.f27546g = false;
            lVar2.r();
            n nVar2 = this.f27502a.f25710e;
            nVar2.f27544e.f27519j = false;
            nVar2.f27546g = false;
            nVar2.q();
            c();
        }
        if (b(this.f27505d)) {
            return false;
        }
        this.f27502a.l1(0);
        this.f27502a.m1(0);
        this.f27502a.f25708d.f27547h.d(0);
        this.f27502a.f25710e.f27547h.d(0);
        return true;
    }

    public boolean h(boolean z11, int i11) {
        boolean z12;
        e.b bVar;
        boolean z13 = true;
        boolean z14 = z11 & true;
        e.b s11 = this.f27502a.s(0);
        e.b s12 = this.f27502a.s(1);
        int X = this.f27502a.X();
        int Y = this.f27502a.Y();
        if (z14 && (s11 == (bVar = e.b.WRAP_CONTENT) || s12 == bVar)) {
            Iterator<p> it2 = this.f27506e.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                p next = it2.next();
                if (next.f27545f == i11 && !next.m()) {
                    z14 = false;
                    break;
                }
            }
            if (i11 == 0) {
                if (z14 && s11 == e.b.WRAP_CONTENT) {
                    this.f27502a.O0(e.b.FIXED);
                    f3.f fVar = this.f27502a;
                    fVar.j1(e(fVar, 0));
                    f3.f fVar2 = this.f27502a;
                    fVar2.f25708d.f27544e.d(fVar2.W());
                }
            } else if (z14 && s12 == e.b.WRAP_CONTENT) {
                this.f27502a.f1(e.b.FIXED);
                f3.f fVar3 = this.f27502a;
                fVar3.K0(e(fVar3, 1));
                f3.f fVar4 = this.f27502a;
                fVar4.f25710e.f27544e.d(fVar4.v());
            }
        }
        if (i11 == 0) {
            f3.f fVar5 = this.f27502a;
            e.b[] bVarArr = fVar5.X;
            if (bVarArr[0] == e.b.FIXED || bVarArr[0] == e.b.MATCH_PARENT) {
                int W = fVar5.W() + X;
                this.f27502a.f25708d.f27548i.d(W);
                this.f27502a.f25708d.f27544e.d(W - X);
                z12 = true;
            }
            z12 = false;
        } else {
            f3.f fVar6 = this.f27502a;
            e.b[] bVarArr2 = fVar6.X;
            if (bVarArr2[1] == e.b.FIXED || bVarArr2[1] == e.b.MATCH_PARENT) {
                int v11 = fVar6.v() + Y;
                this.f27502a.f25710e.f27548i.d(v11);
                this.f27502a.f25710e.f27544e.d(v11 - Y);
                z12 = true;
            }
            z12 = false;
        }
        m();
        Iterator<p> it3 = this.f27506e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f27545f == i11 && (next2.f27541b != this.f27502a || next2.f27546g)) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f27506e.iterator();
        while (it4.hasNext()) {
            p next3 = it4.next();
            if (next3.f27545f == i11 && (z12 || next3.f27541b != this.f27502a)) {
                if (!next3.f27547h.f27519j || !next3.f27548i.f27519j || (!(next3 instanceof c) && !next3.f27544e.f27519j)) {
                    z13 = false;
                    break;
                }
            }
        }
        this.f27502a.O0(s11);
        this.f27502a.f1(s12);
        return z13;
    }

    public void j() {
        this.f27503b = true;
    }

    public void k() {
        this.f27504c = true;
    }

    public void m() {
        g gVar;
        Iterator<f3.e> it2 = this.f27502a.f25762x0.iterator();
        while (it2.hasNext()) {
            f3.e next = it2.next();
            if (!next.f25702a) {
                e.b[] bVarArr = next.X;
                boolean z11 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i11 = next.f25742u;
                int i12 = next.f25744v;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z12 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i11 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i12 == 1)) {
                    z11 = true;
                }
                g gVar2 = next.f25708d.f27544e;
                boolean z13 = gVar2.f27519j;
                g gVar3 = next.f25710e.f27544e;
                boolean z14 = gVar3.f27519j;
                if (z13 && z14) {
                    e.b bVar4 = e.b.FIXED;
                    l(next, bVar4, gVar2.f27516g, bVar4, gVar3.f27516g);
                    next.f25702a = true;
                } else if (z13 && z11) {
                    l(next, e.b.FIXED, gVar2.f27516g, bVar3, gVar3.f27516g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f25710e.f27544e.f27522m = next.v();
                    } else {
                        next.f25710e.f27544e.d(next.v());
                        next.f25702a = true;
                    }
                } else if (z14 && z12) {
                    l(next, bVar3, gVar2.f27516g, e.b.FIXED, gVar3.f27516g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f25708d.f27544e.f27522m = next.W();
                    } else {
                        next.f25708d.f27544e.d(next.W());
                        next.f25702a = true;
                    }
                }
                if (next.f25702a && (gVar = next.f25710e.f27532l) != null) {
                    gVar.d(next.n());
                }
            }
        }
    }

    public void n(b.InterfaceC0524b interfaceC0524b) {
        this.f27507f = interfaceC0524b;
    }
}