package atd.t;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import atd.i.c;

/* loaded from: classes.dex */
public class a implements atd.i.b {
    @Override // atd.i.b
    /* renamed from: b */
    public Integer a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                return Integer.valueOf(Settings.System.getInt(context.getContentResolver(), atd.s0.a.a(-139795554429504L)));
            } catch (Settings.SettingNotFoundException unused) {
                return null;
            }
        }
        throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }

    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-139782669527616L);
    }
}