package kc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class j extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f34558e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f34558e = hashMap;
        hashMap.put(1, "Left");
        hashMap.put(2, "Top");
        hashMap.put(3, "Width");
        hashMap.put(4, "Height");
        hashMap.put(5, "Has Local Colour Table");
        hashMap.put(6, "Is Interlaced");
        hashMap.put(7, "Is Local Colour Table Sorted");
        hashMap.put(8, "Local Colour Table Bits Per Pixel");
    }

    public j() {
        E(new i(this));
    }

    @Override // cc.b
    public String n() {
        return "GIF Image";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f34558e;
    }
}