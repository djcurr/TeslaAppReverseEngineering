package androidx.transition;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
class t0 extends s0 {

    /* renamed from: k  reason: collision with root package name */
    private static boolean f6218k = true;

    @Override // androidx.transition.v0
    public void h(View view, int i11) {
        if (Build.VERSION.SDK_INT == 28) {
            super.h(view, i11);
        } else if (f6218k) {
            try {
                view.setTransitionVisibility(i11);
            } catch (NoSuchMethodError unused) {
                f6218k = false;
            }
        }
    }
}