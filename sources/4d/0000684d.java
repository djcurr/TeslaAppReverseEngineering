package expo.modules;

import expo.modules.core.interfaces.ReactNativeHostHandler;
import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lexpo/modules/core/interfaces/ReactNativeHostHandler;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes6.dex */
final class ReactNativeHostWrapperBase$getJSBundleFile$1 extends u implements l<ReactNativeHostHandler, String> {
    final /* synthetic */ ReactNativeHostWrapperBase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactNativeHostWrapperBase$getJSBundleFile$1(ReactNativeHostWrapperBase reactNativeHostWrapperBase) {
        super(1);
        this.this$0 = reactNativeHostWrapperBase;
    }

    @Override // h00.l
    public final String invoke(ReactNativeHostHandler reactNativeHostHandler) {
        return reactNativeHostHandler.getJSBundleFile(this.this$0.getUseDeveloperSupport());
    }
}