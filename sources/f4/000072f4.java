package hc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class k extends b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f29021e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f29021e = hashMap;
        b.V(hashMap);
    }

    public k() {
        E(new j(this));
    }

    @Override // cc.b
    public String n() {
        return "Exif SubIFD";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f29021e;
    }
}