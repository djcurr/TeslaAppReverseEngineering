package com.swmansion.reanimated;

import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.e0;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import com.facebook.react.uimanager.events.f;
import com.facebook.react.uimanager.r0;
import com.facebook.react.uimanager.x0;
import com.swmansion.reanimated.layoutReanimation.AnimationsManager;
import com.swmansion.reanimated.nodes.AlwaysNode;
import com.swmansion.reanimated.nodes.BezierNode;
import com.swmansion.reanimated.nodes.BlockNode;
import com.swmansion.reanimated.nodes.CallFuncNode;
import com.swmansion.reanimated.nodes.ClockNode;
import com.swmansion.reanimated.nodes.ClockOpNode;
import com.swmansion.reanimated.nodes.ConcatNode;
import com.swmansion.reanimated.nodes.CondNode;
import com.swmansion.reanimated.nodes.DebugNode;
import com.swmansion.reanimated.nodes.EventNode;
import com.swmansion.reanimated.nodes.FunctionNode;
import com.swmansion.reanimated.nodes.JSCallNode;
import com.swmansion.reanimated.nodes.Node;
import com.swmansion.reanimated.nodes.NoopNode;
import com.swmansion.reanimated.nodes.OperatorNode;
import com.swmansion.reanimated.nodes.ParamNode;
import com.swmansion.reanimated.nodes.PropsNode;
import com.swmansion.reanimated.nodes.SetNode;
import com.swmansion.reanimated.nodes.StyleNode;
import com.swmansion.reanimated.nodes.TransformNode;
import com.swmansion.reanimated.nodes.ValueNode;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class NodesManager implements f {
    private static final Double ZERO = Double.valueOf(0.0d);
    public double currentFrameTimeMs;
    private AnimationsManager mAnimationManager;
    private final com.facebook.react.uimanager.f mChoreographerCallback;
    private final ReactContext mContext;
    private RCTEventEmitter mCustomEventHandler;
    protected final UIManagerModule.d mCustomEventNamesResolver;
    private final DeviceEventManagerModule.RCTDeviceEventEmitter mEventEmitter;
    private NativeProxy mNativeProxy;
    private final NoopNode mNoopNode;
    private final g mReactChoreographer;
    private final r0 mUIImplementation;
    private final UIManagerModule mUIManager;
    private boolean mWantRunUpdates;
    public final UpdateContext updateContext;
    private final SparseArray<Node> mAnimatedNodes = new SparseArray<>();
    private final Map<String, EventNode> mEventMapping = new HashMap();
    private final AtomicBoolean mCallbackPosted = new AtomicBoolean();
    private List<OnAnimationFrame> mFrameCallbacks = new ArrayList();
    private ConcurrentLinkedQueue<CopiedEvent> mEventQueue = new ConcurrentLinkedQueue<>();
    public Set<String> uiProps = Collections.emptySet();
    public Set<String> nativeProps = Collections.emptySet();
    private Queue<NativeUpdateOperation> mOperationsInBatch = new LinkedList();
    private boolean mTryRunBatchUpdatesSynchronously = false;

    /* renamed from: com.swmansion.reanimated.NodesManager$3 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Null.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public final class NativeUpdateOperation {
        public WritableMap mNativeProps;
        public int mViewTag;

        public NativeUpdateOperation(int i11, WritableMap writableMap) {
            NodesManager.this = r1;
            this.mViewTag = i11;
            this.mNativeProps = writableMap;
        }
    }

    /* loaded from: classes6.dex */
    public interface OnAnimationFrame {
        void onAnimationFrame(double d11);
    }

    public NodesManager(ReactContext reactContext) {
        this.mAnimationManager = null;
        this.mContext = reactContext;
        UIManagerModule uIManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.mUIManager = uIManagerModule;
        this.updateContext = new UpdateContext();
        r0 uIImplementation = uIManagerModule.getUIImplementation();
        this.mUIImplementation = uIImplementation;
        this.mCustomEventNamesResolver = uIManagerModule.getDirectEventNamesResolver();
        this.mEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        this.mReactChoreographer = g.i();
        this.mChoreographerCallback = new com.facebook.react.uimanager.f(reactContext) { // from class: com.swmansion.reanimated.NodesManager.1
            {
                NodesManager.this = this;
            }

            @Override // com.facebook.react.uimanager.f
            protected void doFrameGuarded(long j11) {
                NodesManager.this.onAnimationFrame(j11);
            }
        };
        this.mNoopNode = new NoopNode(this);
        uIManagerModule.getEventDispatcher().f(this);
        this.mAnimationManager = new AnimationsManager(reactContext, uIImplementation, uIManagerModule);
    }

    private static void addProp(WritableMap writableMap, String str, Object obj) {
        if (obj == null) {
            writableMap.putNull(str);
        } else if (obj instanceof Double) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Integer) {
            writableMap.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Number) {
            writableMap.putDouble(str, ((Number) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
        } else if (obj instanceof ReadableArray) {
            if (!(obj instanceof WritableArray)) {
                writableMap.putArray(str, copyReadableArray((ReadableArray) obj));
            } else {
                writableMap.putArray(str, (ReadableArray) obj);
            }
        } else if (obj instanceof ReadableMap) {
            if (!(obj instanceof WritableMap)) {
                writableMap.putMap(str, copyReadableMap((ReadableMap) obj));
            } else {
                writableMap.putMap(str, (ReadableMap) obj);
            }
        } else {
            throw new IllegalStateException("Unknown type of animated value");
        }
    }

    private static WritableArray copyReadableArray(ReadableArray readableArray) {
        WritableArray createArray = Arguments.createArray();
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            switch (AnonymousClass3.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i11).ordinal()]) {
                case 1:
                    createArray.pushBoolean(readableArray.getBoolean(i11));
                    break;
                case 2:
                    createArray.pushString(readableArray.getString(i11));
                    break;
                case 3:
                    createArray.pushNull();
                    break;
                case 4:
                    createArray.pushDouble(readableArray.getDouble(i11));
                    break;
                case 5:
                    createArray.pushMap(copyReadableMap(readableArray.getMap(i11)));
                    break;
                case 6:
                    createArray.pushArray(copyReadableArray(readableArray.getArray(i11)));
                    break;
                default:
                    throw new IllegalStateException("Unknown type of ReadableArray");
            }
        }
        return createArray;
    }

    private static WritableMap copyReadableMap(ReadableMap readableMap) {
        WritableMap createMap = Arguments.createMap();
        createMap.merge(readableMap);
        return createMap;
    }

    private void handleEvent(c cVar) {
        EventNode eventNode;
        String a11 = this.mCustomEventNamesResolver.a(cVar.getEventName());
        String str = cVar.getViewTag() + a11;
        RCTEventEmitter rCTEventEmitter = this.mCustomEventHandler;
        if (rCTEventEmitter != null) {
            cVar.dispatch(rCTEventEmitter);
        }
        if (this.mEventMapping.isEmpty() || (eventNode = this.mEventMapping.get(str)) == null) {
            return;
        }
        cVar.dispatch(eventNode);
    }

    public void onAnimationFrame(long j11) {
        this.currentFrameTimeMs = j11 / 1000000.0d;
        while (!this.mEventQueue.isEmpty()) {
            CopiedEvent poll = this.mEventQueue.poll();
            handleEvent(poll.getTargetTag(), poll.getEventName(), poll.getPayload());
        }
        if (!this.mFrameCallbacks.isEmpty()) {
            List<OnAnimationFrame> list = this.mFrameCallbacks;
            this.mFrameCallbacks = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                list.get(i11).onAnimationFrame(this.currentFrameTimeMs);
            }
        }
        if (this.mWantRunUpdates) {
            Node.runUpdates(this.updateContext);
        }
        performOperations();
        this.mCallbackPosted.set(false);
        this.mWantRunUpdates = false;
        if (this.mFrameCallbacks.isEmpty() && this.mEventQueue.isEmpty()) {
            return;
        }
        startUpdatingOnAnimationFrame();
    }

    private void performOperations() {
        if (this.mOperationsInBatch.isEmpty()) {
            return;
        }
        final Queue<NativeUpdateOperation> queue = this.mOperationsInBatch;
        this.mOperationsInBatch = new LinkedList();
        final boolean z11 = this.mTryRunBatchUpdatesSynchronously;
        this.mTryRunBatchUpdatesSynchronously = false;
        final Semaphore semaphore = new Semaphore(0);
        ReactContext reactContext = this.mContext;
        reactContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactContext.getExceptionHandler()) { // from class: com.swmansion.reanimated.NodesManager.2
            {
                NodesManager.this = this;
            }

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                boolean a11 = x0.a(NodesManager.this.mUIImplementation);
                boolean z12 = z11 && a11;
                if (!z12) {
                    semaphore.release();
                }
                while (!queue.isEmpty()) {
                    NativeUpdateOperation nativeUpdateOperation = (NativeUpdateOperation) queue.remove();
                    c0 R = NodesManager.this.mUIImplementation.R(nativeUpdateOperation.mViewTag);
                    if (R != null) {
                        NodesManager.this.mUIManager.updateView(nativeUpdateOperation.mViewTag, R.u(), nativeUpdateOperation.mNativeProps);
                    }
                }
                if (a11) {
                    NodesManager.this.mUIImplementation.n(-1);
                }
                if (z12) {
                    semaphore.release();
                }
            }
        });
        if (!z11) {
            return;
        }
        while (true) {
            try {
                semaphore.acquire();
                return;
            } catch (InterruptedException unused) {
            }
        }
    }

    private void stopUpdatingOnAnimationFrame() {
        if (this.mCallbackPosted.getAndSet(false)) {
            this.mReactChoreographer.o(g.c.NATIVE_ANIMATED_MODULE, this.mChoreographerCallback);
        }
    }

    public void attachEvent(int i11, String str, int i12) {
        String str2 = i11 + str;
        EventNode eventNode = (EventNode) this.mAnimatedNodes.get(i12);
        if (eventNode != null) {
            if (!this.mEventMapping.containsKey(str2)) {
                this.mEventMapping.put(str2, eventNode);
                return;
            }
            throw new JSApplicationIllegalArgumentException("Event handler already set for the given view and event type");
        }
        throw new JSApplicationIllegalArgumentException("Event node " + i12 + " does not exists");
    }

    public void configureProps(Set<String> set, Set<String> set2) {
        this.uiProps = set;
        this.nativeProps = set2;
    }

    public void connectNodeToView(int i11, int i12) {
        Node node = this.mAnimatedNodes.get(i11);
        if (node != null) {
            if (node instanceof PropsNode) {
                ((PropsNode) node).connectToView(i12);
                return;
            }
            throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + PropsNode.class.getName());
        }
        throw new JSApplicationIllegalArgumentException("Animated node with ID " + i11 + " does not exists");
    }

    public void connectNodes(int i11, int i12) {
        Node node = this.mAnimatedNodes.get(i11);
        Node node2 = this.mAnimatedNodes.get(i12);
        if (node2 != null) {
            node.addChild(node2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with ID " + i12 + " does not exists");
    }

    public void createNode(int i11, ReadableMap readableMap) {
        Node callFuncNode;
        if (this.mAnimatedNodes.get(i11) == null) {
            String string = readableMap.getString("type");
            if ("props".equals(string)) {
                callFuncNode = new PropsNode(i11, readableMap, this, this.mUIImplementation);
            } else if ("style".equals(string)) {
                callFuncNode = new StyleNode(i11, readableMap, this);
            } else if ("transform".equals(string)) {
                callFuncNode = new TransformNode(i11, readableMap, this);
            } else if ("value".equals(string)) {
                callFuncNode = new ValueNode(i11, readableMap, this);
            } else if ("block".equals(string)) {
                callFuncNode = new BlockNode(i11, readableMap, this);
            } else if ("cond".equals(string)) {
                callFuncNode = new CondNode(i11, readableMap, this);
            } else if ("op".equals(string)) {
                callFuncNode = new OperatorNode(i11, readableMap, this);
            } else if ("set".equals(string)) {
                callFuncNode = new SetNode(i11, readableMap, this);
            } else if (BuildConfig.BUILD_TYPE.equals(string)) {
                callFuncNode = new DebugNode(i11, readableMap, this);
            } else if ("clock".equals(string)) {
                callFuncNode = new ClockNode(i11, readableMap, this);
            } else if ("clockStart".equals(string)) {
                callFuncNode = new ClockOpNode.ClockStartNode(i11, readableMap, this);
            } else if ("clockStop".equals(string)) {
                callFuncNode = new ClockOpNode.ClockStopNode(i11, readableMap, this);
            } else if ("clockTest".equals(string)) {
                callFuncNode = new ClockOpNode.ClockTestNode(i11, readableMap, this);
            } else if ("call".equals(string)) {
                callFuncNode = new JSCallNode(i11, readableMap, this);
            } else if ("bezier".equals(string)) {
                callFuncNode = new BezierNode(i11, readableMap, this);
            } else if ("event".equals(string)) {
                callFuncNode = new EventNode(i11, readableMap, this);
            } else if (PermissionsResponse.SCOPE_ALWAYS.equals(string)) {
                callFuncNode = new AlwaysNode(i11, readableMap, this);
            } else if ("concat".equals(string)) {
                callFuncNode = new ConcatNode(i11, readableMap, this);
            } else if ("param".equals(string)) {
                callFuncNode = new ParamNode(i11, readableMap, this);
            } else if ("func".equals(string)) {
                callFuncNode = new FunctionNode(i11, readableMap, this);
            } else if ("callfunc".equals(string)) {
                callFuncNode = new CallFuncNode(i11, readableMap, this);
            } else {
                throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
            }
            this.mAnimatedNodes.put(i11, callFuncNode);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with ID " + i11 + " already exists");
    }

    public void detachEvent(int i11, String str, int i12) {
        this.mEventMapping.remove(i11 + str);
    }

    public void disconnectNodeFromView(int i11, int i12) {
        Node node = this.mAnimatedNodes.get(i11);
        if (node != null) {
            if (node instanceof PropsNode) {
                ((PropsNode) node).disconnectFromView(i12);
                return;
            }
            throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + PropsNode.class.getName());
        }
        throw new JSApplicationIllegalArgumentException("Animated node with ID " + i11 + " does not exists");
    }

    public void disconnectNodes(int i11, int i12) {
        Node node = this.mAnimatedNodes.get(i11);
        Node node2 = this.mAnimatedNodes.get(i12);
        if (node2 != null) {
            node.removeChild(node2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with ID " + i12 + " does not exists");
    }

    public void dropNode(int i11) {
        Node node = this.mAnimatedNodes.get(i11);
        if (node != null) {
            node.onDrop();
        }
        this.mAnimatedNodes.remove(i11);
    }

    public void enqueueUpdateViewOnNativeThread(int i11, WritableMap writableMap, boolean z11) {
        if (z11) {
            this.mTryRunBatchUpdatesSynchronously = true;
        }
        this.mOperationsInBatch.add(new NativeUpdateOperation(i11, writableMap));
    }

    public <T extends Node> T findNodeById(int i11, Class<T> cls) {
        T t11 = (T) this.mAnimatedNodes.get(i11);
        if (t11 == null) {
            if (cls != Node.class && cls != ValueNode.class) {
                throw new IllegalArgumentException("Requested node with id " + i11 + " of type " + cls + " cannot be found");
            }
            return this.mNoopNode;
        } else if (cls.isInstance(t11)) {
            return t11;
        } else {
            throw new IllegalArgumentException("Node with id " + i11 + " is of incompatible type " + t11.getClass() + ", requested type was " + cls);
        }
    }

    public AnimationsManager getAnimationsManager() {
        return this.mAnimationManager;
    }

    public UIManagerModule.d getEventNameResolver() {
        return this.mCustomEventNamesResolver;
    }

    public NativeProxy getNativeProxy() {
        return this.mNativeProxy;
    }

    public Object getNodeValue(int i11) {
        Node node = this.mAnimatedNodes.get(i11);
        if (node != null) {
            return node.value();
        }
        return ZERO;
    }

    public void getValue(int i11, Callback callback) {
        callback.invoke(this.mAnimatedNodes.get(i11).value());
    }

    public void initWithContext(ReactApplicationContext reactApplicationContext) {
        this.mNativeProxy = new NativeProxy(reactApplicationContext);
        this.mAnimationManager.setScheduler(getNativeProxy().getScheduler());
    }

    public float[] measure(int i11) {
        try {
            return NativeMethodsHelper.measure(this.mUIManager.resolveView(i11));
        } catch (IllegalViewOperationException e11) {
            e11.printStackTrace();
            return new float[0];
        }
    }

    public String obtainProp(int i11, String str) {
        View resolveView = this.mUIManager.resolveView(i11);
        String str2 = "error: unknown propName " + str + ", currently supported: opacity, zIndex";
        if (str.equals("opacity")) {
            return Float.toString(Float.valueOf(resolveView.getAlpha()).floatValue());
        }
        return str.equals("zIndex") ? Float.toString(Float.valueOf(resolveView.getElevation()).floatValue()) : str2;
    }

    public void onCatalystInstanceDestroy() {
        AnimationsManager animationsManager = this.mAnimationManager;
        if (animationsManager != null) {
            animationsManager.onCatalystInstanceDestroy();
        }
        NativeProxy nativeProxy = this.mNativeProxy;
        if (nativeProxy != null) {
            nativeProxy.onCatalystInstanceDestroy();
            this.mNativeProxy = null;
        }
    }

    @Override // com.facebook.react.uimanager.events.f
    public void onEventDispatch(c cVar) {
        NativeProxy nativeProxy;
        if (UiThreadUtil.isOnUiThread()) {
            handleEvent(cVar);
            performOperations();
            return;
        }
        String a11 = this.mCustomEventNamesResolver.a(cVar.getEventName());
        int viewTag = cVar.getViewTag();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(viewTag);
        sb2.append(a11);
        if (((this.mCustomEventHandler == null || (nativeProxy = this.mNativeProxy) == null || !nativeProxy.isAnyHandlerWaitingForEvent(sb2.toString())) ? false : true) | false) {
            this.mEventQueue.offer(new CopiedEvent(cVar));
        }
        startUpdatingOnAnimationFrame();
    }

    public void onHostPause() {
        if (this.mCallbackPosted.get()) {
            stopUpdatingOnAnimationFrame();
            this.mCallbackPosted.set(true);
        }
    }

    public void onHostResume() {
        if (this.mCallbackPosted.getAndSet(false)) {
            startUpdatingOnAnimationFrame();
        }
    }

    public void postOnAnimation(OnAnimationFrame onAnimationFrame) {
        this.mFrameCallbacks.add(onAnimationFrame);
        startUpdatingOnAnimationFrame();
    }

    public void postRunUpdatesAfterAnimation() {
        this.mWantRunUpdates = true;
        startUpdatingOnAnimationFrame();
    }

    public void registerEventHandler(RCTEventEmitter rCTEventEmitter) {
        this.mCustomEventHandler = rCTEventEmitter;
    }

    public void scrollTo(int i11, double d11, double d12, boolean z11) {
        try {
            NativeMethodsHelper.scrollTo(this.mUIManager.resolveView(i11), d11, d12, z11);
        } catch (IllegalViewOperationException e11) {
            e11.printStackTrace();
        }
    }

    public void sendEvent(String str, WritableMap writableMap) {
        this.mEventEmitter.emit(str, writableMap);
    }

    public void setValue(int i11, Double d11) {
        Node node = this.mAnimatedNodes.get(i11);
        if (node != null) {
            ((ValueNode) node).setValue(d11);
        }
    }

    public void startUpdatingOnAnimationFrame() {
        if (this.mCallbackPosted.getAndSet(true)) {
            return;
        }
        this.mReactChoreographer.m(g.c.NATIVE_ANIMATED_MODULE, this.mChoreographerCallback);
    }

    public void updateProps(int i11, Map<String, Object> map) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (this.uiProps.contains(key)) {
                addProp(javaOnlyMap, key, value);
                z11 = true;
            } else if (this.nativeProps.contains(key)) {
                addProp(createMap2, key, value);
                z12 = true;
            } else {
                addProp(createMap, key, value);
                z13 = true;
            }
        }
        if (i11 != -1) {
            if (z11) {
                this.mUIImplementation.a0(i11, new e0(javaOnlyMap));
            }
            if (z12) {
                enqueueUpdateViewOnNativeThread(i11, createMap2, true);
            }
            if (z13) {
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putInt("viewTag", i11);
                createMap3.putMap("props", createMap);
                sendEvent("onReanimatedPropsChange", createMap3);
            }
        }
    }

    private void handleEvent(int i11, String str, WritableMap writableMap) {
        EventNode eventNode;
        RCTEventEmitter rCTEventEmitter = this.mCustomEventHandler;
        if (rCTEventEmitter != null) {
            rCTEventEmitter.receiveEvent(i11, str, writableMap);
        }
        String str2 = i11 + str;
        if (this.mEventMapping.isEmpty() || (eventNode = this.mEventMapping.get(str2)) == null) {
            return;
        }
        eventNode.receiveEvent(i11, str, writableMap);
    }
}