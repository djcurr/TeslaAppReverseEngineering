package xn;

import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class j extends vn.b {

    /* renamed from: d  reason: collision with root package name */
    private final String f57617d;

    /* renamed from: e  reason: collision with root package name */
    private final n f57618e;

    public j(vn.c cVar, String str, n nVar, HashMap<String, String> hashMap) {
        super(cVar, str, hashMap);
        this.f57617d = str;
        this.f57618e = nVar;
    }

    public n g() {
        return this.f57618e;
    }

    public MarkerOptions h() {
        return this.f57618e.p();
    }

    public PolygonOptions i() {
        return this.f57618e.q();
    }

    public PolylineOptions j() {
        return this.f57618e.r();
    }

    public String k() {
        return super.b();
    }

    public String toString() {
        return "Placemark{\n style id=" + this.f57617d + ",\n inline style=" + this.f57618e + "\n}\n";
    }
}