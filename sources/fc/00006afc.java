package expo.modules.kotlin.modules;

import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u00012\u0010\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"R", "P0", "", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ModuleDefinitionBuilder$function$4 extends u implements l<Object[], Object> {
    final /* synthetic */ l<P0, R> $body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModuleDefinitionBuilder$function$4(l<? super P0, ? extends R> lVar) {
        super(1);
        this.$body = lVar;
    }

    @Override // h00.l
    public final Object invoke(Object[] it2) {
        s.g(it2, "it");
        l<P0, R> lVar = this.$body;
        Object obj = it2[0];
        s.m(1, "P0");
        return lVar.invoke(obj);
    }
}