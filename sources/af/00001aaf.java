package com.facebook.react;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.i0;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.t0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class z extends FrameLayout implements i0, com.facebook.react.uimanager.a0 {

    /* renamed from: a  reason: collision with root package name */
    private r f12841a;

    /* renamed from: b  reason: collision with root package name */
    private String f12842b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f12843c;

    /* renamed from: d  reason: collision with root package name */
    private String f12844d;

    /* renamed from: e  reason: collision with root package name */
    private a f12845e;

    /* renamed from: f  reason: collision with root package name */
    private b f12846f;

    /* renamed from: g  reason: collision with root package name */
    private int f12847g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12848h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f12849i;

    /* renamed from: j  reason: collision with root package name */
    private com.facebook.react.uimanager.h f12850j;

    /* renamed from: k  reason: collision with root package name */
    private final n f12851k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f12852l;

    /* renamed from: m  reason: collision with root package name */
    private int f12853m;

    /* renamed from: n  reason: collision with root package name */
    private int f12854n;

    /* renamed from: o  reason: collision with root package name */
    private int f12855o;

    /* renamed from: p  reason: collision with root package name */
    private int f12856p;

    /* renamed from: q  reason: collision with root package name */
    private int f12857q;

    /* renamed from: t  reason: collision with root package name */
    private int f12858t;

    /* renamed from: w  reason: collision with root package name */
    private int f12859w;

    /* renamed from: x  reason: collision with root package name */
    private final AtomicInteger f12860x;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f12861a;

        /* renamed from: b  reason: collision with root package name */
        private final int f12862b;

        /* renamed from: c  reason: collision with root package name */
        private int f12863c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f12864d = 0;

        a() {
            com.facebook.react.uimanager.c.f(z.this.getContext().getApplicationContext());
            this.f12861a = new Rect();
            this.f12862b = (int) com.facebook.react.uimanager.p.c(60.0f);
        }

        private void a() {
            f();
        }

        private void b() {
            int rotation = ((WindowManager) z.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.f12864d == rotation) {
                return;
            }
            this.f12864d = rotation;
            com.facebook.react.uimanager.c.e(z.this.getContext().getApplicationContext());
            e(rotation);
        }

        private void c() {
            int i11;
            z zVar;
            WindowInsets rootWindowInsets;
            DisplayCutout displayCutout;
            z.this.getRootView().getWindowVisibleDisplayFrame(this.f12861a);
            int safeInsetTop = (Build.VERSION.SDK_INT < 28 || (rootWindowInsets = z.this.getRootView().getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) ? 0 : displayCutout.getSafeInsetTop();
            int i12 = (com.facebook.react.uimanager.c.d().heightPixels - this.f12861a.bottom) + safeInsetTop;
            int i13 = this.f12863c;
            boolean z11 = true;
            if (i13 != i12 && i12 > this.f12862b) {
                this.f12863c = i12;
                z.this.q("keyboardDidShow", d(com.facebook.react.uimanager.p.a(i11), com.facebook.react.uimanager.p.a(this.f12861a.left), com.facebook.react.uimanager.p.a(this.f12861a.width()), com.facebook.react.uimanager.p.a(this.f12863c)));
                return;
            }
            if (i13 == 0 || i12 > this.f12862b) {
                z11 = false;
            }
            if (z11) {
                this.f12863c = 0;
                z.this.q("keyboardDidHide", d(com.facebook.react.uimanager.p.a(zVar.f12856p), 0.0d, com.facebook.react.uimanager.p.a(this.f12861a.width()), 0.0d));
            }
        }

        private WritableMap d(double d11, double d12, double d13, double d14) {
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putDouble(Snapshot.HEIGHT, d14);
            createMap2.putDouble("screenX", d12);
            createMap2.putDouble(Snapshot.WIDTH, d13);
            createMap2.putDouble("screenY", d11);
            createMap.putMap("endCoordinates", createMap2);
            createMap.putString("easing", "keyboard");
            createMap.putDouble("duration", 0.0d);
            return createMap;
        }

        private void e(int i11) {
            double d11;
            String str;
            double d12;
            boolean z11 = true;
            if (i11 != 0) {
                if (i11 == 1) {
                    d12 = -90.0d;
                    str = "landscape-primary";
                } else if (i11 == 2) {
                    d11 = 180.0d;
                    str = "portrait-secondary";
                } else if (i11 != 3) {
                    return;
                } else {
                    d12 = 90.0d;
                    str = "landscape-secondary";
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("name", str);
                createMap.putDouble("rotationDegrees", d12);
                createMap.putBoolean("isLandscape", z11);
                z.this.q("namedOrientationDidChange", createMap);
            }
            d11 = 0.0d;
            str = "portrait-primary";
            z11 = false;
            d12 = d11;
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("name", str);
            createMap2.putDouble("rotationDegrees", d12);
            createMap2.putBoolean("isLandscape", z11);
            z.this.q("namedOrientationDidChange", createMap2);
        }

        private void f() {
            DeviceInfoModule deviceInfoModule = (DeviceInfoModule) z.this.f12841a.A().getNativeModule(DeviceInfoModule.class);
            if (deviceInfoModule != null) {
                deviceInfoModule.emitUpdateDimensionsEvent();
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (z.this.f12841a == null || !z.this.f12848h || z.this.f12841a.A() == null) {
                return;
            }
            c();
            b();
            a();
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(z zVar);
    }

    public z(Context context) {
        super(context);
        this.f12847g = 0;
        this.f12851k = new n(this);
        this.f12852l = false;
        this.f12853m = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f12854n = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f12855o = 0;
        this.f12856p = 0;
        this.f12857q = Integer.MIN_VALUE;
        this.f12858t = Integer.MIN_VALUE;
        this.f12859w = 1;
        this.f12860x = new AtomicInteger(0);
        k();
    }

    private a getCustomGlobalLayoutListener() {
        if (this.f12845e == null) {
            this.f12845e = new a();
        }
        return this.f12845e;
    }

    private void i() {
        com.facebook.systrace.a.c(0L, "attachToReactInstanceManager");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_START);
        if (getId() != -1) {
            ReactSoftExceptionLogger.logSoftException("ReactRootView", new IllegalViewOperationException("Trying to attach a ReactRootView with an explicit id already set to [" + getId() + "]. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID."));
        }
        try {
            if (this.f12848h) {
                return;
            }
            this.f12848h = true;
            ((r) wf.a.c(this.f12841a)).p(this);
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_END);
            com.facebook.systrace.a.g(0L);
        }
    }

    private void j(MotionEvent motionEvent) {
        r rVar = this.f12841a;
        if (rVar != null && this.f12848h && rVar.A() != null) {
            if (this.f12850j == null) {
                nd.a.G("ReactRootView", "Unable to dispatch touch to JS before the dispatcher is available");
                return;
            }
            UIManager g11 = t0.g(this.f12841a.A(), getUIManagerType());
            if (g11 != null) {
                this.f12850j.c(motionEvent, (com.facebook.react.uimanager.events.d) g11.getEventDispatcher());
                return;
            }
            return;
        }
        nd.a.G("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
    }

    private void k() {
        setClipChildren(false);
    }

    private boolean l() {
        r rVar = this.f12841a;
        if (rVar != null && this.f12848h && rVar.A() != null) {
            if (this.f12850j == null) {
                nd.a.G("ReactRootView", "Unable to dispatch touch to JS before the dispatcher is available");
                return false;
            }
            return true;
        }
        nd.a.G("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        return false;
    }

    private boolean m() {
        return getUIManagerType() == 2;
    }

    private boolean n() {
        int i11 = this.f12847g;
        return (i11 == 0 || i11 == -1) ? false : true;
    }

    private void p() {
        getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    }

    private void r() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.f12853m = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE);
        this.f12854n = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE);
    }

    private void v(boolean z11, int i11, int i12) {
        UIManager g11;
        int i13;
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_START);
        if (this.f12841a == null) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            nd.a.G("ReactRootView", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        boolean m11 = m();
        if (m11 && !n()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            nd.a.j("ReactRootView", "Unable to update root layout specs for ReactRootView: no rootViewTag set yet");
            return;
        }
        ReactContext A = this.f12841a.A();
        if (A != null && (g11 = t0.g(A, getUIManagerType())) != null) {
            int i14 = 0;
            if (m11) {
                Point b11 = j0.b(this);
                i14 = b11.x;
                i13 = b11.y;
            } else {
                i13 = 0;
            }
            if (z11 || i14 != this.f12857q || i13 != this.f12858t) {
                g11.updateRootLayoutSpecs(getRootViewTag(), i11, i12, i14, i13);
            }
            this.f12857q = i14;
            this.f12858t = i13;
        }
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
    }

    @Override // com.facebook.react.uimanager.i0
    public void a(Throwable th2) {
        r rVar = this.f12841a;
        if (rVar != null && rVar.A() != null) {
            this.f12841a.A().handleException(new IllegalViewOperationException(th2.getMessage(), this, th2));
            return;
        }
        throw new RuntimeException(th2);
    }

    @Override // com.facebook.react.uimanager.i0
    public void b(View view, MotionEvent motionEvent) {
        e(motionEvent);
    }

    @Override // com.facebook.react.uimanager.a0
    public void c(int i11) {
        if (i11 != 101) {
            return;
        }
        o();
    }

    @Override // com.facebook.react.uimanager.a0
    public void d() {
        com.facebook.systrace.a.c(0L, "ReactRootView.runApplication");
        try {
            r rVar = this.f12841a;
            if (rVar != null && this.f12848h) {
                ReactContext A = rVar.A();
                if (A == null) {
                    return;
                }
                CatalystInstance catalystInstance = A.getCatalystInstance();
                String jSModuleName = getJSModuleName();
                if (this.f12852l) {
                    v(true, this.f12853m, this.f12854n);
                }
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("rootTag", getRootViewTag());
                Bundle appProperties = getAppProperties();
                if (appProperties != null) {
                    writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                }
                this.f12849i = true;
                ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(jSModuleName, writableNativeMap);
            }
        } finally {
            com.facebook.systrace.a.g(0L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e11) {
            a(e11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        r rVar = this.f12841a;
        if (rVar != null && this.f12848h && rVar.A() != null) {
            this.f12851k.d(keyEvent);
            return super.dispatchKeyEvent(keyEvent);
        }
        nd.a.G("ReactRootView", "Unable to handle key event as the catalyst instance has not been attached");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.facebook.react.uimanager.i0
    public void e(MotionEvent motionEvent) {
        UIManager g11;
        if (l() && (g11 = t0.g(this.f12841a.A(), getUIManagerType())) != null) {
            this.f12850j.d(motionEvent, (com.facebook.react.uimanager.events.d) g11.getEventDispatcher());
        }
    }

    protected void finalize() {
        super.finalize();
        wf.a.b(!this.f12848h, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    @Override // com.facebook.react.uimanager.a0
    public Bundle getAppProperties() {
        return this.f12843c;
    }

    @Override // com.facebook.react.uimanager.a0
    public int getHeightMeasureSpec() {
        return this.f12854n;
    }

    @Override // com.facebook.react.uimanager.a0
    public String getInitialUITemplate() {
        return this.f12844d;
    }

    @Override // com.facebook.react.uimanager.a0
    public String getJSModuleName() {
        return (String) wf.a.c(this.f12842b);
    }

    public r getReactInstanceManager() {
        return this.f12841a;
    }

    @Override // com.facebook.react.uimanager.a0
    public ViewGroup getRootViewGroup() {
        return this;
    }

    @Override // com.facebook.react.uimanager.a0
    public int getRootViewTag() {
        return this.f12847g;
    }

    @Override // com.facebook.react.uimanager.a0
    public AtomicInteger getState() {
        return this.f12860x;
    }

    @Override // com.facebook.react.uimanager.a0
    public String getSurfaceID() {
        Bundle appProperties = getAppProperties();
        if (appProperties != null) {
            return appProperties.getString("surfaceID");
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.a0
    public int getUIManagerType() {
        return this.f12859w;
    }

    @Override // com.facebook.react.uimanager.a0
    public int getWidthMeasureSpec() {
        return this.f12853m;
    }

    public void o() {
        this.f12850j = new com.facebook.react.uimanager.h(this);
        b bVar = this.f12846f;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12848h) {
            p();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f12848h) {
            p();
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z11, int i11, Rect rect) {
        r rVar = this.f12841a;
        if (rVar != null && this.f12848h && rVar.A() != null) {
            this.f12851k.a();
            super.onFocusChanged(z11, i11, rect);
            return;
        }
        nd.a.G("ReactRootView", "Unable to handle focus changed event as the catalyst instance has not been attached");
        super.onFocusChanged(z11, i11, rect);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        j(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.f12852l && m()) {
            v(false, this.f12853m, this.f12854n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[Catch: all -> 0x00b6, LOOP:1: B:16:0x0030->B:18:0x0036, LOOP_END, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x000c, B:5:0x0012, B:10:0x001a, B:14:0x0029, B:19:0x0054, B:23:0x005d, B:28:0x0087, B:30:0x0090, B:32:0x0094, B:39:0x00a9, B:34:0x009a, B:36:0x009e, B:38:0x00a2, B:25:0x0063, B:27:0x0069, B:16:0x0030, B:18:0x0036), top: B:45:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[Catch: all -> 0x00b6, LOOP:0: B:25:0x0063->B:27:0x0069, LOOP_END, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x000c, B:5:0x0012, B:10:0x001a, B:14:0x0029, B:19:0x0054, B:23:0x005d, B:28:0x0087, B:30:0x0090, B:32:0x0094, B:39:0x00a9, B:34:0x009a, B:36:0x009e, B:38:0x00a2, B:25:0x0063, B:27:0x0069, B:16:0x0030, B:18:0x0036), top: B:45:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x000c, B:5:0x0012, B:10:0x001a, B:14:0x0029, B:19:0x0054, B:23:0x005d, B:28:0x0087, B:30:0x0090, B:32:0x0094, B:39:0x00a9, B:34:0x009a, B:36:0x009e, B:38:0x00a2, B:25:0x0063, B:27:0x0069, B:16:0x0030, B:18:0x0036), top: B:45:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x000c, B:5:0x0012, B:10:0x001a, B:14:0x0029, B:19:0x0054, B:23:0x005d, B:28:0x0087, B:30:0x0090, B:32:0x0094, B:39:0x00a9, B:34:0x009a, B:36:0x009e, B:38:0x00a2, B:25:0x0063, B:27:0x0069, B:16:0x0030, B:18:0x0036), top: B:45:0x000c }] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r2 = "ReactRootView.onMeasure"
            com.facebook.systrace.a.c(r0, r2)
            com.facebook.react.bridge.ReactMarkerConstants r2 = com.facebook.react.bridge.ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_START
            com.facebook.react.bridge.ReactMarker.logMarker(r2)
            int r2 = r10.f12853m     // Catch: java.lang.Throwable -> Lb6
            r3 = 0
            r4 = 1
            if (r11 != r2) goto L19
            int r2 = r10.f12854n     // Catch: java.lang.Throwable -> Lb6
            if (r12 == r2) goto L17
            goto L19
        L17:
            r2 = r3
            goto L1a
        L19:
            r2 = r4
        L1a:
            r10.f12853m = r11     // Catch: java.lang.Throwable -> Lb6
            r10.f12854n = r12     // Catch: java.lang.Throwable -> Lb6
            int r5 = android.view.View.MeasureSpec.getMode(r11)     // Catch: java.lang.Throwable -> Lb6
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L2e
            if (r5 != 0) goto L29
            goto L2e
        L29:
            int r11 = android.view.View.MeasureSpec.getSize(r11)     // Catch: java.lang.Throwable -> Lb6
            goto L54
        L2e:
            r11 = r3
            r5 = r11
        L30:
            int r7 = r10.getChildCount()     // Catch: java.lang.Throwable -> Lb6
            if (r5 >= r7) goto L54
            android.view.View r7 = r10.getChildAt(r5)     // Catch: java.lang.Throwable -> Lb6
            int r8 = r7.getLeft()     // Catch: java.lang.Throwable -> Lb6
            int r9 = r7.getMeasuredWidth()     // Catch: java.lang.Throwable -> Lb6
            int r8 = r8 + r9
            int r9 = r7.getPaddingLeft()     // Catch: java.lang.Throwable -> Lb6
            int r8 = r8 + r9
            int r7 = r7.getPaddingRight()     // Catch: java.lang.Throwable -> Lb6
            int r8 = r8 + r7
            int r11 = java.lang.Math.max(r11, r8)     // Catch: java.lang.Throwable -> Lb6
            int r5 = r5 + 1
            goto L30
        L54:
            int r5 = android.view.View.MeasureSpec.getMode(r12)     // Catch: java.lang.Throwable -> Lb6
            if (r5 == r6) goto L62
            if (r5 != 0) goto L5d
            goto L62
        L5d:
            int r12 = android.view.View.MeasureSpec.getSize(r12)     // Catch: java.lang.Throwable -> Lb6
            goto L87
        L62:
            r12 = r3
        L63:
            int r5 = r10.getChildCount()     // Catch: java.lang.Throwable -> Lb6
            if (r3 >= r5) goto L87
            android.view.View r5 = r10.getChildAt(r3)     // Catch: java.lang.Throwable -> Lb6
            int r6 = r5.getTop()     // Catch: java.lang.Throwable -> Lb6
            int r7 = r5.getMeasuredHeight()     // Catch: java.lang.Throwable -> Lb6
            int r6 = r6 + r7
            int r7 = r5.getPaddingTop()     // Catch: java.lang.Throwable -> Lb6
            int r6 = r6 + r7
            int r5 = r5.getPaddingBottom()     // Catch: java.lang.Throwable -> Lb6
            int r6 = r6 + r5
            int r12 = java.lang.Math.max(r12, r6)     // Catch: java.lang.Throwable -> Lb6
            int r3 = r3 + 1
            goto L63
        L87:
            r10.setMeasuredDimension(r11, r12)     // Catch: java.lang.Throwable -> Lb6
            r10.f12852l = r4     // Catch: java.lang.Throwable -> Lb6
            com.facebook.react.r r3 = r10.f12841a     // Catch: java.lang.Throwable -> Lb6
            if (r3 == 0) goto L98
            boolean r3 = r10.f12848h     // Catch: java.lang.Throwable -> Lb6
            if (r3 != 0) goto L98
            r10.i()     // Catch: java.lang.Throwable -> Lb6
            goto La9
        L98:
            if (r2 != 0) goto La2
            int r2 = r10.f12855o     // Catch: java.lang.Throwable -> Lb6
            if (r2 != r11) goto La2
            int r2 = r10.f12856p     // Catch: java.lang.Throwable -> Lb6
            if (r2 == r12) goto La9
        La2:
            int r2 = r10.f12853m     // Catch: java.lang.Throwable -> Lb6
            int r3 = r10.f12854n     // Catch: java.lang.Throwable -> Lb6
            r10.v(r4, r2, r3)     // Catch: java.lang.Throwable -> Lb6
        La9:
            r10.f12855o = r11     // Catch: java.lang.Throwable -> Lb6
            r10.f12856p = r12     // Catch: java.lang.Throwable -> Lb6
            com.facebook.react.bridge.ReactMarkerConstants r11 = com.facebook.react.bridge.ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END
            com.facebook.react.bridge.ReactMarker.logMarker(r11)
            com.facebook.systrace.a.g(r0)
            return
        Lb6:
            r11 = move-exception
            com.facebook.react.bridge.ReactMarkerConstants r12 = com.facebook.react.bridge.ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END
            com.facebook.react.bridge.ReactMarker.logMarker(r12)
            com.facebook.systrace.a.g(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.z.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        j(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.f12849i) {
            this.f12849i = false;
            String str = this.f12842b;
            if (str != null) {
                ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, str, this.f12847g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(String str, WritableMap writableMap) {
        r rVar = this.f12841a;
        if (rVar != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) rVar.A().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        r rVar = this.f12841a;
        if (rVar != null && this.f12848h && rVar.A() != null) {
            this.f12851k.e(view2);
            super.requestChildFocus(view, view2);
            return;
        }
        nd.a.G("ReactRootView", "Unable to handle child focus changed event as the catalyst instance has not been attached");
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z11);
        }
    }

    public void s(r rVar, String str, Bundle bundle) {
        t(rVar, str, bundle, null);
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.f12843c = bundle;
        if (n()) {
            d();
        }
    }

    public void setEventListener(b bVar) {
        this.f12846f = bVar;
    }

    public void setIsFabric(boolean z11) {
        this.f12859w = z11 ? 2 : 1;
    }

    @Override // com.facebook.react.uimanager.a0
    public void setRootViewTag(int i11) {
        this.f12847g = i11;
    }

    @Override // com.facebook.react.uimanager.a0
    public void setShouldLogContentAppeared(boolean z11) {
        this.f12849i = z11;
    }

    public void t(r rVar, String str, Bundle bundle, String str2) {
        com.facebook.systrace.a.c(0L, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            wf.a.b(this.f12841a == null, "This root view has already been attached to a catalyst instance manager");
            this.f12841a = rVar;
            this.f12842b = str;
            this.f12843c = bundle;
            this.f12844d = str2;
            rVar.v();
            if (ReactFeatureFlags.enableEagerRootViewAttachment) {
                if (!this.f12852l) {
                    r();
                }
                i();
            }
        } finally {
            com.facebook.systrace.a.g(0L);
        }
    }

    public void u() {
        ReactContext A;
        UIManager g11;
        UiThreadUtil.assertOnUiThread();
        r rVar = this.f12841a;
        if (rVar != null && (A = rVar.A()) != null && m() && (g11 = t0.g(A, getUIManagerType())) != null) {
            int id2 = getId();
            setId(-1);
            removeAllViews();
            if (id2 == -1) {
                ReactSoftExceptionLogger.logSoftException("ReactRootView", new RuntimeException("unmountReactApplication called on ReactRootView with invalid id"));
            } else {
                g11.stopSurface(id2);
            }
        }
        r rVar2 = this.f12841a;
        if (rVar2 != null && this.f12848h) {
            rVar2.y(this);
            this.f12848h = false;
        }
        this.f12841a = null;
        this.f12849i = false;
    }
}