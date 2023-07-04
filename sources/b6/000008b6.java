package androidx.savedstate;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class d {
    public static c a(View view) {
        c cVar = (c) view.getTag(a.f5940a);
        if (cVar != null) {
            return cVar;
        }
        ViewParent parent = view.getParent();
        while (cVar == null && (parent instanceof View)) {
            View view2 = (View) parent;
            cVar = (c) view2.getTag(a.f5940a);
            parent = view2.getParent();
        }
        return cVar;
    }

    public static void b(View view, c cVar) {
        view.setTag(a.f5940a, cVar);
    }
}