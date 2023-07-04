package kc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class h extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f34557e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f34557e = hashMap;
        hashMap.put(1, "GIF Format Version");
        hashMap.put(3, "Image Height");
        hashMap.put(2, "Image Width");
        hashMap.put(4, "Color Table Size");
        hashMap.put(5, "Is Color Table Sorted");
        hashMap.put(6, "Bits per Pixel");
        hashMap.put(7, "Has Global Color Table");
        hashMap.put(8, "Background Color Index");
        hashMap.put(9, "Pixel Aspect Ratio");
    }

    public h() {
        E(new g(this));
    }

    @Override // cc.b
    public String n() {
        return "GIF Header";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f34557e;
    }
}