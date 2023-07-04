package ic;

import java.util.HashMap;

/* loaded from: classes.dex */
public class v0 extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30345e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30345e = hashMap;
        hashMap.put(1, "Makernote Data Type");
        hashMap.put(2, "Version");
        hashMap.put(3584, "Print Image Matching (PIM) Info");
        hashMap.put(8193, "Ricoh Camera Info Makernote Sub-IFD");
    }

    public v0() {
        E(new u0(this));
    }

    @Override // cc.b
    public String n() {
        return "Ricoh Makernote";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30345e;
    }
}