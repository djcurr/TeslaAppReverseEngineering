package expo.modules.kotlin.modules;

import h00.l;
import h00.s;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u0001\"\u0006\b\u0002\u0010\u0002\u0018\u0001\"\u0006\b\u0003\u0010\u0003\u0018\u0001\"\u0006\b\u0004\u0010\u0004\u0018\u0001\"\u0006\b\u0005\u0010\u0005\u0018\u00012\u0010\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006H\n"}, d2 = {"R", "P0", "P1", "P2", "P3", "P4", "", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ModuleDefinitionBuilder$AsyncFunction$12 extends u implements l<Object[], Object> {
    final /* synthetic */ s<P0, P1, P2, P3, P4, R> $body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModuleDefinitionBuilder$AsyncFunction$12(s<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends R> sVar) {
        super(1);
        this.$body = sVar;
    }

    @Override // h00.l
    public final Object invoke(Object[] it2) {
        kotlin.jvm.internal.s.g(it2, "it");
        s<P0, P1, P2, P3, P4, R> sVar = this.$body;
        Object obj = it2[0];
        kotlin.jvm.internal.s.m(1, "P0");
        Object obj2 = it2[1];
        kotlin.jvm.internal.s.m(1, "P1");
        Object obj3 = it2[2];
        kotlin.jvm.internal.s.m(1, "P2");
        Object obj4 = it2[3];
        kotlin.jvm.internal.s.m(1, "P3");
        Object obj5 = it2[4];
        kotlin.jvm.internal.s.m(1, "P4");
        return sVar.invoke(obj, obj2, obj3, obj4, obj5);
    }
}