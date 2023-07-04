package ic;

import java.util.HashMap;

/* loaded from: classes.dex */
public class n extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30336e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30336e = hashMap;
        hashMap.put(1, "Proprietary Thumbnail Format Data");
        hashMap.put(3584, "Print Image Matching (PIM) Info");
    }

    public n() {
        E(new m(this));
    }

    @Override // cc.b
    public String n() {
        return "Kyocera/Contax Makernote";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30336e;
    }
}