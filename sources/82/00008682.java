package mc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class b extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f38479e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f38479e = hashMap;
        hashMap.put(1, "Image Type");
        hashMap.put(2, "Image Width");
        hashMap.put(3, "Image Height");
        hashMap.put(4, "Colour Palette Size");
        hashMap.put(5, "Colour Planes");
        hashMap.put(6, "Hotspot X");
        hashMap.put(7, "Bits Per Pixel");
        hashMap.put(8, "Hotspot Y");
        hashMap.put(9, "Image Size Bytes");
        hashMap.put(10, "Image Offset Bytes");
    }

    public b() {
        E(new a(this));
    }

    @Override // cc.b
    public String n() {
        return "ICO";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f38479e;
    }
}