package atd.r;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import atd.i.c;

/* loaded from: classes.dex */
public class b implements atd.i.b {
    @Override // atd.i.b
    /* renamed from: b */
    public Integer a(Context context) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 17 && i11 < 26) {
            try {
                return Integer.valueOf(Settings.Global.getInt(context.getContentResolver(), atd.s0.a.a(-71355250567744L)));
            } catch (Settings.SettingNotFoundException unused) {
                return null;
            }
        }
        throw new c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }

    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-71342365665856L);
    }
}