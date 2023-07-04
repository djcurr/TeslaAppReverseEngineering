package e10;

import k20.k0;
import w00.i0;

/* loaded from: classes5.dex */
public final class f0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f24445a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean mo12invoke(kotlin.reflect.jvm.internal.impl.descriptors.b it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(i.f24467a.b(a20.a.o(it2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f24446a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean mo12invoke(kotlin.reflect.jvm.internal.impl.descriptors.b it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(e.f24440m.j((kotlin.reflect.jvm.internal.impl.descriptors.h) it2));
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f24447a = new c();

        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean mo12invoke(kotlin.reflect.jvm.internal.impl.descriptors.b it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(t00.h.e0(it2) && f.m(it2) != null);
        }
    }

    public static final boolean a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        kotlin.jvm.internal.s.g(bVar, "<this>");
        return d(bVar) != null;
    }

    public static final String b(kotlin.reflect.jvm.internal.impl.descriptors.b callableMemberDescriptor) {
        u10.f i11;
        kotlin.jvm.internal.s.g(callableMemberDescriptor, "callableMemberDescriptor");
        kotlin.reflect.jvm.internal.impl.descriptors.b c11 = c(callableMemberDescriptor);
        kotlin.reflect.jvm.internal.impl.descriptors.b o11 = c11 == null ? null : a20.a.o(c11);
        if (o11 == null) {
            return null;
        }
        if (o11 instanceof i0) {
            return i.f24467a.a(o11);
        }
        if (!(o11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.h) || (i11 = e.f24440m.i((kotlin.reflect.jvm.internal.impl.descriptors.h) o11)) == null) {
            return null;
        }
        return i11.b();
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.b c(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        if (t00.h.e0(bVar)) {
            return d(bVar);
        }
        return null;
    }

    public static final <T extends kotlin.reflect.jvm.internal.impl.descriptors.b> T d(T t11) {
        kotlin.jvm.internal.s.g(t11, "<this>");
        if (g0.f24453a.g().contains(t11.getName()) || g.f24448a.d().contains(a20.a.o(t11).getName())) {
            if (t11 instanceof i0 ? true : t11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g) {
                return (T) a20.a.d(t11, false, a.f24445a, 1, null);
            }
            if (t11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.h) {
                return (T) a20.a.d(t11, false, b.f24446a, 1, null);
            }
            return null;
        }
        return null;
    }

    public static final <T extends kotlin.reflect.jvm.internal.impl.descriptors.b> T e(T t11) {
        kotlin.jvm.internal.s.g(t11, "<this>");
        T t12 = (T) d(t11);
        if (t12 == null) {
            f fVar = f.f24442m;
            u10.f name = t11.getName();
            kotlin.jvm.internal.s.f(name, "name");
            if (fVar.l(name)) {
                return (T) a20.a.d(t11, false, c.f24447a, 1, null);
            }
            return null;
        }
        return t12;
    }

    public static final boolean f(w00.c cVar, kotlin.reflect.jvm.internal.impl.descriptors.a specialCallableDescriptor) {
        kotlin.jvm.internal.s.g(cVar, "<this>");
        kotlin.jvm.internal.s.g(specialCallableDescriptor, "specialCallableDescriptor");
        k0 n11 = ((w00.c) specialCallableDescriptor.mo223b()).n();
        kotlin.jvm.internal.s.f(n11, "specialCallableDescripto…ssDescriptor).defaultType");
        w00.c s11 = w10.d.s(cVar);
        while (true) {
            if (s11 == null) {
                return false;
            }
            if (!(s11 instanceof g10.c)) {
                if (kotlin.reflect.jvm.internal.impl.types.checker.v.b(s11.n(), n11) != null) {
                    return !t00.h.e0(s11);
                }
            }
            s11 = w10.d.s(s11);
        }
    }

    public static final boolean g(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        kotlin.jvm.internal.s.g(bVar, "<this>");
        return a20.a.o(bVar).mo223b() instanceof g10.c;
    }

    public static final boolean h(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        kotlin.jvm.internal.s.g(bVar, "<this>");
        return g(bVar) || t00.h.e0(bVar);
    }
}