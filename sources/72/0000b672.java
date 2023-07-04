package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // u.c, u.a.InterfaceC1175a
    public int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f52775a.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // u.c, u.a.InterfaceC1175a
    public int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f52775a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}