package e10;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class e extends g0 {

    /* renamed from: m  reason: collision with root package name */
    public static final e f24440m = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.h f24441a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
            super(1);
            this.f24441a = hVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.b it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            Map<String, u10.f> j11 = g0.f24453a.j();
            String d11 = n10.t.d(this.f24441a);
            Objects.requireNonNull(j11, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
            return Boolean.valueOf(j11.containsKey(d11));
        }
    }

    private e() {
    }

    public final u10.f i(kotlin.reflect.jvm.internal.impl.descriptors.h functionDescriptor) {
        kotlin.jvm.internal.s.g(functionDescriptor, "functionDescriptor");
        Map<String, u10.f> j11 = g0.f24453a.j();
        String d11 = n10.t.d(functionDescriptor);
        if (d11 == null) {
            return null;
        }
        return j11.get(d11);
    }

    public final boolean j(kotlin.reflect.jvm.internal.impl.descriptors.h functionDescriptor) {
        kotlin.jvm.internal.s.g(functionDescriptor, "functionDescriptor");
        return t00.h.e0(functionDescriptor) && a20.a.d(functionDescriptor, false, new a(functionDescriptor), 1, null) != null;
    }

    public final boolean k(kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
        kotlin.jvm.internal.s.g(hVar, "<this>");
        return kotlin.jvm.internal.s.c(hVar.getName().b(), "removeAt") && kotlin.jvm.internal.s.c(n10.t.d(hVar), g0.f24453a.h().b());
    }
}