package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

@fg.a(name = HeadlessJsTaskSupportModule.NAME)
/* loaded from: classes3.dex */
public class HeadlessJsTaskSupportModule extends NativeHeadlessJsTaskSupportSpec {
    public static final String NAME = "HeadlessJsTaskSupport";

    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskFinished(double d11) {
        int i11 = (int) d11;
        eg.b e11 = eg.b.e(getReactApplicationContext());
        if (e11.g(i11)) {
            e11.d(i11);
        } else {
            nd.a.E(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i11));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskRetry(double d11, Promise promise) {
        int i11 = (int) d11;
        eg.b e11 = eg.b.e(getReactApplicationContext());
        if (e11.g(i11)) {
            promise.resolve(Boolean.valueOf(e11.j(i11)));
            return;
        }
        nd.a.E(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", Integer.valueOf(i11));
        promise.resolve(Boolean.FALSE);
    }
}