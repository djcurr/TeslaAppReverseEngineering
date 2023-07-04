package expo.modules.kotlin.modules;

import h00.l;
import h00.r;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u0001\"\u0006\b\u0002\u0010\u0002\u0018\u0001\"\u0006\b\u0003\u0010\u0003\u0018\u0001\"\u0006\b\u0004\u0010\u0004\u0018\u00012\u0010\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005H\n"}, d2 = {"R", "P0", "P1", "P2", "P3", "", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ModuleDefinitionBuilder$function$10 extends u implements l<Object[], Object> {
    final /* synthetic */ r<P0, P1, P2, P3, R> $body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModuleDefinitionBuilder$function$10(r<? super P0, ? super P1, ? super P2, ? super P3, ? extends R> rVar) {
        super(1);
        this.$body = rVar;
    }

    @Override // h00.l
    public final Object invoke(Object[] it2) {
        s.g(it2, "it");
        r<P0, P1, P2, P3, R> rVar = this.$body;
        Object obj = it2[0];
        s.m(1, "P0");
        Object obj2 = it2[1];
        s.m(1, "P1");
        Object obj3 = it2[2];
        s.m(1, "P2");
        Object obj4 = it2[3];
        s.m(1, "P3");
        return rVar.invoke(obj, obj2, obj3, obj4);
    }
}