package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;

/* loaded from: classes.dex */
public final class a2 extends s0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(Context context) {
        super(context);
        kotlin.jvm.internal.s.g(context, "context");
    }

    @Override // androidx.compose.ui.platform.s0, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
    }

    protected final void dispatchGetDisplayList() {
    }
}