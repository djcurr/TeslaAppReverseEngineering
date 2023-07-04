package rc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class d extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f49340e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f49340e = hashMap;
        hashMap.put(4096, "Major Brand");
        hashMap.put(4097, "Minor Version");
        hashMap.put(4098, "Compatible Brands");
        hashMap.put(256, "Creation Time");
        hashMap.put(257, "Modification Time");
        hashMap.put(258, "Media Time Scale");
        hashMap.put(259, "Duration");
        hashMap.put(260, "Preferred Rate");
        hashMap.put(261, "Preferred Volume");
        hashMap.put(264, "Preview Time");
        hashMap.put(265, "Preview Duration");
        hashMap.put(266, "Poster Time");
        hashMap.put(267, "Selection Time");
        hashMap.put(268, "Selection Duration");
        hashMap.put(269, "Current Time");
        hashMap.put(270, "Next Track ID");
        hashMap.put(774, "Media Time Scale");
    }

    public d() {
        E(new b(this));
    }

    @Override // cc.b
    public String n() {
        return "QuickTime";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f49340e;
    }
}