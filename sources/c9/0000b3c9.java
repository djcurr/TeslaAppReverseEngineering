package t0;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.s;
import s1.h;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private View f51269a;

    public final void a(h rect) {
        Rect c11;
        s.g(rect, "rect");
        View view = this.f51269a;
        if (view == null) {
            return;
        }
        c11 = g.c(rect);
        view.requestRectangleOnScreen(c11, false);
    }

    public final void b(View view) {
        this.f51269a = view;
    }
}