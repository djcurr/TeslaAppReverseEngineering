package t;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class z0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static CameraCaptureSession.CaptureCallback a(androidx.camera.core.impl.e eVar) {
        if (eVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b(eVar, arrayList);
        if (arrayList.size() == 1) {
            return (CameraCaptureSession.CaptureCallback) arrayList.get(0);
        }
        return l0.a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(androidx.camera.core.impl.e eVar, List<CameraCaptureSession.CaptureCallback> list) {
        if (eVar instanceof androidx.camera.core.impl.f) {
            for (androidx.camera.core.impl.e eVar2 : ((androidx.camera.core.impl.f) eVar).d()) {
                b(eVar2, list);
            }
        } else if (eVar instanceof y0) {
            list.add(((y0) eVar).e());
        } else {
            list.add(new x0(eVar));
        }
    }
}