package i10;

import ch.qos.logback.core.CoreConstants;
import d20.c;
import e10.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k20.d0;
import k20.f1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import l10.b0;
import l10.n;
import l10.r;
import l10.y;
import n10.t;
import vz.p;
import vz.v;
import w00.i0;
import w00.l0;
import w00.q;
import w00.s0;
import w00.v0;
import wz.e0;
import wz.k0;
import wz.r0;
import wz.w;
import wz.x;
import y00.c0;

/* loaded from: classes5.dex */
public abstract class j extends d20.i {

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f29646m = {m0.j(new f0(m0.b(j.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), m0.j(new f0(m0.b(j.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), m0.j(new f0(m0.b(j.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b  reason: collision with root package name */
    private final h10.h f29647b;

    /* renamed from: c  reason: collision with root package name */
    private final j f29648c;

    /* renamed from: d  reason: collision with root package name */
    private final j20.i<Collection<w00.i>> f29649d;

    /* renamed from: e  reason: collision with root package name */
    private final j20.i<i10.b> f29650e;

    /* renamed from: f  reason: collision with root package name */
    private final j20.g<u10.f, Collection<kotlin.reflect.jvm.internal.impl.descriptors.h>> f29651f;

    /* renamed from: g  reason: collision with root package name */
    private final j20.h<u10.f, i0> f29652g;

    /* renamed from: h  reason: collision with root package name */
    private final j20.g<u10.f, Collection<kotlin.reflect.jvm.internal.impl.descriptors.h>> f29653h;

    /* renamed from: i  reason: collision with root package name */
    private final j20.i f29654i;

    /* renamed from: j  reason: collision with root package name */
    private final j20.i f29655j;

    /* renamed from: k  reason: collision with root package name */
    private final j20.i f29656k;

    /* renamed from: l  reason: collision with root package name */
    private final j20.g<u10.f, List<i0>> f29657l;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final d0 f29658a;

        /* renamed from: b  reason: collision with root package name */
        private final d0 f29659b;

        /* renamed from: c  reason: collision with root package name */
        private final List<v0> f29660c;

        /* renamed from: d  reason: collision with root package name */
        private final List<s0> f29661d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f29662e;

        /* renamed from: f  reason: collision with root package name */
        private final List<String> f29663f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(d0 returnType, d0 d0Var, List<? extends v0> valueParameters, List<? extends s0> typeParameters, boolean z11, List<String> errors) {
            s.g(returnType, "returnType");
            s.g(valueParameters, "valueParameters");
            s.g(typeParameters, "typeParameters");
            s.g(errors, "errors");
            this.f29658a = returnType;
            this.f29659b = d0Var;
            this.f29660c = valueParameters;
            this.f29661d = typeParameters;
            this.f29662e = z11;
            this.f29663f = errors;
        }

        public final List<String> a() {
            return this.f29663f;
        }

        public final boolean b() {
            return this.f29662e;
        }

        public final d0 c() {
            return this.f29659b;
        }

        public final d0 d() {
            return this.f29658a;
        }

        public final List<s0> e() {
            return this.f29661d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return s.c(this.f29658a, aVar.f29658a) && s.c(this.f29659b, aVar.f29659b) && s.c(this.f29660c, aVar.f29660c) && s.c(this.f29661d, aVar.f29661d) && this.f29662e == aVar.f29662e && s.c(this.f29663f, aVar.f29663f);
            }
            return false;
        }

        public final List<v0> f() {
            return this.f29660c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f29658a.hashCode() * 31;
            d0 d0Var = this.f29659b;
            int hashCode2 = (((((hashCode + (d0Var == null ? 0 : d0Var.hashCode())) * 31) + this.f29660c.hashCode()) * 31) + this.f29661d.hashCode()) * 31;
            boolean z11 = this.f29662e;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return ((hashCode2 + i11) * 31) + this.f29663f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f29658a + ", receiverType=" + this.f29659b + ", valueParameters=" + this.f29660c + ", typeParameters=" + this.f29661d + ", hasStableParameterNames=" + this.f29662e + ", errors=" + this.f29663f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<v0> f29664a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f29665b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends v0> descriptors, boolean z11) {
            s.g(descriptors, "descriptors");
            this.f29664a = descriptors;
            this.f29665b = z11;
        }

        public final List<v0> a() {
            return this.f29664a;
        }

        public final boolean b() {
            return this.f29665b;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends u implements h00.a<Collection<? extends w00.i>> {
        c() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Collection<w00.i> invoke() {
            return j.this.m(d20.d.f23458o, d20.h.f23478a.a());
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends u implements h00.a<Set<? extends u10.f>> {
        d() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Set<u10.f> invoke() {
            return j.this.l(d20.d.f23460q, null);
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends u implements h00.l<u10.f, i0> {
        e() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final i0 invoke(u10.f name) {
            s.g(name, "name");
            if (j.this.B() != null) {
                return (i0) j.this.B().f29652g.invoke(name);
            }
            n e11 = j.this.y().invoke().e(name);
            if (e11 == null || e11.H()) {
                return null;
            }
            return j.this.J(e11);
        }
    }

    /* loaded from: classes5.dex */
    static final class f extends u implements h00.l<u10.f, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> {
        f() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> invoke(u10.f name) {
            s.g(name, "name");
            if (j.this.B() != null) {
                return (Collection) j.this.B().f29651f.invoke(name);
            }
            ArrayList arrayList = new ArrayList();
            for (r rVar : j.this.y().invoke().f(name)) {
                g10.e I = j.this.I(rVar);
                if (j.this.G(I)) {
                    j.this.w().a().h().e(rVar, I);
                    arrayList.add(I);
                }
            }
            j.this.o(arrayList, name);
            return arrayList;
        }
    }

    /* loaded from: classes5.dex */
    static final class g extends u implements h00.a<i10.b> {
        g() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final i10.b invoke() {
            return j.this.p();
        }
    }

    /* loaded from: classes5.dex */
    static final class h extends u implements h00.a<Set<? extends u10.f>> {
        h() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Set<u10.f> invoke() {
            return j.this.n(d20.d.f23461r, null);
        }
    }

    /* loaded from: classes5.dex */
    static final class i extends u implements h00.l<u10.f, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> {
        i() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> invoke(u10.f name) {
            List O0;
            s.g(name, "name");
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) j.this.f29651f.invoke(name));
            j.this.L(linkedHashSet);
            j.this.r(linkedHashSet, name);
            O0 = e0.O0(j.this.w().a().r().e(j.this.w(), linkedHashSet));
            return O0;
        }
    }

    /* renamed from: i10.j$j  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0569j extends u implements h00.l<u10.f, List<? extends i0>> {
        C0569j() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final List<i0> invoke(u10.f name) {
            List<i0> O0;
            List<i0> O02;
            s.g(name, "name");
            ArrayList arrayList = new ArrayList();
            s20.a.a(arrayList, j.this.f29652g.invoke(name));
            j.this.s(name, arrayList);
            if (w10.d.t(j.this.C())) {
                O02 = e0.O0(arrayList);
                return O02;
            }
            O0 = e0.O0(j.this.w().a().r().e(j.this.w(), arrayList));
            return O0;
        }
    }

    /* loaded from: classes5.dex */
    static final class k extends u implements h00.a<Set<? extends u10.f>> {
        k() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Set<u10.f> invoke() {
            return j.this.t(d20.d.f23462s, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class l extends u implements h00.a<y10.g<?>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f29676b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c0 f29677c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(n nVar, c0 c0Var) {
            super(0);
            this.f29676b = nVar;
            this.f29677c = c0Var;
        }

        @Override // h00.a
        /* renamed from: a */
        public final y10.g<?> invoke() {
            return j.this.w().a().g().a(this.f29676b, this.f29677c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class m extends u implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.h, kotlin.reflect.jvm.internal.impl.descriptors.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f29678a = new m();

        m() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final kotlin.reflect.jvm.internal.impl.descriptors.a invoke(kotlin.reflect.jvm.internal.impl.descriptors.h selectMostSpecificInEachOverridableGroup) {
            s.g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    public /* synthetic */ j(h10.h hVar, j jVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, (i11 & 2) != 0 ? null : jVar);
    }

    private final Set<u10.f> A() {
        return (Set) j20.m.a(this.f29654i, this, f29646m[0]);
    }

    private final Set<u10.f> D() {
        return (Set) j20.m.a(this.f29655j, this, f29646m[1]);
    }

    private final d0 E(n nVar) {
        boolean z11 = false;
        d0 o11 = this.f29647b.g().o(nVar.getType(), j10.d.d(f10.k.COMMON, false, null, 3, null));
        if ((t00.h.q0(o11) || t00.h.t0(o11)) && F(nVar) && nVar.N()) {
            z11 = true;
        }
        if (z11) {
            d0 o12 = f1.o(o11);
            s.f(o12, "makeNotNullable(propertyType)");
            return o12;
        }
        return o11;
    }

    private final boolean F(n nVar) {
        return nVar.isFinal() && nVar.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i0 J(n nVar) {
        List<? extends s0> i11;
        c0 u11 = u(nVar);
        u11.Q0(null, null, null, null);
        d0 E = E(nVar);
        i11 = w.i();
        u11.V0(E, i11, z(), null);
        if (w10.d.K(u11, u11.getType())) {
            u11.G0(this.f29647b.e().i(new l(nVar, u11)));
        }
        this.f29647b.a().h().d(nVar, u11);
        return u11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(Set<kotlin.reflect.jvm.internal.impl.descriptors.h> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String c11 = t.c((kotlin.reflect.jvm.internal.impl.descriptors.h) obj, false, false, 2, null);
            Object obj2 = linkedHashMap.get(c11);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(c11, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> a11 = w10.l.a(list, m.f29678a);
                set.removeAll(list);
                set.addAll(a11);
            }
        }
    }

    private final c0 u(n nVar) {
        g10.f X0 = g10.f.X0(C(), h10.f.a(this.f29647b, nVar), kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL, h0.a(nVar.getVisibility()), !nVar.isFinal(), nVar.getName(), this.f29647b.a().t().a(nVar), F(nVar));
        s.f(X0, "create(\n            owne…d.isFinalStatic\n        )");
        return X0;
    }

    private final Set<u10.f> x() {
        return (Set) j20.m.a(this.f29656k, this, f29646m[2]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final j B() {
        return this.f29648c;
    }

    protected abstract w00.i C();

    protected boolean G(g10.e eVar) {
        s.g(eVar, "<this>");
        return true;
    }

    protected abstract a H(r rVar, List<? extends s0> list, d0 d0Var, List<? extends v0> list2);

    /* JADX INFO: Access modifiers changed from: protected */
    public final g10.e I(r method) {
        int t11;
        Map<? extends a.InterfaceC0649a<?>, ?> i11;
        s.g(method, "method");
        g10.e l12 = g10.e.l1(C(), h10.f.a(this.f29647b, method), method.getName(), this.f29647b.a().t().a(method), this.f29650e.invoke().b(method.getName()) != null && method.h().isEmpty());
        s.f(l12, "createJavaMethod(\n      …eters.isEmpty()\n        )");
        h10.h f11 = h10.a.f(this.f29647b, l12, method, 0, 4, null);
        List<y> typeParameters = method.getTypeParameters();
        t11 = x.t(typeParameters, 10);
        List<? extends s0> arrayList = new ArrayList<>(t11);
        for (y yVar : typeParameters) {
            s0 a11 = f11.f().a(yVar);
            s.e(a11);
            arrayList.add(a11);
        }
        b K = K(f11, l12, method.h());
        a H = H(method, arrayList, q(method, f11), K.a());
        d0 c11 = H.c();
        l0 f12 = c11 == null ? null : w10.c.f(l12, c11, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b());
        l0 z11 = z();
        List<s0> e11 = H.e();
        List<v0> f13 = H.f();
        d0 d11 = H.d();
        kotlin.reflect.jvm.internal.impl.descriptors.f a12 = kotlin.reflect.jvm.internal.impl.descriptors.f.Companion.a(false, method.isAbstract(), !method.isFinal());
        q a13 = h0.a(method.getVisibility());
        if (H.c() != null) {
            i11 = r0.f(v.a(g10.e.O, wz.u.b0(K.a())));
        } else {
            i11 = wz.s0.i();
        }
        l12.k1(f12, z11, e11, f13, d11, a12, a13, i11);
        l12.o1(H.b(), K.b());
        if (!H.a().isEmpty()) {
            f11.a().s().a(l12, H.a());
        }
        return l12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b K(h10.h hVar, kotlin.reflect.jvm.internal.impl.descriptors.e function, List<? extends b0> jValueParameters) {
        Iterable<k0> U0;
        int t11;
        List O0;
        p a11;
        u10.f name;
        h10.h c11 = hVar;
        s.g(c11, "c");
        s.g(function, "function");
        s.g(jValueParameters, "jValueParameters");
        U0 = e0.U0(jValueParameters);
        t11 = x.t(U0, 10);
        ArrayList arrayList = new ArrayList(t11);
        boolean z11 = false;
        boolean z12 = false;
        for (k0 k0Var : U0) {
            int a12 = k0Var.a();
            b0 b0Var = (b0) k0Var.b();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a13 = h10.f.a(c11, b0Var);
            j10.a d11 = j10.d.d(f10.k.COMMON, z11, null, 3, null);
            if (b0Var.b()) {
                l10.x type = b0Var.getType();
                l10.f fVar = type instanceof l10.f ? (l10.f) type : null;
                if (fVar != null) {
                    d0 k11 = hVar.g().k(fVar, d11, true);
                    a11 = v.a(k11, hVar.d().l().k(k11));
                } else {
                    throw new AssertionError(s.p("Vararg parameter should be an array: ", b0Var));
                }
            } else {
                a11 = v.a(hVar.g().o(b0Var.getType(), d11), null);
            }
            d0 d0Var = (d0) a11.a();
            d0 d0Var2 = (d0) a11.b();
            if (s.c(function.getName().b(), "equals") && jValueParameters.size() == 1 && s.c(hVar.d().l().I(), d0Var)) {
                name = u10.f.f("other");
            } else {
                name = b0Var.getName();
                if (name == null) {
                    z12 = true;
                }
                if (name == null) {
                    name = u10.f.f(s.p("p", Integer.valueOf(a12)));
                    s.f(name, "identifier(\"p$index\")");
                }
            }
            u10.f fVar2 = name;
            s.f(fVar2, "if (function.name.asStri…(\"p$index\")\n            }");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new y00.l0(function, null, a12, a13, fVar2, d0Var, false, false, false, d0Var2, hVar.a().t().a(b0Var)));
            arrayList = arrayList2;
            z12 = z12;
            z11 = z11;
            c11 = hVar;
        }
        O0 = e0.O0(arrayList);
        return new b(O0, z12);
    }

    @Override // d20.i, d20.h
    public Collection<i0> a(u10.f name, d10.b location) {
        List i11;
        s.g(name, "name");
        s.g(location, "location");
        if (d().contains(name)) {
            return this.f29657l.invoke(name);
        }
        i11 = w.i();
        return i11;
    }

    @Override // d20.i, d20.h
    public Set<u10.f> b() {
        return A();
    }

    @Override // d20.i, d20.h
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f name, d10.b location) {
        List i11;
        s.g(name, "name");
        s.g(location, "location");
        if (b().contains(name)) {
            return this.f29653h.invoke(name);
        }
        i11 = w.i();
        return i11;
    }

    @Override // d20.i, d20.h
    public Set<u10.f> d() {
        return D();
    }

    @Override // d20.i, d20.h
    public Set<u10.f> f() {
        return x();
    }

    @Override // d20.i, d20.k
    public Collection<w00.i> g(d20.d kindFilter, h00.l<? super u10.f, Boolean> nameFilter) {
        s.g(kindFilter, "kindFilter");
        s.g(nameFilter, "nameFilter");
        return this.f29649d.invoke();
    }

    protected abstract Set<u10.f> l(d20.d dVar, h00.l<? super u10.f, Boolean> lVar);

    protected final List<w00.i> m(d20.d kindFilter, h00.l<? super u10.f, Boolean> nameFilter) {
        List<w00.i> O0;
        s.g(kindFilter, "kindFilter");
        s.g(nameFilter, "nameFilter");
        d10.d dVar = d10.d.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kindFilter.a(d20.d.f23446c.c())) {
            for (u10.f fVar : l(kindFilter, nameFilter)) {
                if (nameFilter.invoke(fVar).booleanValue()) {
                    s20.a.a(linkedHashSet, e(fVar, dVar));
                }
            }
        }
        if (kindFilter.a(d20.d.f23446c.d()) && !kindFilter.l().contains(c.a.f23443a)) {
            for (u10.f fVar2 : n(kindFilter, nameFilter)) {
                if (nameFilter.invoke(fVar2).booleanValue()) {
                    linkedHashSet.addAll(c(fVar2, dVar));
                }
            }
        }
        if (kindFilter.a(d20.d.f23446c.i()) && !kindFilter.l().contains(c.a.f23443a)) {
            for (u10.f fVar3 : t(kindFilter, nameFilter)) {
                if (nameFilter.invoke(fVar3).booleanValue()) {
                    linkedHashSet.addAll(a(fVar3, dVar));
                }
            }
        }
        O0 = e0.O0(linkedHashSet);
        return O0;
    }

    protected abstract Set<u10.f> n(d20.d dVar, h00.l<? super u10.f, Boolean> lVar);

    protected void o(Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> result, u10.f name) {
        s.g(result, "result");
        s.g(name, "name");
    }

    protected abstract i10.b p();

    /* JADX INFO: Access modifiers changed from: protected */
    public final d0 q(r method, h10.h c11) {
        s.g(method, "method");
        s.g(c11, "c");
        return c11.g().o(method.getReturnType(), j10.d.d(f10.k.COMMON, method.O().p(), null, 2, null));
    }

    protected abstract void r(Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> collection, u10.f fVar);

    protected abstract void s(u10.f fVar, Collection<i0> collection);

    protected abstract Set<u10.f> t(d20.d dVar, h00.l<? super u10.f, Boolean> lVar);

    public String toString() {
        return s.p("Lazy scope for ", C());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final j20.i<Collection<w00.i>> v() {
        return this.f29649d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final h10.h w() {
        return this.f29647b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final j20.i<i10.b> y() {
        return this.f29650e;
    }

    protected abstract l0 z();

    public j(h10.h c11, j jVar) {
        List i11;
        s.g(c11, "c");
        this.f29647b = c11;
        this.f29648c = jVar;
        j20.n e11 = c11.e();
        c cVar = new c();
        i11 = w.i();
        this.f29649d = e11.f(cVar, i11);
        this.f29650e = c11.e().b(new g());
        this.f29651f = c11.e().e(new f());
        this.f29652g = c11.e().h(new e());
        this.f29653h = c11.e().e(new i());
        this.f29654i = c11.e().b(new h());
        this.f29655j = c11.e().b(new k());
        this.f29656k = c11.e().b(new d());
        this.f29657l = c11.e().e(new C0569j());
    }
}