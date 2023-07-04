package ad;

import cc.h;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f375e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f375e = hashMap;
        hashMap.put(1, "White Point X");
        hashMap.put(2, "White Point Y");
        hashMap.put(3, "Red X");
        hashMap.put(4, "Red Y");
        hashMap.put(5, "Green X");
        hashMap.put(6, "Green Y");
        hashMap.put(7, "Blue X");
        hashMap.put(8, "Blue Y");
    }

    public a() {
        E(new h(this));
    }

    @Override // cc.b
    public String n() {
        return "PNG Chromaticities";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f375e;
    }
}