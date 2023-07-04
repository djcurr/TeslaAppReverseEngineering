package atd.m;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f implements atd.i.b {
    static {
        atd.s0.a.a(-72669510560320L);
    }

    @Override // atd.i.b
    /* renamed from: b */
    public String a(Context context) {
        Locale locale;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            locale = configuration.getLocales().get(0);
        } else {
            locale = configuration.locale;
        }
        return i11 >= 21 ? locale.toLanguageTag() : String.format(Locale.ENGLISH, atd.s0.a.a(-72626560887360L), locale.getLanguage(), locale.getCountry());
    }

    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-72613675985472L);
    }
}