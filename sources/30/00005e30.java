package com.swmansion.rnscreens;

import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@fg.a(name = ScreenStackViewManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014J \u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016¨\u0006!"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/k;", "Lcom/swmansion/rnscreens/d;", "screen", "Lvz/b0;", "prepareOutTransition", "Landroid/view/ViewGroup;", "parent", "startTransitionRecursive", "", "getName", "Lcom/facebook/react/uimanager/n0;", "reactContext", "createViewInstance", "Landroid/view/View;", "child", "", "index", "addView", "removeViewAt", "getChildCount", "getChildAt", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/uimanager/i;", "createShadowNodeInstance", "", "needsCustomLayoutForChildren", "<init>", "()V", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ScreenStackViewManager extends ViewGroupManager<k> {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "RNSScreenStack";

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void prepareOutTransition(d dVar) {
        startTransitionRecursive(dVar);
    }

    private final void startTransitionRecursive(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt != null) {
                viewGroup.startViewTransition(childAt);
            }
            if (childAt instanceof o) {
                startTransitionRecursive(((o) childAt).getToolbar());
            }
            if (childAt instanceof ViewGroup) {
                startTransitionRecursive((ViewGroup) childAt);
            }
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
    public void addView(k parent, View child, int i11) {
        kotlin.jvm.internal.s.g(parent, "parent");
        kotlin.jvm.internal.s.g(child, "child");
        if (child instanceof d) {
            parent.d((d) child, i11);
            return;
        }
        throw new IllegalArgumentException("Attempt attach child that is not of type RNScreen".toString());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.uimanager.i createShadowNodeInstance(ReactApplicationContext context) {
        kotlin.jvm.internal.s.g(context, "context");
        return new w(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public k createViewInstance(n0 reactContext) {
        kotlin.jvm.internal.s.g(reactContext, "reactContext");
        return new k(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(k parent, int i11) {
        kotlin.jvm.internal.s.g(parent, "parent");
        return parent.i(i11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(k parent) {
        kotlin.jvm.internal.s.g(parent, "parent");
        return parent.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(k parent, int i11) {
        kotlin.jvm.internal.s.g(parent, "parent");
        prepareOutTransition(parent.i(i11));
        parent.u(i11);
    }
}