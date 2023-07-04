package m8;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static a f38444a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f38445b = false;

    public static synchronized String a(Context context) {
        synchronized (b.class) {
            if (context != null) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    b(context);
                    a aVar = f38444a;
                    if (aVar != null) {
                        try {
                            return aVar.a(context);
                        } catch (Exception unused) {
                        }
                    }
                    return null;
                }
                throw new IllegalStateException("Cannot be called from the main thread");
            }
            throw new RuntimeException("Context is null");
        }
    }

    public static void b(Context context) {
        if (f38444a != null || f38445b) {
            return;
        }
        synchronized (b.class) {
            if (f38444a == null && !f38445b) {
                f38444a = o8.a.b(context);
                f38445b = true;
            }
        }
    }
}