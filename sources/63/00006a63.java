package expo.modules.kotlin;

import com.stripe.android.model.PaymentMethodOptionsParams;
import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J$\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"Lexpo/modules/kotlin/Promise;", "", "value", "Lvz/b0;", "resolve", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "message", "", "cause", "reject", "Lexpo/modules/kotlin/exception/CodedException;", "exception", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public interface Promise {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        public static void reject(Promise promise, CodedException exception) {
            s.g(promise, "this");
            s.g(exception, "exception");
            promise.reject(exception.getCode(), exception.getLocalizedMessage(), exception.getCause());
        }
    }

    void reject(CodedException codedException);

    void reject(String str, String str2, Throwable th2);

    void resolve(Object obj);
}