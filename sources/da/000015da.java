package com.dylanvann.fastimage;

import android.app.Activity;
import com.bumptech.glide.c;
import com.bumptech.glide.k;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes.dex */
class FastImageViewModule extends ReactContextBaseJavaModule {
    private static final String REACT_CLASS = "FastImageView";

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReadableArray f11041a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f11042b;

        a(FastImageViewModule fastImageViewModule, ReadableArray readableArray, Activity activity) {
            this.f11041a = readableArray;
            this.f11042b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object uri;
            for (int i11 = 0; i11 < this.f11041a.size(); i11++) {
                ReadableMap map = this.f11041a.getMap(i11);
                FastImageSource c11 = com.dylanvann.fastimage.a.c(this.f11042b, map);
                k C = c.C(this.f11042b.getApplicationContext());
                if (c11.isBase64Resource()) {
                    uri = c11.getSource();
                } else {
                    uri = c11.isResource() ? c11.getUri() : c11.getGlideUrl();
                }
                C.mo108load(uri).apply((com.bumptech.glide.request.a<?>) com.dylanvann.fastimage.a.d(this.f11042b, c11, map)).preload();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f11043a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f11044b;

        b(FastImageViewModule fastImageViewModule, Activity activity, Promise promise) {
            this.f11043a = activity;
            this.f11044b = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.e(this.f11043a.getApplicationContext()).c();
            this.f11044b.resolve(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FastImageViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void clearDiskCache(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve(null);
            return;
        }
        c.e(currentActivity.getApplicationContext()).b();
        promise.resolve(null);
    }

    @ReactMethod
    public void clearMemoryCache(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve(null);
        } else {
            currentActivity.runOnUiThread(new b(this, currentActivity, promise));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public void preload(ReadableArray readableArray) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.runOnUiThread(new a(this, readableArray, currentActivity));
    }
}