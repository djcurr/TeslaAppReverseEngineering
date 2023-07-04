package a20;

import h00.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import k20.d0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.types.checker.h;
import kotlin.reflect.jvm.internal.impl.types.checker.q;
import n00.g;
import s20.b;
import t00.h;
import u10.f;
import u20.k;
import w00.a0;
import w00.i;
import w00.i0;
import w00.v0;
import wz.v;
import wz.w;
import wz.x;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a20.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0007a<N> implements b.c {

        /* renamed from: a  reason: collision with root package name */
        public static final C0007a<N> f136a = new C0007a<>();

        C0007a() {
        }

        @Override // s20.b.c
        /* renamed from: b */
        public final Iterable<v0> a(v0 v0Var) {
            int t11;
            Collection<v0> d11 = v0Var.d();
            t11 = x.t(d11, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (v0 v0Var2 : d11) {
                arrayList.add(v0Var2.a());
            }
            return arrayList;
        }
    }

    /* loaded from: classes5.dex */
    /* synthetic */ class b extends o implements l<v0, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f137a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: d */
        public final Boolean invoke(v0 p02) {
            s.g(p02, "p0");
            return Boolean.valueOf(p02.u0());
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.jvm.internal.f
        public final g getOwner() {
            return m0.b(v0.class);
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c<N> implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f138a;

        c(boolean z11) {
            this.f138a = z11;
        }

        @Override // s20.b.c
        /* renamed from: b */
        public final Iterable<kotlin.reflect.jvm.internal.impl.descriptors.b> a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            List i11;
            if (this.f138a) {
                bVar = bVar == null ? null : bVar.a();
            }
            Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> d11 = bVar != null ? bVar.d() : null;
            if (d11 == null) {
                i11 = w.i();
                return i11;
            }
            return d11;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends b.AbstractC1109b<kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l0<kotlin.reflect.jvm.internal.impl.descriptors.b> f139a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> f140b;

        /* JADX WARN: Multi-variable type inference failed */
        d(l0<kotlin.reflect.jvm.internal.impl.descriptors.b> l0Var, l<? super kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> lVar) {
            this.f139a = l0Var;
            this.f140b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s20.b.AbstractC1109b, s20.b.d
        /* renamed from: d */
        public void b(kotlin.reflect.jvm.internal.impl.descriptors.b current) {
            s.g(current, "current");
            if (this.f139a.f34916a == null && this.f140b.invoke(current).booleanValue()) {
                this.f139a.f34916a = current;
            }
        }

        @Override // s20.b.d
        /* renamed from: e */
        public boolean c(kotlin.reflect.jvm.internal.impl.descriptors.b current) {
            s.g(current, "current");
            return this.f139a.f34916a == null;
        }

        @Override // s20.b.d
        /* renamed from: f */
        public kotlin.reflect.jvm.internal.impl.descriptors.b a() {
            return this.f139a.f34916a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends u implements l<i, i> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f141a = new e();

        e() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final i invoke(i it2) {
            s.g(it2, "it");
            return it2.b();
        }
    }

    static {
        s.f(f.f("value"), "identifier(\"value\")");
    }

    public static final boolean a(v0 v0Var) {
        List d11;
        s.g(v0Var, "<this>");
        d11 = v.d(v0Var);
        Boolean e11 = s20.b.e(d11, C0007a.f136a, b.f137a);
        s.f(e11, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return e11.booleanValue();
    }

    public static final y10.g<?> b(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        s.g(cVar, "<this>");
        return (y10.g) wz.u.c0(cVar.g().values());
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.b c(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, boolean z11, l<? super kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> predicate) {
        List d11;
        s.g(bVar, "<this>");
        s.g(predicate, "predicate");
        l0 l0Var = new l0();
        d11 = v.d(bVar);
        return (kotlin.reflect.jvm.internal.impl.descriptors.b) s20.b.b(d11, new c(z11), new d(l0Var, predicate));
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.b d(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, boolean z11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return c(bVar, z11, lVar);
    }

    public static final u10.c e(i iVar) {
        s.g(iVar, "<this>");
        u10.d j11 = j(iVar);
        if (!j11.f()) {
            j11 = null;
        }
        if (j11 == null) {
            return null;
        }
        return j11.l();
    }

    public static final w00.c f(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        s.g(cVar, "<this>");
        w00.e n11 = cVar.getType().H0().n();
        if (n11 instanceof w00.c) {
            return (w00.c) n11;
        }
        return null;
    }

    public static final h g(i iVar) {
        s.g(iVar, "<this>");
        return l(iVar).l();
    }

    public static final u10.b h(w00.e eVar) {
        i b11;
        u10.b h11;
        if (eVar == null || (b11 = eVar.b()) == null) {
            return null;
        }
        if (b11 instanceof a0) {
            return new u10.b(((a0) b11).e(), eVar.getName());
        }
        if (!(b11 instanceof w00.f) || (h11 = h((w00.e) b11)) == null) {
            return null;
        }
        return h11.d(eVar.getName());
    }

    public static final u10.c i(i iVar) {
        s.g(iVar, "<this>");
        u10.c n11 = w10.d.n(iVar);
        s.f(n11, "getFqNameSafe(this)");
        return n11;
    }

    public static final u10.d j(i iVar) {
        s.g(iVar, "<this>");
        u10.d m11 = w10.d.m(iVar);
        s.f(m11, "getFqName(this)");
        return m11;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.checker.h k(w00.x xVar) {
        s.g(xVar, "<this>");
        q qVar = (q) xVar.l0(kotlin.reflect.jvm.internal.impl.types.checker.i.a());
        kotlin.reflect.jvm.internal.impl.types.checker.h hVar = qVar == null ? null : (kotlin.reflect.jvm.internal.impl.types.checker.h) qVar.a();
        return hVar == null ? h.a.f35151a : hVar;
    }

    public static final w00.x l(i iVar) {
        s.g(iVar, "<this>");
        w00.x g11 = w10.d.g(iVar);
        s.f(g11, "getContainingModule(this)");
        return g11;
    }

    public static final u20.h<i> m(i iVar) {
        s.g(iVar, "<this>");
        return k.p(n(iVar), 1);
    }

    public static final u20.h<i> n(i iVar) {
        s.g(iVar, "<this>");
        return k.k(iVar, e.f141a);
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.b o(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        s.g(bVar, "<this>");
        if (bVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.g) {
            i0 correspondingProperty = ((kotlin.reflect.jvm.internal.impl.descriptors.g) bVar).U();
            s.f(correspondingProperty, "correspondingProperty");
            return correspondingProperty;
        }
        return bVar;
    }

    public static final w00.c p(w00.c cVar) {
        s.g(cVar, "<this>");
        for (d0 d0Var : cVar.n().H0().a()) {
            if (!t00.h.b0(d0Var)) {
                w00.e n11 = d0Var.H0().n();
                if (w10.d.w(n11)) {
                    Objects.requireNonNull(n11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (w00.c) n11;
                }
            }
        }
        return null;
    }

    public static final boolean q(w00.x xVar) {
        s.g(xVar, "<this>");
        q qVar = (q) xVar.l0(kotlin.reflect.jvm.internal.impl.types.checker.i.a());
        return (qVar == null ? null : (kotlin.reflect.jvm.internal.impl.types.checker.h) qVar.a()) != null;
    }

    public static final w00.c r(w00.x xVar, u10.c topLevelClassFqName, d10.b location) {
        s.g(xVar, "<this>");
        s.g(topLevelClassFqName, "topLevelClassFqName");
        s.g(location, "location");
        topLevelClassFqName.d();
        u10.c e11 = topLevelClassFqName.e();
        s.f(e11, "topLevelClassFqName.parent()");
        d20.h m11 = xVar.R(e11).m();
        f g11 = topLevelClassFqName.g();
        s.f(g11, "topLevelClassFqName.shortName()");
        w00.e e12 = m11.e(g11, location);
        if (e12 instanceof w00.c) {
            return (w00.c) e12;
        }
        return null;
    }
}