package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1733a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f1734b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Rect f1735c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private static Class<?> f1736d;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f1736d = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    public static boolean a(Drawable drawable) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 15 || !(drawable instanceof InsetDrawable)) {
            if (i11 >= 15 || !(drawable instanceof GradientDrawable)) {
                if (i11 >= 17 || !(drawable instanceof LayerDrawable)) {
                    if (drawable instanceof DrawableContainer) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState instanceof DrawableContainer.DrawableContainerState) {
                            for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                                if (!a(drawable2)) {
                                    return false;
                                }
                            }
                            return true;
                        }
                        return true;
                    } else if (drawable instanceof n3.c) {
                        return a(((n3.c) drawable).a());
                    } else {
                        if (drawable instanceof i.c) {
                            return a(((i.c) drawable).a());
                        }
                        if (drawable instanceof ScaleDrawable) {
                            return a(((ScaleDrawable) drawable).getDrawable());
                        }
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            c(drawable);
        }
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(f1734b);
        } else {
            drawable.setState(f1733a);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        Field[] fields;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f1736d != null) {
            try {
                Drawable q11 = n3.a.q(drawable);
                Object invoke = q11.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(q11, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f1736d.getFields()) {
                        String name = field.getName();
                        char c11 = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c11 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c11 = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c11 = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c11 = 2;
                                    break;
                                }
                                break;
                        }
                        if (c11 == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c11 == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c11 == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c11 == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f1735c;
    }

    public static PorterDuff.Mode e(int i11, PorterDuff.Mode mode) {
        if (i11 != 3) {
            if (i11 != 5) {
                if (i11 != 9) {
                    switch (i11) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}