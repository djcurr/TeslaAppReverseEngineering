package qc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class d extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f48047e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f48047e = hashMap;
        hashMap.put(0, "JPEG Comment");
    }

    public d() {
        E(new c(this));
    }

    @Override // cc.b
    public String n() {
        return "JpegComment";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f48047e;
    }
}