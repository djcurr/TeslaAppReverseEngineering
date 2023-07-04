package mh;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaActionSound;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import expo.modules.imagepicker.ImagePickerConstants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicBoolean;
import mh.f;
import mh.i;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes3.dex */
class b extends mh.f implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener, Camera.PreviewCallback {
    private static final androidx.collection.h<String> R;
    private static final androidx.collection.h<String> T;
    private float A;
    private int B;
    private int C;
    private int E;
    private float F;
    private int G;
    private boolean H;
    private Boolean K;
    private Boolean L;
    private boolean O;
    private boolean P;
    private SurfaceTexture Q;

    /* renamed from: d  reason: collision with root package name */
    private int f38496d;

    /* renamed from: e  reason: collision with root package name */
    private String f38497e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f38498f;

    /* renamed from: g  reason: collision with root package name */
    Camera f38499g;

    /* renamed from: h  reason: collision with root package name */
    MediaActionSound f38500h;

    /* renamed from: i  reason: collision with root package name */
    private Camera.Parameters f38501i;

    /* renamed from: j  reason: collision with root package name */
    private final Camera.CameraInfo f38502j;

    /* renamed from: k  reason: collision with root package name */
    private MediaRecorder f38503k;

    /* renamed from: l  reason: collision with root package name */
    private String f38504l;

    /* renamed from: m  reason: collision with root package name */
    private final AtomicBoolean f38505m;

    /* renamed from: n  reason: collision with root package name */
    private final k f38506n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f38507o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f38508p;

    /* renamed from: q  reason: collision with root package name */
    private final k f38509q;

    /* renamed from: t  reason: collision with root package name */
    private mh.j f38510t;

    /* renamed from: w  reason: collision with root package name */
    private mh.a f38511w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f38512x;

    /* renamed from: y  reason: collision with root package name */
    private int f38513y;

    /* renamed from: z  reason: collision with root package name */
    private int f38514z;

    /* loaded from: classes3.dex */
    class a implements i.a {

        /* renamed from: mh.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0743a implements Runnable {
            RunnableC0743a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.R();
            }
        }

        /* renamed from: mh.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0744b implements Runnable {
            RunnableC0744b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.S();
            }
        }

        a() {
        }

        @Override // mh.i.a
        public void a() {
            synchronized (b.this) {
                b bVar = b.this;
                if (bVar.f38499g != null) {
                    bVar.P = true;
                    try {
                        b.this.f38499g.setPreviewCallback(null);
                        b.this.f38499g.setPreviewDisplay(null);
                    } catch (Exception e11) {
                        Log.e("CAMERA_1::", "onSurfaceDestroyed preview cleanup failed", e11);
                    }
                }
            }
            b.this.f38592c.post(new RunnableC0744b());
        }

        @Override // mh.i.a
        public void b() {
            synchronized (b.this) {
                if (!b.this.P) {
                    b.this.P0();
                } else {
                    b.this.f38592c.post(new RunnableC0743a());
                }
            }
        }
    }

    /* renamed from: mh.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class RunnableC0745b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f38518a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f38519b;

        /* renamed from: mh.b$b$a */
        /* loaded from: classes3.dex */
        class a implements Camera.AutoFocusCallback {
            a(RunnableC0745b runnableC0745b) {
            }

            @Override // android.hardware.Camera.AutoFocusCallback
            public void onAutoFocus(boolean z11, Camera camera) {
            }
        }

        /* renamed from: mh.b$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0746b implements Camera.AutoFocusCallback {
            C0746b(RunnableC0745b runnableC0745b) {
            }

            @Override // android.hardware.Camera.AutoFocusCallback
            public void onAutoFocus(boolean z11, Camera camera) {
            }
        }

        /* renamed from: mh.b$b$c */
        /* loaded from: classes3.dex */
        class c implements Camera.AutoFocusCallback {
            c(RunnableC0745b runnableC0745b) {
            }

            @Override // android.hardware.Camera.AutoFocusCallback
            public void onAutoFocus(boolean z11, Camera camera) {
            }
        }

