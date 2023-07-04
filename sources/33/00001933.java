package com.facebook.react;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

/* loaded from: classes3.dex */
public class p {
    private final Activity mActivity;
    private com.facebook.react.devsupport.d mDoubleTapReloadRecognizer = new com.facebook.react.devsupport.d();
    private Bundle mLaunchOptions;
    private final String mMainComponentName;
    private u mReactNativeHost;
    private z mReactRootView;

    public p(Activity activity, u uVar, String str, Bundle bundle) {
        this.mActivity = activity;
        this.mMainComponentName = str;
        this.mLaunchOptions = bundle;
        this.mReactNativeHost = uVar;
    }

    private u getReactNativeHost() {
        return this.mReactNativeHost;
    }

    protected z createRootView() {
        return new z(this.mActivity);
    }

    public r getReactInstanceManager() {
        return getReactNativeHost().getReactInstanceManager();
    }

    public z getReactRootView() {
        return this.mReactRootView;
    }

    public void loadApp() {
        loadApp(this.mMainComponentName);
    }

    public void onActivityResult(int i11, int i12, Intent intent, boolean z11) {
        if (getReactNativeHost().hasInstance() && z11) {
            getReactNativeHost().getReactInstanceManager().O(this.mActivity, i11, i12, intent);
        }
    }

    public boolean onBackPressed() {
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().P();
            return true;
        }
        return false;
    }

    public void onHostDestroy() {
        z zVar = this.mReactRootView;
        if (zVar != null) {
            zVar.u();
            this.mReactRootView = null;
        }
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().S(this.mActivity);
        }
    }

    public void onHostPause() {
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().U(this.mActivity);
        }
    }

    public void onHostResume() {
        if (getReactNativeHost().hasInstance()) {
            if (this.mActivity instanceof com.facebook.react.modules.core.b) {
                r reactInstanceManager = getReactNativeHost().getReactInstanceManager();
                Activity activity = this.mActivity;
                reactInstanceManager.W(activity, (com.facebook.react.modules.core.b) activity);
                return;
            }
            throw new ClassCastException("Host Activity does not implement DefaultHardwareBackBtnHandler");
        }
    }

    public boolean shouldShowDevMenuOrReload(int i11, KeyEvent keyEvent) {
        if (getReactNativeHost().hasInstance() && getReactNativeHost().getUseDeveloperSupport()) {
            if (i11 == 82) {
                getReactNativeHost().getReactInstanceManager().j0();
                return true;
            } else if (((com.facebook.react.devsupport.d) wf.a.c(this.mDoubleTapReloadRecognizer)).b(i11, this.mActivity.getCurrentFocus())) {
                getReactNativeHost().getReactInstanceManager().B().p();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void loadApp(String str) {
        if (this.mReactRootView == null) {
            z createRootView = createRootView();
            this.mReactRootView = createRootView;
            createRootView.s(getReactNativeHost().getReactInstanceManager(), str, this.mLaunchOptions);
            return;
        }
        throw new IllegalStateException("Cannot loadApp while app is already running.");
    }
}