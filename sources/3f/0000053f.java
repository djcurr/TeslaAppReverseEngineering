package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.s;
import wz.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k extends l {
    @Override // androidx.compose.ui.window.l, androidx.compose.ui.window.j
    public void c(View composeView, int i11, int i12) {
        List<Rect> o11;
        s.g(composeView, "composeView");
        o11 = w.o(new Rect(0, 0, i11, i12));
        composeView.setSystemGestureExclusionRects(o11);
    }
}