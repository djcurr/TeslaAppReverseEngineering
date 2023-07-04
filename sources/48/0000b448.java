package t1;

import android.graphics.Canvas;

/* loaded from: classes.dex */
final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f51519a = new y();

    private y() {
    }

    public final void a(Canvas canvas, boolean z11) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        if (z11) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}