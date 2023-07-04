package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.TextView;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class d extends ViewGroup {

    /* renamed from: o  reason: collision with root package name */
    private static final View.OnAttachStateChangeListener f21222o;

    /* renamed from: a  reason: collision with root package name */
    private i f21223a;

    /* renamed from: b  reason: collision with root package name */
    private com.swmansion.rnscreens.f<?> f21224b;

    /* renamed from: c  reason: collision with root package name */
    private a f21225c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f21226d;

    /* renamed from: e  reason: collision with root package name */
    private f f21227e;

    /* renamed from: f  reason: collision with root package name */
    private EnumC0387d f21228f;

    /* renamed from: g  reason: collision with root package name */
    private e f21229g;

    /* renamed from: h  reason: collision with root package name */
    private Integer f21230h;

    /* renamed from: i  reason: collision with root package name */
    private String f21231i;

    /* renamed from: j  reason: collision with root package name */
    private Boolean f21232j;

    /* renamed from: k  reason: collision with root package name */
    private Boolean f21233k;

    /* renamed from: l  reason: collision with root package name */
    private Integer f21234l;

    /* renamed from: m  reason: collision with root package name */
    private Boolean f21235m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f21236n;

    /* loaded from: classes6.dex */
    public enum a {
        INACTIVE,
        TRANSITIONING_OR_BELOW_TOP,
        ON_TOP
    }

    /* loaded from: classes6.dex */
    public static final class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            kotlin.jvm.internal.s.g(view, "view");
            Object systemService = view.getContext().getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(view, 0);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            kotlin.jvm.internal.s.g(view, "view");
        }
    }

    /* loaded from: classes6.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.swmansion.rnscreens.d$d  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public enum EnumC0387d {
        PUSH,
        POP
    }

    /* loaded from: classes6.dex */
    public enum e {
        DEFAULT,
        NONE,
        FADE,
        SLIDE_FROM_BOTTOM,
        SLIDE_FROM_RIGHT,
        SLIDE_FROM_LEFT,
        FADE_FROM_BOTTOM
    }

    /* loaded from: classes6.dex */
    public enum f {
        PUSH,
        MODAL,
        TRANSPARENT_MODAL
    }

    /* loaded from: classes6.dex */
    public enum g {
        ORIENTATION,
        COLOR,
        STYLE,
        TRANSLUCENT,
        HIDDEN,
        ANIMATED
    }

    /* loaded from: classes6.dex */
    public static final class h extends GuardedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactContext f21237a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f21238b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f21239c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f21240d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ReactContext reactContext, d dVar, int i11, int i12) {
            super(reactContext);
            this.f21237a = reactContext;
            this.f21238b = dVar;
            this.f21239c = i11;
            this.f21240d = i12;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule uIManagerModule = (UIManagerModule) this.f21237a.getNativeModule(UIManagerModule.class);
            if (uIManagerModule == null) {
                return;
            }
            uIManagerModule.updateNodeSize(this.f21238b.getId(), this.f21239c, this.f21240d);
        }
    }

    static {
        new c(null);
        f21222o = new b();
    }

    public d(ReactContext reactContext) {
        super(reactContext);
        this.f21227e = f.PUSH;
        this.f21228f = EnumC0387d.POP;
        this.f21229g = e.DEFAULT;
        this.f21236n = true;
        setLayoutParams(new WindowManager.LayoutParams(2));
    }

    private final boolean a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                View childAt = viewGroup.getChildAt(i11);
                if (childAt instanceof WebView) {
                    return true;
                }
                if ((childAt instanceof ViewGroup) && a((ViewGroup) childAt)) {
                    return true;
                }
                if (i12 >= childCount) {
                    break;
                }
                i11 = i12;
            }
        }
        return false;
    }

    public final Boolean b() {
        return this.f21235m;
    }

    public final Boolean c() {
        return this.f21232j;
    }

    public final Boolean d() {
        return this.f21233k;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        kotlin.jvm.internal.s.g(container, "container");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        kotlin.jvm.internal.s.g(container, "container");
    }

    public final a getActivityState() {
        return this.f21225c;
    }

    public final com.swmansion.rnscreens.f<?> getContainer() {
        return this.f21224b;
    }

    public final i getFragment() {
        return this.f21223a;
    }

    public final o getHeaderConfig() {
        View childAt = getChildAt(0);
        if (childAt instanceof o) {
            return (o) childAt;
        }
        return null;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.f21236n;
    }

    public final EnumC0387d getReplaceAnimation() {
        return this.f21228f;
    }

    public final Integer getScreenOrientation() {
        return this.f21230h;
    }

    public final e getStackAnimation() {
        return this.f21229g;
    }

    public final f getStackPresentation() {
        return this.f21227e;
    }

    public final Integer getStatusBarColor() {
        return this.f21234l;
    }

    public final String getStatusBarStyle() {
        return this.f21231i;
    }

    @Override // android.view.View
    protected void onAnimationEnd() {
        super.onAnimationEnd();
        i iVar = this.f21223a;
        if (iVar == null) {
            return;
        }
        iVar.o();
    }

    @Override // android.view.View
    protected void onAnimationStart() {
        super.onAnimationStart();
        i iVar = this.f21223a;
        if (iVar == null) {
            return;
        }
        iVar.q();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        View focusedChild;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT < 21 || (focusedChild = getFocusedChild()) == null) {
            return;
        }
        while (focusedChild instanceof ViewGroup) {
            focusedChild = ((ViewGroup) focusedChild).getFocusedChild();
        }
        if ((focusedChild instanceof TextView) && ((TextView) focusedChild).getShowSoftInputOnFocus()) {
            focusedChild.addOnAttachStateChangeListener(f21222o);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (z11) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            ReactContext reactContext = (ReactContext) context;
            reactContext.runOnNativeModulesQueueThread(new h(reactContext, this, i13 - i11, i14 - i12));
        }
    }

    public final void setActivityState(a activityState) {
        kotlin.jvm.internal.s.g(activityState, "activityState");
        if (activityState == this.f21225c) {
            return;
        }
        this.f21225c = activityState;
        com.swmansion.rnscreens.f<?> fVar = this.f21224b;
        if (fVar == null) {
            return;
        }
        fVar.l();
    }

    public final void setContainer(com.swmansion.rnscreens.f<?> fVar) {
        this.f21224b = fVar;
    }

    public final void setFragment(i iVar) {
        this.f21223a = iVar;
    }

    public final void setGestureEnabled(boolean z11) {
    }

    @Override // android.view.View
    public void setLayerType(int i11, Paint paint) {
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z11) {
        this.f21236n = z11;
    }

    public final void setReplaceAnimation(EnumC0387d enumC0387d) {
        kotlin.jvm.internal.s.g(enumC0387d, "<set-?>");
        this.f21228f = enumC0387d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void setScreenOrientation(String str) {
        int i11;
        if (str == null) {
            this.f21230h = null;
            return;
        }
        s sVar = s.f21312a;
        sVar.c();
        switch (str.hashCode()) {
            case -1894896954:
                if (str.equals("portrait_down")) {
                    i11 = 9;
                    break;
                }
                i11 = -1;
                break;
            case 96673:
                if (str.equals("all")) {
                    i11 = 10;
                    break;
                }
                i11 = -1;
                break;
            case 729267099:
                if (str.equals("portrait")) {
                    i11 = 7;
                    break;
                }
                i11 = -1;
                break;
            case 1430647483:
                if (str.equals("landscape")) {
                    i11 = 6;
                    break;
                }
                i11 = -1;
                break;
            case 1651658175:
                if (str.equals("portrait_up")) {
                    i11 = 1;
                    break;
                }
                i11 = -1;
                break;
            case 1730732811:
                if (str.equals("landscape_left")) {
                    i11 = 8;
                    break;
                }
                i11 = -1;
                break;
            case 2118770584:
                if (str.equals("landscape_right")) {
                    i11 = 0;
                    break;
                }
                i11 = -1;
                break;
            default:
                i11 = -1;
                break;
        }
        this.f21230h = i11;
        i iVar = this.f21223a;
        if (iVar == null) {
            return;
        }
        sVar.l(this, iVar.v());
    }

    public final void setStackAnimation(e eVar) {
        kotlin.jvm.internal.s.g(eVar, "<set-?>");
        this.f21229g = eVar;
    }

    public final void setStackPresentation(f fVar) {
        kotlin.jvm.internal.s.g(fVar, "<set-?>");
        this.f21227e = fVar;
    }

    public final void setStatusBarAnimated(Boolean bool) {
        this.f21235m = bool;
    }

    public final void setStatusBarColor(Integer num) {
        if (num != null) {
            s.f21312a.d();
        }
        this.f21234l = num;
        i iVar = this.f21223a;
        if (iVar == null) {
            return;
        }
        s.f21312a.i(this, iVar.v(), iVar.w());
    }

    public final void setStatusBarHidden(Boolean bool) {
        if (bool != null) {
            s.f21312a.d();
        }
        this.f21232j = bool;
        i iVar = this.f21223a;
        if (iVar == null) {
            return;
        }
        s.f21312a.k(this, iVar.v());
    }

    public final void setStatusBarStyle(String str) {
        if (str != null) {
            s.f21312a.d();
        }
        this.f21231i = str;
        i iVar = this.f21223a;
        if (iVar == null) {
            return;
        }
        s.f21312a.n(this, iVar.v(), iVar.w());
    }

    public final void setStatusBarTranslucent(Boolean bool) {
        if (bool != null) {
            s.f21312a.d();
        }
        this.f21233k = bool;
        i iVar = this.f21223a;
        if (iVar == null) {
            return;
        }
        s.f21312a.o(this, iVar.v(), iVar.w());
    }

    public final void setTransitioning(boolean z11) {
        if (this.f21226d == z11) {
            return;
        }
        this.f21226d = z11;
        boolean a11 = a(this);
        int i11 = 2;
        if (!a11 || getLayerType() == 2) {
            super.setLayerType((!z11 || a11) ? 0 : 0, null);
        }
    }
}