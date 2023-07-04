package ru;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.squareup.moshi.f;
import com.squareup.moshi.p;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.tesla.report.LogReport;
import com.tesla.report.LogReportEnvelope;
import com.tesla.report.ScreenshotReport;
import com.tesla.report.ScreenshotReportEnvelope;
import e00.h;
import e00.j;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import okio.c0;
import okio.i;
import okio.r;
import vz.b0;
import vz.k;
import vz.m;
import vz.v;
import wz.e0;
import wz.r0;
import wz.w;
import wz.x;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f49666a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final g f49667b = g.f21878b.a("BuildReport");

    /* renamed from: c  reason: collision with root package name */
    private static final k f49668c;

    /* renamed from: d  reason: collision with root package name */
    private static final k f49669d;

    /* renamed from: e  reason: collision with root package name */
    private static final k f49670e;

    /* renamed from: ru.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1086a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a(Long.valueOf(((File) t12).lastModified()), Long.valueOf(((File) t11).lastModified()));
            return a11;
        }
    }

    /* loaded from: classes6.dex */
    static final class b extends u implements h00.a<f<LogReportEnvelope>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f49671a = new b();

        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final f<LogReportEnvelope> mo11invoke() {
            return a.f49666a.f().c(LogReportEnvelope.class);
        }
    }

    /* loaded from: classes6.dex */
    static final class c extends u implements h00.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f49672a = new c();

        c() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final p mo11invoke() {
            return new p.b().d();
        }
    }

    /* loaded from: classes6.dex */
    static final class d extends u implements h00.a<f<ScreenshotReportEnvelope>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f49673a = new d();

        d() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final f<ScreenshotReportEnvelope> mo11invoke() {
            return a.f49666a.f().c(ScreenshotReportEnvelope.class);
        }
    }

    static {
        k a11;
        k a12;
        k a13;
        a11 = m.a(c.f49672a);
        f49668c = a11;
        a12 = m.a(b.f49671a);
        f49669d = a12;
        a13 = m.a(d.f49673a);
        f49670e = a13;
    }

    private a() {
    }

    private final jt.f d(Exception exc) {
        return fs.a.e(exc instanceof IOException ? "filesystem" : "unknown");
    }

    private final f<LogReportEnvelope> e() {
        Object mo16getValue = f49669d.mo16getValue();
        s.f(mo16getValue, "<get-logReportAdapter>(...)");
        return (f) mo16getValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p f() {
        Object mo16getValue = f49668c.mo16getValue();
        s.f(mo16getValue, "<get-moshi>(...)");
        return (p) mo16getValue;
    }

    private final f<ScreenshotReportEnvelope> g() {
        Object mo16getValue = f49670e.mo16getValue();
        s.f(mo16getValue, "<get-screenshotReportAdapter>(...)");
        return (f) mo16getValue;
    }

    private final File h(File file) {
        Map f11;
        g gVar = f49667b;
        String name = file.getName();
        gVar.i("Marking report finished for file: " + name);
        File l11 = qu.d.f48482a.l(file);
        if (l11 == null) {
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(v.a(h11, "failed to save file for upload, not scheduling"));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception("failed to save file for upload, not scheduling"));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a("failed to save file for upload, not scheduling", new Object[0]);
            return null;
        }
        gVar.i("successfully saved file for upload");
        return l11;
    }

    public final List<File> b(Context context, String reportId, String fileUri) {
        List<jt.f> l11;
        byte[] b11;
        c0 g11;
        List<jt.f> l12;
        List<File> d11;
        s.g(context, "context");
        s.g(reportId, "reportId");
        s.g(fileUri, "fileUri");
        try {
            i.a aVar = i.f42657e;
            String path = Uri.parse(fileUri).getPath();
            s.e(path);
            b11 = h.b(new File(path));
            String a11 = i.a.h(aVar, b11, 0, 0, 3, null).a();
            g gVar = f49667b;
            gVar.i("Creating report file...");
            File a12 = qu.d.f48482a.a(context, reportId, Action.FILE_ATTRIBUTE);
            String name = a12.getName();
            gVar.i("Created report file: " + name);
            ScreenshotReport screenshotReport = new ScreenshotReport(a11, reportId, null, null, 12, null);
            gVar.i("Serializing report to file");
            g11 = okio.s.g(a12, false, 1, null);
            okio.g c11 = r.c(g11);
            f49666a.g().k(c11, new ScreenshotReportEnvelope(screenshotReport));
            b0 b0Var = b0.f54756a;
            e00.b.a(c11, null);
            gVar.i("Done serializing report to file");
            qu.c cVar = qu.c.f48481a;
            l12 = w.l(fs.a.g(), cVar.c());
            cVar.a(l12);
            File h11 = h(a12);
            if (h11 == null) {
                return null;
            }
            d11 = wz.v.d(h11);
            return d11;
        } catch (Exception e11) {
            f49667b.d("Error building screenshot report", e11);
            qu.c cVar2 = qu.c.f48481a;
            l11 = w.l(fs.a.b(), cVar2.c(), d(e11));
            cVar2.a(l11);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final List<File> c(Context context, String reportId) {
        List<File> G0;
        int t11;
        List<File> list;
        char c11;
        ?? r12;
        List<jt.f> l11;
        String n11;
        String str;
        c0 g11;
        List<jt.f> l12;
        Context context2 = context;
        s.g(context2, "context");
        s.g(reportId, "reportId");
        G0 = e0.G0(qu.d.f48482a.e(context2), new C1086a());
        g gVar = f49667b;
        t11 = x.t(G0, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (File file : G0) {
            arrayList.add(file.getName() + " exists?" + file.exists() + " canRead?" + file.canRead());
        }
        int i11 = 1;
        gVar.j("log files metadata: " + arrayList, true, true);
        ArrayList arrayList2 = new ArrayList();
        boolean z11 = false;
        int i12 = 0;
        for (Object obj : G0) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                w.s();
            }
            File file2 = (File) obj;
            try {
                String name = file2.getName();
                g gVar2 = f49667b;
                gVar2.i("Creating report file for file " + name + "...");
                qu.d dVar = qu.d.f48482a;
                n11 = j.n(file2);
                File a11 = dVar.a(context2, reportId, "log-" + n11);
                gVar2.i("Created report file: " + a11.getName());
                if (!file2.exists()) {
                    str = "[ERROR] LOG FILE DOESN'T EXIST: " + name;
                } else if (file2.canRead()) {
                    try {
                        str = h.f(file2, null, i11, null);
                    } catch (Exception e11) {
                        String str2 = "Exception thrown reading log text: " + name + " " + file2.exists() + " " + file2.isFile();
                        f49667b.d(str2, e11);
                        str = "[LOG_READ_TEXT_ERROR] " + str2 + " " + e11.getMessage();
                    }
                } else {
                    str = "[ERROR] CANNOT READ LOG FILE: " + name;
                }
                r12 = z11;
                try {
                    LogReport logReport = new LogReport(i13, G0.size(), str, reportId, null, null, 48, null);
                    g gVar3 = f49667b;
                    gVar3.i("Serializing report to file");
                    list = null;
                    try {
                        g11 = okio.s.g(a11, r12, 1, null);
                        okio.g c12 = r.c(g11);
                        a aVar = f49666a;
                        aVar.e().k(c12, new LogReportEnvelope(logReport));
                        b0 b0Var = b0.f54756a;
                        e00.b.a(c12, null);
                        gVar3.i("Done serializing report to file");
                        File h11 = aVar.h(a11);
                        if (h11 != null) {
                            arrayList2.add(h11);
                        }
                        qu.c cVar = qu.c.f48481a;
                        c11 = 2;
                        try {
                            jt.f[] fVarArr = new jt.f[2];
                            fVarArr[r12 == true ? 1 : 0] = fs.a.g();
                            fVarArr[1] = cVar.d();
                            l12 = w.l(fVarArr);
                            cVar.a(l12);
                            z11 = r12 == true ? 1 : 0;
                            i12 = i13;
                            i11 = 1;
                            context2 = context;
                        } catch (Exception e12) {
                            e = e12;
                            f49667b.d("Error building log report", e);
                            qu.c cVar2 = qu.c.f48481a;
                            jt.f[] fVarArr2 = new jt.f[3];
                            fVarArr2[r12] = fs.a.b();
                            fVarArr2[1] = cVar2.d();
                            fVarArr2[c11] = f49666a.d(e);
                            l11 = w.l(fVarArr2);
                            cVar2.a(l11);
                            return list;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        c11 = 2;
                    }
                } catch (Exception e14) {
                    e = e14;
                    c11 = 2;
                    list = null;
                }
            } catch (Exception e15) {
                e = e15;
                list = null;
                c11 = 2;
                r12 = z11;
                f49667b.d("Error building log report", e);
                qu.c cVar22 = qu.c.f48481a;
                jt.f[] fVarArr22 = new jt.f[3];
                fVarArr22[r12] = fs.a.b();
                fVarArr22[1] = cVar22.d();
                fVarArr22[c11] = f49666a.d(e);
                l11 = w.l(fVarArr22);
                cVar22.a(l11);
                return list;
            }
        }
        return arrayList2;
    }
}