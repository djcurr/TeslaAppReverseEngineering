package t;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.CameraControl;
import androidx.concurrent.futures.b;
import java.util.concurrent.Executor;
import s.a;
import t.s;

/* loaded from: classes.dex */
public class h1 {

    /* renamed from: a  reason: collision with root package name */
    private final s f51040a;

    /* renamed from: b  reason: collision with root package name */
    private final i1 f51041b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f51042c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f51043d = false;

    /* renamed from: e  reason: collision with root package name */
    private b.a<Integer> f51044e;

    /* renamed from: f  reason: collision with root package name */
    private s.c f51045f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h1(s sVar, u.d dVar, Executor executor) {
        this.f51040a = sVar;
        this.f51041b = new i1(dVar, 0);
        this.f51042c = executor;
    }

    private void a() {
        b.a<Integer> aVar = this.f51044e;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            this.f51044e = null;
        }
        s.c cVar = this.f51045f;
        if (cVar != null) {
            this.f51040a.a0(cVar);
            this.f51045f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z11) {
        if (z11 == this.f51043d) {
            return;
        }
        this.f51043d = z11;
        if (z11) {
            return;
        }
        this.f51041b.b(0);
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(a.C1090a c1090a) {
        c1090a.d(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f51041b.a()));
    }
}