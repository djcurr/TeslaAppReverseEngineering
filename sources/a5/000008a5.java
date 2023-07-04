package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.t;
import androidx.room.u;
import androidx.room.y;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    final Context f5913a;

    /* renamed from: b  reason: collision with root package name */
    final String f5914b;

    /* renamed from: c  reason: collision with root package name */
    int f5915c;

    /* renamed from: d  reason: collision with root package name */
    final y f5916d;

    /* renamed from: e  reason: collision with root package name */
    final y.c f5917e;

    /* renamed from: f  reason: collision with root package name */
    u f5918f;

    /* renamed from: g  reason: collision with root package name */
    final Executor f5919g;

    /* renamed from: h  reason: collision with root package name */
    final t f5920h = new a();

    /* renamed from: i  reason: collision with root package name */
    final AtomicBoolean f5921i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    final ServiceConnection f5922j;

    /* renamed from: k  reason: collision with root package name */
    final Runnable f5923k;

    /* renamed from: l  reason: collision with root package name */
    final Runnable f5924l;

    /* loaded from: classes.dex */
    class a extends t.a {

        /* renamed from: androidx.room.z$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0099a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String[] f5926a;

            RunnableC0099a(String[] strArr) {
                this.f5926a = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                z.this.f5916d.f(this.f5926a);
            }
        }

        a() {
        }

        @Override // androidx.room.t
        public void b(String[] strArr) {
            z.this.f5919g.execute(new RunnableC0099a(strArr));
        }
    }

    /* loaded from: classes.dex */
    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            z.this.f5918f = u.a.J(iBinder);
            z zVar = z.this;
            zVar.f5919g.execute(zVar.f5923k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            z zVar = z.this;
            zVar.f5919g.execute(zVar.f5924l);
            z.this.f5918f = null;
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                z zVar = z.this;
                u uVar = zVar.f5918f;
                if (uVar != null) {
                    zVar.f5915c = uVar.u(zVar.f5920h, zVar.f5914b);
                    z zVar2 = z.this;
                    zVar2.f5916d.a(zVar2.f5917e);
                }
            } catch (RemoteException e11) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e11);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z zVar = z.this;
            zVar.f5916d.i(zVar.f5917e);
        }
    }

    /* loaded from: classes.dex */
    class e extends y.c {
        e(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.y.c
        boolean a() {
            return true;
        }

        @Override // androidx.room.y.c
        public void b(Set<String> set) {
            if (z.this.f5921i.get()) {
                return;
            }
            try {
                z zVar = z.this;
                u uVar = zVar.f5918f;
                if (uVar != null) {
                    uVar.n(zVar.f5915c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e11) {
                Log.w("ROOM", "Cannot broadcast invalidation", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(Context context, String str, Intent intent, y yVar, Executor executor) {
        b bVar = new b();
        this.f5922j = bVar;
        this.f5923k = new c();
        this.f5924l = new d();
        Context applicationContext = context.getApplicationContext();
        this.f5913a = applicationContext;
        this.f5914b = str;
        this.f5916d = yVar;
        this.f5919g = executor;
        this.f5917e = new e((String[]) yVar.f5886a.keySet().toArray(new String[0]));
        applicationContext.bindService(intent, bVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.f5921i.compareAndSet(false, true)) {
            this.f5916d.i(this.f5917e);
            try {
                u uVar = this.f5918f;
                if (uVar != null) {
                    uVar.H(this.f5920h, this.f5915c);
                }
            } catch (RemoteException e11) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e11);
            }
            this.f5913a.unbindService(this.f5922j);
        }
    }
}