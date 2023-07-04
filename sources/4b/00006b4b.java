package expo.modules.kotlin.views;

import android.view.View;
import android.view.ViewGroup;
import h00.p;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\n¨\u0006\u0007"}, d2 = {"Landroid/view/ViewGroup;", "ParentViewType", "Landroid/view/View;", "ChildViewType", "view", "child", "Lvz/b0;", "expo/modules/kotlin/views/ViewGroupDefinitionBuilder$RemoveChildView$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ViewGroupDefinitionBuilder$removeChildView$$inlined$RemoveChildView$1 extends u implements p<ViewGroup, View, b0> {
    final /* synthetic */ p $body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewGroupDefinitionBuilder$removeChildView$$inlined$RemoveChildView$1(p pVar) {
        super(2);
        this.$body = pVar;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(ViewGroup viewGroup, View view) {
        invoke2(viewGroup, view);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ViewGroup view, View child) {
        s.g(view, "view");
        s.g(child, "child");
        p pVar = this.$body;
        s.m(1, "ParentViewType");
        s.m(1, "ChildViewType");
        pVar.invoke(view, child);
    }
}