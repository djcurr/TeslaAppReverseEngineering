package e10;

import java.util.Collection;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f24467a = new i();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f24468a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.b it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(i.f24467a.b(it2));
        }
    }

    private i() {
    }

    private final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        boolean T;
        T = wz.e0.T(g.f24448a.c(), a20.a.e(bVar));
        if (T && bVar.h().isEmpty()) {
            return true;
        }
        if (t00.h.e0(bVar)) {
            Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> overriddenDescriptors = bVar.d();
            kotlin.jvm.internal.s.f(overriddenDescriptors, "overriddenDescriptors");
            if (!overriddenDescriptors.isEmpty()) {
                for (kotlin.reflect.jvm.internal.impl.descriptors.b it2 : overriddenDescriptors) {
                    i iVar = f24467a;
                    kotlin.jvm.internal.s.f(it2, "it");
                    if (iVar.b(it2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final String a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        u10.f fVar;
        kotlin.jvm.internal.s.g(bVar, "<this>");
        t00.h.e0(bVar);
        kotlin.reflect.jvm.internal.impl.descriptors.b d11 = a20.a.d(a20.a.o(bVar), false, a.f24468a, 1, null);
        if (d11 == null || (fVar = g.f24448a.a().get(a20.a.i(d11))) == null) {
            return null;
        }
        return fVar.b();
    }

    public final boolean b(kotlin.reflect.jvm.internal.impl.descriptors.b callableMemberDescriptor) {
        kotlin.jvm.internal.s.g(callableMemberDescriptor, "callableMemberDescriptor");
        if (g.f24448a.d().contains(callableMemberDescriptor.getName())) {
            return c(callableMemberDescriptor);
        }
        return false;
    }
}