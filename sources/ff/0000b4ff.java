package tc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class f extends rc.d {

    /* renamed from: f  reason: collision with root package name */
    protected static final HashMap<Integer, String> f51901f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f51901f = hashMap;
        a.V(hashMap);
        hashMap.put(769, "Format");
        hashMap.put(770, "Number of Channels");
        hashMap.put(771, "Sample Size");
        hashMap.put(772, "Sample Rate");
        hashMap.put(773, "Balance");
    }

    public f() {
        E(new e(this));
    }

    @Override // rc.d, cc.b
    public String n() {
        return "QuickTime Sound";
    }

    @Override // rc.d, cc.b
    protected HashMap<Integer, String> w() {
        return f51901f;
    }
}