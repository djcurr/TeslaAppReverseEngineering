package m7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f38434a = new c();

    private c() {
    }

    public final boolean a(String date, String format) {
        s.g(date, "date");
        s.g(format, "format");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.US);
        simpleDateFormat.setLenient(false);
        try {
            simpleDateFormat.parse(date);
            return true;
        } catch (ParseException unused) {
            o7.b.c("DateUtil", "Provided date " + date + " does not match the given format " + format);
            return false;
        }
    }
}