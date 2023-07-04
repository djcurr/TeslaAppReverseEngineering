package cc;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class c extends b {
    public c() {
    }

    @Override // cc.b
    public void M(int i11, Object obj) {
        throw new UnsupportedOperationException(String.format("Cannot add value to %s.", c.class.getName()));
    }

    @Override // cc.b
    public String n() {
        return "Error";
    }

    @Override // cc.b
    public String v(int i11) {
        return "";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return new HashMap<>();
    }

    @Override // cc.b
    public boolean z(int i11) {
        return false;
    }

    public c(String str) {
        super.a(str);
    }
}