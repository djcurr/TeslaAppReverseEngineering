package com.google.firebase.crashlytics.internal.common;

import am.c0;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.p;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.networking.FraudDetectionData;
import ezvcard.property.Kind;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: r */
    static final FilenameFilter f16507r = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.i
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return j.a(file, str);
        }
    };

    /* renamed from: a */
    private final Context f16508a;

    /* renamed from: b */
    private final r f16509b;

    /* renamed from: c */
    private final m f16510c;

    /* renamed from: d */
    private final zl.i f16511d;

    /* renamed from: e */
    private final com.google.firebase.crashlytics.internal.common.h f16512e;

    /* renamed from: f */
    private final v f16513f;

    /* renamed from: g */
    private final dm.f f16514g;

    /* renamed from: h */
    private final com.google.firebase.crashlytics.internal.common.a f16515h;

    /* renamed from: i */
    private final zl.c f16516i;

    /* renamed from: j */
    private final wl.a f16517j;

    /* renamed from: k */
    private final xl.a f16518k;

    /* renamed from: l */
    private final c0 f16519l;

    /* renamed from: m */
    private p f16520m;

    /* renamed from: n */
    final TaskCompletionSource<Boolean> f16521n = new TaskCompletionSource<>();

    /* renamed from: o */
    final TaskCompletionSource<Boolean> f16522o = new TaskCompletionSource<>();

    /* renamed from: p */
    final TaskCompletionSource<Void> f16523p = new TaskCompletionSource<>();

    /* renamed from: q */
    final AtomicBoolean f16524q = new AtomicBoolean(false);

    /* loaded from: classes3.dex */
    public class a implements p.a {
        a() {
            j.this = r1;
        }

        @Override // com.google.firebase.crashlytics.internal.common.p.a
        public void a(fm.e eVar, Thread thread, Throwable th2) {
            j.this.I(eVar, thread, th2);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Callable<Task<Void>> {

        /* renamed from: a */
        final /* synthetic */ long f16526a;

        /* renamed from: b */
        final /* synthetic */ Throwable f16527b;

        /* renamed from: c */
        final /* synthetic */ Thread f16528c;

        /* renamed from: d */
        final /* synthetic */ fm.e f16529d;

        /* loaded from: classes3.dex */
        public class a implements SuccessContinuation<gm.a, Void> {

            /* renamed from: a */
            final /* synthetic */ Executor f16531a;

            a(Executor executor) {
                b.this = r1;
                this.f16531a = executor;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* renamed from: a */
            public Task<Void> then(gm.a aVar) {
                if (aVar == null) {
                    wl.f.f().k("Received null app settings, cannot send reports at crash time.");
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(j.this.N(), j.this.f16519l.v(this.f16531a));
            }
        }

        b(long j11, Throwable th2, Thread thread, fm.e eVar) {
            j.this = r1;
            this.f16526a = j11;
            this.f16527b = th2;
            this.f16528c = thread;
            this.f16529d = eVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Task<Void> call() {
            long H = j.H(this.f16526a);
            String E = j.this.E();
            if (E != null) {
                j.this.f16510c.a();
                j.this.f16519l.r(this.f16527b, this.f16528c, E, H);
                j.this.y(this.f16526a);
                j.this.v(this.f16529d);
                j.this.x(new com.google.firebase.crashlytics.internal.common.f(j.this.f16513f).toString());
                if (j.this.f16509b.d()) {
                    Executor c11 = j.this.f16512e.c();
                    return this.f16529d.b().onSuccessTask(c11, new a(c11));
                }
                return Tasks.forResult(null);
            }
            wl.f.f().d("Tried to write a fatal exception while no session was open.");
            return Tasks.forResult(null);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements SuccessContinuation<Void, Boolean> {
        c(j jVar) {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a */
        public Task<Boolean> then(Void r12) {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements SuccessContinuation<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ Task f16533a;

        /* loaded from: classes3.dex */
        public class a implements Callable<Task<Void>> {

            /* renamed from: a */
            final /* synthetic */ Boolean f16535a;

            /* renamed from: com.google.firebase.crashlytics.internal.common.j$d$a$a */
            /* loaded from: classes3.dex */
            public class C0302a implements SuccessContinuation<gm.a, Void> {

                /* renamed from: a */
                final /* synthetic */ Executor f16537a;

                C0302a(Executor executor) {
                    a.this = r1;
                    this.f16537a = executor;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                /* renamed from: a */
                public Task<Void> then(gm.a aVar) {
                    if (aVar != null) {
                        j.this.N();
                        j.this.f16519l.v(this.f16537a);
                        j.this.f16523p.trySetResult(null);
                        return Tasks.forResult(null);
                    }
                    wl.f.f().k("Received null app settings at app startup. Cannot send cached reports");
                    return Tasks.forResult(null);
                }
            }

            a(Boolean bool) {
                d.this = r1;
                this.f16535a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Task<Void> call() {
                if (!this.f16535a.booleanValue()) {
                    wl.f.f().i("Deleting cached crash reports...");
                    j.s(j.this.L());
                    j.this.f16519l.u();
                    j.this.f16523p.trySetResult(null);
                    return Tasks.forResult(null);
                }
                wl.f.f().b("Sending cached crash reports...");
                j.this.f16509b.c(this.f16535a.booleanValue());
                Executor c11 = j.this.f16512e.c();
                return d.this.f16533a.onSuccessTask(c11, new C0302a(c11));
            }
        }

        d(Task task) {
            j.this = r1;
            this.f16533a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a */
        public Task<Void> then(Boolean bool) {
            return j.this.f16512e.i(new a(bool));
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ long f16539a;

        /* renamed from: b */
        final /* synthetic */ String f16540b;

        e(long j11, String str) {
            j.this = r1;
            this.f16539a = j11;
            this.f16540b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            if (j.this.J()) {
                return null;
            }
            j.this.f16516i.g(this.f16539a, this.f16540b);
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ long f16542a;

        /* renamed from: b */
        final /* synthetic */ Throwable f16543b;

        /* renamed from: c */
        final /* synthetic */ Thread f16544c;

        f(long j11, Throwable th2, Thread thread) {
            j.this = r1;
            this.f16542a = j11;
            this.f16543b = th2;
            this.f16544c = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j.this.J()) {
                return;
            }
            long H = j.H(this.f16542a);
            String E = j.this.E();
            if (E != null) {
                j.this.f16519l.s(this.f16543b, this.f16544c, E, H);
            } else {
                wl.f.f().k("Tried to write a non-fatal exception while no session was open.");
            }
        }
    }

    /* loaded from: classes3.dex */
    public class g implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ String f16546a;

        g(String str) {
            j.this = r1;
            this.f16546a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            j.this.x(this.f16546a);
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public class h implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ long f16548a;

        h(long j11) {
            j.this = r1;
            this.f16548a = j11;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong(FraudDetectionData.KEY_TIMESTAMP, this.f16548a);
            j.this.f16518k.a("_ae", bundle);
            return null;
        }
    }

    public j(Context context, com.google.firebase.crashlytics.internal.common.h hVar, v vVar, r rVar, dm.f fVar, m mVar, com.google.firebase.crashlytics.internal.common.a aVar, zl.i iVar, zl.c cVar, c0 c0Var, wl.a aVar2, xl.a aVar3) {
        this.f16508a = context;
        this.f16512e = hVar;
        this.f16513f = vVar;
        this.f16509b = rVar;
        this.f16514g = fVar;
        this.f16510c = mVar;
        this.f16515h = aVar;
        this.f16511d = iVar;
        this.f16516i = cVar;
        this.f16517j = aVar2;
        this.f16518k = aVar3;
        this.f16519l = c0Var;
    }

    private void A(String str) {
        wl.f f11 = wl.f.f();
        f11.i("Finalizing native report for session " + str);
        wl.g a11 = this.f16517j.a(str);
        File b11 = a11.b();
        if (b11 != null && b11.exists()) {
            long lastModified = b11.lastModified();
            zl.c cVar = new zl.c(this.f16514g, str);
            File h11 = this.f16514g.h(str);
            if (!h11.isDirectory()) {
                wl.f.f().k("Couldn't create directory to store native session files, aborting.");
                return;
            }
            y(lastModified);
            List<y> G = G(a11, str, this.f16514g, cVar.b());
            z.b(h11, G);
            wl.f.f().b("CrashlyticsController#finalizePreviousNativeSession");
            this.f16519l.h(str, G);
            cVar.a();
            return;
        }
        wl.f f12 = wl.f.f();
        f12.k("No minidump data found for session " + str);
    }

    private static boolean C() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private Context D() {
        return this.f16508a;
    }

    public String E() {
        SortedSet<String> n11 = this.f16519l.n();
        if (n11.isEmpty()) {
            return null;
        }
        return n11.first();
    }

    private static long F() {
        return H(System.currentTimeMillis());
    }

    static List<y> G(wl.g gVar, String str, dm.f fVar, byte[] bArr) {
        File n11 = fVar.n(str, "user-data");
        File n12 = fVar.n(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.google.firebase.crashlytics.internal.common.e("logs_file", "logs", bArr));
        arrayList.add(new u("crash_meta_file", "metadata", gVar.c()));
        arrayList.add(new u("session_meta_file", "session", gVar.f()));
        arrayList.add(new u("app_meta_file", Stripe3ds2AuthParams.FIELD_APP, gVar.d()));
        arrayList.add(new u("device_meta_file", Kind.DEVICE, gVar.a()));
        arrayList.add(new u("os_meta_file", "os", gVar.e()));
        arrayList.add(new u("minidump_file", "minidump", gVar.b()));
        arrayList.add(new u("user_meta_file", "user", n11));
        arrayList.add(new u("keys_file", "keys", n12));
        return arrayList;
    }

    public static long H(long j11) {
        return j11 / 1000;
    }

    public static /* synthetic */ boolean K(File file, String str) {
        return str.startsWith(".ae");
    }

    private Task<Void> M(long j11) {
        if (C()) {
            wl.f.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        wl.f.f().b("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new h(j11));
    }

    public Task<Void> N() {
        ArrayList arrayList = new ArrayList();
        for (File file : L()) {
            try {
                arrayList.add(M(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                wl.f f11 = wl.f.f();
                f11.k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private Task<Boolean> T() {
        if (this.f16509b.d()) {
            wl.f.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f16521n.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        wl.f.f().b("Automatic data collection is disabled.");
        wl.f.f().i("Notifying that unsent reports are available.");
        this.f16521n.trySetResult(Boolean.TRUE);
        Task<TContinuationResult> onSuccessTask = this.f16509b.i().onSuccessTask(new c(this));
        wl.f.f().b("Waiting for send/deleteUnsentReports to be called.");
        return h0.i(onSuccessTask, this.f16522o.getTask());
    }

    private void U(String str) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f16508a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.f16519l.t(str, historicalProcessExitReasons, new zl.c(this.f16514g, str), zl.i.i(str, this.f16514g, this.f16512e));
                return;
            }
            wl.f f11 = wl.f.f();
            f11.i("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        wl.f f12 = wl.f.f();
        f12.i("ANR feature enabled, but device is API " + i11);
    }

    public static /* synthetic */ boolean a(File file, String str) {
        return K(file, str);
    }

    private static c0.a p(v vVar, com.google.firebase.crashlytics.internal.common.a aVar) {
        return c0.a.b(vVar.f(), aVar.f16470e, aVar.f16471f, vVar.a(), s.determineFrom(aVar.f16468c).getId(), aVar.f16472g);
    }

    private static c0.b q(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return c0.b.c(com.google.firebase.crashlytics.internal.common.g.l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), com.google.firebase.crashlytics.internal.common.g.s(), statFs.getBlockCount() * statFs.getBlockSize(), com.google.firebase.crashlytics.internal.common.g.y(context), com.google.firebase.crashlytics.internal.common.g.m(context), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static c0.c r(Context context) {
        return c0.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, com.google.firebase.crashlytics.internal.common.g.z(context));
    }

    public static void s(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void w(boolean z11, fm.e eVar) {
        ArrayList arrayList = new ArrayList(this.f16519l.n());
        if (arrayList.size() <= z11) {
            wl.f.f().i("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z11 ? 1 : 0);
        if (eVar.a().a().f28017b) {
            U(str);
        } else {
            wl.f.f().i("ANR feature disabled.");
        }
        if (this.f16517j.d(str)) {
            A(str);
        }
        this.f16519l.i(F(), z11 != 0 ? (String) arrayList.get(0) : null);
    }

    public void x(String str) {
        long F = F();
        wl.f f11 = wl.f.f();
        f11.b("Opening a new session with ID " + str);
        this.f16517j.c(str, String.format(Locale.US, "Crashlytics Android SDK/%s", l.l()), F, am.c0.b(p(this.f16513f, this.f16515h), r(D()), q(D())));
        this.f16516i.e(str);
        this.f16519l.o(str, F);
    }

    public void y(long j11) {
        try {
            dm.f fVar = this.f16514g;
            if (fVar.d(".ae" + j11).createNewFile()) {
                return;
            }
            throw new IOException("Create new file failed.");
        } catch (IOException e11) {
            wl.f.f().l("Could not create app exception marker file.", e11);
        }
    }

    public boolean B(fm.e eVar) {
        this.f16512e.b();
        if (J()) {
            wl.f.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        wl.f.f().i("Finalizing previously open sessions.");
        try {
            w(true, eVar);
            wl.f.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e11) {
            wl.f.f().e("Unable to finalize previously open sessions.", e11);
            return false;
        }
    }

    synchronized void I(fm.e eVar, Thread thread, Throwable th2) {
        wl.f f11 = wl.f.f();
        f11.b("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
        try {
            h0.d(this.f16512e.i(new b(System.currentTimeMillis(), th2, thread, eVar)));
        } catch (Exception e11) {
            wl.f.f().e("Error handling uncaught exception", e11);
        }
    }

    boolean J() {
        p pVar = this.f16520m;
        return pVar != null && pVar.a();
    }

    List<File> L() {
        return this.f16514g.e(f16507r);
    }

    void O(String str) {
        this.f16512e.h(new g(str));
    }

    public Task<Void> P() {
        this.f16522o.trySetResult(Boolean.TRUE);
        return this.f16523p.getTask();
    }

    public void Q(String str, String str2) {
        try {
            this.f16511d.l(str, str2);
        } catch (IllegalArgumentException e11) {
            Context context = this.f16508a;
            if (context != null && com.google.firebase.crashlytics.internal.common.g.w(context)) {
                throw e11;
            }
            wl.f.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void R(String str) {
        this.f16511d.m(str);
    }

    public Task<Void> S(Task<gm.a> task) {
        if (!this.f16519l.l()) {
            wl.f.f().i("No crash reports are available to be sent.");
            this.f16521n.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        wl.f.f().i("Crash reports are available to be sent.");
        return T().onSuccessTask(new d(task));
    }

    public void V(Thread thread, Throwable th2) {
        this.f16512e.g(new f(System.currentTimeMillis(), th2, thread));
    }

    public void W(long j11, String str) {
        this.f16512e.h(new e(j11, str));
    }

    public Task<Boolean> o() {
        if (!this.f16524q.compareAndSet(false, true)) {
            wl.f.f().k("checkForUnsentReports should only be called once per execution.");
            return Tasks.forResult(Boolean.FALSE);
        }
        return this.f16521n.getTask();
    }

    public Task<Void> t() {
        this.f16522o.trySetResult(Boolean.FALSE);
        return this.f16523p.getTask();
    }

    public boolean u() {
        if (!this.f16510c.c()) {
            String E = E();
            return E != null && this.f16517j.d(E);
        }
        wl.f.f().i("Found previous crash marker.");
        this.f16510c.d();
        return true;
    }

    void v(fm.e eVar) {
        w(false, eVar);
    }

    public void z(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, fm.e eVar) {
        O(str);
        p pVar = new p(new a(), eVar, uncaughtExceptionHandler, this.f16517j);
        this.f16520m = pVar;
        Thread.setDefaultUncaughtExceptionHandler(pVar);
    }
}