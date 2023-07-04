package wn;

import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes2.dex */
public class b extends vn.b implements Observer {

    /* renamed from: d  reason: collision with root package name */
    private final String f56134d;

    /* renamed from: e  reason: collision with root package name */
    private final LatLngBounds f56135e;

    /* renamed from: f  reason: collision with root package name */
    private j f56136f;

    /* renamed from: g  reason: collision with root package name */
    private e f56137g;

    /* renamed from: h  reason: collision with root package name */
    private l f56138h;

    private void g(m mVar) {
        if (e() && Arrays.asList(mVar.a()).contains(a().a())) {
            setChanged();
            notifyObservers();
        }
    }

    public e h() {
        return this.f56137g;
    }

    public MarkerOptions i() {
        throw null;
    }

    public j j() {
        return this.f56136f;
    }

    public PolygonOptions k() {
        throw null;
    }

    public l l() {
        return this.f56138h;
    }

    public PolylineOptions m() {
        throw null;
    }

    public void n(e eVar) {
        throw new IllegalArgumentException("Line string style cannot be null");
    }

    public void o(j jVar) {
        throw new IllegalArgumentException("Point style cannot be null");
    }

    public void p(l lVar) {
        throw new IllegalArgumentException("Polygon style cannot be null");
    }

    public String toString() {
        return "Feature{\n bounding box=" + this.f56135e + ",\n geometry=" + a() + ",\n point style=" + this.f56136f + ",\n line string style=" + this.f56137g + ",\n polygon style=" + this.f56138h + ",\n id=" + this.f56134d + ",\n properties=" + c() + "\n}\n";
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        if (observable instanceof m) {
            g((m) observable);
        }
    }
}