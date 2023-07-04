package zc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class a extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f60401e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f60401e = hashMap;
        hashMap.put(1, "Quality");
        hashMap.put(2, "Comment");
        hashMap.put(3, "Copyright");
    }

    public a() {
        E(new cc.h(this));
    }

    @Override // cc.b
    public String n() {
        return "Ducky";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f60401e;
    }
}