package zc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class e extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f60404e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f60404e = hashMap;
        hashMap.put(1000, "Channels, Rows, Columns, Depth, Mode");
        hashMap.put(1001, "Mac Print Info");
        hashMap.put(1002, "XML Data");
        hashMap.put(1003, "Indexed Color Table");
        hashMap.put(1005, "Resolution Info");
        hashMap.put(1006, "Alpha Channels");
        hashMap.put(1007, "Display Info (Obsolete)");
        hashMap.put(1008, "Caption");
        hashMap.put(1009, "Border Information");
        hashMap.put(1010, "Background Color");
        hashMap.put(1011, "Print Flags");
        hashMap.put(1012, "Grayscale and Multichannel Halftoning Information");
        hashMap.put(1013, "Color Halftoning Information");
        hashMap.put(1014, "Duotone Halftoning Information");
        hashMap.put(1015, "Grayscale and Multichannel Transfer Function");
        hashMap.put(1016, "Color Transfer Functions");
        hashMap.put(1017, "Duotone Transfer Functions");
        hashMap.put(1018, "Duotone Image Information");
        hashMap.put(1019, "Effective Black and White Values");
        hashMap.put(1021, "EPS Options");
        hashMap.put(1022, "Quick Mask Information");
        hashMap.put(1024, "Layer State Information");
        hashMap.put(1026, "Layers Group Information");
        hashMap.put(1028, "IPTC-NAA Record");
        hashMap.put(1029, "Image Mode for Raw Format Files");
        hashMap.put(1030, "JPEG Quality");
        hashMap.put(1032, "Grid and Guides Information");
        hashMap.put(1033, "Photoshop 4.0 Thumbnail");
        hashMap.put(1034, "Copyright Flag");
        hashMap.put(1035, "URL");
        hashMap.put(1036, "Thumbnail Data");
        hashMap.put(1037, "Global Angle");
        hashMap.put(1039, "ICC Profile Bytes");
        hashMap.put(1040, "Watermark");
        hashMap.put(1041, "ICC Untagged Profile");
        hashMap.put(1042, "Effects Visible");
        hashMap.put(1043, "Spot Halftone");
        hashMap.put(1044, "Seed Number");
        hashMap.put(1045, "Unicode Alpha Names");
        hashMap.put(1046, "Indexed Color Table Count");
        hashMap.put(1047, "Transparency Index");
        hashMap.put(1049, "Global Altitude");
        hashMap.put(1050, "Slices");
        hashMap.put(1051, "Workflow URL");
        hashMap.put(1052, "Jump To XPEP");
        hashMap.put(1053, "Alpha Identifiers");
        hashMap.put(1054, "URL List");
        hashMap.put(1057, "Version Info");
        hashMap.put(1058, "EXIF Data 1");
        hashMap.put(1059, "EXIF Data 3");
        hashMap.put(1060, "XMP Data");
        hashMap.put(1061, "Caption Digest");
        hashMap.put(1062, "Print Scale");
        hashMap.put(1064, "Pixel Aspect Ratio");
        hashMap.put(1065, "Layer Comps");
        hashMap.put(1066, "Alternate Duotone Colors");
        hashMap.put(1067, "Alternate Spot Colors");
        hashMap.put(1069, "Layer Selection IDs");
        hashMap.put(1070, "HDR Toning Info");
        hashMap.put(1071, "Print Info");
        hashMap.put(1072, "Layer Groups Enabled ID");
        hashMap.put(1073, "Color Samplers");
        hashMap.put(1074, "Measurement Scale");
        hashMap.put(1075, "Timeline Information");
        hashMap.put(1076, "Sheet Disclosure");
        hashMap.put(1077, "Display Info");
        hashMap.put(1078, "Onion Skins");
        hashMap.put(1080, "Count information");
        hashMap.put(1082, "Print Info 2");
        hashMap.put(1083, "Print Style");
        hashMap.put(1084, "Mac NSPrintInfo");
        hashMap.put(1085, "Win DEVMODE");
        hashMap.put(1086, "Auto Save File Subpath");
        hashMap.put(1087, "Auto Save Format");
        hashMap.put(1088, "Subpath Selection State");
        hashMap.put(2999, "Clipping Path Name");
        hashMap.put(3000, "Origin Subpath Info");
        hashMap.put(7000, "Image Ready Variables XML");
        hashMap.put(7001, "Image Ready Data Sets");
        hashMap.put(7002, "Image Ready Selected State");
        hashMap.put(7003, "Image Ready 7 Rollover Expanded State");
        hashMap.put(7004, "Image Ready Rollover Expanded State");
        hashMap.put(7005, "Image Ready Save Layer Settings");
        hashMap.put(7006, "Image Ready Version");
        hashMap.put(8000, "Lightroom Workflow");
        hashMap.put(10000, "Print Flags Information");
    }

    public e() {
        E(new d(this));
    }

    @Override // cc.b
    public String n() {
        return "Photoshop";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f60404e;
    }
}