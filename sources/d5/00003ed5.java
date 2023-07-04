package com.lwansbrough.RCTCamera;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaActionSound;
import android.media.MediaRecorder;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.lwansbrough.RCTCamera.MutableImage;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import expo.modules.imagepicker.ImagePickerConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.crypto.tls.CipherSuite;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes2.dex */
public class RCTCameraModule extends ReactContextBaseJavaModule implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener, LifecycleEventListener {
    public static final int MEDIA_TYPE_IMAGE = 1;
    public static final int MEDIA_TYPE_VIDEO = 2;
    public static final int RCT_CAMERA_ASPECT_FILL = 0;
    public static final int RCT_CAMERA_ASPECT_FIT = 1;
    public static final int RCT_CAMERA_ASPECT_STRETCH = 2;
    public static final int RCT_CAMERA_CAPTURE_MODE_STILL = 0;
    public static final int RCT_CAMERA_CAPTURE_MODE_VIDEO = 1;
    public static final String RCT_CAMERA_CAPTURE_QUALITY_1080P = "1080p";
    public static final String RCT_CAMERA_CAPTURE_QUALITY_480P = "480p";
    public static final String RCT_CAMERA_CAPTURE_QUALITY_720P = "720p";
    public static final String RCT_CAMERA_CAPTURE_QUALITY_HIGH = "high";
    public static final String RCT_CAMERA_CAPTURE_QUALITY_LOW = "low";
    public static final String RCT_CAMERA_CAPTURE_QUALITY_MEDIUM = "medium";
    public static final String RCT_CAMERA_CAPTURE_QUALITY_PREVIEW = "preview";
    public static final int RCT_CAMERA_CAPTURE_TARGET_CAMERA_ROLL = 2;
    public static final int RCT_CAMERA_CAPTURE_TARGET_DISK = 1;
    public static final int RCT_CAMERA_CAPTURE_TARGET_MEMORY = 0;
    public static final int RCT_CAMERA_CAPTURE_TARGET_TEMP = 3;
    public static final int RCT_CAMERA_FLASH_MODE_AUTO = 2;
    public static final int RCT_CAMERA_FLASH_MODE_OFF = 0;
    public static final int RCT_CAMERA_FLASH_MODE_ON = 1;
    public static final int RCT_CAMERA_ORIENTATION_AUTO = Integer.MAX_VALUE;
    public static final int RCT_CAMERA_ORIENTATION_LANDSCAPE_LEFT = 1;
    public static final int RCT_CAMERA_ORIENTATION_LANDSCAPE_RIGHT = 3;
    public static final int RCT_CAMERA_ORIENTATION_PORTRAIT = 0;
    public static final int RCT_CAMERA_ORIENTATION_PORTRAIT_UPSIDE_DOWN = 2;
    public static final int RCT_CAMERA_TORCH_MODE_AUTO = 2;
    public static final int RCT_CAMERA_TORCH_MODE_OFF = 0;
    public static final int RCT_CAMERA_TORCH_MODE_ON = 1;
    public static final int RCT_CAMERA_TYPE_BACK = 2;
    public static final int RCT_CAMERA_TYPE_FRONT = 1;
    private static final String TAG = "RCTCameraModule";
    private static ReactApplicationContext _reactContext;
    private long MRStartTime;
    private com.lwansbrough.RCTCamera.e _sensorOrientationChecker;
    private Camera mCamera;
    private MediaRecorder mMediaRecorder;
    private ReadableMap mRecordingOptions;
    private Promise mRecordingPromise;
    private Boolean mSafeToCapture;
    private File mVideoFile;

