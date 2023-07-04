package kc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class d extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f34554e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f34554e = hashMap;
        hashMap.put(1, "Comment");
    }

    public d(cc.f fVar) {
        E(new c(this));
        T(1, fVar);
    }

    @Override // cc.b
    public String n() {
        return "GIF Comment";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f34554e;
    }
}