package as;

import android.app.Application;
import com.tesla.domain.model.DataRestrictedCountry;
import com.tesla.logging.g;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6719a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final g f6720b = g.f21878b.a("Analytics");

    private a() {
    }

    public final void a(Application application) {
        s.g(application, "application");
        if (DataRestrictedCountry.Companion.b(application)) {
            f6720b.i("Data restricted country detected, not adding firebase analytics");
            tl.a.b(zm.a.f60534a).b(false);
        } else {
            b bVar = b.f6721a;
            bVar.c(tl.a.b(zm.a.f60534a));
            es.b.a().b(bVar);
        }
        es.b.a().e();
    }

    public final void b(String userId) {
        s.g(userId, "userId");
    }
}