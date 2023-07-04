package ad;

import java.util.HashMap;
import tb.d;

/* loaded from: classes.dex */
public class c extends cc.b {

    /* renamed from: f  reason: collision with root package name */
    protected static final HashMap<Integer, String> f376f;

    /* renamed from: e  reason: collision with root package name */
    private final d f377e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f376f = hashMap;
        hashMap.put(2, "Image Height");
        hashMap.put(1, "Image Width");
        hashMap.put(3, "Bits Per Sample");
        hashMap.put(4, "Color Type");
        hashMap.put(5, "Compression Type");
        hashMap.put(6, "Filter Method");
        hashMap.put(7, "Interlace Method");
        hashMap.put(8, "Palette Size");
        hashMap.put(9, "Palette Has Transparency");
        hashMap.put(10, "sRGB Rendering Intent");
        hashMap.put(11, "Image Gamma");
        hashMap.put(12, "ICC Profile Name");
        hashMap.put(13, "Textual Data");
        hashMap.put(14, "Last Modification Time");
        hashMap.put(15, "Background Color");
        hashMap.put(16, "Pixels Per Unit X");
        hashMap.put(17, "Pixels Per Unit Y");
        hashMap.put(18, "Unit Specifier");
        hashMap.put(19, "Significant Bits");
    }

    public c(d dVar) {
        this.f377e = dVar;
        E(new b(this));
    }

    @Override // cc.b
    public String n() {
        return "PNG-" + this.f377e.b();
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f376f;
    }
}