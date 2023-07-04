package ic;

import java.util.HashMap;

/* loaded from: classes.dex */
public class t extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30342e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30342e = hashMap;
        hashMap.put(6, "CCD Sensitivity");
        hashMap.put(4, "Color Mode");
        hashMap.put(10, "Digital Zoom");
        hashMap.put(11, "Fisheye Converter");
        hashMap.put(8, "Focus");
        hashMap.put(5, "Image Adjustment");
        hashMap.put(3, "Quality");
        hashMap.put(2, "Makernote Unknown 1");
        hashMap.put(9, "Makernote Unknown 2");
        hashMap.put(3840, "Makernote Unknown 3");
        hashMap.put(7, "White Balance");
    }

    public t() {
        E(new s(this));
    }

    @Override // cc.b
    public String n() {
        return "Nikon Makernote";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30342e;
    }
}