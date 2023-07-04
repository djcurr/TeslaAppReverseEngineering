package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.r0;
import com.google.firebase.messaging.v0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import rm.a;

/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: n */
    private static final long f16704n = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o */
    private static v0 f16705o;

    /* renamed from: p */
    static nh.g f16706p;

    /* renamed from: q */
    static ScheduledExecutorService f16707q;

    /* renamed from: a */
    private final com.google.firebase.d f16708a;

    /* renamed from: b */
    private final rm.a f16709b;

    /* renamed from: c */
    private final tm.e f16710c;

    /* renamed from: d */
    private final Context f16711d;

    /* renamed from: e */
    private final d0 f16712e;

    /* renamed from: f */
    private final r0 f16713f;

    /* renamed from: g */
    private final a f16714g;

    /* renamed from: h */
    private final Executor f16715h;

    /* renamed from: i */
    private final Executor f16716i;

    /* renamed from: j */
    private final Task<a1> f16717j;

    /* renamed from: k */
    private final i0 f16718k;

    /* renamed from: l */
    private boolean f16719l;

    /* renamed from: m */
    private final Application.ActivityLifecycleCallbacks f16720m;

    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a */
        private final pm.d f16721a;

        /* renamed from: b */
        private boolean f16722b;

        /* renamed from: c */
        private pm.b<com.google.firebase.a> f16723c;

        /* renamed from: d */
        private Boolean f16724d;

        a(pm.d dVar) {
            FirebaseMessaging.this = r1;
            this.f16721a = dVar;
        }

        public static /* synthetic */ void a(a aVar, pm.a aVar2) {
            aVar.d(aVar2);
        }

        public /* synthetic */ void d(pm.a aVar) {
            if (c()) {
                FirebaseMessaging.this.H();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context j11 = FirebaseMessaging.this.f16708a.j();
            SharedPreferences sharedPreferences = j11.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = j11.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(j11.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            if (this.f16722b) {
                return;
            }
            Boolean e11 = e();
            this.f16724d = e11;
            if (e11 == null) {
                pm.b<com.google.firebase.a> bVar = new pm.b() { // from class: com.google.firebase.messaging.a0
                    {
                        FirebaseMessaging.a.this = this;
                    }

                    @Override // pm.b
                    public final void a(pm.a aVar) {
                        FirebaseMessaging.a.a(FirebaseMessaging.a.this, aVar);
                    }
                };
                this.f16723c = bVar;
                this.f16721a.a(com.google.firebase.a.class, bVar);
            }
            this.f16722b = true;
        }

        synchronized boolean c() {
            boolean s11;
            b();
            Boolean bool = this.f16724d;
            if (bool == null) {
                s11 = FirebaseMessaging.this.f16708a.s();
            } else {
                s11 = bool.booleanValue();
            }
            return s11;
        }
    }

    public FirebaseMessaging(com.google.firebase.d dVar, rm.a aVar, sm.b<ln.i> bVar, sm.b<qm.k> bVar2, tm.e eVar, nh.g gVar, pm.d dVar2) {
        this(dVar, aVar, bVar, bVar2, eVar, gVar, dVar2, new i0(dVar.j()));
    }

    public /* synthetic */ void A(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(this.f16712e.c());
            p(this.f16711d).d(q(), i0.c(this.f16708a));
            taskCompletionSource.setResult(null);
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    public /* synthetic */ void B(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(k());
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    public /* synthetic */ void C() {
        if (v()) {
            H();
        }
    }

    public /* synthetic */ void D(a1 a1Var) {
        if (v()) {
            a1Var.o();
        }
    }

    public /* synthetic */ void E() {
        m0.c(this.f16711d);
    }

    private synchronized void G() {
        if (!this.f16719l) {
            I(0L);
        }
    }

    public void H() {
        rm.a aVar = this.f16709b;
        if (aVar != null) {
            aVar.a();
        } else if (J(s())) {
            G();
        }
    }

    public static /* synthetic */ Task b(FirebaseMessaging firebaseMessaging, String str, v0.a aVar, String str2) {
        return firebaseMessaging.y(str, aVar, str2);
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging) {
        firebaseMessaging.E();
    }

    public static /* synthetic */ void d(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.z(taskCompletionSource);
    }

    public static /* synthetic */ void f(FirebaseMessaging firebaseMessaging) {
        firebaseMessaging.C();
    }

    public static /* synthetic */ void g(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.B(taskCompletionSource);
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(com.google.firebase.d dVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) dVar.i(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static /* synthetic */ void h(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.A(taskCompletionSource);
    }

    public static synchronized FirebaseMessaging o() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(com.google.firebase.d.k());
        }
        return firebaseMessaging;
    }

    private static synchronized v0 p(Context context) {
        v0 v0Var;
        synchronized (FirebaseMessaging.class) {
            if (f16705o == null) {
                f16705o = new v0(context);
            }
            v0Var = f16705o;
        }
        return v0Var;
    }

    private String q() {
        return "[DEFAULT]".equals(this.f16708a.l()) ? "" : this.f16708a.n();
    }

    public static nh.g t() {
        return f16706p;
    }

    private void u(String str) {
        if ("[DEFAULT]".equals(this.f16708a.l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f16708a.l());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new n(this.f16711d).k(intent);
        }
    }

    public /* synthetic */ Task x(final String str, final v0.a aVar) {
        return this.f16712e.f().onSuccessTask(h.f16804a, new SuccessContinuation() { // from class: com.google.firebase.messaging.s
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return FirebaseMessaging.b(FirebaseMessaging.this, str, aVar, (String) obj);
            }
        });
    }

    public /* synthetic */ Task y(String str, v0.a aVar, String str2) {
        p(this.f16711d).g(q(), str, str2, this.f16718k.a());
        if (aVar == null || !str2.equals(aVar.f16870a)) {
            u(str2);
        }
        return Tasks.forResult(str2);
    }

    public /* synthetic */ void z(TaskCompletionSource taskCompletionSource) {
        try {
            this.f16709b.b(i0.c(this.f16708a), "FCM");
            taskCompletionSource.setResult(null);
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    public synchronized void F(boolean z11) {
        this.f16719l = z11;
    }

    public synchronized void I(long j11) {
        m(new w0(this, Math.min(Math.max(30L, 2 * j11), f16704n)), j11);
        this.f16719l = true;
    }

    boolean J(v0.a aVar) {
        return aVar == null || aVar.b(this.f16718k.a());
    }

    public String k() {
        rm.a aVar = this.f16709b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.c());
            } catch (InterruptedException | ExecutionException e11) {
                throw new IOException(e11);
            }
        }
        final v0.a s11 = s();
        if (!J(s11)) {
            return s11.f16870a;
        }
        final String c11 = i0.c(this.f16708a);
        try {
            return (String) Tasks.await(this.f16713f.b(c11, new r0.a() { // from class: com.google.firebase.messaging.t
                @Override // com.google.firebase.messaging.r0.a
                public final Task start() {
                    Task x11;
                    x11 = FirebaseMessaging.this.x(c11, s11);
                    return x11;
                }
            }));
        } catch (InterruptedException | ExecutionException e12) {
            throw new IOException(e12);
        }
    }

    public Task<Void> l() {
        if (this.f16709b != null) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f16715h.execute(new Runnable() { // from class: com.google.firebase.messaging.w
                {
                    FirebaseMessaging.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.d(FirebaseMessaging.this, taskCompletionSource);
                }
            });
            return taskCompletionSource.getTask();
        } else if (s() == null) {
            return Tasks.forResult(null);
        } else {
            final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            o.c().execute(new Runnable() { // from class: com.google.firebase.messaging.y
                {
                    FirebaseMessaging.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.h(FirebaseMessaging.this, taskCompletionSource2);
                }
            });
            return taskCompletionSource2.getTask();
        }
    }

    public void m(Runnable runnable, long j11) {
        synchronized (FirebaseMessaging.class) {
            if (f16707q == null) {
                f16707q = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            f16707q.schedule(runnable, j11, TimeUnit.SECONDS);
        }
    }

    public Context n() {
        return this.f16711d;
    }

    public Task<String> r() {
        rm.a aVar = this.f16709b;
        if (aVar != null) {
            return aVar.c();
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f16715h.execute(new Runnable() { // from class: com.google.firebase.messaging.x
            {
                FirebaseMessaging.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.g(FirebaseMessaging.this, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    v0.a s() {
        return p(this.f16711d).e(q(), i0.c(this.f16708a));
    }

    public boolean v() {
        return this.f16714g.c();
    }

    public boolean w() {
        return this.f16718k.g();
    }

    FirebaseMessaging(com.google.firebase.d dVar, rm.a aVar, sm.b<ln.i> bVar, sm.b<qm.k> bVar2, tm.e eVar, nh.g gVar, pm.d dVar2, i0 i0Var) {
        this(dVar, aVar, eVar, gVar, dVar2, i0Var, new d0(dVar, i0Var, bVar, bVar2, eVar), o.d(), o.a());
    }

    FirebaseMessaging(com.google.firebase.d dVar, rm.a aVar, tm.e eVar, nh.g gVar, pm.d dVar2, i0 i0Var, d0 d0Var, Executor executor, Executor executor2) {
        this.f16719l = false;
        f16706p = gVar;
        this.f16708a = dVar;
        this.f16709b = aVar;
        this.f16710c = eVar;
        this.f16714g = new a(dVar2);
        Context j11 = dVar.j();
        this.f16711d = j11;
        q qVar = new q();
        this.f16720m = qVar;
        this.f16718k = i0Var;
        this.f16716i = executor;
        this.f16712e = d0Var;
        this.f16713f = new r0(executor);
        this.f16715h = executor2;
        Context j12 = dVar.j();
        if (j12 instanceof Application) {
            ((Application) j12).registerActivityLifecycleCallbacks(qVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + j12 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.d(new a.InterfaceC1083a(this) { // from class: com.google.firebase.messaging.z
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.v
            {
                FirebaseMessaging.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.f(FirebaseMessaging.this);
            }
        });
        Task<a1> e11 = a1.e(this, i0Var, d0Var, j11, o.e());
        this.f16717j = e11;
        e11.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: com.google.firebase.messaging.r
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.D((a1) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            {
                FirebaseMessaging.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.c(FirebaseMessaging.this);
            }
        });
    }
}