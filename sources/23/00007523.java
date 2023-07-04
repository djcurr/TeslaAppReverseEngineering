package ic;

import java.util.HashMap;

/* loaded from: classes.dex */
public class f extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30324e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30324e = hashMap;
        hashMap.put(20, "CCD Sensitivity");
        hashMap.put(12, "Contrast");
        hashMap.put(10, "Digital Zoom");
        hashMap.put(5, "Flash Intensity");
        hashMap.put(4, "Flash Mode");
        hashMap.put(3, "Focusing Mode");
        hashMap.put(6, "Object Distance");
        hashMap.put(2, "Quality");
        hashMap.put(1, "Recording Mode");
        hashMap.put(13, "Saturation");
        hashMap.put(11, "Sharpness");
        hashMap.put(8, "Makernote Unknown 1");
        hashMap.put(9, "Makernote Unknown 2");
        hashMap.put(14, "Makernote Unknown 3");
        hashMap.put(15, "Makernote Unknown 4");
        hashMap.put(16, "Makernote Unknown 5");
        hashMap.put(17, "Makernote Unknown 6");
        hashMap.put(18, "Makernote Unknown 7");
        hashMap.put(19, "Makernote Unknown 8");
        hashMap.put(7, "White Balance");
    }

    public f() {
        E(new e(this));
    }

    @Override // cc.b
    public String n() {
        return "Casio Makernote";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30324e;
    }
}