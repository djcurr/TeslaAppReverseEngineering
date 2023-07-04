package com.lwansbrough.RCTCamera;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: h  reason: collision with root package name */
    private static a f17865h;

    /* renamed from: i  reason: collision with root package name */
    private static final b f17866i = new b(853, 480);

    /* renamed from: j  reason: collision with root package name */
    private static final b f17867j = new b(1280, 720);

    /* renamed from: k  reason: collision with root package name */
    private static final b f17868k = new b(1920, 1080);

    /* renamed from: g  reason: collision with root package name */
    private int f17875g;

    /* renamed from: d  reason: collision with root package name */
    private boolean f17872d = false;

    /* renamed from: e  reason: collision with root package name */
    private List<String> f17873e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f17874f = -1;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Number, Camera> f17871c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<Integer, C0321a> f17869a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<Integer, Integer> f17870b = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.lwansbrough.RCTCamera.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0321a {

        /* renamed from: a  reason: collision with root package name */
        public final Camera.CameraInfo f17876a;

        /* renamed from: b  reason: collision with root package name */
        public int f17877b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f17878c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f17879d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f17880e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f17881f = -1;

        public C0321a(a aVar, Camera.CameraInfo cameraInfo) {
            this.f17876a = cameraInfo;
        }
    }

    /* loaded from: classes2.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f17882a;

        /* renamed from: b  reason: collision with root package name */
        public int f17883b;

        public b(int i11, int i12) {
            this.f17882a = i11;
            this.f17883b = i12;
        }
    }

    private a(int i11) {
        this.f17875g = 0;
        this.f17875g = i11;
        for (int i12 = 0; i12 < Camera.getNumberOfCameras(); i12++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i12, cameraInfo);
            if (cameraInfo.facing == 1 && this.f17869a.get(1) == null) {
                this.f17869a.put(1, new C0321a(this, cameraInfo));
                this.f17870b.put(1, Integer.valueOf(i12));
                a(1);
                q(1);
            } else if (cameraInfo.facing == 0 && this.f17869a.get(2) == null) {
                this.f17869a.put(2, new C0321a(this, cameraInfo));
                this.f17870b.put(2, Integer.valueOf(i12));
                a(2);
                q(2);
            }
        }
    }

    public static void d(int i11) {
        f17865h = new a(i11);
    }

    private Camera.Size g(List<Camera.Size> list, int i11, int i12) {
        Camera.Size size = null;
        for (Camera.Size size2 : list) {
            if (size != null) {
                if (Math.sqrt(Math.pow(size2.width - i11, 2.0d) + Math.pow(size2.height - i12, 2.0d)) < Math.sqrt(Math.pow(size.width - i11, 2.0d) + Math.pow(size.height - i12, 2.0d))) {
                }
            }
            size = size2;
        }
        return size;
    }

    public static a h() {
        return f17865h;
    }

    private Camera.Size n(List<Camera.Size> list) {
        Camera.Size size = null;
        for (Camera.Size size2 : list) {
            if (size != null) {
                if (size2.width * size2.height < size.width * size.height) {
                }
            }
            size = size2;
        }
        return size;
    }

    public void A(int i11, int i12, int i13) {
        C0321a c0321a = this.f17869a.get(Integer.valueOf(i11));
        if (c0321a == null) {
            return;
        }
        c0321a.f17880e = i12;
        c0321a.f17881f = i13;
    }

    public void B(int i11, int i12) {
        Camera a11 = a(i11);
        if (a11 == null) {
            return;
        }
        Camera.Parameters parameters = a11.getParameters();
        String flashMode = parameters.getFlashMode();
        if (i12 == 0) {
            flashMode = "off";
        } else if (i12 == 1) {
            flashMode = "torch";
        }
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes == null || !supportedFlashModes.contains(flashMode)) {
            return;
        }
        parameters.setFlashMode(flashMode);
        try {
            a11.setParameters(parameters);
        } catch (RuntimeException e11) {
            Log.e("RCTCamera", "setParameters failed", e11);
        }
    }

    public void C(int i11, int i12) {
        Camera a11 = a(i11);
        if (a11 == null) {
            return;
        }
        Camera.Parameters parameters = a11.getParameters();
        int maxZoom = parameters.getMaxZoom();
        if (!parameters.isZoomSupported() || i12 < 0 || i12 >= maxZoom) {
            return;
        }
        parameters.setZoom(i12);
        try {
            a11.setParameters(parameters);
        } catch (RuntimeException e11) {
            Log.e("RCTCamera", "setParameters failed", e11);
        }
    }

    public synchronized Camera a(int i11) {
        if (this.f17871c.get(Integer.valueOf(i11)) == null && this.f17870b.get(Integer.valueOf(i11)) != null) {
            try {
                this.f17871c.put(Integer.valueOf(i11), Camera.open(this.f17870b.get(Integer.valueOf(i11)).intValue()));
                c(i11);
            } catch (Exception e11) {
                Log.e("RCTCamera", "acquireCameraInstance failed", e11);
            }
        }
        return this.f17871c.get(Integer.valueOf(i11));
    }

    public void b(int i11, int i12) {
        int i13;
        Camera camera = this.f17871c.get(Integer.valueOf(i11));
        if (camera == null) {
            return;
        }
        C0321a c0321a = this.f17869a.get(Integer.valueOf(i11));
        Camera.CameraInfo cameraInfo = c0321a.f17876a;
        int i14 = cameraInfo.orientation;
        if (cameraInfo.facing == 1) {
            i13 = (i14 + (i12 * 90)) % 360;
        } else {
            i13 = ((i14 - (i12 * 90)) + 360) % 360;
        }
        c0321a.f17877b = i13;
        Camera.Parameters parameters = camera.getParameters();
        parameters.setRotation(c0321a.f17877b);
        try {
            camera.setParameters(parameters);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void c(int i11) {
        int i12;
        int i13;
        Camera camera = this.f17871c.get(Integer.valueOf(i11));
        if (camera == null) {
            return;
        }
        C0321a c0321a = this.f17869a.get(Integer.valueOf(i11));
        Camera.CameraInfo cameraInfo = c0321a.f17876a;
        int i14 = cameraInfo.orientation;
        if (cameraInfo.facing == 1) {
            int i15 = this.f17875g;
            i12 = ((i15 * 90) + i14) % 360;
            i13 = ((720 - i14) - (i15 * 90)) % 360;
        } else {
            i12 = ((i14 - (this.f17875g * 90)) + 360) % 360;
            i13 = i12;
        }
        c0321a.f17877b = i12;
        s(i12);
        camera.setDisplayOrientation(i13);
        Camera.Parameters parameters = camera.getParameters();
        parameters.setRotation(c0321a.f17877b);
        Camera.Size f11 = f(parameters.getSupportedPreviewSizes(), Integer.MAX_VALUE, Integer.MAX_VALUE);
        int i16 = f11.width;
        int i17 = f11.height;
        parameters.setPreviewSize(i16, i17);
        try {
            camera.setParameters(parameters);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        int i18 = c0321a.f17877b;
        if (i18 != 0 && i18 != 180) {
            c0321a.f17878c = i17;
            c0321a.f17879d = i16;
            return;
        }
        c0321a.f17878c = i16;
        c0321a.f17879d = i17;
    }

    public List<String> e() {
        return this.f17873e;
    }

    public Camera.Size f(List<Camera.Size> list, int i11, int i12) {
        int i13;
        Camera.Size size = null;
        for (Camera.Size size2 : list) {
            int i14 = size2.width;
            if (i14 <= i11 && (i13 = size2.height) <= i12 && (size == null || i14 * i13 > size.width * size.height)) {
                size = size2;
            }
        }
        return size;
    }

    public int i() {
        return this.f17874f;
    }

    public int j(int i11) {
        C0321a c0321a = this.f17869a.get(Integer.valueOf(i11));
        if (c0321a == null) {
            return 0;
        }
        return c0321a.f17879d;
    }

    public int k(int i11) {
        C0321a c0321a = this.f17869a.get(Integer.valueOf(i11));
        if (c0321a == null) {
            return 0;
        }
        return c0321a.f17881f;
    }

    public int l(int i11) {
        C0321a c0321a = this.f17869a.get(Integer.valueOf(i11));
        if (c0321a == null) {
            return 0;
        }
        return c0321a.f17880e;
    }

    public int m(int i11) {
        C0321a c0321a = this.f17869a.get(Integer.valueOf(i11));
        if (c0321a == null) {
            return 0;
        }
        return c0321a.f17878c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<Camera.Size> o(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        List<Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        return supportedVideoSizes != null ? supportedVideoSizes : parameters.getSupportedPreviewSizes();
    }

    public boolean p() {
        return this.f17872d;
    }

    public void q(int i11) {
        Camera camera = this.f17871c.get(Integer.valueOf(i11));
        if (camera != null) {
            this.f17871c.remove(Integer.valueOf(i11));
            camera.release();
        }
    }

    public void r(int i11) {
        this.f17875g = i11;
        c(1);
        c(2);
    }

    public void s(int i11) {
    }

    public void t(List<String> list) {
        this.f17873e = list;
    }

    public void u(boolean z11) {
        this.f17872d = z11;
    }

    public void v(int i11, int i12) {
        Camera camera = this.f17871c.get(Integer.valueOf(i11));
        if (camera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        parameters.setRecordingHint(i12 == 1);
        try {
            camera.setParameters(parameters);
        } catch (RuntimeException e11) {
            Log.e("RCTCamera", "setParameters failed", e11);
        }
    }

    public void w(int i11, String str) {
        Camera a11 = a(i11);
        if (a11 == null) {
            return;
        }
        Camera.Parameters parameters = a11.getParameters();
        Camera.Size size = null;
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1078030475:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM)) {
                    c11 = 0;
                    break;
                }
                break;
            case -318184504:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
                    c11 = 1;
                    break;
                }
                break;
            case 107348:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_LOW)) {
                    c11 = 2;
                    break;
                }
                break;
            case 1604548:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_480P)) {
                    c11 = 3;
                    break;
                }
                break;
            case 1688155:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_720P)) {
                    c11 = 4;
                    break;
                }
                break;
            case 3202466:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH)) {
                    c11 = 5;
                    break;
                }
                break;
            case 46737913:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_1080P)) {
                    c11 = 6;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                size = supportedPictureSizes.get(supportedPictureSizes.size() / 2);
                break;
            case 1:
                Camera.Size f11 = f(parameters.getSupportedPreviewSizes(), Integer.MAX_VALUE, Integer.MAX_VALUE);
                size = g(parameters.getSupportedPictureSizes(), f11.width, f11.height);
                break;
            case 2:
                size = n(supportedPictureSizes);
                break;
            case 3:
                b bVar = f17866i;
                size = f(supportedPictureSizes, bVar.f17882a, bVar.f17883b);
                break;
            case 4:
                b bVar2 = f17867j;
                size = f(supportedPictureSizes, bVar2.f17882a, bVar2.f17883b);
                break;
            case 5:
                size = f(parameters.getSupportedPictureSizes(), Integer.MAX_VALUE, Integer.MAX_VALUE);
                break;
            case 6:
                b bVar3 = f17868k;
                size = f(supportedPictureSizes, bVar3.f17882a, bVar3.f17883b);
                break;
        }
        if (size != null) {
            parameters.setPictureSize(size.width, size.height);
            try {
                a11.setParameters(parameters);
            } catch (RuntimeException e11) {
                Log.e("RCTCamera", "setParameters failed", e11);
            }
        }
    }

    public CamcorderProfile x(int i11, String str) {
        Camera.Size size;
        CamcorderProfile camcorderProfile;
        Camera a11 = a(i11);
        if (a11 == null) {
            return null;
        }
        List<Camera.Size> o11 = o(a11);
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1078030475:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_MEDIUM)) {
                    c11 = 0;
                    break;
                }
                break;
            case 107348:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_LOW)) {
                    c11 = 1;
                    break;
                }
                break;
            case 1604548:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_480P)) {
                    c11 = 2;
                    break;
                }
                break;
            case 1688155:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_720P)) {
                    c11 = 3;
                    break;
                }
                break;
            case 3202466:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH)) {
                    c11 = 4;
                    break;
                }
                break;
            case 46737913:
                if (str.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_1080P)) {
                    c11 = 5;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                size = o11.get(o11.size() / 2);
                camcorderProfile = CamcorderProfile.get(this.f17870b.get(Integer.valueOf(i11)).intValue(), 5);
                break;
            case 1:
                size = n(o11);
                camcorderProfile = CamcorderProfile.get(this.f17870b.get(Integer.valueOf(i11)).intValue(), 4);
                break;
            case 2:
                b bVar = f17866i;
                size = f(o11, bVar.f17882a, bVar.f17883b);
                camcorderProfile = CamcorderProfile.get(this.f17870b.get(Integer.valueOf(i11)).intValue(), 4);
                break;
            case 3:
                b bVar2 = f17867j;
                size = f(o11, bVar2.f17882a, bVar2.f17883b);
                camcorderProfile = CamcorderProfile.get(this.f17870b.get(Integer.valueOf(i11)).intValue(), 5);
                break;
            case 4:
                size = f(o11, Integer.MAX_VALUE, Integer.MAX_VALUE);
                camcorderProfile = CamcorderProfile.get(this.f17870b.get(Integer.valueOf(i11)).intValue(), 1);
                break;
            case 5:
                b bVar3 = f17868k;
                size = f(o11, bVar3.f17882a, bVar3.f17883b);
                camcorderProfile = CamcorderProfile.get(this.f17870b.get(Integer.valueOf(i11)).intValue(), 6);
                break;
            default:
                camcorderProfile = null;
                size = null;
                break;
        }
        if (camcorderProfile == null) {
            return null;
        }
        if (size != null) {
            camcorderProfile.videoFrameHeight = size.height;
            camcorderProfile.videoFrameWidth = size.width;
        }
        return camcorderProfile;
    }

    public void y(int i11, int i12) {
        Camera a11 = a(i11);
        if (a11 == null) {
            return;
        }
        Camera.Parameters parameters = a11.getParameters();
        String flashMode = parameters.getFlashMode();
        if (i12 == 0) {
            flashMode = "off";
        } else if (i12 == 1) {
            flashMode = "on";
        } else if (i12 == 2) {
            flashMode = "auto";
        }
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes == null || !supportedFlashModes.contains(flashMode)) {
            return;
        }
        parameters.setFlashMode(flashMode);
        try {
            a11.setParameters(parameters);
        } catch (RuntimeException e11) {
            Log.e("RCTCamera", "setParameters failed", e11);
        }
    }

    public void z(int i11) {
        if (this.f17874f == i11) {
            return;
        }
        this.f17874f = i11;
        c(1);
        c(2);
    }
}