package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.i18n.MessageBundle;

@fg.a(name = ScreenStackHeaderConfigViewManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001e\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b7\u00108J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J \u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0002H\u0014J\u001a\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0007J\u001a\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0007J\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0007J\u001a\u0010!\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0003H\u0007J\u0018\u0010#\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u000bH\u0007J!\u0010%\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0015H\u0007J\u0018\u0010*\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0015H\u0007J\u0018\u0010,\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0015H\u0007J\u0018\u0010.\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u000bH\u0007J\u0018\u00100\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0015H\u0007J\u0018\u00102\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0015H\u0007J\u0018\u00104\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0015H\u0007J\u001a\u00106\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010\u0003H\u0007¨\u0006;"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/o;", "", "getName", "Lcom/facebook/react/uimanager/n0;", "reactContext", "createViewInstance", "parent", "Landroid/view/View;", "child", "", "index", "Lvz/b0;", "addView", "view", "onDropViewInstance", "removeAllViews", "removeViewAt", "getChildCount", "getChildAt", "", "needsCustomLayoutForChildren", "onAfterUpdateTransaction", "config", MessageBundle.TITLE_ENTRY, "setTitle", "titleFontFamily", "setTitleFontFamily", "", "titleFontSize", "setTitleFontSize", "titleFontWeight", "setTitleFontWeight", "titleColor", "setTitleColor", "backgroundColor", "setBackgroundColor", "(Lcom/swmansion/rnscreens/o;Ljava/lang/Integer;)V", "hideShadow", "setHideShadow", "hideBackButton", "setHideBackButton", "topInsetEnabled", "setTopInsetEnabled", "color", "setColor", "hidden", "setHidden", "translucent", "setTranslucent", "backButtonInCustomView", "setBackButtonInCustomView", "direction", "setDirection", "<init>", "()V", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ScreenStackHeaderConfigViewManager extends ViewGroupManager<o> {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "RNSScreenStackHeaderConfig";

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

    @ng.a(name = "backButtonInCustomView")
    public final void setBackButtonInCustomView(o config, boolean z11) {
        kotlin.jvm.internal.s.g(config, "config");
        config.setBackButtonInCustomView(z11);
    }

    @ng.a(customType = "Color", name = "backgroundColor")
    public final void setBackgroundColor(o config, Integer num) {
        kotlin.jvm.internal.s.g(config, "config");
        config.setBackgroundColor(num);
    }

    @ng.a(customType = "Color", name = "color")
    public final void setColor(o config, int i11) {
        kotlin.jvm.internal.s.g(config, "config");
        config.setTintColor(i11);
    }

    @ng.a(name = "direction")
    public final void setDirection(o config, String str) {
        kotlin.jvm.internal.s.g(config, "config");
        config.setDirection(str);
    }

    @ng.a(name = "hidden")
    public final void setHidden(o config, boolean z11) {
        kotlin.jvm.internal.s.g(config, "config");
        config.setHidden(z11);
    }

    @ng.a(name = "hideBackButton")
    public final void setHideBackButton(o config, boolean z11) {
        kotlin.jvm.internal.s.g(config, "config");
        config.setHideBackButton(z11);
    }

    @ng.a(name = "hideShadow")
    public final void setHideShadow(o config, boolean z11) {
        kotlin.jvm.internal.s.g(config, "config");
        config.setHideShadow(z11);
    }

    @ng.a(name = MessageBundle.TITLE_ENTRY)
    public final void setTitle(o config, String str) {
        kotlin.jvm.internal.s.g(config, "config");
        config.setTitle(str);
    }

    @ng.a(customType = "Color", name = "titleColor")
    public final void setTitleColor(o config, int i11) {
        kotlin.jvm.internal.s.g(config, "config");
        config.setTitleColor(i11);
    }

    @ng.a(name = "titleFontFamily")
    public final void setTitleFontFamily(o config, String str) {
        kotlin.jvm.internal.s.g(config, "config");
        config.setTitleFontFamily(str);
    }

    @ng.a(name = "titleFontSize")
    public final void setTitleFontSize(o config, float f11) {
        kotlin.jvm.internal.s.g(config, "config");
        config.setTitleFontSize(f11);
    }

    @ng.a(name = "titleFontWeight")
    public final void setTitleFontWeight(o config, String str) {
        kotlin.jvm.internal.s.g(config, "config");
        config.setTitleFontWeight(str);
    }

    @ng.a(name = "topInsetEnabled")
    public final void setTopInsetEnabled(o config, boolean z11) {
        kotlin.jvm.internal.s.g(config, "config");
        config.setTopInsetEnabled(z11);
    }

    @ng.a(name = "translucent")
    public final void setTranslucent(o config, boolean z11) {
        kotlin.jvm.internal.s.g(config, "config");
        config.setTranslucent(z11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(o parent, View child, int i11) {
        kotlin.jvm.internal.s.g(parent, "parent");
        kotlin.jvm.internal.s.g(child, "child");
        if (child instanceof p) {
            parent.b((p) child, i11);
            return;
        }
        throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public o createViewInstance(n0 reactContext) {
        kotlin.jvm.internal.s.g(reactContext, "reactContext");
        return new o(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(o parent, int i11) {
        kotlin.jvm.internal.s.g(parent, "parent");
        return parent.d(i11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(o parent) {
        kotlin.jvm.internal.s.g(parent, "parent");
        return parent.getConfigSubviewsCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(o parent) {
        kotlin.jvm.internal.s.g(parent, "parent");
        super.onAfterUpdateTransaction((ScreenStackHeaderConfigViewManager) parent);
        parent.g();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(o view) {
        kotlin.jvm.internal.s.g(view, "view");
        view.c();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(o parent) {
        kotlin.jvm.internal.s.g(parent, "parent");
        parent.h();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(o parent, int i11) {
        kotlin.jvm.internal.s.g(parent, "parent");
        parent.i(i11);
    }
}