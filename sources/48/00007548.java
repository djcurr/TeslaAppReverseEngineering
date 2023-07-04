package ic;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.HashMap;

/* loaded from: classes.dex */
public class x extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30348e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30348e = hashMap;
        hashMap.put(0, "Camera Settings Version");
        hashMap.put(256, "Preview Image Valid");
        hashMap.put(257, "Preview Image Start");
        hashMap.put(258, "Preview Image Length");
        hashMap.put(512, "Exposure Mode");
        hashMap.put(513, "AE Lock");
        hashMap.put(Integer.valueOf((int) SyslogConstants.SYSLOG_PORT), "Metering Mode");
        hashMap.put(515, "Exposure Shift");
        hashMap.put(516, "ND Filter");
        hashMap.put(768, "Macro Mode");
        hashMap.put(769, "Focus Mode");
        hashMap.put(770, "Focus Process");
        hashMap.put(771, "AF Search");
        hashMap.put(772, "AF Areas");
        hashMap.put(773, "AF Point Selected");
        hashMap.put(774, "AF Fine Tune");
        hashMap.put(775, "AF Fine Tune Adj");
        hashMap.put(1024, "Flash Mode");
        hashMap.put(1025, "Flash Exposure Comp");
        hashMap.put(1027, "Flash Remote Control");
        hashMap.put(1028, "Flash Control Mode");
        hashMap.put(1029, "Flash Intensity");
        hashMap.put(1030, "Manual Flash Strength");
        hashMap.put(1280, "White Balance 2");
        hashMap.put(1281, "White Balance Temperature");
        hashMap.put(1282, "White Balance Bracket");
        hashMap.put(1283, "Custom Saturation");
        hashMap.put(1284, "Modified Saturation");
        hashMap.put(1285, "Contrast Setting");
        hashMap.put(1286, "Sharpness Setting");
        hashMap.put(1287, "Color Space");
        hashMap.put(1289, "Scene Mode");
        hashMap.put(1290, "Noise Reduction");
        hashMap.put(1291, "Distortion Correction");
        hashMap.put(1292, "Shading Compensation");
        hashMap.put(1293, "Compression Factor");
        hashMap.put(1295, "Gradation");
        hashMap.put(1312, "Picture Mode");
        hashMap.put(1313, "Picture Mode Saturation");
        hashMap.put(1314, "Picture Mode Hue");
        hashMap.put(1315, "Picture Mode Contrast");
        hashMap.put(1316, "Picture Mode Sharpness");
        hashMap.put(1317, "Picture Mode BW Filter");
        hashMap.put(1318, "Picture Mode Tone");
        hashMap.put(1319, "Noise Filter");
        hashMap.put(1321, "Art Filter");
        hashMap.put(1324, "Magic Filter");
        hashMap.put(1325, "Picture Mode Effect");
        hashMap.put(1326, "Tone Level");
        hashMap.put(1327, "Art Filter Effect");
        hashMap.put(1330, "Color Creator Effect");
        hashMap.put(1536, "Drive Mode");
        hashMap.put(1537, "Panorama Mode");
        hashMap.put(1539, "Image Quality 2");
        hashMap.put(1540, "Image Stabilization");
        hashMap.put(2052, "Stacked Image");
        hashMap.put(2304, "Manometer Pressure");
        hashMap.put(2305, "Manometer Reading");
        hashMap.put(2306, "Extended WB Detect");
        hashMap.put(2307, "Roll Angle");
        hashMap.put(2308, "Pitch Angle");
        hashMap.put(2312, "Date Time UTC");
    }

    public x() {
        E(new w(this));
    }

    @Override // cc.b
    public String n() {
        return "Olympus Camera Settings";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30348e;
    }
}