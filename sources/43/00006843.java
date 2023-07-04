package expo.modules;

import com.facebook.react.z;
import expo.modules.core.interfaces.ReactActivityHandler;
import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lexpo/modules/core/interfaces/ReactActivityHandler;", "kotlin.jvm.PlatformType", "it", "Lcom/facebook/react/z;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ReactActivityDelegateWrapper$createRootView$rootView$1 extends u implements l<ReactActivityHandler, z> {
    final /* synthetic */ ReactActivityDelegateWrapper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactActivityDelegateWrapper$createRootView$rootView$1(ReactActivityDelegateWrapper reactActivityDelegateWrapper) {
        super(1);
        this.this$0 = reactActivityDelegateWrapper;
    }

    @Override // h00.l
    public final z invoke(ReactActivityHandler reactActivityHandler) {
        com.facebook.react.l lVar;
        lVar = this.this$0.activity;
        return reactActivityHandler.createReactRootView(lVar);
    }
}