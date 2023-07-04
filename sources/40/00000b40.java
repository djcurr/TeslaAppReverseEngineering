package atd.w;

import android.content.Context;
import android.os.Build;
import atd.i.c;

/* loaded from: classes.dex */
public final class g extends a {
    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-138584373652032L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // atd.i.d
    /* renamed from: f */
    public Boolean c(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Boolean.valueOf(e(context).isPreferredNetworkOffloadSupported());
        }
        throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }
}