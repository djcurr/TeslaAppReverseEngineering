package expo.modules.kotlin;

import h00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import v20.e1;
import v20.n0;
import v20.o0;
import v20.p0;
import v20.y2;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lv20/o0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ModuleRegistry$register$2 extends u implements a<o0> {
    final /* synthetic */ ModuleHolder $holder;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleRegistry$register$2(ModuleHolder moduleHolder) {
        super(0);
        this.$holder = moduleHolder;
    }

    @Override // h00.a
    public final o0 invoke() {
        return p0.a(e1.a().plus(y2.b(null, 1, null)).plus(new n0(this.$holder.getDefinition().getName())));
    }
}