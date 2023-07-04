package expo.modules.kotlin;

import com.stripe.android.model.PaymentMethodOptionsParams;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.types.JSTypeConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J$\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lexpo/modules/kotlin/KPromiseWrapper;", "Lexpo/modules/kotlin/Promise;", "", "value", "Lvz/b0;", "resolve", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "message", "", "cause", "reject", "Lcom/facebook/react/bridge/Promise;", "bridgePromise", "Lcom/facebook/react/bridge/Promise;", "<init>", "(Lcom/facebook/react/bridge/Promise;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class KPromiseWrapper implements Promise {
    private final com.facebook.react.bridge.Promise bridgePromise;

    public KPromiseWrapper(com.facebook.react.bridge.Promise bridgePromise) {
        s.g(bridgePromise, "bridgePromise");
        this.bridgePromise = bridgePromise;
    }

    @Override // expo.modules.kotlin.Promise
    public void reject(CodedException codedException) {
        Promise.DefaultImpls.reject(this, codedException);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(Object obj) {
        this.bridgePromise.resolve(JSTypeConverter.convertToJSValue$default(JSTypeConverter.INSTANCE, obj, null, 2, null));
    }

    @Override // expo.modules.kotlin.Promise
    public void reject(String code, String str, Throwable th2) {
        s.g(code, "code");
        this.bridgePromise.reject(code, str, th2);
    }
}