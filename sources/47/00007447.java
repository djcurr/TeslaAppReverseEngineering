package i10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k20.d0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import l10.q;
import s20.b;
import u20.p;
import vz.b0;
import w00.i0;
import wz.e0;
import wz.v;
import wz.w;
import wz.x;
import wz.x0;

/* loaded from: classes5.dex */
public final class k extends l {

    /* renamed from: n  reason: collision with root package name */
    private final l10.g f29679n;

    /* renamed from: o  reason: collision with root package name */
    private final f f29680o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends u implements h00.l<q, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f29681a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean mo12invoke(q it2) {
            s.g(it2, "it");
            return Boolean.valueOf(it2.k());
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends u implements h00.l<d20.h, Collection<? extends i0>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u10.f f29682a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u10.f fVar) {
            super(1);
            this.f29682a = fVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Collection<? extends i0> mo12invoke(d20.h it2) {
            s.g(it2, "it");
            return it2.a(this.f29682a, d10.d.WHEN_GET_SUPER_MEMBERS);
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends u implements h00.l<d20.h, Collection<? extends u10.f>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f29683a = new c();

        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Collection<u10.f> mo12invoke(d20.h it2) {
            s.g(it2, "it");
            return it2.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d<N> implements b.c {

        /* renamed from: a  reason: collision with root package name */
        public static final d<N> f29684a = new d<>();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends u implements h00.l<d0, w00.c> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f29685a = new a();

            a() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: a */
            public final w00.c mo12invoke(d0 d0Var) {
                w00.e n11 = d0Var.H0().n();
                if (n11 instanceof w00.c) {
                    return (w00.c) n11;
                }
                return null;
            }
        }

        d() {
        }

        @Override // s20.b.c
        /* renamed from: b */
        public final Iterable<w00.c> a(w00.c cVar) {
            u20.h S;
            u20.h C;
            Iterable<w00.c> n11;
            Collection<d0> a11 = cVar.mo234i().a();
            s.f(a11, "it.typeConstructor.supertypes");
            S = e0.S(a11);
            C = p.C(S, a.f29685a);
            n11 = p.n(C);
            return n11;
        }
    }

    /* loaded from: classes5.dex */
    public static final class e extends b.AbstractC1109b<w00.c, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w00.c f29686a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Set<R> f29687b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.l<d20.h, Collection<R>> f29688c;

        /* JADX WARN: Multi-variable type inference failed */
        e(w00.c cVar, Set<R> set, h00.l<? super d20.h, ? extends Collection<? extends R>> lVar) {
            this.f29686a = cVar;
            this.f29687b = set;
            this.f29688c = lVar;
        }

        @Override // s20.b.d
        public /* bridge */ /* synthetic */ Object a() {
            e();
            return b0.f54756a;
        }

        @Override // s20.b.d
        /* renamed from: d */
        public boolean c(w00.c current) {
            s.g(current, "current");
            if (current == this.f29686a) {
                return true;
            }
            d20.h mo138h0 = current.mo138h0();
            s.f(mo138h0, "current.staticScope");
            if (mo138h0 instanceof l) {
                this.f29687b.addAll((Collection) this.f29688c.mo12invoke(mo138h0));
                return false;
            }
            return true;
        }

        public void e() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h10.h c11, l10.g jClass, f ownerDescriptor) {
        super(c11);
        s.g(c11, "c");
        s.g(jClass, "jClass");
        s.g(ownerDescriptor, "ownerDescriptor");
        this.f29679n = jClass;
        this.f29680o = ownerDescriptor;
    }

    private final <R> Set<R> N(w00.c cVar, Set<R> set, h00.l<? super d20.h, ? extends Collection<? extends R>> lVar) {
        List d11;
        d11 = v.d(cVar);
        s20.b.b(d11, d.f29684a, new e(cVar, set, lVar));
        return set;
    }

    private final i0 P(i0 i0Var) {
        int t11;
        List U;
        if (i0Var.getKind().isReal()) {
            return i0Var;
        }
        Collection<? extends i0> d11 = i0Var.d();
        s.f(d11, "this.overriddenDescriptors");
        t11 = x.t(d11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (i0 it2 : d11) {
            s.f(it2, "it");
            arrayList.add(P(it2));
        }
        U = e0.U(arrayList);
        return (i0) wz.u.C0(U);
    }

    private final Set<kotlin.reflect.jvm.internal.impl.descriptors.h> Q(u10.f fVar, w00.c cVar) {
        Set<kotlin.reflect.jvm.internal.impl.descriptors.h> S0;
        Set<kotlin.reflect.jvm.internal.impl.descriptors.h> d11;
        k b11 = g10.h.b(cVar);
        if (b11 == null) {
            d11 = x0.d();
            return d11;
        }
        S0 = e0.S0(b11.c(fVar, d10.d.WHEN_GET_SUPER_MEMBERS));
        return S0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i10.j
    /* renamed from: M */
    public i10.a p() {
        return new i10.a(this.f29679n, a.f29681a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i10.j
    /* renamed from: O */
    public f C() {
        return this.f29680o;
    }

    @Override // d20.i, d20.k
    /* renamed from: e */
    public w00.e mo137e(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        return null;
    }

    @Override // i10.j
    protected Set<u10.f> l(d20.d kindFilter, h00.l<? super u10.f, Boolean> lVar) {
        Set<u10.f> d11;
        s.g(kindFilter, "kindFilter");
        d11 = x0.d();
        return d11;
    }

    @Override // i10.j
    protected Set<u10.f> n(d20.d kindFilter, h00.l<? super u10.f, Boolean> lVar) {
        Set<u10.f> R0;
        List l11;
        s.g(kindFilter, "kindFilter");
        R0 = e0.R0(y().mo11invoke().a());
        k b11 = g10.h.b(C());
        Set<u10.f> b12 = b11 == null ? null : b11.b();
        if (b12 == null) {
            b12 = x0.d();
        }
        R0.addAll(b12);
        if (this.f29679n.w()) {
            l11 = w.l(t00.k.f51308c, t00.k.f51307b);
            R0.addAll(l11);
        }
        R0.addAll(w().a().w().e(C()));
        return R0;
    }

    @Override // i10.j
    protected void o(Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> result, u10.f name) {
        s.g(result, "result");
        s.g(name, "name");
        w().a().w().c(C(), name, result);
    }

    @Override // i10.j
    protected void r(Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> result, u10.f name) {
        s.g(result, "result");
        s.g(name, "name");
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> e11 = f10.a.e(name, Q(name, C()), result, C(), w().a().c(), w().a().k().a());
        s.f(e11, "resolveOverridesForStati….overridingUtil\n        )");
        result.addAll(e11);
        if (this.f29679n.w()) {
            if (s.c(name, t00.k.f51308c)) {
                kotlin.reflect.jvm.internal.impl.descriptors.h d11 = w10.c.d(C());
                s.f(d11, "createEnumValueOfMethod(ownerDescriptor)");
                result.add(d11);
            } else if (s.c(name, t00.k.f51307b)) {
                kotlin.reflect.jvm.internal.impl.descriptors.h e12 = w10.c.e(C());
                s.f(e12, "createEnumValuesMethod(ownerDescriptor)");
                result.add(e12);
            }
        }
    }

    @Override // i10.l, i10.j
    protected void s(u10.f name, Collection<i0> result) {
        s.g(name, "name");
        s.g(result, "result");
        Set N = N(C(), new LinkedHashSet(), new b(name));
        if (!result.isEmpty()) {
            Collection<? extends i0> e11 = f10.a.e(name, N, result, C(), w().a().c(), w().a().k().a());
            s.f(e11, "resolveOverridesForStati…ingUtil\n                )");
            result.addAll(e11);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : N) {
            i0 P = P((i0) obj);
            Object obj2 = linkedHashMap.get(P);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(P, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Collection e12 = f10.a.e(name, (Collection) entry.getValue(), result, C(), w().a().c(), w().a().k().a());
            s.f(e12, "resolveOverridesForStati…ingUtil\n                )");
            wz.b0.z(arrayList, e12);
        }
        result.addAll(arrayList);
    }

    @Override // i10.j
    protected Set<u10.f> t(d20.d kindFilter, h00.l<? super u10.f, Boolean> lVar) {
        Set<u10.f> R0;
        s.g(kindFilter, "kindFilter");
        R0 = e0.R0(y().mo11invoke().d());
        N(C(), R0, c.f29683a);
        return R0;
    }
}