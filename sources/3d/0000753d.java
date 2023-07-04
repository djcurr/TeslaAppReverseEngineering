package ic;

import java.util.HashMap;

/* loaded from: classes.dex */
public class r0 extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30341e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30341e = hashMap;
        hashMap.put(0, "Makernote Version");
        hashMap.put(2, "Firmware Version");
        hashMap.put(12, "Trigger Mode");
        hashMap.put(14, "Sequence");
        hashMap.put(18, "Event Number");
        hashMap.put(22, "Date/Time Original");
        hashMap.put(36, "Moon Phase");
        hashMap.put(38, "Ambient Temperature Fahrenheit");
        hashMap.put(40, "Ambient Temperature");
        hashMap.put(42, "Serial Number");
        hashMap.put(72, "Contrast");
        hashMap.put(74, "Brightness");
        hashMap.put(76, "Sharpness");
        hashMap.put(78, "Saturation");
        hashMap.put(80, "Infrared Illuminator");
        hashMap.put(82, "Motion Sensitivity");
        hashMap.put(84, "Battery Voltage");
        hashMap.put(86, "User Label");
    }

    public r0() {
        E(new q0(this));
    }

    @Override // cc.b
    public String n() {
        return "Reconyx HyperFire Makernote";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30341e;
    }
}