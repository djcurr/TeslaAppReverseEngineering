package pu;

import android.content.Context;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.tesla.data.HttpMethodType;
import com.tesla.data.oapi.OwnerApiEndpoint;
import com.tesla.data.oapi.h;
import com.tesla.data.oapi.k;
import com.tesla.logging.g;
import ct.i;
import hy.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import vz.b0;
import yu.f;
import yu.y;
import zu.j;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: e */
    public static final a f46921e = new a(null);

    /* renamed from: f */
    private static final g f46922f = g.f21878b.a("ProfileBackupService");

    /* renamed from: a */
    private final h f46923a;

    /* renamed from: b */
    private final yu.f f46924b;

    /* renamed from: c */
    private final i f46925c;

    /* renamed from: d */
    private final Context f46926d;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(Context context) {
            s.g(context, "context");
            Context applicationContext = context.getApplicationContext();
            h.a aVar = h.f21733b;
            s.f(applicationContext, "applicationContext");
            h a11 = aVar.a(applicationContext);
            y a12 = y.f59842h.a(applicationContext);
            i realmHelper = i.i();
            s.f(realmHelper, "realmHelper");
            return new e(a11, a12, realmHelper, applicationContext);
        }
    }

    public e(h endpoints, yu.f sendOwnerRequest, i realmHelper, Context applicationContext) {
        s.g(endpoints, "endpoints");
        s.g(sendOwnerRequest, "sendOwnerRequest");
        s.g(realmHelper, "realmHelper");
        s.g(applicationContext, "applicationContext");
        this.f46923a = endpoints;
        this.f46924b = sendOwnerRequest;
        this.f46925c = realmHelper;
        this.f46926d = applicationContext;
    }

    public static /* synthetic */ void a(k kVar) {
        j(kVar);
    }

    public static /* synthetic */ void b(Throwable th2) {
        k(th2);
    }

    public static /* synthetic */ void c(e eVar, k kVar) {
        g(eVar, kVar);
    }

    public static /* synthetic */ void d(Throwable th2) {
        h(th2);
    }

    private final m<k> e() {
        OwnerApiEndpoint c11 = this.f46923a.c("VEHICLE_DOWNLOAD_VAULT");
        if (c11 != null) {
            return f.a.a(this.f46924b, c11.component1(), c11.component2(), null, false, false, 28, null);
        }
        throw new IllegalStateException("VEHICLE_DOWNLOAD_VAULT not found in endpoints");
    }

    public static final void g(e this$0, k kVar) {
        String string;
        s.g(this$0, "this$0");
        if (!kVar.i() || kVar.e() == null) {
            return;
        }
        JSONObject e11 = kVar.e();
        JSONObject optJSONObject = e11 == null ? null : e11.optJSONObject("response");
        if (optJSONObject == null || (string = optJSONObject.getString("vault")) == null) {
            return;
        }
        zt.g f11 = f.f46927a.f(zt.g.f60737f.decode(j.a(string)), this$0.f46925c, this$0.f46926d);
        if (f11 != null) {
            this$0.i(f11);
        }
        f46922f.i("Download Successful!");
    }

    public static final void h(Throwable th2) {
        f46922f.i("Download Failed!");
    }

    private final void i(zt.g gVar) {
        OwnerApiEndpoint c11 = this.f46923a.c("VEHICLE_UPLOAD_VAULT");
        if (c11 != null) {
            HttpMethodType component1 = c11.component1();
            String component2 = c11.component2();
            yu.f fVar = this.f46924b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vault", gVar.encodeByteString().a());
            b0 b0Var = b0.f54756a;
            f.a.d(fVar, component1, component2, null, jSONObject, null, null, null, false, false, DownloaderService.STATUS_HTTP_EXCEPTION, null).u(new ky.f() { // from class: pu.b
                @Override // ky.f
                public final void accept(Object obj) {
                    e.a((k) obj);
                }
            }, new ky.f() { // from class: pu.c
                @Override // ky.f
                public final void accept(Object obj) {
                    e.b((Throwable) obj);
                }
            });
            return;
        }
        throw new IllegalStateException("VEHICLE_UPLOAD_VAULT not found in endpoints");
    }

    public static final void j(k kVar) {
        if (kVar.i()) {
            f46922f.i("Upload Successful!");
        }
    }

    public static final void k(Throwable th2) {
        f46922f.i("Upload Failed!");
    }

    public final void f() {
        e().u(new ky.f() { // from class: pu.a
            @Override // ky.f
            public final void accept(Object obj) {
                e.c(e.this, (k) obj);
            }
        }, new ky.f() { // from class: pu.d
            @Override // ky.f
            public final void accept(Object obj) {
                e.d((Throwable) obj);
            }
        });
    }
}