package atd.s;

import android.content.Context;
import android.provider.Settings;

/* loaded from: classes.dex */
public class d implements atd.i.b {
    @Override // atd.i.b
    /* renamed from: b */
    public Integer a(Context context) {
        try {
            return Integer.valueOf(Settings.Secure.getInt(context.getContentResolver(), atd.s0.a.a(-70685235669568L)));
        } catch (Settings.SettingNotFoundException unused) {
            return null;
        }
    }

    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-70672350767680L);
    }
}