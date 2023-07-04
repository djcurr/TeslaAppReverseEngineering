package ic;

import java.util.HashMap;

/* loaded from: classes.dex */
public class b extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30317e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30317e = hashMap;
        hashMap.put(3, "Run Time");
        hashMap.put(10, "HDR Image Type");
        hashMap.put(11, "Burst UUID");
    }

    public b() {
        E(new a(this));
    }

    @Override // cc.b
    public String n() {
        return "Apple Makernote";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30317e;
    }
}