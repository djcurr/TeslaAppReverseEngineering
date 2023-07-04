package r3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class f {

    /* loaded from: classes.dex */
    private static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }

        public static boolean b(Handler handler, Runnable runnable, Object obj, long j11) {
            return handler.postDelayed(runnable, obj, j11);
        }
    }

    public static Handler a(Looper looper) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            return a.a(looper);
        }
        if (i11 >= 17) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (IllegalAccessException e11) {
                e = e11;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                return new Handler(looper);
            } catch (InstantiationException e12) {
                e = e12;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                return new Handler(looper);
            } catch (NoSuchMethodException e13) {
                e = e13;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                return new Handler(looper);
            } catch (InvocationTargetException e14) {
                Throwable cause = e14.getCause();
                if (!(cause instanceof RuntimeException)) {
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(cause);
                }
                throw ((RuntimeException) cause);
            }
        }
        return new Handler(looper);
    }

    public static boolean b(Handler handler, Runnable runnable, Object obj, long j11) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(handler, runnable, obj, j11);
        }
        Message obtain = Message.obtain(handler, runnable);
        obtain.obj = obj;
        return handler.sendMessageDelayed(obtain, j11);
    }
}