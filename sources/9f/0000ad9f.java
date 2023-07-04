package q7;

import android.content.Context;
import android.os.Build;
import java.util.IllformedLocaleException;
import java.util.Locale;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class b {
    static {
        new b();
    }

    private b() {
    }

    public static final Locale a(Context context) {
        s.g(context, "context");
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            s.f(locale, "{\n            context.resources.configuration.locales[0]\n        }");
            return locale;
        }
        Locale locale2 = context.getResources().getConfiguration().locale;
        s.f(locale2, "{\n            @Suppress(\"DEPRECATION\")\n            context.resources.configuration.locale\n        }");
        return locale2;
    }

    public static final boolean b(Locale locale) {
        s.g(locale, "locale");
        try {
            new Locale.Builder().setLocale(locale).build();
            return true;
        } catch (IllformedLocaleException unused) {
            return false;
        }
    }
}