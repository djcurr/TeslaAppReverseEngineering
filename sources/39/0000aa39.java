package p5;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes.dex */
public class p extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f46205a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static String f46206b;

    /* renamed from: c  reason: collision with root package name */
    private static p f46207c;

    /* renamed from: d  reason: collision with root package name */
    private static Callback f46208d;

    /* renamed from: e  reason: collision with root package name */
    private static Callback f46209e;

    public static IntentSender a(ReactContext reactContext) {
        synchronized (f46205a) {
            if (f46206b == null) {
                f46206b = reactContext.getPackageName() + "/" + p.class.getName() + "_ACTION";
            }
            Context applicationContext = reactContext.getApplicationContext();
            p pVar = f46207c;
            if (pVar != null) {
                applicationContext.unregisterReceiver(pVar);
            }
            p pVar2 = new p();
            f46207c = pVar2;
            applicationContext.registerReceiver(pVar2, new IntentFilter(f46206b));
        }
        Intent intent = new Intent(f46206b);
        intent.setPackage(reactContext.getPackageName());
        intent.setClass(reactContext.getApplicationContext(), p.class);
        intent.putExtra("receiver_token", f46207c.hashCode());
        return PendingIntent.getBroadcast(reactContext, 0, intent, Build.VERSION.SDK_INT >= 23 ? 1409286144 : 1342177280).getIntentSender();
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 22;
    }

    public static void c(Callback callback, Callback callback2) {
        f46208d = callback;
        f46209e = callback2;
    }

    public static void d(boolean z11, Object... objArr) {
        if (z11) {
            Callback callback = f46208d;
            if (callback != null) {
                callback.invoke(objArr);
            }
        } else {
            Callback callback2 = f46209e;
            if (callback2 != null) {
                callback2.invoke(objArr);
            }
        }
        f46208d = null;
        f46209e = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        synchronized (f46205a) {
            if (f46207c != this) {
                return;
            }
            context.getApplicationContext().unregisterReceiver(f46207c);
            f46207c = null;
            if (intent.hasExtra("receiver_token") && intent.getIntExtra("receiver_token", 0) == hashCode()) {
                ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
                if (componentName != null) {
                    d(true, Boolean.TRUE, componentName.flattenToString());
                } else {
                    d(true, Boolean.TRUE, "OK");
                }
            }
        }
    }
}