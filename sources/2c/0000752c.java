package ic;

import java.util.HashMap;

/* loaded from: classes.dex */
public class j extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30331e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30331e = hashMap;
        hashMap.put(0, "Makernote Version");
        hashMap.put(16, "Serial Number");
        hashMap.put(4096, "Quality");
        hashMap.put(4097, "Sharpness");
        hashMap.put(4098, "White Balance");
        hashMap.put(4099, "Color Saturation");
        hashMap.put(4100, "Tone (Contrast)");
        hashMap.put(4101, "Color Temperature");
        hashMap.put(4102, "Contrast");
        hashMap.put(4106, "White Balance Fine Tune");
        hashMap.put(4107, "Noise Reduction");
        hashMap.put(4110, "High ISO Noise Reduction");
        hashMap.put(4112, "Flash Mode");
        hashMap.put(4113, "Flash Strength");
        hashMap.put(4128, "Macro");
        hashMap.put(4129, "Focus Mode");
        hashMap.put(4131, "Focus Pixel");
        hashMap.put(4144, "Slow Sync");
        hashMap.put(4145, "Picture Mode");
        hashMap.put(4147, "EXR Auto");
        hashMap.put(4148, "EXR Mode");
        hashMap.put(4352, "Auto Bracketing");
        hashMap.put(4353, "Sequence Number");
        hashMap.put(4624, "FinePix Color Setting");
        hashMap.put(4864, "Blur Warning");
        hashMap.put(4865, "Focus Warning");
        hashMap.put(4866, "AE Warning");
        hashMap.put(4868, "GE Image Size");
        hashMap.put(5120, "Dynamic Range");
        hashMap.put(5121, "Film Mode");
        hashMap.put(5122, "Dynamic Range Setting");
        hashMap.put(5123, "Development Dynamic Range");
        hashMap.put(5124, "Minimum Focal Length");
        hashMap.put(5125, "Maximum Focal Length");
        hashMap.put(5126, "Maximum Aperture at Minimum Focal Length");
        hashMap.put(5127, "Maximum Aperture at Maximum Focal Length");
        hashMap.put(5131, "Auto Dynamic Range");
        hashMap.put(16640, "Faces Detected");
        hashMap.put(16643, "Face Positions");
        hashMap.put(17026, "Face Detection Data");
        hashMap.put(32768, "File Source");
        hashMap.put(32770, "Order Number");
        hashMap.put(32771, "Frame Number");
        hashMap.put(45585, "Parallax");
    }

    public j() {
        E(new i(this));
    }

    @Override // cc.b
    public String n() {
        return "Fujifilm Makernote";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30331e;
    }
}