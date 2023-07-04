package xn;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class h extends vn.f {
    public h(ArrayList<vn.c> arrayList) {
        super(arrayList);
    }

    @Override // vn.f
    /* renamed from: f */
    public ArrayList<vn.c> e() {
        return new ArrayList<>(super.d());
    }

    @Override // vn.f
    public String toString() {
        return a() + "{\n geometries=" + e() + "\n}\n";
    }
}