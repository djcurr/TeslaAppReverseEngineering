package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@fg.a(name = UIManagerModule.NAME)
/* loaded from: classes3.dex */
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = xd.c.a().b(yd.a.f59448d);
    public static final String NAME = "UIManager";
    public static final String TAG = "UIManagerModule";
    private int mBatchId;
    private final Map<String, Object> mCustomDirectEvents;
    private final com.facebook.react.uimanager.events.d mEventDispatcher;
    private final List<w0> mListeners;
    private final e mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    private int mNumRootViews;
    private final r0 mUIImplementation;
    private final CopyOnWriteArrayList<UIManagerListener> mUIManagerListeners;
    private Map<String, WritableMap> mViewManagerConstantsCache;
    private volatile int mViewManagerConstantsCacheSize;
    private final d1 mViewManagerRegistry;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements d {
        a() {
        }

        @Override // com.facebook.react.uimanager.UIManagerModule.d
        public String a(String str) {
            return UIManagerModule.this.resolveCustomDirectEventName(str);
        }
    }

    /* loaded from: classes3.dex */
    class b extends GuardedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f12201a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f12202b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, int i11, Object obj) {
            super(reactContext);
            this.f12201a = i11;
            this.f12202b = obj;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.Y(this.f12201a, this.f12202b);
        }
    }

    /* loaded from: classes3.dex */
    class c extends GuardedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f12204a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f12205b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f12206c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ReactContext reactContext, int i11, int i12, int i13) {
            super(reactContext);
            this.f12204a = i11;
            this.f12205b = i12;
            this.f12206c = i13;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.c0(this.f12204a, this.f12205b, this.f12206c);
            UIManagerModule.this.mUIImplementation.n(-1);
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        String a(String str);
    }

    /* loaded from: classes3.dex */
    private class e implements ComponentCallbacks2 {
        private e(UIManagerModule uIManagerModule) {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i11) {
            if (i11 >= 60) {
                h1.a().c();
            }
        }

        /* synthetic */ e(UIManagerModule uIManagerModule, a aVar) {
            this(uIManagerModule);
        }
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, e1 e1Var, int i11) {
        this(reactApplicationContext, e1Var, new s0(), i11);
    }

    private WritableMap computeConstantsForViewManager(String str) {
        ViewManager S = str != null ? this.mUIImplementation.S(str) : null;
        if (S == null) {
            return null;
        }
        zg.a.a(0L, "UIManagerModule.getConstantsForViewManager").b("ViewManager", S.getName()).b("Lazy", Boolean.TRUE).c();
        try {
            Map<String, Object> c11 = v0.c(S, null, null, null, this.mCustomDirectEvents);
            if (c11 != null) {
                return Arguments.makeNativeMap(c11);
            }
            return null;
        } finally {
            zg.a.b(0L).c();
        }
    }

    private static Map<String, Object> createConstants(e1 e1Var) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        zg.a.a(0L, "CreateUIManagerConstants").b("Lazy", Boolean.TRUE).c();
        try {
            return v0.a(e1Var);
        } finally {
            com.facebook.systrace.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public <T extends View> int addRootView(T t11) {
        return addRootView(t11, null, null);
    }

    public void addUIBlock(q0 q0Var) {
        this.mUIImplementation.a(q0Var);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.add(uIManagerListener);
    }

    @Deprecated
    public void addUIManagerListener(w0 w0Var) {
        this.mListeners.add(w0Var);
    }

    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.f();
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.g(readableMap, callback);
    }

    @ReactMethod
    public void createView(int i11, String str, int i12, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.createView) tag: " + i11 + ", class: " + str + ", props: " + readableMap;
            nd.a.b("ReactNative", str2);
            xd.c.a().c(yd.a.f59448d, str2);
        }
        this.mUIImplementation.j(i11, str, i12, readableMap);
    }

    @ReactMethod
    public void dismissPopupMenu() {
        this.mUIImplementation.k();
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i11, int i12, ReadableArray readableArray) {
        this.mUIImplementation.l(i11, i12, readableArray);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i11, Dynamic dynamic, ReadableArray readableArray) {
        UIManager g11 = t0.g(getReactApplicationContext(), og.a.a(i11));
        if (g11 == null) {
            return;
        }
        if (dynamic.getType() == ReadableType.Number) {
            g11.dispatchCommand(i11, dynamic.asInt(), readableArray);
        } else if (dynamic.getType() == ReadableType.String) {
            g11.dispatchCommand(i11, dynamic.asString(), readableArray);
        }
    }

    @ReactMethod
    public void findSubviewIn(int i11, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.p(i11, Math.round(p.b(readableArray.getDouble(0))), Math.round(p.b(readableArray.getDouble(1))), callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        Map<String, WritableMap> map = this.mViewManagerConstantsCache;
        if (map != null && map.containsKey(str)) {
            WritableMap writableMap = this.mViewManagerConstantsCache.get(str);
            int i11 = this.mViewManagerConstantsCacheSize - 1;
            this.mViewManagerConstantsCacheSize = i11;
            if (i11 <= 0) {
                this.mViewManagerConstantsCache = null;
            }
            return writableMap;
        }
        return computeConstantsForViewManager(str);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap(v0.d());
    }

    @Deprecated
    public d getDirectEventNamesResolver() {
        return new a();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.q();
    }

    @Deprecated
    public r0 getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public d1 getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        this.mEventDispatcher.a(1, (RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class));
    }

    public void invalidateNodeLayout(int i11) {
        c0 R = this.mUIImplementation.R(i11);
        if (R == null) {
            nd.a.G("ReactNative", "Warning : attempted to dirty a non-existent react shadow node. reactTag=" + i11);
            return;
        }
        R.H();
        this.mUIImplementation.n(-1);
    }

    @ReactMethod
    public void manageChildren(int i11, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        if (DEBUG) {
            String str = "(UIManager.manageChildren) tag: " + i11 + ", moveFrom: " + readableArray + ", moveTo: " + readableArray2 + ", addTags: " + readableArray3 + ", atIndices: " + readableArray4 + ", removeFrom: " + readableArray5;
            nd.a.b("ReactNative", str);
            xd.c.a().c(yd.a.f59448d, str);
        }
        this.mUIImplementation.u(i11, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @ReactMethod
    public void measure(int i11, Callback callback) {
        this.mUIImplementation.v(i11, callback);
    }

    @ReactMethod
    public void measureInWindow(int i11, Callback callback) {
        this.mUIImplementation.w(i11, callback);
    }

    @ReactMethod
    public void measureLayout(int i11, int i12, Callback callback, Callback callback2) {
        this.mUIImplementation.x(i11, i12, callback, callback2);
    }

    @ReactMethod
    @Deprecated
    public void measureLayoutRelativeToParent(int i11, Callback callback, Callback callback2) {
        this.mUIImplementation.z(i11, callback, callback2);
    }

    public void onBatchComplete() {
        int i11 = this.mBatchId;
        this.mBatchId = i11 + 1;
        zg.a.a(0L, "onBatchCompleteUI").a("BatchId", i11).c();
        for (w0 w0Var : this.mListeners) {
            w0Var.willDispatchViewUpdates(this);
        }
        Iterator<UIManagerListener> it2 = this.mUIManagerListeners.iterator();
        while (it2.hasNext()) {
            it2.next().willDispatchViewUpdates(this);
        }
        try {
            if (this.mNumRootViews > 0) {
                this.mUIImplementation.n(i11);
            }
        } finally {
            com.facebook.systrace.a.g(0L);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        this.mEventDispatcher.d();
        this.mUIImplementation.D();
        getReactApplicationContext().unregisterComponentCallbacks(this.mMemoryTrimCallback);
        h1.a().c();
        c1.a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mUIImplementation.E();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mUIImplementation.F();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mUIImplementation.G();
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void preInitializeViewManagers(List<String> list) {
        if (ReactFeatureFlags.enableExperimentalStaticViewConfigs) {
            for (String str : list) {
                this.mUIImplementation.S(str);
            }
            return;
        }
        androidx.collection.a aVar = new androidx.collection.a();
        for (String str2 : list) {
            WritableMap computeConstantsForViewManager = computeConstantsForViewManager(str2);
            if (computeConstantsForViewManager != null) {
                aVar.put(str2, computeConstantsForViewManager);
            }
        }
        this.mViewManagerConstantsCacheSize = list.size();
        this.mViewManagerConstantsCache = Collections.unmodifiableMap(aVar);
    }

    public void prependUIBlock(q0 q0Var) {
        this.mUIImplementation.H(q0Var);
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
        this.mUIImplementation.I();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i11, String str, WritableMap writableMap) {
        receiveEvent(-1, i11, str, writableMap);
    }

    @ReactMethod
    public void removeRootView(int i11) {
        this.mUIImplementation.L(i11);
        this.mNumRootViews--;
    }

    @ReactMethod
    @Deprecated
    public void removeSubviewsFromContainerWithID(int i11) {
        this.mUIImplementation.O(i11);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.remove(uIManagerListener);
    }

    @Deprecated
    public void removeUIManagerListener(w0 w0Var) {
        this.mListeners.remove(w0Var);
    }

    @ReactMethod
    @Deprecated
    public void replaceExistingNonRootView(int i11, int i12) {
        this.mUIImplementation.P(i11, i12);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        Map map;
        return (str == null || (map = (Map) this.mCustomDirectEvents.get(str)) == null) ? str : (String) map.get("registrationName");
    }

    @Deprecated
    public int resolveRootTagFromReactTag(int i11) {
        return og.a.b(i11) ? i11 : this.mUIImplementation.Q(i11);
    }

    @Override // com.facebook.react.bridge.UIManager
    public View resolveView(int i11) {
        UiThreadUtil.assertOnUiThread();
        return this.mUIImplementation.r().U().resolveView(i11);
    }

    @ReactMethod
    public void sendAccessibilityEvent(int i11, int i12) {
        int a11 = og.a.a(i11);
        if (a11 == 2) {
            UIManager g11 = t0.g(getReactApplicationContext(), a11);
            if (g11 != null) {
                g11.sendAccessibilityEvent(i11, i12);
                return;
            }
            return;
        }
        this.mUIImplementation.T(i11, i12);
    }

    @ReactMethod
    public void setChildren(int i11, ReadableArray readableArray) {
        if (DEBUG) {
            String str = "(UIManager.setChildren) tag: " + i11 + ", children: " + readableArray;
            nd.a.b("ReactNative", str);
            xd.c.a().c(yd.a.f59448d, str);
        }
        this.mUIImplementation.U(i11, readableArray);
    }

    @ReactMethod
    public void setJSResponder(int i11, boolean z11) {
        this.mUIImplementation.V(i11, z11);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z11) {
        this.mUIImplementation.W(z11);
    }

    public void setViewHierarchyUpdateDebugListener(pg.a aVar) {
        this.mUIImplementation.X(aVar);
    }

    public void setViewLocalData(int i11, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new b(reactApplicationContext, i11, obj));
    }

    @ReactMethod
    public void showPopupMenu(int i11, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.mUIImplementation.Z(i11, readableArray, callback, callback2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t11, String str, WritableMap writableMap, int i11, int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i11, ReadableMap readableMap) {
        this.mUIImplementation.a0(i11, new e0(readableMap));
    }

    public void updateNodeSize(int i11, int i12, int i13) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.b0(i11, i12, i13);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i11, int i12, int i13, int i14, int i15) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new c(reactApplicationContext, i11, i12, i13));
    }

    @ReactMethod
    public void updateView(int i11, String str, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.updateView) tag: " + i11 + ", class: " + str + ", props: " + readableMap;
            nd.a.b("ReactNative", str2);
            xd.c.a().c(yd.a.f59448d, str2);
        }
        this.mUIImplementation.e0(i11, str, readableMap);
    }

    @ReactMethod
    @Deprecated
    public void viewIsDescendantOf(int i11, int i12, Callback callback) {
        this.mUIImplementation.g0(i11, i12, callback);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i11) {
        this(reactApplicationContext, list, new s0(), i11);
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t11, WritableMap writableMap, String str) {
        com.facebook.systrace.a.c(0L, "UIManagerModule.addRootView");
        int a11 = b0.a();
        this.mUIImplementation.J(t11, a11, new n0(getReactApplicationContext(), t11.getContext(), ((a0) t11).getSurfaceID(), -1));
        this.mNumRootViews++;
        com.facebook.systrace.a.g(0L);
        return a11;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i11, String str, ReadableArray readableArray) {
        this.mUIImplementation.m(i11, str, readableArray);
    }

    @Override // com.facebook.react.bridge.UIManager
    public com.facebook.react.uimanager.events.d getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i11, int i12, String str, WritableMap writableMap) {
        ((RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class)).receiveEvent(i12, str, writableMap);
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, e1 e1Var, s0 s0Var, int i11) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new e(this, null);
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        this.mNumRootViews = 0;
        com.facebook.react.uimanager.c.f(reactApplicationContext);
        com.facebook.react.uimanager.events.e eVar = new com.facebook.react.uimanager.events.e(reactApplicationContext);
        this.mEventDispatcher = eVar;
        this.mModuleConstants = createConstants(e1Var);
        this.mCustomDirectEvents = u0.c();
        d1 d1Var = new d1(e1Var);
        this.mViewManagerRegistry = d1Var;
        this.mUIImplementation = s0Var.a(reactApplicationContext, d1Var, eVar, i11);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        zg.a.a(0L, "CreateUIManagerConstants").b("Lazy", Boolean.FALSE).c();
        try {
            return v0.b(list, map, map2);
        } finally {
            com.facebook.systrace.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, s0 s0Var, int i11) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new e(this, null);
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        this.mNumRootViews = 0;
        com.facebook.react.uimanager.c.f(reactApplicationContext);
        com.facebook.react.uimanager.events.e eVar = new com.facebook.react.uimanager.events.e(reactApplicationContext);
        this.mEventDispatcher = eVar;
        HashMap b11 = yf.c.b();
        this.mCustomDirectEvents = b11;
        this.mModuleConstants = createConstants(list, null, b11);
        d1 d1Var = new d1(list);
        this.mViewManagerRegistry = d1Var;
        this.mUIImplementation = s0Var.a(reactApplicationContext, d1Var, eVar, i11);
        reactApplicationContext.addLifecycleEventListener(this);
    }
}