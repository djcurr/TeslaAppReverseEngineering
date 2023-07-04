package androidx.transition;

import android.view.View;

/* loaded from: classes.dex */
class q0 extends v0 {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f6203f = true;

    @Override // androidx.transition.v0
    public void a(View view) {
    }

    @Override // androidx.transition.v0
    public float c(View view) {
        if (f6203f) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f6203f = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.v0
    public void d(View view) {
    }

    @Override // androidx.transition.v0
    public void g(View view, float f11) {
        if (f6203f) {
            try {
                view.setTransitionAlpha(f11);
                return;
            } catch (NoSuchMethodError unused) {
                f6203f = false;
            }
        }
        view.setAlpha(f11);
    }
}