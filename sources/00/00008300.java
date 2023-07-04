package lc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class b extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f37157e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f37157e = hashMap;
        hashMap.put(0, "Profile Size");
        hashMap.put(4, "CMM Type");
        hashMap.put(8, "Version");
        hashMap.put(12, "Class");
        hashMap.put(16, "Color space");
        hashMap.put(20, "Profile Connection Space");
        hashMap.put(24, "Profile Date/Time");
        hashMap.put(36, "Signature");
        hashMap.put(40, "Primary Platform");
        hashMap.put(44, "CMM Flags");
        hashMap.put(48, "Device manufacturer");
        hashMap.put(52, "Device model");
        hashMap.put(56, "Device attributes");
        hashMap.put(64, "Rendering Intent");
        hashMap.put(68, "XYZ values");
        hashMap.put(80, "Profile Creator");
        hashMap.put(128, "Tag Count");
        hashMap.put(1093812784, "AToB 0");
        hashMap.put(1093812785, "AToB 1");
        hashMap.put(1093812786, "AToB 2");
        hashMap.put(1649957210, "Blue Colorant");
        hashMap.put(1649693251, "Blue TRC");
        hashMap.put(1110589744, "BToA 0");
        hashMap.put(1110589745, "BToA 1");
        hashMap.put(1110589746, "BToA 2");
        hashMap.put(1667329140, "Calibration Date/Time");
        hashMap.put(1952543335, "Char Target");
        hashMap.put(1667785060, "Chromatic Adaptation");
        hashMap.put(1667789421, "Chromaticity");
        hashMap.put(1668313716, "Copyright");
        hashMap.put(1668441193, "CrdInfo");
        hashMap.put(1684893284, "Device Mfg Description");
        hashMap.put(1684890724, "Device Model Description");
        hashMap.put(1684371059, "Device Settings");
        hashMap.put(1734438260, "Gamut");
        hashMap.put(1800688195, "Gray TRC");
        hashMap.put(1733843290, "Green Colorant");
        hashMap.put(1733579331, "Green TRC");
        hashMap.put(1819635049, "Luminance");
        hashMap.put(1835360627, "Measurement");
        hashMap.put(1651208308, "Media Black Point");
        hashMap.put(2004119668, "Media White Point");
        hashMap.put(1852010348, "Named Color");
        hashMap.put(1852009522, "Named Color 2");
        hashMap.put(1919251312, "Output Response");
        hashMap.put(1886545200, "Preview 0");
        hashMap.put(1886545201, "Preview 1");
        hashMap.put(1886545202, "Preview 2");
        hashMap.put(1684370275, "Profile Description");
        hashMap.put(1886610801, "Profile Sequence Description");
        hashMap.put(1886610480, "Ps2 CRD 0");
        hashMap.put(1886610481, "Ps2 CRD 1");
        hashMap.put(1886610482, "Ps2 CRD 2");
        hashMap.put(1886610483, "Ps2 CRD 3");
        hashMap.put(1886597747, "Ps2 CSA");
        hashMap.put(1886597737, "Ps2 Rendering Intent");
        hashMap.put(1918392666, "Red Colorant");
        hashMap.put(1918128707, "Red TRC");
        hashMap.put(1935897188, "Screening Desc");
        hashMap.put(1935897198, "Screening");
        hashMap.put(1952801640, "Technology");
        hashMap.put(1650877472, "Ucrbg");
        hashMap.put(1987405156, "Viewing Conditions Description");
        hashMap.put(1986618743, "Viewing Conditions");
        hashMap.put(1685283693, "Apple Multi-language Profile Name");
    }

    public b() {
        E(new a(this));
    }

    @Override // cc.b
    public String n() {
        return "ICC Profile";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f37157e;
    }
}