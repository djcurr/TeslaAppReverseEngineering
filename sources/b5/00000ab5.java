package atd.l;

import android.content.Context;
import android.os.Build;
import atd.i.c;

/* loaded from: classes.dex */
public class a implements atd.i.b {
    @Override // atd.i.b
    /* renamed from: b */
    public Integer a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT);
        }
        throw new c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }

    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-74172749113920L);
    }
}