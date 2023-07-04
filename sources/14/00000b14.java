package atd.s;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import atd.i.c;

/* loaded from: classes.dex */
public class h implements atd.i.b {
    @Override // atd.i.b
    public String a() {
        return "A067";
    }

    @Override // atd.i.b
    /* renamed from: b */
    public Integer a(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            try {
                return Integer.valueOf(Settings.Secure.getInt(context.getContentResolver(), "speak_password"));
            } catch (Settings.SettingNotFoundException unused) {
                return null;
            }
        }
        throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }
}