package xn;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class l implements vn.a<ArrayList<ArrayList<LatLng>>> {

    /* renamed from: a  reason: collision with root package name */
    private final List<LatLng> f57619a;

    /* renamed from: b  reason: collision with root package name */
    private final List<List<LatLng>> f57620b;

    public l(List<LatLng> list, List<List<LatLng>> list2) {
        if (list != null) {
            this.f57619a = list;
            this.f57620b = list2;
            return;
        }
        throw new IllegalArgumentException("Outer boundary coordinates cannot be null");
    }

    @Override // vn.c
    public String a() {
        return "Polygon";
    }

    @Override // vn.a
    public List<LatLng> b() {
        return this.f57619a;
    }

    @Override // vn.a
    public List<List<LatLng>> c() {
        return this.f57620b;
    }

    @Override // vn.c
    /* renamed from: e */
    public List<List<LatLng>> d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f57619a);
        List<List<LatLng>> list = this.f57620b;
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public String toString() {
        return "Polygon{\n outer coordinates=" + this.f57619a + ",\n inner coordinates=" + this.f57620b + "\n}\n";
    }
}