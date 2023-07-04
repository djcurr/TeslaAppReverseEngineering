package z3;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    a f60169a;

    /* loaded from: classes.dex */
    interface a {
        void a(Cursor cursor);

        CharSequence b(Cursor cursor);

        Cursor c(CharSequence charSequence);

        Cursor d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar) {
        this.f60169a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f60169a.b((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor c11 = this.f60169a.c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (c11 != null) {
            filterResults.count = c11.getCount();
            filterResults.values = c11;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor d11 = this.f60169a.d();
        Object obj = filterResults.values;
        if (obj == null || obj == d11) {
            return;
        }
        this.f60169a.a((Cursor) obj);
    }
}