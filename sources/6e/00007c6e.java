package jz;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static View a(View view, float f11, float f12, i iVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(view);
        int[] iArr = new int[2];
        View view2 = null;
        while (arrayDeque.size() > 0) {
            View view3 = (View) rz.j.a((View) arrayDeque.poll(), "view is required");
            if (iVar.a(view3)) {
                if (iVar.b()) {
                    return view3;
                }
                view2 = view3;
            }
            if (view3 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view3;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (g(childAt, f11, f12, iArr)) {
                        arrayDeque.add(childAt);
                    }
                }
            }
        }
        return view2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(View view) {
        int id2 = view.getId();
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id2) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(View view) {
        int id2 = view.getId();
        try {
            return b(view);
        } catch (Resources.NotFoundException unused) {
            return "0x" + Integer.toString(id2, 16);
        }
    }

    private static boolean d(View view, boolean z11) {
        if (z11) {
            return ScrollingView.class.isAssignableFrom(view.getClass());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(View view, boolean z11) {
        return (d(view, z11) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(View view) {
        return view.isClickable() && view.getVisibility() == 0;
    }

    private static boolean g(View view, float f11, float f12, int[] iArr) {
        view.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        return f11 >= ((float) i11) && f11 <= ((float) (i11 + view.getWidth())) && f12 >= ((float) i12) && f12 <= ((float) (i12 + view.getHeight()));
    }
}