package i20;

import i20.g;
import java.util.Collection;
import java.util.List;
import k20.c1;
import k20.d0;
import k20.d1;
import k20.f0;
import k20.k0;
import k20.k1;
import kotlin.jvm.internal.s;
import p10.r;
import w00.r0;
import w00.s0;
import w00.t0;
import y00.i0;

/* loaded from: classes5.dex */
public final class l extends y00.d implements g {

    /* renamed from: h  reason: collision with root package name */
    private final j20.n f29795h;

    /* renamed from: i  reason: collision with root package name */
    private final r f29796i;

    /* renamed from: j  reason: collision with root package name */
    private final r10.c f29797j;

    /* renamed from: k  reason: collision with root package name */
    private final r10.g f29798k;

    /* renamed from: l  reason: collision with root package name */
    private final r10.i f29799l;

    /* renamed from: m  reason: collision with root package name */
    private final f f29800m;

    /* renamed from: n  reason: collision with root package name */
    private Collection<? extends i0> f29801n;

    /* renamed from: o  reason: collision with root package name */
    private k0 f29802o;

    /* renamed from: p  reason: collision with root package name */
    private k0 f29803p;

    /* renamed from: q  reason: collision with root package name */
    private List<? extends s0> f29804q;

    /* renamed from: t  reason: collision with root package name */
    private k0 f29805t;

    /* renamed from: w  reason: collision with root package name */
    private g.a f29806w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(j20.n r13, w00.i r14, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r15, u10.f r16, w00.q r17, p10.r r18, r10.c r19, r10.g r20, r10.i r21, i20.f r22) {
        /*
            r12 = this;
            r6 = r12
            r7 = r13
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.s.g(r13, r0)
            java.lang.String r0 = "containingDeclaration"
            r1 = r14
            kotlin.jvm.internal.s.g(r14, r0)
            java.lang.String r0 = "annotations"
            r2 = r15
            kotlin.jvm.internal.s.g(r15, r0)
            java.lang.String r0 = "name"
            r3 = r16
            kotlin.jvm.internal.s.g(r3, r0)
            java.lang.String r0 = "visibility"
            r5 = r17
            kotlin.jvm.internal.s.g(r5, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.s.g(r8, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.s.g(r9, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.s.g(r10, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.s.g(r11, r0)
            w00.n0 r4 = w00.n0.f55303a
            java.lang.String r0 = "NO_SOURCE"
            kotlin.jvm.internal.s.f(r4, r0)
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f29795h = r7
            r6.f29796i = r8
            r6.f29797j = r9
            r6.f29798k = r10
            r6.f29799l = r11
            r0 = r22
            r6.f29800m = r0
            i20.g$a r0 = i20.g.a.COMPATIBLE
            r6.f29806w = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i20.l.<init>(j20.n, w00.i, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g, u10.f, w00.q, p10.r, r10.c, r10.g, r10.i, i20.f):void");
    }

    @Override // i20.g
    public r10.g C() {
        return this.f29798k;
    }

    @Override // i20.g
    public List<r10.h> D0() {
        return g.b.a(this);
    }

    @Override // w00.r0
    public k0 E() {
        k0 k0Var = this.f29803p;
        if (k0Var != null) {
            return k0Var;
        }
        s.x("expandedType");
        return null;
    }

    @Override // i20.g
    public r10.i F() {
        return this.f29799l;
    }

    @Override // i20.g
    public r10.c G() {
        return this.f29797j;
    }

    @Override // i20.g
    public f H() {
        return this.f29800m;
    }

    @Override // y00.d
    protected List<s0> I0() {
        List list = this.f29804q;
        if (list == null) {
            s.x("typeConstructorParameters");
            return null;
        }
        return list;
    }

    @Override // y00.d
    protected j20.n K() {
        return this.f29795h;
    }

    public g.a K0() {
        return this.f29806w;
    }

    @Override // i20.g
    /* renamed from: L0 */
    public r mo139b0() {
        return this.f29796i;
    }

    public final void M0(List<? extends s0> declaredTypeParameters, k0 underlyingType, k0 expandedType, g.a isExperimentalCoroutineInReleaseEnvironment) {
        s.g(declaredTypeParameters, "declaredTypeParameters");
        s.g(underlyingType, "underlyingType");
        s.g(expandedType, "expandedType");
        s.g(isExperimentalCoroutineInReleaseEnvironment, "isExperimentalCoroutineInReleaseEnvironment");
        J0(declaredTypeParameters);
        this.f29802o = underlyingType;
        this.f29803p = expandedType;
        this.f29804q = t0.d(this);
        this.f29805t = F0();
        this.f29801n = H0();
        this.f29806w = isExperimentalCoroutineInReleaseEnvironment;
    }

    @Override // w00.p0
    /* renamed from: N0 */
    public r0 mo156c(d1 substitutor) {
        s.g(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        j20.n K = K();
        w00.i containingDeclaration = mo223b();
        s.f(containingDeclaration, "containingDeclaration");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = mo140getAnnotations();
        s.f(annotations, "annotations");
        u10.f name = getName();
        s.f(name, "name");
        l lVar = new l(K, containingDeclaration, annotations, name, getVisibility(), mo139b0(), G(), C(), F(), H());
        List<s0> o11 = o();
        k0 o02 = o0();
        k1 k1Var = k1.INVARIANT;
        d0 n11 = substitutor.n(o02, k1Var);
        s.f(n11, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        k0 a11 = c1.a(n11);
        d0 n12 = substitutor.n(E(), k1Var);
        s.f(n12, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        lVar.M0(o11, a11, c1.a(n12), K0());
        return lVar;
    }

    @Override // w00.e
    public k0 n() {
        k0 k0Var = this.f29805t;
        if (k0Var == null) {
            s.x("defaultTypeImpl");
            return null;
        }
        return k0Var;
    }

    @Override // w00.r0
    public k0 o0() {
        k0 k0Var = this.f29802o;
        if (k0Var != null) {
            return k0Var;
        }
        s.x("underlyingType");
        return null;
    }

    @Override // w00.r0
    public w00.c q() {
        if (f0.a(E())) {
            return null;
        }
        w00.e n11 = E().H0().n();
        if (n11 instanceof w00.c) {
            return (w00.c) n11;
        }
        return null;
    }
}