package xc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class o extends d {

    /* renamed from: f  reason: collision with root package name */
    protected static final HashMap<Integer, String> f57364f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f57364f = hashMap;
        d.V(hashMap);
        hashMap.put(101, "Vendor");
        hashMap.put(102, "Temporal Quality");
        hashMap.put(103, "Spatial Quality");
        hashMap.put(104, "Width");
        hashMap.put(105, "Height");
        hashMap.put(106, "Horizontal Resolution");
        hashMap.put(107, "Vertical Resolution");
        hashMap.put(108, "Compressor Name");
        hashMap.put(109, "Depth");
        hashMap.put(110, "Compression Type");
        hashMap.put(111, "Graphics Mode");
        hashMap.put(112, "Opcolor");
        hashMap.put(113, "Color Table");
        hashMap.put(114, "Frame Rate");
    }

    public o() {
        E(new n(this));
    }

    @Override // vc.d, cc.b
    public String n() {
        return "MP4 Video";
    }

    @Override // vc.d, cc.b
    protected HashMap<Integer, String> w() {
        return f57364f;
    }
}