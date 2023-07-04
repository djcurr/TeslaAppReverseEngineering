package com.reactnativestripesdk;

import com.facebook.react.uimanager.ViewGroupManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¨\u0006\u000f"}, d2 = {"Lcom/reactnativestripesdk/StripeContainerManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/reactnativestripesdk/q0;", "", "getName", "view", "", "keyboardShouldPersistTaps", "Lvz/b0;", "setKeyboardShouldPersistTaps", "Lcom/facebook/react/uimanager/n0;", "reactContext", "createViewInstance", "<init>", "()V", "stripe_stripe-react-native_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class StripeContainerManager extends ViewGroupManager<q0> {
    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "StripeContainer";
    }

    @ng.a(name = "keyboardShouldPersistTaps")
    public final void setKeyboardShouldPersistTaps(q0 view, boolean z11) {
        kotlin.jvm.internal.s.g(view, "view");
        view.setKeyboardShouldPersistTaps(z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public q0 createViewInstance(com.facebook.react.uimanager.n0 reactContext) {
        kotlin.jvm.internal.s.g(reactContext, "reactContext");
        return new q0(reactContext);
    }
}