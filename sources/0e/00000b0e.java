package atd.s;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* loaded from: classes.dex */
public class c implements atd.i.b {
    @Override // atd.i.b
    /* renamed from: b */
    public Integer a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                return Integer.valueOf(Settings.Global.getInt(contentResolver, atd.s0.a.a(-70491962141248L)));
            }
            return Integer.valueOf(Settings.Secure.getInt(contentResolver, atd.s0.a.a(-70857034361408L)));
        } catch (Settings.SettingNotFoundException unused) {
            return null;
        }
    }

    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-70479077239360L);
    }
}