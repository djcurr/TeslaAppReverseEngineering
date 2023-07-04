package dc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class b extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    private static final HashMap<Integer, String> f23913e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f23913e = hashMap;
        hashMap.put(0, "DCT Encode Version");
        hashMap.put(1, "Flags 0");
        hashMap.put(2, "Flags 1");
        hashMap.put(3, "Color Transform");
    }

    public b() {
        E(new a(this));
    }

    @Override // cc.b
    public String n() {
        return "Adobe JPEG";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f23913e;
    }
}