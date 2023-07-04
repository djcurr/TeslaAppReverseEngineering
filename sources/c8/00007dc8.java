package kc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class b extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f34553e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f34553e = hashMap;
        hashMap.put(1, "Iteration Count");
    }

    public b() {
        E(new a(this));
    }

    @Override // cc.b
    public String n() {
        return "GIF Animation";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f34553e;
    }
}