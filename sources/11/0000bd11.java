package wn;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class k implements vn.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<? extends List<LatLng>> f56139a;

    @Override // vn.c
    public String a() {
        return i();
    }

    public List<? extends List<LatLng>> e() {
        return this.f56139a;
    }

    @Override // vn.c
    /* renamed from: f */
    public List<? extends List<LatLng>> d() {
        return e();
    }

    @Override // vn.a
    /* renamed from: g */
    public ArrayList<ArrayList<LatLng>> c() {
        ArrayList<ArrayList<LatLng>> arrayList = new ArrayList<>();
        for (int i11 = 1; i11 < e().size(); i11++) {
            arrayList.add((ArrayList) e().get(i11));
        }
        return arrayList;
    }

    @Override // vn.a
    /* renamed from: h */
    public ArrayList<LatLng> b() {
        return (ArrayList) e().get(0);
    }

    public String i() {
        return "Polygon";
    }

    public String toString() {
        return "Polygon{\n coordinates=" + this.f56139a + "\n}\n";
    }
}