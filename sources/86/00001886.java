package com.facebook.react.fabric;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import cg.b;
import cg.c;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.events.FabricEventEmitter;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.b0;
import com.facebook.react.uimanager.c1;
import com.facebook.react.uimanager.d1;
import com.facebook.react.uimanager.events.h;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.m0;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.p;
import com.facebook.react.uimanager.t0;
import com.facebook.react.views.text.c0;
import com.facebook.react.views.text.d0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class FabricUIManager implements UIManager, LifecycleEventListener {
    public static final boolean ENABLE_FABRIC_LOGS;
    public static final boolean IS_DEVELOPMENT_ENVIRONMENT = false;
    public static final String TAG = "FabricUIManager";
    private Binding mBinding;
    private final e mDispatchUIFrameCallback;
    private final EventBeatManager mEventBeatManager;
    private final com.facebook.react.uimanager.events.d mEventDispatcher;
    private final cg.b mMountItemDispatcher;
    private final cg.c mMountingManager;
    private final ReactApplicationContext mReactApplicationContext;
    private volatile boolean mShouldDeallocateEventDispatcher;
    private final CopyOnWriteArrayList<UIManagerListener> mListeners = new CopyOnWriteArrayList<>();
    private volatile boolean mDestroyed = false;
    private boolean mDriveCxxAnimations = false;
    private long mDispatchViewUpdatesTime = 0;
    private long mCommitStartTime = 0;
    private long mLayoutTime = 0;
    private long mFinishTransactionTime = 0;
    private long mFinishTransactionCPPTime = 0;
    private int mCurrentSynchronousCommitNumber = 10000;
    private c.b mMountItemExecutor = new a();

    /* loaded from: classes3.dex */
    class a implements c.b {
        a() {
        }

        @Override // cg.c.b
        public void a(Queue<dg.d> queue) {
            FabricUIManager.this.mMountItemDispatcher.e(queue);
        }
    }

    /* loaded from: classes3.dex */
    class b implements dg.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11846a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableMap f11847b;

        b(FabricUIManager fabricUIManager, int i11, ReadableMap readableMap) {
            this.f11846a = i11;
            this.f11847b = readableMap;
        }

        @Override // dg.d
        public int a() {
            return -1;
        }

        @Override // dg.d
        public void b(cg.c cVar) {
            try {
                cVar.s(this.f11846a, this.f11847b);
            } catch (Exception unused) {
            }
        }

        public String toString() {
            return String.format("SYNC UPDATE PROPS [%d]: %s", Integer.valueOf(this.f11846a), "<hidden>");
        }
    }

    /* loaded from: classes3.dex */
    class c implements dg.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11848a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11849b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f11850c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f11851d;

        c(FabricUIManager fabricUIManager, int i11, int i12, int i13, boolean z11) {
            this.f11848a = i11;
            this.f11849b = i12;
            this.f11850c = i13;
            this.f11851d = z11;
        }

        @Override // dg.d
        public int a() {
            return this.f11848a;
        }

        @Override // dg.d
        public void b(cg.c cVar) {
            cg.d d11 = cVar.d(this.f11848a);
            if (d11 != null) {
                d11.L(this.f11849b, this.f11850c, this.f11851d);
                return;
            }
            String str = FabricUIManager.TAG;
            nd.a.j(str, "setJSResponder skipped, surface no longer available [" + this.f11848a + "]");
        }

        public String toString() {
            return String.format("SET_JS_RESPONDER [%d] [surface:%d]", Integer.valueOf(this.f11849b), Integer.valueOf(this.f11848a));
        }
    }

    /* loaded from: classes3.dex */
    class d implements dg.d {
        d(FabricUIManager fabricUIManager) {
        }

        @Override // dg.d
        public int a() {
            return -1;
        }

        @Override // dg.d
        public void b(cg.c cVar) {
            cVar.b();
        }

        public String toString() {
            return "CLEAR_JS_RESPONDER";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class e extends com.facebook.react.fabric.c {

        /* renamed from: b  reason: collision with root package name */
        private volatile boolean f11852b;

        /* synthetic */ e(FabricUIManager fabricUIManager, ReactContext reactContext, a aVar) {
            this(reactContext);
        }

        void a() {
            this.f11852b = false;
        }

        @Override // com.facebook.react.fabric.c
        public void doFrameGuarded(long j11) {
            if (this.f11852b && !FabricUIManager.this.mDestroyed) {
                if (FabricUIManager.this.mDriveCxxAnimations && FabricUIManager.this.mBinding != null) {
                    FabricUIManager.this.mBinding.driveCxxAnimations();
                }
                try {
                    try {
                        FabricUIManager.this.mMountItemDispatcher.g(j11);
                        FabricUIManager.this.mMountItemDispatcher.q();
                        return;
                    } catch (Exception e11) {
                        nd.a.k(FabricUIManager.TAG, "Exception thrown when executing UIFrameGuarded", e11);
                        a();
                        throw e11;
                    }
                } finally {
                    g.i().m(g.c.DISPATCH_UI, FabricUIManager.this.mDispatchUIFrameCallback);
                }
            }
            nd.a.G(FabricUIManager.TAG, "Not flushing pending UI operations because of previously thrown Exception");
        }

        private e(ReactContext reactContext) {
            super(reactContext);
            this.f11852b = true;
        }
    }

    /* loaded from: classes3.dex */
    private class f implements b.a {
        private f() {
        }

        @Override // cg.b.a
        public void a() {
            Iterator it2 = FabricUIManager.this.mListeners.iterator();
            while (it2.hasNext()) {
                ((UIManagerListener) it2.next()).didDispatchMountItems(FabricUIManager.this);
            }
        }

        /* synthetic */ f(FabricUIManager fabricUIManager, a aVar) {
            this();
        }
    }

    static {
        ENABLE_FABRIC_LOGS = ReactFeatureFlags.enableFabricLogs || xd.c.a().b(yd.a.f59449e);
        com.facebook.react.fabric.b.a();
    }

    @Deprecated
    public FabricUIManager(ReactApplicationContext reactApplicationContext, d1 d1Var, com.facebook.react.uimanager.events.d dVar, EventBeatManager eventBeatManager) {
        this.mShouldDeallocateEventDispatcher = false;
        this.mDispatchUIFrameCallback = new e(this, reactApplicationContext, null);
        this.mReactApplicationContext = reactApplicationContext;
        cg.c cVar = new cg.c(d1Var, this.mMountItemExecutor);
        this.mMountingManager = cVar;
        this.mMountItemDispatcher = new cg.b(cVar, new f(this, null));
        this.mEventDispatcher = dVar;
        this.mShouldDeallocateEventDispatcher = false;
        this.mEventBeatManager = eventBeatManager;
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private dg.d createIntBufferBatchMountItem(int i11, int[] iArr, Object[] objArr, int i12) {
        return new IntBufferBatchMountItem(i11, iArr, objArr, i12);
    }

    private long measure(int i11, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f11, float f12, float f13, float f14) {
        return measure(i11, str, readableMap, readableMap2, readableMap3, f11, f12, f13, f14, null);
    }

    private NativeArray measureLines(ReadableMap readableMap, ReadableMap readableMap2, float f11, float f12) {
        return (NativeArray) c0.g(this.mReactApplicationContext, readableMap, readableMap2, p.c(f11));
    }

    private NativeArray measureLinesMapBuffer(ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f11, float f12) {
        return (NativeArray) d0.f(this.mReactApplicationContext, readableMapBuffer, readableMapBuffer2, p.c(f11));
    }

    private long measureMapBuffer(int i11, String str, ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f11, float f12, float f13, float f14, float[] fArr) {
        ReactContext reactContext;
        if (i11 > 0) {
            cg.d e11 = this.mMountingManager.e(i11, "measure");
            if (e11.C()) {
                return 0L;
            }
            reactContext = e11.t();
        } else {
            reactContext = this.mReactApplicationContext;
        }
        return this.mMountingManager.l(reactContext, str, readableMapBuffer, readableMapBuffer2, cg.a.d(f11, f12), cg.a.c(f11, f12), cg.a.d(f13, f14), cg.a.c(f13, f14), fArr);
    }

    private void preallocateView(int i11, int i12, String str, ReadableMap readableMap, Object obj, Object obj2, boolean z11) {
        this.mMountItemDispatcher.b(new dg.e(i11, i12, com.facebook.react.fabric.a.a(str), readableMap, (m0) obj, (EventEmitterWrapper) obj2, z11));
    }

    private void scheduleMountItem(dg.d dVar, int i11, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z11 = dVar instanceof IntBufferBatchMountItem;
        boolean z12 = (z11 && ((IntBufferBatchMountItem) dVar).h()) || !(z11 || dVar == null);
        for (Iterator<UIManagerListener> it2 = this.mListeners.iterator(); it2.hasNext(); it2 = it2) {
            it2.next().didScheduleMountItems(this);
        }
        if (z11) {
            this.mCommitStartTime = j11;
            this.mLayoutTime = j15 - j14;
            this.mFinishTransactionCPPTime = j17 - j16;
            this.mFinishTransactionTime = uptimeMillis - j16;
            this.mDispatchViewUpdatesTime = SystemClock.uptimeMillis();
        }
        if (z12) {
            this.mMountItemDispatcher.a(dVar);
            if (UiThreadUtil.isOnUiThread()) {
                this.mMountItemDispatcher.q();
            }
        }
        if (z11) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_START, null, i11, j11);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START, null, i11, j16);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END, null, i11, j17);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_START, null, i11, j12);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_END, null, i11, j13);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_START, null, i11, j14);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_END, null, i11, j15);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_END, null, i11);
            if (ENABLE_FABRIC_LOGS) {
                String str = TAG;
                nd.a.o(str, "Statistic of Fabric commit #: " + i11 + "\n - Total commit time: " + (j17 - j11) + " ms.\n - Layout: " + this.mLayoutTime + " ms.\n - Diffing: " + (j13 - j12) + " ms.\n - FinishTransaction (Diffing + Processing + Serialization of MountingInstructions): " + this.mFinishTransactionCPPTime + " ms.");
            }
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public <T extends View> int addRootView(T t11, WritableMap writableMap, String str) {
        String str2 = TAG;
        ReactSoftExceptionLogger.logSoftException(str2, new IllegalViewOperationException("Do not call addRootView in Fabric; it is unsupported. Call startSurface instead."));
        int a11 = b0.a();
        a0 a0Var = (a0) t11;
        this.mMountingManager.p(a11, new n0(this.mReactApplicationContext, t11.getContext(), a0Var.getSurfaceID(), a11), t11);
        String jSModuleName = a0Var.getJSModuleName();
        if (ENABLE_FABRIC_LOGS) {
            nd.a.d(str2, "Starting surface for module: %s and reactTag: %d", jSModuleName, Integer.valueOf(a11));
        }
        this.mBinding.startSurface(a11, jSModuleName, (NativeMap) writableMap);
        if (str != null) {
            this.mBinding.renderTemplateToSurface(a11, str);
        }
        return a11;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.add(uIManagerListener);
    }

    public void attachRootView(com.facebook.react.fabric.d dVar, View view) {
        this.mMountingManager.a(dVar.a(), view, new n0(this.mReactApplicationContext, view.getContext(), dVar.d(), dVar.a()));
        dVar.c(true);
    }

    public void clearJSResponder() {
        this.mMountItemDispatcher.a(new d(this));
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i11, int i12, ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    public int getColor(int i11, ReadableMap readableMap) {
        Integer color = ColorPropConverter.getColor(readableMap, this.mMountingManager.e(i11, "getColor").t());
        if (color != null) {
            return color.intValue();
        }
        return 0;
    }

    public ReadableMap getInspectorDataForInstance(int i11, View view) {
        UiThreadUtil.assertOnUiThread();
        return this.mBinding.getInspectorDataForInstance(this.mMountingManager.c(i11, view.getId()));
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.mCommitStartTime));
        hashMap.put("LayoutTime", Long.valueOf(this.mLayoutTime));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.mDispatchViewUpdatesTime));
        hashMap.put("RunStartTime", Long.valueOf(this.mMountItemDispatcher.n()));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.mMountItemDispatcher.m()));
        hashMap.put("FinishFabricTransactionTime", Long.valueOf(this.mFinishTransactionTime));
        hashMap.put("FinishFabricTransactionCPPTime", Long.valueOf(this.mFinishTransactionCPPTime));
        return hashMap;
    }

    public boolean getThemeData(int i11, float[] fArr) {
        n0 t11 = this.mMountingManager.e(i11, "getThemeData").t();
        if (t11 == null) {
            nd.a.G(TAG, "\"themedReactContext\" is null when call \"getThemeData\"");
            return false;
        }
        float[] a11 = t0.a(t11);
        fArr[0] = a11[0];
        fArr[1] = a11[1];
        fArr[2] = a11[2];
        fArr[3] = a11[3];
        return true;
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void initialize() {
        this.mEventDispatcher.i(2, new FabricEventEmitter(this));
        this.mEventDispatcher.c(this.mEventBeatManager);
    }

    public void onAllAnimationsComplete() {
        this.mDriveCxxAnimations = false;
    }

    public void onAnimationStarted() {
        this.mDriveCxxAnimations = true;
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void onCatalystInstanceDestroy() {
        String str = TAG;
        nd.a.o(str, "FabricUIManager.onCatalystInstanceDestroy");
        if (this.mDestroyed) {
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot double-destroy FabricUIManager"));
            return;
        }
        this.mDestroyed = true;
        this.mDispatchUIFrameCallback.a();
        this.mEventDispatcher.h(this.mEventBeatManager);
        this.mEventDispatcher.e(2);
        this.mReactApplicationContext.removeLifecycleEventListener(this);
        onHostPause();
        this.mDispatchUIFrameCallback.a();
        this.mBinding.a();
        this.mBinding = null;
        c1.a();
        if (this.mShouldDeallocateEventDispatcher) {
            this.mEventDispatcher.d();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        g.i().o(g.c.DISPATCH_UI, this.mDispatchUIFrameCallback);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        g.i().m(g.c.DISPATCH_UI, this.mDispatchUIFrameCallback);
    }

    public void onRequestEventBeat() {
        this.mEventDispatcher.b();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void preInitializeViewManagers(List<String> list) {
        for (String str : list) {
            this.mMountingManager.i(str);
        }
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i11, String str, WritableMap writableMap) {
        receiveEvent(-1, i11, str, writableMap);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.remove(uIManagerListener);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("top")) {
            return "on" + str.substring(3);
        }
        return str;
    }

    @Override // com.facebook.react.bridge.UIManager
    public View resolveView(int i11) {
        UiThreadUtil.assertOnUiThread();
        cg.d f11 = this.mMountingManager.f(i11);
        if (f11 == null) {
            return null;
        }
        return f11.x(i11);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sendAccessibilityEvent(int i11, int i12) {
        this.mMountItemDispatcher.a(new dg.f(-1, i11, i12));
    }

    public void sendAccessibilityEventFromJS(int i11, int i12, String str) {
        int i13;
        if ("focus".equals(str)) {
            i13 = 8;
        } else if ("windowStateChange".equals(str)) {
            i13 = 32;
        } else if (!"click".equals(str)) {
            throw new IllegalArgumentException("sendAccessibilityEventFromJS: invalid eventType " + str);
        } else {
            i13 = 1;
        }
        this.mMountItemDispatcher.a(new dg.f(i11, i12, i13));
    }

    public void setBinding(Binding binding) {
        this.mBinding = binding;
    }

    public void setJSResponder(int i11, int i12, int i13, boolean z11) {
        this.mMountItemDispatcher.a(new c(this, i11, i12, i13, z11));
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t11, String str, WritableMap writableMap, int i11, int i12) {
        int a11 = b0.a();
        Context context = t11.getContext();
        n0 n0Var = new n0(this.mReactApplicationContext, context, str, a11);
        if (ENABLE_FABRIC_LOGS) {
            nd.a.d(TAG, "Starting surface for module: %s and reactTag: %d", str, Integer.valueOf(a11));
        }
        this.mMountingManager.p(a11, n0Var, t11);
        Point b11 = UiThreadUtil.isOnUiThread() ? j0.b(t11) : new Point(0, 0);
        this.mBinding.startSurfaceWithConstraints(a11, str, (NativeMap) writableMap, cg.a.b(i11), cg.a.a(i11), cg.a.b(i12), cg.a.a(i12), b11.x, b11.y, jg.a.d().g(context), jg.a.d().b(context));
        return a11;
    }

    public void stopSurface(com.facebook.react.fabric.d dVar) {
        if (!dVar.isRunning()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Trying to stop surface that hasn't started yet"));
            return;
        }
        this.mMountingManager.q(dVar.a());
        dVar.stop();
        if (dVar instanceof SurfaceHandlerBinding) {
            this.mBinding.unregisterSurface((SurfaceHandlerBinding) dVar);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i11, ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        int i12 = this.mCurrentSynchronousCommitNumber;
        this.mCurrentSynchronousCommitNumber = i12 + 1;
        b bVar = new b(this, i11, readableMap);
        if (!this.mMountingManager.h(i11)) {
            this.mMountItemDispatcher.a(bVar);
            return;
        }
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START, null, i12);
        if (ENABLE_FABRIC_LOGS) {
            nd.a.d(TAG, "SynchronouslyUpdateViewOnUIThread for tag %d: %s", Integer.valueOf(i11), "<hidden>");
        }
        bVar.b(this.mMountingManager);
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END, null, i12);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i11, int i12, int i13, int i14, int i15) {
        boolean z11;
        boolean z12;
        if (ENABLE_FABRIC_LOGS) {
            nd.a.c(TAG, "Updating Root Layout Specs for [%d]", Integer.valueOf(i11));
        }
        cg.d d11 = this.mMountingManager.d(i11);
        if (d11 == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalViewOperationException("Cannot updateRootLayoutSpecs on surfaceId that does not exist: " + i11));
            return;
        }
        n0 t11 = d11.t();
        if (t11 != null) {
            boolean g11 = jg.a.d().g(t11);
            z12 = jg.a.d().b(t11);
            z11 = g11;
        } else {
            z11 = false;
            z12 = false;
        }
        this.mBinding.setConstraints(i11, cg.a.b(i12), cg.a.a(i12), cg.a.b(i13), cg.a.a(i13), i14, i15, z11, z12);
    }

    private long measure(int i11, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f11, float f12, float f13, float f14, float[] fArr) {
        ReactContext reactContext;
        if (i11 > 0) {
            cg.d e11 = this.mMountingManager.e(i11, "measure");
            if (e11.C()) {
                return 0L;
            }
            reactContext = e11.t();
        } else {
            reactContext = this.mReactApplicationContext;
        }
        return this.mMountingManager.k(reactContext, str, readableMap, readableMap2, readableMap3, cg.a.d(f11, f12), cg.a.c(f11, f12), cg.a.d(f13, f14), cg.a.c(f13, f14), fArr);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i11, String str, ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    @Override // com.facebook.react.bridge.UIManager
    public com.facebook.react.uimanager.events.d getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i11, int i12, String str, WritableMap writableMap) {
        receiveEvent(i11, i12, str, false, 0, writableMap);
    }

    @Deprecated
    public void dispatchCommand(int i11, int i12, int i13, ReadableArray readableArray) {
        this.mMountItemDispatcher.d(new dg.b(i11, i12, i13, readableArray));
    }

    public void receiveEvent(int i11, int i12, String str, boolean z11, int i13, WritableMap writableMap) {
        receiveEvent(i11, i12, str, z11, i13, writableMap, 2);
    }

    public void dispatchCommand(int i11, int i12, String str, ReadableArray readableArray) {
        this.mMountItemDispatcher.d(new dg.c(i11, i12, str, readableArray));
    }

    public void receiveEvent(int i11, int i12, String str, boolean z11, int i13, WritableMap writableMap, int i14) {
        if (this.mDestroyed) {
            nd.a.j(TAG, "Attempted to receiveEvent after destruction");
            return;
        }
        EventEmitterWrapper c11 = this.mMountingManager.c(i11, i12);
        if (c11 != null) {
            if (z11) {
                c11.c(str, writableMap, i13);
                return;
            } else {
                c11.b(str, writableMap, i14);
                return;
            }
        }
        String str2 = TAG;
        nd.a.b(str2, "Unable to invoke event: " + str + " for reactTag: " + i12);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i11) {
        this.mMountingManager.q(i11);
        this.mBinding.stopSurface(i11);
    }

    public void startSurface(com.facebook.react.fabric.d dVar, Context context, View view) {
        int a11 = b0.a();
        this.mMountingManager.p(a11, new n0(this.mReactApplicationContext, context, dVar.d(), a11), view);
        dVar.b(a11);
        if (dVar instanceof SurfaceHandlerBinding) {
            this.mBinding.registerSurface((SurfaceHandlerBinding) dVar);
        }
        dVar.c(view != null);
        dVar.start();
    }

    public FabricUIManager(ReactApplicationContext reactApplicationContext, d1 d1Var, EventBeatManager eventBeatManager) {
        com.facebook.react.uimanager.events.d eVar;
        this.mShouldDeallocateEventDispatcher = false;
        this.mDispatchUIFrameCallback = new e(this, reactApplicationContext, null);
        this.mReactApplicationContext = reactApplicationContext;
        cg.c cVar = new cg.c(d1Var, this.mMountItemExecutor);
        this.mMountingManager = cVar;
        this.mMountItemDispatcher = new cg.b(cVar, new f(this, null));
        if (ReactFeatureFlags.enableLockFreeEventDispatcher) {
            eVar = new h(reactApplicationContext);
        } else {
            eVar = new com.facebook.react.uimanager.events.e(reactApplicationContext);
        }
        this.mEventDispatcher = eVar;
        this.mShouldDeallocateEventDispatcher = true;
        this.mEventBeatManager = eventBeatManager;
        reactApplicationContext.addLifecycleEventListener(this);
    }
}