package com.swmansion.reanimated;

import android.util.Log;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.q0;
import com.facebook.react.uimanager.w0;
import com.swmansion.reanimated.transitions.TransitionModule;
import java.util.ArrayList;
import java.util.Iterator;

@fg.a(name = ReanimatedModule.NAME)
/* loaded from: classes6.dex */
public class ReanimatedModule extends ReactContextBaseJavaModule implements LifecycleEventListener, w0 {
    public static final String NAME = "ReanimatedModule";
    private NodesManager mNodesManager;
    private ArrayList<UIThreadOperation> mOperations;
    private TransitionModule mTransitionManager;
    private UIManagerModule mUIManager;

    /* loaded from: classes6.dex */
    private interface UIThreadOperation {
        void execute(NodesManager nodesManager);
    }

    public ReanimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new ArrayList<>();
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void animateNextTransition(int i11, ReadableMap readableMap) {
        this.mTransitionManager.animateNextTransition(i11, readableMap);
    }

    @ReactMethod
    public void attachEvent(final int i11, final String str, final int i12) {
        this.mOperations.add(new UIThreadOperation() { // from class: com.swmansion.reanimated.ReanimatedModule.8
            @Override // com.swmansion.reanimated.ReanimatedModule.UIThreadOperation
            public void execute(NodesManager nodesManager) {
                nodesManager.attachEvent(i11, str, i12);
            }
        });
    }

    @ReactMethod
    public void connectNodeToView(final int i11, final int i12) {
        this.mOperations.add(new UIThreadOperation() { // from class: com.swmansion.reanimated.ReanimatedModule.6
            @Override // com.swmansion.reanimated.ReanimatedModule.UIThreadOperation
            public void execute(NodesManager nodesManager) {
                nodesManager.connectNodeToView(i11, i12);
            }
        });
    }

    @ReactMethod
    public void connectNodes(final int i11, final int i12) {
        this.mOperations.add(new UIThreadOperation() { // from class: com.swmansion.reanimated.ReanimatedModule.4
            @Override // com.swmansion.reanimated.ReanimatedModule.UIThreadOperation
            public void execute(NodesManager nodesManager) {
                nodesManager.connectNodes(i11, i12);
            }
        });
    }

    @ReactMethod
    public void createNode(final int i11, final ReadableMap readableMap) {
        this.mOperations.add(new UIThreadOperation() { // from class: com.swmansion.reanimated.ReanimatedModule.2
            @Override // com.swmansion.reanimated.ReanimatedModule.UIThreadOperation
            public void execute(NodesManager nodesManager) {
                nodesManager.createNode(i11, readableMap);
            }
        });
    }

    @ReactMethod
    public void detachEvent(final int i11, final String str, final int i12) {
        this.mOperations.add(new UIThreadOperation() { // from class: com.swmansion.reanimated.ReanimatedModule.9
            @Override // com.swmansion.reanimated.ReanimatedModule.UIThreadOperation
            public void execute(NodesManager nodesManager) {
                nodesManager.detachEvent(i11, str, i12);
            }
        });
    }

    @ReactMethod
    public void disconnectNodeFromView(final int i11, final int i12) {
        this.mOperations.add(new UIThreadOperation() { // from class: com.swmansion.reanimated.ReanimatedModule.7
            @Override // com.swmansion.reanimated.ReanimatedModule.UIThreadOperation
            public void execute(NodesManager nodesManager) {
                nodesManager.disconnectNodeFromView(i11, i12);
            }
        });
    }

    @ReactMethod
    public void disconnectNodes(final int i11, final int i12) {
        this.mOperations.add(new UIThreadOperation() { // from class: com.swmansion.reanimated.ReanimatedModule.5
            @Override // com.swmansion.reanimated.ReanimatedModule.UIThreadOperation
            public void execute(NodesManager nodesManager) {
                nodesManager.disconnectNodes(i11, i12);
            }
        });
    }

    @ReactMethod
    public void dropNode(final int i11) {
        this.mOperations.add(new UIThreadOperation() { // from class: com.swmansion.reanimated.ReanimatedModule.3
            @Override // com.swmansion.reanimated.ReanimatedModule.UIThreadOperation
            public void execute(NodesManager nodesManager) {
                nodesManager.dropNode(i11);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NodesManager getNodesManager() {
        if (this.mNodesManager == null) {
            this.mNodesManager = new NodesManager(getReactApplicationContext());
        }
        return this.mNodesManager;
    }

    @ReactMethod
    public void getValue(final int i11, final Callback callback) {
        this.mOperations.add(new UIThreadOperation() { // from class: com.swmansion.reanimated.ReanimatedModule.10
            @Override // com.swmansion.reanimated.ReanimatedModule.UIThreadOperation
            public void execute(NodesManager nodesManager) {
                nodesManager.getValue(i11, callback);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        UIManagerModule uIManagerModule = (UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class);
        reactApplicationContext.addLifecycleEventListener(this);
        uIManagerModule.addUIManagerListener(this);
        this.mTransitionManager = new TransitionModule(uIManagerModule);
        this.mUIManager = uIManagerModule;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public void installTurboModule() {
        boolean z11 = getReactApplicationContext().getJavaScriptContextHolder().get() == 0;
        Utils.isChromeDebugger = z11;
        if (!z11) {
            getNodesManager().initWithContext(getReactApplicationContext());
        } else {
            Log.w("[REANIMATED]", "Unable to create Reanimated Native Module. You can ignore this message if you are using Chrome Debugger now.");
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        NodesManager nodesManager = this.mNodesManager;
        if (nodesManager != null) {
            nodesManager.onCatalystInstanceDestroy();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        NodesManager nodesManager = this.mNodesManager;
        if (nodesManager != null) {
            nodesManager.onHostPause();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        NodesManager nodesManager = this.mNodesManager;
        if (nodesManager != null) {
            nodesManager.onHostResume();
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void setValue(final int i11, final Double d11) {
        this.mOperations.add(new UIThreadOperation() { // from class: com.swmansion.reanimated.ReanimatedModule.11
            @Override // com.swmansion.reanimated.ReanimatedModule.UIThreadOperation
            public void execute(NodesManager nodesManager) {
                nodesManager.setValue(i11, d11);
            }
        });
    }

    @Override // com.facebook.react.uimanager.w0
    public void willDispatchViewUpdates(UIManagerModule uIManagerModule) {
        if (this.mOperations.isEmpty()) {
            return;
        }
        final ArrayList<UIThreadOperation> arrayList = this.mOperations;
        this.mOperations = new ArrayList<>();
        uIManagerModule.addUIBlock(new q0() { // from class: com.swmansion.reanimated.ReanimatedModule.1
            @Override // com.facebook.react.uimanager.q0
            public void execute(m mVar) {
                NodesManager nodesManager = ReanimatedModule.this.getNodesManager();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((UIThreadOperation) it2.next()).execute(nodesManager);
                }
            }
        });
    }
}