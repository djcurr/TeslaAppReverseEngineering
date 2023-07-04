package com.facebook.react.modules.blob;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.soloader.SoLoader;

/* loaded from: classes3.dex */
class BlobCollector {

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactContext f11928a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BlobModule f11929b;

        a(ReactContext reactContext, BlobModule blobModule) {
            this.f11928a = reactContext;
            this.f11929b = blobModule;
        }

        @Override // java.lang.Runnable
        public void run() {
            JavaScriptContextHolder javaScriptContextHolder = this.f11928a.getJavaScriptContextHolder();
            if (javaScriptContextHolder.get() != 0) {
                BlobCollector.nativeInstall(this.f11929b, javaScriptContextHolder.get());
            }
        }
    }

    static {
        SoLoader.p("reactnativeblob");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(ReactContext reactContext, BlobModule blobModule) {
        reactContext.runOnJSQueueThread(new a(reactContext, blobModule));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeInstall(Object obj, long j11);
}