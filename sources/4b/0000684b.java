package expo.modules;

import com.facebook.react.r;
import expo.modules.core.interfaces.ReactNativeHostHandler;
import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lexpo/modules/core/interfaces/ReactNativeHostHandler;", "kotlin.jvm.PlatformType", "it", "Lcom/facebook/react/r;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes6.dex */
final class ReactNativeHostWrapperBase$createReactInstanceManager$result$1 extends u implements l<ReactNativeHostHandler, r> {
    final /* synthetic */ boolean $developerSupport;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactNativeHostWrapperBase$createReactInstanceManager$result$1(boolean z11) {
        super(1);
        this.$developerSupport = z11;
    }

    @Override // h00.l
    public final r invoke(ReactNativeHostHandler reactNativeHostHandler) {
        return reactNativeHostHandler.createReactInstanceManager(this.$developerSupport);
    }
}