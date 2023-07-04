package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* loaded from: classes.dex */
public class s0 extends ViewGroup {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Context context) {
        super(context);
        kotlin.jvm.internal.s.g(context, "context");
        setClipChildren(false);
        setTag(o1.g.I, Boolean.TRUE);
    }

    public final void a(t1.u canvas, View view, long j11) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        kotlin.jvm.internal.s.g(view, "view");
        super.drawChild(t1.c.c(canvas), view, j11);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        int childCount = getChildCount();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            int i12 = i11 + 1;
            View childAt = getChildAt(i11);
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((z1) childAt).s()) {
                z11 = true;
                break;
            }
            i11 = i12;
        }
        if (z11) {
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }
}