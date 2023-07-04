package z8;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static Method f60377a;

    public static final boolean a() {
        Context context = null;
        try {
            if (f60377a == null) {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]);
                f60377a = method;
                method.setAccessible(true);
            }
            context = (Context) f60377a.invoke(null, new Object[0]);
        } catch (Exception e11) {
            Log.e("OpenIdHelper", "ActivityThread:currentApplication --> " + e11.toString());
        }
        if (context == null) {
            return false;
        }
        return f.d().g(context, false);
    }

    public static String b(Context context) {
        f d11 = f.d();
        return d11.a(context.getApplicationContext(), d11.f60386b);
    }
}