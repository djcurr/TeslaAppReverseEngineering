package atd.w;

import android.content.Context;
import android.os.Build;
import atd.i.c;

/* loaded from: classes.dex */
public final class h extends a {
    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-138597258553920L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // atd.i.d
    /* renamed from: f */
    public Boolean c(Context context) {
        if (Build.VERSION.SDK_INT >= 18) {
            return Boolean.valueOf(e(context).isScanAlwaysAvailable());
        }
        throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }
}