package atd.v;

import android.content.Context;
import android.os.Build;
import atd.i.c;

/* loaded from: classes.dex */
public final class i extends a0 {
    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-140182101486144L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // atd.i.d
    /* renamed from: e */
    public Boolean c(Context context) {
        if (Build.VERSION.SDK_INT >= 22) {
            return Boolean.valueOf(d(context).isVoiceCapable());
        }
        throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }
}