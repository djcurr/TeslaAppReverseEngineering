package ic;

import java.util.HashMap;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public class d1 extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30323e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30323e = hashMap;
        hashMap.put(16, "Camera Info");
        hashMap.put(32, "Focus Info");
        hashMap.put(258, "Image Quality");
        hashMap.put(260, "Flash Exposure Compensation");
        hashMap.put(261, "Teleconverter Model");
        hashMap.put(274, "White Balance Fine Tune Value");
        hashMap.put(276, "Camera Settings");
        hashMap.put(277, "White Balance");
        hashMap.put(278, "Extra Info");
        hashMap.put(3584, "Print Image Matching (PIM) Info");
        hashMap.put(4096, "Multi Burst Mode");
        hashMap.put(4097, "Multi Burst Image Width");
        hashMap.put(4098, "Multi Burst Image Height");
        hashMap.put(4099, "Panorama");
        hashMap.put(8193, "Preview Image");
        hashMap.put(8194, "Rating");
        hashMap.put(8196, "Contrast");
        hashMap.put(8197, "Saturation");
        hashMap.put(8198, "Sharpness");
        hashMap.put(8199, "Brightness");
        hashMap.put(8200, "Long Exposure Noise Reduction");
        hashMap.put(8201, "High ISO Noise Reduction");
        hashMap.put(8202, "HDR");
        hashMap.put(8203, "Multi Frame Noise Reduction");
        hashMap.put(8206, "Picture Effect");
        hashMap.put(8207, "Soft Skin Effect");
        hashMap.put(8209, "Vignetting Correction");
        hashMap.put(8210, "Lateral Chromatic Aberration");
        hashMap.put(8211, "Distortion Correction");
        hashMap.put(8212, "WB Shift Amber/Magenta");
        hashMap.put(8214, "Auto Portrait Framing");
        hashMap.put(8219, "Focus Mode");
        hashMap.put(8222, "AF Point Selected");
        hashMap.put(12288, "Shot Info");
        hashMap.put(45056, "File Format");
        hashMap.put(45057, "Sony Model ID");
        hashMap.put(45088, "Color Mode Setting");
        hashMap.put(45089, "Color Temperature");
        hashMap.put(45090, "Color Compensation Filter");
        hashMap.put(45091, "Scene Mode");
        hashMap.put(45092, "Zone Matching");
        hashMap.put(45093, "Dynamic Range Optimizer");
        hashMap.put(45094, "Image Stabilisation");
        hashMap.put(45095, "Lens ID");
        hashMap.put(45096, "Minolta Makernote");
        hashMap.put(45097, "Color Mode");
        hashMap.put(45098, "Lens Spec");
        hashMap.put(45099, "Full Image Size");
        hashMap.put(45100, "Preview Image Size");
        hashMap.put(45120, "Macro");
        hashMap.put(45121, "Exposure Mode");
        hashMap.put(45122, "Focus Mode");
        hashMap.put(45123, "AF Mode");
        hashMap.put(45124, "AF Illuminator");
        hashMap.put(45127, "Quality");
        hashMap.put(45128, "Flash Level");
        hashMap.put(45129, "Release Mode");
        hashMap.put(45130, "Sequence Number");
        hashMap.put(45131, "Anti Blur");
        hashMap.put(45134, "Long Exposure Noise Reduction");
        hashMap.put(45135, "Dynamic Range Optimizer");
        hashMap.put(45136, "High ISO Noise Reduction");
        hashMap.put(45138, "Intelligent Auto");
        hashMap.put(45140, "White Balance 2");
        hashMap.put(Integer.valueOf((int) Settings.DEFAULT_INITIAL_WINDOW_SIZE), "No Print");
    }

    public d1() {
        E(new c1(this));
    }

    @Override // cc.b
    public String n() {
        return "Sony Makernote";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30323e;
    }
}