package t;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.d0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import y.j;

/* loaded from: classes.dex */
class n0 {
    private static void a(CaptureRequest.Builder builder, androidx.camera.core.impl.d0 d0Var) {
        y.j d11 = j.a.e(d0Var).d();
        for (d0.a<?> aVar : d11.e()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.d();
            try {
                builder.set(key, d11.a(aVar));
            } catch (IllegalArgumentException unused) {
                androidx.camera.core.n0.c("CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static CaptureRequest b(androidx.camera.core.impl.a0 a0Var, CameraDevice cameraDevice, Map<DeferrableSurface, Surface> map) {
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> d11 = d(a0Var.d(), map);
        if (d11.isEmpty()) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(a0Var.f());
        a(createCaptureRequest, a0Var.c());
        androidx.camera.core.impl.d0 c11 = a0Var.c();
        d0.a<Integer> aVar = androidx.camera.core.impl.a0.f2255g;
        if (c11.b(aVar)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) a0Var.c().a(aVar));
        }
        androidx.camera.core.impl.d0 c12 = a0Var.c();
        d0.a<Integer> aVar2 = androidx.camera.core.impl.a0.f2256h;
        if (c12.b(aVar2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) a0Var.c().a(aVar2)).byteValue()));
        }
        for (Surface surface : d11) {
            createCaptureRequest.addTarget(surface);
        }
        createCaptureRequest.setTag(a0Var.e());
        return createCaptureRequest.build();
    }

    public static CaptureRequest c(androidx.camera.core.impl.a0 a0Var, CameraDevice cameraDevice) {
        if (cameraDevice == null) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(a0Var.f());
        a(createCaptureRequest, a0Var.c());
        return createCaptureRequest.build();
    }

    private static List<Surface> d(List<DeferrableSurface> list, Map<DeferrableSurface, Surface> map) {
        ArrayList arrayList = new ArrayList();
        for (DeferrableSurface deferrableSurface : list) {
            Surface surface = map.get(deferrableSurface);
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        return arrayList;
    }
}