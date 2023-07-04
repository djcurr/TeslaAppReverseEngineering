package vn;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class f implements c {

    /* renamed from: a  reason: collision with root package name */
    private String f54551a = "MultiGeometry";

    /* renamed from: b  reason: collision with root package name */
    private List<c> f54552b;

    public f(List<? extends c> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (c cVar : list) {
                arrayList.add(cVar);
            }
            this.f54552b = arrayList;
            return;
        }
        throw new IllegalArgumentException("Geometries cannot be null");
    }

    @Override // vn.c
    public String a() {
        return this.f54551a;
    }

    @Override // vn.c
    /* renamed from: e */
    public List<c> d() {
        return this.f54552b;
    }

    public String toString() {
        String str = this.f54551a.equals("MultiPoint") ? "LineStrings=" : "Geometries=";
        if (this.f54551a.equals("MultiLineString")) {
            str = "points=";
        }
        if (this.f54551a.equals("MultiPolygon")) {
            str = "Polygons=";
        }
        StringBuilder sb2 = new StringBuilder(a());
        sb2.append("{");
        sb2.append("\n " + str);
        sb2.append(d());
        sb2.append("\n}\n");
        return sb2.toString();
    }
}