package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.i0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.gesturehandler.GestureHandler;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
public final class l {

    /* renamed from: g */
    public static final a f21194g = new a(null);

    /* renamed from: a */
    private final ReactContext f21195a;

    /* renamed from: b */
    private final xr.f f21196b;

    /* renamed from: c */
    private final GestureHandler<?> f21197c;

    /* renamed from: d */
    private final ViewGroup f21198d;

    /* renamed from: e */
    private boolean f21199e;

    /* renamed from: f */
    private boolean f21200f;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewGroup b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            ViewParent viewParent = viewGroup;
            while (viewParent != null && !(viewParent instanceof i0)) {
                viewParent = viewParent.getParent();
            }
            if (viewParent != null) {
                return (ViewGroup) viewParent;
            }
            throw new IllegalStateException(("View " + viewGroup + " has not been mounted under ReactRootView").toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public final class b extends GestureHandler<b> {
        final /* synthetic */ l L;

        public b(l this$0) {
            s.g(this$0, "this$0");
            this.L = this$0;
        }

        @Override // com.swmansion.gesturehandler.GestureHandler
        protected void c0() {
            this.L.f21199e = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
            obtain.setAction(3);
            if (this.L.d() instanceof i0) {
                ((i0) this.L.d()).e(obtain);
            }
        }

        @Override // com.swmansion.gesturehandler.GestureHandler
        protected void d0(MotionEvent event) {
            s.g(event, "event");
            if (M() == 0) {
                n();
                this.L.f21199e = false;
            }
            if (event.getActionMasked() == 1) {
                z();
            }
        }
    }

    public l(ReactContext context, ViewGroup wrappedView) {
        s.g(context, "context");
        s.g(wrappedView, "wrappedView");
        this.f21195a = context;
        UiThreadUtil.assertOnUiThread();
        int id2 = wrappedView.getId();
        if (id2 >= 1) {
            NativeModule nativeModule = context.getNativeModule(RNGestureHandlerModule.class);
            s.e(nativeModule);
            s.f(nativeModule, "context.getNativeModule(…dlerModule::class.java)!!");
            RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
            j registry = rNGestureHandlerModule.getRegistry();
            ViewGroup b11 = f21194g.b(wrappedView);
            this.f21198d = b11;
            Log.i("ReactNative", s.p("[GESTURE HANDLER] Initialize gesture handler for root view ", b11));
            xr.f fVar = new xr.f(wrappedView, registry, new p());
            fVar.z(0.1f);
            b0 b0Var = b0.f54756a;
            this.f21196b = fVar;
            b bVar = new b(this);
            bVar.x0(-id2);
            this.f21197c = bVar;
            registry.k(bVar);
            j.d(registry, bVar.N(), id2, false, 4, null);
            rNGestureHandlerModule.registerRootHelper(this);
            return;
        }
        throw new IllegalStateException(s.p("Expect view tag to be set for ", wrappedView).toString());
    }

    public static /* synthetic */ void a(l lVar) {
        f(lVar);
    }

    public static final void f(l this$0) {
        s.g(this$0, "this$0");
        this$0.i();
    }

    private final void i() {
        GestureHandler<?> gestureHandler = this.f21197c;
        if (gestureHandler != null && gestureHandler.M() == 2) {
            gestureHandler.i();
            gestureHandler.z();
        }
    }

    public final boolean c(MotionEvent ev2) {
        s.g(ev2, "ev");
        this.f21200f = true;
        xr.f fVar = this.f21196b;
        s.e(fVar);
        fVar.v(ev2);
        this.f21200f = false;
        return this.f21199e;
    }

    public final ViewGroup d() {
        return this.f21198d;
    }

    public final void e(int i11, boolean z11) {
        if (z11) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.k
                {
                    l.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    l.a(l.this);
                }
            });
        }
    }

    public final void g(boolean z11) {
        if (this.f21196b == null || this.f21200f) {
            return;
        }
        i();
    }

    public final void h() {
        Log.i("ReactNative", s.p("[GESTURE HANDLER] Tearing down gesture handler registered for root view ", this.f21198d));
        NativeModule nativeModule = this.f21195a.getNativeModule(RNGestureHandlerModule.class);
        s.e(nativeModule);
        s.f(nativeModule, "context.getNativeModule(…dlerModule::class.java)!!");
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        j registry = rNGestureHandlerModule.getRegistry();
        GestureHandler<?> gestureHandler = this.f21197c;
        s.e(gestureHandler);
        registry.h(gestureHandler.N());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}