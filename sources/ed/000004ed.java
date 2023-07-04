package androidx.compose.ui.platform;

import android.view.View;

/* loaded from: classes.dex */
final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f3136a = new x();

    private x() {
    }

    public final void a(View view, int i11, boolean z11) {
        kotlin.jvm.internal.s.g(view, "view");
        view.setFocusable(i11);
        view.setDefaultFocusHighlightEnabled(z11);
    }
}