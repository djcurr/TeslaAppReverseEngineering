package ic;

import java.util.HashMap;

/* loaded from: classes.dex */
public class d0 extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30322e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30322e = hashMap;
        hashMap.put(0, "Image Processing Version");
        hashMap.put(256, "WB RB Levels");
        hashMap.put(258, "WB RB Levels 3000K");
        hashMap.put(259, "WB RB Levels 3300K");
        hashMap.put(260, "WB RB Levels 3600K");
        hashMap.put(261, "WB RB Levels 3900K");
        hashMap.put(262, "WB RB Levels 4000K");
        hashMap.put(263, "WB RB Levels 4300K");
        hashMap.put(264, "WB RB Levels 4500K");
        hashMap.put(265, "WB RB Levels 4800K");
        hashMap.put(266, "WB RB Levels 5300K");
        hashMap.put(267, "WB RB Levels 6000K");
        hashMap.put(268, "WB RB Levels 6600K");
        hashMap.put(269, "WB RB Levels 7500K");
        hashMap.put(270, "WB RB Levels CWB1");
        hashMap.put(271, "WB RB Levels CWB2");
        hashMap.put(272, "WB RB Levels CWB3");
        hashMap.put(273, "WB RB Levels CWB4");
        hashMap.put(275, "WB G Level 3000K");
        hashMap.put(276, "WB G Level 3300K");
        hashMap.put(277, "WB G Level 3600K");
        hashMap.put(278, "WB G Level 3900K");
        hashMap.put(279, "WB G Level 4000K");
        hashMap.put(280, "WB G Level 4300K");
        hashMap.put(281, "WB G Level 4500K");
        hashMap.put(282, "WB G Level 4800K");
        hashMap.put(283, "WB G Level 5300K");
        hashMap.put(284, "WB G Level 6000K");
        hashMap.put(285, "WB G Level 6600K");
        hashMap.put(286, "WB G Level 7500K");
        hashMap.put(287, "WB G Level");
        hashMap.put(512, "Color Matrix");
        hashMap.put(768, "Enhancer");
        hashMap.put(769, "Enhancer Values");
        hashMap.put(784, "Coring Filter");
        hashMap.put(785, "Coring Values");
        hashMap.put(1536, "Black Level 2");
        hashMap.put(1552, "Gain Base");
        hashMap.put(1553, "Valid Bits");
        hashMap.put(1554, "Crop Left");
        hashMap.put(1555, "Crop Top");
        hashMap.put(1556, "Crop Width");
        hashMap.put(1557, "Crop Height");
        hashMap.put(1589, "Unknown Block 1");
        hashMap.put(1590, "Unknown Block 2");
        hashMap.put(2053, "Sensor Calibration");
        hashMap.put(4112, "Noise Reduction 2");
        hashMap.put(4113, "Distortion Correction 2");
        hashMap.put(4114, "Shading Compensation 2");
        hashMap.put(4124, "Multiple Exposure Mode");
        hashMap.put(4355, "Unknown Block 3");
        hashMap.put(4356, "Unknown Block 4");
        hashMap.put(4370, "Aspect Ratio");
        hashMap.put(4371, "Aspect Frame");
        hashMap.put(4608, "Faces Detected");
        hashMap.put(4609, "Face Detect Area");
        hashMap.put(4610, "Max Faces");
        hashMap.put(4611, "Face Detect Frame Size");
        hashMap.put(4615, "Face Detect Frame Crop");
        hashMap.put(4870, "Camera Temperature");
        hashMap.put(6400, "Keystone Compensation");
        hashMap.put(6401, "Keystone Direction");
        hashMap.put(6406, "Keystone Value");
    }

    public d0() {
        E(new c0(this));
    }

    @Override // cc.b
    public String n() {
        return "Olympus Image Processing";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30322e;
    }
}