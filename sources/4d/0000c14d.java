package y00;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k20.b1;
import k20.d1;
import k20.f1;
import k20.k1;
import k20.w0;
import w00.s0;

/* loaded from: classes5.dex */
public class s extends t {

    /* renamed from: b  reason: collision with root package name */
    private final t f58904b;

    /* renamed from: c  reason: collision with root package name */
    private final d1 f58905c;

    /* renamed from: d  reason: collision with root package name */
    private d1 f58906d;

    /* renamed from: e  reason: collision with root package name */
    private List<s0> f58907e;

    /* renamed from: f  reason: collision with root package name */
    private List<s0> f58908f;

    /* renamed from: g  reason: collision with root package name */
    private w0 f58909g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements h00.l<s0, Boolean> {
        a(s sVar) {
        }

        @Override // h00.l
        /* renamed from: a */
        public Boolean mo12invoke(s0 s0Var) {
            return Boolean.valueOf(!s0Var.P());
        }
    }

    public s(t tVar, d1 d1Var) {
        this.f58904b = tVar;
        this.f58905c = d1Var;
    }

    private d1 F0() {
        List<s0> X;
        if (this.f58906d == null) {
            if (this.f58905c.k()) {
                this.f58906d = this.f58905c;
            } else {
                List<s0> parameters = this.f58904b.mo234i().getParameters();
                this.f58907e = new ArrayList(parameters.size());
                this.f58906d = k20.q.b(parameters, this.f58905c.j(), this, this.f58907e);
                X = wz.e0.X(this.f58907e, new a(this));
                this.f58908f = X;
            }
        }
        return this.f58906d;
    }

    private k20.k0 H0(k20.k0 k0Var) {
        return (k0Var == null || this.f58905c.k()) ? k0Var : (k20.k0) F0().p(k0Var, k1.INVARIANT);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void d0(int r15) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.s.d0(int):void");
    }

    @Override // w00.c
    public w00.b B() {
        return this.f58904b.B();
    }

    @Override // w00.c
    public boolean C0() {
        return this.f58904b.C0();
    }

    @Override // w00.c
    public w00.l0 E0() {
        throw new UnsupportedOperationException();
    }

    @Override // w00.p0
    /* renamed from: G0 */
    public w00.c mo156c(d1 d1Var) {
        if (d1Var == null) {
            d0(22);
        }
        return d1Var.k() ? this : new s(this, d1.h(d1Var.j(), F0().j()));
    }

    @Override // w00.c
    public d20.h I(b1 b1Var) {
        if (b1Var == null) {
            d0(10);
        }
        d20.h w11 = w(b1Var, a20.a.k(w10.d.g(this)));
        if (w11 == null) {
            d0(11);
        }
        return w11;
    }

    @Override // y00.t
    /* renamed from: M */
    public d20.h mo233M(kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
        if (hVar == null) {
            d0(13);
        }
        d20.h mo233M = this.f58904b.mo233M(hVar);
        if (this.f58905c.k()) {
            if (mo233M == null) {
                d0(14);
            }
            return mo233M;
        }
        return new d20.m(mo233M, F0());
    }

    @Override // w00.c
    public d20.h S() {
        d20.h S = this.f58904b.S();
        if (S == null) {
            d0(27);
        }
        return S;
    }

    @Override // w00.c
    public d20.h V() {
        d20.h mo233M = mo233M(a20.a.k(w10.d.g(this.f58904b)));
        if (mo233M == null) {
            d0(12);
        }
        return mo233M;
    }

    @Override // w00.u
    public boolean W() {
        return this.f58904b.W();
    }

    @Override // w00.c
    public boolean X() {
        return this.f58904b.X();
    }

    @Override // w00.c
    public boolean a0() {
        return this.f58904b.a0();
    }

    @Override // w00.c, w00.j, w00.i
    /* renamed from: b */
    public w00.i mo223b() {
        w00.i mo223b = this.f58904b.mo223b();
        if (mo223b == null) {
            d0(21);
        }
        return mo223b;
    }

    @Override // w00.l
    public w00.n0 f() {
        w00.n0 n0Var = w00.n0.f55303a;
        if (n0Var == null) {
            d0(28);
        }
        return n0Var;
    }

    @Override // w00.c
    public boolean f0() {
        return this.f58904b.f0();
    }

    @Override // w00.c
    /* renamed from: g */
    public Collection<w00.b> mo224g() {
        Collection<w00.b> mo224g = this.f58904b.mo224g();
        ArrayList arrayList = new ArrayList(mo224g.size());
        for (w00.b bVar : mo224g) {
            arrayList.add(((w00.b) bVar.s().mo249j(bVar.a()).mo247h(bVar.p()).mo241b(bVar.getVisibility()).mo256q(bVar.getKind()).mo250k(false).build()).mo156c(F0()));
        }
        return arrayList;
    }

