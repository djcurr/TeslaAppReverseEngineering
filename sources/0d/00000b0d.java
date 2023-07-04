package atd.s;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* loaded from: classes.dex */
public class b implements atd.i.b {
    @Override // atd.i.b
    /* renamed from: b */
    public Integer a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                return Integer.valueOf(Settings.Global.getInt(contentResolver, atd.s0.a.a(-70384587958848L)));
            }
            return Integer.valueOf(Settings.Secure.getInt(contentResolver, atd.s0.a.a(-70431832599104L)));
        } catch (Settings.SettingNotFoundException unused) {
            return null;
        }
    }

    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-70612221225536L);
    }
}