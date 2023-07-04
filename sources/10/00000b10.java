package atd.s;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import atd.i.c;

/* loaded from: classes.dex */
public class e implements atd.i.b {
    @Override // atd.i.b
    /* renamed from: b */
    public Integer a(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                return Integer.valueOf(Settings.Secure.getInt(context.getContentResolver(), atd.s0.a.a(-140345310243392L)));
            } catch (Settings.SettingNotFoundException unused) {
                return null;
            }
        }
        throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }

    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-140332425341504L);
    }
}