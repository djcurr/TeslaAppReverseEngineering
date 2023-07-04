package u;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h extends g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h(CameraDevice cameraDevice) {
        super((CameraDevice) v3.h.f(cameraDevice), null);
    }

    @Override // u.g, u.f, u.i, u.e.a
    public void a(v.g gVar) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) gVar.i();
        v3.h.f(sessionConfiguration);
        this.f52792a.createCaptureSession(sessionConfiguration);
    }
}