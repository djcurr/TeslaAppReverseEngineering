package ku;

import android.content.Context;
import com.tesla.domain.model.DataRestrictedCountry;
import com.tesla.logging.TeslaLog;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f35883a = new d();

    private d() {
    }

    public final void a(Context context, boolean z11) {
        s.g(context, "context");
        if (DataRestrictedCountry.Companion.b(context)) {
            TeslaLog.INSTANCE.i("Monitoring", "Data restricted country detected, not enabling monitoring");
            cn.c.c().f(false);
            return;
        }
        cn.c.c().f(z11);
    }
}