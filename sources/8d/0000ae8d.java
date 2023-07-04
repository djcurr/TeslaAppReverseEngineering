package qu;

import android.content.Context;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import kotlin.text.w;
import vz.v;
import wz.r0;

/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f48482a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final com.tesla.logging.g f48483b = com.tesla.logging.g.f21878b.a("ReportFileManager");

    /* renamed from: c  reason: collision with root package name */
    private static boolean f48484c;

    private d() {
    }

    private final File b(Context context) {
        Context applicationContext = context.getApplicationContext();
        s.f(applicationContext, "context.applicationContext");
        File h11 = h(applicationContext);
        if (!h11.exists()) {
            h11.mkdirs();
        }
        return h11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
        r5 = wz.p.B0(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<java.io.File> c(java.io.File r5) {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r5.isDirectory()
            if (r1 == 0) goto L45
            java.io.File[] r5 = r5.listFiles()
            if (r5 != 0) goto L12
            goto L4e
        L12:
            java.util.List r5 = wz.l.B0(r5)
            if (r5 != 0) goto L19
            goto L4e
        L19:
            java.util.Iterator r5 = r5.iterator()
        L1d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r5.next()
            java.io.File r1 = (java.io.File) r1
            boolean r2 = r1.isFile()
            java.lang.String r3 = "child"
            if (r2 == 0) goto L38
            kotlin.jvm.internal.s.f(r1, r3)
            r0.add(r1)
            goto L1d
        L38:
            qu.d r2 = qu.d.f48482a
            kotlin.jvm.internal.s.f(r1, r3)
            java.util.List r1 = r2.c(r1)
            r0.addAll(r1)
            goto L1d
        L45:
            boolean r1 = r5.isFile()
            if (r1 == 0) goto L4e
            r0.add(r5)
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qu.d.c(java.io.File):java.util.List");
    }

    private final File f(Context context) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        String str = File.separator;
        return new File(absolutePath + str + "logs");
    }

    public final File a(Context context, String reportId, String fileNameSuffix) {
        s.g(context, "context");
        s.g(reportId, "reportId");
        s.g(fileNameSuffix, "fileNameSuffix");
        File file = new File(h(context).getAbsolutePath(), "NEW_" + reportId + "-" + fileNameSuffix + ".json");
        file.createNewFile();
        return file;
    }

    public final File d(Context context) {
        Object obj;
        s.g(context, "context");
        Iterator<T> it2 = i(context).iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                long lastModified = ((File) next).lastModified();
                do {
                    Object next2 = it2.next();
                    long lastModified2 = ((File) next2).lastModified();
                    if (lastModified < lastModified2) {
                        next = next2;
                        lastModified = lastModified2;
                    }
                } while (it2.hasNext());
                obj = next;
            } else {
                obj = next;
            }
        } else {
            obj = null;
        }
        return (File) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.io.File> e(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qu.d.e(android.content.Context):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.io.File> g(android.content.Context r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.s.g(r9, r0)
            java.lang.String r0 = "reportId"
            kotlin.jvm.internal.s.g(r10, r0)
            java.io.File r9 = r8.h(r9)
            java.io.File[] r9 = r9.listFiles()
            r0 = 0
            if (r9 != 0) goto L16
            goto L44
        L16:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r9.length
            r3 = 0
            r4 = r3
        L1e:
            if (r4 >= r2) goto L43
            r5 = r9[r4]
            boolean r6 = r5.isFile()
            if (r6 == 0) goto L3a
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = "file.name"
            kotlin.jvm.internal.s.f(r6, r7)
            r7 = 2
            boolean r6 = kotlin.text.m.M(r6, r10, r3, r7, r0)
            if (r6 == 0) goto L3a
            r6 = 1
            goto L3b
        L3a:
            r6 = r3
        L3b:
            if (r6 == 0) goto L40
            r1.add(r5)
        L40:
            int r4 = r4 + 1
            goto L1e
        L43:
            r0 = r1
        L44:
            if (r0 != 0) goto L4a
            java.util.List r0 = wz.u.i()
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qu.d.g(android.content.Context, java.lang.String):java.util.List");
    }

    public final File h(Context context) {
        s.g(context, "context");
        String absolutePath = context.getCacheDir().getAbsolutePath();
        String str = File.separator;
        return new File(absolutePath + str + "reports");
    }

    public final List<File> i(Context context) {
        List<File> i11;
        boolean M;
        s.g(context, "context");
        File[] listFiles = j(context).listFiles();
        ArrayList arrayList = null;
        if (listFiles != null) {
            ArrayList arrayList2 = new ArrayList();
            for (File file : listFiles) {
                String name = file.getName();
                s.f(name, "it.name");
                M = w.M(name, ".zip", false, 2, null);
                if (M) {
                    arrayList2.add(file);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            i11 = wz.w.i();
            return i11;
        }
        return arrayList;
    }

    public final File j(Context context) {
        s.g(context, "context");
        File file = new File(context.getCacheDir(), "zipped_reports");
        file.mkdirs();
        return file;
    }

    public final void k(Context context) {
        s.g(context, "context");
        if (f48484c) {
            return;
        }
        f48484c = true;
        Context appContext = context.getApplicationContext();
        s.f(appContext, "appContext");
        b(appContext);
    }

    public final File l(File file) {
        String t02;
        Map f11;
        s.g(file, "file");
        String parent = file.getParent();
        s.e(parent);
        String name = file.getName();
        s.f(name, "file.name");
        t02 = w.t0(name, "NEW_");
        File file2 = new File(parent, t02);
        if (file.renameTo(file2)) {
            return file2;
        }
        com.tesla.logging.g gVar = f48483b;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String h11 = gVar.h();
        ht.a aVar = ht.a.f29422a;
        f11 = r0.f(v.a(h11, "Failed to mark report ready for upload!"));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : f11.entrySet()) {
            ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception("Failed to mark report ready for upload!"));
        TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
        n80.a.a("Failed to mark report ready for upload!", new Object[0]);
        return null;
    }
}