package r9;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    public static b f49327b;

    /* renamed from: a  reason: collision with root package name */
    public Context f49328a;

    public static b e() {
        if (f49327b == null) {
            f49327b = new b();
        }
        return f49327b;
    }

    public static boolean f() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i11 = 0; i11 < 10; i11++) {
            if (new File(strArr[i11]).exists()) {
                return true;
            }
        }
        return false;
    }

    public g9.b a() {
        return g9.b.d();
    }

    public void b(Context context) {
        g9.b.d();
        this.f49328a = context.getApplicationContext();
    }

    public Context c() {
        return this.f49328a;
    }

    public String d() {
        return u9.b.d(null, this.f49328a);
    }
}