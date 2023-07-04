package ra;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import l3.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f49329a = true;

    public static Drawable a(Context context, int i11, Resources.Theme theme) {
        return c(context, context, i11, theme);
    }

    public static Drawable b(Context context, Context context2, int i11) {
        return c(context, context2, i11, null);
    }

    private static Drawable c(Context context, Context context2, int i11, Resources.Theme theme) {
        try {
            if (f49329a) {
                return e(context2, i11, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e11) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return androidx.core.content.b.getDrawable(context2, i11);
            }
            throw e11;
        } catch (NoClassDefFoundError unused2) {
            f49329a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i11, theme);
    }

    private static Drawable d(Context context, int i11, Resources.Theme theme) {
        return h.f(context.getResources(), i11, theme);
    }

    private static Drawable e(Context context, int i11, Resources.Theme theme) {
        if (theme != null) {
            context = new l.d(context, theme);
        }
        return h.a.d(context, i11);
    }
}