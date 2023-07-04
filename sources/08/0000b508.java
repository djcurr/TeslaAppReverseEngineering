package tc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class o extends rc.d {

    /* renamed from: f  reason: collision with root package name */
    protected static final HashMap<Integer, String> f51904f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f51904f = hashMap;
        a.V(hashMap);
        hashMap.put(1, "Drop Frame");
        hashMap.put(2, "24 Hour Max");
        hashMap.put(3, "Negative Times OK");
        hashMap.put(4, "Counter");
        hashMap.put(5, "Text Font");
        hashMap.put(6, "Text Face");
        hashMap.put(7, "Text Size");
        hashMap.put(8, "Text Color");
        hashMap.put(9, "Background Color");
        hashMap.put(10, "Font Name");
    }

    public o() {
        E(new n(this));
    }

    @Override // rc.d, cc.b
    public String n() {
        return "QuickTime Timecode";
    }

    @Override // rc.d, cc.b
    protected HashMap<Integer, String> w() {
        return f51904f;
    }
}