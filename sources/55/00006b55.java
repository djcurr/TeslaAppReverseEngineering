package expo.modules.kotlin.views;

import android.view.View;
import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¨\u0006\u0004"}, d2 = {"Landroid/view/View;", "ViewType", "it", "Lvz/b0;", "expo/modules/kotlin/views/ViewManagerDefinitionBuilder$OnViewDestroys$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ViewManagerDefinitionBuilder$onViewDestroys$$inlined$OnViewDestroys$1 extends u implements l<View, b0> {
    final /* synthetic */ l $body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewManagerDefinitionBuilder$onViewDestroys$$inlined$OnViewDestroys$1(l lVar) {
        super(1);
        this.$body = lVar;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(View view) {
        invoke2(view);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View it2) {
        s.g(it2, "it");
        l lVar = this.$body;
        s.m(1, "ViewType");
        lVar.invoke(it2);
    }
}