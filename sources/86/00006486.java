package cx;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23164a = new a();

    private a() {
    }

    public final WritableMap a(Exception exception) {
        s.g(exception, "exception");
        WritableMap exceptionMap = Arguments.createMap();
        String message = exception.getMessage();
        exceptionMap.putString(PaymentMethodOptionsParams.Blik.PARAM_CODE, "unknown");
        exceptionMap.putString("nativeErrorCode", "unknown");
        exceptionMap.putString("message", message);
        exceptionMap.putString("nativeErrorMessage", message);
        s.f(exceptionMap, "exceptionMap");
        return exceptionMap;
    }
}