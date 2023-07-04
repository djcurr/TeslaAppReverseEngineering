package ic;

import java.util.HashMap;

/* loaded from: classes.dex */
public class r extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30340e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30340e = hashMap;
        hashMap.put(771, "Lens Model");
        hashMap.put(1031, "Original File Name");
        hashMap.put(1032, "Original Directory");
        hashMap.put(1037, "Exposure Mode");
        hashMap.put(1040, "Shot Info");
        hashMap.put(1042, "Film Mode");
        hashMap.put(1043, "WB RGB Levels");
    }

    public r() {
        E(new q(this));
    }

    @Override // cc.b
    public String n() {
        return "Leica Makernote";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30340e;
    }
}