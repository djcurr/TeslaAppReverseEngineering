package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
class u0 extends t0 {
    @Override // androidx.transition.q0, androidx.transition.v0
    public float c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.r0, androidx.transition.v0
    public void e(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.s0, androidx.transition.v0
    public void f(View view, int i11, int i12, int i13, int i14) {
        view.setLeftTopRightBottom(i11, i12, i13, i14);
    }

    @Override // androidx.transition.q0, androidx.transition.v0
    public void g(View view, float f11) {
        view.setTransitionAlpha(f11);
    }

    @Override // androidx.transition.t0, androidx.transition.v0
    public void h(View view, int i11) {
        view.setTransitionVisibility(i11);
    }

    @Override // androidx.transition.r0, androidx.transition.v0
    public void i(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.r0, androidx.transition.v0
    public void j(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}