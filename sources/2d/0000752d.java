package ic;

import java.util.HashMap;

/* loaded from: classes.dex */
public class j0 extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30332e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30332e = hashMap;
        hashMap.put(0, "Raw Dev Version");
        hashMap.put(256, "Raw Dev Exposure Bias Value");
        hashMap.put(257, "Raw Dev White Balance Value");
        hashMap.put(258, "Raw Dev WB Fine Adjustment");
        hashMap.put(259, "Raw Dev Gray Point");
        hashMap.put(260, "Raw Dev Saturation Emphasis");
        hashMap.put(261, "Raw Dev Memory Color Emphasis");
        hashMap.put(262, "Raw Dev Contrast Value");
        hashMap.put(263, "Raw Dev Sharpness Value");
        hashMap.put(264, "Raw Dev Color Space");
        hashMap.put(265, "Raw Dev Engine");
        hashMap.put(266, "Raw Dev Noise Reduction");
        hashMap.put(267, "Raw Dev Edit Status");
        hashMap.put(268, "Raw Dev Settings");
    }

    public j0() {
        E(new i0(this));
    }

    @Override // cc.b
    public String n() {
        return "Olympus Raw Development";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30332e;
    }
}