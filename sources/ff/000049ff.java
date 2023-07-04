package com.reactnativestripesdk.pushprovisioning;

import com.bumptech.glide.k;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.n0;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000fH\u0007J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0007J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0007R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/reactnativestripesdk/pushprovisioning/b;", "", "getName", "view", "Lvz/b0;", "onDropViewInstance", "onAfterUpdateTransaction", "Lcom/facebook/react/uimanager/n0;", "reactContext", "createViewInstance", "", "", "getExportedCustomDirectEventTypeConstants", "Lcom/facebook/react/bridge/ReadableMap;", Stripe3ds2AuthParams.FIELD_SOURCE, "cardDetails", "ephemeralKey", "token", "Lcom/bumptech/glide/k;", "requestManager", "Lcom/bumptech/glide/k;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "applicationContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "stripe_stripe-react-native_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class AddToWalletButtonManager extends SimpleViewManager<b> {
    private final k requestManager;

    public AddToWalletButtonManager(ReactApplicationContext applicationContext) {
        s.g(applicationContext, "applicationContext");
        k C = com.bumptech.glide.c.C(applicationContext);
        s.f(C, "with(applicationContext)");
        this.requestManager = C;
    }

    @ng.a(name = "cardDetails")
    public final void cardDetails(b view, ReadableMap cardDetails) {
        s.g(view, "view");
        s.g(cardDetails, "cardDetails");
        view.setCardDetails(cardDetails);
    }

    @ng.a(name = "ephemeralKey")
    public final void ephemeralKey(b view, ReadableMap ephemeralKey) {
        s.g(view, "view");
        s.g(ephemeralKey, "ephemeralKey");
        view.setEphemeralKey(ephemeralKey);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> d11 = yf.c.d("onCompleteAction", yf.c.d("registrationName", "onCompleteAction"));
        s.f(d11, "of(\n      AddToWalletCom…\"onCompleteAction\")\n    )");
        return d11;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AddToWalletButton";
    }

    @ng.a(name = "androidAssetSource")
    public final void source(b view, ReadableMap source) {
        s.g(view, "view");
        s.g(source, "source");
        view.setSourceMap(source);
    }

    @ng.a(name = "token")
    public final void token(b view, ReadableMap readableMap) {
        s.g(view, "view");
        view.setToken(readableMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(n0 reactContext) {
        s.g(reactContext, "reactContext");
        return new b(reactContext, this.requestManager);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(b view) {
        s.g(view, "view");
        super.onAfterUpdateTransaction((AddToWalletButtonManager) view);
        view.g();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(b view) {
        s.g(view, "view");
        view.h();
        super.onDropViewInstance((AddToWalletButtonManager) view);
    }
}