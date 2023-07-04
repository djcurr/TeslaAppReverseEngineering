package ic;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.HashMap;

/* loaded from: classes.dex */
public class z extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30352e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30352e = hashMap;
        hashMap.put(0, "Equipment Version");
        hashMap.put(256, "Camera Type 2");
        hashMap.put(257, "Serial Number");
        hashMap.put(258, "Internal Serial Number");
        hashMap.put(259, "Focal Plane Diagonal");
        hashMap.put(260, "Body Firmware Version");
        hashMap.put(513, "Lens Type");
        hashMap.put(Integer.valueOf((int) SyslogConstants.SYSLOG_PORT), "Lens Serial Number");
        hashMap.put(515, "Lens Model");
        hashMap.put(516, "Lens Firmware Version");
        hashMap.put(517, "Max Aperture At Min Focal");
        hashMap.put(518, "Max Aperture At Max Focal");
        hashMap.put(519, "Min Focal Length");
        hashMap.put(520, "Max Focal Length");
        hashMap.put(522, "Max Aperture");
        hashMap.put(523, "Lens Properties");
        hashMap.put(769, "Extender");
        hashMap.put(770, "Extender Serial Number");
        hashMap.put(771, "Extender Model");
        hashMap.put(772, "Extender Firmware Version");
        hashMap.put(1027, "Conversion Lens");
        hashMap.put(4096, "Flash Type");
        hashMap.put(4097, "Flash Model");
        hashMap.put(4098, "Flash Firmware Version");
        hashMap.put(4099, "Flash Serial Number");
    }

    public z() {
        E(new y(this));
    }

    @Override // cc.b
    public String n() {
        return "Olympus Equipment";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30352e;
    }
}