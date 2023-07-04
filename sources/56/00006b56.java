package expo.modules.kotlin.views;

import android.view.View;
import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "ViewType", "it", "Lvz/b0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ViewManagerDefinitionBuilder$OnViewDestroys$1 extends u implements l<View, b0> {
    final /* synthetic */ l<ViewType, b0> $body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewManagerDefinitionBuilder$OnViewDestroys$1(l<? super ViewType, b0> lVar) {
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
        l<ViewType, b0> lVar = this.$body;
        s.m(1, "ViewType");
        lVar.invoke(it2);
    }
}