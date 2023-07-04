package expo.modules.kotlin.views;

import android.view.View;
import android.view.ViewGroup;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\u00020\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\n"}, d2 = {"Landroid/view/ViewGroup;", "ParentViewType", "Landroid/view/View;", "ChildViewType", "parent", "child", "", "index", "Lvz/b0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ViewGroupDefinitionBuilder$AddChildView$1 extends u implements q<ViewGroup, View, Integer, b0> {
    final /* synthetic */ q<ParentViewType, ChildViewType, Integer, b0> $body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewGroupDefinitionBuilder$AddChildView$1(q<? super ParentViewType, ? super ChildViewType, ? super Integer, b0> qVar) {
        super(3);
        this.$body = qVar;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(ViewGroup viewGroup, View view, Integer num) {
        invoke(viewGroup, view, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(ViewGroup parent, View child, int i11) {
        s.g(parent, "parent");
        s.g(child, "child");
        q<ParentViewType, ChildViewType, Integer, b0> qVar = this.$body;
        s.m(1, "ParentViewType");
        s.m(1, "ChildViewType");
        qVar.invoke(parent, child, Integer.valueOf(i11));
    }
}