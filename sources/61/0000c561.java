package zu;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.stripe.android.model.PaymentMethod;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f60769a = new f();

    private f() {
    }

    public final String a(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        Object systemService = context.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return ((TelephonyManager) systemService).getNetworkCountryIso();
    }

    public final String b(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        Object systemService = context.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return ((TelephonyManager) systemService).getSimCountryIso();
    }
}