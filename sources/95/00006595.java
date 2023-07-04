package dd;

import java.util.HashMap;

/* loaded from: classes.dex */
public class b extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f23914e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f23914e = hashMap;
        hashMap.put(1, "Image Height");
        hashMap.put(2, "Image Width");
        hashMap.put(3, "Has Alpha");
        hashMap.put(4, "Is Animation");
    }

    public b() {
        E(new a(this));
    }

    @Override // cc.b
    public String n() {
        return "WebP";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f23914e;
    }
}