package y00;

import d20.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k20.f1;
import k20.j1;
import k20.w0;
import w00.r0;
import w00.s0;
import y00.j0;

/* loaded from: classes5.dex */
public abstract class d extends k implements r0 {

    /* renamed from: e  reason: collision with root package name */
    private final w00.q f58777e;

    /* renamed from: f  reason: collision with root package name */
    private List<? extends s0> f58778f;

    /* renamed from: g  reason: collision with root package name */
    private final c f58779g;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<kotlin.reflect.jvm.internal.impl.types.checker.h, k20.k0> {
        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final k20.k0 mo12invoke(kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
            w00.e e11 = hVar.e(d.this);
            if (e11 == null) {
                return null;
            }
            return e11.n();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<j1, Boolean> {
        b() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
            if (((r5 instanceof w00.s0) && !kotlin.jvm.internal.s.c(((w00.s0) r5).mo223b(), r0)) != false) goto L9;
         */
        @Override // h00.l
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean mo12invoke(k20.j1 r5) {
            /*
                r4 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.s.f(r5, r0)
                boolean r0 = k20.f0.a(r5)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L2d
                y00.d r0 = y00.d.this
                k20.w0 r5 = r5.H0()
                w00.e r5 = r5.n()
                boolean r3 = r5 instanceof w00.s0
                if (r3 == 0) goto L29
                w00.s0 r5 = (w00.s0) r5
                w00.i r5 = r5.mo223b()
                boolean r5 = kotlin.jvm.internal.s.c(r5, r0)
                if (r5 != 0) goto L29
                r5 = r1
                goto L2a
            L29:
                r5 = r2
            L2a:
                if (r5 == 0) goto L2d
                goto L2e
            L2d:
                r1 = r2
            L2e:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: y00.d.b.mo12invoke(k20.j1):java.lang.Boolean");
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements w0 {
        c() {
        }

        @Override // k20.w0
        public Collection<k20.d0> a() {
            Collection<k20.d0> a11 = n().o0().H0().a();
            kotlin.jvm.internal.s.f(a11, "declarationDescriptor.un…pe.constructor.supertypes");
            return a11;
        }

        @Override // k20.w0
        /* renamed from: b */
        public r0 n() {
            return d.this;
        }

        @Override // k20.w0
        public List<s0> getParameters() {
            return d.this.I0();
        }

        @Override // k20.w0
        public t00.h l() {
            return a20.a.g(n());
        }

        @Override // k20.w0
        /* renamed from: m */
        public w0 mo154m(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
            kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this;
        }

        @Override // k20.w0
        public boolean o() {
            return true;
        }

        public String toString() {
            return "[typealias " + n().getName().b() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w00.i containingDeclaration, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, u10.f name, w00.n0 sourceElement, w00.q visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        kotlin.jvm.internal.s.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.s.g(annotations, "annotations");
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(sourceElement, "sourceElement");
        kotlin.jvm.internal.s.g(visibilityImpl, "visibilityImpl");
        this.f58777e = visibilityImpl;
        this.f58779g = new c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final k20.k0 F0() {
        w00.c q11 = q();
        d20.h V = q11 == null ? null : q11.V();
        if (V == null) {
            V = h.b.f23482b;
        }
        k20.k0 v11 = f1.v(this, V, new a());
        kotlin.jvm.internal.s.f(v11, "@OptIn(TypeRefinement::c…s)?.defaultType\n        }");
        return v11;
    }

    @Override // y00.k
    /* renamed from: G0 */
    public r0 mo238d0() {
        return (r0) super.mo238d0();
    }

    public final Collection<i0> H0() {
        List i11;
        w00.c q11 = q();
        if (q11 == null) {
            i11 = wz.w.i();
            return i11;
        }
        Collection<w00.b> mo224g = q11.mo224g();
        kotlin.jvm.internal.s.f(mo224g, "classDescriptor.constructors");
        ArrayList arrayList = new ArrayList();
        for (w00.b it2 : mo224g) {
            j0.a aVar = j0.P;
            j20.n K = K();
            kotlin.jvm.internal.s.f(it2, "it");
            i0 b11 = aVar.b(K, this, it2);
            if (b11 != null) {
                arrayList.add(b11);
            }
        }
        return arrayList;
    }

    protected abstract List<s0> I0();

    public final void J0(List<? extends s0> declaredTypeParameters) {
        kotlin.jvm.internal.s.g(declaredTypeParameters, "declaredTypeParameters");
        this.f58778f = declaredTypeParameters;
    }

    protected abstract j20.n K();

    @Override // w00.u
    public boolean W() {
        return false;
    }

    @Override // w00.u
    public boolean g0() {
        return false;
    }

    @Override // w00.m, w00.u
    public w00.q getVisibility() {
        return this.f58777e;
    }

    @Override // w00.e
    /* renamed from: i */
    public w0 mo234i() {
        return this.f58779g;
    }

    @Override // w00.u
    public boolean isExternal() {
        return false;
    }

    @Override // w00.f
    public boolean j() {
        return f1.c(o0(), new b());
    }

    @Override // w00.f
    public List<s0> o() {
        List list = this.f58778f;
        if (list == null) {
            kotlin.jvm.internal.s.x("declaredTypeParametersImpl");
            return null;
        }
        return list;
    }

    @Override // y00.j
    public String toString() {
        return kotlin.jvm.internal.s.p("typealias ", getName().b());
    }

    @Override // w00.i
    public <R, D> R v0(w00.k<R, D> visitor, D d11) {
        kotlin.jvm.internal.s.g(visitor, "visitor");
        return visitor.k(this, d11);
    }
}