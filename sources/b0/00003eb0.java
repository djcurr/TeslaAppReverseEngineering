package com.ijzerenhein.sharedelement;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.q0;
import java.util.Objects;

@fg.a(name = "RNSharedElementTransition")
/* loaded from: classes2.dex */
public class RNSharedElementModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "RNSharedElementTransition";
    private final g mNodeManager;

    public RNSharedElementModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mNodeManager = new g(reactApplicationContext);
    }

    @ReactMethod
    public void configure(ReadableMap readableMap, Promise promise) {
        final g gVar = this.mNodeManager;
        Objects.requireNonNull(gVar);
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).prependUIBlock(new q0() { // from class: com.ijzerenhein.sharedelement.e
            @Override // com.facebook.react.uimanager.q0
            public final void execute(com.facebook.react.uimanager.m mVar) {
                g.this.d(mVar);
            }
        });
        promise.resolve(Boolean.TRUE);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSharedElementTransition";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g getNodeManager() {
        return this.mNodeManager;
    }
}