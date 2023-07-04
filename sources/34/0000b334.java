package t;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.core.CameraControl;
import androidx.concurrent.futures.b;
import s.a;
import t.k2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements k2.b {

    /* renamed from: a  reason: collision with root package name */
    private final u.d f50898a;

    /* renamed from: b  reason: collision with root package name */
    private final Range<Float> f50899b;

    /* renamed from: d  reason: collision with root package name */
    private b.a<Void> f50901d;

    /* renamed from: c  reason: collision with root package name */
    private float f50900c = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f50902e = 1.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(u.d dVar) {
        this.f50898a = dVar;
        this.f50899b = (Range) dVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    @Override // t.k2.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f50901d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f11 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f11 == null) {
                return;
            }
            if (this.f50902e == f11.floatValue()) {
                this.f50901d.c(null);
                this.f50901d = null;
            }
        }
    }

    @Override // t.k2.b
    public float b() {
        return this.f50899b.getLower().floatValue();
    }

    @Override // t.k2.b
    public void c(a.C1090a c1090a) {
        c1090a.d(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f50900c));
    }

    @Override // t.k2.b
    public void d() {
        this.f50900c = 1.0f;
        b.a<Void> aVar = this.f50901d;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f50901d = null;
        }
    }

    @Override // t.k2.b
    public float e() {
        return this.f50899b.getUpper().floatValue();
    }

    @Override // t.k2.b
    public Rect f() {
        return (Rect) v3.h.f((Rect) this.f50898a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }
}