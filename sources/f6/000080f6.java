package ku;

import com.tesla.logging.TeslaLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final gn.b f35895a;

    /* renamed from: b  reason: collision with root package name */
    private final String f35896b;

    /* renamed from: c  reason: collision with root package name */
    private final String f35897c;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public h(gn.b metric, String url, String method) {
        s.g(metric, "metric");
        s.g(url, "url");
        s.g(method, "method");
        this.f35895a = metric;
        this.f35896b = url;
        this.f35897c = method;
    }

    @Override // ku.f
    public void a(int i11, long j11, String str) {
        gn.b bVar = this.f35895a;
        bVar.a(i11);
        bVar.d(j11);
        bVar.c(str);
        bVar.f();
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String str2 = this.f35896b;
        String str3 = this.f35897c;
        teslaLog.i("NetworkTrace", "Network trace stopped for " + str2 + " " + str3);
    }
}