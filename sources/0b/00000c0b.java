package b5;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class b {
    public static <T extends View> T a(View view, int i11) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                T t11 = (T) viewGroup.getChildAt(i12).findViewById(i11);
                if (t11 != null) {
                    return t11;
                }
            }
            return null;
        }
        return null;
    }
}