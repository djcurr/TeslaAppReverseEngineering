package com.reactnativemodpow;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"Lcom/reactnativemodpow/ModpowModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "getName", "Lcom/facebook/react/bridge/ReadableMap;", "values", "modPow", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "react-native-modpow_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ModpowModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModpowModule(ReactApplicationContext reactContext) {
        super(reactContext);
        s.g(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Modpow";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String modPow(ReadableMap values) {
        s.g(values, "values");
        String bigInteger = new BigInteger(values.getString("target"), 16).modPow(new BigInteger(values.getString("value"), 16), new BigInteger(values.getString("modifier"), 16)).toString(16);
        s.f(bigInteger, "target.modPow(value, modifier).toString(16)");
        return bigInteger;
    }
}