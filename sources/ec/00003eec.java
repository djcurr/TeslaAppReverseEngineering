package com.lwansbrough.RCTCamera;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.zxing.g;
import com.google.zxing.h;
import com.google.zxing.j;
import com.google.zxing.l;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class d extends TextureView implements TextureView.SurfaceTextureListener, Camera.PreviewCallback {

    /* renamed from: l  reason: collision with root package name */
    public static volatile boolean f17894l = false;

    /* renamed from: a  reason: collision with root package name */
    private int f17895a;

    /* renamed from: b  reason: collision with root package name */
    private int f17896b;

    /* renamed from: c  reason: collision with root package name */
    private SurfaceTexture f17897c;

    /* renamed from: d  reason: collision with root package name */
    private int f17898d;

    /* renamed from: e  reason: collision with root package name */
    private int f17899e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17900f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f17901g;

    /* renamed from: h  reason: collision with root package name */
    private Camera f17902h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f17903i;

    /* renamed from: j  reason: collision with root package name */
    private float f17904j;

    /* renamed from: k  reason: collision with root package name */
    private final g f17905k;

    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f17906a;

        a(int i11) {
            this.f17906a = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.u();
            d.this.f17895a = this.f17906a;
            d.this.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Camera.AutoFocusCallback {
        b(d dVar) {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z11, Camera camera) {
            if (z11) {
                camera.cancelAutoFocus();
            }
        }
    }

    /* loaded from: classes2.dex */
    private class c extends AsyncTask<Void, Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        private byte[] f17908a;

        /* renamed from: b  reason: collision with root package name */
        private final Camera f17909b;

        c(Camera camera, byte[] bArr) {
            this.f17909b = camera;
            this.f17908a = bArr;
        }

        private j b(int i11, int i12, boolean z11) {
            com.google.zxing.c cVar;
            try {
                h hVar = new h(this.f17908a, i11, i12, 0, 0, i11, i12, false);
                if (z11) {
                    cVar = new com.google.zxing.c(new uo.j(hVar.e()));
                } else {
                    cVar = new com.google.zxing.c(new uo.j(hVar));
                }
                j c11 = d.this.f17905k.c(cVar);
                d.this.f17905k.reset();
                return c11;
            } catch (Throwable unused) {
                d.this.f17905k.reset();
                return null;
            }
        }

        private j c() {
            Camera.Size previewSize = this.f17909b.getParameters().getPreviewSize();
            int i11 = previewSize.width;
            int i12 = previewSize.height;
            j b11 = b(i11, i12, false);
            if (b11 != null) {
                return b11;
            }
            j b12 = b(i11, i12, true);
            if (b12 != null) {
                return b12;
            }
            d(i11, i12);
            int i13 = previewSize.height;
            int i14 = previewSize.width;
            j b13 = b(i13, i14, false);
            return b13 != null ? b13 : b(i13, i14, true);
        }

        private void d(int i11, int i12) {
            byte[] bArr = new byte[this.f17908a.length];
            for (int i13 = 0; i13 < i11; i13++) {
                for (int i14 = 0; i14 < i12; i14++) {
                    int i15 = (i13 * i12) + i14;
                    int i16 = (((i14 * i11) + i11) - i13) - 1;
                    if (i15 >= 0) {
                        byte[] bArr2 = this.f17908a;
                        if (i15 < bArr2.length && i16 >= 0 && i16 < bArr2.length) {
                            bArr[i16] = bArr2[i15];
                        }
                    }
                }
            }
            this.f17908a = bArr;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            j c11;
            if (isCancelled()) {
                return null;
            }
            try {
                c11 = c();
            } catch (Throwable unused) {
            }
            if (c11 != null) {
                ReactApplicationContext reactContextSingleton = RCTCameraModule.getReactContextSingleton();
                WritableMap createMap = Arguments.createMap();
                WritableArray createArray = Arguments.createArray();
                l[] e11 = c11.e();
                if (e11 != null) {
                    for (l lVar : e11) {
                        WritableMap createMap2 = Arguments.createMap();
                        createMap2.putString("x", String.valueOf(lVar.c()));
                        createMap2.putString("y", String.valueOf(lVar.d()));
                        createArray.pushMap(createMap2);
                    }
                }
                createMap.putArray("bounds", createArray);
                createMap.putString(MessageExtension.FIELD_DATA, c11.f());
                createMap.putString("type", c11.b().toString());
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextSingleton.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("CameraBarCodeReadAndroid", createMap);
                d.this.f17905k.reset();
                d.f17894l = false;
                return null;
            }
            throw new Exception();
        }
    }

    public d(Context context, int i11) {
        super(context);
        this.f17903i = false;
        this.f17905k = new g();
        setSurfaceTextureListener(this);
        this.f17895a = i11;
        i(com.lwansbrough.RCTCamera.a.h().e());
    }

    private Activity c() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private float e(MotionEvent motionEvent) {
        float x11 = motionEvent.getX(0) - motionEvent.getX(1);
        float y11 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x11 * x11) + (y11 * y11));
    }

    private void h(MotionEvent motionEvent, Camera.Parameters parameters) {
        int maxZoom = parameters.getMaxZoom();
        int zoom = parameters.getZoom();
        float e11 = e(motionEvent);
        float f11 = this.f17904j;
        if (e11 > f11) {
            if (zoom < maxZoom) {
                zoom++;
            }
        } else if (e11 < f11 && zoom > 0) {
            zoom--;
        }
        this.f17904j = e11;
        parameters.setZoom(zoom);
        try {
            this.f17902h.setParameters(parameters);
        } catch (RuntimeException e12) {
            Log.e("RCTCameraViewFinder", "setParameters failed", e12);
        }
    }

    private void i(List<String> list) {
        EnumMap enumMap = new EnumMap(com.google.zxing.d.class);
        EnumSet noneOf = EnumSet.noneOf(com.google.zxing.a.class);
        if (list != null) {
            for (String str : list) {
                com.google.zxing.a j11 = j(str);
                if (j11 != null) {
                    noneOf.add(j11);
                }
            }
        }
        enumMap.put((EnumMap) com.google.zxing.d.POSSIBLE_FORMATS, (com.google.zxing.d) noneOf);
        this.f17905k.d(enumMap);
    }

    private com.google.zxing.a j(String str) {
        if ("aztec".equals(str)) {
            return com.google.zxing.a.AZTEC;
        }
        if ("ean13".equals(str)) {
            return com.google.zxing.a.EAN_13;
        }
        if ("ean8".equals(str)) {
            return com.google.zxing.a.EAN_8;
        }
        if ("qr".equals(str)) {
            return com.google.zxing.a.QR_CODE;
        }
        if ("pdf417".equals(str)) {
            return com.google.zxing.a.PDF_417;
        }
        if ("upce".equals(str)) {
            return com.google.zxing.a.UPC_E;
        }
        if ("datamatrix".equals(str)) {
            return com.google.zxing.a.DATA_MATRIX;
        }
        if ("code39".equals(str)) {
            return com.google.zxing.a.CODE_39;
        }
        if ("code93".equals(str)) {
            return com.google.zxing.a.CODE_93;
        }
        if ("interleaved2of5".equals(str)) {
            return com.google.zxing.a.ITF;
        }
        if ("codabar".equals(str)) {
            return com.google.zxing.a.CODABAR;
        }
        if ("code128".equals(str)) {
            return com.google.zxing.a.CODE_128;
        }
        if ("maxicode".equals(str)) {
            return com.google.zxing.a.MAXICODE;
        }
        if ("rss14".equals(str)) {
            return com.google.zxing.a.RSS_14;
        }
        if ("rssexpanded".equals(str)) {
            return com.google.zxing.a.RSS_EXPANDED;
        }
        if ("upca".equals(str)) {
            return com.google.zxing.a.UPC_A;
        }
        if ("upceanextension".equals(str)) {
            return com.google.zxing.a.UPC_EAN_EXTENSION;
        }
        Log.v("RCTCamera", "Unsupported code.. [" + str + "]");
        return null;
    }

    private synchronized void r() {
        List<Camera.Size> o11;
        Activity c11;
        if (!this.f17900f) {
            boolean z11 = true;
            this.f17900f = true;
            try {
                try {
                    Camera a11 = com.lwansbrough.RCTCamera.a.h().a(this.f17895a);
                    this.f17902h = a11;
                    Camera.Parameters parameters = a11.getParameters();
                    int i11 = this.f17896b;
                    boolean z12 = i11 == 0;
                    if (i11 != 1) {
                        z11 = false;
                    }
                    if (!z12 && !z11) {
                        throw new RuntimeException("Unsupported capture mode:" + this.f17896b);
                    }
                    List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                    if (z12 && supportedFocusModes.contains("continuous-picture")) {
                        parameters.setFocusMode("continuous-picture");
                    } else if (z11 && supportedFocusModes.contains("continuous-video")) {
                        parameters.setFocusMode("continuous-video");
                    } else if (supportedFocusModes.contains("auto")) {
                        parameters.setFocusMode("auto");
                    }
                    if (z12) {
                        o11 = parameters.getSupportedPictureSizes();
                    } else if (z11) {
                        o11 = com.lwansbrough.RCTCamera.a.h().o(this.f17902h);
                    } else {
                        throw new RuntimeException("Unsupported capture mode:" + this.f17896b);
                    }
                    Camera.Size f11 = com.lwansbrough.RCTCamera.a.h().f(o11, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    parameters.setPictureSize(f11.width, f11.height);
                    try {
                        this.f17902h.setParameters(parameters);
                    } catch (RuntimeException e11) {
                        Log.e("RCTCameraViewFinder", "setParameters failed", e11);
                    }
                    this.f17902h.setPreviewTexture(this.f17897c);
                    this.f17902h.startPreview();
                    if (this.f17903i && (c11 = c()) != null) {
                        c11.getWindow().setBackgroundDrawable(null);
                    }
                    this.f17902h.setPreviewCallback(this);
                } catch (Exception e12) {
                    e12.printStackTrace();
                    t();
                }
            } catch (NullPointerException e13) {
                e13.printStackTrace();
            }
            this.f17900f = false;
        }
    }

    private synchronized void t() {
        if (!this.f17901g) {
            this.f17901g = true;
            try {
                Camera camera = this.f17902h;
                if (camera != null) {
                    camera.stopPreview();
                    this.f17902h.setPreviewCallback(null);
                    com.lwansbrough.RCTCamera.a.h().q(this.f17895a);
                    this.f17902h = null;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.f17901g = false;
        }
    }

    public int d() {
        return this.f17895a;
    }

    public double f() {
        return com.lwansbrough.RCTCamera.a.h().m(this.f17895a) / com.lwansbrough.RCTCamera.a.h().j(this.f17895a);
    }

    public void g(MotionEvent motionEvent, Camera.Parameters parameters) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes == null || !supportedFocusModes.contains("auto") || parameters.getMaxNumFocusAreas() == 0) {
            return;
        }
        this.f17902h.cancelAutoFocus();
        try {
            Camera.Area a11 = com.lwansbrough.RCTCamera.b.a(motionEvent, this.f17898d, this.f17899e);
            parameters.setFocusMode("auto");
            ArrayList arrayList = new ArrayList();
            arrayList.add(a11);
            parameters.setFocusAreas(arrayList);
            if (parameters.getMaxNumMeteringAreas() > 0) {
                parameters.setMeteringAreas(arrayList);
            }
            try {
                this.f17902h.setParameters(parameters);
            } catch (RuntimeException e11) {
                Log.e("RCTCameraViewFinder", "setParameters failed", e11);
            }
            try {
                this.f17902h.autoFocus(new b(this));
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        } catch (RuntimeException e13) {
            e13.printStackTrace();
        }
    }

    public void k(int i11) {
        if (this.f17895a == i11) {
            return;
        }
        new Thread(new a(i11)).start();
    }

    public void l(int i11) {
        com.lwansbrough.RCTCamera.a.h().v(this.f17895a, i11);
        this.f17896b = i11;
    }

    public void m(String str) {
        com.lwansbrough.RCTCamera.a.h().w(this.f17895a, str);
    }

    public void n(boolean z11) {
        this.f17903i = z11;
    }

    public void o(int i11) {
        com.lwansbrough.RCTCamera.a.h().y(this.f17895a, i11);
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (!com.lwansbrough.RCTCamera.a.h().p() || f17894l) {
            return;
        }
        f17894l = true;
        new c(camera, bArr).execute(new Void[0]);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
        this.f17897c = surfaceTexture;
        this.f17898d = i11;
        this.f17899e = i12;
        r();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f17897c = null;
        this.f17898d = 0;
        this.f17899e = 0;
        t();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
        this.f17898d = i11;
        this.f17899e = i12;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Camera camera = this.f17902h;
        if (camera == null) {
            return false;
        }
        Camera.Parameters parameters = camera.getParameters();
        int action = motionEvent.getAction();
        if (motionEvent.getPointerCount() > 1) {
            if (action == 5) {
                this.f17904j = e(motionEvent);
            } else if (action == 2 && parameters.isZoomSupported()) {
                this.f17902h.cancelAutoFocus();
                h(motionEvent, parameters);
            }
        } else if (action == 1) {
            g(motionEvent, parameters);
        }
        return true;
    }

    public void p(int i11) {
        com.lwansbrough.RCTCamera.a.h().B(this.f17895a, i11);
    }

    public void q(int i11) {
        com.lwansbrough.RCTCamera.a.h().C(this.f17895a, i11);
    }

    public void s() {
        if (this.f17897c != null) {
            r();
        }
    }

    public void u() {
        if (this.f17902h != null) {
            t();
        }
    }
}