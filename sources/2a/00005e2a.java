package com.swmansion.rnscreens;

import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@fg.a(name = ScreenContainerViewManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J$\u0010\u000f\u001a\u00020\u000e2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010\u0010\u001a\u00020\u000e2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0014\u0010\u0011\u001a\u00020\u000e2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u0014\u0010\u0012\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u001c\u0010\u0013\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016¨\u0006\u001e"}, d2 = {"Lcom/swmansion/rnscreens/ScreenContainerViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/f;", "", "getName", "Lcom/facebook/react/uimanager/n0;", "reactContext", "Lcom/swmansion/rnscreens/i;", "createViewInstance", "parent", "Landroid/view/View;", "child", "", "index", "Lvz/b0;", "addView", "removeViewAt", "removeAllViews", "getChildCount", "getChildAt", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/uimanager/i;", "createShadowNodeInstance", "", "needsCustomLayoutForChildren", "<init>", "()V", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ScreenContainerViewManager extends ViewGroupManager<f<?>> {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "RNSScreenContainer";

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.g
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(f<?> parent, View child, int i11) {
        kotlin.jvm.internal.s.g(parent, "parent");
        kotlin.jvm.internal.s.g(child, "child");
        if (child instanceof d) {
            parent.d((d) child, i11);
            return;
        }
        throw new IllegalArgumentException("Attempt attach child that is not of type RNScreens".toString());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.uimanager.i createShadowNodeInstance(ReactApplicationContext context) {
        kotlin.jvm.internal.s.g(context, "context");
        return new w(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public f<i> createViewInstance(n0 reactContext) {
        kotlin.jvm.internal.s.g(reactContext, "reactContext");
        return new f<>(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(f<?> parent, int i11) {
        kotlin.jvm.internal.s.g(parent, "parent");
        return parent.i(i11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(f<?> parent) {
        kotlin.jvm.internal.s.g(parent, "parent");
        return parent.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(f<?> parent) {
        kotlin.jvm.internal.s.g(parent, "parent");
        parent.s();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(f<?> parent, int i11) {
        kotlin.jvm.internal.s.g(parent, "parent");
        parent.u(i11);
    }
}