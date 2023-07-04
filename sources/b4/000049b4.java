package com.reactnativestripesdk;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J$\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007J\u001a\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u000fH\u0007J\u001a\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0007J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J\u001a\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0007J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0016H\u0007J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0014J\u0010\u0010 \u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0018\u0010!\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/reactnativestripesdk/CardFieldViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/reactnativestripesdk/k;", "", "getName", "", "", "getExportedCustomDirectEventTypeConstants", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "Lvz/b0;", "receiveCommand", "view", "", "dangerouslyGetFullCardDetails", "setDangerouslyGetFullCardDetails", "postalCodeEnabled", "setPostalCodeEnabled", "autofocus", "setAutofocus", "Lcom/facebook/react/bridge/ReadableMap;", "cardStyle", "setCardStyle", "countryCode", "setCountryCode", "placeholders", "setPlaceHolders", "Lcom/facebook/react/uimanager/n0;", "reactContext", "createViewInstance", "onDropViewInstance", "reactContextRef", "Lcom/facebook/react/uimanager/n0;", "<init>", "()V", "stripe_stripe-react-native_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class CardFieldViewManager extends SimpleViewManager<k> {
    private com.facebook.react.uimanager.n0 reactContextRef;

    public static /* synthetic */ void setAutofocus$default(CardFieldViewManager cardFieldViewManager, k kVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        cardFieldViewManager.setAutofocus(kVar, z11);
    }

    public static /* synthetic */ void setDangerouslyGetFullCardDetails$default(CardFieldViewManager cardFieldViewManager, k kVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        cardFieldViewManager.setDangerouslyGetFullCardDetails(kVar, z11);
    }

    public static /* synthetic */ void setPostalCodeEnabled$default(CardFieldViewManager cardFieldViewManager, k kVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        cardFieldViewManager.setPostalCodeEnabled(kVar, z11);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> e11 = yf.c.e("topFocusChange", yf.c.d("registrationName", "onFocusChange"), "onCardChange", yf.c.d("registrationName", "onCardChange"));
        kotlin.jvm.internal.s.f(e11, "of(\n      CardFocusEvent…onName\", \"onCardChange\"))");
        return e11;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CardField";
    }

    @ng.a(name = "autofocus")
    public final void setAutofocus(k view, boolean z11) {
        kotlin.jvm.internal.s.g(view, "view");
        view.setAutofocus(z11);
    }

    @ng.a(name = "cardStyle")
    public final void setCardStyle(k view, ReadableMap cardStyle) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(cardStyle, "cardStyle");
        view.setCardStyle(cardStyle);
    }

    @ng.a(name = "countryCode")
    public final void setCountryCode(k view, String str) {
        kotlin.jvm.internal.s.g(view, "view");
        view.setCountryCode(str);
    }

    @ng.a(name = "dangerouslyGetFullCardDetails")
    public final void setDangerouslyGetFullCardDetails(k view, boolean z11) {
        kotlin.jvm.internal.s.g(view, "view");
        view.setDangerouslyGetFullCardDetails(z11);
    }

    @ng.a(name = "placeholders")
    public final void setPlaceHolders(k view, ReadableMap placeholders) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(placeholders, "placeholders");
        view.setPlaceHolders(placeholders);
    }

    @ng.a(name = "postalCodeEnabled")
    public final void setPostalCodeEnabled(k view, boolean z11) {
        kotlin.jvm.internal.s.g(view, "view");
        view.setPostalCodeEnabled(z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public k createViewInstance(com.facebook.react.uimanager.n0 reactContext) {
        kotlin.jvm.internal.s.g(reactContext, "reactContext");
        StripeSdkModule stripeSdkModule = (StripeSdkModule) reactContext.getNativeModule(StripeSdkModule.class);
        k kVar = new k(reactContext);
        this.reactContextRef = reactContext;
        if (stripeSdkModule != null) {
            stripeSdkModule.setCardFieldView(kVar);
        }
        return kVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(k view) {
        kotlin.jvm.internal.s.g(view, "view");
        super.onDropViewInstance((CardFieldViewManager) view);
        com.facebook.react.uimanager.n0 n0Var = this.reactContextRef;
        StripeSdkModule stripeSdkModule = n0Var == null ? null : (StripeSdkModule) n0Var.getNativeModule(StripeSdkModule.class);
        if (stripeSdkModule != null) {
            stripeSdkModule.setCardFieldView(null);
        }
        this.reactContextRef = null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(k root, String str, ReadableArray readableArray) {
        kotlin.jvm.internal.s.g(root, "root");
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode == 3027047) {
                if (str.equals("blur")) {
                    root.p();
                }
            } else if (hashCode == 94746189) {
                if (str.equals("clear")) {
                    root.q();
                }
            } else if (hashCode == 97604824 && str.equals("focus")) {
                root.r();
            }
        }
    }
}