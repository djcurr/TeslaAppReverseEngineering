package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import b.a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: d  reason: collision with root package name */
    private static String f4385d;

    /* renamed from: g  reason: collision with root package name */
    private static d f4388g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f4389a;

    /* renamed from: b  reason: collision with root package name */
    private final NotificationManager f4390b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f4384c = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static Set<String> f4386e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f4387f = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final String f4391a;

        /* renamed from: b  reason: collision with root package name */
        final int f4392b;

        /* renamed from: c  reason: collision with root package name */
        final String f4393c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f4394d = false;

        a(String str, int i11, String str2) {
            this.f4391a = str;
            this.f4392b = i11;
            this.f4393c = str2;
        }

        @Override // androidx.core.app.m.e
        public void a(b.a aVar) {
            if (this.f4394d) {
                aVar.t(this.f4391a);
            } else {
                aVar.d(this.f4391a, this.f4392b, this.f4393c);
            }
        }

        public String toString() {
            return "CancelTask[packageName:" + this.f4391a + ", id:" + this.f4392b + ", tag:" + this.f4393c + ", all:" + this.f4394d + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements e {

        /* renamed from: a  reason: collision with root package name */
        final String f4395a;

        /* renamed from: b  reason: collision with root package name */
        final int f4396b;

        /* renamed from: c  reason: collision with root package name */
        final String f4397c;

        /* renamed from: d  reason: collision with root package name */
        final Notification f4398d;

        b(String str, int i11, String str2, Notification notification) {
            this.f4395a = str;
            this.f4396b = i11;
            this.f4397c = str2;
            this.f4398d = notification;
        }

        @Override // androidx.core.app.m.e
        public void a(b.a aVar) {
            aVar.F(this.f4395a, this.f4396b, this.f4397c, this.f4398d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f4395a + ", id:" + this.f4396b + ", tag:" + this.f4397c + "]";
        }
    }

    /* loaded from: classes.dex */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final ComponentName f4399a;

        /* renamed from: b  reason: collision with root package name */
        final IBinder f4400b;

        c(ComponentName componentName, IBinder iBinder) {
            this.f4399a = componentName;
            this.f4400b = iBinder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d implements Handler.Callback, ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final Context f4401a;

        /* renamed from: b  reason: collision with root package name */
        private final HandlerThread f4402b;

        /* renamed from: c  reason: collision with root package name */
        private final Handler f4403c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<ComponentName, a> f4404d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private Set<String> f4405e = new HashSet();

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            final ComponentName f4406a;

            /* renamed from: c  reason: collision with root package name */
            b.a f4408c;

            /* renamed from: b  reason: collision with root package name */
            boolean f4407b = false;

            /* renamed from: d  reason: collision with root package name */
            ArrayDeque<e> f4409d = new ArrayDeque<>();

            /* renamed from: e  reason: collision with root package name */
            int f4410e = 0;

            a(ComponentName componentName) {
                this.f4406a = componentName;
            }
        }

        d(Context context) {
            this.f4401a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f4402b = handlerThread;
            handlerThread.start();
            this.f4403c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f4407b) {
                return true;
            }
            boolean bindService = this.f4401a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f4406a), this, 33);
            aVar.f4407b = bindService;
            if (bindService) {
                aVar.f4410e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f4406a);
                this.f4401a.unbindService(this);
            }
            return aVar.f4407b;
        }

        private void b(a aVar) {
            if (aVar.f4407b) {
                this.f4401a.unbindService(this);
                aVar.f4407b = false;
            }
            aVar.f4408c = null;
        }

        private void c(e eVar) {
            j();
            for (a aVar : this.f4404d.values()) {
                aVar.f4409d.add(eVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f4404d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f4404d.get(componentName);
            if (aVar != null) {
                aVar.f4408c = a.AbstractBinderC0133a.J(iBinder);
                aVar.f4410e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f4404d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f4406a + ", " + aVar.f4409d.size() + " queued tasks");
            }
            if (aVar.f4409d.isEmpty()) {
                return;
            }
            if (a(aVar) && aVar.f4408c != null) {
                while (true) {
                    e peek = aVar.f4409d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.a(aVar.f4408c);
                        aVar.f4409d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f4406a);
                        }
                    } catch (RemoteException e11) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f4406a, e11);
                    }
                }
                if (aVar.f4409d.isEmpty()) {
                    return;
                }
                i(aVar);
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f4403c.hasMessages(3, aVar.f4406a)) {
                return;
            }
            int i11 = aVar.f4410e + 1;
            aVar.f4410e = i11;
            if (i11 > 6) {
                Log.w("NotifManCompat", "Giving up on delivering " + aVar.f4409d.size() + " tasks to " + aVar.f4406a + " after " + aVar.f4410e + " retries");
                aVar.f4409d.clear();
                return;
            }
            int i12 = (1 << (i11 - 1)) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
            }
            this.f4403c.sendMessageDelayed(this.f4403c.obtainMessage(3, aVar.f4406a), i12);
        }

        private void j() {
            Set<String> f11 = m.f(this.f4401a);
            if (f11.equals(this.f4405e)) {
                return;
            }
            this.f4405e = f11;
            List<ResolveInfo> queryIntentServices = this.f4401a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (f11.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f4404d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f4404d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it2 = this.f4404d.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<ComponentName, a> next = it2.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it2.remove();
                }
            }
        }

        public void h(e eVar) {
            this.f4403c.obtainMessage(0, eVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 0) {
                c((e) message.obj);
                return true;
            } else if (i11 == 1) {
                c cVar = (c) message.obj;
                e(cVar.f4399a, cVar.f4400b);
                return true;
            } else if (i11 == 2) {
                f((ComponentName) message.obj);
                return true;
            } else if (i11 != 3) {
                return false;
            } else {
                d((ComponentName) message.obj);
                return true;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f4403c.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f4403c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface e {
        void a(b.a aVar);
    }

    private m(Context context) {
        this.f4389a = context;
        this.f4390b = (NotificationManager) context.getSystemService("notification");
    }

    public static m e(Context context) {
        return new m(context);
    }

    public static Set<String> f(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f4384c) {
            if (string != null) {
                if (!string.equals(f4385d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f4386e = hashSet;
                    f4385d = string;
                }
            }
            set = f4386e;
        }
        return set;
    }

    private void i(e eVar) {
        synchronized (f4387f) {
            if (f4388g == null) {
                f4388g = new d(this.f4389a.getApplicationContext());
            }
            f4388g.h(eVar);
        }
    }

    private static boolean j(Notification notification) {
        Bundle a11 = j.a(notification);
        return a11 != null && a11.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            return this.f4390b.areNotificationsEnabled();
        }
        if (i11 >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) this.f4389a.getSystemService("appops");
            ApplicationInfo applicationInfo = this.f4389a.getApplicationInfo();
            String packageName = this.f4389a.getApplicationContext().getPackageName();
            int i12 = applicationInfo.uid;
            try {
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class<?> cls2 = Integer.TYPE;
                return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i12), packageName)).intValue() == 0;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                return true;
            }
        }
        return true;
    }

    public void b(int i11) {
        c(null, i11);
    }

    public void c(String str, int i11) {
        this.f4390b.cancel(str, i11);
        if (Build.VERSION.SDK_INT <= 19) {
            i(new a(this.f4389a.getPackageName(), i11, str));
        }
    }

    public void d(List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4390b.createNotificationChannels(list);
        }
    }

    public void g(int i11, Notification notification) {
        h(null, i11, notification);
    }

    public void h(String str, int i11, Notification notification) {
        if (j(notification)) {
            i(new b(this.f4389a.getPackageName(), i11, str, notification));
            this.f4390b.cancel(str, i11);
            return;
        }
        this.f4390b.notify(str, i11, notification);
    }
}