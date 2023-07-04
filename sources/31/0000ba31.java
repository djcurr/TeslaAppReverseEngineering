package vn;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* loaded from: classes2.dex */
public class e implements c<List<LatLng>> {

    /* renamed from: a  reason: collision with root package name */
    private final List<LatLng> f54550a;

    public e(List<LatLng> list) {
        if (list != null) {
            this.f54550a = list;
            return;
        }
        throw new IllegalArgumentException("Coordinates cannot be null");
    }

    @Override // vn.c
    public String a() {
        return "LineString";
    }

    @Override // vn.c
    /* renamed from: e */
    public List<LatLng> d() {
        return this.f54550a;
    }

    public String toString() {
        return "LineString{\n coordinates=" + this.f54550a + "\n}\n";
    }
}