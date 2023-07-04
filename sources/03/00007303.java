package hc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class z extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f29028e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f29028e = hashMap;
        hashMap.put(0, "PrintIM Version");
    }

    public z() {
        E(new y(this));
    }

    @Override // cc.b
    public String n() {
        return "PrintIM";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f29028e;
    }
}