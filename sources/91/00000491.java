package androidx.compose.ui.platform;

import android.view.ViewParent;

/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a  reason: collision with root package name */
    public static final j2 f2989a = new j2();

    private j2() {
    }

    public final void a(AndroidComposeView ownerView) {
        kotlin.jvm.internal.s.g(ownerView, "ownerView");
        ViewParent parent = ownerView.getParent();
        if (parent == null) {
            return;
        }
        parent.onDescendantInvalidated(ownerView, ownerView);
    }
}