package androidx.core.widget;

import android.widget.ListView;

/* loaded from: classes.dex */
public class j extends a {

    /* renamed from: w  reason: collision with root package name */
    private final ListView f4648w;

    public j(ListView listView) {
        super(listView);
        this.f4648w = listView;
    }

    @Override // androidx.core.widget.a
    public boolean a(int i11) {
        return false;
    }

    @Override // androidx.core.widget.a
    public boolean b(int i11) {
        ListView listView = this.f4648w;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i12 = firstVisiblePosition + childCount;
        if (i11 > 0) {
            if (i12 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i11 >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.a
    public void j(int i11, int i12) {
        k.b(this.f4648w, i12);
    }
}