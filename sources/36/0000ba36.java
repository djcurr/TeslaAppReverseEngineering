package vn;

import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.Observable;

/* loaded from: classes2.dex */
public abstract class i extends Observable {

    /* renamed from: a  reason: collision with root package name */
    protected MarkerOptions f54571a = new MarkerOptions();

    /* renamed from: b  reason: collision with root package name */
    protected PolylineOptions f54572b = new PolylineOptions();

    /* renamed from: c  reason: collision with root package name */
    protected PolygonOptions f54573c = new PolygonOptions();

    public void b(float f11) {
        this.f54572b.width(f11);
    }

    public void c(float f11, float f12, String str, String str2) {
        if (!str.equals("fraction")) {
            f11 = 0.5f;
        }
        if (!str2.equals("fraction")) {
            f12 = 1.0f;
        }
        this.f54571a.anchor(f11, f12);
    }

    public void d(float f11) {
        this.f54571a.rotation(f11);
    }

    public void e(int i11) {
        this.f54573c.fillColor(i11);
    }

    public void f(float f11) {
        this.f54573c.strokeWidth(f11);
    }
}