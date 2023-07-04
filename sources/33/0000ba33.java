package vn;

import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes2.dex */
public class g implements c {

    /* renamed from: a  reason: collision with root package name */
    private final LatLng f54553a;

    public g(LatLng latLng) {
        if (latLng != null) {
            this.f54553a = latLng;
            return;
        }
        throw new IllegalArgumentException("Coordinates cannot be null");
    }

    @Override // vn.c
    public String a() {
        return "Point";
    }

    @Override // vn.c
    /* renamed from: e */
    public LatLng d() {
        return this.f54553a;
    }

    public String toString() {
        return "Point{\n coordinates=" + this.f54553a + "\n}\n";
    }
}