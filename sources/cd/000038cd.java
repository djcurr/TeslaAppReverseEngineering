package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f16551a;

    /* renamed from: b  reason: collision with root package name */
    private final r f16552b;

    /* renamed from: c  reason: collision with root package name */
    private final long f16553c = System.currentTimeMillis();

    /* renamed from: d  reason: collision with root package name */
    private m f16554d;

    /* renamed from: e  reason: collision with root package name */
    private m f16555e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f16556f;

    /* renamed from: g  reason: collision with root package name */
    private j f16557g;

    /* renamed from: h  reason: collision with root package name */
    private final v f16558h;

    /* renamed from: i  reason: collision with root package name */
    private final dm.f f16559i;

    /* renamed from: j  reason: collision with root package name */
    public final yl.b f16560j;

    /* renamed from: k  reason: collision with root package name */
    private final xl.a f16561k;

    /* renamed from: l  reason: collision with root package name */
    private final ExecutorService f16562l;

    /* renamed from: m  reason: collision with root package name */
    private final h f16563m;

    /* renamed from: n  reason: collision with root package name */
    private final wl.a f16564n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Callable<Task<Void>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fm.e f16565a;

        a(fm.e eVar) {
            this.f16565a = eVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Task<Void> call() {
            return l.this.i(this.f16565a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fm.e f16567a;

        b(fm.e eVar) {
            this.f16567a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.i(this.f16567a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Callable<Boolean> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() {
            try {
                boolean d11 = l.this.f16554d.d();
                if (!d11) {
                    wl.f.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d11);
            } catch (Exception e11) {
                wl.f.f().e("Problem encountered deleting Crashlytics initialization marker.", e11);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements Callable<Boolean> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(l.this.f16557g.u());
        }
    }

    public l(com.google.firebase.d dVar, v vVar, wl.a aVar, r rVar, yl.b bVar, xl.a aVar2, dm.f fVar, ExecutorService executorService) {
        this.f16552b = rVar;
        this.f16551a = dVar.j();
        this.f16558h = vVar;
        this.f16564n = aVar;
        this.f16560j = bVar;
        this.f16561k = aVar2;
        this.f16562l = executorService;
        this.f16559i = fVar;
        this.f16563m = new h(executorService);
    }

    private void d() {
        try {
            this.f16556f = Boolean.TRUE.equals((Boolean) h0.d(this.f16563m.h(new d())));
        } catch (Exception unused) {
            this.f16556f = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> i(fm.e eVar) {
        q();
        try {
            this.f16560j.a(new yl.a() { // from class: com.google.firebase.crashlytics.internal.common.k
                {
                    l.this = this;
                }

                @Override // yl.a
                public final void a(String str) {
                    l.this.n(str);
                }
            });
            if (!eVar.a().a().f28016a) {
                wl.f.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f16557g.B(eVar)) {
                wl.f.f().k("Previous sessions could not be finalized.");
            }
            return this.f16557g.S(eVar.b());
        } catch (Exception e11) {
            wl.f.f().e("Crashlytics encountered a problem during asynchronous initialization.", e11);
            return Tasks.forException(e11);
        } finally {
            p();
        }
    }

    private void k(fm.e eVar) {
        Future<?> submit = this.f16562l.submit(new b(eVar));
        wl.f.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e11) {
            wl.f.f().e("Crashlytics was interrupted during initialization.", e11);
        } catch (ExecutionException e12) {
            wl.f.f().e("Crashlytics encountered a problem during initialization.", e12);
        } catch (TimeoutException e13) {
            wl.f.f().e("Crashlytics timed out during initialization.", e13);
        }
    }

    public static String l() {
        return "18.2.9";
    }

    static boolean m(String str, boolean z11) {
        if (!z11) {
            wl.f.f().i("Configured not to require a build ID.");
            return true;
        } else if (TextUtils.isEmpty(str)) {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            return false;
        } else {
            return true;
        }
    }

    public Task<Boolean> e() {
        return this.f16557g.o();
    }

    public Task<Void> f() {
        return this.f16557g.t();
    }

    public boolean g() {
        return this.f16556f;
    }

    boolean h() {
        return this.f16554d.c();
    }

    public Task<Void> j(fm.e eVar) {
        return h0.e(this.f16562l, new a(eVar));
    }

    public void n(String str) {
        this.f16557g.W(System.currentTimeMillis() - this.f16553c, str);
    }

    public void o(Throwable th2) {
        this.f16557g.V(Thread.currentThread(), th2);
    }

    void p() {
        this.f16563m.h(new c());
    }

    void q() {
        this.f16563m.b();
        this.f16554d.a();
        wl.f.f().i("Initialization marker file was created.");
    }

    public boolean r(com.google.firebase.crashlytics.internal.common.a aVar, fm.e eVar) {
        if (m(aVar.f16467b, g.k(this.f16551a, "com.crashlytics.RequireBuildId", true))) {
            String fVar = new f(this.f16558h).toString();
            try {
                this.f16555e = new m("crash_marker", this.f16559i);
                this.f16554d = new m("initialization_marker", this.f16559i);
                zl.i iVar = new zl.i(fVar, this.f16559i, this.f16563m);
                zl.c cVar = new zl.c(this.f16559i);
                this.f16557g = new j(this.f16551a, this.f16563m, this.f16558h, this.f16552b, this.f16559i, this.f16555e, aVar, iVar, cVar, c0.g(this.f16551a, this.f16558h, this.f16559i, aVar, cVar, iVar, new im.a(1024, new im.c(10)), eVar), this.f16564n, this.f16561k);
                boolean h11 = h();
                d();
                this.f16557g.z(fVar, Thread.getDefaultUncaughtExceptionHandler(), eVar);
                if (h11 && g.c(this.f16551a)) {
                    wl.f.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    k(eVar);
                    return false;
                }
                wl.f.f().b("Successfully configured exception handler.");
                return true;
            } catch (Exception e11) {
                wl.f.f().e("Crashlytics was not started due to an exception during initialization", e11);
                this.f16557g = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
    }

    public Task<Void> s() {
        return this.f16557g.P();
    }

    public void t(Boolean bool) {
        this.f16552b.g(bool);
    }

    public void u(String str, String str2) {
        this.f16557g.Q(str, str2);
    }

    public void v(String str) {
        this.f16557g.R(str);
    }
}