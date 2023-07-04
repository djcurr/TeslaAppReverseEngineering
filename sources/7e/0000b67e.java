package u;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;
import u.a;
import u.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g extends f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g h(CameraDevice cameraDevice, Handler handler) {
        return new g(cameraDevice, new i.a(handler));
    }

    @Override // u.f, u.i, u.e.a
    public void a(v.g gVar) {
        i.c(this.f52792a, gVar);
        a.c cVar = new a.c(gVar.a(), gVar.e());
        List<v.b> c11 = gVar.c();
        Handler handler = ((i.a) v3.h.f((i.a) this.f52793b)).f52794a;
        v.a b11 = gVar.b();
        if (b11 != null) {
            InputConfiguration inputConfiguration = (InputConfiguration) b11.a();
            v3.h.f(inputConfiguration);
            this.f52792a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, v.g.g(c11), cVar, handler);
        } else if (gVar.d() == 1) {
            this.f52792a.createConstrainedHighSpeedCaptureSession(i.f(c11), cVar, handler);
        } else {
            this.f52792a.createCaptureSessionByOutputConfigurations(v.g.g(c11), cVar, handler);
        }
    }
}