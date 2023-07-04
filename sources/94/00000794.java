package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class w0 {
    public static u0 a(View view) {
        u0 u0Var = (u0) view.getTag(l4.a.f36575a);
        if (u0Var != null) {
            return u0Var;
        }
        ViewParent parent = view.getParent();
        while (u0Var == null && (parent instanceof View)) {
            View view2 = (View) parent;
            u0Var = (u0) view2.getTag(l4.a.f36575a);
            parent = view2.getParent();
        }
        return u0Var;
    }

    public static void b(View view, u0 u0Var) {
        view.setTag(l4.a.f36575a, u0Var);
    }
}