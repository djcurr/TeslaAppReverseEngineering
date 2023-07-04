package atd.v;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class d extends t {
    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-140083317238336L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // atd.i.d
    /* renamed from: e */
    public String c(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return d(context).getImei();
        }
        return d(context).getDeviceId();
    }
}