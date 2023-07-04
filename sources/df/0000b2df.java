package su;

import android.content.Context;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.data.HttpMethodType;
import com.tesla.data.oapi.OwnerApiEndpoint;
import com.tesla.data.oapi.h;
import com.tesla.data.oapi.k;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import hy.m;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;
import wz.e0;
import wz.r0;
import wz.w;
import yu.f;
import yu.y;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: d */
    public static final a f50653d = new a(null);

    /* renamed from: e */
    private static final g f50654e = g.f21878b.a("UploadReport");

    /* renamed from: a */
    private final h f50655a;

    /* renamed from: b */
    private final y f50656b;

    /* renamed from: c */
    private final es.c f50657c;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Context context) {
            s.g(context, "context");
            Context appContext = context.getApplicationContext();
            h.a aVar = h.f21733b;
            s.f(appContext, "appContext");
            return new b(aVar.a(appContext), y.f59842h.a(appContext), es.b.a());
        }
    }

    public b(h ownerApiEndpoints, y sendOwnerRequest, es.c analyticsService) {
        s.g(ownerApiEndpoints, "ownerApiEndpoints");
        s.g(sendOwnerRequest, "sendOwnerRequest");
        s.g(analyticsService, "analyticsService");
        this.f50655a = ownerApiEndpoints;
        this.f50656b = sendOwnerRequest;
        this.f50657c = analyticsService;
    }

    public static /* synthetic */ Boolean a(String str, File file, b bVar, List list, k kVar) {
        return d(str, file, bVar, list, kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ m c(b bVar, File file, List list, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = w.i();
        }
        return bVar.b(file, list);
    }

    public static final Boolean d(String str, File file, b this$0, List analyticsParameters, k kVar) {
        List l11;
        List<jt.f> y02;
        s.g(file, "$file");
        s.g(this$0, "this$0");
        s.g(analyticsParameters, "$analyticsParameters");
        boolean z11 = true;
        if (kVar.i()) {
            g gVar = f50654e;
            gVar.i("Successfully uploaded: " + str);
            file.delete();
            gVar.i("Deleted: " + str);
        } else {
            f50654e.i("Failed to upload: " + str);
            es.c cVar = this$0.f50657c;
            jt.d dVar = jt.d.REPORT_UPLOAD_ATTEMPTED;
            l11 = w.l(fs.a.b(), fs.a.d(kVar.a()));
            y02 = e0.y0(l11, analyticsParameters);
            cVar.a(dVar, y02);
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    public final m<Boolean> b(final File file, final List<jt.f> analyticsParameters) {
        String f11;
        Map f12;
        s.g(file, "file");
        s.g(analyticsParameters, "analyticsParameters");
        OwnerApiEndpoint c11 = this.f50655a.c("APP_FEEDBACK_LOGS");
        if (c11 == null) {
            g gVar = f50654e;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f12 = r0.f(v.a(h11, "Failed to get report endpoint"));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f12.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception("Failed to get report endpoint"));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a("Failed to get report endpoint", new Object[0]);
            throw new IllegalStateException("Failed to get report endpoint");
        }
        final String name = file.getName();
        g gVar2 = f50654e;
        gVar2.i("Uploading report file: " + name);
        y yVar = this.f50656b;
        HttpMethodType method = c11.getMethod();
        String uri = c11.getUri();
        f11 = e00.h.f(file, null, 1, null);
        m<Boolean> o11 = f.a.b(yVar, method, uri, null, f11, null, null, null, false, false, 500, null).o(new ky.h() { // from class: su.a
            @Override // ky.h
            public final Object apply(Object obj) {
                return b.a(name, file, this, analyticsParameters, (k) obj);
            }
        });
        s.f(o11, "sendOwnerRequest\n      .…  false\n        }\n      }");
        return o11;
    }
}