    @Override // w00.u
    public boolean g0() {
        return this.f58904b.g0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    /* renamed from: getAnnotations */
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g mo140getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g mo140getAnnotations = this.f58904b.mo140getAnnotations();
        if (mo140getAnnotations == null) {
            d0(18);
        }
        return mo140getAnnotations;
    }

    @Override // w00.c
    public kotlin.reflect.jvm.internal.impl.descriptors.c getKind() {
        kotlin.reflect.jvm.internal.impl.descriptors.c kind = this.f58904b.getKind();
        if (kind == null) {
            d0(24);
        }
        return kind;
    }

    @Override // w00.y
    public u10.f getName() {
        u10.f name = this.f58904b.getName();
        if (name == null) {
            d0(19);
        }
        return name;
    }

    @Override // w00.c, w00.m, w00.u
    public w00.q getVisibility() {
        w00.q visibility = this.f58904b.getVisibility();
        if (visibility == null) {
            d0(26);
        }
        return visibility;
    }

    @Override // w00.c
    /* renamed from: h0 */
    public d20.h mo138h0() {
        d20.h mo138h0 = this.f58904b.mo138h0();
        if (mo138h0 == null) {
            d0(15);
        }
        return mo138h0;
    }

    @Override // w00.e
    /* renamed from: i */
    public w0 mo234i() {
        w0 mo234i = this.f58904b.mo234i();
        if (this.f58905c.k()) {
            if (mo234i == null) {
                d0(0);
            }
            return mo234i;
        }
        if (this.f58909g == null) {
            d1 F0 = F0();
            Collection<k20.d0> a11 = mo234i.a();
            ArrayList arrayList = new ArrayList(a11.size());
            for (k20.d0 d0Var : a11) {
                arrayList.add(F0.p(d0Var, k1.INVARIANT));
            }
            this.f58909g = new k20.j(this, this.f58907e, arrayList, j20.f.f33124e);
        }
        w0 w0Var = this.f58909g;
        if (w0Var == null) {
            d0(1);
        }
        return w0Var;
    }

    @Override // w00.c
    public w00.c i0() {
        return this.f58904b.i0();
    }

    @Override // w00.u
    public boolean isExternal() {
        return this.f58904b.isExternal();
    }

    @Override // w00.c
    public boolean isInline() {
        return this.f58904b.isInline();
    }

    @Override // w00.f
    public boolean j() {
        return this.f58904b.j();
    }

    @Override // w00.c, w00.e
    public k20.k0 n() {
        k20.k0 j11 = k20.e0.j(mo140getAnnotations(), mo234i(), f1.h(mo234i().getParameters()), false, V());
        if (j11 == null) {
            d0(16);
        }
        return j11;
    }

    @Override // w00.c, w00.f
    public List<s0> o() {
        F0();
        List<s0> list = this.f58908f;
        if (list == null) {
            d0(29);
        }
        return list;
    }

    @Override // w00.c, w00.u
    public kotlin.reflect.jvm.internal.impl.descriptors.f p() {
        kotlin.reflect.jvm.internal.impl.descriptors.f p11 = this.f58904b.p();
        if (p11 == null) {
            d0(25);
        }
        return p11;
    }

    @Override // w00.c
    public w00.t<k20.k0> t() {
        w00.t<k20.k0> t11 = this.f58904b.t();
        if (t11 == null) {
            return null;
        }
        return new w00.t<>(t11.a(), H0(t().b()));
    }

    @Override // w00.i
    public <R, D> R v0(w00.k<R, D> kVar, D d11) {
        return kVar.g(this, d11);
    }

    @Override // y00.t
    public d20.h w(b1 b1Var, kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
        if (b1Var == null) {
            d0(5);
        }
        if (hVar == null) {
            d0(6);
        }
        d20.h w11 = this.f58904b.w(b1Var, hVar);
        if (this.f58905c.k()) {
            if (w11 == null) {
                d0(7);
            }
            return w11;
        }
        return new d20.m(w11, F0());
    }

    @Override // w00.c
    /* renamed from: x */
    public Collection<w00.c> mo225x() {
        Collection<w00.c> mo225x = this.f58904b.mo225x();
        if (mo225x == null) {
            d0(30);
        }
        return mo225x;
    }

    @Override // w00.i
    public w00.c a() {
        w00.c a11 = this.f58904b.a();
        if (a11 == null) {
            d0(20);
        }
        return a11;
    }
}