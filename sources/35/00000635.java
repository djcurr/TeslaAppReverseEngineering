package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class d0 {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(j3.c.Q);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && a0.O(viewGroup) == null) ? false : true;
    }
}