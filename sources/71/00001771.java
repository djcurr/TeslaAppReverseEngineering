package com.facebook.react.animated;

import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.q0;
import com.facebook.react.uimanager.t0;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

@fg.a(name = NativeAnimatedModule.NAME)
/* loaded from: classes3.dex */
public class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, UIManagerListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean ANIMATED_MODULE_DEBUG = false;
    public static final String NAME = "NativeAnimatedModule";
    private final com.facebook.react.uimanager.f mAnimatedFrameCallback;
    private boolean mBatchingControlledByJS;
    private volatile long mCurrentBatchNumber;
    private volatile long mCurrentFrameNumber;
    private boolean mInitializedForFabric;
    private boolean mInitializedForNonFabric;
    private final AtomicReference<com.facebook.react.animated.l> mNodesManager;
    private int mNumFabricAnimations;
    private int mNumNonFabricAnimations;
    private final ConcurrentLinkedQueue<w> mOperations;
    private final ConcurrentLinkedQueue<w> mPreOperations;
    private final com.facebook.react.modules.core.g mReactChoreographer;
    private int mUIManagerType;

    /* loaded from: classes3.dex */
    class a extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11671b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ double f11672c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(NativeAnimatedModule nativeAnimatedModule, int i11, double d11) {
            super(nativeAnimatedModule, null);
            this.f11671b = i11;
            this.f11672c = d11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.v(this.f11671b, this.f11672c);
        }
    }

    /* loaded from: classes3.dex */
    class b extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11673b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(NativeAnimatedModule nativeAnimatedModule, int i11) {
            super(nativeAnimatedModule, null);
            this.f11673b = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.m(this.f11673b);
        }
    }

    /* loaded from: classes3.dex */
    class c extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11674b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(NativeAnimatedModule nativeAnimatedModule, int i11) {
            super(nativeAnimatedModule, null);
            this.f11674b = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.l(this.f11674b);
        }
    }

    /* loaded from: classes3.dex */
    class d extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11675b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f11676c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReadableMap f11677d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Callback f11678e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(NativeAnimatedModule nativeAnimatedModule, int i11, int i12, ReadableMap readableMap, Callback callback) {
            super(nativeAnimatedModule, null);
            this.f11675b = i11;
            this.f11676c = i12;
            this.f11677d = readableMap;
            this.f11678e = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.x(this.f11675b, this.f11676c, this.f11677d, this.f11678e);
        }
    }

    /* loaded from: classes3.dex */
    class e extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11679b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(NativeAnimatedModule nativeAnimatedModule, int i11) {
            super(nativeAnimatedModule, null);
            this.f11679b = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.z(this.f11679b);
        }
    }

    /* loaded from: classes3.dex */
    class f extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11680b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f11681c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(NativeAnimatedModule nativeAnimatedModule, int i11, int i12) {
            super(nativeAnimatedModule, null);
            this.f11680b = i11;
            this.f11681c = i12;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.g(this.f11680b, this.f11681c);
        }
    }

    /* loaded from: classes3.dex */
    class g extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11682b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f11683c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(NativeAnimatedModule nativeAnimatedModule, int i11, int i12) {
            super(nativeAnimatedModule, null);
            this.f11682b = i11;
            this.f11683c = i12;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.j(this.f11682b, this.f11683c);
        }
    }

    /* loaded from: classes3.dex */
    class h extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11684b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f11685c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(NativeAnimatedModule nativeAnimatedModule, int i11, int i12) {
            super(nativeAnimatedModule, null);
            this.f11684b = i11;
            this.f11685c = i12;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.f(this.f11684b, this.f11685c);
        }
    }

    /* loaded from: classes3.dex */
    class i extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11686b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f11687c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(NativeAnimatedModule nativeAnimatedModule, int i11, int i12) {
            super(nativeAnimatedModule, null);
            this.f11686b = i11;
            this.f11687c = i12;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.i(this.f11686b, this.f11687c);
        }
    }

    /* loaded from: classes3.dex */
    class j extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11688b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(NativeAnimatedModule nativeAnimatedModule, int i11) {
            super(nativeAnimatedModule, null);
            this.f11688b = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.t(this.f11688b);
        }
    }

    /* loaded from: classes3.dex */
    class k extends com.facebook.react.uimanager.f {
        k(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.uimanager.f
        protected void doFrameGuarded(long j11) {
            try {
                com.facebook.react.animated.l nodesManager = NativeAnimatedModule.this.getNodesManager();
                if (nodesManager != null && nodesManager.q()) {
                    nodesManager.u(j11);
                }
                if (nodesManager == null && NativeAnimatedModule.this.mReactChoreographer == null) {
                    return;
                }
                ((com.facebook.react.modules.core.g) wf.a.c(NativeAnimatedModule.this.mReactChoreographer)).m(g.c.NATIVE_ANIMATED_MODULE, NativeAnimatedModule.this.mAnimatedFrameCallback);
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    /* loaded from: classes3.dex */
    class l extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11690b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f11691c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReadableMap f11692d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(NativeAnimatedModule nativeAnimatedModule, int i11, String str, ReadableMap readableMap) {
            super(nativeAnimatedModule, null);
            this.f11690b = i11;
            this.f11691c = str;
            this.f11692d = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.e(this.f11690b, this.f11691c, this.f11692d);
        }
    }

    /* loaded from: classes3.dex */
    class m extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11693b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f11694c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f11695d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(NativeAnimatedModule nativeAnimatedModule, int i11, String str, int i12) {
            super(nativeAnimatedModule, null);
            this.f11693b = i11;
            this.f11694c = str;
            this.f11695d = i12;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.s(this.f11693b, this.f11694c, this.f11695d);
        }
    }

    /* loaded from: classes3.dex */
    class n extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11696b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callback f11697c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(NativeAnimatedModule nativeAnimatedModule, int i11, Callback callback) {
            super(nativeAnimatedModule, null);
            this.f11696b = i11;
            this.f11697c = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.o(this.f11696b, this.f11697c);
        }
    }

    /* loaded from: classes3.dex */
    class o implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f11698a;

        o(long j11) {
            this.f11698a = j11;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            NativeAnimatedModule nativeAnimatedModule = NativeAnimatedModule.this;
            nativeAnimatedModule.executeAllOperations(nativeAnimatedModule.mPreOperations, this.f11698a);
        }
    }

    /* loaded from: classes3.dex */
    class p implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f11700a;

        p(long j11) {
            this.f11700a = j11;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            NativeAnimatedModule nativeAnimatedModule = NativeAnimatedModule.this;
            nativeAnimatedModule.executeAllOperations(nativeAnimatedModule.mOperations, this.f11700a);
        }
    }

    /* loaded from: classes3.dex */
    class q extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11702b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReadableMap f11703c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(NativeAnimatedModule nativeAnimatedModule, int i11, ReadableMap readableMap) {
            super(nativeAnimatedModule, null);
            this.f11702b = i11;
            this.f11703c = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.h(this.f11702b, this.f11703c);
        }
    }

    /* loaded from: classes3.dex */
    class r implements com.facebook.react.animated.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11704a;

        r(int i11) {
            this.f11704a = i11;
        }

        @Override // com.facebook.react.animated.c
        public void a(double d11) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("tag", this.f11704a);
            createMap.putDouble("value", d11);
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onAnimatedValueUpdate", createMap);
            }
        }
    }

    /* loaded from: classes3.dex */
    class s extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11706b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.animated.c f11707c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(NativeAnimatedModule nativeAnimatedModule, int i11, com.facebook.react.animated.c cVar) {
            super(nativeAnimatedModule, null);
            this.f11706b = i11;
            this.f11707c = cVar;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.y(this.f11706b, this.f11707c);
        }
    }

    /* loaded from: classes3.dex */
    class t extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11708b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(NativeAnimatedModule nativeAnimatedModule, int i11) {
            super(nativeAnimatedModule, null);
            this.f11708b = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.B(this.f11708b);
        }
    }

    /* loaded from: classes3.dex */
    class u extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11709b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(NativeAnimatedModule nativeAnimatedModule, int i11) {
            super(nativeAnimatedModule, null);
            this.f11709b = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.k(this.f11709b);
        }
    }

    /* loaded from: classes3.dex */
    class v extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11710b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ double f11711c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(NativeAnimatedModule nativeAnimatedModule, int i11, double d11) {
            super(nativeAnimatedModule, null);
            this.f11710b = i11;
            this.f11711c = d11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.w(this.f11710b, this.f11711c);
        }
    }

    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new ConcurrentLinkedQueue<>();
        this.mPreOperations = new ConcurrentLinkedQueue<>();
        this.mNodesManager = new AtomicReference<>();
        this.mBatchingControlledByJS = false;
        this.mInitializedForFabric = false;
        this.mInitializedForNonFabric = false;
        this.mUIManagerType = 1;
        this.mNumFabricAnimations = 0;
        this.mNumNonFabricAnimations = 0;
        this.mReactChoreographer = com.facebook.react.modules.core.g.i();
        this.mAnimatedFrameCallback = new k(reactApplicationContext);
    }

    private void addOperation(w wVar) {
        wVar.c(this.mCurrentBatchNumber);
        this.mOperations.add(wVar);
    }

    private void addPreOperation(w wVar) {
        wVar.c(this.mCurrentBatchNumber);
        this.mPreOperations.add(wVar);
    }

    private void addUnbatchedOperation(w wVar) {
        wVar.c(-1L);
        this.mOperations.add(wVar);
    }

    private void clearFrameCallback() {
        ((com.facebook.react.modules.core.g) wf.a.c(this.mReactChoreographer)).o(g.c.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    private void decrementInFlightAnimationsForViewTag(int i11) {
        if (og.a.a(i11) == 2) {
            this.mNumFabricAnimations--;
        } else {
            this.mNumNonFabricAnimations--;
        }
        int i12 = this.mNumNonFabricAnimations;
        if (i12 == 0 && this.mNumFabricAnimations > 0 && this.mUIManagerType != 2) {
            this.mUIManagerType = 2;
        } else if (this.mNumFabricAnimations != 0 || i12 <= 0 || this.mUIManagerType == 1) {
        } else {
            this.mUIManagerType = 1;
        }
    }

    private void enqueueFrameCallback() {
        ((com.facebook.react.modules.core.g) wf.a.c(this.mReactChoreographer)).m(g.c.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeAllOperations(Queue<w> queue, long j11) {
        w poll;
        com.facebook.react.animated.l nodesManager = getNodesManager();
        while (true) {
            w peek = queue.peek();
            if (peek == null || peek.b() > j11 || (poll = queue.poll()) == null) {
                return;
            }
            poll.a(nodesManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.react.animated.l getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.mNodesManager.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            this.mNodesManager.compareAndSet(null, new com.facebook.react.animated.l(reactApplicationContextIfActiveOrWarn));
        }
        return this.mNodesManager.get();
    }

    private void initializeLifecycleEventListenersForViewTag(int i11) {
        ReactApplicationContext reactApplicationContext;
        UIManager g11;
        int a11 = og.a.a(i11);
        this.mUIManagerType = a11;
        if (a11 == 2) {
            this.mNumFabricAnimations++;
        } else {
            this.mNumNonFabricAnimations++;
        }
        com.facebook.react.animated.l nodesManager = getNodesManager();
        if (nodesManager != null) {
            nodesManager.r(this.mUIManagerType);
        } else {
            ReactSoftExceptionLogger.logSoftException(NAME, new RuntimeException("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if (this.mInitializedForFabric && this.mUIManagerType == 2) {
            return;
        }
        if ((this.mInitializedForNonFabric && this.mUIManagerType == 1) || (reactApplicationContext = getReactApplicationContext()) == null || (g11 = t0.g(reactApplicationContext, this.mUIManagerType)) == null) {
            return;
        }
        g11.addUIManagerEventListener(this);
        if (this.mUIManagerType == 2) {
            this.mInitializedForFabric = true;
        } else {
            this.mInitializedForNonFabric = true;
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addAnimatedEventToView(double d11, String str, ReadableMap readableMap) {
        int i11 = (int) d11;
        initializeLifecycleEventListenersForViewTag(i11);
        addOperation(new l(this, i11, str, readableMap));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodeToView(double d11, double d12) {
        int i11 = (int) d12;
        initializeLifecycleEventListenersForViewTag(i11);
        addOperation(new h(this, (int) d11, i11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodes(double d11, double d12) {
        addOperation(new f(this, (int) d11, (int) d12));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void createAnimatedNode(double d11, ReadableMap readableMap) {
        addOperation(new q(this, (int) d11, readableMap));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uIManager) {
        if (this.mUIManagerType != 2) {
            return;
        }
        long j11 = this.mCurrentBatchNumber - 1;
        if (!this.mBatchingControlledByJS) {
            this.mCurrentFrameNumber++;
            if (this.mCurrentFrameNumber - this.mCurrentBatchNumber > 2) {
                this.mCurrentBatchNumber = this.mCurrentFrameNumber;
                j11 = this.mCurrentBatchNumber;
            }
        }
        executeAllOperations(this.mPreOperations, j11);
        executeAllOperations(this.mOperations, j11);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uIManager) {
        this.mCurrentFrameNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodeFromView(double d11, double d12) {
        int i11 = (int) d12;
        decrementInFlightAnimationsForViewTag(i11);
        addOperation(new i(this, (int) d11, i11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodes(double d11, double d12) {
        addOperation(new g(this, (int) d11, (int) d12));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void dropAnimatedNode(double d11) {
        addOperation(new u(this, (int) d11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void extractAnimatedNodeOffset(double d11) {
        addOperation(new c(this, (int) d11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void finishOperationBatch() {
        this.mBatchingControlledByJS = true;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void flattenAnimatedNodeOffset(double d11) {
        addOperation(new b(this, (int) d11));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void getValue(double d11, Callback callback) {
        addOperation(new n(this, (int) d11, callback));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.addLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeAnimatedEventFromView(double d11, String str, double d12) {
        int i11 = (int) d11;
        decrementInFlightAnimationsForViewTag(i11);
        addOperation(new m(this, i11, str, (int) d12));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeListeners(double d11) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void restoreDefaultValues(double d11) {
        addPreOperation(new j(this, (int) d11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeOffset(double d11, double d12) {
        addOperation(new a(this, (int) d11, d12));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeValue(double d11, double d12) {
        addOperation(new v(this, (int) d11, d12));
    }

    public void setNodesManager(com.facebook.react.animated.l lVar) {
        this.mNodesManager.set(lVar);
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startAnimatingNode(double d11, double d12, ReadableMap readableMap, Callback callback) {
        addUnbatchedOperation(new d(this, (int) d11, (int) d12, readableMap, callback));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startListeningToAnimatedNodeValue(double d11) {
        int i11 = (int) d11;
        addOperation(new s(this, i11, new r(i11)));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startOperationBatch() {
        this.mBatchingControlledByJS = true;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopAnimation(double d11) {
        addOperation(new e(this, (int) d11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopListeningToAnimatedNodeValue(double d11) {
        addOperation(new t(this, (int) d11));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uIManager) {
        if ((this.mOperations.isEmpty() && this.mPreOperations.isEmpty()) || this.mUIManagerType == 2) {
            return;
        }
        long j11 = this.mCurrentBatchNumber;
        this.mCurrentBatchNumber = 1 + j11;
        o oVar = new o(j11);
        p pVar = new p(j11);
        UIManagerModule uIManagerModule = (UIManagerModule) uIManager;
        uIManagerModule.prependUIBlock(oVar);
        uIManagerModule.addUIBlock(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public abstract class w {

        /* renamed from: a  reason: collision with root package name */
        long f11712a;

        private w(NativeAnimatedModule nativeAnimatedModule) {
            this.f11712a = -1L;
        }

        abstract void a(com.facebook.react.animated.l lVar);

        public long b() {
            return this.f11712a;
        }

        public void c(long j11) {
            this.f11712a = j11;
        }

        /* synthetic */ w(NativeAnimatedModule nativeAnimatedModule, k kVar) {
            this(nativeAnimatedModule);
        }
    }
}