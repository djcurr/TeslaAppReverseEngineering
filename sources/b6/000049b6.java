package com.reactnativestripesdk;

import com.facebook.react.uimanager.SimpleViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0014J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0007J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¨\u0006\u0010"}, d2 = {"Lcom/reactnativestripesdk/GooglePayButtonManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/reactnativestripesdk/a0;", "", "getName", "view", "Lvz/b0;", "onAfterUpdateTransaction", "buttonType", "Lcom/facebook/react/uimanager/n0;", "reactContext", "createViewInstance", "<init>", "()V", "Companion", "a", "stripe_stripe-react-native_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class GooglePayButtonManager extends SimpleViewManager<a0> {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "GooglePayButton";

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @ng.a(name = "buttonType")
    public final void buttonType(a0 view, String buttonType) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(buttonType, "buttonType");
        view.setType(buttonType);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a0 createViewInstance(com.facebook.react.uimanager.n0 reactContext) {
        kotlin.jvm.internal.s.g(reactContext, "reactContext");
        return new a0(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a0 view) {
        kotlin.jvm.internal.s.g(view, "view");
        super.onAfterUpdateTransaction((GooglePayButtonManager) view);
        view.a();
    }
}