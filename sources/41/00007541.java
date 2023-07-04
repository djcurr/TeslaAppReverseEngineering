package ic;

import java.util.HashMap;

/* loaded from: classes.dex */
public class t0 extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30343e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30343e = hashMap;
        hashMap.put(0, "Makernote Label");
        hashMap.put(10, "Makernote ID");
        hashMap.put(14, "Makernote Size");
        hashMap.put(18, "Makernote Public ID");
        hashMap.put(22, "Makernote Public Size");
        hashMap.put(24, "Camera Version");
        hashMap.put(31, "Uib Version");
        hashMap.put(38, "Btl Version");
        hashMap.put(45, "Pex Version");
        hashMap.put(52, "Event Type");
        hashMap.put(53, "Sequence");
        hashMap.put(55, "Event Number");
        hashMap.put(59, "Date/Time Original");
        hashMap.put(66, "Day of Week");
        hashMap.put(67, "Moon Phase");
        hashMap.put(68, "Ambient Temperature Fahrenheit");
        hashMap.put(70, "Ambient Temperature");
        hashMap.put(72, "Flash");
        hashMap.put(73, "Battery Voltage");
        hashMap.put(75, "Serial Number");
        hashMap.put(80, "User Label");
    }

    public t0() {
        E(new s0(this));
    }

    @Override // cc.b
    public String n() {
        return "Reconyx UltraFire Makernote";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30343e;
    }
}