package zu;

import android.content.Context;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f60791a = new v();

    private v() {
    }

    public final String a(Context context) {
        Locale c11;
        String country;
        kotlin.jvm.internal.s.g(context, "context");
        r3.g a11 = r3.d.a(context.getApplicationContext().getResources().getConfiguration());
        if (!(a11.f() > 0)) {
            a11 = null;
        }
        return (a11 == null || (c11 = a11.c(0)) == null || (country = c11.getCountry()) == null) ? "-" : country;
    }
}