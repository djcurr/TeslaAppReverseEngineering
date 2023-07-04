package hc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f29018e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f29018e = hashMap;
        b.V(hashMap);
    }

    public d() {
        E(new c(this));
    }

    @Override // cc.b
    public String n() {
        return "Exif IFD0";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f29018e;
    }
}