package tc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class i extends rc.d {

    /* renamed from: f  reason: collision with root package name */
    protected static final HashMap<Integer, String> f51902f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f51902f = hashMap;
        a.V(hashMap);
        hashMap.put(1, "Vertical Placement");
        hashMap.put(2, "Some Samples Forced");
        hashMap.put(3, "All Samples Forced");
        hashMap.put(4, "Default Text Box");
        hashMap.put(5, "Font Identifier");
        hashMap.put(6, "Font Face");
        hashMap.put(7, "Font Size");
        hashMap.put(8, "Foreground Color");
    }

    public i() {
        E(new h(this));
    }

    @Override // rc.d, cc.b
    public String n() {
        return "QuickTime Subtitle";
    }

    @Override // rc.d, cc.b
    protected HashMap<Integer, String> w() {
        return f51902f;
    }
}