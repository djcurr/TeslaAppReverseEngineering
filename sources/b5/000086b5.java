package mh;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaActionSound;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.imagepicker.ImagePickerConstants;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import mh.f;
import mh.i;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes3.dex */
class c extends mh.f implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener {
    private static final SparseIntArray Q1;
    private final k A;
    private final k B;
    private mh.j C;
    private int E;
    private mh.a F;
    private mh.a G;
    private boolean H;
    private int K;
    private float L;
    private int O;
    private int P;
    private int Q;
    private float R;
    private float T;
    private int Y;

    /* renamed from: b1  reason: collision with root package name */
    private boolean f38531b1;

    /* renamed from: d  reason: collision with root package name */
    private final CameraManager f38532d;

    /* renamed from: e  reason: collision with root package name */
    private final CameraDevice.StateCallback f38533e;

    /* renamed from: f  reason: collision with root package name */
    private final CameraCaptureSession.StateCallback f38534f;

    /* renamed from: g  reason: collision with root package name */
    j f38535g;

    /* renamed from: g1  reason: collision with root package name */
    private Boolean f38536g1;

    /* renamed from: h  reason: collision with root package name */
    private final ImageReader.OnImageAvailableListener f38537h;

    /* renamed from: i  reason: collision with root package name */
    private String f38538i;

    /* renamed from: j  reason: collision with root package name */
    private String f38539j;

    /* renamed from: k  reason: collision with root package name */
    private CameraCharacteristics f38540k;

    /* renamed from: l  reason: collision with root package name */
    CameraDevice f38541l;

    /* renamed from: m  reason: collision with root package name */
    MediaActionSound f38542m;

    /* renamed from: n  reason: collision with root package name */
    CameraCaptureSession f38543n;

    /* renamed from: o  reason: collision with root package name */
    CaptureRequest.Builder f38544o;

    /* renamed from: p  reason: collision with root package name */
    Set<String> f38545p;

    /* renamed from: p1  reason: collision with root package name */
    private Boolean f38546p1;

    /* renamed from: q  reason: collision with root package name */
    private ImageReader f38547q;

    /* renamed from: t  reason: collision with root package name */
    private ImageReader f38548t;

    /* renamed from: w  reason: collision with root package name */
    private int f38549w;

    /* renamed from: x  reason: collision with root package name */
    private MediaRecorder f38550x;

    /* renamed from: x1  reason: collision with root package name */
    private Surface f38551x1;

    /* renamed from: y  reason: collision with root package name */
    private String f38552y;

    /* renamed from: y1  reason: collision with root package name */
    private Rect f38553y1;

    /* renamed from: z  reason: collision with root package name */
    private boolean f38554z;

