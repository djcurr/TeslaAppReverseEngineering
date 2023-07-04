package org.reactnative.camera;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.CamcorderProfile;
import android.os.AsyncTask;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.n0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import e80.h;
import e80.i;
import e80.j;
import expo.modules.imagepicker.ImagePickerConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import mh.e;

/* loaded from: classes5.dex */
public class d extends mh.e implements LifecycleEventListener, e80.b, e80.f, e80.d, j, e80.g {
    public volatile boolean A;
    public volatile boolean B;
    public volatile boolean C;
    public volatile boolean E;
    private com.google.zxing.g F;
    private g80.b G;
    private c80.b H;
    private boolean K;
    private boolean L;
    private boolean O;
    private boolean P;
    private boolean Q;
    private int Q1;
    private int Q2;
    private int R;
    private int T;
    private boolean V1;

    /* renamed from: b1  reason: collision with root package name */
    private int f43275b1;

    /* renamed from: b2  reason: collision with root package name */
    private float f43276b2;

    /* renamed from: g1  reason: collision with root package name */
    private int f43277g1;

    /* renamed from: g2  reason: collision with root package name */
    private float f43278g2;

    /* renamed from: h  reason: collision with root package name */
    private n0 f43279h;

    /* renamed from: i  reason: collision with root package name */
    private Queue<Promise> f43280i;

    /* renamed from: i3  reason: collision with root package name */
    private GestureDetector.SimpleOnGestureListener f43281i3;

    /* renamed from: j  reason: collision with root package name */
    private Map<Promise, ReadableMap> f43282j;

    /* renamed from: j3  reason: collision with root package name */
    private ScaleGestureDetector.OnScaleGestureListener f43283j3;

    /* renamed from: k  reason: collision with root package name */
    private Map<Promise, File> f43284k;

    /* renamed from: l  reason: collision with root package name */
    private Promise f43285l;

    /* renamed from: m  reason: collision with root package name */
    private List<String> f43286m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f43287n;

    /* renamed from: o  reason: collision with root package name */
    private ScaleGestureDetector f43288o;

    /* renamed from: p  reason: collision with root package name */
    private GestureDetector f43289p;

    /* renamed from: p1  reason: collision with root package name */
    private int f43290p1;

    /* renamed from: p2  reason: collision with root package name */
    private float f43291p2;

    /* renamed from: q  reason: collision with root package name */
    private boolean f43292q;

    /* renamed from: t  reason: collision with root package name */
    private boolean f43293t;

    /* renamed from: w  reason: collision with root package name */
    private boolean f43294w;

    /* renamed from: x  reason: collision with root package name */
    private Boolean f43295x;

    /* renamed from: x1  reason: collision with root package name */
    private boolean f43296x1;

    /* renamed from: x2  reason: collision with root package name */
    private float f43297x2;

    /* renamed from: y  reason: collision with root package name */
    private Boolean f43298y;

    /* renamed from: y1  reason: collision with root package name */
    private int f43299y1;

    /* renamed from: y2  reason: collision with root package name */
    private int f43300y2;

    /* renamed from: z  reason: collision with root package name */
    private boolean f43301z;

    /* loaded from: classes5.dex */
    class a extends e.b {
        a() {
        }

