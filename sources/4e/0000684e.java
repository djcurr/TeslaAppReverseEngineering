package expo.modules;

import com.facebook.react.bridge.JavaScriptExecutorFactory;
import expo.modules.core.interfaces.ReactNativeHostHandler;
import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lexpo/modules/core/interfaces/ReactNativeHostHandler;", "kotlin.jvm.PlatformType", "it", "Lcom/facebook/react/bridge/JavaScriptExecutorFactory;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes6.dex */
final class ReactNativeHostWrapperBase$getJavaScriptExecutorFactory$1 extends u implements l<ReactNativeHostHandler, JavaScriptExecutorFactory> {
    public static final ReactNativeHostWrapperBase$getJavaScriptExecutorFactory$1 INSTANCE = new ReactNativeHostWrapperBase$getJavaScriptExecutorFactory$1();

    ReactNativeHostWrapperBase$getJavaScriptExecutorFactory$1() {
        super(1);
    }

    @Override // h00.l
    public final JavaScriptExecutorFactory invoke(ReactNativeHostHandler reactNativeHostHandler) {
        return reactNativeHostHandler.getJavaScriptExecutorFactory();
    }
}