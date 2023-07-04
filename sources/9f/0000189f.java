package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.Callback;

/* loaded from: classes3.dex */
public class m {
    private final Activity mActivity;
    private final String mMainComponentName;
    private com.facebook.react.modules.core.f mPermissionListener;
    private Callback mPermissionsCallback;
    private p mReactDelegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends p {
        a(Activity activity, u uVar, String str, Bundle bundle) {
            super(activity, uVar, str, bundle);
        }

        @Override // com.facebook.react.p
        protected z createRootView() {
            return m.this.createRootView();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11914a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String[] f11915b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int[] f11916c;

        b(int i11, String[] strArr, int[] iArr) {
            this.f11914a = i11;
            this.f11915b = strArr;
            this.f11916c = iArr;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            if (m.this.mPermissionListener == null || !m.this.mPermissionListener.onRequestPermissionsResult(this.f11914a, this.f11915b, this.f11916c)) {
                return;
            }
            m.this.mPermissionListener = null;
        }
    }

    @Deprecated
    public m(Activity activity, String str) {
        this.mActivity = activity;
        this.mMainComponentName = str;
    }

    protected z createRootView() {
        return new z(getContext());
    }

    protected Context getContext() {
        return (Context) wf.a.c(this.mActivity);
    }

    protected Bundle getLaunchOptions() {
        return null;
    }

    public String getMainComponentName() {
        return this.mMainComponentName;
    }

    protected Activity getPlainActivity() {
        return (Activity) getContext();
    }

    public r getReactInstanceManager() {
        return this.mReactDelegate.getReactInstanceManager();
    }

    protected u getReactNativeHost() {
        return ((o) getPlainActivity().getApplication()).c();
    }

    protected void loadApp(String str) {
        this.mReactDelegate.loadApp(str);
        getPlainActivity().setContentView(this.mReactDelegate.getReactRootView());
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
        this.mReactDelegate.onActivityResult(i11, i12, intent, true);
    }

    public boolean onBackPressed() {
        return this.mReactDelegate.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (getReactNativeHost().hasInstance()) {
            getReactInstanceManager().Q(getContext(), configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String mainComponentName = getMainComponentName();
        this.mReactDelegate = new a(getPlainActivity(), getReactNativeHost(), mainComponentName, getLaunchOptions());
        if (mainComponentName != null) {
            loadApp(mainComponentName);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onDestroy() {
        this.mReactDelegate.onHostDestroy();
    }

    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (getReactNativeHost().hasInstance() && getReactNativeHost().getUseDeveloperSupport() && i11 == 90) {
            keyEvent.startTracking();
            return true;
        }
        return false;
    }

    public boolean onKeyLongPress(int i11, KeyEvent keyEvent) {
        if (getReactNativeHost().hasInstance() && getReactNativeHost().getUseDeveloperSupport() && i11 == 90) {
            getReactNativeHost().getReactInstanceManager().j0();
            return true;
        }
        return false;
    }

    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        return this.mReactDelegate.shouldShowDevMenuOrReload(i11, keyEvent);
    }

    public boolean onNewIntent(Intent intent) {
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().Y(intent);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onPause() {
        this.mReactDelegate.onHostPause();
    }

    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        this.mPermissionsCallback = new b(i11, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onResume() {
        this.mReactDelegate.onHostResume();
        Callback callback = this.mPermissionsCallback;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.mPermissionsCallback = null;
        }
    }

    public void onWindowFocusChanged(boolean z11) {
        if (getReactNativeHost().hasInstance()) {
            getReactNativeHost().getReactInstanceManager().Z(z11);
        }
    }

    public void requestPermissions(String[] strArr, int i11, com.facebook.react.modules.core.f fVar) {
        this.mPermissionListener = fVar;
        getPlainActivity().requestPermissions(strArr, i11);
    }

    public m(l lVar, String str) {
        this.mActivity = lVar;
        this.mMainComponentName = str;
    }
}