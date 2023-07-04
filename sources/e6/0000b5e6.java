package tu;

import android.content.Context;
import android.net.Uri;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import qu.d;
import vz.v;
import wz.r0;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f52550a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final g f52551b = g.f21878b.a("ZipReportFiles");

    private a() {
    }

    public final File a(Context context, String fileNameWithoutExtension, List<? extends Uri> uris) {
        Map f11;
        s.g(context, "context");
        s.g(fileNameWithoutExtension, "fileNameWithoutExtension");
        s.g(uris, "uris");
        try {
            File j11 = d.f48482a.j(context);
            File file = new File(j11, fileNameWithoutExtension + ".zip");
            if (file.createNewFile()) {
                g gVar = f52551b;
                String name = file.getName();
                gVar.i("Created zip file: " + name);
            } else {
                g gVar2 = f52551b;
                String name2 = file.getName();
                gVar2.i("File already exists, hopefully is zip? " + name2);
            }
            b.f52552a.a(uris, file);
            return file;
        } catch (Exception unused) {
            g gVar3 = f52551b;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar3.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(v.a(h11, "Exception thrown zipping files"));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception("Exception thrown zipping files"));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a("Exception thrown zipping files", new Object[0]);
            return null;
        }
    }
}