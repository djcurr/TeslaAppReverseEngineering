package t;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.CameraControl;
import androidx.concurrent.futures.b;
import s.a;
import t.k2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g1 implements k2.b {

    /* renamed from: a  reason: collision with root package name */
    private final u.d f50993a;

    /* renamed from: c  reason: collision with root package name */
    private b.a<Void> f50995c;

    /* renamed from: b  reason: collision with root package name */
    private Rect f50994b = null;

    /* renamed from: d  reason: collision with root package name */
    private Rect f50996d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g1(u.d dVar) {
        this.f50993a = dVar;
    }

    private Rect g() {
        return (Rect) v3.h.f((Rect) this.f50993a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // t.k2.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f50995c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f50996d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f50995c.c(null);
            this.f50995c = null;
            this.f50996d = null;
        }
    }

    @Override // t.k2.b
    public float b() {
        return 1.0f;
    }

    @Override // t.k2.b
    public void c(a.C1090a c1090a) {
        Rect rect = this.f50994b;
        if (rect != null) {
            c1090a.d(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // t.k2.b
    public void d() {
        this.f50996d = null;
        this.f50994b = null;
        b.a<Void> aVar = this.f50995c;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f50995c = null;
        }
    }

    @Override // t.k2.b
    public float e() {
        Float f11 = (Float) this.f50993a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f11 == null) {
            return 1.0f;
        }
        if (f11.floatValue() < b()) {
            return b();
        }
        return f11.floatValue();
    }

    @Override // t.k2.b
    public Rect f() {
        Rect rect = this.f50994b;
        return rect != null ? rect : g();
    }
}