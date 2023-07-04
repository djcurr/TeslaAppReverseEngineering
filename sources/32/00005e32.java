package com.swmansion.rnscreens;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import com.swmansion.rnscreens.d;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@fg.a(name = ScreenViewManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0007J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0007J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u001a\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0007J\u001a\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0007J\u001a\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u0007J!\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u001b\u0010\rJ\u001a\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0007J!\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\"\u0010 J\u0018\u0010$\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0012H\u0007J\u0014\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&0%H\u0016¨\u0006,"}, d2 = {"Lcom/swmansion/rnscreens/ScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/d;", "", "getName", "Lcom/facebook/react/uimanager/n0;", "reactContext", "createViewInstance", "view", "", "activityState", "Lvz/b0;", "setActivityState", "(Lcom/swmansion/rnscreens/d;Ljava/lang/Integer;)V", "presentation", "setStackPresentation", "animation", "setStackAnimation", "", "gestureEnabled", "setGestureEnabled", "setReplaceAnimation", "screenOrientation", "setScreenOrientation", "statusBarAnimation", "setStatusBarAnimation", "statusBarColor", "setStatusBarColor", "statusBarStyle", "setStatusBarStyle", "statusBarTranslucent", "setStatusBarTranslucent", "(Lcom/swmansion/rnscreens/d;Ljava/lang/Boolean;)V", "statusBarHidden", "setStatusBarHidden", "nativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", "", "", "getExportedCustomDirectEventTypeConstants", "<init>", "()V", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ScreenViewManager extends ViewGroupManager<d> {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "RNSScreen";

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> i11 = yf.c.i("topDismissed", yf.c.d("registrationName", "onDismissed"), "topWillAppear", yf.c.d("registrationName", "onWillAppear"), "topAppear", yf.c.d("registrationName", "onAppear"), "topWillDisappear", yf.c.d("registrationName", "onWillDisappear"), "topDisappear", yf.c.d("registrationName", "onDisappear"), "topFinishTransitioning", yf.c.d("registrationName", "onFinishTransitioning"), "topTransitionProgress", yf.c.d("registrationName", "onTransitionProgress"));
        kotlin.jvm.internal.s.f(i11, "of(\n            ScreenDi…itionProgress\")\n        )");
        Map d11 = yf.c.d("registrationName", "onHeaderBackButtonClicked");
        kotlin.jvm.internal.s.f(d11, "of(\"registrationName\", \"…HeaderBackButtonClicked\")");
        i11.put("topHeaderBackButtonClickedEvent", d11);
        return i11;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ng.a(name = "activityState")
    public final void setActivityState(d view, Integer num) {
        kotlin.jvm.internal.s.g(view, "view");
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            view.setActivityState(d.a.INACTIVE);
        } else if (intValue == 1) {
            view.setActivityState(d.a.TRANSITIONING_OR_BELOW_TOP);
        } else if (intValue != 2) {
        } else {
            view.setActivityState(d.a.ON_TOP);
        }
    }

    @ng.a(defaultBoolean = true, name = "gestureEnabled")
    public final void setGestureEnabled(d view, boolean z11) {
        kotlin.jvm.internal.s.g(view, "view");
        view.setGestureEnabled(z11);
    }

    @ng.a(name = "nativeBackButtonDismissalEnabled")
    public final void setNativeBackButtonDismissalEnabled(d view, boolean z11) {
        kotlin.jvm.internal.s.g(view, "view");
        view.setNativeBackButtonDismissalEnabled(z11);
    }

    @ng.a(name = "replaceAnimation")
    public final void setReplaceAnimation(d view, String str) {
        d.EnumC0387d enumC0387d;
        kotlin.jvm.internal.s.g(view, "view");
        if (str == null ? true : kotlin.jvm.internal.s.c(str, "pop")) {
            enumC0387d = d.EnumC0387d.POP;
        } else if (!kotlin.jvm.internal.s.c(str, "push")) {
            throw new JSApplicationIllegalArgumentException(kotlin.jvm.internal.s.p("Unknown replace animation type ", str));
        } else {
            enumC0387d = d.EnumC0387d.PUSH;
        }
        view.setReplaceAnimation(enumC0387d);
    }

    @ng.a(name = "screenOrientation")
    public final void setScreenOrientation(d view, String str) {
        kotlin.jvm.internal.s.g(view, "view");
        view.setScreenOrientation(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r3.equals("default") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r3.equals("flip") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
        if (r3.equals("simple_push") != false) goto L34;
     */
    @ng.a(name = "stackAnimation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setStackAnimation(com.swmansion.rnscreens.d r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.s.g(r2, r0)
            if (r3 == 0) goto L78
            int r0 = r3.hashCode()
            switch(r0) {
                case -1418955385: goto L63;
                case -427095442: goto L58;
                case -349395819: goto L4d;
                case 3135100: goto L42;
                case 3145837: goto L39;
                case 3387192: goto L2e;
                case 182437661: goto L23;
                case 1544803905: goto L1a;
                case 1601504978: goto Lf;
                default: goto Le;
            }
        Le:
            goto L6c
        Lf:
            java.lang.String r0 = "slide_from_bottom"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L6c
            com.swmansion.rnscreens.d$e r3 = com.swmansion.rnscreens.d.e.SLIDE_FROM_BOTTOM
            goto L7a
        L1a:
            java.lang.String r0 = "default"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L6c
            goto L78
        L23:
            java.lang.String r0 = "fade_from_bottom"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L6c
            com.swmansion.rnscreens.d$e r3 = com.swmansion.rnscreens.d.e.FADE_FROM_BOTTOM
            goto L7a
        L2e:
            java.lang.String r0 = "none"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L6c
            com.swmansion.rnscreens.d$e r3 = com.swmansion.rnscreens.d.e.NONE
            goto L7a
        L39:
            java.lang.String r0 = "flip"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L6c
            goto L78
        L42:
            java.lang.String r0 = "fade"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L6c
            com.swmansion.rnscreens.d$e r3 = com.swmansion.rnscreens.d.e.FADE
            goto L7a
        L4d:
            java.lang.String r0 = "slide_from_right"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L6c
            com.swmansion.rnscreens.d$e r3 = com.swmansion.rnscreens.d.e.SLIDE_FROM_RIGHT
            goto L7a
        L58:
            java.lang.String r0 = "slide_from_left"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L6c
            com.swmansion.rnscreens.d$e r3 = com.swmansion.rnscreens.d.e.SLIDE_FROM_LEFT
            goto L7a
        L63:
            java.lang.String r0 = "simple_push"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L6c
            goto L78
        L6c:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r0 = "Unknown animation type "
            java.lang.String r3 = kotlin.jvm.internal.s.p(r0, r3)
            r2.<init>(r3)
            throw r2
        L78:
            com.swmansion.rnscreens.d$e r3 = com.swmansion.rnscreens.d.e.DEFAULT
        L7a:
            r2.setStackAnimation(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackAnimation(com.swmansion.rnscreens.d, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r3.equals("containedTransparentModal") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r3.equals("containedModal") != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r3.equals("modal") != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
        r3 = com.swmansion.rnscreens.d.f.MODAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        if (r3.equals("transparentModal") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
        r3 = com.swmansion.rnscreens.d.f.TRANSPARENT_MODAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r3.equals("formSheet") != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r3.equals("fullScreenModal") != false) goto L5;
     */
    @ng.a(name = "stackPresentation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setStackPresentation(com.swmansion.rnscreens.d r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.s.g(r2, r0)
            java.lang.String r0 = "presentation"
            kotlin.jvm.internal.s.g(r3, r0)
            int r0 = r3.hashCode()
            switch(r0) {
                case -76271493: goto L4c;
                case 3452698: goto L41;
                case 104069805: goto L36;
                case 438078970: goto L2d;
                case 955284238: goto L24;
                case 1171936146: goto L1b;
                case 1798290171: goto L12;
                default: goto L11;
            }
        L11:
            goto L5a
        L12:
            java.lang.String r0 = "formSheet"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5a
            goto L3e
        L1b:
            java.lang.String r0 = "fullScreenModal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5a
            goto L3e
        L24:
            java.lang.String r0 = "containedTransparentModal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5a
            goto L54
        L2d:
            java.lang.String r0 = "containedModal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5a
            goto L3e
        L36:
            java.lang.String r0 = "modal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5a
        L3e:
            com.swmansion.rnscreens.d$f r3 = com.swmansion.rnscreens.d.f.MODAL
            goto L56
        L41:
            java.lang.String r0 = "push"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5a
            com.swmansion.rnscreens.d$f r3 = com.swmansion.rnscreens.d.f.PUSH
            goto L56
        L4c:
            java.lang.String r0 = "transparentModal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5a
        L54:
            com.swmansion.rnscreens.d$f r3 = com.swmansion.rnscreens.d.f.TRANSPARENT_MODAL
        L56:
            r2.setStackPresentation(r3)
            return
        L5a:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r0 = "Unknown presentation type "
            java.lang.String r3 = kotlin.jvm.internal.s.p(r0, r3)
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackPresentation(com.swmansion.rnscreens.d, java.lang.String):void");
    }

    @ng.a(name = "statusBarAnimation")
    public final void setStatusBarAnimation(d view, String str) {
        kotlin.jvm.internal.s.g(view, "view");
        view.setStatusBarAnimated(Boolean.valueOf((str == null || kotlin.jvm.internal.s.c(PermissionsResponse.SCOPE_NONE, str)) ? false : true));
    }

    @ng.a(name = "statusBarColor")
    public final void setStatusBarColor(d view, Integer num) {
        kotlin.jvm.internal.s.g(view, "view");
        view.setStatusBarColor(num);
    }

    @ng.a(name = "statusBarHidden")
    public final void setStatusBarHidden(d view, Boolean bool) {
        kotlin.jvm.internal.s.g(view, "view");
        view.setStatusBarHidden(bool);
    }

    @ng.a(name = "statusBarStyle")
    public final void setStatusBarStyle(d view, String str) {
        kotlin.jvm.internal.s.g(view, "view");
        view.setStatusBarStyle(str);
    }

    @ng.a(name = "statusBarTranslucent")
    public final void setStatusBarTranslucent(d view, Boolean bool) {
        kotlin.jvm.internal.s.g(view, "view");
        view.setStatusBarTranslucent(bool);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(n0 reactContext) {
        kotlin.jvm.internal.s.g(reactContext, "reactContext");
        return new d(reactContext);
    }
}