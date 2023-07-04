package expo.modules.kotlin.views;

import android.view.View;
import android.view.ViewGroup;
import h00.p;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* JADX INFO: Add missing generic type declarations: [ChildViewType] */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\b\u001a\u0004\u0018\u00018\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\n¨\u0006\u0007"}, d2 = {"Landroid/view/ViewGroup;", "ParentViewType", "Landroid/view/View;", "ChildViewType", "view", "", "index", "expo/modules/kotlin/views/ViewGroupDefinitionBuilder$GetChildViewAt$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ViewGroupDefinitionBuilder$getChildViewAt$$inlined$GetChildViewAt$1<ChildViewType> extends u implements p<ViewGroup, Integer, ChildViewType> {
    final /* synthetic */ p $body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewGroupDefinitionBuilder$getChildViewAt$$inlined$GetChildViewAt$1(p pVar) {
        super(2);
        this.$body = pVar;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ Object invoke(ViewGroup viewGroup, Integer num) {
        return invoke(viewGroup, num.intValue());
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroid/view/ViewGroup;I)TChildViewType; */
    public final View invoke(ViewGroup view, int i11) {
        s.g(view, "view");
        p pVar = this.$body;
        s.m(1, "ParentViewType");
        return (View) pVar.invoke(view, Integer.valueOf(i11));
    }
}