        RunnableC0745b(float f11, float f12) {
            this.f38518a = f11;
            this.f38519b = f12;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this) {
                b bVar = b.this;
                if (bVar.f38499g != null) {
                    Camera.Parameters parameters = bVar.f38501i;
                    if (parameters == null) {
                        return;
                    }
                    String focusMode = parameters.getFocusMode();
                    Rect p02 = b.this.p0(this.f38518a, this.f38519b);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Camera.Area(p02, 1000));
                    if (parameters.getMaxNumFocusAreas() != 0 && focusMode != null && (focusMode.equals("auto") || focusMode.equals("macro") || focusMode.equals("continuous-picture") || focusMode.equals("continuous-video"))) {
                        parameters.setFocusMode("auto");
                        parameters.setFocusAreas(arrayList);
                        if (parameters.getMaxNumMeteringAreas() > 0) {
                            parameters.setMeteringAreas(arrayList);
                        }
                        if (!parameters.getSupportedFocusModes().contains("auto")) {
                            return;
                        }
                        try {
                            b.this.f38499g.setParameters(parameters);
                        } catch (RuntimeException e11) {
                            Log.e("CAMERA_1::", "setParameters failed", e11);
                        }
                        try {
                            b.this.f38499g.autoFocus(new a(this));
                        } catch (RuntimeException e12) {
                            Log.e("CAMERA_1::", "autoFocus failed", e12);
                        }
                    } else if (parameters.getMaxNumMeteringAreas() > 0) {
                        if (!parameters.getSupportedFocusModes().contains("auto")) {
                            return;
                        }
                        parameters.setFocusMode("auto");
                        parameters.setFocusAreas(arrayList);
                        parameters.setMeteringAreas(arrayList);
                        try {
                            b.this.f38499g.setParameters(parameters);
                        } catch (RuntimeException e13) {
                            Log.e("CAMERA_1::", "setParameters failed", e13);
                        }
                        try {
                            b.this.f38499g.autoFocus(new C0746b(this));
                        } catch (RuntimeException e14) {
                            Log.e("CAMERA_1::", "autoFocus failed", e14);
                        }
                    } else {
                        try {
                            b.this.f38499g.autoFocus(new c(this));
                        } catch (RuntimeException e15) {
                            Log.e("CAMERA_1::", "autoFocus failed", e15);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this) {
                b bVar = b.this;
                if (bVar.f38499g != null) {
                    bVar.O = false;
                    b.this.J0();
                    b.this.m0();
                    if (b.this.f38508p) {
                        b.this.M0();
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                b.this.f38508p = true;
                b.this.M0();
            }
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.u()) {
                b.this.S();
                b.this.R();
            }
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.u()) {
                b.this.S();
                b.this.R();
            }
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this) {
                b bVar = b.this;
                if (bVar.f38499g != null) {
                    bVar.m0();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this) {
                b bVar = b.this;
                if (bVar.f38499g != null) {
                    bVar.m0();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class i implements Camera.PictureCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReadableMap f38527a;

        i(ReadableMap readableMap) {
            this.f38527a = readableMap;
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            if (b.this.K.booleanValue()) {
                b.this.f38500h.play(0);
            }
            synchronized (b.this) {
                if (b.this.f38499g != null) {
                    if (this.f38527a.hasKey("pauseAfterCapture") && !this.f38527a.getBoolean("pauseAfterCapture")) {
                        try {
                            b.this.f38499g.startPreview();
                            b.this.f38507o = true;
                            if (b.this.H) {
                                b bVar = b.this;
                                bVar.f38499g.setPreviewCallback(bVar);
                            }
                        } catch (Exception e11) {
                            b.this.f38507o = false;
                            b.this.f38499g.setPreviewCallback(null);
                            Log.e("CAMERA_1::", "camera startPreview failed", e11);
                        }
                    } else {
                        try {
                            b.this.f38499g.stopPreview();
                        } catch (Exception e12) {
                            Log.e("CAMERA_1::", "camera stopPreview failed", e12);
                        }
                        b.this.f38507o = false;
                        b.this.f38499g.setPreviewCallback(null);
                    }
                }
            }
            b.this.f38498f.set(false);
            b.this.E = 0;
            b bVar2 = b.this;
            bVar2.f38590a.c(bArr, bVar2.t0(bVar2.C));
            if (b.this.O) {
                b.this.P0();
            }
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SurfaceTexture f38529a;

        j(SurfaceTexture surfaceTexture) {
            this.f38529a = surfaceTexture;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b bVar = b.this;
                Camera camera = bVar.f38499g;
                if (camera == null) {
                    bVar.Q = this.f38529a;
                    return;
                }
                camera.stopPreview();
                b.this.f38507o = false;
                SurfaceTexture surfaceTexture = this.f38529a;
                if (surfaceTexture == null) {
                    b bVar2 = b.this;
                    bVar2.f38499g.setPreviewTexture((SurfaceTexture) bVar2.f38591b.g());
                } else {
                    b.this.f38499g.setPreviewTexture(surfaceTexture);
                }
                b.this.Q = this.f38529a;
                b.this.M0();
            } catch (IOException e11) {
                Log.e("CAMERA_1::", "setPreviewTexture failed", e11);
            }
        }
    }

    static {
        androidx.collection.h<String> hVar = new androidx.collection.h<>();
        R = hVar;
        hVar.l(0, "off");
        hVar.l(1, "on");
        hVar.l(2, "torch");
        hVar.l(3, "auto");
        hVar.l(4, "red-eye");
        androidx.collection.h<String> hVar2 = new androidx.collection.h<>();
        T = hVar2;
        hVar2.l(0, "auto");
        hVar2.l(1, "cloudy-daylight");
        hVar2.l(2, "daylight");
        hVar2.l(3, "shade");
        hVar2.l(4, "fluorescent");
        hVar2.l(5, "incandescent");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(f.a aVar, mh.i iVar, Handler handler) {
        super(aVar, iVar, handler);
        new Handler();
        this.f38498f = new AtomicBoolean(false);
        this.f38500h = new MediaActionSound();
        this.f38502j = new Camera.CameraInfo();
        this.f38505m = new AtomicBoolean(false);
        this.f38506n = new k();
        this.f38507o = false;
        this.f38508p = true;
        this.f38509q = new k();
        this.E = 0;
        Boolean bool = Boolean.FALSE;
        this.K = bool;
        this.L = bool;
        iVar.l(new a());
    }

    private void A0() {
        Camera camera = this.f38499g;
        if (camera != null) {
            camera.release();
            this.f38499g = null;
            this.f38590a.onCameraClosed();
            this.f38498f.set(false);
            this.f38505m.set(false);
        }
    }

    private void B0() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f38503k.resume();
        }
    }

    private boolean C0(boolean z11) {
        this.f38512x = z11;
        if (u()) {
            List<String> supportedFocusModes = this.f38501i.getSupportedFocusModes();
            if (z11 && supportedFocusModes.contains("continuous-picture")) {
                this.f38501i.setFocusMode("continuous-picture");
                return true;
            } else if (this.H && supportedFocusModes.contains("macro")) {
                this.f38501i.setFocusMode("macro");
                return true;
            } else if (supportedFocusModes.contains("fixed")) {
                this.f38501i.setFocusMode("fixed");
                return true;
            } else if (supportedFocusModes.contains("infinity")) {
                this.f38501i.setFocusMode("infinity");
                return true;
            } else {
                this.f38501i.setFocusMode(supportedFocusModes.get(0));
                return true;
            }
        }
        return false;
    }

    private void D0(CamcorderProfile camcorderProfile, boolean z11, int i11) {
        if (!v0(i11)) {
            i11 = camcorderProfile.videoFrameRate;
        }
        this.f38503k.setOutputFormat(camcorderProfile.fileFormat);
        this.f38503k.setVideoFrameRate(i11);
        this.f38503k.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        this.f38503k.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
        this.f38503k.setVideoEncoder(camcorderProfile.videoCodec);
        if (z11) {
            this.f38503k.setAudioEncodingBitRate(camcorderProfile.audioBitRate);
            this.f38503k.setAudioChannels(camcorderProfile.audioChannels);
            this.f38503k.setAudioSamplingRate(camcorderProfile.audioSampleRate);
            this.f38503k.setAudioEncoder(camcorderProfile.audioCodec);
        }
    }

    private boolean E0(float f11) {
        int minExposureCompensation;
        int maxExposureCompensation;
        this.A = f11;
        int i11 = 0;
        if (!u() || (minExposureCompensation = this.f38501i.getMinExposureCompensation()) == (maxExposureCompensation = this.f38501i.getMaxExposureCompensation())) {
            return false;
        }
        float f12 = this.A;
        if (f12 >= BitmapDescriptorFactory.HUE_RED && f12 <= 1.0f) {
            i11 = ((int) (f12 * (maxExposureCompensation - minExposureCompensation))) + minExposureCompensation;
        }
        this.f38501i.setExposureCompensation(i11);
        return true;
    }

    private boolean F0(int i11) {
        if (u()) {
            List<String> supportedFlashModes = this.f38501i.getSupportedFlashModes();
            androidx.collection.h<String> hVar = R;
            String g11 = hVar.g(i11);
            if (supportedFlashModes == null) {
                return false;
            }
            if (supportedFlashModes.contains(g11)) {
                this.f38501i.setFlashMode(g11);
                this.f38514z = i11;
                return true;
            } else if (supportedFlashModes.contains(hVar.g(this.f38514z))) {
                return false;
            } else {
                this.f38501i.setFlashMode("off");
                return true;
            }
        }
        this.f38514z = i11;
        return false;
    }

    private void G0(boolean z11) {
        this.K = Boolean.valueOf(z11);
        Camera camera = this.f38499g;
        if (camera != null) {
            try {
                if (camera.enableShutterSound(false)) {
                    return;
                }
                this.K = Boolean.FALSE;
            } catch (Exception e11) {
                Log.e("CAMERA_1::", "setPlaySoundInternal failed", e11);
                this.K = Boolean.FALSE;
            }
        }
    }

    private void H0(boolean z11) {
        this.H = z11;
        if (u()) {
            if (this.H) {
                this.f38499g.setPreviewCallback(this);
            } else {
                this.f38499g.setPreviewCallback(null);
            }
        }
    }

    private void I0(String str, int i11, int i12, boolean z11, CamcorderProfile camcorderProfile, int i13) {
        CamcorderProfile camcorderProfile2;
        this.f38503k = new MediaRecorder();
        this.f38499g.unlock();
        this.f38503k.setCamera(this.f38499g);
        this.f38503k.setVideoSource(1);
        if (z11) {
            this.f38503k.setAudioSource(5);
        }
        this.f38503k.setOutputFile(str);
        this.f38504l = str;
        if (CamcorderProfile.hasProfile(this.f38496d, camcorderProfile.quality)) {
            camcorderProfile2 = CamcorderProfile.get(this.f38496d, camcorderProfile.quality);
        } else {
            camcorderProfile2 = CamcorderProfile.get(this.f38496d, 1);
        }
        camcorderProfile2.videoBitRate = camcorderProfile.videoBitRate;
        D0(camcorderProfile2, z11, i13);
        MediaRecorder mediaRecorder = this.f38503k;
        int i14 = this.E;
        mediaRecorder.setOrientationHint(n0(i14 != 0 ? y0(i14) : this.C));
        if (i11 != -1) {
            this.f38503k.setMaxDuration(i11);
        }
        if (i12 != -1) {
            this.f38503k.setMaxFileSize(i12);
        }
        this.f38503k.setOnInfoListener(this);
        this.f38503k.setOnErrorListener(this);
    }

    private boolean K0(int i11) {
        this.G = i11;
        if (u()) {
            List<String> supportedWhiteBalance = this.f38501i.getSupportedWhiteBalance();
            androidx.collection.h<String> hVar = T;
            String g11 = hVar.g(i11);
            if (supportedWhiteBalance != null && supportedWhiteBalance.contains(g11)) {
                this.f38501i.setWhiteBalance(g11);
                return true;
            }
            String g12 = hVar.g(this.G);
            if (supportedWhiteBalance == null || !supportedWhiteBalance.contains(g12)) {
                this.f38501i.setWhiteBalance("auto");
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean L0(float f11) {
        if (u() && this.f38501i.isZoomSupported()) {
            this.f38501i.setZoom((int) (this.f38501i.getMaxZoom() * f11));
            this.F = f11;
            return true;
        }
        this.F = f11;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0() {
        Camera camera;
        if (this.f38507o || (camera = this.f38499g) == null) {
            return;
        }
        try {
            this.f38507o = true;
            camera.startPreview();
            if (this.H) {
                this.f38499g.setPreviewCallback(this);
            }
        } catch (Exception e11) {
            this.f38507o = false;
            Log.e("CAMERA_1::", "startCameraPreview failed", e11);
        }
    }

    private void N0() {
        synchronized (this) {
            MediaRecorder mediaRecorder = this.f38503k;
            if (mediaRecorder != null) {
                try {
                    mediaRecorder.stop();
                } catch (RuntimeException e11) {
                    Log.e("CAMERA_1::", "stopMediaRecorder stop failed", e11);
                }
                try {
                    this.f38503k.reset();
                    this.f38503k.release();
                } catch (RuntimeException e12) {
                    Log.e("CAMERA_1::", "stopMediaRecorder reset failed", e12);
                }
                this.f38503k = null;
            }
            this.f38590a.a();
            if (this.L.booleanValue()) {
                this.f38500h.play(3);
            }
            int t02 = t0(this.C);
            if (this.f38504l != null && new File(this.f38504l).exists()) {
                f.a aVar = this.f38590a;
                String str = this.f38504l;
                int i11 = this.E;
                if (i11 == 0) {
                    i11 = t02;
                }
                aVar.g(str, i11, t02);
                this.f38504l = null;
                return;
            }
            f.a aVar2 = this.f38590a;
            int i12 = this.E;
            if (i12 == 0) {
                i12 = t02;
            }
            aVar2.g(null, i12, t02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        if (this.f38499g != null) {
            if (!this.f38498f.get() && !this.f38505m.get()) {
                this.f38592c.post(new c());
            } else {
                this.O = true;
            }
        }
    }

    private int n0(int i11) {
        Camera.CameraInfo cameraInfo = this.f38502j;
        if (cameraInfo.facing == 0) {
            return (cameraInfo.orientation + i11) % 360;
        }
        return ((this.f38502j.orientation + i11) + (w0(i11) ? CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 : 0)) % 360;
    }

    private int o0(int i11) {
        Camera.CameraInfo cameraInfo = this.f38502j;
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i11) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i11) + 360) % 360;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect p0(float f11, float f12) {
        int i11 = (int) (f11 * 2000.0f);
        int i12 = (int) (f12 * 2000.0f);
        int i13 = i11 - 150;
        int i14 = i12 - 150;
        int i15 = i11 + 150;
        int i16 = i12 + 150;
        if (i13 < 0) {
            i13 = 0;
        }
        if (i15 > 2000) {
            i15 = 2000;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        if (i16 > 2000) {
            i16 = 2000;
        }
        return new Rect(i13 - 1000, i14 - 1000, i15 - 1000, i16 - 1000);
    }

    private mh.a q0() {
        Iterator<mh.a> it2 = this.f38506n.d().iterator();
        mh.a aVar = null;
        while (it2.hasNext()) {
            aVar = it2.next();
            if (aVar.equals(mh.g.f38593a)) {
                break;
            }
        }
        return aVar;
    }

    private void r0() {
        String str = this.f38497e;
        if (str != null && !str.isEmpty()) {
            try {
                int parseInt = Integer.parseInt(this.f38497e);
                this.f38496d = parseInt;
                Camera.getCameraInfo(parseInt, this.f38502j);
                return;
            } catch (Exception unused) {
                this.f38496d = -1;
                return;
            }
        }
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            if (numberOfCameras == 0) {
                this.f38496d = -1;
                Log.w("CAMERA_1::", "getNumberOfCameras returned 0. No camera available.");
                return;
            }
            for (int i11 = 0; i11 < numberOfCameras; i11++) {
                Camera.getCameraInfo(i11, this.f38502j);
                if (this.f38502j.facing == this.f38513y) {
                    this.f38496d = i11;
                    return;
                }
            }
            this.f38496d = 0;
            Camera.getCameraInfo(0, this.f38502j);
        } catch (Exception e11) {
            Log.e("CAMERA_1::", "chooseCamera failed.", e11);
            this.f38496d = -1;
        }
    }

    private mh.j s0(SortedSet<mh.j> sortedSet) {
        if (!this.f38591b.j()) {
            return sortedSet.first();
        }
        int i11 = this.f38591b.i();
        int c11 = this.f38591b.c();
        if (w0(this.B)) {
            c11 = i11;
            i11 = c11;
        }
        mh.j jVar = null;
        Iterator<mh.j> it2 = sortedSet.iterator();
        while (it2.hasNext()) {
            jVar = it2.next();
            if (i11 <= jVar.c() && c11 <= jVar.b()) {
                break;
            }
        }
        return jVar;
    }

    private mh.j u0(int i11, int i12, SortedSet<mh.j> sortedSet) {
        if (sortedSet == null || sortedSet.isEmpty()) {
            return null;
        }
        mh.j last = sortedSet.last();
        if (i11 == 0 || i12 == 0) {
            return last;
        }
        for (mh.j jVar : sortedSet) {
            if (i11 <= jVar.c() && i12 <= jVar.b()) {
                return jVar;
            }
        }
        return last;
    }

    private boolean v0(int i11) {
        boolean z11;
        int i12 = i11 * 1000;
        Iterator<int[]> it2 = q().iterator();
        do {
            z11 = false;
            if (it2.hasNext()) {
                int[] next = it2.next();
                boolean z12 = i12 >= next[0] && i12 <= next[1];
                boolean z13 = i12 > 0;
                if (z12 && z13) {
                    z11 = true;
                    continue;
                }
            } else {
                Log.w("CAMERA_1::", "fps (framePerSecond) received an unsupported value and will be ignored.");
                return false;
            }
        } while (!z11);
        return true;
    }

    private boolean w0(int i11) {
        return i11 == 90 || i11 == 270;
    }

    private boolean x0() {
        if (this.f38499g != null) {
            A0();
        }
        int i11 = this.f38496d;
        if (i11 == -1) {
            return false;
        }
        try {
            try {
                Camera open = Camera.open(i11);
                this.f38499g = open;
                this.f38501i = open.getParameters();
                this.f38506n.b();
                for (Camera.Size size : this.f38501i.getSupportedPreviewSizes()) {
                    this.f38506n.a(new mh.j(size.width, size.height));
                }
                this.f38509q.b();
                for (Camera.Size size2 : this.f38501i.getSupportedPictureSizes()) {
                    this.f38509q.a(new mh.j(size2.width, size2.height));
                }
                for (mh.a aVar : this.f38506n.d()) {
                    if (this.f38509q.f(aVar) == null) {
                        this.f38506n.e(aVar);
                    }
                }
                if (this.f38511w == null) {
                    this.f38511w = mh.g.f38593a;
                }
                m0();
                this.f38499g.setDisplayOrientation(o0(this.B));
                this.f38590a.b();
                return true;
            } catch (RuntimeException unused) {
                this.f38499g.release();
                this.f38499g = null;
                return false;
            }
        } catch (RuntimeException unused2) {
            return false;
        }
    }

    private void z0() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f38503k.pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public boolean A(mh.a aVar) {
        if (this.f38511w != null && u()) {
            if (this.f38511w.equals(aVar)) {
                return false;
            }
            if (this.f38506n.f(aVar) == null) {
                Log.w("CAMERA_1::", "setAspectRatio received an unsupported value and will be ignored.");
                return false;
            }
            this.f38511w = aVar;
            this.f38592c.post(new h());
            return true;
        }
        this.f38511w = aVar;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void B(boolean z11) {
        if (this.f38512x == z11) {
            return;
        }
        synchronized (this) {
            if (C0(z11)) {
                try {
                    Camera camera = this.f38499g;
                    if (camera != null) {
                        camera.setParameters(this.f38501i);
                    }
                } catch (RuntimeException e11) {
                    Log.e("CAMERA_1::", "setParameters failed", e11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void C(String str) {
        if (f80.b.a(this.f38497e, str)) {
            return;
        }
        this.f38497e = str;
        if (f80.b.a(str, String.valueOf(this.f38496d))) {
            return;
        }
        this.f38592c.post(new f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void D(int i11) {
        synchronized (this) {
            if (this.C == i11) {
                return;
            }
            this.C = i11;
            if (u() && this.E == 0 && !this.f38505m.get() && !this.f38498f.get()) {
                try {
                    this.f38501i.setRotation(n0(i11));
                    this.f38499g.setParameters(this.f38501i);
                } catch (RuntimeException e11) {
                    Log.e("CAMERA_1::", "setParameters failed", e11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void E(int i11) {
        synchronized (this) {
            if (this.B == i11) {
                return;
            }
            this.B = i11;
            if (u()) {
                boolean z11 = this.f38507o && Build.VERSION.SDK_INT < 14;
                if (z11) {
                    this.f38499g.stopPreview();
                    this.f38507o = false;
                }
                try {
                    this.f38499g.setDisplayOrientation(o0(i11));
                } catch (RuntimeException e11) {
                    Log.e("CAMERA_1::", "setDisplayOrientation failed", e11);
                }
                if (z11) {
                    M0();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void F(float f11) {
        if (f11 != this.A && E0(f11)) {
            try {
                Camera camera = this.f38499g;
                if (camera != null) {
                    camera.setParameters(this.f38501i);
                }
            } catch (RuntimeException e11) {
                Log.e("CAMERA_1::", "setParameters failed", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void G(int i11) {
        if (this.f38513y == i11) {
            return;
        }
        this.f38513y = i11;
        this.f38592c.post(new e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void H(int i11) {
        if (i11 != this.f38514z && F0(i11)) {
            try {
                Camera camera = this.f38499g;
                if (camera != null) {
                    camera.setParameters(this.f38501i);
                }
            } catch (RuntimeException e11) {
                Log.e("CAMERA_1::", "setParameters failed", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void I(float f11, float f12) {
        this.f38592c.post(new RunnableC0745b(f11, f12));
    }

    @Override // mh.f
    public void J(float f11) {
    }

    void J0() {
        try {
            this.P = false;
            Camera camera = this.f38499g;
            if (camera != null) {
                SurfaceTexture surfaceTexture = this.Q;
                if (surfaceTexture != null) {
                    camera.setPreviewTexture(surfaceTexture);
                } else if (this.f38591b.d() == SurfaceHolder.class) {
                    boolean z11 = this.f38507o && Build.VERSION.SDK_INT < 14;
                    if (z11) {
                        this.f38499g.stopPreview();
                        this.f38507o = false;
                    }
                    this.f38499g.setPreviewDisplay(this.f38591b.f());
                    if (z11) {
                        M0();
                    }
                } else {
                    this.f38499g.setPreviewTexture((SurfaceTexture) this.f38591b.g());
                }
            }
        } catch (Exception e11) {
            Log.e("CAMERA_1::", "setUpPreview failed", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void K(mh.j jVar) {
        if (jVar == null && this.f38510t == null) {
            return;
        }
        if (jVar == null || !jVar.equals(this.f38510t)) {
            this.f38510t = jVar;
            if (u()) {
                this.f38592c.post(new g());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void L(boolean z11) {
        if (z11 == this.K.booleanValue()) {
            return;
        }
        G0(z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void M(boolean z11) {
        this.L = Boolean.valueOf(z11);
    }

    @Override // mh.f
    public void N(SurfaceTexture surfaceTexture) {
        this.f38592c.post(new j(surfaceTexture));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void O(boolean z11) {
        if (z11 == this.H) {
            return;
        }
        H0(z11);
    }

    void O0(ReadableMap readableMap) {
        if (!this.f38505m.get() && this.f38498f.compareAndSet(false, true)) {
            try {
                if (readableMap.hasKey("orientation") && readableMap.getInt("orientation") != 0) {
                    int i11 = readableMap.getInt("orientation");
                    this.E = i11;
                    this.f38501i.setRotation(n0(y0(i11)));
                    try {
                        this.f38499g.setParameters(this.f38501i);
                    } catch (RuntimeException e11) {
                        Log.e("CAMERA_1::", "setParameters rotation failed", e11);
                    }
                }
                if (readableMap.hasKey(ImagePickerConstants.OPTION_QUALITY)) {
                    this.f38501i.setJpegQuality((int) (readableMap.getDouble(ImagePickerConstants.OPTION_QUALITY) * 100.0d));
                    try {
                        this.f38499g.setParameters(this.f38501i);
                    } catch (RuntimeException e12) {
                        Log.e("CAMERA_1::", "setParameters quality failed", e12);
                    }
                }
                this.f38499g.takePicture(null, null, null, new i(readableMap));
                return;
            } catch (Exception e13) {
                this.f38498f.set(false);
                throw e13;
            }
        }
        throw new IllegalStateException("Camera capture failed. Camera is already capturing.");
    }

    @Override // mh.f
    public void P(int i11) {
        if (i11 != this.G && K0(i11)) {
            try {
                Camera camera = this.f38499g;
                if (camera != null) {
                    camera.setParameters(this.f38501i);
                }
            } catch (RuntimeException e11) {
                Log.e("CAMERA_1::", "setParameters failed", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void Q(float f11) {
        if (f11 != this.F && L0(f11)) {
            try {
                Camera camera = this.f38499g;
                if (camera != null) {
                    camera.setParameters(this.f38501i);
                }
            } catch (RuntimeException e11) {
                Log.e("CAMERA_1::", "setParameters failed", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public boolean R() {
        synchronized (this) {
            r0();
            if (!x0()) {
                this.f38590a.e();
                return true;
            }
            if (this.f38591b.j()) {
                J0();
                if (this.f38508p) {
                    M0();
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void S() {
        synchronized (this) {
            MediaRecorder mediaRecorder = this.f38503k;
            if (mediaRecorder != null) {
                try {
                    mediaRecorder.stop();
                } catch (RuntimeException e11) {
                    Log.e("CAMERA_1::", "mMediaRecorder.stop() failed", e11);
                }
                try {
                    this.f38503k.reset();
                    this.f38503k.release();
                } catch (RuntimeException e12) {
                    Log.e("CAMERA_1::", "mMediaRecorder.release() failed", e12);
                }
                this.f38503k = null;
                if (this.f38505m.get()) {
                    this.f38590a.a();
                    int t02 = t0(this.C);
                    f.a aVar = this.f38590a;
                    String str = this.f38504l;
                    int i11 = this.E;
                    if (i11 == 0) {
                        i11 = t02;
                    }
                    aVar.g(str, i11, t02);
                }
            }
            Camera camera = this.f38499g;
            if (camera != null) {
                this.f38507o = false;
                try {
                    camera.stopPreview();
                    this.f38499g.setPreviewCallback(null);
                } catch (Exception e13) {
                    Log.e("CAMERA_1::", "stop preview cleanup failed", e13);
                }
            }
            A0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void T() {
        if (this.f38505m.compareAndSet(true, false)) {
            N0();
            Camera camera = this.f38499g;
            if (camera != null) {
                camera.lock();
            }
            if (this.O) {
                P0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void U(ReadableMap readableMap) {
        if (u()) {
            if (this.f38507o) {
                O0(readableMap);
                return;
            }
            throw new IllegalStateException("Preview is paused - resume it before taking a picture.");
        }
        throw new IllegalStateException("Camera is not ready. Call start() before takePicture().");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public mh.a a() {
        return this.f38511w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public boolean b() {
        if (!u()) {
            return this.f38512x;
        }
        String focusMode = this.f38501i.getFocusMode();
        return focusMode != null && focusMode.contains("continuous");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public SortedSet<mh.j> c(mh.a aVar) {
        return this.f38509q.f(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public String d() {
        return this.f38497e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public List<Properties> e() {
        ArrayList arrayList = new ArrayList();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i11 = 0; i11 < numberOfCameras; i11++) {
            Properties properties = new Properties();
            Camera.getCameraInfo(i11, cameraInfo);
            properties.put("id", String.valueOf(i11));
            properties.put("type", String.valueOf(cameraInfo.facing));
            arrayList.add(properties);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public int f() {
        return this.f38502j.orientation;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public float g() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public int h() {
        return this.f38513y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public int i() {
        return this.f38514z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public float j() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public mh.j k() {
        return this.f38510t;
    }

    @Override // mh.f
    public boolean l() {
        return this.K.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public boolean m() {
        return this.L.booleanValue();
    }

    void m0() {
        mh.j u02;
        SortedSet<mh.j> f11 = this.f38506n.f(this.f38511w);
        if (f11 == null) {
            Log.w("CAMERA_1::", "adjustCameraParameters received an unsupported aspect ratio value and will be ignored.");
            mh.a q02 = q0();
            this.f38511w = q02;
            f11 = this.f38506n.f(q02);
        }
        mh.j s02 = s0(f11);
        mh.j jVar = this.f38510t;
        if (jVar != null) {
            u02 = u0(jVar.c(), this.f38510t.b(), this.f38509q.f(this.f38511w));
        } else {
            u02 = u0(0, 0, this.f38509q.f(this.f38511w));
        }
        boolean z11 = this.f38507o;
        if (z11) {
            this.f38499g.stopPreview();
            this.f38507o = false;
        }
        this.f38501i.setPreviewSize(s02.c(), s02.b());
        this.f38501i.setPictureSize(u02.c(), u02.b());
        this.f38501i.setJpegThumbnailSize(0, 0);
        int i11 = this.E;
        if (i11 != 0) {
            this.f38501i.setRotation(n0(y0(i11)));
        } else {
            this.f38501i.setRotation(n0(this.C));
        }
        C0(this.f38512x);
        F0(this.f38514z);
        E0(this.A);
        A(this.f38511w);
        L0(this.F);
        K0(this.G);
        H0(this.H);
        G0(this.K.booleanValue());
        try {
            this.f38499g.setParameters(this.f38501i);
        } catch (RuntimeException e11) {
            Log.e("CAMERA_1::", "setParameters failed", e11);
        }
        if (z11) {
            M0();
        }
    }

    @Override // mh.f
    public mh.j n() {
        Camera.Size previewSize = this.f38501i.getPreviewSize();
        return new mh.j(previewSize.width, previewSize.height);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public boolean o() {
        return this.H;
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

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Camera.Size previewSize = this.f38501i.getPreviewSize();
        this.f38590a.d(bArr, previewSize.width, previewSize.height, this.C);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public Set<mh.a> p() {
        k kVar = this.f38506n;
        for (mh.a aVar : kVar.d()) {
            if (this.f38509q.f(aVar) == null) {
                kVar.e(aVar);
            }
        }
        return kVar.d();
    }

    @Override // mh.f
    public ArrayList<int[]> q() {
        return (ArrayList) this.f38501i.getSupportedPreviewFpsRange();
    }

    @Override // mh.f
    public int s() {
        return this.G;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public float t() {
        return this.F;
    }

    int t0(int i11) {
        if (i11 != 90) {
            if (i11 != 180) {
                return i11 != 270 ? 1 : 3;
            }
            return 2;
        }
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public boolean u() {
        return this.f38499g != null;
    }

    @Override // mh.f
    public void v() {
        synchronized (this) {
            this.f38507o = false;
            this.f38508p = false;
            Camera camera = this.f38499g;
            if (camera != null) {
                camera.stopPreview();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void w() {
        z0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public boolean x(String str, int i11, int i12, boolean z11, CamcorderProfile camcorderProfile, int i13, int i14) {
        if (!this.f38498f.get() && this.f38505m.compareAndSet(false, true)) {
            if (i13 != 0) {
                this.E = i13;
            }
            try {
                I0(str, i11, i12, z11, camcorderProfile, i14);
                this.f38503k.prepare();
                this.f38503k.start();
                try {
                    this.f38499g.setParameters(this.f38501i);
                } catch (Exception e11) {
                    Log.e("CAMERA_1::", "Record setParameters failed", e11);
                }
                int t02 = t0(this.C);
                f.a aVar = this.f38590a;
                int i15 = this.E;
                if (i15 == 0) {
                    i15 = t02;
                }
                aVar.f(str, i15, t02);
                if (this.L.booleanValue()) {
                    this.f38500h.play(2);
                }
                return true;
            } catch (Exception e12) {
                this.f38505m.set(false);
                Log.e("CAMERA_1::", "Record start failed", e12);
            }
        }
        return false;
    }

    @Override // mh.f
    public void y() {
        this.f38592c.post(new d());
    }

    int y0(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return i11 != 4 ? 1 : 90;
                }
                return 270;
            }
            return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // mh.f
    public void z() {
        B0();
    }
}