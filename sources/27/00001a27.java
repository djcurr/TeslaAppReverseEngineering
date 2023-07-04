package com.facebook.react.views.modal;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.j;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.d;
import com.facebook.react.uimanager.h;
import com.facebook.react.uimanager.i0;
import com.facebook.react.uimanager.p;
import com.facebook.react.views.view.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes3.dex */
public class c extends ViewGroup implements LifecycleEventListener, d.a {

    /* renamed from: a  reason: collision with root package name */
    private b f12553a;

    /* renamed from: b  reason: collision with root package name */
    private Dialog f12554b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12555c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12556d;

    /* renamed from: e  reason: collision with root package name */
    private String f12557e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12558f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12559g;

    /* renamed from: h  reason: collision with root package name */
    private DialogInterface.OnShowListener f12560h;

    /* renamed from: i  reason: collision with root package name */
    private InterfaceC0236c f12561i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements DialogInterface.OnKeyListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 1) {
                if (i11 != 4 && i11 != 111) {
                    Activity currentActivity = ((ReactContext) c.this.getContext()).getCurrentActivity();
                    if (currentActivity != null) {
                        return currentActivity.onKeyUp(i11, keyEvent);
                    }
                    return false;
                }
                wf.a.d(c.this.f12561i, "setOnRequestCloseListener must be called by the manager");
                c.this.f12561i.a(dialogInterface);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b extends g implements i0, d.a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f12563a;

        /* renamed from: b  reason: collision with root package name */
        private int f12564b;

        /* renamed from: c  reason: collision with root package name */
        private int f12565c;

        /* renamed from: d  reason: collision with root package name */
        private com.facebook.react.uimanager.events.d f12566d;

        /* renamed from: e  reason: collision with root package name */
        private final com.facebook.react.uimanager.d f12567e;

        /* renamed from: f  reason: collision with root package name */
        private final h f12568f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a extends GuardedRunnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f12569a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ReactContext reactContext, int i11) {
                super(reactContext);
                this.f12569a = i11;
            }

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                UIManagerModule uIManagerModule = (UIManagerModule) b.this.h().getNativeModule(UIManagerModule.class);
                if (uIManagerModule == null) {
                    return;
                }
                uIManagerModule.updateNodeSize(this.f12569a, b.this.f12564b, b.this.f12565c);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.facebook.react.views.modal.c$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0235b implements d.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ float f12571a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ float f12572b;

            C0235b(b bVar, float f11, float f12) {
                this.f12571a = f11;
                this.f12572b = f12;
            }

            @Override // com.facebook.react.uimanager.d.b
            public WritableMap a() {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("screenWidth", this.f12571a);
                writableNativeMap.putDouble("screenHeight", this.f12572b);
                return writableNativeMap;
            }
        }

        public b(Context context) {
            super(context);
            this.f12563a = false;
            this.f12567e = new com.facebook.react.uimanager.d();
            this.f12568f = new h(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ReactContext h() {
            return (ReactContext) getContext();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(com.facebook.react.uimanager.events.d dVar) {
            this.f12566d = dVar;
        }

        private void j() {
            if (getChildCount() > 0) {
                this.f12563a = false;
                int id2 = getChildAt(0).getId();
                if (this.f12567e.b()) {
                    k(this.f12564b, this.f12565c);
                    return;
                }
                ReactContext h11 = h();
                h11.runOnNativeModulesQueueThread(new a(h11, id2));
                return;
            }
            this.f12563a = true;
        }

        @Override // com.facebook.react.uimanager.i0
        public void a(Throwable th2) {
            h().handleException(new RuntimeException(th2));
        }

        @Override // com.facebook.react.views.view.g, android.view.ViewGroup
        public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
            super.addView(view, i11, layoutParams);
            if (this.f12563a) {
                j();
            }
        }

        @Override // com.facebook.react.uimanager.i0
        public void b(View view, MotionEvent motionEvent) {
            this.f12568f.d(motionEvent, this.f12566d);
        }

        @Override // com.facebook.react.uimanager.i0
        public void e(MotionEvent motionEvent) {
            this.f12568f.d(motionEvent, this.f12566d);
        }

        @Override // com.facebook.react.uimanager.d.a
        public com.facebook.react.uimanager.d getFabricViewStateManager() {
            return this.f12567e;
        }

        public void k(int i11, int i12) {
            float a11 = p.a(i11);
            float a12 = p.a(i12);
            ReadableMap a13 = getFabricViewStateManager().a();
            if (a13 != null) {
                boolean hasKey = a13.hasKey("screenHeight");
                float f11 = BitmapDescriptorFactory.HUE_RED;
                float f12 = hasKey ? (float) a13.getDouble("screenHeight") : 0.0f;
                if (a13.hasKey("screenWidth")) {
                    f11 = (float) a13.getDouble("screenWidth");
                }
                if (Math.abs(f11 - a11) < 0.9f && Math.abs(f12 - a12) < 0.9f) {
                    return;
                }
            }
            this.f12567e.c(new C0235b(this, a11, a12));
        }

        @Override // com.facebook.react.views.view.g, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.f12568f.c(motionEvent, this.f12566d);
            return super.onInterceptTouchEvent(motionEvent);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.views.view.g, android.view.View
        public void onSizeChanged(int i11, int i12, int i13, int i14) {
            super.onSizeChanged(i11, i12, i13, i14);
            this.f12564b = i11;
            this.f12565c = i12;
            j();
        }

        @Override // com.facebook.react.views.view.g, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            this.f12568f.c(motionEvent, this.f12566d);
            super.onTouchEvent(motionEvent);
            return true;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void requestDisallowInterceptTouchEvent(boolean z11) {
        }
    }

    /* renamed from: com.facebook.react.views.modal.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0236c {
        void a(DialogInterface dialogInterface);
    }

    public c(Context context) {
        super(context);
        ((ReactContext) context).addLifecycleEventListener(this);
        this.f12553a = new b(context);
    }

    private void b() {
        Activity activity;
        UiThreadUtil.assertOnUiThread();
        Dialog dialog = this.f12554b;
        if (dialog != null) {
            if (dialog.isShowing() && ((activity = (Activity) tg.a.a(this.f12554b.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                this.f12554b.dismiss();
            }
            this.f12554b = null;
            ((ViewGroup) this.f12553a.getParent()).removeViewAt(0);
        }
    }

    private void e() {
        wf.a.d(this.f12554b, "mDialog must exist when we call updateProperties");
        Activity currentActivity = getCurrentActivity();
        Window window = this.f12554b.getWindow();
        if (currentActivity == null || currentActivity.isFinishing() || !window.isActive()) {
            return;
        }
        if ((currentActivity.getWindow().getAttributes().flags & 1024) != 0) {
            window.addFlags(1024);
        } else {
            window.clearFlags(1024);
        }
        if (this.f12555c) {
            window.clearFlags(2);
            return;
        }
        window.setDimAmount(0.5f);
        window.setFlags(2, 2);
    }

    private View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.f12553a);
        if (this.f12556d) {
            frameLayout.setSystemUiVisibility(1024);
        } else {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private Activity getCurrentActivity() {
        return ((ReactContext) getContext()).getCurrentActivity();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList<View> arrayList) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11) {
        UiThreadUtil.assertOnUiThread();
        this.f12553a.addView(view, i11);
    }

    public void c() {
        ((ReactContext) getContext()).removeLifecycleEventListener(this);
        b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        UiThreadUtil.assertOnUiThread();
        Dialog dialog = this.f12554b;
        if (dialog != null) {
            Context context = (Context) tg.a.a(dialog.getContext(), Activity.class);
            nd.a.j("ReactModalHost", "Updating existing dialog with context: " + context + "@" + context.hashCode());
            if (this.f12559g) {
                b();
            } else {
                e();
                return;
            }
        }
        this.f12559g = false;
        int i11 = j.f11906b;
        if (this.f12557e.equals("fade")) {
            i11 = j.f11907c;
        } else if (this.f12557e.equals("slide")) {
            i11 = j.f11908d;
        }
        Activity currentActivity = getCurrentActivity();
        Context context2 = currentActivity == null ? getContext() : currentActivity;
        Dialog dialog2 = new Dialog(context2, i11);
        this.f12554b = dialog2;
        dialog2.getWindow().setFlags(8, 8);
        nd.a.j("ReactModalHost", "Creating new dialog from context: " + context2 + "@" + context2.hashCode());
        this.f12554b.setContentView(getContentView());
        e();
        this.f12554b.setOnShowListener(this.f12560h);
        this.f12554b.setOnKeyListener(new a());
        this.f12554b.getWindow().setSoftInputMode(16);
        if (this.f12558f) {
            this.f12554b.getWindow().addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        }
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        this.f12554b.show();
        if (context2 instanceof Activity) {
            this.f12554b.getWindow().getDecorView().setSystemUiVisibility(((Activity) context2).getWindow().getDecorView().getSystemUiVisibility());
        }
        this.f12554b.getWindow().clearFlags(8);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        this.f12553a.dispatchProvideStructure(viewStructure);
    }

    public void f(int i11, int i12) {
        this.f12553a.k(i11, i12);
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int i11) {
        return this.f12553a.getChildAt(i11);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.f12553a.getChildCount();
    }

    public Dialog getDialog() {
        return this.f12554b;
    }

    @Override // com.facebook.react.uimanager.d.a
    public com.facebook.react.uimanager.d getFabricViewStateManager() {
        return this.f12553a.getFabricViewStateManager();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        c();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        this.f12553a.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i11) {
        UiThreadUtil.assertOnUiThread();
        this.f12553a.removeView(getChildAt(i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAnimationType(String str) {
        this.f12557e = str;
        this.f12559g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEventDispatcher(com.facebook.react.uimanager.events.d dVar) {
        this.f12553a.i(dVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setHardwareAccelerated(boolean z11) {
        this.f12558f = z11;
        this.f12559g = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setOnRequestCloseListener(InterfaceC0236c interfaceC0236c) {
        this.f12561i = interfaceC0236c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f12560h = onShowListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setStatusBarTranslucent(boolean z11) {
        this.f12556d = z11;
        this.f12559g = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setTransparent(boolean z11) {
        this.f12555c = z11;
    }
}