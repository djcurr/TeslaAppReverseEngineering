package yc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class b extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f59444e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f59444e = hashMap;
        hashMap.put(1, "Version");
        hashMap.put(2, "Bits Per Pixel");
        hashMap.put(3, "X Min");
        hashMap.put(4, "Y Min");
        hashMap.put(5, "X Max");
        hashMap.put(6, "Y Max");
        hashMap.put(7, "Horizontal DPI");
        hashMap.put(8, "Vertical DPI");
        hashMap.put(9, "Palette");
        hashMap.put(10, "Color Planes");
        hashMap.put(11, "Bytes Per Line");
        hashMap.put(12, "Palette Type");
        hashMap.put(13, "H Scr Size");
        hashMap.put(14, "V Scr Size");
    }

    public b() {
        E(new a(this));
    }

    @Override // cc.b
    public String n() {
        return "PCX";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f59444e;
    }
}