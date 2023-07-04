package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class g extends Service {

    /* renamed from: g  reason: collision with root package name */
    static final Object f4299g = new Object();

    /* renamed from: h  reason: collision with root package name */
    static final HashMap<ComponentName, h> f4300h = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    b f4301a;

    /* renamed from: b  reason: collision with root package name */
    h f4302b;

    /* renamed from: c  reason: collision with root package name */
    a f4303c;

    /* renamed from: d  reason: collision with root package name */
    boolean f4304d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f4305e = false;

    /* renamed from: f  reason: collision with root package name */
    final ArrayList<d> f4306f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e a11 = g.this.a();
                if (a11 == null) {
                    return null;
                }
                g.this.g(a11.getIntent());
                a11.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onCancelled(Void r12) {
            g.this.i();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: c */
        public void onPostExecute(Void r12) {
            g.this.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        IBinder a();

        e b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends h {

        /* renamed from: d  reason: collision with root package name */
        private final Context f4308d;

        /* renamed from: e  reason: collision with root package name */
        private final PowerManager.WakeLock f4309e;

        /* renamed from: f  reason: collision with root package name */
        private final PowerManager.WakeLock f4310f;

        /* renamed from: g  reason: collision with root package name */
        boolean f4311g;

        /* renamed from: h  reason: collision with root package name */
        boolean f4312h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.f4308d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f4309e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f4310f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.g.h
        void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f4323a);
            if (this.f4308d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f4311g) {
                        this.f4311g = true;
                        if (!this.f4312h) {
                            this.f4309e.acquire(60000L);
                        }
                    }
                }
            }
        }

        @Override // androidx.core.app.g.h
        public void c() {
            synchronized (this) {
                if (this.f4312h) {
                    if (this.f4311g) {
                        this.f4309e.acquire(60000L);
                    }
                    this.f4312h = false;
                    this.f4310f.release();
                }
            }
        }

        @Override // androidx.core.app.g.h
        public void d() {
            synchronized (this) {
                if (!this.f4312h) {
                    this.f4312h = true;
                    this.f4310f.acquire(600000L);
                    this.f4309e.release();
                }
            }
        }

        @Override // androidx.core.app.g.h
        public void e() {
            synchronized (this) {
                this.f4311g = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        final Intent f4313a;

        /* renamed from: b  reason: collision with root package name */
        final int f4314b;

        d(Intent intent, int i11) {
            this.f4313a = intent;
            this.f4314b = i11;
        }

        @Override // androidx.core.app.g.e
        public void a() {
            g.this.stopSelf(this.f4314b);
        }

        @Override // androidx.core.app.g.e
        public Intent getIntent() {
            return this.f4313a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface e {
        void a();

        Intent getIntent();
    }

    /* loaded from: classes.dex */
    static final class f extends JobServiceEngine implements b {

        /* renamed from: a  reason: collision with root package name */
        final g f4316a;

        /* renamed from: b  reason: collision with root package name */
        final Object f4317b;

        /* renamed from: c  reason: collision with root package name */
        JobParameters f4318c;

        /* loaded from: classes.dex */
        final class a implements e {

            /* renamed from: a  reason: collision with root package name */
            final JobWorkItem f4319a;

            a(JobWorkItem jobWorkItem) {
                this.f4319a = jobWorkItem;
            }

            @Override // androidx.core.app.g.e
            public void a() {
                synchronized (f.this.f4317b) {
                    JobParameters jobParameters = f.this.f4318c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f4319a);
                    }
                }
            }

            @Override // androidx.core.app.g.e
            public Intent getIntent() {
                return this.f4319a.getIntent();
            }
        }

        f(g gVar) {
            super(gVar);
            this.f4317b = new Object();
            this.f4316a = gVar;
        }

        @Override // androidx.core.app.g.b
        public IBinder a() {
            return getBinder();
        }

        @Override // androidx.core.app.g.b
        public e b() {
            synchronized (this.f4317b) {
                JobParameters jobParameters = this.f4318c;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem dequeueWork = jobParameters.dequeueWork();
                if (dequeueWork != null) {
                    dequeueWork.getIntent().setExtrasClassLoader(this.f4316a.getClassLoader());
                    return new a(dequeueWork);
                }
                return null;
            }
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.f4318c = jobParameters;
            this.f4316a.e(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean b11 = this.f4316a.b();
            synchronized (this.f4317b) {
                this.f4318c = null;
            }
            return b11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0071g extends h {

        /* renamed from: d  reason: collision with root package name */
        private final JobInfo f4321d;

        /* renamed from: e  reason: collision with root package name */
        private final JobScheduler f4322e;

        C0071g(Context context, ComponentName componentName, int i11) {
            super(componentName);
            b(i11);
            this.f4321d = new JobInfo.Builder(i11, this.f4323a).setOverrideDeadline(0L).build();
            this.f4322e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.g.h
        void a(Intent intent) {
            this.f4322e.enqueue(this.f4321d, new JobWorkItem(intent));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class h {

        /* renamed from: a  reason: collision with root package name */
        final ComponentName f4323a;

        /* renamed from: b  reason: collision with root package name */
        boolean f4324b;

        /* renamed from: c  reason: collision with root package name */
        int f4325c;

        h(ComponentName componentName) {
            this.f4323a = componentName;
        }

        abstract void a(Intent intent);

        void b(int i11) {
            if (!this.f4324b) {
                this.f4324b = true;
                this.f4325c = i11;
            } else if (this.f4325c == i11) {
            } else {
                throw new IllegalArgumentException("Given job ID " + i11 + " is different than previous " + this.f4325c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public g() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4306f = null;
        } else {
            this.f4306f = new ArrayList<>();
        }
    }

    public static void c(Context context, ComponentName componentName, int i11, Intent intent) {
        if (intent != null) {
            synchronized (f4299g) {
                h f11 = f(context, componentName, true, i11);
                f11.b(i11);
                f11.a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public static void d(Context context, Class<?> cls, int i11, Intent intent) {
        c(context, new ComponentName(context, cls), i11, intent);
    }

    static h f(Context context, ComponentName componentName, boolean z11, int i11) {
        h cVar;
        HashMap<ComponentName, h> hashMap = f4300h;
        h hVar = hashMap.get(componentName);
        if (hVar == null) {
            if (Build.VERSION.SDK_INT < 26) {
                cVar = new c(context, componentName);
            } else if (z11) {
                cVar = new C0071g(context, componentName, i11);
            } else {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            h hVar2 = cVar;
            hashMap.put(componentName, hVar2);
            return hVar2;
        }
        return hVar;
    }

    e a() {
        b bVar = this.f4301a;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.f4306f) {
            if (this.f4306f.size() > 0) {
                return this.f4306f.remove(0);
            }
            return null;
        }
    }

    boolean b() {
        a aVar = this.f4303c;
        if (aVar != null) {
            aVar.cancel(this.f4304d);
        }
        return h();
    }

    void e(boolean z11) {
        if (this.f4303c == null) {
            this.f4303c = new a();
            h hVar = this.f4302b;
            if (hVar != null && z11) {
                hVar.d();
            }
            this.f4303c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    protected abstract void g(Intent intent);

    public boolean h() {
        return true;
    }

    void i() {
        ArrayList<d> arrayList = this.f4306f;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f4303c = null;
                ArrayList<d> arrayList2 = this.f4306f;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    e(false);
                } else if (!this.f4305e) {
                    this.f4302b.c();
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b bVar = this.f4301a;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4301a = new f(this);
            this.f4302b = null;
            return;
        }
        this.f4301a = null;
        this.f4302b = f(this, new ComponentName(this, getClass()), false, 0);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.f4306f;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f4305e = true;
                this.f4302b.c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        if (this.f4306f != null) {
            this.f4302b.e();
            synchronized (this.f4306f) {
                ArrayList<d> arrayList = this.f4306f;
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new d(intent, i12));
                e(true);
            }
            return 3;
        }
        return 2;
    }
}