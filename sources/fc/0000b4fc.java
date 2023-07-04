package tc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class c extends rc.d {

    /* renamed from: f  reason: collision with root package name */
    protected static final HashMap<Integer, String> f51900f;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f51900f = hashMap;
        a.V(hashMap);
    }

    public c() {
        E(new b(this));
    }

    @Override // rc.d, cc.b
    public String n() {
        return "QuickTime Music";
    }

    @Override // rc.d, cc.b
    protected HashMap<Integer, String> w() {
        return f51900f;
    }
}