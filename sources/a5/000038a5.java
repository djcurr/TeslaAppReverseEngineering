package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.g;
import com.google.firebase.crashlytics.internal.common.l;
import com.google.firebase.crashlytics.internal.common.r;
import com.google.firebase.crashlytics.internal.common.t;
import com.google.firebase.crashlytics.internal.common.v;
import fm.d;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import tm.e;
import wl.f;

/* loaded from: classes3.dex */
public class FirebaseCrashlytics {

    /* renamed from: a  reason: collision with root package name */
    final l f16462a;

    /* loaded from: classes3.dex */
    class a implements Continuation<Void, Object> {
        a() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        public Object then(Task<Void> task) {
            if (task.isSuccessful()) {
                return null;
            }
            f.f().e("Error fetching settings.", task.getException());
            return null;
        }
    }

    /* loaded from: classes3.dex */
    class b implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f16463a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f16464b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f16465c;

        b(boolean z11, l lVar, d dVar) {
            this.f16463a = z11;
            this.f16464b = lVar;
            this.f16465c = dVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            if (this.f16463a) {
                this.f16464b.j(this.f16465c);
                return null;
            }
            return null;
        }
    }

    private FirebaseCrashlytics(l lVar) {
        this.f16462a = lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FirebaseCrashlytics a(com.google.firebase.d dVar, e eVar, sm.a<wl.a> aVar, sm.a<sl.a> aVar2) {
        Context j11 = dVar.j();
        String packageName = j11.getPackageName();
        f f11 = f.f();
        f11.g("Initializing Firebase Crashlytics " + l.l() + " for " + packageName);
        dm.f fVar = new dm.f(j11);
        r rVar = new r(dVar);
        v vVar = new v(j11, packageName, eVar, rVar);
        wl.d dVar2 = new wl.d(aVar);
        vl.d dVar3 = new vl.d(aVar2);
        l lVar = new l(dVar, vVar, dVar2, rVar, dVar3.e(), dVar3.d(), fVar, t.c("Crashlytics Exception Handler"));
        String c11 = dVar.m().c();
        String n11 = g.n(j11);
        f f12 = f.f();
        f12.b("Mapping file ID is: " + n11);
        try {
            com.google.firebase.crashlytics.internal.common.a a11 = com.google.firebase.crashlytics.internal.common.a.a(j11, vVar, c11, n11, new wl.e(j11));
            f f13 = f.f();
            f13.i("Installer package name is: " + a11.f16468c);
            ExecutorService c12 = t.c("com.google.firebase.crashlytics.startup");
            d l11 = d.l(j11, c11, vVar, new cm.b(), a11.f16470e, a11.f16471f, fVar, rVar);
            l11.p(c12).continueWith(c12, new a());
            Tasks.call(c12, new b(lVar.r(a11, l11), lVar, l11));
            return new FirebaseCrashlytics(lVar);
        } catch (PackageManager.NameNotFoundException e11) {
            f.f().e("Error retrieving app package info.", e11);
            return null;
        }
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) com.google.firebase.d.k().i(FirebaseCrashlytics.class);
        Objects.requireNonNull(firebaseCrashlytics, "FirebaseCrashlytics component is not present.");
        return firebaseCrashlytics;
    }

    public Task<Boolean> checkForUnsentReports() {
        return this.f16462a.e();
    }

    public void deleteUnsentReports() {
        this.f16462a.f();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f16462a.g();
    }

    public void log(String str) {
        this.f16462a.n(str);
    }

    public void recordException(Throwable th2) {
        if (th2 == null) {
            f.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f16462a.o(th2);
        }
    }

    public void sendUnsentReports() {
        this.f16462a.s();
    }

    public void setCrashlyticsCollectionEnabled(boolean z11) {
        this.f16462a.t(Boolean.valueOf(z11));
    }

    public void setCustomKey(String str, boolean z11) {
        this.f16462a.u(str, Boolean.toString(z11));
    }

    public void setCustomKeys(vl.g gVar) {
        throw null;
    }

    public void setUserId(String str) {
        this.f16462a.v(str);
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.f16462a.t(bool);
    }

    public void setCustomKey(String str, double d11) {
        this.f16462a.u(str, Double.toString(d11));
    }

    public void setCustomKey(String str, float f11) {
        this.f16462a.u(str, Float.toString(f11));
    }

    public void setCustomKey(String str, int i11) {
        this.f16462a.u(str, Integer.toString(i11));
    }

    public void setCustomKey(String str, long j11) {
        this.f16462a.u(str, Long.toString(j11));
    }

    public void setCustomKey(String str, String str2) {
        this.f16462a.u(str, str2);
    }
}