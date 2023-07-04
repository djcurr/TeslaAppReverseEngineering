package org.reactnative.camera;

import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.q0;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes5.dex */
public class CameraModule extends ReactContextBaseJavaModule {
    static final int GOOGLE_VISION_BARCODE_MODE_ALTERNATE = 1;
    static final int GOOGLE_VISION_BARCODE_MODE_INVERTED = 2;
    static final int GOOGLE_VISION_BARCODE_MODE_NORMAL = 0;
    private static final String TAG = "CameraModule";
    public static final Map<String, Object> VALID_BARCODE_TYPES = Collections.unmodifiableMap(new f());
    static final int VIDEO_1080P = 1;
    static final int VIDEO_2160P = 0;
    static final int VIDEO_480P = 3;
    static final int VIDEO_4x3 = 4;
    static final int VIDEO_720P = 2;
    private f80.d mScopedContext;

    /* loaded from: classes5.dex */
    class a implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f43250a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f43251b;

        a(CameraModule cameraModule, int i11, Promise promise) {
            this.f43250a = i11;
            this.f43251b = promise;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            try {
                org.reactnative.camera.d dVar = (org.reactnative.camera.d) mVar.resolveView(this.f43250a);
                WritableArray createArray = Arguments.createArray();
                if (dVar.p()) {
                    for (mh.a aVar : dVar.getSupportedAspectRatios()) {
                        createArray.pushString(aVar.toString());
                    }
                    this.f43251b.resolve(createArray);
                    return;
                }
                this.f43251b.reject("E_CAMERA_UNAVAILABLE", "Camera is not running");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* loaded from: classes5.dex */
    class b implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f43252a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f43253b;

        b(CameraModule cameraModule, int i11, Promise promise) {
            this.f43252a = i11;
            this.f43253b = promise;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            try {
                WritableArray createArray = Arguments.createArray();
                for (Properties properties : ((org.reactnative.camera.d) mVar.resolveView(this.f43252a)).getCameraIds()) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("id", properties.getProperty("id"));
                    writableNativeMap.putInt("type", Integer.valueOf(properties.getProperty("type")).intValue());
                    createArray.pushMap(writableNativeMap);
                }
                this.f43253b.resolve(createArray);
            } catch (Exception e11) {
                e11.printStackTrace();
                this.f43253b.reject("E_CAMERA_FAILED", e11.getMessage());
            }
        }
    }

    /* loaded from: classes5.dex */
    class c implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f43254a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f43255b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f43256c;

