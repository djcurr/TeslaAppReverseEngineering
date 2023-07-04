package t3;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Locale f51625a = new Locale("", "");

    private static int a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    public static int b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f51625a)) {
            return 0;
        }
        String c11 = c.c(locale);
        if (c11 == null) {
            return a(locale);
        }
        return (c11.equalsIgnoreCase("Arab") || c11.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}