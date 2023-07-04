package expo.modules.core.interfaces.services;

import android.view.View;
import expo.modules.core.interfaces.ActivityEventListener;
import expo.modules.core.interfaces.LifecycleEventListener;

/* loaded from: classes5.dex */
public interface UIManager {

    /* loaded from: classes5.dex */
    public interface GroupUIBlock {
        void execute(ViewHolder viewHolder);
    }

    /* loaded from: classes5.dex */
    public interface UIBlock<T> {
        void reject(Throwable th2);

        void resolve(T t11);
    }

    /* loaded from: classes5.dex */
    public interface ViewHolder {
        View get(Object obj);
    }

    <T> void addUIBlock(int i11, UIBlock<T> uIBlock, Class<T> cls);

    void addUIBlock(GroupUIBlock groupUIBlock);

    void registerActivityEventListener(ActivityEventListener activityEventListener);

    void registerLifecycleEventListener(LifecycleEventListener lifecycleEventListener);

    void runOnClientCodeQueueThread(Runnable runnable);

    void runOnNativeModulesQueueThread(Runnable runnable);

    void runOnUiQueueThread(Runnable runnable);

    void unregisterActivityEventListener(ActivityEventListener activityEventListener);

    void unregisterLifecycleEventListener(LifecycleEventListener lifecycleEventListener);
}