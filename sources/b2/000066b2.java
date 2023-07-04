package e10;

import e10.g0;

/* loaded from: classes5.dex */
public final class f extends g0 {

    /* renamed from: m  reason: collision with root package name */
    public static final f f24442m = new f();

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f24443a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.b it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(f.f24442m.j(it2));
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f24444a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.b it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf((it2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && f.f24442m.j(it2));
        }
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        boolean T;
        T = wz.e0.T(g0.f24453a.e(), n10.t.d(bVar));
        return T;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.e k(kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
        kotlin.jvm.internal.s.g(functionDescriptor, "functionDescriptor");
        f fVar = f24442m;
        u10.f name = functionDescriptor.getName();
        kotlin.jvm.internal.s.f(name, "functionDescriptor.name");
        if (fVar.l(name)) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.e) a20.a.d(functionDescriptor, false, a.f24443a, 1, null);
        }
        return null;
    }

    public static final g0.b m(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        kotlin.jvm.internal.s.g(bVar, "<this>");
        g0.a aVar = g0.f24453a;
        if (aVar.d().contains(bVar.getName())) {
            kotlin.reflect.jvm.internal.impl.descriptors.b d11 = a20.a.d(bVar, false, b.f24444a, 1, null);
            String d12 = d11 == null ? null : n10.t.d(d11);
            if (d12 == null) {
                return null;
            }
            return aVar.l(d12);
        }
        return null;
    }

    public final boolean l(u10.f fVar) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        return g0.f24453a.d().contains(fVar);
    }
}