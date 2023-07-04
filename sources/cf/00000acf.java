package atd.m;

import android.content.Context;
import android.os.Build;
import atd.i.c;
import java.lang.reflect.Field;
import java.util.Locale;

/* loaded from: classes.dex */
public final class h implements atd.i.b {
    static {
        atd.s0.a.a(-71960840956480L);
    }

    @Override // atd.i.b
    /* renamed from: b */
    public String a(Context context) {
        int i11;
        Field[] fields = Build.VERSION_CODES.class.getFields();
        int length = fields.length;
        for (int i12 = 0; i12 < length; i12++) {
            Field field = fields[i12];
            try {
                i11 = field.getInt(null);
            } catch (IllegalAccessException unused) {
            }
            if (i11 == Build.VERSION.SDK_INT) {
                return String.format(Locale.US, atd.s0.a.a(-71604358670912L), field.getName(), Build.VERSION.RELEASE, Integer.valueOf(i11));
            }
            continue;
        }
        throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }

    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-71557114030656L);
    }
}