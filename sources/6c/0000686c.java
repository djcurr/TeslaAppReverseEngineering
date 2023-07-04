package expo.modules.adapters.react.services;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.q0;
import expo.modules.core.interfaces.ActivityEventListener;
import expo.modules.core.interfaces.ActivityProvider;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.core.interfaces.JavaScriptContextProvider;
import expo.modules.core.interfaces.LifecycleEventListener;
import expo.modules.core.interfaces.services.UIManager;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class UIManagerModuleWrapper implements ActivityProvider, InternalModule, JavaScriptContextProvider, UIManager {
    private ReactContext mReactContext;
    private Map<LifecycleEventListener, com.facebook.react.bridge.LifecycleEventListener> mLifecycleListenersMap = new WeakHashMap();
    private Map<ActivityEventListener, com.facebook.react.bridge.ActivityEventListener> mActivityEventListenersMap = new WeakHashMap();

    public UIManagerModuleWrapper(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    @Override // expo.modules.core.interfaces.services.UIManager
    public <T> void addUIBlock(final int i11, final UIManager.UIBlock<T> uIBlock, final Class<T> cls) {
        ((UIManagerModule) getContext().getNativeModule(UIManagerModule.class)).addUIBlock(new q0() { // from class: expo.modules.adapters.react.services.UIManagerModuleWrapper.1
            @Override // com.facebook.react.uimanager.q0
            public void execute(m mVar) {
                View resolveView = mVar.resolveView(i11);
                if (resolveView == null) {
                    uIBlock.reject(new IllegalArgumentException("Expected view for this tag not to be null."));
                    return;
                }
                try {
                    if (cls.isInstance(resolveView)) {
                        uIBlock.resolve(cls.cast(resolveView));
                    } else {
                        UIManager.UIBlock uIBlock2 = uIBlock;
                        uIBlock2.reject(new IllegalStateException("Expected view to be of " + cls + "; found " + resolveView.getClass() + " instead"));
                    }
                } catch (Exception e11) {
                    uIBlock.reject(e11);
                }
            }
        });
    }

    protected ReactContext getContext() {
        return this.mReactContext;
    }

    @Override // expo.modules.core.interfaces.ActivityProvider
    public Activity getCurrentActivity() {
        return getContext().getCurrentActivity();
    }

    @Override // expo.modules.core.interfaces.InternalModule
    public List<Class> getExportedInterfaces() {
        return Arrays.asList(ActivityProvider.class, JavaScriptContextProvider.class, UIManager.class);
    }

    @Override // expo.modules.core.interfaces.JavaScriptContextProvider
    public CallInvokerHolderImpl getJSCallInvokerHolder() {
        return (CallInvokerHolderImpl) this.mReactContext.getCatalystInstance().getJSCallInvokerHolder();
    }

    @Override // expo.modules.core.interfaces.JavaScriptContextProvider
    public long getJavaScriptContextRef() {
        return this.mReactContext.getJavaScriptContextHolder().get();
    }

    @Override // expo.modules.core.interfaces.services.UIManager
    public void registerActivityEventListener(ActivityEventListener activityEventListener) {
        final WeakReference weakReference = new WeakReference(activityEventListener);
        this.mActivityEventListenersMap.put(activityEventListener, new com.facebook.react.bridge.ActivityEventListener() { // from class: expo.modules.adapters.react.services.UIManagerModuleWrapper.4
            @Override // com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
                ActivityEventListener activityEventListener2 = (ActivityEventListener) weakReference.get();
                if (activityEventListener2 != null) {
                    activityEventListener2.onActivityResult(activity, i11, i12, intent);
                }
            }

            @Override // com.facebook.react.bridge.ActivityEventListener
            public void onNewIntent(Intent intent) {
                ActivityEventListener activityEventListener2 = (ActivityEventListener) weakReference.get();
                if (activityEventListener2 != null) {
                    activityEventListener2.onNewIntent(intent);
                }
            }
        });
        this.mReactContext.addActivityEventListener(this.mActivityEventListenersMap.get(activityEventListener));
    }

    @Override // expo.modules.core.interfaces.services.UIManager
    public void registerLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        final WeakReference weakReference = new WeakReference(lifecycleEventListener);
        this.mLifecycleListenersMap.put(lifecycleEventListener, new com.facebook.react.bridge.LifecycleEventListener() { // from class: expo.modules.adapters.react.services.UIManagerModuleWrapper.3
            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostDestroy() {
                LifecycleEventListener lifecycleEventListener2 = (LifecycleEventListener) weakReference.get();
                if (lifecycleEventListener2 != null) {
                    lifecycleEventListener2.onHostDestroy();
                }
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostPause() {
                LifecycleEventListener lifecycleEventListener2 = (LifecycleEventListener) weakReference.get();
                if (lifecycleEventListener2 != null) {
                    lifecycleEventListener2.onHostPause();
                }
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostResume() {
                LifecycleEventListener lifecycleEventListener2 = (LifecycleEventListener) weakReference.get();
                if (lifecycleEventListener2 != null) {
                    lifecycleEventListener2.onHostResume();
                }
            }
        });
        this.mReactContext.addLifecycleEventListener(this.mLifecycleListenersMap.get(lifecycleEventListener));
    }

    @Override // expo.modules.core.interfaces.services.UIManager
    public void runOnClientCodeQueueThread(Runnable runnable) {
        if (getContext().isOnJSQueueThread()) {
            runnable.run();
        } else {
            getContext().runOnJSQueueThread(runnable);
        }
    }

    @Override // expo.modules.core.interfaces.services.UIManager
    public void runOnNativeModulesQueueThread(Runnable runnable) {
        if (this.mReactContext.isOnNativeModulesQueueThread()) {
            runnable.run();
        } else {
            this.mReactContext.runOnNativeModulesQueueThread(runnable);
        }
    }

    @Override // expo.modules.core.interfaces.services.UIManager
    public void runOnUiQueueThread(Runnable runnable) {
        if (getContext().isOnUiQueueThread()) {
            runnable.run();
        } else {
            getContext().runOnUiQueueThread(runnable);
        }
    }

    @Override // expo.modules.core.interfaces.services.UIManager
    public void unregisterActivityEventListener(ActivityEventListener activityEventListener) {
        getContext().removeActivityEventListener(this.mActivityEventListenersMap.get(activityEventListener));
        this.mActivityEventListenersMap.remove(activityEventListener);
    }

    @Override // expo.modules.core.interfaces.services.UIManager
    public void unregisterLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        getContext().removeLifecycleEventListener(this.mLifecycleListenersMap.get(lifecycleEventListener));
        this.mLifecycleListenersMap.remove(lifecycleEventListener);
    }

    @Override // expo.modules.core.interfaces.services.UIManager
    public void addUIBlock(final UIManager.GroupUIBlock groupUIBlock) {
        ((UIManagerModule) getContext().getNativeModule(UIManagerModule.class)).addUIBlock(new q0() { // from class: expo.modules.adapters.react.services.UIManagerModuleWrapper.2
            @Override // com.facebook.react.uimanager.q0
            public void execute(final m mVar) {
                groupUIBlock.execute(new UIManager.ViewHolder() { // from class: expo.modules.adapters.react.services.UIManagerModuleWrapper.2.1
                    @Override // expo.modules.core.interfaces.services.UIManager.ViewHolder
                    public View get(Object obj) {
                        if (obj instanceof Number) {
                            try {
                                return mVar.resolveView(((Number) obj).intValue());
                            } catch (IllegalViewOperationException unused) {
                                return null;
                            }
                        }
                        Log.w("E_INVALID_TAG", "Provided tag is of class " + obj.getClass() + " whereas React expects tags to be integers. Are you sure you're providing proper argument to addUIBlock?");
                        return null;
                    }
                });
            }
        });
    }
}