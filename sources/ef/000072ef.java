package hc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class f extends b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f29019e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f29019e = hashMap;
        b.V(hashMap);
    }

    public f() {
        E(new e(this));
    }

    @Override // cc.b
    public String n() {
        return "Exif Image";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f29019e;
    }
}