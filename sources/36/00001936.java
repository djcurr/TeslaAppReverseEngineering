package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactCxxErrorHandler;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.fabric.ReactFabric;
import com.facebook.react.turbomodule.core.TurboModuleManager;
import com.facebook.react.uimanager.ComponentNameResolver;
import com.facebook.react.uimanager.ComponentNameResolverManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.s0;
import com.facebook.react.uimanager.t0;
import com.facebook.react.y;
import com.facebook.soloader.SoLoader;
import ezvcard.property.Gender;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class r {
    private static final String B = "r";

    /* renamed from: b  reason: collision with root package name */
    private volatile LifecycleState f12130b;

    /* renamed from: c  reason: collision with root package name */
    private k f12131c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Thread f12132d;

    /* renamed from: e  reason: collision with root package name */
    private final JavaScriptExecutorFactory f12133e;

    /* renamed from: g  reason: collision with root package name */
    private final JSBundleLoader f12135g;

    /* renamed from: h  reason: collision with root package name */
    private final String f12136h;

    /* renamed from: i  reason: collision with root package name */
    private final List<v> f12137i;

    /* renamed from: j  reason: collision with root package name */
    private final bg.d f12138j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f12139k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f12140l;

    /* renamed from: m  reason: collision with root package name */
    private final NotThreadSafeBridgeIdleDebugListener f12141m;

    /* renamed from: o  reason: collision with root package name */
    private volatile ReactContext f12143o;

    /* renamed from: p  reason: collision with root package name */
    private final Context f12144p;

    /* renamed from: q  reason: collision with root package name */
    private com.facebook.react.modules.core.b f12145q;

    /* renamed from: r  reason: collision with root package name */
    private Activity f12146r;

    /* renamed from: v  reason: collision with root package name */
    private final com.facebook.react.e f12150v;

    /* renamed from: w  reason: collision with root package name */
    private final NativeModuleCallExceptionHandler f12151w;

    /* renamed from: x  reason: collision with root package name */
    private final JSIModulePackage f12152x;

    /* renamed from: y  reason: collision with root package name */
    private final y.a f12153y;

    /* renamed from: z  reason: collision with root package name */
    private List<ViewManager> f12154z;

    /* renamed from: a  reason: collision with root package name */
    private final Set<com.facebook.react.uimanager.a0> f12129a = Collections.synchronizedSet(new HashSet());

    /* renamed from: f  reason: collision with root package name */
    private List<String> f12134f = null;

    /* renamed from: n  reason: collision with root package name */
    private final Object f12142n = new Object();

    /* renamed from: s  reason: collision with root package name */
    private final Collection<q> f12147s = Collections.synchronizedList(new ArrayList());

    /* renamed from: t  reason: collision with root package name */
    private volatile boolean f12148t = false;

    /* renamed from: u  reason: collision with root package name */
    private volatile Boolean f12149u = Boolean.FALSE;
    private boolean A = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements ComponentNameResolver {
        a() {
        }

        @Override // com.facebook.react.uimanager.ComponentNameResolver
        public String[] getComponentNames() {
            List<String> E = r.this.E();
            if (E == null) {
                nd.a.j(r.B, "No ViewManager names found");
                return new String[0];
            }
            return (String[]) E.toArray(new String[0]);
        }
    }

    /* loaded from: classes3.dex */
    class b implements com.facebook.react.modules.core.b {
        b() {
        }

        @Override // com.facebook.react.modules.core.b
        public void i() {
            r.this.I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements com.facebook.react.devsupport.g {
        c(r rVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements bg.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ hg.a f12157a;

        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f12159a;

            a(boolean z11) {
                this.f12159a = z11;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f12159a) {
                    r.this.f12138j.p();
                } else if (r.this.f12138j.u() && !d.this.f12157a.c() && !r.this.A) {
                    r.this.X();
                } else {
                    d.this.f12157a.a(false);
                    r.this.e0();
                }
            }
        }

        d(hg.a aVar) {
            this.f12157a = aVar;
        }

        @Override // bg.e
        public void a(boolean z11) {
            UiThreadUtil.runOnUiThread(new a(z11));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f12161a;

        e(View view) {
            this.f12161a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f12161a.removeOnAttachStateChangeListener(this);
            r.this.f12138j.i(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f12163a;

        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (r.this.f12131c != null) {
                    r rVar = r.this;
                    rVar.h0(rVar.f12131c);
                    r.this.f12131c = null;
                }
            }
        }

        /* loaded from: classes3.dex */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ReactApplicationContext f12166a;

            b(ReactApplicationContext reactApplicationContext) {
                this.f12166a = reactApplicationContext;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    r.this.i0(this.f12166a);
                } catch (Exception e11) {
                    nd.a.k("ReactNative", "ReactInstanceManager caught exception in setupReactContext", e11);
                    r.this.f12138j.handleException(e11);
                }
            }
        }

        f(k kVar) {
            this.f12163a = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_END);
            synchronized (r.this.f12149u) {
                while (r.this.f12149u.booleanValue()) {
                    try {
                        r.this.f12149u.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            r.this.f12148t = true;
            try {
                Process.setThreadPriority(-4);
                ReactMarker.logMarker(ReactMarkerConstants.VM_INIT);
                ReactApplicationContext u11 = r.this.u(this.f12163a.b().create(), this.f12163a.a());
                try {
                    r.this.f12132d = null;
                    ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START);
                    a aVar = new a();
                    u11.runOnNativeModulesQueueThread(new b(u11));
                    UiThreadUtil.runOnUiThread(aVar);
                } catch (Exception e11) {
                    r.this.f12138j.handleException(e11);
                }
            } catch (Exception e12) {
                r.this.f12148t = false;
                r.this.f12132d = null;
                r.this.f12138j.handleException(e12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q[] f12168a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f12169b;

        g(r rVar, q[] qVarArr, ReactApplicationContext reactApplicationContext) {
            this.f12168a = qVarArr;
            this.f12169b = reactApplicationContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            q[] qVarArr;
            for (q qVar : this.f12168a) {
                if (qVar != null) {
                    qVar.a(this.f12169b);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h implements Runnable {
        h(r rVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(0);
            ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class i implements Runnable {
        i(r rVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f12170a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.a0 f12171b;

        j(r rVar, int i11, com.facebook.react.uimanager.a0 a0Var) {
            this.f12170a = i11;
            this.f12171b = a0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.facebook.systrace.a.e(0L, "pre_rootView.onAttachedToReactInstance", this.f12170a);
            this.f12171b.c(101);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class k {

        /* renamed from: a  reason: collision with root package name */
        private final JavaScriptExecutorFactory f12172a;

        /* renamed from: b  reason: collision with root package name */
        private final JSBundleLoader f12173b;

        public k(r rVar, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            this.f12172a = (JavaScriptExecutorFactory) wf.a.c(javaScriptExecutorFactory);
            this.f12173b = (JSBundleLoader) wf.a.c(jSBundleLoader);
        }

        public JSBundleLoader a() {
            return this.f12173b;
        }

        public JavaScriptExecutorFactory b() {
            return this.f12172a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Context context, Activity activity, com.facebook.react.modules.core.b bVar, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List<v> list, boolean z11, com.facebook.react.devsupport.b bVar2, boolean z12, NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, s0 s0Var, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, com.facebook.react.devsupport.h hVar, boolean z13, bg.a aVar, int i11, int i12, JSIModulePackage jSIModulePackage, Map<String, Object> map, y.a aVar2, yf.h hVar2) {
        nd.a.b(B, "ReactInstanceManager.ctor()");
        H(context);
        com.facebook.react.uimanager.c.f(context);
        this.f12144p = context;
        this.f12146r = activity;
        this.f12145q = bVar;
        this.f12133e = javaScriptExecutorFactory;
        this.f12135g = jSBundleLoader;
        this.f12136h = str;
        ArrayList arrayList = new ArrayList();
        this.f12137i = arrayList;
        this.f12139k = z11;
        this.f12140l = z12;
        com.facebook.systrace.a.c(0L, "ReactInstanceManager.initDevSupportManager");
        bg.d a11 = bVar2.a(context, t(), str, z11, hVar, aVar, i11, map, hVar2);
        this.f12138j = a11;
        com.facebook.systrace.a.g(0L);
        this.f12141m = notThreadSafeBridgeIdleDebugListener;
        this.f12130b = lifecycleState;
        this.f12150v = new com.facebook.react.e(context);
        this.f12151w = nativeModuleCallExceptionHandler;
        this.f12153y = aVar2;
        synchronized (arrayList) {
            xd.c.a().c(yd.a.f59445a, "RNCore: Use Split Packages");
            arrayList.add(new com.facebook.react.a(this, new b(), s0Var, z13, i12));
            if (z11) {
                arrayList.add(new com.facebook.react.b());
            }
            arrayList.addAll(list);
        }
        this.f12152x = jSIModulePackage;
        com.facebook.react.modules.core.g.j();
        if (z11) {
            a11.m();
        }
        g0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void H(Context context) {
        SoLoader.l(context, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        UiThreadUtil.assertOnUiThread();
        com.facebook.react.modules.core.b bVar = this.f12145q;
        if (bVar != null) {
            bVar.i();
        }
    }

    private void J() {
        nd.a.e(B, "ReactInstanceManager.destroy called", new RuntimeException("ReactInstanceManager.destroy called"));
    }

    private synchronized void K() {
        if (this.f12130b == LifecycleState.RESUMED) {
            N(true);
        }
    }

    private synchronized void L() {
        ReactContext A = A();
        if (A != null) {
            if (this.f12130b == LifecycleState.RESUMED) {
                A.onHostPause();
                this.f12130b = LifecycleState.BEFORE_RESUME;
            }
            if (this.f12130b == LifecycleState.BEFORE_RESUME) {
                A.onHostDestroy();
            }
        }
        this.f12130b = LifecycleState.BEFORE_CREATE;
    }

    private synchronized void M() {
        ReactContext A = A();
        if (A != null) {
            if (this.f12130b == LifecycleState.BEFORE_CREATE) {
                A.onHostResume(this.f12146r);
                A.onHostPause();
            } else if (this.f12130b == LifecycleState.RESUMED) {
                A.onHostPause();
            }
        }
        this.f12130b = LifecycleState.BEFORE_RESUME;
    }

    private synchronized void N(boolean z11) {
        ReactContext A = A();
        if (A != null && (z11 || this.f12130b == LifecycleState.BEFORE_RESUME || this.f12130b == LifecycleState.BEFORE_CREATE)) {
            A.onHostResume(this.f12146r);
        }
        this.f12130b = LifecycleState.RESUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        nd.a.b("ReactNative", "ReactInstanceManager.onJSBundleLoadedFromServer()");
        d0(this.f12133e, JSBundleLoader.createCachedBundleFromNetworkLoader(this.f12138j.j(), this.f12138j.b()));
    }

    private void a0(v vVar, com.facebook.react.f fVar) {
        zg.a.a(0L, "processPackage").b("className", vVar.getClass().getSimpleName()).c();
        boolean z11 = vVar instanceof x;
        if (z11) {
            ((x) vVar).b();
        }
        fVar.b(vVar);
        if (z11) {
            ((x) vVar).a();
        }
        zg.a.b(0L).c();
    }

    private NativeModuleRegistry b0(ReactApplicationContext reactApplicationContext, List<v> list, boolean z11) {
        com.facebook.react.f fVar = new com.facebook.react.f(reactApplicationContext, this);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.f12137i) {
            Iterator<v> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    v next = it2.next();
                    if (!z11 || !this.f12137i.contains(next)) {
                        com.facebook.systrace.a.c(0L, "createAndProcessCustomReactPackage");
                        if (z11) {
                            this.f12137i.add(next);
                        }
                        a0(next, fVar);
                        com.facebook.systrace.a.g(0L);
                    }
                }
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        com.facebook.systrace.a.c(0L, "buildNativeModuleRegistry");
        try {
            return fVar.a();
        } finally {
            com.facebook.systrace.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    private void d0(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        nd.a.b("ReactNative", "ReactInstanceManager.recreateReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        k kVar = new k(this, javaScriptExecutorFactory, jSBundleLoader);
        if (this.f12132d == null) {
            h0(kVar);
        } else {
            this.f12131c = kVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() {
        nd.a.b(B, "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()");
        xd.c.a().c(yd.a.f59445a, "RNCore: load from BundleLoader");
        d0(this.f12133e, this.f12135g);
    }

    private void f0() {
        nd.a.b(B, "ReactInstanceManager.recreateReactContextInBackgroundInner()");
        xd.c.a().c(yd.a.f59445a, "RNCore: recreateReactContextInBackground");
        UiThreadUtil.assertOnUiThread();
        if (this.f12139k && this.f12136h != null) {
            hg.a r11 = this.f12138j.r();
            if (!com.facebook.systrace.a.h(0L)) {
                if (this.f12135g == null) {
                    this.f12138j.p();
                    return;
                } else {
                    this.f12138j.x(new d(r11));
                    return;
                }
            }
        }
        e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(k kVar) {
        nd.a.b("ReactNative", "ReactInstanceManager.runCreateReactContextOnNewThread()");
        UiThreadUtil.assertOnUiThread();
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_START);
        synchronized (this.f12129a) {
            synchronized (this.f12142n) {
                if (this.f12143o != null) {
                    k0(this.f12143o);
                    this.f12143o = null;
                }
            }
        }
        this.f12132d = new Thread(null, new f(kVar), "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.f12132d.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(ReactApplicationContext reactApplicationContext) {
        nd.a.b("ReactNative", "ReactInstanceManager.setupReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        com.facebook.systrace.a.c(0L, "setupReactContext");
        synchronized (this.f12129a) {
            synchronized (this.f12142n) {
                this.f12143o = (ReactContext) wf.a.c(reactApplicationContext);
            }
            CatalystInstance catalystInstance = (CatalystInstance) wf.a.c(reactApplicationContext.getCatalystInstance());
            catalystInstance.initialize();
            this.f12138j.o(reactApplicationContext);
            this.f12150v.a(catalystInstance);
            K();
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
            for (com.facebook.react.uimanager.a0 a0Var : this.f12129a) {
                if (a0Var.getState().compareAndSet(0, 1)) {
                    q(a0Var);
                }
            }
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
        }
        UiThreadUtil.runOnUiThread(new g(this, (q[]) this.f12147s.toArray(new q[this.f12147s.size()]), reactApplicationContext));
        com.facebook.systrace.a.g(0L);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_END);
        reactApplicationContext.runOnJSQueueThread(new h(this));
        reactApplicationContext.runOnNativeModulesQueueThread(new i(this));
    }

    private void k0(ReactContext reactContext) {
        nd.a.b("ReactNative", "ReactInstanceManager.tearDownReactContext()");
        UiThreadUtil.assertOnUiThread();
        if (this.f12130b == LifecycleState.RESUMED) {
            reactContext.onHostPause();
        }
        synchronized (this.f12129a) {
            for (com.facebook.react.uimanager.a0 a0Var : this.f12129a) {
                s(a0Var);
            }
        }
        this.f12150v.d(reactContext.getCatalystInstance());
        reactContext.destroy();
        this.f12138j.w(reactContext);
    }

    private void q(com.facebook.react.uimanager.a0 a0Var) {
        WritableMap fromBundle;
        int addRootView;
        WritableMap fromBundle2;
        nd.a.b("ReactNative", "ReactInstanceManager.attachRootViewToInstance()");
        com.facebook.systrace.a.c(0L, "attachRootViewToInstance");
        UIManager g11 = t0.g(this.f12143o, a0Var.getUIManagerType());
        if (g11 != null) {
            Bundle appProperties = a0Var.getAppProperties();
            if (a0Var.getUIManagerType() == 2) {
                ViewGroup rootViewGroup = a0Var.getRootViewGroup();
                String jSModuleName = a0Var.getJSModuleName();
                if (appProperties == null) {
                    fromBundle2 = new WritableNativeMap();
                } else {
                    fromBundle2 = Arguments.fromBundle(appProperties);
                }
                addRootView = g11.startSurface(rootViewGroup, jSModuleName, fromBundle2, a0Var.getWidthMeasureSpec(), a0Var.getHeightMeasureSpec());
                a0Var.setRootViewTag(addRootView);
                a0Var.setShouldLogContentAppeared(true);
            } else {
                ViewGroup rootViewGroup2 = a0Var.getRootViewGroup();
                if (appProperties == null) {
                    fromBundle = new WritableNativeMap();
                } else {
                    fromBundle = Arguments.fromBundle(appProperties);
                }
                addRootView = g11.addRootView(rootViewGroup2, fromBundle, a0Var.getInitialUITemplate());
                a0Var.setRootViewTag(addRootView);
                a0Var.d();
            }
            com.facebook.systrace.a.a(0L, "pre_rootView.onAttachedToReactInstance", addRootView);
            UiThreadUtil.runOnUiThread(new j(this, addRootView, a0Var));
            com.facebook.systrace.a.g(0L);
            return;
        }
        throw new IllegalStateException("Unable to attach a rootView to ReactInstance when UIManager is not properly initialized.");
    }

    public static s r() {
        return new s();
    }

    private void s(com.facebook.react.uimanager.a0 a0Var) {
        UiThreadUtil.assertOnUiThread();
        a0Var.getState().compareAndSet(1, 0);
        ViewGroup rootViewGroup = a0Var.getRootViewGroup();
        rootViewGroup.removeAllViews();
        rootViewGroup.setId(-1);
    }

    private com.facebook.react.devsupport.g t() {
        return new c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ReactApplicationContext u(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        y.a aVar;
        nd.a.b("ReactNative", "ReactInstanceManager.createReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        ReactApplicationContext reactApplicationContext = new ReactApplicationContext(this.f12144p);
        NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.f12151w;
        if (nativeModuleCallExceptionHandler == null) {
            nativeModuleCallExceptionHandler = this.f12138j;
        }
        reactApplicationContext.setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        CatalystInstanceImpl.Builder nativeModuleCallExceptionHandler2 = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(b0(reactApplicationContext, this.f12137i, false)).setJSBundleLoader(jSBundleLoader).setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        com.facebook.systrace.a.c(0L, "createCatalystInstance");
        try {
            CatalystInstance build = nativeModuleCallExceptionHandler2.build();
            com.facebook.systrace.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            reactApplicationContext.initializeWithInstance(build);
            if (ReactFeatureFlags.useTurboModules && (aVar = this.f12153y) != null) {
                TurboModuleManager turboModuleManager = new TurboModuleManager(build.getRuntimeExecutor(), aVar.c(this.f12137i).d(reactApplicationContext).a(), build.getJSCallInvokerHolder(), build.getNativeCallInvokerHolder());
                build.setTurboModuleManager(turboModuleManager);
                for (String str : turboModuleManager.getEagerInitModuleNames()) {
                    turboModuleManager.getModule(str);
                }
            }
            JSIModulePackage jSIModulePackage = this.f12152x;
            if (jSIModulePackage != null) {
                build.addJSIModules(jSIModulePackage.getJSIModules(reactApplicationContext, build.getJavaScriptContextHolder()));
            }
            if (ReactFeatureFlags.enableFabricRenderer) {
                build.getJSIModule(JSIModuleType.UIManager);
            }
            NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.f12141m;
            if (notThreadSafeBridgeIdleDebugListener != null) {
                build.addBridgeIdleDebugListener(notThreadSafeBridgeIdleDebugListener);
            }
            if (com.facebook.systrace.a.h(0L)) {
                build.setGlobalVariable("__RCTProfileIsProfiling", "true");
            }
            if (ReactFeatureFlags.enableExperimentalStaticViewConfigs) {
                new ComponentNameResolverManager(build.getRuntimeExecutor(), new a());
                build.setGlobalVariable("__fbStaticViewConfig", "true");
            }
            ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
            com.facebook.systrace.a.c(0L, "runJSBundle");
            build.runJSBundle();
            com.facebook.systrace.a.g(0L);
            return reactApplicationContext;
        } catch (Throwable th2) {
            com.facebook.systrace.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th2;
        }
    }

    private void z(com.facebook.react.uimanager.a0 a0Var, CatalystInstance catalystInstance) {
        nd.a.b("ReactNative", "ReactInstanceManager.detachViewFromInstance()");
        UiThreadUtil.assertOnUiThread();
        if (a0Var.getUIManagerType() == 2) {
            ((ReactFabric) catalystInstance.getJSModule(ReactFabric.class)).unmountComponentAtNode(a0Var.getRootViewTag());
        } else {
            ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(a0Var.getRootViewTag());
        }
    }

    public ReactContext A() {
        ReactContext reactContext;
        synchronized (this.f12142n) {
            reactContext = this.f12143o;
        }
        return reactContext;
    }

    public bg.d B() {
        return this.f12138j;
    }

    public LifecycleState C() {
        return this.f12130b;
    }

    public List<ViewManager> D(ReactApplicationContext reactApplicationContext) {
        List<ViewManager> list;
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        com.facebook.systrace.a.c(0L, "createAllViewManagers");
        try {
            if (this.f12154z == null) {
                synchronized (this.f12137i) {
                    if (this.f12154z == null) {
                        this.f12154z = new ArrayList();
                        for (v vVar : this.f12137i) {
                            this.f12154z.addAll(vVar.createViewManagers(reactApplicationContext));
                        }
                        list = this.f12154z;
                    }
                }
                return list;
            }
            list = this.f12154z;
            return list;
        } finally {
            com.facebook.systrace.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
        }
    }

    public List<String> E() {
        List<String> list;
        List<String> a11;
        com.facebook.systrace.a.c(0L, "ReactInstanceManager.getViewManagerNames");
        List<String> list2 = this.f12134f;
        if (list2 != null) {
            return list2;
        }
        synchronized (this.f12142n) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) A();
            if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
                synchronized (this.f12137i) {
                    if (this.f12134f == null) {
                        HashSet hashSet = new HashSet();
                        for (v vVar : this.f12137i) {
                            zg.a.a(0L, "ReactInstanceManager.getViewManagerName").b("Package", vVar.getClass().getSimpleName()).c();
                            if ((vVar instanceof b0) && (a11 = ((b0) vVar).a(reactApplicationContext)) != null) {
                                hashSet.addAll(a11);
                            }
                            zg.a.b(0L).c();
                        }
                        com.facebook.systrace.a.g(0L);
                        this.f12134f = new ArrayList(hashSet);
                    }
                    list = this.f12134f;
                }
                return list;
            }
            return null;
        }
    }

    public void F(Exception exc) {
        this.f12138j.handleException(exc);
    }

    public boolean G() {
        return this.f12148t;
    }

    public void O(Activity activity, int i11, int i12, Intent intent) {
        ReactContext A = A();
        if (A != null) {
            A.onActivityResult(activity, i11, i12, intent);
        }
    }

    public void P() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.f12143o;
        if (reactContext == null) {
            nd.a.G(B, "Instance detached from instance manager");
            I();
            return;
        }
        DeviceEventManagerModule deviceEventManagerModule = (DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class);
        if (deviceEventManagerModule != null) {
            deviceEventManagerModule.emitHardwareBackPressed();
        }
    }

    public void Q(Context context, Configuration configuration) {
        AppearanceModule appearanceModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext A = A();
        if (A == null || (appearanceModule = (AppearanceModule) A.getNativeModule(AppearanceModule.class)) == null) {
            return;
        }
        appearanceModule.onConfigurationChanged(context);
    }

    public void R() {
        UiThreadUtil.assertOnUiThread();
        if (this.f12139k) {
            this.f12138j.i(false);
        }
        L();
        this.f12146r = null;
    }

    public void S(Activity activity) {
        if (activity == this.f12146r) {
            R();
        }
    }

    public void T() {
        UiThreadUtil.assertOnUiThread();
        this.f12145q = null;
        if (this.f12139k) {
            this.f12138j.i(false);
        }
        M();
    }

    public void U(Activity activity) {
        if (this.f12140l) {
            wf.a.a(this.f12146r != null);
        }
        Activity activity2 = this.f12146r;
        if (activity2 != null) {
            boolean z11 = activity == activity2;
            wf.a.b(z11, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + this.f12146r.getClass().getSimpleName() + " Paused activity: " + activity.getClass().getSimpleName());
        }
        T();
    }

    public void V(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        this.f12146r = activity;
        if (this.f12139k) {
            if (activity != null) {
                View decorView = activity.getWindow().getDecorView();
                if (!androidx.core.view.a0.Y(decorView)) {
                    decorView.addOnAttachStateChangeListener(new e(decorView));
                } else {
                    this.f12138j.i(true);
                }
            } else if (!this.f12140l) {
                this.f12138j.i(true);
            }
        }
        N(false);
    }

    public void W(Activity activity, com.facebook.react.modules.core.b bVar) {
        UiThreadUtil.assertOnUiThread();
        this.f12145q = bVar;
        V(activity);
    }

    public void Y(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext A = A();
        if (A == null) {
            nd.a.G(B, "Instance detached from instance manager");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) A.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        A.onNewIntent(this.f12146r, intent);
    }

    public void Z(boolean z11) {
        UiThreadUtil.assertOnUiThread();
        ReactContext A = A();
        if (A != null) {
            A.onWindowFocusChange(z11);
        }
    }

    public void c0() {
        wf.a.b(this.f12148t, "recreateReactContextInBackground should only be called after the initial createReactContextInBackground call.");
        f0();
    }

    public void g0() {
        Method method;
        try {
            method = r.class.getMethod(Gender.FEMALE, Exception.class);
        } catch (NoSuchMethodException e11) {
            nd.a.k("ReactInstanceHolder", "Failed to set cxx error hanlder function", e11);
            method = null;
        }
        ReactCxxErrorHandler.setHandleErrorFunc(this, method);
    }

    public void j0() {
        UiThreadUtil.assertOnUiThread();
        this.f12138j.v();
    }

    public void o(q qVar) {
        this.f12147s.add(qVar);
    }

    public void p(com.facebook.react.uimanager.a0 a0Var) {
        UiThreadUtil.assertOnUiThread();
        if (this.f12129a.add(a0Var)) {
            s(a0Var);
        }
        ReactContext A = A();
        if (this.f12132d == null && A != null && a0Var.getState().compareAndSet(0, 1)) {
            q(a0Var);
        }
    }

    public void v() {
        nd.a.b(B, "ReactInstanceManager.createReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        if (this.f12148t) {
            return;
        }
        this.f12148t = true;
        f0();
    }

    public ViewManager w(String str) {
        ViewManager b11;
        synchronized (this.f12142n) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) A();
            if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
                synchronized (this.f12137i) {
                    for (v vVar : this.f12137i) {
                        if ((vVar instanceof b0) && (b11 = ((b0) vVar).b(reactApplicationContext, str)) != null) {
                            return b11;
                        }
                    }
                    return null;
                }
            }
            return null;
        }
    }

    public void x() {
        UiThreadUtil.assertOnUiThread();
        xd.c.a().c(yd.a.f59445a, "RNCore: Destroy");
        J();
        if (this.f12149u.booleanValue()) {
            nd.a.j("ReactNative", "ReactInstanceManager.destroy called: bail out, already destroying");
            return;
        }
        this.f12149u = Boolean.TRUE;
        if (this.f12139k) {
            this.f12138j.i(false);
            this.f12138j.d();
        }
        L();
        if (this.f12132d != null) {
            this.f12132d = null;
        }
        this.f12150v.b(this.f12144p);
        synchronized (this.f12142n) {
            if (this.f12143o != null) {
                this.f12143o.destroy();
                this.f12143o = null;
            }
        }
        this.f12148t = false;
        this.f12146r = null;
        vg.c.b().a();
        this.f12149u = Boolean.FALSE;
        synchronized (this.f12149u) {
            this.f12149u.notifyAll();
        }
        synchronized (this.f12137i) {
            this.f12134f = null;
        }
        nd.a.b("ReactNative", "ReactInstanceManager has been destroyed");
    }

    public void y(com.facebook.react.uimanager.a0 a0Var) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.f12129a) {
            if (this.f12129a.contains(a0Var)) {
                ReactContext A = A();
                this.f12129a.remove(a0Var);
                if (A != null && A.hasActiveReactInstance()) {
                    z(a0Var, A.getCatalystInstance());
                }
            }
        }
    }
}