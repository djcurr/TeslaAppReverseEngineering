package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;

/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    public static final q1 f3051a = new q1();

    private q1() {
    }

    public final ActionMode a(View view, ActionMode.Callback actionModeCallback, int i11) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(actionModeCallback, "actionModeCallback");
        ActionMode startActionMode = view.startActionMode(actionModeCallback, i11);
        kotlin.jvm.internal.s.f(startActionMode, "view.startActionMode(\n  …           type\n        )");
        return startActionMode;
    }
}