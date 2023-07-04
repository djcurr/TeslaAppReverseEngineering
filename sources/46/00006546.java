package d5;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.a0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.l;
import androidx.work.q;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import k5.p;
import k5.t;
import l5.m;
import l5.n;
import l5.o;

/* loaded from: classes.dex */
public class j implements Runnable {

    /* renamed from: x  reason: collision with root package name */
    static final String f23652x = q.f("WorkerWrapper");

    /* renamed from: a  reason: collision with root package name */
    Context f23653a;

    /* renamed from: b  reason: collision with root package name */
    private String f23654b;

    /* renamed from: c  reason: collision with root package name */
    private List<e> f23655c;

    /* renamed from: d  reason: collision with root package name */
    private WorkerParameters.a f23656d;

    /* renamed from: e  reason: collision with root package name */
    p f23657e;

    /* renamed from: f  reason: collision with root package name */
    ListenableWorker f23658f;

    /* renamed from: g  reason: collision with root package name */
    m5.a f23659g;

    /* renamed from: i  reason: collision with root package name */
    private androidx.work.b f23661i;

    /* renamed from: j  reason: collision with root package name */
    private j5.a f23662j;

    /* renamed from: k  reason: collision with root package name */
    private WorkDatabase f23663k;

    /* renamed from: l  reason: collision with root package name */
    private k5.q f23664l;

    /* renamed from: m  reason: collision with root package name */
    private k5.b f23665m;

    /* renamed from: n  reason: collision with root package name */
    private t f23666n;

    /* renamed from: o  reason: collision with root package name */
    private List<String> f23667o;

    /* renamed from: p  reason: collision with root package name */
    private String f23668p;

    /* renamed from: w  reason: collision with root package name */
    private volatile boolean f23671w;

    /* renamed from: h  reason: collision with root package name */
    ListenableWorker.a f23660h = ListenableWorker.a.a();

    /* renamed from: q  reason: collision with root package name */
    androidx.work.impl.utils.futures.c<Boolean> f23669q = androidx.work.impl.utils.futures.c.t();

    /* renamed from: t  reason: collision with root package name */
    com.google.common.util.concurrent.c<ListenableWorker.a> f23670t = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.c f23672a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f23673b;

        a(com.google.common.util.concurrent.c cVar, androidx.work.impl.utils.futures.c cVar2) {
            this.f23672a = cVar;
            this.f23673b = cVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f23672a.get();
                q.c().a(j.f23652x, String.format("Starting work for %s", j.this.f23657e.f34407c), new Throwable[0]);
                j jVar = j.this;
                jVar.f23670t = jVar.f23658f.startWork();
                this.f23673b.r(j.this.f23670t);
            } catch (Throwable th2) {
                this.f23673b.q(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f23675a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f23676b;

        b(androidx.work.impl.utils.futures.c cVar, String str) {
            this.f23675a = cVar;
            this.f23676b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f23675a.get();
                    if (aVar == null) {
                        q.c().b(j.f23652x, String.format("%s returned a null result. Treating it as a failure.", j.this.f23657e.f34407c), new Throwable[0]);
                    } else {
                        q.c().a(j.f23652x, String.format("%s returned a %s result.", j.this.f23657e.f34407c, aVar), new Throwable[0]);
                        j.this.f23660h = aVar;
                    }
                } catch (InterruptedException e11) {
                    e = e11;
                    q.c().b(j.f23652x, String.format("%s failed because it threw an exception/error", this.f23676b), e);
                } catch (CancellationException e12) {
                    q.c().d(j.f23652x, String.format("%s was cancelled", this.f23676b), e12);
                } catch (ExecutionException e13) {
                    e = e13;
                    q.c().b(j.f23652x, String.format("%s failed because it threw an exception/error", this.f23676b), e);
                }
            } finally {
                j.this.f();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        Context f23678a;

        /* renamed from: b  reason: collision with root package name */
        ListenableWorker f23679b;

        /* renamed from: c  reason: collision with root package name */
        j5.a f23680c;

        /* renamed from: d  reason: collision with root package name */
        m5.a f23681d;

        /* renamed from: e  reason: collision with root package name */
        androidx.work.b f23682e;

        /* renamed from: f  reason: collision with root package name */
        WorkDatabase f23683f;

        /* renamed from: g  reason: collision with root package name */
        String f23684g;

        /* renamed from: h  reason: collision with root package name */
        List<e> f23685h;

        /* renamed from: i  reason: collision with root package name */
        WorkerParameters.a f23686i = new WorkerParameters.a();

        public c(Context context, androidx.work.b bVar, m5.a aVar, j5.a aVar2, WorkDatabase workDatabase, String str) {
            this.f23678a = context.getApplicationContext();
            this.f23681d = aVar;
            this.f23680c = aVar2;
            this.f23682e = bVar;
            this.f23683f = workDatabase;
            this.f23684g = str;
        }

        public j a() {
            return new j(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f23686i = aVar;
            }
            return this;
        }

        public c c(List<e> list) {
            this.f23685h = list;
            return this;
        }
    }

    j(c cVar) {
        this.f23653a = cVar.f23678a;
        this.f23659g = cVar.f23681d;
        this.f23662j = cVar.f23680c;
        this.f23654b = cVar.f23684g;
        this.f23655c = cVar.f23685h;
        this.f23656d = cVar.f23686i;
        this.f23658f = cVar.f23679b;
        this.f23661i = cVar.f23682e;
        WorkDatabase workDatabase = cVar.f23683f;
        this.f23663k = workDatabase;
        this.f23664l = workDatabase.l();
        this.f23665m = this.f23663k.d();
        this.f23666n = this.f23663k.m();
    }

    private String a(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f23654b);
        sb2.append(", tags={ ");
        boolean z11 = true;
        for (String str : list) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    private void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            q.c().d(f23652x, String.format("Worker result SUCCESS for %s", this.f23668p), new Throwable[0]);
            if (this.f23657e.d()) {
                h();
            } else {
                m();
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            q.c().d(f23652x, String.format("Worker result RETRY for %s", this.f23668p), new Throwable[0]);
            g();
        } else {
            q.c().d(f23652x, String.format("Worker result FAILURE for %s", this.f23668p), new Throwable[0]);
            if (this.f23657e.d()) {
                h();
            } else {
                l();
            }
        }
    }

