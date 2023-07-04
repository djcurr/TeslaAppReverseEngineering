package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f6396b;

    /* renamed from: a  reason: collision with root package name */
    private LinearLayoutManager f6397a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0112a implements Comparator<int[]> {
        C0112a(a aVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f6396b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(LinearLayoutManager linearLayoutManager) {
        this.f6397a = linearLayoutManager;
    }

    private boolean a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top;
        int i11;
        int bottom;
        int i12;
        int childCount = this.f6397a.getChildCount();
        if (childCount == 0) {
            return true;
        }
        boolean z11 = this.f6397a.getOrientation() == 0;
        int[][] iArr = (int[][]) Array.newInstance(int.class, childCount, 2);
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = this.f6397a.getChildAt(i13);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f6396b;
                }
                int[] iArr2 = iArr[i13];
                if (z11) {
                    top = childAt.getLeft();
                    i11 = marginLayoutParams.leftMargin;
                } else {
                    top = childAt.getTop();
                    i11 = marginLayoutParams.topMargin;
                }
                iArr2[0] = top - i11;
                int[] iArr3 = iArr[i13];
                if (z11) {
                    bottom = childAt.getRight();
                    i12 = marginLayoutParams.rightMargin;
                } else {
                    bottom = childAt.getBottom();
                    i12 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = bottom + i12;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr, new C0112a(this));
        for (int i14 = 1; i14 < childCount; i14++) {
            if (iArr[i14 - 1][1] != iArr[i14][0]) {
                return false;
            }
        }
        return iArr[0][0] <= 0 && iArr[childCount - 1][1] >= iArr[0][1] - iArr[0][0];
    }

    private boolean b() {
        int childCount = this.f6397a.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (c(this.f6397a.getChildAt(i11))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (c(viewGroup.getChildAt(i11))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return (!a() || this.f6397a.getChildCount() <= 1) && b();
    }
}