        @Override // mh.e.b
        public void b(mh.e eVar) {
            org.reactnative.camera.e.e(eVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // mh.e.b
        public void c(mh.e eVar, byte[] bArr, int i11, int i12, int i13) {
            boolean z11;
            d dVar;
            int q11 = org.reactnative.camera.e.q(i13, d.this.getFacing(), d.this.getCameraOrientation());
            boolean z12 = d.this.O && !d.this.A && (eVar instanceof e80.b);
            boolean z13 = d.this.K && !d.this.B && (eVar instanceof e80.f);
            boolean z14 = d.this.L && !d.this.C && (eVar instanceof e80.d);
            boolean z15 = d.this.P && !d.this.E && (eVar instanceof j);
            if ((z12 || z13 || z14 || z15) && bArr.length >= i11 * 1.5d * i12) {
                if (z12) {
                    d.this.A = true;
                    z11 = false;
                    new e80.a((e80.b) eVar, d.this.F, bArr, i11, i12, d.this.V1, d.this.f43276b2, d.this.f43278g2, d.this.f43291p2, d.this.f43297x2, d.this.f43300y2, d.this.Q2, d.this.getAspectRatio().i()).execute(new Void[0]);
                } else {
                    z11 = false;
                }
                int i14 = z11;
                if (z13) {
                    d.this.B = true;
                    new e80.e((e80.f) eVar, d.this.G, bArr, i11, i12, q11, d.this.getResources().getDisplayMetrics().density, d.this.getFacing(), d.this.getWidth(), d.this.getHeight(), d.this.f43299y1, d.this.Q1).execute(new Void[i14]);
                }
                if (z14) {
                    d.this.C = true;
                    if (d.this.f43290p1 == c80.b.f9011e) {
                        d.this.f43294w = i14;
                    } else if (d.this.f43290p1 != c80.b.f9012f) {
                        if (d.this.f43290p1 == c80.b.f9013g) {
                            d.this.f43294w = true;
                        }
                    } else {
                        d.this.f43294w = !dVar.f43294w;
                    }
                    if (d.this.f43294w) {
                        for (int i15 = i14; i15 < bArr.length; i15++) {
                            bArr[i15] = (byte) (~bArr[i15]);
                        }
                    }
                    new e80.c((e80.d) eVar, d.this.H, bArr, i11, i12, q11, d.this.getResources().getDisplayMetrics().density, d.this.getFacing(), d.this.getWidth(), d.this.getHeight(), d.this.f43299y1, d.this.Q1).execute(new Void[i14]);
                }
                if (z15) {
                    d.this.E = true;
                    new i((j) eVar, d.this.f43279h, bArr, i11, i12, q11, d.this.getResources().getDisplayMetrics().density, d.this.getFacing(), d.this.getWidth(), d.this.getHeight(), d.this.f43299y1, d.this.Q1).execute(new Void[i14]);
                }
            }
        }

        @Override // mh.e.b
        public void d(mh.e eVar) {
            org.reactnative.camera.e.h(eVar, "Camera view threw an error - component could not be rendered.");
        }

        @Override // mh.e.b
        public void e(mh.e eVar, byte[] bArr, int i11) {
            Promise promise = (Promise) d.this.f43280i.poll();
            ReadableMap readableMap = (ReadableMap) d.this.f43282j.remove(promise);
            if (readableMap.hasKey("fastMode") && readableMap.getBoolean("fastMode")) {
                promise.resolve(null);
            }
            File file = (File) d.this.f43284k.remove(promise);
            if (Build.VERSION.SDK_INT >= 11) {
                new h(bArr, promise, readableMap, file, i11, d.this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else {
                new h(bArr, promise, readableMap, file, i11, d.this).execute(new Void[0]);
            }
            org.reactnative.camera.e.j(eVar);
        }

        @Override // mh.e.b
        public void f(mh.e eVar) {
            org.reactnative.camera.e.k(eVar);
        }

        @Override // mh.e.b
        public void g(mh.e eVar, String str, int i11, int i12) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("videoOrientation", i11);
            createMap.putInt("deviceOrientation", i12);
            createMap.putString("uri", f80.c.c(new File(str)).toString());
            org.reactnative.camera.e.l(eVar, createMap);
        }

        @Override // mh.e.b
        public void h(mh.e eVar, String str, int i11, int i12) {
            if (d.this.f43285l != null) {
                if (str == null) {
                    d.this.f43285l.reject("E_RECORDING", "Couldn't stop recording - there is none in progress");
                } else {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("isRecordingInterrupted", d.this.f43298y.booleanValue());
                    createMap.putInt("videoOrientation", i11);
                    createMap.putInt("deviceOrientation", i12);
                    createMap.putString("uri", f80.c.c(new File(str)).toString());
                    d.this.f43285l.resolve(createMap);
                }
                d dVar = d.this;
                Boolean bool = Boolean.FALSE;
                dVar.f43295x = bool;
                d.this.f43298y = bool;
                d.this.f43285l = null;
            }
        }
    }

    /* loaded from: classes5.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f43303a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableMap f43304b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ File f43305c;

        b(Promise promise, ReadableMap readableMap, File file) {
            this.f43303a = promise;
            this.f43304b = readableMap;
            this.f43305c = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f43280i.add(this.f43303a);
            d.this.f43282j.put(this.f43303a, this.f43304b);
            d.this.f43284k.put(this.f43303a, this.f43305c);
            try {
                d.super.z(this.f43304b);
            } catch (Exception e11) {
                d.this.f43280i.remove(this.f43303a);
                d.this.f43282j.remove(this.f43303a);
                d.this.f43284k.remove(this.f43303a);
                this.f43303a.reject("E_TAKE_PICTURE_FAILED", e11.getMessage());
            }
        }
    }

    /* loaded from: classes5.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReadableMap f43307a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f43308b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f43309c;

        c(ReadableMap readableMap, File file, Promise promise) {
            this.f43307a = readableMap;
            this.f43308b = file;
            this.f43309c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = this.f43307a.hasKey("path") ? this.f43307a.getString("path") : f80.c.b(this.f43308b, ".mp4");
                int i11 = this.f43307a.hasKey("maxDuration") ? this.f43307a.getInt("maxDuration") : -1;
                int i12 = this.f43307a.hasKey("maxFileSize") ? this.f43307a.getInt("maxFileSize") : -1;
                int i13 = this.f43307a.hasKey("fps") ? this.f43307a.getInt("fps") : -1;
                CamcorderProfile o11 = this.f43307a.hasKey(ImagePickerConstants.OPTION_QUALITY) ? org.reactnative.camera.e.o(this.f43307a.getInt(ImagePickerConstants.OPTION_QUALITY)) : CamcorderProfile.get(1);
                if (this.f43307a.hasKey("videoBitrate")) {
                    o11.videoBitRate = this.f43307a.getInt("videoBitrate");
                }
                if (d.super.s(string, i11 * 1000, i12, this.f43307a.hasKey("mute") ? !this.f43307a.getBoolean("mute") : true, o11, this.f43307a.hasKey("orientation") ? this.f43307a.getInt("orientation") : 0, i13)) {
                    d.this.f43295x = Boolean.TRUE;
                    d.this.f43285l = this.f43309c;
                    return;
                }
                this.f43309c.reject("E_RECORDING_FAILED", "Starting video recording failed. Another recording might be in progress.");
            } catch (IOException unused) {
                this.f43309c.reject("E_RECORDING_FAILED", "Starting video recording failed - could not create video file.");
            }
        }
    }

    /* renamed from: org.reactnative.camera.d$d  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class RunnableC0865d implements Runnable {
        RunnableC0865d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if ((!d.this.f43292q || d.this.p()) && !d.this.f43293t) {
                return;
            }
            d.this.f43292q = false;
            d.this.f43293t = false;
            d.this.w();
        }
    }

    /* loaded from: classes5.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.x();
            d.this.m();
        }
    }

    /* loaded from: classes5.dex */
    class f extends GestureDetector.SimpleOnGestureListener {
        f() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            d dVar = d.this;
            org.reactnative.camera.e.n(dVar, true, dVar.o0(motionEvent.getX()), d.this.o0(motionEvent.getY()));
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            d dVar = d.this;
            org.reactnative.camera.e.n(dVar, false, dVar.o0(motionEvent.getX()), d.this.o0(motionEvent.getY()));
            return true;
        }
    }

    /* loaded from: classes5.dex */
    class g implements ScaleGestureDetector.OnScaleGestureListener {
        g() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            d.this.m0(scaleGestureDetector.getScaleFactor());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            d.this.m0(scaleGestureDetector.getScaleFactor());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public d(n0 n0Var) {
        super(n0Var, true);
        this.f43280i = new ConcurrentLinkedQueue();
        this.f43282j = new ConcurrentHashMap();
        this.f43284k = new ConcurrentHashMap();
        this.f43286m = null;
        this.f43287n = false;
        this.f43292q = false;
        this.f43293t = true;
        this.f43294w = false;
        Boolean bool = Boolean.FALSE;
        this.f43295x = bool;
        this.f43298y = bool;
        this.f43301z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.E = false;
        this.K = false;
        this.L = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.R = g80.b.f27848m;
        this.T = g80.b.f27846k;
        this.f43275b1 = g80.b.f27844i;
        this.f43277g1 = c80.b.f9014h;
        this.f43290p1 = c80.b.f9011e;
        this.f43296x1 = true;
        this.V1 = false;
        this.f43276b2 = BitmapDescriptorFactory.HUE_RED;
        this.f43278g2 = BitmapDescriptorFactory.HUE_RED;
        this.f43291p2 = BitmapDescriptorFactory.HUE_RED;
        this.f43297x2 = BitmapDescriptorFactory.HUE_RED;
        this.f43300y2 = 0;
        this.Q2 = 0;
        this.f43281i3 = new f();
        this.f43283j3 = new g();
        this.f43279h = n0Var;
        n0Var.addLifecycleEventListener(this);
        l(new a());
    }

    private boolean k0() {
        return Build.VERSION.SDK_INT < 23 || androidx.core.content.b.checkSelfPermission(getContext(), "android.permission.CAMERA") == 0;
    }

    private void l0() {
        this.F = new com.google.zxing.g();
        EnumMap enumMap = new EnumMap(com.google.zxing.d.class);
        EnumSet noneOf = EnumSet.noneOf(com.google.zxing.a.class);
        List<String> list = this.f43286m;
        if (list != null) {
            for (String str : list) {
                String str2 = (String) CameraModule.VALID_BARCODE_TYPES.get(str);
                if (str2 != null) {
                    noneOf.add(com.google.zxing.a.valueOf(str2));
                }
            }
        }
        enumMap.put((EnumMap) com.google.zxing.d.POSSIBLE_FORMATS, (com.google.zxing.d) noneOf);
        this.F.d(enumMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(float f11) {
        float zoom = getZoom();
        float f12 = (f11 - 1.0f) + zoom;
        if (f12 > zoom) {
            setZoom(Math.min(f12, 1.0f));
        } else {
            setZoom(Math.max(f12, (float) BitmapDescriptorFactory.HUE_RED));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int o0(float f11) {
        Resources resources = getResources();
        resources.getConfiguration();
        return (int) (f11 / resources.getDisplayMetrics().density);
    }

    private void r0() {
        c80.b bVar = new c80.b(this.f43279h);
        this.H = bVar;
        bVar.f(this.f43277g1);
    }

    private void s0() {
        g80.b bVar = new g80.b(this.f43279h);
        this.G = bVar;
        bVar.h(this.R);
        this.G.g(this.T);
        this.G.f(this.f43275b1);
        this.G.i(this.f43296x1);
    }

    @Override // e80.f
    public void a(g80.b bVar) {
        if (this.K) {
            org.reactnative.camera.e.f(this, bVar);
        }
    }

    @Override // e80.f
    public void b(WritableArray writableArray) {
        if (this.K) {
            org.reactnative.camera.e.g(this, writableArray);
        }
    }

    @Override // e80.b
    public void c() {
        this.A = false;
        com.google.zxing.g gVar = this.F;
        if (gVar != null) {
            gVar.reset();
        }
    }

    @Override // e80.d
    public void d(c80.b bVar) {
        if (this.L) {
            org.reactnative.camera.e.c(this, bVar);
        }
    }

    @Override // e80.g
    public void e(WritableMap writableMap) {
        org.reactnative.camera.e.i(this, writableMap);
    }

    @Override // e80.d
    public void f(WritableArray writableArray, int i11, int i12, byte[] bArr) {
        byte[] bArr2;
        if (this.L) {
            if (this.f43287n) {
                try {
                    YuvImage yuvImage = new YuvImage(bArr, 17, i11, i12, null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(new Rect(0, 0, i11, i12), 100, byteArrayOutputStream);
                    bArr2 = byteArrayOutputStream.toByteArray();
                } catch (Exception e11) {
                    throw new RuntimeException(String.format("Error decoding imageData from NV21 format (%d bytes)", Integer.valueOf(bArr.length)), e11);
                }
            } else {
                bArr2 = null;
            }
            org.reactnative.camera.e.d(this, writableArray, bArr2);
        }
    }

    @Override // e80.b
    public void g(com.google.zxing.j jVar, int i11, int i12, byte[] bArr) {
        byte[] bArr2;
        String str = jVar.b().toString();
        if (this.O && this.f43286m.contains(str)) {
            if (this.f43287n) {
                try {
                    YuvImage yuvImage = new YuvImage(bArr, 17, i11, i12, null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(new Rect(0, 0, i11, i12), 100, byteArrayOutputStream);
                    bArr2 = byteArrayOutputStream.toByteArray();
                } catch (Exception e11) {
                    throw new RuntimeException(String.format("Error decoding imageData from NV21 format (%d bytes)", Integer.valueOf(bArr.length)), e11);
                }
            } else {
                bArr2 = null;
            }
            org.reactnative.camera.e.b(this, jVar, i11, i12, bArr2);
        }
    }

    @Override // e80.j
    public void h() {
        this.E = false;
    }

    @Override // e80.f
    public void i() {
        this.B = false;
    }

    @Override // e80.j
    public void j(WritableArray writableArray) {
        if (this.P) {
            org.reactnative.camera.e.m(this, writableArray);
        }
    }

    @Override // e80.d
    public void k() {
        this.C = false;
    }

    public void n0(ReadableMap readableMap, Promise promise, File file) {
        this.f38572g.post(new c(readableMap, file, promise));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        g80.b bVar = this.G;
        if (bVar != null) {
            bVar.d();
        }
        c80.b bVar2 = this.H;
        if (bVar2 != null) {
            bVar2.d();
        }
        this.F = null;
        this.f43279h.removeLifecycleEventListener(this);
        this.f38572g.post(new e());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        if (this.f43295x.booleanValue()) {
            this.f43298y = Boolean.TRUE;
        }
        if (this.f43292q || !p()) {
            return;
        }
        this.f43292q = true;
        x();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        if (k0()) {
            this.f38572g.post(new RunnableC0865d());
        } else {
            org.reactnative.camera.e.h(this, "Camera permissions not granted - component could not be rendered.");
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        View view = getView();
        if (view == null) {
            return;
        }
        float f11 = i13 - i11;
        float f12 = i14 - i12;
        float i17 = getAspectRatio().i();
        int i18 = getResources().getConfiguration().orientation;
        setBackgroundColor(-16777216);
        if (i18 == 2) {
            float f13 = i17 * f12;
            if (f13 < f11) {
                i16 = (int) (f11 / i17);
                i15 = (int) f11;
            } else {
                i15 = (int) f13;
                i16 = (int) f12;
            }
        } else {
            float f14 = i17 * f11;
            if (f14 > f12) {
                i16 = (int) f14;
                i15 = (int) f11;
            } else {
                i15 = (int) (f12 / i17);
                i16 = (int) f12;
            }
        }
        int i19 = (int) ((f11 - i15) / 2.0f);
        int i21 = (int) ((f12 - i16) / 2.0f);
        this.f43299y1 = i19;
        this.Q1 = i21;
        view.layout(i19, i21, i15 + i19, i16 + i21);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f43301z) {
            this.f43288o.onTouchEvent(motionEvent);
        }
        if (this.Q) {
            this.f43289p.onTouchEvent(motionEvent);
            return true;
        }
        return true;
    }

    public void p0(int i11, int i12) {
        this.f43300y2 = i11;
        this.Q2 = i12;
    }

    public void q0(float f11, float f12, float f13, float f14) {
        this.V1 = true;
        this.f43276b2 = f11;
        this.f43278g2 = f12;
        this.f43291p2 = f13;
        this.f43297x2 = f14;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    public void setBarCodeTypes(List<String> list) {
        this.f43286m = list;
        l0();
    }

    public void setDetectedImageInEvent(boolean z11) {
        this.f43287n = z11;
    }

    public void setFaceDetectionClassifications(int i11) {
        this.f43275b1 = i11;
        g80.b bVar = this.G;
        if (bVar != null) {
            bVar.f(i11);
        }
    }

    public void setFaceDetectionLandmarks(int i11) {
        this.T = i11;
        g80.b bVar = this.G;
        if (bVar != null) {
            bVar.g(i11);
        }
    }

    public void setFaceDetectionMode(int i11) {
        this.R = i11;
        g80.b bVar = this.G;
        if (bVar != null) {
            bVar.h(i11);
        }
    }

    public void setGoogleVisionBarcodeMode(int i11) {
        this.f43290p1 = i11;
    }

    public void setGoogleVisionBarcodeType(int i11) {
        this.f43277g1 = i11;
        c80.b bVar = this.H;
        if (bVar != null) {
            bVar.f(i11);
        }
    }

    public void setShouldDetectFaces(boolean z11) {
        if (z11 && this.G == null) {
            s0();
        }
        this.K = z11;
        setScanning(z11 || this.L || this.O || this.P);
    }

    public void setShouldDetectTouches(boolean z11) {
        if (!this.Q && z11) {
            this.f43289p = new GestureDetector(this.f43279h, this.f43281i3);
        } else {
            this.f43289p = null;
        }
        this.Q = z11;
    }

    public void setShouldGoogleDetectBarcodes(boolean z11) {
        if (z11 && this.H == null) {
            r0();
        }
        this.L = z11;
        setScanning(this.K || z11 || this.O || this.P);
    }

    public void setShouldRecognizeText(boolean z11) {
        this.P = z11;
        setScanning(this.K || this.L || this.O || z11);
    }

    public void setShouldScanBarCodes(boolean z11) {
        if (z11 && this.F == null) {
            l0();
        }
        this.O = z11;
        setScanning(this.K || this.L || z11 || this.P);
    }

    public void setTracking(boolean z11) {
        this.f43296x1 = z11;
        g80.b bVar = this.G;
        if (bVar != null) {
            bVar.i(z11);
        }
    }

    public void setUseNativeZoom(boolean z11) {
        if (!this.f43301z && z11) {
            this.f43288o = new ScaleGestureDetector(this.f43279h, this.f43283j3);
        } else {
            this.f43288o = null;
        }
        this.f43301z = z11;
    }

    public void t0(ReadableMap readableMap, Promise promise, File file) {
        this.f38572g.post(new b(promise, readableMap, file));
    }
}