package expo.modules.kotlin.modules;

import h00.l;
import h00.p;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u0001\"\u0006\b\u0002\u0010\u0002\u0018\u00012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003H\n¨\u0006\u0006"}, d2 = {"R", "P0", "P1", "", "", "it", "expo/modules/kotlin/modules/ModuleDefinitionBuilder$AsyncFunction$6", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$4 extends u implements l<Object[], Object> {
    final /* synthetic */ p $body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$4(p pVar) {
        super(1);
        this.$body = pVar;
    }

    @Override // h00.l
    public final Object invoke(Object[] it2) {
        s.g(it2, "it");
        p pVar = this.$body;
        Object obj = it2[0];
        s.m(1, "P0");
        Object obj2 = it2[1];
        s.m(1, "P1");
        return pVar.invoke(obj, obj2);
    }
}