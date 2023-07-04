package com.reactnativestripesdk;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J$\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007J\u001a\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u000fH\u0007J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u001a\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u000fH\u0007J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0014H\u0007J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0014H\u0007J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0014J\u0010\u0010 \u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0018\u0010!\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/reactnativestripesdk/CardFormViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/reactnativestripesdk/v;", "", "getName", "", "", "getExportedCustomDirectEventTypeConstants", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "Lvz/b0;", "receiveCommand", "view", "", "dangerouslyGetFullCardDetails", "setDangerouslyGetFullCardDetails", "postalCodeEnabled", "setPostalCodeEnabled", "Lcom/facebook/react/bridge/ReadableMap;", "placeholders", "setPlaceHolders", "autofocus", "setAutofocus", "cardStyle", "setCardStyle", "defaults", "setDefaultValues", "Lcom/facebook/react/uimanager/n0;", "reactContext", "createViewInstance", "onDropViewInstance", "reactContextRef", "Lcom/facebook/react/uimanager/n0;", "<init>", "()V", "stripe_stripe-react-native_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class CardFormViewManager extends SimpleViewManager<v> {
    private com.facebook.react.uimanager.n0 reactContextRef;

    public static /* synthetic */ void setAutofocus$default(CardFormViewManager cardFormViewManager, v vVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        cardFormViewManager.setAutofocus(vVar, z11);
    }

    public static /* synthetic */ void setDangerouslyGetFullCardDetails$default(CardFormViewManager cardFormViewManager, v vVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        cardFormViewManager.setDangerouslyGetFullCardDetails(vVar, z11);
    }

    public static /* synthetic */ void setPostalCodeEnabled$default(CardFormViewManager cardFormViewManager, v vVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        cardFormViewManager.setPostalCodeEnabled(vVar, z11);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> e11 = yf.c.e("topFocusChange", yf.c.d("registrationName", "onFocusChange"), "onFormComplete", yf.c.d("registrationName", "onFormComplete"));
        kotlin.jvm.internal.s.f(e11, "of(\n      CardFocusEvent…Name\", \"onFormComplete\"))");
        return e11;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CardForm";
    }

    @ng.a(name = "autofocus")
    public final void setAutofocus(v view, boolean z11) {
        kotlin.jvm.internal.s.g(view, "view");
        view.setAutofocus(z11);
    }

    @ng.a(name = "cardStyle")
    public final void setCardStyle(v view, ReadableMap cardStyle) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(cardStyle, "cardStyle");
        view.setCardStyle(cardStyle);
    }

    @ng.a(name = "dangerouslyGetFullCardDetails")
    public final void setDangerouslyGetFullCardDetails(v view, boolean z11) {
        kotlin.jvm.internal.s.g(view, "view");
        view.setDangerouslyGetFullCardDetails(z11);
    }

    @ng.a(name = "defaultValues")
    public final void setDefaultValues(v view, ReadableMap defaults) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(defaults, "defaults");
        view.setDefaultValues(defaults);
    }

    @ng.a(name = "placeholders")
    public final void setPlaceHolders(v view, ReadableMap placeholders) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(placeholders, "placeholders");
        view.setPlaceHolders(placeholders);
    }

    @ng.a(name = "postalCodeEnabled")
    public final void setPostalCodeEnabled(v view, boolean z11) {
        kotlin.jvm.internal.s.g(view, "view");
        view.setPostalCodeEnabled(z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public v createViewInstance(com.facebook.react.uimanager.n0 reactContext) {
        kotlin.jvm.internal.s.g(reactContext, "reactContext");
        StripeSdkModule stripeSdkModule = (StripeSdkModule) reactContext.getNativeModule(StripeSdkModule.class);
        v vVar = new v(reactContext);
        this.reactContextRef = reactContext;
        if (stripeSdkModule != null) {
            stripeSdkModule.setCardFormView(vVar);
        }
        return vVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(v view) {
        kotlin.jvm.internal.s.g(view, "view");
        super.onDropViewInstance((CardFormViewManager) view);
        com.facebook.react.uimanager.n0 n0Var = this.reactContextRef;
        StripeSdkModule stripeSdkModule = n0Var == null ? null : (StripeSdkModule) n0Var.getNativeModule(StripeSdkModule.class);
        if (stripeSdkModule != null) {
            stripeSdkModule.setCardFormView(null);
        }
        this.reactContextRef = null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(v root, String str, ReadableArray readableArray) {
        kotlin.jvm.internal.s.g(root, "root");
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode == 3027047) {
                if (str.equals("blur")) {
                    root.n();
                }
            } else if (hashCode == 94746189) {
                if (str.equals("clear")) {
                    root.o();
                }
            } else if (hashCode == 97604824 && str.equals("focus")) {
                root.p();
            }
        }
    }
}