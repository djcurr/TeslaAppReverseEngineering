package atd.s;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import atd.i.c;

/* loaded from: classes.dex */
public final class i implements atd.i.b {
    static {
        atd.s0.a.a(-140663137823296L);
    }

    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-140242231028288L);
    }

    @Override // atd.i.b
    public Object a(Context context) {
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                return Settings.Secure.getString(context.getContentResolver(), (String) Settings.Secure.class.getField(atd.s0.a.a(-140289475668544L)).get(null));
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
        }
        throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }
}