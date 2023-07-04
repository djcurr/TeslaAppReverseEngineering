package hc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class x extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f29027e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f29027e = hashMap;
        hashMap.put(0, "Num WB Entries");
        hashMap.put(1, "WB Type 1");
        hashMap.put(2, "WB RGB Levels 1");
        hashMap.put(4, "WB Type 2");
        hashMap.put(5, "WB RGB Levels 2");
        hashMap.put(7, "WB Type 3");
        hashMap.put(8, "WB RGB Levels 3");
        hashMap.put(10, "WB Type 4");
        hashMap.put(11, "WB RGB Levels 4");
        hashMap.put(13, "WB Type 5");
        hashMap.put(14, "WB RGB Levels 5");
        hashMap.put(16, "WB Type 6");
        hashMap.put(17, "WB RGB Levels 6");
        hashMap.put(19, "WB Type 7");
        hashMap.put(20, "WB RGB Levels 7");
    }

    public x() {
        E(new w(this));
    }

    @Override // cc.b
    public String n() {
        return "PanasonicRaw WbInfo";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f29027e;
    }
}