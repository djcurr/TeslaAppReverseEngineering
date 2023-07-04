package ao;

import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    final double f6707a;

    public b(double d11) {
        this.f6707a = d11;
    }

    public a a(LatLng latLng) {
        double sin = Math.sin(Math.toRadians(latLng.latitude));
        double d11 = this.f6707a;
        return new a(((latLng.longitude / 360.0d) + 0.5d) * d11, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * d11);
    }
}