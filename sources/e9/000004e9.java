package androidx.compose.ui.platform;

import android.view.PointerIcon;
import android.view.View;

/* loaded from: classes.dex */
final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f3133a = new w();

    private w() {
    }

    public final void a(View view, d2.p pVar) {
        PointerIcon systemIcon;
        kotlin.jvm.internal.s.g(view, "view");
        if (pVar instanceof d2.a) {
            systemIcon = ((d2.a) pVar).a();
        } else if (pVar instanceof d2.b) {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), ((d2.b) pVar).a());
        } else {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (kotlin.jvm.internal.s.c(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}