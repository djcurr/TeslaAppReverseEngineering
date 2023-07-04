package atd.v;

import android.content.Context;
import android.telephony.TelephonyManager;
import atd.i.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class a0 extends atd.i.d {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // atd.i.d
    public List<String> b() {
        return Collections.singletonList(atd.s0.a.a(-139164194236992L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TelephonyManager d(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(atd.s0.a.a(-139593690966592L));
        if (telephonyManager != null) {
            return telephonyManager;
        }
        throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }
}