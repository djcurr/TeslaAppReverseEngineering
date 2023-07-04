package expo.modules.kotlin.views;

import android.view.ViewGroup;
import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/ViewGroup;", "ParentViewType", "view", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ViewGroupDefinitionBuilder$GetChildCount$1 extends u implements l<ViewGroup, Integer> {
    final /* synthetic */ l<ParentViewType, Integer> $body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewGroupDefinitionBuilder$GetChildCount$1(l<? super ParentViewType, Integer> lVar) {
        super(1);
        this.$body = lVar;
    }

    @Override // h00.l
    public final Integer invoke(ViewGroup view) {
        s.g(view, "view");
        l<ParentViewType, Integer> lVar = this.$body;
        s.m(1, "ParentViewType");
        return lVar.invoke(view);
    }
}