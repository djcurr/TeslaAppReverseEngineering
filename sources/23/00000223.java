package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class h implements m.e, j, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    private Rect f1453a;

    /* JADX INFO: Access modifiers changed from: protected */
    public static int m(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i12 = 0;
        int i13 = 0;
        View view = null;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = listAdapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i14, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i11) {
                return i11;
            }
            if (measuredWidth > i12) {
                i12 = measuredWidth;
            }
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean w(e eVar) {
        int size = eVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = eVar.getItem(i11);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static d x(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (d) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
    }

    public abstract void j(e eVar);

    protected boolean k() {
        return true;
    }

    public Rect l() {
        return this.f1453a;
    }

    public abstract void n(View view);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        x(listAdapter).f1390a.M((MenuItem) listAdapter.getItem(i11), this, k() ? 0 : 4);
    }

    public void p(Rect rect) {
        this.f1453a = rect;
    }

    public abstract void q(boolean z11);

    public abstract void r(int i11);

    public abstract void s(int i11);

    public abstract void t(PopupWindow.OnDismissListener onDismissListener);

    public abstract void u(boolean z11);

    public abstract void v(int i11);
}