package expo.modules.kotlin.views;

import android.view.ViewGroup;
import h00.p;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¨\u0006\u0006"}, d2 = {"Landroid/view/ViewGroup;", "ParentViewType", "view", "", "index", "Lvz/b0;", "expo/modules/kotlin/views/ViewGroupDefinitionBuilder$RemoveChildViewAt$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ViewGroupDefinitionBuilder$removeChildViewAt$$inlined$RemoveChildViewAt$1 extends u implements p<ViewGroup, Integer, b0> {
    final /* synthetic */ p $body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewGroupDefinitionBuilder$removeChildViewAt$$inlined$RemoveChildViewAt$1(p pVar) {
        super(2);
        this.$body = pVar;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(ViewGroup viewGroup, Integer num) {
        invoke(viewGroup, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(ViewGroup view, int i11) {
        s.g(view, "view");
        p pVar = this.$body;
        s.m(1, "ParentViewType");
        pVar.invoke(view, Integer.valueOf(i11));
    }
}