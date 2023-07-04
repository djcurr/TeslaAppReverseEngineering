package com.tesla.report.upload;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.b0;
import androidx.work.c;
import androidx.work.e;
import androidx.work.h;
import androidx.work.r;
import androidx.work.rxjava3.RxWorker;
import androidx.work.s;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.tesla.report.upload.UploadReportsWorker;
import hy.m;
import hy.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jt.d;
import jt.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.w;
import su.b;
import vz.p;
import vz.v;
import wz.e0;
import wz.r0;
import wz.x;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/tesla/report/upload/UploadReportsWorker;", "Landroidx/work/rxjava3/RxWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "d", "a", "report_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class UploadReportsWorker extends RxWorker {

    /* renamed from: d */
    public static final a f21965d = new a(null);

    /* renamed from: e */
    private static final g f21966e = g.f21878b.a("UploadReportsWorker");

    /* renamed from: c */
    private f f21967c;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context appContext, String reportId) {
            s.g(appContext, "appContext");
            s.g(reportId, "reportId");
            s.a e11 = new s.a(UploadReportsWorker.class).f(new c.a().c(r.CONNECTED).b()).g(10L, TimeUnit.SECONDS).e(androidx.work.a.LINEAR, AbstractComponentTracker.LINGERING_TIMEOUT, TimeUnit.MILLISECONDS);
            int i11 = 0;
            p[] pVarArr = {v.a("UploadReportsWorker-report-id", reportId)};
            e.a aVar = new e.a();
            while (i11 < 1) {
                p pVar = pVarArr[i11];
                i11++;
                aVar.b((String) pVar.c(), pVar.d());
            }
            e a11 = aVar.a();
            kotlin.jvm.internal.s.f(a11, "dataBuilder.build()");
            androidx.work.s b11 = e11.h(a11).b();
            kotlin.jvm.internal.s.f(b11, "OneTimeWorkRequestBuilde…portId))\n        .build()");
            b0 i12 = b0.i(appContext);
            i12.a("upload-report-files-" + reportId, h.KEEP, b11).a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadReportsWorker(Context context, WorkerParameters workerParams) {
        super(context.getApplicationContext(), workerParams);
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(workerParams, "workerParams");
    }

    public static /* synthetic */ vz.b0 d(n nVar, Boolean bool) {
        return k(nVar, bool);
    }

    public static /* synthetic */ Boolean e(Boolean bool, ListenableWorker.a aVar) {
        return j(bool, aVar);
    }

    public static /* synthetic */ void g(List list, UploadReportsWorker uploadReportsWorker, n nVar) {
        i(list, uploadReportsWorker, nVar);
    }

    public static /* synthetic */ ListenableWorker.a h(String str, UploadReportsWorker uploadReportsWorker, Boolean bool) {
        return o(str, uploadReportsWorker, bool);
    }

    public static final void i(List reportFiles, UploadReportsWorker this$0, final n nVar) {
        int t11;
        kotlin.jvm.internal.s.g(reportFiles, "$reportFiles");
        kotlin.jvm.internal.s.g(this$0, "this$0");
        t11 = x.t(reportFiles, 10);
        ArrayList arrayList = new ArrayList(t11);
        Iterator it2 = reportFiles.iterator();
        while (it2.hasNext()) {
            arrayList.add(this$0.n((File) it2.next()));
        }
        m.c(arrayList).u(Boolean.FALSE, new ky.c() { // from class: su.d
            @Override // ky.c
            public final Object a(Object obj, Object obj2) {
                return UploadReportsWorker.e((Boolean) obj, (ListenableWorker.a) obj2);
            }
        }).o(new ky.h() { // from class: su.e
            @Override // ky.h
            public final Object apply(Object obj) {
                return UploadReportsWorker.d(nVar, (Boolean) obj);
            }
        }).s();
    }

    public static final Boolean j(Boolean hasFailures, ListenableWorker.a aVar) {
        kotlin.jvm.internal.s.f(hasFailures, "hasFailures");
        return Boolean.valueOf(hasFailures.booleanValue() || !(aVar instanceof ListenableWorker.a.c));
    }

    public static final vz.b0 k(n nVar, Boolean hadFailures) {
        kotlin.jvm.internal.s.f(hadFailures, "hadFailures");
        nVar.onSuccess(hadFailures.booleanValue() ? ListenableWorker.a.b() : ListenableWorker.a.c());
        return vz.b0.f54756a;
    }

    private final List<f> l() {
        ArrayList arrayList = new ArrayList();
        qu.c.f48481a.e(getRunAttemptCount());
        f fVar = this.f21967c;
        if (fVar != null) {
            arrayList.add(fVar);
        }
        return arrayList;
    }

    private final m<ListenableWorker.a> m(String str) {
        Map f11;
        g gVar = f21966e;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String h11 = gVar.h();
        ht.a aVar = ht.a.f29422a;
        f11 = r0.f(v.a(h11, str));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : f11.entrySet()) {
            ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(str));
        TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
        n80.a.a(str, new Object[0]);
        m<ListenableWorker.a> n11 = m.n(ListenableWorker.a.a());
        kotlin.jvm.internal.s.f(n11, "just(Result.failure())");
        return n11;
    }

    private final m<ListenableWorker.a> n(File file) {
        boolean M;
        boolean M2;
        Map f11;
        final String fileName = file.getName();
        kotlin.jvm.internal.s.f(fileName, "fileName");
        M = w.M(fileName, "log", false, 2, null);
        if (M) {
            this.f21967c = qu.c.f48481a.d();
        } else {
            M2 = w.M(fileName, Action.FILE_ATTRIBUTE, false, 2, null);
            if (M2) {
                this.f21967c = qu.c.f48481a.c();
            } else {
                g gVar = f21966e;
                String str = "Failed to compute report type for analytics for report: " + file;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String h11 = gVar.h();
                ht.a aVar = ht.a.f29422a;
                f11 = r0.f(v.a(h11, str));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : f11.entrySet()) {
                    ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(str));
                TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
                n80.a.a(str, new Object[0]);
            }
        }
        b.a aVar2 = b.f50653d;
        Context applicationContext = getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext, "applicationContext");
        m o11 = aVar2.a(applicationContext).b(file, l()).o(new ky.h() { // from class: su.f
            @Override // ky.h
            public final Object apply(Object obj) {
                return UploadReportsWorker.h(fileName, this, (Boolean) obj);
            }
        });
        kotlin.jvm.internal.s.f(o11, "UploadReport.newInstance…retry()\n        }\n      }");
        return o11;
    }

    public static final ListenableWorker.a o(String str, UploadReportsWorker this$0, Boolean success) {
        Map f11;
        List d11;
        List<f> y02;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.f(success, "success");
        if (success.booleanValue()) {
            f21966e.i("Successfully uploaded report " + str + "!");
            es.c a11 = es.b.a();
            d dVar = d.REPORT_UPLOAD_ATTEMPTED;
            d11 = wz.v.d(fs.a.g());
            y02 = e0.y0(d11, this$0.l());
            a11.a(dVar, y02);
            return ListenableWorker.a.d(this$0.getInputData());
        }
        String str2 = "Failed to upload report " + str + ". Retrying...";
        g gVar = f21966e;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String h11 = gVar.h();
        ht.a aVar = ht.a.f29422a;
        f11 = r0.f(v.a(h11, str2));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : f11.entrySet()) {
            ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(str2));
        TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
        n80.a.a(str2, new Object[0]);
        return ListenableWorker.a.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    @Override // androidx.work.rxjava3.RxWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hy.m<androidx.work.ListenableWorker.a> a() {
        /*
            r7 = this;
            androidx.work.e r0 = r7.getInputData()
            java.lang.String r1 = "UploadReportsWorker-report-id"
            java.lang.String r0 = r0.k(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L17
            boolean r3 = kotlin.text.m.w(r0)
            if (r3 == 0) goto L15
            goto L17
        L15:
            r3 = r1
            goto L18
        L17:
            r3 = r2
        L18:
            r4 = 2
            if (r3 == 0) goto L50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "invalid report id "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            qu.c r3 = qu.c.f48481a
            jt.f[] r4 = new jt.f[r4]
            jt.f r5 = fs.a.b()
            r4[r1] = r5
            jt.f r1 = fs.a.e(r0)
            r4[r2] = r1
            java.util.List r1 = wz.u.l(r4)
            java.util.List r2 = r7.l()
            java.util.List r1 = wz.u.y0(r1, r2)
            r3.b(r1)
            hy.m r0 = r7.m(r0)
            return r0
        L50:
            int r3 = r7.getRunAttemptCount()
            r5 = 20
            if (r3 <= r5) goto L8f
            es.c r3 = es.b.a()
            jt.d r5 = jt.d.REPORT_EXCEEDED_MAX_RETRYS
            jt.f[] r4 = new jt.f[r4]
            jt.f r6 = fs.a.b()
            r4[r1] = r6
            qu.c r1 = qu.c.f48481a
            int r6 = r7.getRunAttemptCount()
            jt.f r1 = r1.e(r6)
            r4[r2] = r1
            java.util.List r1 = wz.u.l(r4)
            r3.a(r5, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exhausted retries, not uploading report at path "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            hy.m r0 = r7.m(r0)
            return r0
        L8f:
            qu.d r1 = qu.d.f48482a
            android.content.Context r2 = r7.getApplicationContext()
            java.lang.String r3 = "applicationContext"
            kotlin.jvm.internal.s.f(r2, r3)
            java.util.List r1 = r1.g(r2, r0)
            com.tesla.logging.g r2 = com.tesla.report.upload.UploadReportsWorker.f21966e
            int r3 = r1.size()
            int r4 = r7.getRunAttemptCount()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Running upload report worker for report id "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = " on "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = " report sequences. (run attempt="
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = ")"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r2.i(r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Le5
            androidx.work.ListenableWorker$a r0 = androidx.work.ListenableWorker.a.c()
            hy.m r0 = hy.m.n(r0)
            java.lang.String r1 = "just(Result.success())"
            kotlin.jvm.internal.s.f(r0, r1)
            return r0
        Le5:
            su.c r0 = new su.c
            r0.<init>()
            hy.m r0 = hy.m.e(r0)
            java.lang.String r1 = "create { emitter ->\n    …       .subscribe()\n    }"
            kotlin.jvm.internal.s.f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.report.upload.UploadReportsWorker.a():hy.m");
    }
}