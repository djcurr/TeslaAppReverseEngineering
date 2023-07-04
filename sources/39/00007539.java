package ic;

import java.util.HashMap;

/* loaded from: classes.dex */
public class p0 extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30339e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30339e = hashMap;
        hashMap.put(1, "Capture Mode");
        hashMap.put(2, "Quality Level");
        hashMap.put(3, "Focus Mode");
        hashMap.put(4, "Flash Mode");
        hashMap.put(7, "White Balance");
        hashMap.put(10, "Digital Zoom");
        hashMap.put(11, "Sharpness");
        hashMap.put(12, "Contrast");
        hashMap.put(13, "Saturation");
        hashMap.put(20, "ISO Speed");
        hashMap.put(23, "Colour");
        hashMap.put(3584, "Print Image Matching (PIM) Info");
        hashMap.put(4096, "Time Zone");
        hashMap.put(4097, "Daylight Savings");
    }

    public p0() {
        E(new o0(this));
    }

    @Override // cc.b
    public String n() {
        return "Pentax Makernote";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30339e;
    }
}