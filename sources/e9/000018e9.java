package com.facebook.react.modules.image;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.image.f;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import jf.h;

@fg.a(name = ImageLoaderModule.NAME)
/* loaded from: classes3.dex */
public class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    private final Object mCallerContext;
    private f mCallerContextFactory;
    private final Object mEnqueuedRequestMonitor;
    private final SparseArray<com.facebook.datasource.c<Void>> mEnqueuedRequests;
    private h mImagePipeline;

    /* loaded from: classes3.dex */
    class a extends com.facebook.datasource.b<qd.a<nf.c>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f12022a;

        a(ImageLoaderModule imageLoaderModule, Promise promise) {
            this.f12022a = promise;
        }

        @Override // com.facebook.datasource.b
        protected void onFailureImpl(com.facebook.datasource.c<qd.a<nf.c>> cVar) {
            this.f12022a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, cVar.c());
        }

        @Override // com.facebook.datasource.b
        protected void onNewResultImpl(com.facebook.datasource.c<qd.a<nf.c>> cVar) {
            if (cVar.a()) {
                qd.a<nf.c> g11 = cVar.g();
                try {
                    if (g11 != null) {
                        try {
                            nf.c J = g11.J();
                            WritableMap createMap = Arguments.createMap();
                            createMap.putInt(Snapshot.WIDTH, J.getWidth());
                            createMap.putInt(Snapshot.HEIGHT, J.getHeight());
                            this.f12022a.resolve(createMap);
                        } catch (Exception e11) {
                            this.f12022a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e11);
                        }
                        return;
                    }
                    this.f12022a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE);
                } finally {
                    qd.a.C(g11);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    class b extends com.facebook.datasource.b<qd.a<nf.c>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f12023a;

        b(ImageLoaderModule imageLoaderModule, Promise promise) {
            this.f12023a = promise;
        }

        @Override // com.facebook.datasource.b
        protected void onFailureImpl(com.facebook.datasource.c<qd.a<nf.c>> cVar) {
            this.f12023a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, cVar.c());
        }

        @Override // com.facebook.datasource.b
        protected void onNewResultImpl(com.facebook.datasource.c<qd.a<nf.c>> cVar) {
            if (cVar.a()) {
                qd.a<nf.c> g11 = cVar.g();
                try {
                    if (g11 != null) {
                        try {
                            nf.c J = g11.J();
                            WritableMap createMap = Arguments.createMap();
                            createMap.putInt(Snapshot.WIDTH, J.getWidth());
                            createMap.putInt(Snapshot.HEIGHT, J.getHeight());
                            this.f12023a.resolve(createMap);
                        } catch (Exception e11) {
                            this.f12023a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e11);
                        }
                        return;
                    }
                    this.f12023a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE);
                } finally {
                    qd.a.C(g11);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    class c extends com.facebook.datasource.b<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f12024a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f12025b;

        c(int i11, Promise promise) {
            this.f12024a = i11;
            this.f12025b = promise;
        }

        @Override // com.facebook.datasource.b
        protected void onFailureImpl(com.facebook.datasource.c<Void> cVar) {
            try {
                ImageLoaderModule.this.removeRequest(this.f12024a);
                this.f12025b.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, cVar.c());
            } finally {
                cVar.close();
            }
        }

        @Override // com.facebook.datasource.b
        protected void onNewResultImpl(com.facebook.datasource.c<Void> cVar) {
            try {
                if (cVar.a()) {
                    try {
                        ImageLoaderModule.this.removeRequest(this.f12024a);
                        this.f12025b.resolve(Boolean.TRUE);
                    } catch (Exception e11) {
                        this.f12025b.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, e11);
                    }
                }
            } finally {
                cVar.close();
            }
        }
    }

    /* loaded from: classes3.dex */
    class d extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReadableArray f12027a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f12028b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, ReadableArray readableArray, Promise promise) {
            super(reactContext);
            this.f12027a = readableArray;
            this.f12028b = promise;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap createMap = Arguments.createMap();
            h imagePipeline = ImageLoaderModule.this.getImagePipeline();
            for (int i11 = 0; i11 < this.f12027a.size(); i11++) {
                String string = this.f12027a.getString(i11);
                Uri parse = Uri.parse(string);
                if (imagePipeline.m(parse)) {
                    createMap.putString(string, "memory");
                } else if (imagePipeline.o(parse)) {
                    createMap.putString(string, "disk");
                }
            }
            this.f12028b.resolve(createMap);
        }
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mImagePipeline = null;
        this.mCallerContext = this;
    }

    private Object getCallerContext() {
        f fVar = this.mCallerContextFactory;
        if (fVar != null) {
            return fVar.a("", "");
        }
        return this.mCallerContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h getImagePipeline() {
        h hVar = this.mImagePipeline;
        return hVar != null ? hVar : be.c.a();
    }

    private void registerRequest(int i11, com.facebook.datasource.c<Void> cVar) {
        synchronized (this.mEnqueuedRequestMonitor) {
            this.mEnqueuedRequests.put(i11, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.datasource.c<Void> removeRequest(int i11) {
        com.facebook.datasource.c<Void> cVar;
        synchronized (this.mEnqueuedRequestMonitor) {
            cVar = this.mEnqueuedRequests.get(i11);
            this.mEnqueuedRequests.remove(i11);
        }
        return cVar;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double d11) {
        com.facebook.datasource.c<Void> removeRequest = removeRequest((int) d11);
        if (removeRequest != null) {
            removeRequest.close();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSize(String str, Promise promise) {
        if (str != null && !str.isEmpty()) {
            getImagePipeline().d(ImageRequestBuilder.s(new vg.a(getReactApplicationContext(), str).getUri()).a(), getCallerContext()).d(new a(this, promise), kd.a.a());
            return;
        }
        promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSizeWithHeaders(String str, ReadableMap readableMap, Promise promise) {
        if (str != null && !str.isEmpty()) {
            getImagePipeline().d(ig.a.y(ImageRequestBuilder.s(new vg.a(getReactApplicationContext(), str).getUri()), readableMap), getCallerContext()).d(new b(this, promise), kd.a.a());
            return;
        }
        promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.mEnqueuedRequestMonitor) {
            int size = this.mEnqueuedRequests.size();
            for (int i11 = 0; i11 < size; i11++) {
                com.facebook.datasource.c<Void> valueAt = this.mEnqueuedRequests.valueAt(i11);
                if (valueAt != null) {
                    valueAt.close();
                }
            }
            this.mEnqueuedRequests.clear();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(String str, double d11, Promise promise) {
        int i11 = (int) d11;
        if (str != null && !str.isEmpty()) {
            com.facebook.datasource.c<Void> s11 = getImagePipeline().s(ImageRequestBuilder.s(Uri.parse(str)).a(), getCallerContext());
            c cVar = new c(i11, promise);
            registerRequest(i11, s11);
            s11.d(cVar, kd.a.a());
            return;
        }
        promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void queryCache(ReadableArray readableArray, Promise promise) {
        new d(getReactApplicationContext(), readableArray, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, Object obj) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mImagePipeline = null;
        this.mCallerContext = obj;
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, h hVar, f fVar) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mImagePipeline = null;
        this.mCallerContextFactory = fVar;
        this.mImagePipeline = hVar;
        this.mCallerContext = null;
    }
}