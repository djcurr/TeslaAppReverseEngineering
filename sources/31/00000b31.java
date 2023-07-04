package atd.v;

import android.content.Context;
import android.os.Build;
import atd.i.c;

/* loaded from: classes.dex */
public final class r extends a0 {
    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-139267273452096L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // atd.i.d
    /* renamed from: e */
    public Integer c(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Integer.valueOf(d(context).getPhoneCount());
        }
        throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }
}