package fu;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import kotlin.jvm.internal.s;
import vz.p;
import zu.q;

/* loaded from: classes6.dex */
public final class a implements c {
    @Override // fu.c
    public boolean a(p<Double, Double> location, p<Double, Double> destination, String str, String str2, b navType, Context context) {
        s.g(location, "location");
        s.g(destination, "destination");
        s.g(navType, "navType");
        s.g(context, "context");
        Intent b11 = e.b();
        Uri parse = Uri.parse(String.format(Locale.ENGLISH, "https://maps.google.com/maps?daddr=%s@%f,%f", URLEncoder.encode(str2, StandardCharsets.UTF_8.name()), destination.c(), destination.d()));
        s.f(parse, "parse(\n      java.lang.S…tion.second\n      )\n    )");
        b11.setData(parse);
        try {
            context.startActivity(b11);
            return true;
        } catch (Exception e11) {
            e.a().d("unable to start map", e11);
            return false;
        }
    }

    @Override // fu.c
    public boolean isSupported(Context context) {
        s.g(context, "context");
        return !q.a() || e.c(context, "com.google.android.apps.maps");
    }
}