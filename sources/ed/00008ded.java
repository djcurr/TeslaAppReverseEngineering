package oc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class b extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f42349e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f42349e = hashMap;
        hashMap.put(5, "Version");
        hashMap.put(7, "Resolution Units");
        hashMap.put(10, "Y Resolution");
        hashMap.put(8, "X Resolution");
        hashMap.put(12, "Thumbnail Width Pixels");
        hashMap.put(13, "Thumbnail Height Pixels");
    }

    public b() {
        E(new a(this));
    }

    @Override // cc.b
    public String n() {
        return "JFIF";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f42349e;
    }
}