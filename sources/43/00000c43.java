package b9;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static Object f7559a;

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f7560b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f7561c;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f7560b = cls;
            f7559a = cls.newInstance();
            f7560b.getMethod("getUDID", Context.class);
            f7561c = f7560b.getMethod("getOAID", Context.class);
            f7560b.getMethod("getVAID", Context.class);
            f7560b.getMethod("getAAID", Context.class);
        } catch (Exception e11) {
            Log.e("IdentifierManager", "reflect exception!", e11);
        }
    }

    public static String a(Context context, Method method) {
        Object obj = f7559a;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, context);
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Exception e11) {
            Log.e("IdentifierManager", "invoke exception!", e11);
            return null;
        }
    }

    public static boolean b() {
        return (f7560b == null || f7559a == null) ? false : true;
    }

    public static String c(Context context) {
        return a(context, f7561c);
    }
}