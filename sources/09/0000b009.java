package r3;

import android.content.res.Configuration;
import android.os.Build;

/* loaded from: classes.dex */
public final class d {
    public static g a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? g.h(configuration.getLocales()) : g.a(configuration.locale);
    }
}