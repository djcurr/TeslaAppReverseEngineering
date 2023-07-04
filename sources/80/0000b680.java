package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.n0;
import java.util.ArrayList;
import java.util.List;
import u.a;
import u.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i implements e.a {

    /* renamed from: a  reason: collision with root package name */
    final CameraDevice f52792a;

    /* renamed from: b  reason: collision with root package name */
    final Object f52793b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Handler f52794a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Handler handler) {
            this.f52794a = handler;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(CameraDevice cameraDevice, Object obj) {
        this.f52792a = (CameraDevice) v3.h.f(cameraDevice);
        this.f52793b = obj;
    }

    private static void b(CameraDevice cameraDevice, List<v.b> list) {
        String id2 = cameraDevice.getId();
        for (v.b bVar : list) {
            String a11 = bVar.a();
            if (a11 != null && !a11.isEmpty()) {
                n0.m("CameraDeviceCompat", "Camera " + id2 + ": Camera doesn't support physicalCameraId " + a11 + ". Ignoring.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(CameraDevice cameraDevice, v.g gVar) {
        v3.h.f(cameraDevice);
        v3.h.f(gVar);
        v3.h.f(gVar.e());
        List<v.b> c11 = gVar.c();
        if (c11 != null) {
            if (gVar.a() != null) {
                b(cameraDevice, c11);
                return;
            }
            throw new IllegalArgumentException("Invalid executor");
        }
        throw new IllegalArgumentException("Invalid output configurations");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i d(CameraDevice cameraDevice, Handler handler) {
        return new i(cameraDevice, new a(handler));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Surface> f(List<v.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (v.b bVar : list) {
            arrayList.add(bVar.b());
        }
        return arrayList;
    }

    @Override // u.e.a
    public void a(v.g gVar) {
        c(this.f52792a, gVar);
        if (gVar.b() == null) {
            if (gVar.d() != 1) {
                a.c cVar = new a.c(gVar.a(), gVar.e());
                e(this.f52792a, f(gVar.c()), cVar, ((a) this.f52793b).f52794a);
                return;
            }
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
        throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(CameraDevice cameraDevice, List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) {
        cameraDevice.createCaptureSession(list, stateCallback, handler);
    }
}