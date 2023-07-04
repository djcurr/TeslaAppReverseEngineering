package androidx.transition;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
class j extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f6163a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6164b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f6163a = viewGroup;
        viewGroup.setTag(s.f6208b, this);
        k0.b(this.f6163a).c(this);
        this.f6164b = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j b(ViewGroup viewGroup) {
        return (j) viewGroup.getTag(s.f6208b);
    }

    private int c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i11 = 0;
        while (i11 <= childCount) {
            int i12 = (i11 + childCount) / 2;
            d(((l) getChildAt(i12)).f6177c, arrayList2);
            if (f(arrayList, arrayList2)) {
                i11 = i12 + 1;
            } else {
                childCount = i12 - 1;
            }
            arrayList2.clear();
        }
        return i11;
    }

    private static void d(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    private static boolean e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (Build.VERSION.SDK_INT >= 21 && view.getZ() != view2.getZ()) {
            return view.getZ() > view2.getZ();
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(k0.a(viewGroup, i11));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    private static boolean f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i11 = 1; i11 < min; i11++) {
            View view = arrayList.get(i11);
            View view2 = arrayList2.get(i11);
            if (view != view2) {
                return e(view, view2);
            }
        }
        return arrayList2.size() == min;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(l lVar) {
        ArrayList<View> arrayList = new ArrayList<>();
        d(lVar.f6177c, arrayList);
        int c11 = c(arrayList);
        if (c11 >= 0 && c11 < getChildCount()) {
            addView(lVar, c11);
        } else {
            addView(lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (this.f6164b) {
            k0.b(this.f6163a).d(this);
            k0.b(this.f6163a).c(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (this.f6164b) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f6163a.setTag(s.f6208b, null);
            k0.b(this.f6163a).d(this);
            this.f6164b = false;
        }
    }
}