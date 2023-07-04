package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class v0 {

    /* renamed from: b  reason: collision with root package name */
    private static Method f6225b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f6226c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f6227d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f6228e;

    /* renamed from: a  reason: collision with root package name */
    private float[] f6229a;

    private void b() {
        if (f6226c) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f6225b = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e11) {
            Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e11);
        }
        f6226c = true;
    }

    public void a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(s.f6210d, null);
        }
    }

    public float c(View view) {
        Float f11 = (Float) view.getTag(s.f6210d);
        if (f11 != null) {
            return view.getAlpha() / f11.floatValue();
        }
        return view.getAlpha();
    }

    public void d(View view) {
        int i11 = s.f6210d;
        if (view.getTag(i11) == null) {
            view.setTag(i11, Float.valueOf(view.getAlpha()));
        }
    }

    public void e(View view, Matrix matrix) {
        if (matrix != null && !matrix.isIdentity()) {
            float[] fArr = this.f6229a;
            if (fArr == null) {
                fArr = new float[9];
                this.f6229a = fArr;
            }
            matrix.getValues(fArr);
            float f11 = fArr[3];
            float sqrt = ((float) Math.sqrt(1.0f - (f11 * f11))) * (fArr[0] < BitmapDescriptorFactory.HUE_RED ? -1 : 1);
            float degrees = (float) Math.toDegrees(Math.atan2(f11, sqrt));
            float f12 = fArr[0] / sqrt;
            float f13 = fArr[4] / sqrt;
            float f14 = fArr[2];
            float f15 = fArr[5];
            view.setPivotX(BitmapDescriptorFactory.HUE_RED);
            view.setPivotY(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationX(f14);
            view.setTranslationY(f15);
            view.setRotation(degrees);
            view.setScaleX(f12);
            view.setScaleY(f13);
            return;
        }
        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight() / 2);
        view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(BitmapDescriptorFactory.HUE_RED);
    }

    public void f(View view, int i11, int i12, int i13, int i14) {
        b();
        Method method = f6225b;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    public void g(View view, float f11) {
        Float f12 = (Float) view.getTag(s.f6210d);
        if (f12 != null) {
            view.setAlpha(f12.floatValue() * f11);
        } else {
            view.setAlpha(f11);
        }
    }

    public void h(View view, int i11) {
        if (!f6228e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f6227d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f6228e = true;
        }
        Field field = f6227d;
        if (field != null) {
            try {
                f6227d.setInt(view, i11 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void i(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            i(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void j(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            j(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}