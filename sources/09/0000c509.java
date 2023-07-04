package zn;

import bo.a;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes2.dex */
public class c implements a.InterfaceC0154a {

    /* renamed from: c  reason: collision with root package name */
    private static final ao.b f60557c = new ao.b(1.0d);

    /* renamed from: a  reason: collision with root package name */
    private yn.b f60558a;

    /* renamed from: b  reason: collision with root package name */
    private double f60559b;

    public c(LatLng latLng, double d11) {
        this.f60558a = f60557c.a(latLng);
        if (d11 >= 0.0d) {
            this.f60559b = d11;
        } else {
            this.f60559b = 1.0d;
        }
    }

    @Override // bo.a.InterfaceC0154a
    public yn.b a() {
        return this.f60558a;
    }

    public double b() {
        return this.f60559b;
    }

    public c(LatLng latLng) {
        this(latLng, 1.0d);
    }
}