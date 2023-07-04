package h30;

import e30.j;
import kotlin.jvm.internal.l0;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes5.dex */
public final class j0 {

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<JsonElement, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l0<JsonElement> f28850a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l0<JsonElement> l0Var) {
            super(1);
            this.f28850a = l0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(JsonElement it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            this.f28850a.f34916a = it2;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(JsonElement jsonElement) {
            a(jsonElement);
            return vz.b0.f54756a;
        }
    }

    public static final /* synthetic */ boolean a(e30.f fVar) {
        return b(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(e30.f fVar) {
        return (fVar.getKind() instanceof e30.e) || fVar.getKind() == j.b.f24589a;
    }

    public static final <T> JsonElement c(kotlinx.serialization.json.a aVar, T t11, c30.h<? super T> serializer) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        kotlin.jvm.internal.s.g(serializer, "serializer");
        l0 l0Var = new l0();
        new v(aVar, new a(l0Var)).F(serializer, t11);
        T t12 = l0Var.f34916a;
        if (t12 == null) {
            kotlin.jvm.internal.s.x("result");
            return null;
        }
        return (JsonElement) t12;
    }
}