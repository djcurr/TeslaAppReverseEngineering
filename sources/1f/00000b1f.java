package atd.v;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import atd.i.c;

/* loaded from: classes.dex */
public final class b extends a0 {
    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-139748309789248L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // atd.i.d
    /* renamed from: e */
    public String c(Context context) {
        TelephonyManager d11 = d(context);
        if (Build.VERSION.SDK_INT >= 18 && d11.getPhoneType() == 1) {
            return d11.getGroupIdLevel1();
        }
        throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }
}