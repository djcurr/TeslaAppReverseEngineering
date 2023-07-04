package ic;

import java.util.HashMap;

/* loaded from: classes.dex */
public class b1 extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30319e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30319e = hashMap;
        hashMap.put(2, "Serial Number");
        hashMap.put(3, "Drive Mode");
        hashMap.put(4, "Resolution Mode");
        hashMap.put(5, "Auto Focus Mode");
        hashMap.put(6, "Focus Setting");
        hashMap.put(7, "White Balance");
        hashMap.put(8, "Exposure Mode");
        hashMap.put(9, "Metering Mode");
        hashMap.put(10, "Lens Range");
        hashMap.put(11, "Color Space");
        hashMap.put(12, "Exposure");
        hashMap.put(13, "Contrast");
        hashMap.put(14, "Shadow");
        hashMap.put(15, "Highlight");
        hashMap.put(16, "Saturation");
        hashMap.put(17, "Sharpness");
        hashMap.put(18, "Fill Light");
        hashMap.put(20, "Color Adjustment");
        hashMap.put(21, "Adjustment Mode");
        hashMap.put(22, "Quality");
        hashMap.put(23, "Firmware");
        hashMap.put(24, "Software");
        hashMap.put(25, "Auto Bracket");
    }

    public b1() {
        E(new a1(this));
    }

    @Override // cc.b
    public String n() {
        return "Sigma Makernote";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30319e;
    }
}