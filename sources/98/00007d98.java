package k7;

import android.widget.Filter;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f34474a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends c> itemList) {
        s.g(itemList, "itemList");
        this.f34474a = itemList;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        String a11 = cVar != null ? cVar.a() : null;
        return a11 != null ? a11 : "";
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        List<c> list = this.f34474a;
        filterResults.values = list;
        filterResults.count = list.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
    }
}