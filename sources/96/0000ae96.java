package qu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Pair;
import ch.qos.logback.classic.net.SyslogAppender;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import expo.modules.interfaces.permissions.PermissionsResponse;
import hy.m;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.text.w;
import n00.n;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import wz.b0;
import wz.e0;
import wz.r0;
import wz.v;
import wz.w0;
import wz.x;

/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a */
    public static final l f48495a = new l();

    /* loaded from: classes6.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a((String) ((Pair) t11).first, (String) ((Pair) t12).first);
            return a11;
        }
    }

    private l() {
    }

    public static /* synthetic */ void a(Activity activity, Uri uri, Throwable th2) {
        e(activity, uri, th2);
    }

    public static /* synthetic */ Uri b(Activity activity) {
        return d(activity);
    }

    public static final Uri d(Activity activity) {
        List<String> F0;
        List<? extends Uri> d11;
        List d12;
        s.g(activity, "$activity");
        File file = new File(activity.getCacheDir(), "zipped_logs");
        e00.j.l(file);
        file.mkdirs();
        long currentTimeMillis = System.currentTimeMillis();
        File file2 = new File(file, "logs-" + currentTimeMillis + ".zip");
        file2.createNewFile();
        File cacheDir = activity.getCacheDir();
        long currentTimeMillis2 = System.currentTimeMillis();
        File file3 = new File(cacheDir, "sorted-logs-" + currentTimeMillis2 + ".txt");
        file3.createNewFile();
        List<File> e11 = d.f48482a.e(activity);
        ArrayList<File> arrayList = new ArrayList();
        for (Object obj : e11) {
            if (((File) obj).exists()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (File file4 : arrayList) {
            d12 = e00.h.d(file4, null, 1, null);
            b0.z(arrayList2, d12);
        }
        F0 = e0.F0(arrayList2);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file3), kotlin.text.d.f35187b);
        BufferedWriter bufferedWriter = outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, PKIFailureInfo.certRevoked);
        try {
            l lVar = f48495a;
            lVar.k(bufferedWriter, e11);
            lVar.i(bufferedWriter, F0);
            lVar.l(bufferedWriter, activity);
            lVar.h(bufferedWriter);
            lVar.j(bufferedWriter, F0);
            e00.b.a(bufferedWriter, null);
            tu.b bVar = tu.b.f52552a;
            Uri fromFile = Uri.fromFile(file3);
            s.f(fromFile, "fromFile(this)");
            d11 = v.d(fromFile);
            bVar.a(d11, file2);
            file3.delete();
            return b.a(file2, activity);
        } finally {
        }
    }

    public static final void e(Activity activity, Uri uri, Throwable th2) {
        vz.b0 b0Var;
        Map f11;
        s.g(activity, "$activity");
        if (uri != null) {
            f48495a.g(activity, uri, "Tesla App Logs", "Send Tesla App Logs");
            return;
        }
        if (th2 == null) {
            b0Var = null;
        } else {
            TeslaLog.INSTANCE.fatal("ShareReportUtil", "Error zipping logs", th2);
            b0Var = vz.b0.f54756a;
        }
        if (b0Var == null) {
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(vz.v.a("ShareReportUtil", "Error zipping logs"));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception("Error zipping logs"));
            TeslaLog.setTag$default(teslaLog, "ShareReportUtil", false, 2, null);
            n80.a.a("Error zipping logs", new Object[0]);
        }
    }

    private final void g(Context context, Uri uri, String str, String str2) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("vnd.android.cursor.dir/email");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.putExtra("android.intent.extra.SUBJECT", str);
        context.startActivity(Intent.createChooser(intent, str2).setFlags(1));
    }

    private final void h(BufferedWriter bufferedWriter) {
        bufferedWriter.newLine();
        bufferedWriter.write("--- BUILD CONFIG ---");
        bufferedWriter.newLine();
        Iterator<T> it2 = o00.b.e(m0.b(qu.a.class)).iterator();
        while (it2.hasNext()) {
            n nVar = (n) it2.next();
            String name = nVar.getName();
            Object obj = nVar.get();
            bufferedWriter.write(name + ": " + obj);
            bufferedWriter.newLine();
        }
    }

    private final void i(BufferedWriter bufferedWriter, List<String> list) {
        int t11;
        String D;
        boolean M;
        bufferedWriter.newLine();
        bufferedWriter.write("--- ERRORS ---");
        bufferedWriter.newLine();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : list) {
            M = w.M((String) obj, "[E]", false, 2, null);
            if (M) {
                arrayList.add(obj);
            }
        }
        t11 = x.t(arrayList, 10);
        ArrayList<String> arrayList2 = new ArrayList(t11);
        for (String str : arrayList) {
            D = kotlin.text.v.D(str, SyslogAppender.DEFAULT_STACKTRACE_PATTERN, "\n", false, 4, null);
            arrayList2.add(D);
        }
        for (String str2 : arrayList2) {
            bufferedWriter.write(str2);
            bufferedWriter.newLine();
        }
    }

    private final void j(BufferedWriter bufferedWriter, List<String> list) {
        boolean M;
        boolean M2;
        int Z;
        int i11;
        bufferedWriter.newLine();
        bufferedWriter.write("--- LOGS ---");
        bufferedWriter.newLine();
        for (String str : list) {
            M = w.M(str, "OwnerAPI", false, 2, null);
            if (M) {
                M2 = w.M(str, "\"response\"", false, 2, null);
                if (M2) {
                    try {
                        Z = w.Z(str, "{\"response", 0, false, 6, null);
                        int i12 = -1;
                        int length = str.length() - 1;
                        while (true) {
                            if (length < 0) {
                                break;
                            }
                            if (str.charAt(length) == '}') {
                                i12 = length;
                                break;
                            }
                            length--;
                        }
                        i11 = i12 + 1;
                    } catch (Exception unused) {
                        bufferedWriter.write(str);
                    }
                    if (str != null) {
                        String substring = str.substring(Z, i11);
                        s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        String jSONObject = new JSONObject(substring).toString(2);
                        StringBuilder sb2 = new StringBuilder();
                        String substring2 = str.substring(0, Z);
                        s.f(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb2.append(substring2);
                        sb2.append(jSONObject);
                        String substring3 = str.substring(i11);
                        s.f(substring3, "(this as java.lang.String).substring(startIndex)");
                        sb2.append(substring3);
                        vz.b0 b0Var = vz.b0.f54756a;
                        bufferedWriter.write(sb2.toString());
                        bufferedWriter.newLine();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        break;
                    }
                }
            }
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }
    }

    private final void k(BufferedWriter bufferedWriter, List<? extends File> list) {
        bufferedWriter.newLine();
        bufferedWriter.write("--- LOGS METADATA ---");
        bufferedWriter.newLine();
        for (File file : list) {
            String str = null;
            try {
                e00.h.f(file, null, 1, null);
            } catch (Exception e11) {
                str = e11.getMessage();
            }
            String name = file.getName();
            boolean canRead = file.canRead();
            boolean exists = file.exists();
            boolean isFile = file.isFile();
            if (str == null) {
                str = PermissionsResponse.SCOPE_NONE;
            }
            long lastModified = file.lastModified();
            bufferedWriter.write("name: " + name + " canRead: " + canRead + " exists: " + exists + " isFile: " + isFile + " readError: " + str + " lastModified: " + lastModified);
            bufferedWriter.newLine();
        }
    }

    private final void l(BufferedWriter bufferedWriter, Activity activity) {
        List<Pair> G0;
        Set c11;
        boolean K;
        bufferedWriter.newLine();
        bufferedWriter.write("--- REALM ---");
        bufferedWriter.newLine();
        List<Pair<String, String>> j11 = ct.i.i().j();
        s.f(j11, "getDB().keyValues");
        ArrayList arrayList = new ArrayList();
        for (Object obj : j11) {
            Object obj2 = ((Pair) obj).first;
            s.f(obj2, "it.first");
            K = w.K((CharSequence) obj2, "PRIVATE", true);
            if (!K) {
                arrayList.add(obj);
            }
        }
        G0 = e0.G0(arrayList, new a());
        for (Pair pair : G0) {
            String str = (String) pair.first;
            String str2 = (String) pair.second;
            try {
                c11 = w0.c("persist:appSettings");
                if (!c11.contains(str)) {
                    str2 = new JSONObject(str2).toString(2);
                }
            } catch (Exception unused) {
            }
            bufferedWriter.write(str + ": " + str2);
            bufferedWriter.newLine();
        }
    }

    public final void c(final Activity activity) {
        s.g(activity, "activity");
        m.l(new Callable() { // from class: qu.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return l.b(activity);
            }
        }).w(bz.a.c()).t(new ky.b() { // from class: qu.k
            @Override // ky.b
            public final void accept(Object obj, Object obj2) {
                l.a(activity, (Uri) obj, (Throwable) obj2);
            }
        });
    }

    public final void f(Activity activity) {
        s.g(activity, "activity");
        File d11 = d.f48482a.d(activity);
        if (d11 == null) {
            TeslaLog.INSTANCE.i("ShareReportUtil", "No zipped report found to share");
            return;
        }
        Uri a11 = b.a(d11, activity);
        String lastPathSegment = a11.getLastPathSegment();
        g(activity, a11, "Feedback Report: " + lastPathSegment, "Send Zipped Feedback Report Files");
    }
}