    private void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f23664l.f(str2) != a0.a.CANCELLED) {
                this.f23664l.b(a0.a.FAILED, str2);
            }
            linkedList.addAll(this.f23665m.a(str2));
        }
    }

    private void g() {
        this.f23663k.beginTransaction();
        try {
            this.f23664l.b(a0.a.ENQUEUED, this.f23654b);
            this.f23664l.t(this.f23654b, System.currentTimeMillis());
            this.f23664l.k(this.f23654b, -1L);
            this.f23663k.setTransactionSuccessful();
        } finally {
            this.f23663k.endTransaction();
            i(true);
        }
    }

    private void h() {
        this.f23663k.beginTransaction();
        try {
            this.f23664l.t(this.f23654b, System.currentTimeMillis());
            this.f23664l.b(a0.a.ENQUEUED, this.f23654b);
            this.f23664l.q(this.f23654b);
            this.f23664l.k(this.f23654b, -1L);
            this.f23663k.setTransactionSuccessful();
        } finally {
            this.f23663k.endTransaction();
            i(false);
        }
    }

    private void i(boolean z11) {
        ListenableWorker listenableWorker;
        this.f23663k.beginTransaction();
        try {
            if (!this.f23663k.l().p()) {
                l5.d.a(this.f23653a, RescheduleReceiver.class, false);
            }
            if (z11) {
                this.f23664l.b(a0.a.ENQUEUED, this.f23654b);
                this.f23664l.k(this.f23654b, -1L);
            }
            if (this.f23657e != null && (listenableWorker = this.f23658f) != null && listenableWorker.isRunInForeground()) {
                this.f23662j.a(this.f23654b);
            }
            this.f23663k.setTransactionSuccessful();
            this.f23663k.endTransaction();
            this.f23669q.p(Boolean.valueOf(z11));
        } catch (Throwable th2) {
            this.f23663k.endTransaction();
            throw th2;
        }
    }

    private void j() {
        a0.a f11 = this.f23664l.f(this.f23654b);
        if (f11 == a0.a.RUNNING) {
            q.c().a(f23652x, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f23654b), new Throwable[0]);
            i(true);
            return;
        }
        q.c().a(f23652x, String.format("Status for %s is %s; not doing any work", this.f23654b, f11), new Throwable[0]);
        i(false);
    }

    private void k() {
        androidx.work.e b11;
        if (n()) {
            return;
        }
        this.f23663k.beginTransaction();
        try {
            p g11 = this.f23664l.g(this.f23654b);
            this.f23657e = g11;
            if (g11 == null) {
                q.c().b(f23652x, String.format("Didn't find WorkSpec for id %s", this.f23654b), new Throwable[0]);
                i(false);
                this.f23663k.setTransactionSuccessful();
            } else if (g11.f34406b != a0.a.ENQUEUED) {
                j();
                this.f23663k.setTransactionSuccessful();
                q.c().a(f23652x, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f23657e.f34407c), new Throwable[0]);
            } else {
                if (g11.d() || this.f23657e.c()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    p pVar = this.f23657e;
                    if (!(pVar.f34418n == 0) && currentTimeMillis < pVar.a()) {
                        q.c().a(f23652x, String.format("Delaying execution for %s because it is being executed before schedule.", this.f23657e.f34407c), new Throwable[0]);
                        i(true);
                        this.f23663k.setTransactionSuccessful();
                        return;
                    }
                }
                this.f23663k.setTransactionSuccessful();
                this.f23663k.endTransaction();
                if (this.f23657e.d()) {
                    b11 = this.f23657e.f34409e;
                } else {
                    l b12 = this.f23661i.f().b(this.f23657e.f34408d);
                    if (b12 == null) {
                        q.c().b(f23652x, String.format("Could not create Input Merger %s", this.f23657e.f34408d), new Throwable[0]);
                        l();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f23657e.f34409e);
                    arrayList.addAll(this.f23664l.h(this.f23654b));
                    b11 = b12.b(arrayList);
                }
                WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f23654b), b11, this.f23667o, this.f23656d, this.f23657e.f34415k, this.f23661i.e(), this.f23659g, this.f23661i.m(), new o(this.f23663k, this.f23659g), new n(this.f23663k, this.f23662j, this.f23659g));
                if (this.f23658f == null) {
                    this.f23658f = this.f23661i.m().b(this.f23653a, this.f23657e.f34407c, workerParameters);
                }
                ListenableWorker listenableWorker = this.f23658f;
                if (listenableWorker == null) {
                    q.c().b(f23652x, String.format("Could not create Worker %s", this.f23657e.f34407c), new Throwable[0]);
                    l();
                } else if (listenableWorker.isUsed()) {
                    q.c().b(f23652x, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f23657e.f34407c), new Throwable[0]);
                    l();
                } else {
                    this.f23658f.setUsed();
                    if (o()) {
                        if (n()) {
                            return;
                        }
                        androidx.work.impl.utils.futures.c t11 = androidx.work.impl.utils.futures.c.t();
                        m mVar = new m(this.f23653a, this.f23657e, this.f23658f, workerParameters.b(), this.f23659g);
                        this.f23659g.a().execute(mVar);
                        com.google.common.util.concurrent.c<Void> a11 = mVar.a();
                        a11.a(new a(a11, t11), this.f23659g.a());
                        t11.a(new b(t11, this.f23668p), this.f23659g.c());
                        return;
                    }
                    j();
                }
            }
        } finally {
            this.f23663k.endTransaction();
        }
    }

    private void m() {
        this.f23663k.beginTransaction();
        try {
            this.f23664l.b(a0.a.SUCCEEDED, this.f23654b);
            this.f23664l.n(this.f23654b, ((ListenableWorker.a.c) this.f23660h).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f23665m.a(this.f23654b)) {
                if (this.f23664l.f(str) == a0.a.BLOCKED && this.f23665m.b(str)) {
                    q.c().d(f23652x, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f23664l.b(a0.a.ENQUEUED, str);
                    this.f23664l.t(str, currentTimeMillis);
                }
            }
            this.f23663k.setTransactionSuccessful();
        } finally {
            this.f23663k.endTransaction();
            i(false);
        }
    }

    private boolean n() {
        if (this.f23671w) {
            q.c().a(f23652x, String.format("Work interrupted for %s", this.f23668p), new Throwable[0]);
            a0.a f11 = this.f23664l.f(this.f23654b);
            if (f11 == null) {
                i(false);
            } else {
                i(!f11.isFinished());
            }
            return true;
        }
        return false;
    }

    private boolean o() {
        this.f23663k.beginTransaction();
        try {
            boolean z11 = true;
            if (this.f23664l.f(this.f23654b) == a0.a.ENQUEUED) {
                this.f23664l.b(a0.a.RUNNING, this.f23654b);
                this.f23664l.s(this.f23654b);
            } else {
                z11 = false;
            }
            this.f23663k.setTransactionSuccessful();
            return z11;
        } finally {
            this.f23663k.endTransaction();
        }
    }

    public com.google.common.util.concurrent.c<Boolean> b() {
        return this.f23669q;
    }

    public void d() {
        boolean z11;
        this.f23671w = true;
        n();
        com.google.common.util.concurrent.c<ListenableWorker.a> cVar = this.f23670t;
        if (cVar != null) {
            z11 = cVar.isDone();
            this.f23670t.cancel(true);
        } else {
            z11 = false;
        }
        ListenableWorker listenableWorker = this.f23658f;
        if (listenableWorker != null && !z11) {
            listenableWorker.stop();
        } else {
            q.c().a(f23652x, String.format("WorkSpec %s is already done. Not interrupting.", this.f23657e), new Throwable[0]);
        }
    }

    void f() {
        if (!n()) {
            this.f23663k.beginTransaction();
            try {
                a0.a f11 = this.f23664l.f(this.f23654b);
                this.f23663k.k().a(this.f23654b);
                if (f11 == null) {
                    i(false);
                } else if (f11 == a0.a.RUNNING) {
                    c(this.f23660h);
                } else if (!f11.isFinished()) {
                    g();
                }
                this.f23663k.setTransactionSuccessful();
            } finally {
                this.f23663k.endTransaction();
            }
        }
        List<e> list = this.f23655c;
        if (list != null) {
            for (e eVar : list) {
                eVar.a(this.f23654b);
            }
            f.b(this.f23661i, this.f23663k, this.f23655c);
        }
    }

    void l() {
        this.f23663k.beginTransaction();
        try {
            e(this.f23654b);
            this.f23664l.n(this.f23654b, ((ListenableWorker.a.C0114a) this.f23660h).e());
            this.f23663k.setTransactionSuccessful();
        } finally {
            this.f23663k.endTransaction();
            i(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> a11 = this.f23666n.a(this.f23654b);
        this.f23667o = a11;
        this.f23668p = a(a11);
        k();
    }
}