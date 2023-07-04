package com.facebook.react;

import android.app.Application;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.uimanager.s0;
import com.facebook.react.y;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class u {
    private final Application mApplication;
    private r mReactInstanceManager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements yf.h {
        a(u uVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public u(Application application) {
        this.mApplication = application;
    }

    public void clear() {
        r rVar = this.mReactInstanceManager;
        if (rVar != null) {
            rVar.x();
            this.mReactInstanceManager = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public r createReactInstanceManager() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        s m11 = r.r().d(this.mApplication).k(getJSMainModuleName()).r(getUseDeveloperSupport()).f(getDevSupportManagerFactory()).o(getShouldRequireActivity()).p(getSurfaceDelegateFactory()).n(getRedBoxHandler()).l(getJavaScriptExecutorFactory()).q(getUIImplementationProvider()).j(getJSIModulePackage()).g(LifecycleState.BEFORE_CREATE).m(getReactPackageTurboModuleManagerDelegateBuilder());
        for (v vVar : getPackages()) {
            m11.a(vVar);
        }
        String jSBundleFile = getJSBundleFile();
        if (jSBundleFile != null) {
            m11.h(jSBundleFile);
        } else {
            m11.e((String) wf.a.c(getBundleAssetName()));
        }
        r b11 = m11.b();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return b11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Application getApplication() {
        return this.mApplication;
    }

    protected String getBundleAssetName() {
        return "index.android.bundle";
    }

    protected com.facebook.react.devsupport.b getDevSupportManagerFactory() {
        return null;
    }

    protected String getJSBundleFile() {
        return null;
    }

    protected JSIModulePackage getJSIModulePackage() {
        return null;
    }

    protected String getJSMainModuleName() {
        return "index.android";
    }

    protected JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        return null;
    }

    protected abstract List<v> getPackages();

    public r getReactInstanceManager() {
        if (this.mReactInstanceManager == null) {
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
            this.mReactInstanceManager = createReactInstanceManager();
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
        }
        return this.mReactInstanceManager;
    }

    protected y.a getReactPackageTurboModuleManagerDelegateBuilder() {
        return null;
    }

    protected com.facebook.react.devsupport.h getRedBoxHandler() {
        return null;
    }

    public boolean getShouldRequireActivity() {
        return true;
    }

    public yf.h getSurfaceDelegateFactory() {
        return new a(this);
    }

    protected s0 getUIImplementationProvider() {
        return new s0();
    }

    public abstract boolean getUseDeveloperSupport();

    public boolean hasInstance() {
        return this.mReactInstanceManager != null;
    }
}