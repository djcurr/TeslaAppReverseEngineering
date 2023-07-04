package zc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class i extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f60405e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f60405e = hashMap;
        hashMap.put(1, "Channel Count");
        hashMap.put(2, "Image Height");
        hashMap.put(3, "Image Width");
        hashMap.put(4, "Bits Per Channel");
        hashMap.put(5, "Color Mode");
    }

    public i() {
        E(new h(this));
    }

    @Override // cc.b
    public String n() {
        return "PSD Header";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f60405e;
    }
}