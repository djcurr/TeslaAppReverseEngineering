package t;

import android.hardware.camera2.CameraCaptureSession;
import java.util.Objects;

/* loaded from: classes.dex */
final class y0 extends androidx.camera.core.impl.e {

    /* renamed from: a  reason: collision with root package name */
    private final CameraCaptureSession.CaptureCallback f51238a;

    private y0(CameraCaptureSession.CaptureCallback captureCallback) {
        Objects.requireNonNull(captureCallback, "captureCallback is null");
        this.f51238a = captureCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y0 d(CameraCaptureSession.CaptureCallback captureCallback) {
        return new y0(captureCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CameraCaptureSession.CaptureCallback e() {
        return this.f51238a;
    }
}