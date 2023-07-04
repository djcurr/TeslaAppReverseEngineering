package expo.modules.random;

import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lexpo/modules/random/RandomModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "getName", "", "randomByteCount", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "getRandomBase64StringAsync", "getRandomBase64String", "Ljava/security/SecureRandom;", "secureRandom$delegate", "Lvz/k;", "getSecureRandom", "()Ljava/security/SecureRandom;", "secureRandom", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "expo-random_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class RandomModule extends ReactContextBaseJavaModule {
    private final k secureRandom$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RandomModule(ReactApplicationContext context) {
        super(context);
        k a11;
        s.g(context, "context");
        a11 = m.a(RandomModule$secureRandom$2.INSTANCE);
        this.secureRandom$delegate = a11;
    }

    private final SecureRandom getSecureRandom() {
        return (SecureRandom) this.secureRandom$delegate.getValue();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ExpoRandom";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String getRandomBase64String(int i11) {
        byte[] bArr = new byte[i11];
        getSecureRandom().nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 2);
        s.f(encodeToString, "encodeToString(output, Base64.NO_WRAP)");
        return encodeToString;
    }

    @ReactMethod
    public final void getRandomBase64StringAsync(int i11, Promise promise) {
        s.g(promise, "promise");
        promise.resolve(getRandomBase64String(i11));
    }
}