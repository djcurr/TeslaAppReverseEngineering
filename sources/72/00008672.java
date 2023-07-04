package m9;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static Context f38447a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f38448b = false;

    /* renamed from: c  reason: collision with root package name */
    public static c f38449c;

    /* renamed from: d  reason: collision with root package name */
    public static c f38450d;

    /* renamed from: e  reason: collision with root package name */
    public static c f38451e;

    /* renamed from: f  reason: collision with root package name */
    public static Object f38452f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static HandlerThread f38453g;

    /* renamed from: h  reason: collision with root package name */
    public static Handler f38454h;

    /* renamed from: i  reason: collision with root package name */
    public static String f38455i;

    /* renamed from: j  reason: collision with root package name */
    public static String f38456j;

    /* renamed from: k  reason: collision with root package name */
    public static volatile b f38457k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile m9.a f38458l;

    /* loaded from: classes.dex */
    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 11) {
                String unused = b.f38455i = b.f38458l.a(message.getData().getInt("type"), message.getData().getString("appid"));
                synchronized (b.f38452f) {
                    b.f38452f.notify();
                }
                return;
            }
            Log.e("VMS_IDLG_SDK_Client", "message type valid");
        }
    }

    public static String b(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
            } catch (Exception e11) {
                e11.printStackTrace();
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static b c(Context context) {
        if (f38457k == null) {
            synchronized (b.class) {
                f38447a = context.getApplicationContext();
                f38457k = new b();
            }
        }
        if (f38458l == null) {
            synchronized (b.class) {
                f38447a = context.getApplicationContext();
                l();
                f38458l = new m9.a(f38447a);
                k();
            }
        }
        return f38457k;
    }

    public static void e(Context context, int i11, String str) {
        if (i11 == 0) {
            f38449c = new c(f38457k, 0, null);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, f38449c);
        } else if (i11 == 1) {
            f38450d = new c(f38457k, 1, str);
            ContentResolver contentResolver = context.getContentResolver();
            contentResolver.registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, f38450d);
        } else if (i11 != 2) {
        } else {
            f38451e = new c(f38457k, 2, str);
            ContentResolver contentResolver2 = context.getContentResolver();
            contentResolver2.registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str), false, f38451e);
        }
    }

    private void f(int i11, String str) {
        Message obtainMessage = f38454h.obtainMessage();
        obtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i11);
        if (i11 == 1 || i11 == 2) {
            bundle.putString("appid", str);
        }
        obtainMessage.setData(bundle);
        f38454h.sendMessage(obtainMessage);
    }

    public static void k() {
        f38448b = "1".equals(b("persist.sys.identifierid.supported", "0"));
    }

    public static void l() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        f38453g = handlerThread;
        handlerThread.start();
        f38454h = new a(f38453g.getLooper());
    }

    public String a() {
        if (h()) {
            String str = f38456j;
            if (str != null) {
                return str;
            }
            d(0, null);
            if (f38449c == null) {
                e(f38447a, 0, null);
            }
            return f38456j;
        }
        return null;
    }

    public void d(int i11, String str) {
        synchronized (f38452f) {
            f(i11, str);
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                f38452f.wait(2000L);
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
            if (SystemClock.uptimeMillis() - uptimeMillis >= 2000) {
                Log.d("VMS_IDLG_SDK_Client", "query timeout");
            } else if (i11 == 0) {
                f38456j = f38455i;
                f38455i = null;
            } else if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                    }
                } else if (f38455i != null) {
                    f38455i = null;
                } else {
                    Log.e("VMS_IDLG_SDK_Client", "get aaid failed");
                }
                f38455i = null;
            } else if (f38455i != null) {
                f38455i = null;
            } else {
                Log.e("VMS_IDLG_SDK_Client", "get vaid failed");
            }
        }
    }

    public boolean h() {
        return f38448b;
    }
}