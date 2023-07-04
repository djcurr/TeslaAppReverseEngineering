package ic;

import java.util.HashMap;

/* loaded from: classes.dex */
public class p extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30338e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30338e = hashMap;
        hashMap.put(768, "Quality");
        hashMap.put(770, "User Profile");
        hashMap.put(771, "Serial Number");
        hashMap.put(772, "White Balance");
        hashMap.put(784, "Lens Type");
        hashMap.put(785, "External Sensor Brightness Value");
        hashMap.put(786, "Measured LV");
        hashMap.put(787, "Approximate F Number");
        hashMap.put(800, "Camera Temperature");
        hashMap.put(801, "Color Temperature");
        hashMap.put(802, "WB Red Level");
        hashMap.put(803, "WB Green Level");
        hashMap.put(804, "WB Blue Level");
        hashMap.put(816, "CCD Version");
        hashMap.put(817, "CCD Board Version");
        hashMap.put(818, "Controller Board Version");
        hashMap.put(819, "M16 C Version");
        hashMap.put(832, "Image ID Number");
    }

    public p() {
        E(new o(this));
    }

    @Override // cc.b
    public String n() {
        return "Leica Makernote";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30338e;
    }
}