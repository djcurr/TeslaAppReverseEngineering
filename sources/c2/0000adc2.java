package qc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class i extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f48051e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f48051e = hashMap;
        hashMap.put(-3, "Compression Type");
        hashMap.put(0, "Data Precision");
        hashMap.put(3, "Image Width");
        hashMap.put(1, "Image Height");
        hashMap.put(5, "Number of Components");
        hashMap.put(6, "Component 1");
        hashMap.put(7, "Component 2");
        hashMap.put(8, "Component 3");
        hashMap.put(9, "Component 4");
    }

    public i() {
        E(new g(this));
    }

    public f V(int i11) {
        return (f) o(i11 + 6);
    }

    @Override // cc.b
    public String n() {
        return "JPEG";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f48051e;
    }
}