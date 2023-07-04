package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface u1 {

    /* loaded from: classes.dex */
    public static abstract class a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public void n(u1 u1Var) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void o(u1 u1Var) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void p(u1 u1Var) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void q(u1 u1Var) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void r(u1 u1Var) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void s(u1 u1Var) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void t(u1 u1Var) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void u(u1 u1Var, Surface surface) {
        }
    }

    a c();

    void close();

    void d();

    void e();

    CameraDevice f();

    int g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    com.google.common.util.concurrent.c<Void> h(String str);

    int j(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    u.a k();

    void m();
}