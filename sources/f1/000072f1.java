package hc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class h extends b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f29020e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f29020e = hashMap;
        b.V(hashMap);
    }

    public h() {
        E(new g(this));
    }

    @Override // cc.b
    public String n() {
        return "Interoperability";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f29020e;
    }
}