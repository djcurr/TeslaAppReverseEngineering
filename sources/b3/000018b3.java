package com.facebook.react.modules.bundleloader;

import bg.c;
import bg.d;
import com.facebook.fbreact.specs.NativeDevSplitBundleLoaderSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

@fg.a(name = NativeDevSplitBundleLoaderModule.NAME)
/* loaded from: classes3.dex */
public class NativeDevSplitBundleLoaderModule extends NativeDevSplitBundleLoaderSpec {
    public static final String NAME = "DevSplitBundleLoader";
    private static final String REJECTION_CODE = "E_BUNDLE_LOAD_ERROR";
    private final d mDevSupportManager;

    /* loaded from: classes3.dex */
    class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f11934a;

        a(NativeDevSplitBundleLoaderModule nativeDevSplitBundleLoaderModule, Promise promise) {
            this.f11934a = promise;
        }
    }

    public NativeDevSplitBundleLoaderModule(ReactApplicationContext reactApplicationContext, d dVar) {
        super(reactApplicationContext);
        this.mDevSupportManager = dVar;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeDevSplitBundleLoaderSpec
    public void loadBundle(String str, Promise promise) {
        this.mDevSupportManager.t(str, new a(this, promise));
    }
}