package expo.modules.kotlin.modules;

import android.content.Intent;
import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Intent;", "it", "Lvz/b0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ModuleDefinitionBuilder$OnNewIntent$1 extends u implements l<Intent, b0> {
    final /* synthetic */ l<Intent, b0> $body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModuleDefinitionBuilder$OnNewIntent$1(l<? super Intent, b0> lVar) {
        super(1);
        this.$body = lVar;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(Intent intent) {
        invoke2(intent);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Intent it2) {
        s.g(it2, "it");
        this.$body.invoke(it2);
    }
}