package androidx.transition;

import android.view.View;

/* loaded from: classes.dex */
class s0 extends r0 {

    /* renamed from: j  reason: collision with root package name */
    private static boolean f6216j = true;

    @Override // androidx.transition.v0
    public void f(View view, int i11, int i12, int i13, int i14) {
        if (f6216j) {
            try {
                view.setLeftTopRightBottom(i11, i12, i13, i14);
            } catch (NoSuchMethodError unused) {
                f6216j = false;
            }
        }
    }
}