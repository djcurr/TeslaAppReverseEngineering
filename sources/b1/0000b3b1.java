package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.g;
import java.util.Objects;

/* loaded from: classes.dex */
final class x0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.camera.core.impl.e f51235a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(androidx.camera.core.impl.e eVar) {
        Objects.requireNonNull(eVar, "cameraCaptureCallback is null");
        this.f51235a = eVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        androidx.camera.core.impl.l1 a11;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            v3.h.b(tag instanceof androidx.camera.core.impl.l1, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            a11 = (androidx.camera.core.impl.l1) tag;
        } else {
            a11 = androidx.camera.core.impl.l1.a();
        }
        this.f51235a.b(new c(a11, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f51235a.c(new androidx.camera.core.impl.g(g.a.ERROR));
    }
}