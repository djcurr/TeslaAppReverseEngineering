package atd.u;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import atd.i.b;
import atd.i.c;

/* loaded from: classes.dex */
public class a implements b {
    @Override // atd.i.b
    /* renamed from: b */
    public Long a(Context context) {
        if (Build.VERSION.SDK_INT >= 18) {
            return Long.valueOf(new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes());
        }
        throw new c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }

    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-139722539985472L);
    }
}