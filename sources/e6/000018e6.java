package com.facebook.react.modules.fresco;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.network.c;
import com.facebook.react.modules.network.g;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import ig.b;
import java.util.HashSet;
import jf.h;
import jf.i;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;

@fg.a(name = FrescoModule.NAME, needsEagerInit = true)
/* loaded from: classes3.dex */
public class FrescoModule extends ReactContextBaseJavaModule implements LifecycleEventListener, TurboModule {
    public static final String NAME = "FrescoModule";
    private static boolean sHasBeenInitialized = false;
    private final boolean mClearOnDestroy;
    private i mConfig;
    private h mImagePipeline;

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, true, (i) null);
    }

    private static i getDefaultConfig(ReactContext reactContext) {
        return getDefaultConfigBuilder(reactContext).K();
    }

    public static i.b getDefaultConfigBuilder(ReactContext reactContext) {
        HashSet hashSet = new HashSet();
        hashSet.add(new b());
        OkHttpClient a11 = g.a();
        ((com.facebook.react.modules.network.a) a11.cookieJar()).b(new JavaNetCookieJar(new c(reactContext)));
        return ff.a.a(reactContext.getApplicationContext(), a11).M(new a(a11)).L(false).N(hashSet);
    }

    private h getImagePipeline() {
        if (this.mImagePipeline == null) {
            this.mImagePipeline = be.c.a();
        }
        return this.mImagePipeline;
    }

    public static boolean hasBeenInitialized() {
        return sHasBeenInitialized;
    }

    public void clearSensitiveData() {
        getImagePipeline().a();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
        if (!hasBeenInitialized()) {
            if (this.mConfig == null) {
                this.mConfig = getDefaultConfig(getReactApplicationContext());
            }
            be.c.c(getReactApplicationContext().getApplicationContext(), this.mConfig);
            sHasBeenInitialized = true;
        } else if (this.mConfig != null) {
            nd.a.G("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.mConfig = null;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        if (hasBeenInitialized() && this.mClearOnDestroy) {
            getImagePipeline().c();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z11) {
        this(reactApplicationContext, z11, (i) null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, h hVar, boolean z11) {
        this(reactApplicationContext, z11);
        this.mImagePipeline = hVar;
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z11, i iVar) {
        super(reactApplicationContext);
        this.mClearOnDestroy = z11;
        this.mConfig = iVar;
    }
}