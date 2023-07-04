package androidx.core.view;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class n {
    @Deprecated
    public static int a(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    public static boolean b(MotionEvent motionEvent, int i11) {
        return (motionEvent.getSource() & i11) == i11;
    }
}