package ic;

import java.util.HashMap;

/* loaded from: classes.dex */
public class h0 extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30330e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30330e = hashMap;
        hashMap.put(0, "Raw Dev Version");
        hashMap.put(256, "Raw Dev Exposure Bias Value");
        hashMap.put(257, "Raw Dev White Balance");
        hashMap.put(258, "Raw Dev White Balance Value");
        hashMap.put(259, "Raw Dev WB Fine Adjustment");
        hashMap.put(260, "Raw Dev Gray Point");
        hashMap.put(261, "Raw Dev Contrast Value");
        hashMap.put(262, "Raw Dev Sharpness Value");
        hashMap.put(263, "Raw Dev Saturation Emphasis");
        hashMap.put(264, "Raw Dev Memory Color Emphasis");
        hashMap.put(265, "Raw Dev Color Space");
        hashMap.put(266, "Raw Dev Noise Reduction");
        hashMap.put(267, "Raw Dev Engine");
        hashMap.put(268, "Raw Dev Picture Mode");
        hashMap.put(269, "Raw Dev PM Saturation");
        hashMap.put(270, "Raw Dev PM Contrast");
        hashMap.put(271, "Raw Dev PM Sharpness");
        hashMap.put(272, "Raw Dev PM BW Filter");
        hashMap.put(273, "Raw Dev PM Picture Tone");
        hashMap.put(274, "Raw Dev Gradation");
        hashMap.put(275, "Raw Dev Saturation 3");
        hashMap.put(281, "Raw Dev Auto Gradation");
        hashMap.put(288, "Raw Dev PM Noise Filter");
        hashMap.put(289, "Raw Dev Art Filter");
    }

    public h0() {
        E(new g0(this));
    }

    @Override // cc.b
    public String n() {
        return "Olympus Raw Development 2";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30330e;
    }
}