package u;

import android.hardware.camera2.CameraCharacteristics;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Map<CameraCharacteristics.Key<?>, Object> f52778a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final CameraCharacteristics f52779b;

    private d(CameraCharacteristics cameraCharacteristics) {
        this.f52779b = cameraCharacteristics;
    }

    public static d b(CameraCharacteristics cameraCharacteristics) {
        return new d(cameraCharacteristics);
    }

    public <T> T a(CameraCharacteristics.Key<T> key) {
        synchronized (this) {
            T t11 = (T) this.f52778a.get(key);
            if (t11 != null) {
                return t11;
            }
            T t12 = (T) this.f52779b.get(key);
            if (t12 != null) {
                this.f52778a.put(key, t12);
            }
            return t12;
        }
    }
}