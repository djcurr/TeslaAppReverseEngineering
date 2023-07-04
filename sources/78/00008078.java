package kotlinx.serialization.json;

import vz.b0;

/* loaded from: classes5.dex */
public final class m {
    public static final a a(a from, h00.l<? super c, b0> builderAction) {
        kotlin.jvm.internal.s.g(from, "from");
        kotlin.jvm.internal.s.g(builderAction, "builderAction");
        c cVar = new c(from);
        builderAction.invoke(cVar);
        return new l(cVar.a(), cVar.b());
    }

    public static /* synthetic */ a b(a aVar, h00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = a.f35616d;
        }
        return a(aVar, lVar);
    }
}