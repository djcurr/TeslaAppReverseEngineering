package k7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import h00.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k7.c;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a<T extends c> extends BaseAdapter implements Filterable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f34471a;

    /* renamed from: b  reason: collision with root package name */
    private final List<T> f34472b;

    /* renamed from: c  reason: collision with root package name */
    private final b f34473c;

    public a(Context context) {
        s.g(context, "context");
        this.f34471a = context;
        ArrayList arrayList = new ArrayList();
        this.f34472b = arrayList;
        this.f34473c = new b(arrayList);
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public T getItem(int i11) {
        return this.f34472b.get(i11);
    }

    public final T b(l<? super T, Boolean> predicate) {
        Object obj;
        s.g(predicate, "predicate");
        Iterator<T> it2 = this.f34472b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (predicate.invoke((c) obj).booleanValue()) {
                break;
            }
        }
        return (T) obj;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f34472b.size();
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f34473c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        d dVar;
        if (view == null) {
            view = LayoutInflater.from(this.f34471a).inflate(j7.d.simple_text_item_view, viewGroup, false);
            s.f(view, "from(context).inflate(R.layout.simple_text_item_view, parent, false)");
            dVar = new d(view);
            view.setTag(dVar);
        } else {
            Object tag = view.getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.adyen.checkout.components.ui.adapter.SimpleTextViewHolder");
            dVar = (d) tag;
        }
        dVar.a(getItem(i11));
        return view;
    }
}