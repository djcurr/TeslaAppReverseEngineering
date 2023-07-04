package xn;

import com.google.android.gms.maps.model.GroundOverlay;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, String> f57601a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<j, Object> f57602b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<b> f57603c;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<e, GroundOverlay> f57604d;

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, String> f57605e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap<String, n> f57606f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(HashMap<String, String> hashMap, HashMap<String, n> hashMap2, HashMap<j, Object> hashMap3, HashMap<String, String> hashMap4, ArrayList<b> arrayList, HashMap<e, GroundOverlay> hashMap5, String str) {
        this.f57601a = hashMap;
        this.f57602b = hashMap3;
        this.f57606f = hashMap2;
        this.f57605e = hashMap4;
        this.f57603c = arrayList;
        this.f57604d = hashMap5;
    }

    public Iterable<b> a() {
        return this.f57603c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<e, GroundOverlay> b() {
        return this.f57604d;
    }

    public Iterable<j> c() {
        return this.f57602b.keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<j, Object> d() {
        return this.f57602b;
    }

    public String e(String str) {
        return this.f57601a.get(str);
    }

    public n f(String str) {
        return this.f57606f.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<String, String> g() {
        return this.f57605e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<String, n> h() {
        return this.f57606f;
    }

    public boolean i() {
        return this.f57603c.size() > 0;
    }

    public boolean j(String str) {
        return this.f57601a.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(j jVar, Object obj) {
        this.f57602b.put(jVar, obj);
    }

    public String toString() {
        return "Container{\n properties=" + this.f57601a + ",\n placemarks=" + this.f57602b + ",\n containers=" + this.f57603c + ",\n ground overlays=" + this.f57604d + ",\n style maps=" + this.f57605e + ",\n styles=" + this.f57606f + "\n}\n";
    }
}