    /* loaded from: classes3.dex */
    class a extends CameraDevice.StateCallback {
        a() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            c.this.f38590a.onCameraClosed();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            c.this.f38541l = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i11) {
            Log.e("Camera2", "onError: " + cameraDevice.getId() + " (" + i11 + ")");
            c.this.f38541l = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            c cVar = c.this;
            cVar.f38541l = cameraDevice;
            cVar.f38590a.b();
            c.this.q0();
        }
    }

    /* loaded from: classes3.dex */
    class b extends CameraCaptureSession.StateCallback {
        b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            CameraCaptureSession cameraCaptureSession2 = c.this.f38543n;
            if (cameraCaptureSession2 == null || !cameraCaptureSession2.equals(cameraCaptureSession)) {
                return;
            }
            c.this.f38543n = null;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Log.e("Camera2", "Failed to configure capture session.");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            c cVar = c.this;
            if (cVar.f38541l == null) {
                return;
            }
            cVar.f38543n = cameraCaptureSession;
            cVar.f38553y1 = (Rect) cVar.f38544o.get(CaptureRequest.SCALER_CROP_REGION);
            c.this.u0();
            c.this.v0();
            c.this.w0();
            c.this.x0();
            c.this.y0();
            try {
                c cVar2 = c.this;
                cVar2.f38543n.setRepeatingRequest(cVar2.f38544o.build(), c.this.f38535g, null);
            } catch (CameraAccessException e11) {
                Log.e("Camera2", "Failed to start camera preview because it couldn't access camera", e11);
            } catch (IllegalStateException e12) {
                Log.e("Camera2", "Failed to start camera preview.", e12);
            }
        }
    }

    /* renamed from: mh.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0747c extends j {
        C0747c() {
        }

        @Override // mh.c.j
        public void b() {
            c.this.f38544o.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            f(3);
            try {
                c cVar = c.this;
                cVar.f38543n.capture(cVar.f38544o.build(), this, null);
                c.this.f38544o.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            } catch (CameraAccessException e11) {
                Log.e("Camera2", "Failed to run precapture sequence.", e11);
            }
        }

        @Override // mh.c.j
        public void c() {
            c.this.Z();
        }
    }

    /* loaded from: classes3.dex */
    class d implements ImageReader.OnImageAvailableListener {
        d() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image acquireNextImage = imageReader.acquireNextImage();
            try {
                Image.Plane[] planes = acquireNextImage.getPlanes();
                if (planes.length > 0) {
                    ByteBuffer buffer = planes[0].getBuffer();
                    byte[] bArr = new byte[buffer.remaining()];
                    buffer.get(bArr);
                    if (acquireNextImage.getFormat() != 256) {
                        c.this.f38590a.d(bArr, acquireNextImage.getWidth(), acquireNextImage.getHeight(), c.this.P);
                    } else {
                        c.this.f38590a.c(bArr, 0);
                    }
                    acquireNextImage.close();
                }
                acquireNextImage.close();
            } catch (Throwable th2) {
                if (acquireNextImage != null) {
                    try {
                        acquireNextImage.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    /* loaded from: classes3.dex */
    class e extends CameraManager.AvailabilityCallback {
        e() {
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            super.onCameraAvailable(str);
            c.this.f38545p.add(str);
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            super.onCameraUnavailable(str);
            c.this.f38545p.remove(str);
        }
    }

    /* loaded from: classes3.dex */
    class f implements i.a {
        f() {
        }

        @Override // mh.i.a
        public void a() {
            c.this.S();
        }

        @Override // mh.i.a
        public void b() {
            c.this.q0();
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraCaptureSession cameraCaptureSession = c.this.f38543n;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                c.this.f38543n = null;
            }
            c.this.q0();
        }
    }

    /* loaded from: classes3.dex */
    class h extends CameraCaptureSession.CaptureCallback {
        h() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            if (captureRequest.getTag() == "FOCUS_TAG") {
                c.this.f38544o.set(CaptureRequest.CONTROL_AF_TRIGGER, null);
                try {
                    c cVar = c.this;
                    cVar.f38543n.setRepeatingRequest(cVar.f38544o.build(), null, null);
                } catch (CameraAccessException e11) {
                    Log.e("Camera2", "Failed to manual focus.", e11);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            Log.e("Camera2", "Manual AF failure: " + captureFailure);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class i extends CameraCaptureSession.CaptureCallback {
        i() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            if (c.this.f38535g.a().hasKey("pauseAfterCapture") && !c.this.f38535g.a().getBoolean("pauseAfterCapture")) {
                c.this.t0();
            }
            if (c.this.f38536g1.booleanValue()) {
                c.this.f38542m.play(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static abstract class j extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a  reason: collision with root package name */
        private int f38564a;

        /* renamed from: b  reason: collision with root package name */
        private ReadableMap f38565b = null;

        j() {
        }

        private void d(CaptureResult captureResult) {
            int i11 = this.f38564a;
            if (i11 == 1) {
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    return;
                }
                if (num.intValue() == 4 || num.intValue() == 5) {
                    Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num2 != null && num2.intValue() != 2) {
                        f(2);
                        b();
                        return;
                    }
                    f(5);
                    c();
                }
            } else if (i11 == 3) {
                Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num3 == null || num3.intValue() == 5 || num3.intValue() == 4 || num3.intValue() == 2) {
                    f(4);
                }
            } else if (i11 != 4) {
            } else {
                Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num4 == null || num4.intValue() != 5) {
                    f(5);
                    c();
                }
            }
        }

        ReadableMap a() {
            return this.f38565b;
        }

        public abstract void b();

        public abstract void c();

        void e(ReadableMap readableMap) {
            this.f38565b = readableMap;
        }

        void f(int i11) {
            this.f38564a = i11;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            d(totalCaptureResult);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            d(captureResult);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q1 = sparseIntArray;
        sparseIntArray.put(0, 1);
        sparseIntArray.put(1, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(f.a aVar, mh.i iVar, Context context, Handler handler) {
        super(aVar, iVar, handler);
        this.f38533e = new a();
        this.f38534f = new b();
        this.f38535g = new C0747c();
        this.f38537h = new d();
        this.f38542m = new MediaActionSound();
        this.f38545p = new HashSet();
        this.A = new k();
        this.B = new k();
        this.F = mh.g.f38593a;
        Boolean bool = Boolean.FALSE;
        this.f38536g1 = bool;
        this.f38546p1 = bool;
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        this.f38532d = cameraManager;
        cameraManager.registerAvailabilityCallback(new e(), (Handler) null);
        this.f38549w = this.f38531b1 ? 35 : 256;
        this.f38591b.l(new f());
    }

    private MeteringRectangle Y(float f11, float f12) {
        Rect rect = (Rect) this.f38540k.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return new MeteringRectangle(Math.max(((int) (f11 * rect.width())) - 150, 0), Math.max(((int) (f12 * rect.height())) - 150, 0), 300, 300, 999);
    }

    private boolean a0() {
        String str = this.f38539j;
        if (str != null && !str.isEmpty()) {
            try {
                CameraCharacteristics cameraCharacteristics = this.f38532d.getCameraCharacteristics(this.f38539j);
                this.f38540k = cameraCharacteristics;
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num == null) {
                    Log.e("Camera2", "Unexpected state: LENS_FACING null");
                    return false;
                }
                int size = Q1.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    SparseIntArray sparseIntArray = Q1;
                    if (sparseIntArray.valueAt(i11) == num.intValue()) {
                        this.E = sparseIntArray.keyAt(i11);
                        break;
                    }
                    i11++;
                }
                this.f38538i = this.f38539j;
                return true;
            } catch (Exception e11) {
                Log.e("Camera2", "Failed to get camera characteristics", e11);
                return false;
            }
        }
        try {
            int i12 = Q1.get(this.E);
            String[] cameraIdList = this.f38532d.getCameraIdList();
            if (cameraIdList.length == 0) {
                Log.e("Camera2", "No cameras available.");
                return false;
            }
            for (String str2 : cameraIdList) {
                CameraCharacteristics cameraCharacteristics2 = this.f38532d.getCameraCharacteristics(str2);
                Integer num2 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.LENS_FACING);
                if (num2 == null) {
                    Log.e("Camera2", "Unexpected state: LENS_FACING null");
                } else if (num2.intValue() == i12) {
                    this.f38538i = str2;
                    this.f38540k = cameraCharacteristics2;
                    return true;
                }
            }
            String str3 = cameraIdList[0];
            this.f38538i = str3;
            CameraCharacteristics cameraCharacteristics3 = this.f38532d.getCameraCharacteristics(str3);
            this.f38540k = cameraCharacteristics3;
            Integer num3 = (Integer) cameraCharacteristics3.get(CameraCharacteristics.LENS_FACING);
            if (num3 == null) {
                Log.e("Camera2", "Unexpected state: LENS_FACING null");
                return false;
            }
            int size2 = Q1.size();
            for (int i13 = 0; i13 < size2; i13++) {
                SparseIntArray sparseIntArray2 = Q1;
                if (sparseIntArray2.valueAt(i13) == num3.intValue()) {
                    this.E = sparseIntArray2.keyAt(i13);
                    return true;
                }
            }
            this.E = 0;
            return true;
        } catch (CameraAccessException e12) {
            Log.e("Camera2", "Failed to get a list of camera devices", e12);
            return false;
        }
    }

    private mh.j b0() {
        int i11 = this.f38591b.i();
        int c11 = this.f38591b.c();
        if (i11 < c11) {
            c11 = i11;
            i11 = c11;
        }
        SortedSet<mh.j> f11 = this.A.f(this.F);
        for (mh.j jVar : f11) {
            if (jVar.c() >= i11 && jVar.b() >= c11) {
                return jVar;
            }
        }
        return f11.last();
    }

    private void c0() {
        Size[] outputSizes;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f38540k.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            this.A.b();
            for (Size size : streamConfigurationMap.getOutputSizes(this.f38591b.d())) {
                int width = size.getWidth();
                int height = size.getHeight();
                if (width <= 1920 && height <= 1080) {
                    this.A.a(new mh.j(width, height));
                }
            }
            this.B.b();
            d0(this.B, streamConfigurationMap);
            if (this.C == null) {
                this.C = this.B.f(this.F).last();
            }
            for (mh.a aVar : this.A.d()) {
                if (!this.B.d().contains(aVar)) {
                    this.A.e(aVar);
                }
            }
            if (!this.A.d().contains(this.F)) {
                this.F = this.A.d().iterator().next();
            }
            this.O = ((Integer) this.f38540k.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            return;
        }
        throw new IllegalStateException("Failed to get configuration map: " + this.f38538i);
    }

    private int e0() {
        int intValue = ((Integer) this.f38540k.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        if (this.E == 0) {
            return (intValue + this.Q) % 360;
        }
        return ((intValue + this.Q) + (g0(this.Q) ? CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 : 0)) % 360;
    }

    private boolean g0(int i11) {
        return i11 == 90 || i11 == 270;
    }

    public static boolean h0(Context context) {
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
            for (String str : cameraManager.getCameraIdList()) {
                Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                int i11 = (num == null || num.intValue() == 2) ? 0 : i11 + 1;
                Log.w("Camera2", "Camera2 can only run in legacy mode and should not be used.");
                return true;
            }
            return false;
        } catch (CameraAccessException e11) {
            Log.e("Camera2", "Failed to check camera legacy status, returning true.", e11);
            return true;
        }
    }

    private boolean i0() {
        return ((Integer) this.f38540k.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() >= 1;
    }

    private void j0() {
        this.f38544o.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        try {
            this.f38535g.f(1);
            this.f38543n.capture(this.f38544o.build(), this.f38535g, null);
        } catch (CameraAccessException e11) {
            Log.e("Camera2", "Failed to lock focus.", e11);
        }
    }

    private void k0() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f38550x.pause();
        }
    }

    private void l0() {
        ImageReader imageReader = this.f38548t;
        if (imageReader != null) {
            imageReader.close();
        }
        mh.j last = this.A.f(this.F).last();
        ImageReader newInstance = ImageReader.newInstance(last.c(), last.b(), 35, 1);
        this.f38548t = newInstance;
        newInstance.setOnImageAvailableListener(this.f38537h, null);
    }

    private void m0() {
        ImageReader imageReader = this.f38547q;
        if (imageReader != null) {
            imageReader.close();
        }
        ImageReader newInstance = ImageReader.newInstance(this.C.c(), this.C.b(), 256, 1);
        this.f38547q = newInstance;
        newInstance.setOnImageAvailableListener(this.f38537h, null);
    }

    private void n0() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f38550x.resume();
        }
    }

    private void o0(CamcorderProfile camcorderProfile, boolean z11) {
        this.f38550x.setOutputFormat(camcorderProfile.fileFormat);
        this.f38550x.setVideoFrameRate(camcorderProfile.videoFrameRate);
        this.f38550x.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        this.f38550x.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
        this.f38550x.setVideoEncoder(camcorderProfile.videoCodec);
        if (z11) {
            this.f38550x.setAudioEncodingBitRate(camcorderProfile.audioBitRate);
            this.f38550x.setAudioChannels(camcorderProfile.audioChannels);
            this.f38550x.setAudioSamplingRate(camcorderProfile.audioSampleRate);
            this.f38550x.setAudioEncoder(camcorderProfile.audioCodec);
        }
    }

    private void p0(String str, int i11, int i12, boolean z11, CamcorderProfile camcorderProfile) {
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.f38550x = mediaRecorder;
        mediaRecorder.setVideoSource(2);
        if (z11) {
            this.f38550x.setAudioSource(1);
        }
        this.f38550x.setOutputFile(str);
        this.f38552y = str;
        CamcorderProfile camcorderProfile2 = !CamcorderProfile.hasProfile(Integer.parseInt(this.f38538i), camcorderProfile.quality) ? CamcorderProfile.get(1) : camcorderProfile;
        camcorderProfile2.videoBitRate = camcorderProfile.videoBitRate;
        o0(camcorderProfile2, z11);
        this.f38550x.setOrientationHint(e0());
        if (i11 != -1) {
            this.f38550x.setMaxDuration(i11);
        }
        if (i12 != -1) {
            this.f38550x.setMaxFileSize(i12);
        }
        this.f38550x.setOnInfoListener(this);
        this.f38550x.setOnErrorListener(this);
    }

    private void r0() {
        try {
            this.f38532d.openCamera(this.f38538i, this.f38533e, (Handler) null);
        } catch (CameraAccessException e11) {
            throw new RuntimeException("Failed to open camera: " + this.f38538i, e11);
        }
    }

    private void s0() {
        this.f38554z = false;
        try {
            this.f38543n.stopRepeating();
            this.f38543n.abortCaptures();
            this.f38550x.stop();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f38550x.reset();
        this.f38550x.release();
        this.f38550x = null;
        this.f38590a.a();
        if (this.f38546p1.booleanValue()) {
            this.f38542m.play(3);
        }
        if (this.f38552y != null && new File(this.f38552y).exists()) {
            this.f38590a.g(this.f38552y, 0, 0);
            this.f38552y = null;
            return;
        }
        this.f38590a.g(null, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public boolean A(mh.a aVar) {
        if (aVar != null && this.A.c()) {
            this.G = aVar;
            return false;
        } else if (aVar == null || aVar.equals(this.F) || !this.A.d().contains(aVar)) {
            return false;
        } else {
            this.F = aVar;
            m0();
            l0();
            CameraCaptureSession cameraCaptureSession = this.f38543n;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.f38543n = null;
                q0();
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void B(boolean z11) {
        if (this.H == z11) {
            return;
        }
        this.H = z11;
        if (this.f38544o != null) {
            u0();
            CameraCaptureSession cameraCaptureSession = this.f38543n;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.setRepeatingRequest(this.f38544o.build(), this.f38535g, null);
                } catch (CameraAccessException unused) {
                    this.H = !this.H;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void C(String str) {
        if (f80.b.a(this.f38539j, str)) {
            return;
        }
        this.f38539j = str;
        if (f80.b.a(str, this.f38538i) || !u()) {
            return;
        }
        S();
        R();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void D(int i11) {
        this.Q = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void E(int i11) {
        this.P = i11;
        this.f38591b.m(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void F(float f11) {
        Log.e("CAMERA_2:: ", "Adjusting exposure is not currently supported for Camera2");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void G(int i11) {
        if (this.E == i11) {
            return;
        }
        this.E = i11;
        if (u()) {
            S();
            R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void H(int i11) {
        int i12 = this.K;
        if (i12 == i11) {
            return;
        }
        this.K = i11;
        if (this.f38544o != null) {
            v0();
            CameraCaptureSession cameraCaptureSession = this.f38543n;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.setRepeatingRequest(this.f38544o.build(), this.f38535g, null);
                } catch (CameraAccessException unused) {
                    this.K = i12;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void I(float f11, float f12) {
        if (this.f38543n == null) {
            return;
        }
        h hVar = new h();
        try {
            this.f38543n.stopRepeating();
        } catch (CameraAccessException e11) {
            Log.e("Camera2", "Failed to manual focus.", e11);
        }
        this.f38544o.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.f38544o.set(CaptureRequest.CONTROL_AF_MODE, 0);
        try {
            this.f38543n.capture(this.f38544o.build(), hVar, null);
        } catch (CameraAccessException e12) {
            Log.e("Camera2", "Failed to manual focus.", e12);
        }
        if (i0()) {
            this.f38544o.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{Y(f11, f12)});
        }
        this.f38544o.set(CaptureRequest.CONTROL_MODE, 1);
        this.f38544o.set(CaptureRequest.CONTROL_AF_MODE, 1);
        this.f38544o.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        this.f38544o.setTag("FOCUS_TAG");
        try {
            this.f38543n.capture(this.f38544o.build(), hVar, null);
        } catch (CameraAccessException e13) {
            Log.e("Camera2", "Failed to manual focus.", e13);
        }
    }

    @Override // mh.f
    public void J(float f11) {
        float f12 = this.R;
        if (f12 == f11) {
            return;
        }
        this.R = f11;
        if (this.f38543n != null) {
            w0();
            try {
                this.f38543n.setRepeatingRequest(this.f38544o.build(), this.f38535g, null);
            } catch (CameraAccessException unused) {
                this.R = f12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void K(mh.j jVar) {
        CameraCaptureSession cameraCaptureSession = this.f38543n;
        if (cameraCaptureSession != null) {
            try {
                cameraCaptureSession.stopRepeating();
            } catch (CameraAccessException e11) {
                e11.printStackTrace();
            }
            this.f38543n.close();
            this.f38543n = null;
        }
        ImageReader imageReader = this.f38547q;
        if (imageReader != null) {
            imageReader.close();
        }
        if (jVar == null) {
            mh.a aVar = this.F;
            if (aVar == null || this.C == null) {
                return;
            }
            this.B.f(aVar).last();
        } else {
            this.C = jVar;
        }
        m0();
        q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void L(boolean z11) {
        this.f38536g1 = Boolean.valueOf(z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void M(boolean z11) {
        this.f38546p1 = Boolean.valueOf(z11);
    }

    @Override // mh.f
    public void N(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f38551x1 = new Surface(surfaceTexture);
        } else {
            this.f38551x1 = null;
        }
        new Handler(Looper.getMainLooper()).post(new g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void O(boolean z11) {
        if (this.f38531b1 == z11) {
            return;
        }
        this.f38531b1 = z11;
        if (!z11) {
            this.f38549w = 256;
        } else {
            this.f38549w = 35;
        }
        CameraCaptureSession cameraCaptureSession = this.f38543n;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f38543n = null;
        }
        q0();
    }

    @Override // mh.f
    public void P(int i11) {
        int i12 = this.Y;
        if (i12 == i11) {
            return;
        }
        this.Y = i11;
        if (this.f38543n != null) {
            x0();
            try {
                this.f38543n.setRepeatingRequest(this.f38544o.build(), this.f38535g, null);
            } catch (CameraAccessException unused) {
                this.Y = i12;
            }
        }
    }

    @Override // mh.f
    public void Q(float f11) {
        float f12 = this.T;
        if (f12 == f11) {
            return;
        }
        this.T = f11;
        if (this.f38543n != null) {
            y0();
            try {
                this.f38543n.setRepeatingRequest(this.f38544o.build(), this.f38535g, null);
            } catch (CameraAccessException unused) {
                this.T = f12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public boolean R() {
        if (!a0()) {
            this.F = this.G;
            this.f38590a.e();
            return false;
        }
        c0();
        A(this.G);
        this.G = null;
        m0();
        l0();
        r0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void S() {
        CameraCaptureSession cameraCaptureSession = this.f38543n;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f38543n = null;
        }
        CameraDevice cameraDevice = this.f38541l;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f38541l = null;
        }
        ImageReader imageReader = this.f38547q;
        if (imageReader != null) {
            imageReader.close();
            this.f38547q = null;
        }
        ImageReader imageReader2 = this.f38548t;
        if (imageReader2 != null) {
            imageReader2.close();
            this.f38548t = null;
        }
        MediaRecorder mediaRecorder = this.f38550x;
        if (mediaRecorder != null) {
            mediaRecorder.stop();
            this.f38550x.reset();
            this.f38550x.release();
            this.f38550x = null;
            if (this.f38554z) {
                this.f38590a.a();
                this.f38590a.g(this.f38552y, 0, 0);
                this.f38554z = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void T() {
        if (this.f38554z) {
            s0();
            CameraCaptureSession cameraCaptureSession = this.f38543n;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                this.f38543n = null;
            }
            q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void U(ReadableMap readableMap) {
        this.f38535g.e(readableMap);
        if (this.H) {
            j0();
        } else {
            Z();
        }
    }

    void Z() {
        try {
            CaptureRequest.Builder createCaptureRequest = this.f38541l.createCaptureRequest(2);
            if (this.f38531b1) {
                this.f38549w = 256;
                createCaptureRequest.removeTarget(this.f38548t.getSurface());
            }
            createCaptureRequest.addTarget(this.f38547q.getSurface());
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
            createCaptureRequest.set(key, (Integer) this.f38544o.get(key));
            int i11 = this.K;
            if (i11 == 0) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(CaptureRequest.FLASH_MODE, 0);
            } else if (i11 == 1) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 3);
            } else if (i11 == 2) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(CaptureRequest.FLASH_MODE, 2);
            } else if (i11 == 3) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 2);
            } else if (i11 == 4) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 2);
            }
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(e0()));
            if (this.f38535g.a().hasKey(ImagePickerConstants.OPTION_QUALITY)) {
                createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf((byte) (this.f38535g.a().getDouble(ImagePickerConstants.OPTION_QUALITY) * 100.0d)));
            }
            CaptureRequest.Key key2 = CaptureRequest.SCALER_CROP_REGION;
            createCaptureRequest.set(key2, (Rect) this.f38544o.get(key2));
            this.f38543n.stopRepeating();
            this.f38543n.capture(createCaptureRequest.build(), new i(), null);
        } catch (CameraAccessException e11) {
            Log.e("Camera2", "Cannot capture a still picture.", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public mh.a a() {
        return this.F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public boolean b() {
        return this.H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public SortedSet<mh.j> c(mh.a aVar) {
        return this.B.f(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public String d() {
        return this.f38539j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d0(k kVar, StreamConfigurationMap streamConfigurationMap) {
        Size[] outputSizes;
        for (Size size : streamConfigurationMap.getOutputSizes(this.f38549w)) {
            this.B.a(new mh.j(size.getWidth(), size.getHeight()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public List<Properties> e() {
        String[] cameraIdList;
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f38532d.getCameraIdList()) {
                Properties properties = new Properties();
                properties.put("id", str);
                properties.put("type", String.valueOf(((Integer) this.f38532d.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING)).intValue() == 0 ? 1 : 0));
                arrayList.add(properties);
            }
            return arrayList;
        } catch (CameraAccessException e11) {
            throw new RuntimeException("Failed to get a list of camera ids", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public int f() {
        return this.O;
    }

    public Surface f0() {
        Surface surface = this.f38551x1;
        return surface != null ? surface : this.f38591b.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public float g() {
        return this.L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public int h() {
        return this.E;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public int i() {
        return this.K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public float j() {
        return this.R;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public mh.j k() {
        return this.C;
    }

    @Override // mh.f
    public boolean l() {
        return this.f38536g1.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public boolean m() {
        return this.f38546p1.booleanValue();
    }

    @Override // mh.f
    public mh.j n() {
        return new mh.j(this.f38591b.i(), this.f38591b.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public boolean o() {
        return this.f38531b1;
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public void onError(MediaRecorder mediaRecorder, int i11, int i12) {
        T();
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public void onInfo(MediaRecorder mediaRecorder, int i11, int i12) {
        if (i11 == 800 || i11 == 801) {
            T();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public Set<mh.a> p() {
        return this.A.d();
    }

    @Override // mh.f
    public ArrayList<int[]> q() {
        Log.e("CAMERA_2:: ", "getSupportedPreviewFpsRange is not currently supported for Camera2");
        return new ArrayList<>();
    }

    void q0() {
        if (!u() || !this.f38591b.j() || this.f38547q == null || this.f38548t == null) {
            return;
        }
        mh.j b02 = b0();
        this.f38591b.k(b02.c(), b02.b());
        Surface f02 = f0();
        try {
            CaptureRequest.Builder createCaptureRequest = this.f38541l.createCaptureRequest(1);
            this.f38544o = createCaptureRequest;
            createCaptureRequest.addTarget(f02);
            if (this.f38531b1) {
                this.f38544o.addTarget(this.f38548t.getSurface());
            }
            this.f38541l.createCaptureSession(Arrays.asList(f02, this.f38547q.getSurface(), this.f38548t.getSurface()), this.f38534f, null);
        } catch (CameraAccessException e11) {
            Log.e("Camera2", "Failed to start capture session", e11);
            this.f38590a.e();
        }
    }

    @Override // mh.f
    public int s() {
        return this.Y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public float t() {
        return this.T;
    }

    void t0() {
        this.f38544o.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        try {
            this.f38543n.capture(this.f38544o.build(), this.f38535g, null);
            u0();
            v0();
            if (this.f38531b1) {
                this.f38549w = 35;
                q0();
            } else {
                this.f38544o.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                this.f38543n.setRepeatingRequest(this.f38544o.build(), this.f38535g, null);
                this.f38535g.f(0);
            }
        } catch (CameraAccessException e11) {
            Log.e("Camera2", "Failed to restart camera preview.", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public boolean u() {
        return this.f38541l != null;
    }

    void u0() {
        if (!this.H) {
            this.f38544o.set(CaptureRequest.CONTROL_AF_MODE, 0);
            return;
        }
        int[] iArr = (int[]) this.f38540k.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr != null && iArr.length != 0 && (iArr.length != 1 || iArr[0] != 0)) {
            this.f38544o.set(CaptureRequest.CONTROL_AF_MODE, 4);
            return;
        }
        this.H = false;
        this.f38544o.set(CaptureRequest.CONTROL_AF_MODE, 0);
    }

    @Override // mh.f
    public void v() {
        try {
            this.f38543n.stopRepeating();
        } catch (CameraAccessException e11) {
            e11.printStackTrace();
        }
    }

    void v0() {
        int i11 = this.K;
        if (i11 == 0) {
            this.f38544o.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f38544o.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i11 == 1) {
            this.f38544o.set(CaptureRequest.CONTROL_AE_MODE, 3);
            this.f38544o.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i11 == 2) {
            this.f38544o.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.f38544o.set(CaptureRequest.FLASH_MODE, 2);
        } else if (i11 == 3) {
            this.f38544o.set(CaptureRequest.CONTROL_AE_MODE, 2);
            this.f38544o.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i11 != 4) {
        } else {
            this.f38544o.set(CaptureRequest.CONTROL_AE_MODE, 4);
            this.f38544o.set(CaptureRequest.FLASH_MODE, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void w() {
        k0();
    }

    void w0() {
        if (this.H) {
            return;
        }
        Float f11 = (Float) this.f38540k.get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        Objects.requireNonNull(f11, "Unexpected state: LENS_INFO_MINIMUM_FOCUS_DISTANCE null");
        this.f38544o.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(this.R * f11.floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public boolean x(String str, int i11, int i12, boolean z11, CamcorderProfile camcorderProfile, int i13, int i14) {
        if (!this.f38554z) {
            p0(str, i11, i12, z11, camcorderProfile);
            try {
                this.f38550x.prepare();
                CameraCaptureSession cameraCaptureSession = this.f38543n;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.close();
                    this.f38543n = null;
                }
                mh.j b02 = b0();
                this.f38591b.k(b02.c(), b02.b());
                Surface f02 = f0();
                Surface surface = this.f38550x.getSurface();
                CaptureRequest.Builder createCaptureRequest = this.f38541l.createCaptureRequest(3);
                this.f38544o = createCaptureRequest;
                createCaptureRequest.addTarget(f02);
                this.f38544o.addTarget(surface);
                this.f38541l.createCaptureSession(Arrays.asList(f02, surface), this.f38534f, null);
                this.f38550x.start();
                this.f38554z = true;
                this.f38590a.f(this.f38552y, 0, 0);
                if (this.f38546p1.booleanValue()) {
                    this.f38542m.play(2);
                }
                return true;
            } catch (CameraAccessException | IOException e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }

    void x0() {
        int i11 = this.Y;
        if (i11 == 0) {
            this.f38544o.set(CaptureRequest.CONTROL_AWB_MODE, 1);
        } else if (i11 == 1) {
            this.f38544o.set(CaptureRequest.CONTROL_AWB_MODE, 6);
        } else if (i11 == 2) {
            this.f38544o.set(CaptureRequest.CONTROL_AWB_MODE, 5);
        } else if (i11 == 3) {
            this.f38544o.set(CaptureRequest.CONTROL_AWB_MODE, 8);
        } else if (i11 == 4) {
            this.f38544o.set(CaptureRequest.CONTROL_AWB_MODE, 3);
        } else if (i11 != 5) {
        } else {
            this.f38544o.set(CaptureRequest.CONTROL_AWB_MODE, 2);
        }
    }

    @Override // mh.f
    public void y() {
        t0();
    }

    void y0() {
        float floatValue = (this.T * (((Float) this.f38540k.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue() - 1.0f)) + 1.0f;
        Rect rect = (Rect) this.f38540k.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect != null) {
            int width = rect.width();
            int height = rect.height();
            int i11 = (width - ((int) (width / floatValue))) / 2;
            int i12 = (height - ((int) (height / floatValue))) / 2;
            Rect rect2 = new Rect(rect.left + i11, rect.top + i12, rect.right - i11, rect.bottom - i12);
            if (floatValue != 1.0f) {
                this.f38544o.set(CaptureRequest.SCALER_CROP_REGION, rect2);
            } else {
                this.f38544o.set(CaptureRequest.SCALER_CROP_REGION, this.f38553y1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void z() {
        n0();
    }
}