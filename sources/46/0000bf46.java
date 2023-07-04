package xc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class b extends d {

    /* renamed from: f  reason: collision with root package name */
    protected static final HashMap<Integer, String> f57360f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f57360f = hashMap;
        d.V(hashMap);
        hashMap.put(101, "Max PDU Size");
        hashMap.put(102, "Average PDU Size");
        hashMap.put(103, "Max Bitrate");
        hashMap.put(104, "Average Bitrate");
    }

    public b() {
        E(new a(this));
    }

    @Override // vc.d, cc.b
    public String n() {
        return "MP4 Hint";
    }

    @Override // vc.d, cc.b
    protected HashMap<Integer, String> w() {
        return f57360f;
    }
}