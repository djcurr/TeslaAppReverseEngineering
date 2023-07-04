package n3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Method f40422a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f40423b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f40424c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f40425d;

    public static void a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    public static boolean b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public static void c(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            drawable.clearColorFilter();
        } else if (i11 >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                c(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof c) {
                c(((c) drawable).a());
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    Drawable child = drawableContainerState.getChild(i12);
                    if (child != null) {
                        c(child);
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    public static int d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    public static ColorFilter e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    public static int f(Drawable drawable) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i11 >= 17) {
            if (!f40425d) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f40424c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e11) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e11);
                }
                f40425d = true;
            }
            Method method = f40424c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e12) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e12);
                    f40424c = null;
                }
            }
        }
        return 0;
    }

    public static void g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    public static boolean h(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    @Deprecated
    public static void i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(Drawable drawable, boolean z11) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z11);
        }
    }

    public static void k(Drawable drawable, float f11, float f12) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f11, f12);
        }
    }

    public static void l(Drawable drawable, int i11, int i12, int i13, int i14) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i11, i12, i13, i14);
        }
    }

    public static boolean m(Drawable drawable, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23) {
            return drawable.setLayoutDirection(i11);
        }
        if (i12 >= 17) {
            if (!f40423b) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                    f40422a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e11) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e11);
                }
                f40423b = true;
            }
            Method method = f40422a;
            if (method != null) {
                try {
                    method.invoke(drawable, Integer.valueOf(i11));
                    return true;
                } catch (Exception e12) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e12);
                    f40422a = null;
                }
            }
        }
        return false;
    }

    public static void n(Drawable drawable, int i11) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i11);
        } else if (drawable instanceof b) {
            ((b) drawable).setTint(i11);
        }
    }

    public static void o(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof b) {
            ((b) drawable).setTintList(colorStateList);
        }
    }

    public static void p(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof b) {
            ((b) drawable).setTintMode(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T q(Drawable drawable) {
        return drawable instanceof c ? (T) ((c) drawable).a() : drawable;
    }

    public static Drawable r(Drawable drawable) {
        int i11 = Build.VERSION.SDK_INT;
        return i11 >= 23 ? drawable : i11 >= 21 ? !(drawable instanceof b) ? new e(drawable) : drawable : !(drawable instanceof b) ? new d(drawable) : drawable;
    }
}