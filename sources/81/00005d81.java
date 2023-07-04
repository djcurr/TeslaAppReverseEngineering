package com.swmansion.gesturehandler.react;

import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;
import wz.s0;

@fg.a(name = RNGestureHandlerRootViewManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016J \u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b0\u000bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/gesturehandler/react/m;", "", "getName", "Lcom/facebook/react/uimanager/n0;", "reactContext", "createViewInstance", "view", "Lvz/b0;", "onDropViewInstance", "", "getExportedCustomDirectEventTypeConstants", "<init>", "()V", "Companion", "a", "react-native-gesture-handler_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class RNGestureHandlerRootViewManager extends ViewGroupManager<m> {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "GestureHandlerRootView";

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        Map n11;
        Map n12;
        Map<String, Map<String, String>> n13;
        n11 = s0.n(v.a("registrationName", "onGestureHandlerEvent"));
        n12 = s0.n(v.a("registrationName", "onGestureHandlerStateChange"));
        n13 = s0.n(v.a("onGestureHandlerEvent", n11), v.a("onGestureHandlerStateChange", n12));
        return n13;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public m createViewInstance(n0 reactContext) {
        s.g(reactContext, "reactContext");
        return new m(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(m view) {
        s.g(view, "view");
        view.c();
    }
}