        c(CameraModule cameraModule, int i11, String str, Promise promise) {
            this.f43254a = i11;
            this.f43255b = str;
            this.f43256c = promise;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            try {
                org.reactnative.camera.d dVar = (org.reactnative.camera.d) mVar.resolveView(this.f43254a);
                WritableArray createArray = Arguments.createArray();
                if (dVar.p()) {
                    for (mh.j jVar : dVar.o(mh.a.h(this.f43255b))) {
                        createArray.pushString(jVar.toString());
                    }
                    this.f43256c.resolve(createArray);
                    return;
                }
                this.f43256c.reject("E_CAMERA_UNAVAILABLE", "Camera is not running");
            } catch (Exception unused) {
                this.f43256c.reject("E_CAMERA_BAD_VIEWTAG", "getAvailablePictureSizesAsync: Expected a Camera component");
            }
        }
    }

    /* loaded from: classes5.dex */
    class d implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f43257a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f43258b;

        d(CameraModule cameraModule, int i11, Promise promise) {
            this.f43257a = i11;
            this.f43258b = promise;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            try {
                WritableArray createArray = Arguments.createArray();
                Iterator<int[]> it2 = ((org.reactnative.camera.d) mVar.resolveView(this.f43257a)).getSupportedPreviewFpsRange().iterator();
                while (it2.hasNext()) {
                    int[] next = it2.next();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putInt("MAXIMUM_FPS", next[0]);
                    writableNativeMap.putInt("MINIMUM_FPS", next[1]);
                    createArray.pushMap(writableNativeMap);
                }
                this.f43258b.resolve(createArray);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* loaded from: classes5.dex */
    class e extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f43259a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f43260b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CameraModule cameraModule, ReactContext reactContext, String str, Promise promise) {
            super(reactContext);
            this.f43259a = str;
            this.f43260b = promise;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(this.f43259a);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(17);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(12);
                    this.f43260b.resolve(Boolean.valueOf(extractMetadata != null && ("yes".equals(extractMetadata) || "true".equals(extractMetadata) || (extractMetadata2 != null && extractMetadata2.contains(MediaStreamTrack.VIDEO_TRACK_KIND)))));
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Throwable unused) {
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    this.f43260b.resolve(Boolean.TRUE);
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused3) {
                }
                throw th2;
            }
        }
    }

    /* loaded from: classes5.dex */
    class f extends HashMap<String, Object> {
        f() {
            put("aztec", com.google.zxing.a.AZTEC.toString());
            put("ean13", com.google.zxing.a.EAN_13.toString());
            put("ean8", com.google.zxing.a.EAN_8.toString());
            put("qr", com.google.zxing.a.QR_CODE.toString());
            put("pdf417", com.google.zxing.a.PDF_417.toString());
            put("upc_e", com.google.zxing.a.UPC_E.toString());
            put("datamatrix", com.google.zxing.a.DATA_MATRIX.toString());
            put("code39", com.google.zxing.a.CODE_39.toString());
            put("code93", com.google.zxing.a.CODE_93.toString());
            put("interleaved2of5", com.google.zxing.a.ITF.toString());
            put("codabar", com.google.zxing.a.CODABAR.toString());
            put("code128", com.google.zxing.a.CODE_128.toString());
            put("maxicode", com.google.zxing.a.MAXICODE.toString());
            put("rss14", com.google.zxing.a.RSS_14.toString());
            put("rssexpanded", com.google.zxing.a.RSS_EXPANDED.toString());
            put("upc_a", com.google.zxing.a.UPC_A.toString());
            put("upc_ean", com.google.zxing.a.UPC_EAN_EXTENSION.toString());
        }
    }

    /* loaded from: classes5.dex */
    class g extends HashMap<String, Object> {

        /* loaded from: classes5.dex */
        class a extends HashMap<String, Object> {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: org.reactnative.camera.CameraModule$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public class C0863a extends HashMap<String, Object> {
                C0863a(a aVar) {
                    put("fast", Integer.valueOf(g80.b.f27848m));
                    put("accurate", Integer.valueOf(g80.b.f27847l));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public class b extends HashMap<String, Object> {
                b(a aVar) {
                    put("all", Integer.valueOf(g80.b.f27843h));
                    put(PermissionsResponse.SCOPE_NONE, Integer.valueOf(g80.b.f27844i));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes5.dex */
            public class c extends HashMap<String, Object> {
                c(a aVar) {
                    put("all", Integer.valueOf(g80.b.f27845j));
                    put(PermissionsResponse.SCOPE_NONE, Integer.valueOf(g80.b.f27846k));
                }
            }

            a(g gVar) {
                put("Mode", c());
                put("Landmarks", b());
                put("Classifications", a());
            }

            private Map<String, Object> a() {
                return Collections.unmodifiableMap(new b(this));
            }

            private Map<String, Object> b() {
                return Collections.unmodifiableMap(new c(this));
            }

            private Map<String, Object> c() {
                return Collections.unmodifiableMap(new C0863a(this));
            }
        }

        /* loaded from: classes5.dex */
        class b extends HashMap<String, Object> {
            b() {
                put("BarcodeType", c80.a.f9010b);
                put("BarcodeMode", g.this.f());
            }
        }

        /* loaded from: classes5.dex */
        class c extends HashMap<String, Object> {
            c(g gVar) {
                put("auto", 0);
                put("portrait", 1);
                put("portraitUpsideDown", 2);
                put("landscapeLeft", 3);
                put("landscapeRight", 4);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public class d extends HashMap<String, Object> {
            d(g gVar) {
                put("front", 1);
                put("back", 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public class e extends HashMap<String, Object> {
            e(g gVar) {
                put("off", 0);
                put("on", 1);
                put("auto", 3);
                put("torch", 2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public class f extends HashMap<String, Object> {
            f(g gVar) {
                put("on", Boolean.TRUE);
                put("off", Boolean.FALSE);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: org.reactnative.camera.CameraModule$g$g  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class C0864g extends HashMap<String, Object> {
            C0864g(g gVar) {
                put("auto", 0);
                put("cloudy", 1);
                put("sunny", 2);
                put("shadow", 3);
                put("fluorescent", 4);
                put("incandescent", 5);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public class h extends HashMap<String, Object> {
            h(g gVar) {
                put("2160p", 0);
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_1080P, 1);
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_720P, 2);
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_480P, 3);
                put("4:3", 4);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public class i extends HashMap<String, Object> {
            i(g gVar) {
                put("NORMAL", 0);
                put("ALTERNATE", 1);
                put("INVERTED", 2);
            }
        }

        g(CameraModule cameraModule) {
            put("Type", h());
            put("FlashMode", e());
            put("AutoFocus", b());
            put("WhiteBalance", j());
            put("VideoQuality", i());
            put("BarCodeType", c());
            put("FaceDetection", Collections.unmodifiableMap(new a(this)));
            put("GoogleVisionBarcodeDetection", Collections.unmodifiableMap(new b()));
            put("Orientation", Collections.unmodifiableMap(new c(this)));
        }

        private Map<String, Object> b() {
            return Collections.unmodifiableMap(new f(this));
        }

        private Map<String, Object> c() {
            return CameraModule.VALID_BARCODE_TYPES;
        }

        private Map<String, Object> e() {
            return Collections.unmodifiableMap(new e(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, Object> f() {
            return Collections.unmodifiableMap(new i(this));
        }

        private Map<String, Object> h() {
            return Collections.unmodifiableMap(new d(this));
        }

        private Map<String, Object> i() {
            return Collections.unmodifiableMap(new h(this));
        }

        private Map<String, Object> j() {
            return Collections.unmodifiableMap(new C0864g(this));
        }
    }

    /* loaded from: classes5.dex */
    class h implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f43262a;

        h(CameraModule cameraModule, int i11) {
            this.f43262a = i11;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            try {
                org.reactnative.camera.d dVar = (org.reactnative.camera.d) mVar.resolveView(this.f43262a);
                if (dVar.p()) {
                    dVar.q();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* loaded from: classes5.dex */
    class i implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f43263a;

        i(CameraModule cameraModule, int i11) {
            this.f43263a = i11;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            try {
                org.reactnative.camera.d dVar = (org.reactnative.camera.d) mVar.resolveView(this.f43263a);
                if (dVar.p()) {
                    dVar.t();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* loaded from: classes5.dex */
    class j implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f43264a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableMap f43265b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f43266c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ File f43267d;

        j(CameraModule cameraModule, int i11, ReadableMap readableMap, Promise promise, File file) {
            this.f43264a = i11;
            this.f43265b = readableMap;
            this.f43266c = promise;
            this.f43267d = file;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            org.reactnative.camera.d dVar = (org.reactnative.camera.d) mVar.resolveView(this.f43264a);
            try {
                if (dVar.p()) {
                    dVar.t0(this.f43265b, this.f43266c, this.f43267d);
                } else {
                    this.f43266c.reject("E_CAMERA_UNAVAILABLE", "Camera is not running");
                }
            } catch (Exception e11) {
                this.f43266c.reject("E_TAKE_PICTURE_FAILED", e11.getMessage());
            }
        }
    }

    /* loaded from: classes5.dex */
    class k implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f43268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableMap f43269b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f43270c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ File f43271d;

        k(CameraModule cameraModule, int i11, ReadableMap readableMap, Promise promise, File file) {
            this.f43268a = i11;
            this.f43269b = readableMap;
            this.f43270c = promise;
            this.f43271d = file;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            try {
                org.reactnative.camera.d dVar = (org.reactnative.camera.d) mVar.resolveView(this.f43268a);
                if (dVar.p()) {
                    dVar.n0(this.f43269b, this.f43270c, this.f43271d);
                } else {
                    this.f43270c.reject("E_CAMERA_UNAVAILABLE", "Camera is not running");
                }
            } catch (Exception e11) {
                this.f43270c.reject("E_CAPTURE_FAILED", e11.getMessage());
            }
        }
    }

    /* loaded from: classes5.dex */
    class l implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f43272a;

        l(CameraModule cameraModule, int i11) {
            this.f43272a = i11;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            try {
                org.reactnative.camera.d dVar = (org.reactnative.camera.d) mVar.resolveView(this.f43272a);
                if (dVar.p()) {
                    dVar.y();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* loaded from: classes5.dex */
    class m implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f43273a;

        m(CameraModule cameraModule, int i11) {
            this.f43273a = i11;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            try {
                org.reactnative.camera.d dVar = (org.reactnative.camera.d) mVar.resolveView(this.f43273a);
                if (dVar.p()) {
                    dVar.r();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* loaded from: classes5.dex */
    class n implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f43274a;

        n(CameraModule cameraModule, int i11) {
            this.f43274a = i11;
        }

        @Override // com.facebook.react.uimanager.q0
        public void execute(com.facebook.react.uimanager.m mVar) {
            try {
                org.reactnative.camera.d dVar = (org.reactnative.camera.d) mVar.resolveView(this.f43274a);
                if (dVar.p()) {
                    dVar.u();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public CameraModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mScopedContext = new f80.d(reactApplicationContext);
    }

    @ReactMethod
    public void checkIfRecordAudioPermissionsAreDefined(Promise promise) {
        try {
            String[] strArr = getCurrentActivity().getPackageManager().getPackageInfo(getReactApplicationContext().getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (String str : strArr) {
                    if (str.equals("android.permission.RECORD_AUDIO")) {
                        promise.resolve(Boolean.TRUE);
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        promise.resolve(Boolean.FALSE);
    }

    @ReactMethod
    public void checkIfVideoIsValid(String str, Promise promise) {
        new e(this, getReactApplicationContext(), str, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void getAvailablePictureSizes(String str, int i11, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new c(this, i11, str, promise));
    }

    @ReactMethod
    public void getCameraIds(int i11, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new b(this, i11, promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return Collections.unmodifiableMap(new g(this));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCameraModule";
    }

    public f80.d getScopedContext() {
        return this.mScopedContext;
    }

    @ReactMethod
    public void getSupportedPreviewFpsRange(int i11, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new d(this, i11, promise));
    }

    @ReactMethod
    public void getSupportedRatios(int i11, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new a(this, i11, promise));
    }

    @ReactMethod
    public void pausePreview(int i11) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new h(this, i11));
    }

    @ReactMethod
    public void pauseRecording(int i11) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new m(this, i11));
    }

    @ReactMethod
    public void record(ReadableMap readableMap, int i11, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new k(this, i11, readableMap, promise, this.mScopedContext.b()));
    }

    @ReactMethod
    public void resumePreview(int i11) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new i(this, i11));
    }

    @ReactMethod
    public void resumeRecording(int i11) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new n(this, i11));
    }

    @ReactMethod
    public void stopRecording(int i11) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new l(this, i11));
    }

    @ReactMethod
    public void takePicture(ReadableMap readableMap, int i11, Promise promise) {
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new j(this, i11, readableMap, promise, this.mScopedContext.b()));
    }
}