package pc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class b extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f46421e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f46421e = hashMap;
        hashMap.put(5, "Extension Code");
    }

    public b() {
        E(new a(this));
    }

    @Override // cc.b
    public String n() {
        return "JFXX";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f46421e;
    }
}