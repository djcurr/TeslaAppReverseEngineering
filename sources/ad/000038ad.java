package com.google.firebase.crashlytics.internal.common;

import am.a0;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class c0 {

    /* renamed from: a */
    private final n f16478a;

    /* renamed from: b */
    private final dm.e f16479b;

    /* renamed from: c */
    private final em.c f16480c;

    /* renamed from: d */
    private final zl.c f16481d;

    /* renamed from: e */
    private final zl.i f16482e;

    c0(n nVar, dm.e eVar, em.c cVar, zl.c cVar2, zl.i iVar) {
        this.f16478a = nVar;
        this.f16479b = eVar;
        this.f16480c = cVar;
        this.f16481d = cVar2;
        this.f16482e = iVar;
    }

    public static /* synthetic */ boolean a(c0 c0Var, Task task) {
        return c0Var.p(task);
    }

    public static /* synthetic */ int b(a0.c cVar, a0.c cVar2) {
        return m(cVar, cVar2);
    }

    private a0.e.d c(a0.e.d dVar) {
        return d(dVar, this.f16481d, this.f16482e);
    }

    private a0.e.d d(a0.e.d dVar, zl.c cVar, zl.i iVar) {
        a0.e.d.b g11 = dVar.g();
        String c11 = cVar.c();
        if (c11 != null) {
            g11.d(a0.e.d.AbstractC0027d.a().b(c11).a());
        } else {
            wl.f.f().i("No log data to include with this event.");
        }
        List<a0.c> k11 = k(iVar.e());
        List<a0.c> k12 = k(iVar.f());
        if (!k11.isEmpty() || !k12.isEmpty()) {
            g11.b(dVar.b().g().c(am.b0.b(k11)).e(am.b0.b(k12)).a());
        }
        return g11.a();
    }

    private static a0.a e(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = f(traceInputStream);
            }
        } catch (IOException e11) {
            wl.f f11 = wl.f.f();
            f11.k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e11);
        }
        return a0.a.a().b(applicationExitInfo.getImportance()).d(applicationExitInfo.getProcessName()).f(applicationExitInfo.getReason()).h(applicationExitInfo.getTimestamp()).c(applicationExitInfo.getPid()).e(applicationExitInfo.getPss()).g(applicationExitInfo.getRss()).i(str).a();
    }

    public static String f(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
        }
    }

    public static c0 g(Context context, v vVar, dm.f fVar, a aVar, zl.c cVar, zl.i iVar, im.d dVar, fm.e eVar) {
        return new c0(new n(context, vVar, aVar, dVar), new dm.e(fVar, eVar), em.c.c(context), cVar, iVar);
    }

    private ApplicationExitInfo j(String str, List<ApplicationExitInfo> list) {
        long q11 = this.f16479b.q(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getTimestamp() < q11) {
                return null;
            }
            if (applicationExitInfo.getReason() == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    private static List<a0.c> k(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(a0.c.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.b0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c0.b((a0.c) obj, (a0.c) obj2);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ int m(a0.c cVar, a0.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    public boolean p(Task<o> task) {
        if (task.isSuccessful()) {
            o result = task.getResult();
            wl.f f11 = wl.f.f();
            f11.b("Crashlytics report successfully enqueued to DataTransport: " + result.d());
            File c11 = result.c();
            if (c11.delete()) {
                wl.f f12 = wl.f.f();
                f12.b("Deleted report file: " + c11.getPath());
                return true;
            }
            wl.f f13 = wl.f.f();
            f13.k("Crashlytics could not delete report file: " + c11.getPath());
            return true;
        }
        wl.f.f().l("Crashlytics report could not be enqueued to DataTransport", task.getException());
        return false;
    }

    private void q(Throwable th2, Thread thread, String str, String str2, long j11, boolean z11) {
        this.f16479b.y(c(this.f16478a.c(th2, thread, str2, j11, 4, 8, z11)), str, str2.equals(AppMeasurement.CRASH_ORIGIN));
    }

    public void h(String str, List<y> list) {
        wl.f.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (y yVar : list) {
            a0.d.b a11 = yVar.a();
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        this.f16479b.l(str, a0.d.a().b(am.b0.b(arrayList)).a());
    }

    public void i(long j11, String str) {
        this.f16479b.k(str, j11);
    }

    public boolean l() {
        return this.f16479b.r();
    }

    public SortedSet<String> n() {
        return this.f16479b.p();
    }

    public void o(String str, long j11) {
        this.f16479b.z(this.f16478a.d(str, j11));
    }

    public void r(Throwable th2, Thread thread, String str, long j11) {
        wl.f f11 = wl.f.f();
        f11.i("Persisting fatal event for session " + str);
        q(th2, thread, str, AppMeasurement.CRASH_ORIGIN, j11, true);
    }

    public void s(Throwable th2, Thread thread, String str, long j11) {
        wl.f f11 = wl.f.f();
        f11.i("Persisting non-fatal event for session " + str);
        q(th2, thread, str, "error", j11, false);
    }

    public void t(String str, List<ApplicationExitInfo> list, zl.c cVar, zl.i iVar) {
        ApplicationExitInfo j11 = j(str, list);
        if (j11 == null) {
            wl.f f11 = wl.f.f();
            f11.i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        a0.e.d b11 = this.f16478a.b(e(j11));
        wl.f f12 = wl.f.f();
        f12.b("Persisting anr for session " + str);
        this.f16479b.y(d(b11, cVar, iVar), str, true);
    }

    public void u() {
        this.f16479b.i();
    }

    public Task<Void> v(Executor executor) {
        List<o> w11 = this.f16479b.w();
        ArrayList arrayList = new ArrayList();
        for (o oVar : w11) {
            arrayList.add(this.f16480c.g(oVar).continueWith(executor, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.a0
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return Boolean.valueOf(c0.a(c0.this, task));
                }
            }));
        }
        return Tasks.whenAll(arrayList);
    }
}