    /* loaded from: classes2.dex */
    class a extends HashMap<String, Object> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.lwansbrough.RCTCamera.RCTCameraModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0320a extends HashMap<String, Object> {
            C0320a(a aVar) {
                put("stretch", 2);
                put("fit", 1);
                put("fill", 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class b extends HashMap<String, Object> {
            b(a aVar) {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class c extends HashMap<String, Object> {
            c(a aVar) {
                put("front", 1);
                put("back", 2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class d extends HashMap<String, Object> {
            d(a aVar) {
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_LOW, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_LOW);
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM);
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH);
                put("photo", RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH);
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW);
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_480P, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_480P);
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_720P, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_720P);
                put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_1080P, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_1080P);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class e extends HashMap<String, Object> {
            e(a aVar) {
                put("still", 0);
                put(MediaStreamTrack.VIDEO_TRACK_KIND, 1);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class f extends HashMap<String, Object> {
            f(a aVar) {
                put("memory", 0);
                put("disk", 1);
                put("cameraRoll", 2);
                put("temp", 3);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class g extends HashMap<String, Object> {
            g(a aVar) {
                put("auto", Integer.MAX_VALUE);
                put("landscapeLeft", 1);
                put("landscapeRight", 3);
                put("portrait", 0);
                put("portraitUpsideDown", 2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class h extends HashMap<String, Object> {
            h(a aVar) {
                put("off", 0);
                put("on", 1);
                put("auto", 2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class i extends HashMap<String, Object> {
            i(a aVar) {
                put("off", 0);
                put("on", 1);
                put("auto", 2);
            }
        }

        a(RCTCameraModule rCTCameraModule) {
            put("Aspect", a());
            put("BarCodeType", b());
            put("Type", k());
            put("CaptureQuality", e());
            put("CaptureMode", c());
            put("CaptureTarget", f());
            put("Orientation", i());
            put("FlashMode", h());
            put("TorchMode", j());
        }

        private Map<String, Object> a() {
            return Collections.unmodifiableMap(new C0320a(this));
        }

        private Map<String, Object> b() {
            return Collections.unmodifiableMap(new b(this));
        }

        private Map<String, Object> c() {
            return Collections.unmodifiableMap(new e(this));
        }

        private Map<String, Object> e() {
            return Collections.unmodifiableMap(new d(this));
        }

        private Map<String, Object> f() {
            return Collections.unmodifiableMap(new f(this));
        }

        private Map<String, Object> h() {
            return Collections.unmodifiableMap(new h(this));
        }

        private Map<String, Object> i() {
            return Collections.unmodifiableMap(new g(this));
        }

        private Map<String, Object> j() {
            return Collections.unmodifiableMap(new i(this));
        }

        private Map<String, Object> k() {
            return Collections.unmodifiableMap(new c(this));
        }
    }

    /* loaded from: classes2.dex */
    class b implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReadableMap f17854a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f17855b;

        b(ReadableMap readableMap, Promise promise) {
            this.f17854a = readableMap;
            this.f17855b = promise;
        }

        @Override // com.lwansbrough.RCTCamera.f
        public void a() {
            int b11 = RCTCameraModule.this._sensorOrientationChecker.b();
            RCTCameraModule.this._sensorOrientationChecker.f();
            RCTCameraModule.this._sensorOrientationChecker.c();
            RCTCameraModule.this.captureWithOrientation(this.f17854a, this.f17855b, b11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements Camera.PictureCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReadableMap f17857a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f17858b;

        /* loaded from: classes2.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ byte[] f17860a;

            a(byte[] bArr) {
                this.f17860a = bArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                RCTCameraModule rCTCameraModule = RCTCameraModule.this;
                MutableImage mutableImage = new MutableImage(this.f17860a);
                c cVar = c.this;
                rCTCameraModule.processImage(mutableImage, cVar.f17857a, cVar.f17858b);
            }
        }

        c(ReadableMap readableMap, Promise promise) {
            this.f17857a = readableMap;
            this.f17858b = promise;
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            camera.stopPreview();
            camera.startPreview();
            AsyncTask.execute(new a(bArr));
            RCTCameraModule.this.mSafeToCapture = Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements Camera.ShutterCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Camera f17862a;

        d(RCTCameraModule rCTCameraModule, Camera camera) {
            this.f17862a = camera;
        }

        @Override // android.hardware.Camera.ShutterCallback
        public void onShutter() {
            try {
                this.f17862a.setPreviewCallback(null);
                this.f17862a.setPreviewTexture(null);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements MediaScannerConnection.OnScanCompletedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WritableMap f17863a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f17864b;

        e(RCTCameraModule rCTCameraModule, WritableMap writableMap, Promise promise) {
            this.f17863a = writableMap;
            this.f17864b = promise;
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            if (uri != null) {
                this.f17863a.putString("mediaUri", uri.toString());
            }
            this.f17864b.resolve(this.f17863a);
        }
    }

    public RCTCameraModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mCamera = null;
        this.mRecordingPromise = null;
        this.mSafeToCapture = Boolean.TRUE;
        _reactContext = reactApplicationContext;
        this._sensorOrientationChecker = new com.lwansbrough.RCTCamera.e(reactApplicationContext);
        _reactContext.addLifecycleEventListener(this);
    }

    private void addToMediaStore(String str) {
        MediaScannerConnection.scanFile(_reactContext, new String[]{str}, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void captureWithOrientation(ReadableMap readableMap, Promise promise, int i11) {
        Camera a11 = com.lwansbrough.RCTCamera.a.h().a(readableMap.getInt("type"));
        if (a11 == null) {
            promise.reject("No camera found.");
        } else if (readableMap.getInt("mode") == 1) {
            record(readableMap, promise, i11);
        } else {
            com.lwansbrough.RCTCamera.a.h().w(readableMap.getInt("type"), readableMap.getString(ImagePickerConstants.OPTION_QUALITY));
            if (readableMap.hasKey("playSoundOnCapture") && readableMap.getBoolean("playSoundOnCapture")) {
                new MediaActionSound().play(0);
            }
            if (readableMap.hasKey(ImagePickerConstants.OPTION_QUALITY)) {
                com.lwansbrough.RCTCamera.a.h().w(readableMap.getInt("type"), readableMap.getString(ImagePickerConstants.OPTION_QUALITY));
            }
            com.lwansbrough.RCTCamera.a.h().b(readableMap.getInt("type"), i11);
            a11.setPreviewCallback(null);
            c cVar = new c(readableMap, promise);
            d dVar = new d(this, a11);
            if (this.mSafeToCapture.booleanValue()) {
                try {
                    a11.takePicture(dVar, null, cVar);
                    this.mSafeToCapture = Boolean.FALSE;
                } catch (RuntimeException e11) {
                    Log.e(TAG, "Couldn't capture photo.", e11);
                }
            }
        }
    }

    public static byte[] convertFileToByteArray(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[PKIFailureInfo.certRevoked];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    private File getOutputCameraRollFile(int i11) {
        return getOutputFile(i11, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM));
    }

    private File getOutputFile(int i11, File file) {
        String format;
        if (!file.exists() && !file.mkdirs()) {
            Log.e(TAG, "failed to create directory:" + file.getAbsolutePath());
            return null;
        }
        String format2 = String.format("%s", new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()));
        if (i11 == 1) {
            format = String.format("IMG_%s.jpg", format2);
        } else if (i11 == 2) {
            format = String.format("VID_%s.mp4", format2);
        } else {
            Log.e(TAG, "Unsupported media type:" + i11);
            return null;
        }
        return new File(String.format("%s%s%s", file.getPath(), File.separator, format));
    }

    private File getOutputMediaFile(int i11) {
        String str;
        if (i11 == 1) {
            str = Environment.DIRECTORY_PICTURES;
        } else if (i11 == 2) {
            str = Environment.DIRECTORY_MOVIES;
        } else {
            Log.e(TAG, "Unsupported media type:" + i11);
            return null;
        }
        return getOutputFile(i11, Environment.getExternalStoragePublicDirectory(str));
    }

    public static ReactApplicationContext getReactContextSingleton() {
        return _reactContext;
    }

    private File getTempMediaFile(int i11) {
        try {
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            File cacheDir = _reactContext.getCacheDir();
            if (i11 == 1) {
                return File.createTempFile("IMG_" + format, ".jpg", cacheDir);
            } else if (i11 == 2) {
                return File.createTempFile("VID_" + format, ".mp4", cacheDir);
            } else {
                Log.e(TAG, "Unsupported media type:" + i11);
                return null;
            }
        } catch (Exception e11) {
            Log.e(TAG, e11.getMessage());
            return null;
        }
    }

    private Throwable prepareMediaRecorder(ReadableMap readableMap, int i11) {
        CamcorderProfile x11 = com.lwansbrough.RCTCamera.a.h().x(readableMap.getInt("type"), readableMap.getString(ImagePickerConstants.OPTION_QUALITY));
        if (x11 == null) {
            return new RuntimeException("CamcorderProfile not found in prepareMediaRecorder.");
        }
        this.mCamera.unlock();
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.mMediaRecorder = mediaRecorder;
        mediaRecorder.setOnInfoListener(this);
        this.mMediaRecorder.setOnErrorListener(this);
        this.mMediaRecorder.setCamera(this.mCamera);
        this.mMediaRecorder.setAudioSource(5);
        this.mMediaRecorder.setVideoSource(1);
        if (i11 == 0) {
            this.mMediaRecorder.setOrientationHint(90);
        } else if (i11 == 1) {
            this.mMediaRecorder.setOrientationHint(0);
        } else if (i11 == 2) {
            this.mMediaRecorder.setOrientationHint(270);
        } else if (i11 == 3) {
            this.mMediaRecorder.setOrientationHint(CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256);
        }
        x11.fileFormat = 2;
        this.mMediaRecorder.setProfile(x11);
        this.mVideoFile = null;
        int i12 = readableMap.getInt("target");
        if (i12 == 0) {
            this.mVideoFile = getTempMediaFile(2);
        } else if (i12 == 2) {
            this.mVideoFile = getOutputCameraRollFile(2);
        } else if (i12 != 3) {
            this.mVideoFile = getOutputMediaFile(2);
        } else {
            this.mVideoFile = getTempMediaFile(2);
        }
        File file = this.mVideoFile;
        if (file == null) {
            return new RuntimeException("Error while preparing output file in prepareMediaRecorder.");
        }
        this.mMediaRecorder.setOutputFile(file.getPath());
        if (readableMap.hasKey("totalSeconds")) {
            this.mMediaRecorder.setMaxDuration(readableMap.getInt("totalSeconds") * 1000);
        }
        if (readableMap.hasKey("maxFileSize")) {
            this.mMediaRecorder.setMaxFileSize(readableMap.getInt("maxFileSize"));
        }
        try {
            this.mMediaRecorder.prepare();
            return null;
        } catch (Exception e11) {
            Log.e(TAG, "Media recorder prepare error.", e11);
            releaseMediaRecorder();
            return e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void processImage(MutableImage mutableImage, ReadableMap readableMap, Promise promise) {
        boolean z11;
        boolean z12 = false;
        if (readableMap.hasKey("fixOrientation") && readableMap.getBoolean("fixOrientation")) {
            try {
                mutableImage.c();
            } catch (MutableImage.ImageMutationFailedException e11) {
                promise.reject("Error fixing orientation image", e11);
            }
        }
        double e12 = mutableImage.e() / mutableImage.d();
        try {
            int i11 = readableMap.getInt("type");
            double l11 = com.lwansbrough.RCTCamera.a.h().l(i11) / com.lwansbrough.RCTCamera.a.h().k(i11);
            z11 = ((l11 > 1.0d ? 1 : (l11 == 1.0d ? 0 : -1)) > 0) != ((e12 > 1.0d ? 1 : (e12 == 1.0d ? 0 : -1)) > 0);
            e12 = l11;
        } catch (IllegalArgumentException unused) {
            z11 = false;
        }
        if (readableMap.hasKey("cropToPreview") && readableMap.getBoolean("cropToPreview")) {
            if (z11) {
                e12 = 1.0d / e12;
            }
            try {
                mutableImage.b(e12);
            } catch (IllegalArgumentException e13) {
                promise.reject("Error cropping image to preview", e13);
            }
        }
        if (readableMap.hasKey("mirrorImage") && readableMap.getBoolean("mirrorImage")) {
            z12 = true;
        }
        if (z12) {
            try {
                mutableImage.f();
            } catch (MutableImage.ImageMutationFailedException e14) {
                promise.reject("Error mirroring image", e14);
            }
        }
        int i12 = readableMap.hasKey("jpegQuality") ? readableMap.getInt("jpegQuality") : 80;
        int d11 = z11 ? mutableImage.d() : mutableImage.e();
        int e15 = z11 ? mutableImage.e() : mutableImage.d();
        int i13 = readableMap.getInt("target");
        if (i13 == 0) {
            String j11 = mutableImage.j(i12);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(MessageExtension.FIELD_DATA, j11);
            writableNativeMap.putInt(Snapshot.WIDTH, d11);
            writableNativeMap.putInt(Snapshot.HEIGHT, e15);
            promise.resolve(writableNativeMap);
        } else if (i13 == 1) {
            File outputMediaFile = getOutputMediaFile(1);
            if (outputMediaFile == null) {
                promise.reject("Error creating media file.");
                return;
            }
            try {
                mutableImage.m(outputMediaFile, readableMap, i12);
                resolveImage(outputMediaFile, d11, e15, promise, false);
            } catch (IOException e16) {
                promise.reject("failed to save image file", e16);
            }
        } else if (i13 == 2) {
            File outputCameraRollFile = getOutputCameraRollFile(1);
            if (outputCameraRollFile == null) {
                promise.reject("Error creating media file.");
                return;
            }
            try {
                mutableImage.m(outputCameraRollFile, readableMap, i12);
                addToMediaStore(outputCameraRollFile.getAbsolutePath());
                resolveImage(outputCameraRollFile, d11, e15, promise, true);
            } catch (IOException e17) {
                e = e17;
                promise.reject("failed to save image file", e);
            } catch (NullPointerException e18) {
                e = e18;
                promise.reject("failed to save image file", e);
            }
        } else if (i13 == 3) {
            File tempMediaFile = getTempMediaFile(1);
            if (tempMediaFile == null) {
                promise.reject("Error creating media file.");
                return;
            }
            try {
                mutableImage.m(tempMediaFile, readableMap, i12);
                resolveImage(tempMediaFile, d11, e15, promise, false);
            } catch (IOException e19) {
                promise.reject("failed to save image file", e19);
            }
        }
    }

    private void record(ReadableMap readableMap, Promise promise, int i11) {
        if (this.mRecordingPromise != null) {
            return;
        }
        Camera a11 = com.lwansbrough.RCTCamera.a.h().a(readableMap.getInt("type"));
        this.mCamera = a11;
        if (a11 == null) {
            promise.reject(new RuntimeException("No camera found."));
            return;
        }
        Throwable prepareMediaRecorder = prepareMediaRecorder(readableMap, i11);
        if (prepareMediaRecorder != null) {
            promise.reject(prepareMediaRecorder);
            return;
        }
        try {
            this.mMediaRecorder.start();
            this.MRStartTime = System.currentTimeMillis();
            this.mRecordingOptions = readableMap;
            this.mRecordingPromise = promise;
        } catch (Exception e11) {
            Log.e(TAG, "Media recorder start error.", e11);
            promise.reject(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
        if (r4 != 3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void releaseMediaRecorder() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lwansbrough.RCTCamera.RCTCameraModule.releaseMediaRecorder():void");
    }

    private void resolveImage(File file, int i11, int i12, Promise promise, boolean z11) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("path", Uri.fromFile(file).toString());
        writableNativeMap.putInt(Snapshot.WIDTH, i11);
        writableNativeMap.putInt(Snapshot.HEIGHT, i12);
        if (z11) {
            MediaScannerConnection.scanFile(_reactContext, new String[]{file.getAbsolutePath()}, null, new e(this, writableNativeMap, promise));
        } else {
            promise.resolve(writableNativeMap);
        }
    }

    @ReactMethod
    public void capture(ReadableMap readableMap, Promise promise) {
        if (com.lwansbrough.RCTCamera.a.h() == null) {
            promise.reject("Camera is not ready yet.");
            return;
        }
        int i11 = readableMap.hasKey("orientation") ? readableMap.getInt("orientation") : com.lwansbrough.RCTCamera.a.h().i();
        if (i11 == Integer.MAX_VALUE) {
            this._sensorOrientationChecker.d();
            this._sensorOrientationChecker.e(new b(readableMap, promise));
            return;
        }
        captureWithOrientation(readableMap, promise, i11);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return Collections.unmodifiableMap(new a(this));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void hasFlash(ReadableMap readableMap, Promise promise) {
        Camera a11 = com.lwansbrough.RCTCamera.a.h().a(readableMap.getInt("type"));
        if (a11 == null) {
            promise.reject("No camera found.");
            return;
        }
        List<String> supportedFlashModes = a11.getParameters().getSupportedFlashModes();
        promise.resolve(Boolean.valueOf((supportedFlashModes == null || supportedFlashModes.isEmpty()) ? false : true));
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public void onError(MediaRecorder mediaRecorder, int i11, int i12) {
        if (this.mRecordingPromise != null) {
            releaseMediaRecorder();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        if (this.mRecordingPromise != null) {
            releaseMediaRecorder();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mSafeToCapture = Boolean.TRUE;
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public void onInfo(MediaRecorder mediaRecorder, int i11, int i12) {
        if ((i11 == 800 || i11 == 801) && this.mRecordingPromise != null) {
            releaseMediaRecorder();
        }
    }

    @ReactMethod
    public void setZoom(ReadableMap readableMap, int i11) {
        Camera a11;
        com.lwansbrough.RCTCamera.a h11 = com.lwansbrough.RCTCamera.a.h();
        if (h11 == null || (a11 = h11.a(readableMap.getInt("type"))) == null) {
            return;
        }
        Camera.Parameters parameters = a11.getParameters();
        int maxZoom = parameters.getMaxZoom();
        if (!parameters.isZoomSupported() || i11 < 0 || i11 >= maxZoom) {
            return;
        }
        parameters.setZoom(i11);
        try {
            a11.setParameters(parameters);
        } catch (RuntimeException e11) {
            Log.e(TAG, "setParameters failed", e11);
        }
    }

    @ReactMethod
    public void stopCapture(Promise promise) {
        if (this.mRecordingPromise != null) {
            releaseMediaRecorder();
            promise.resolve("Finished recording.");
            return;
        }
        promise.resolve("Not recording.");
    }
}