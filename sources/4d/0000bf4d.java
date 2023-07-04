package xc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class i extends d {

    /* renamed from: f  reason: collision with root package name */
    protected static final HashMap<Integer, String> f57362f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f57362f = hashMap;
        d.V(hashMap);
        hashMap.put(101, "Format");
        hashMap.put(102, "Number of Channels");
        hashMap.put(103, "Sample Size");
        hashMap.put(104, "Sample Rate");
        hashMap.put(105, "Balance");
    }

    public i() {
        E(new h(this));
    }

    @Override // vc.d, cc.b
    public String n() {
        return "MP4 Sound";
    }

    @Override // vc.d, cc.b
    protected HashMap<Integer, String> w() {
        return f57362f;
    }
}