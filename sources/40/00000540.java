package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l implements j {
    @Override // androidx.compose.ui.window.j
    public void a(View composeView, Rect outRect) {
        s.g(composeView, "composeView");
        s.g(outRect, "outRect");
        composeView.getWindowVisibleDisplayFrame(outRect);
    }

    @Override // androidx.compose.ui.window.j
    public void b(WindowManager windowManager, View popupView, ViewGroup.LayoutParams params) {
        s.g(windowManager, "windowManager");
        s.g(popupView, "popupView");
        s.g(params, "params");
        windowManager.updateViewLayout(popupView, params);
    }

    @Override // androidx.compose.ui.window.j
    public void c(View composeView, int i11, int i12) {
        s.g(composeView, "composeView");
    }
}