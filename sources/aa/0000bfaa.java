package xn;

import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f57607a;

    /* renamed from: b  reason: collision with root package name */
    private final GroundOverlayOptions f57608b;

    /* renamed from: c  reason: collision with root package name */
    private String f57609c;

    /* renamed from: d  reason: collision with root package name */
    private LatLngBounds f57610d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String str, LatLngBounds latLngBounds, float f11, int i11, HashMap<String, String> hashMap, float f12) {
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
        this.f57608b = groundOverlayOptions;
        this.f57609c = str;
        this.f57607a = hashMap;
        if (latLngBounds != null) {
            this.f57610d = latLngBounds;
            groundOverlayOptions.positionFromBounds(latLngBounds);
            groundOverlayOptions.bearing(f12);
            groundOverlayOptions.zIndex(f11);
            groundOverlayOptions.visible(i11 != 0);
            return;
        }
        throw new IllegalArgumentException("No LatLonBox given");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GroundOverlayOptions a() {
        return this.f57608b;
    }

    public String b() {
        return this.f57609c;
    }

    public LatLngBounds c() {
        return this.f57610d;
    }

    public String toString() {
        return "GroundOverlay{\n properties=" + this.f57607a + ",\n image url=" + this.f57609c + ",\n LatLngBox=" + this.f57610d + "\n}\n";
    }
}