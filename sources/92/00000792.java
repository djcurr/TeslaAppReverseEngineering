package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class v0 {
    public static v a(View view) {
        v vVar = (v) view.getTag(k4.a.f34355a);
        if (vVar != null) {
            return vVar;
        }
        ViewParent parent = view.getParent();
        while (vVar == null && (parent instanceof View)) {
            View view2 = (View) parent;
            vVar = (v) view2.getTag(k4.a.f34355a);
            parent = view2.getParent();
        }
        return vVar;
    }

    public static void b(View view, v vVar) {
        view.setTag(k4.a.f34355a, vVar);
    }
}