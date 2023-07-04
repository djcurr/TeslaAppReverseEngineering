package t1;

import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class v0 {
    public static final Rect a(s1.h hVar) {
        kotlin.jvm.internal.s.g(hVar, "<this>");
        return new Rect((int) hVar.i(), (int) hVar.l(), (int) hVar.j(), (int) hVar.e());
    }

    public static final RectF b(s1.h hVar) {
        kotlin.jvm.internal.s.g(hVar, "<this>");
        return new RectF(hVar.i(), hVar.l(), hVar.j(), hVar.e());
    }

    public static final s1.h c(Rect rect) {
        kotlin.jvm.internal.s.g(rect, "<this>");
        return new s1.h(rect.left, rect.top, rect.right, rect.bottom);
    }
}