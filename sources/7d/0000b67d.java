package u;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import u.a;
import u.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f g(CameraDevice cameraDevice, Handler handler) {
        return new f(cameraDevice, new i.a(handler));
    }

    @Override // u.i, u.e.a
    public void a(v.g gVar) {
        i.c(this.f52792a, gVar);
        a.c cVar = new a.c(gVar.a(), gVar.e());
        List<Surface> f11 = i.f(gVar.c());
        Handler handler = ((i.a) v3.h.f((i.a) this.f52793b)).f52794a;
        v.a b11 = gVar.b();
        if (b11 != null) {
            InputConfiguration inputConfiguration = (InputConfiguration) b11.a();
            v3.h.f(inputConfiguration);
            this.f52792a.createReprocessableCaptureSession(inputConfiguration, f11, cVar, handler);
        } else if (gVar.d() == 1) {
            this.f52792a.createConstrainedHighSpeedCaptureSession(f11, cVar, handler);
        } else {
            e(this.f52792a, f11, cVar, handler);
        }
    }
}