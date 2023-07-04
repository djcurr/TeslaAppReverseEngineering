package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.b1;
import androidx.camera.core.impl.d0;
import androidx.camera.core.impl.w0;
import androidx.camera.core.impl.x0;
import y.j;
import z.q;

/* loaded from: classes.dex */
public final class a extends j {

    /* renamed from: t  reason: collision with root package name */
    public static final d0.a<Integer> f49764t = d0.a.a("camera2.captureRequest.templateType", Integer.TYPE);

    /* renamed from: u  reason: collision with root package name */
    public static final d0.a<CameraDevice.StateCallback> f49765u = d0.a.a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    /* renamed from: v  reason: collision with root package name */
    public static final d0.a<CameraCaptureSession.StateCallback> f49766v = d0.a.a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    /* renamed from: w  reason: collision with root package name */
    public static final d0.a<CameraCaptureSession.CaptureCallback> f49767w = d0.a.a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    /* renamed from: x  reason: collision with root package name */
    public static final d0.a<c> f49768x = d0.a.a("camera2.cameraEvent.callback", c.class);

    /* renamed from: y  reason: collision with root package name */
    public static final d0.a<Object> f49769y = d0.a.a("camera2.captureRequest.tag", Object.class);

    /* renamed from: s.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1090a implements q<a> {

        /* renamed from: a  reason: collision with root package name */
        private final x0 f49770a = x0.I();

        @Override // z.q
        public w0 a() {
            return this.f49770a;
        }

        public a c() {
            return new a(b1.G(this.f49770a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> C1090a d(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f49770a.p(a.E(key), valuet);
            return this;
        }
    }

    public a(d0 d0Var) {
        super(d0Var);
    }

    public static d0.a<Object> E(CaptureRequest.Key<?> key) {
        return d0.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public c F(c cVar) {
        return (c) l().g(f49768x, cVar);
    }

    public j G() {
        return j.a.e(l()).d();
    }

    public Object H(Object obj) {
        return l().g(f49769y, obj);
    }

    public int I(int i11) {
        return ((Integer) l().g(f49764t, Integer.valueOf(i11))).intValue();
    }

    public CameraDevice.StateCallback J(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) l().g(f49765u, stateCallback);
    }

    public CameraCaptureSession.CaptureCallback K(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) l().g(f49767w, captureCallback);
    }

    public CameraCaptureSession.StateCallback L(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) l().g(f49766v, stateCallback);
    }
}