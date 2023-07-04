package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
class r0 extends q0 {

    /* renamed from: g  reason: collision with root package name */
    private static boolean f6204g = true;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f6205h = true;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f6206i = true;

    @Override // androidx.transition.v0
    public void e(View view, Matrix matrix) {
        if (f6204g) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f6204g = false;
            }
        }
    }

    @Override // androidx.transition.v0
    public void i(View view, Matrix matrix) {
        if (f6205h) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f6205h = false;
            }
        }
    }

    @Override // androidx.transition.v0
    public void j(View view, Matrix matrix) {
        if (f6206i) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f6206i = false;
            }
        }
    }
}