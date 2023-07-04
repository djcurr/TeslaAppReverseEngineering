package ec;

import java.util.HashMap;

/* loaded from: classes.dex */
public class b extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f25059e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f25059e = hashMap;
        hashMap.put(1, "Frames Per Second");
        hashMap.put(2, "Samples Per Second");
        hashMap.put(3, "Duration");
        hashMap.put(4, "Video Codec");
        hashMap.put(5, "Audio Codec");
        hashMap.put(6, "Width");
        hashMap.put(7, "Height");
        hashMap.put(8, "Stream Count");
    }

    public b() {
        E(new a(this));
    }

    @Override // cc.b
    public String n() {
        return "AVI";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f25059e;
    }
}