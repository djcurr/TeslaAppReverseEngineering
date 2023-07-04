package ec;

import cc.h;

/* loaded from: classes.dex */
public class a extends h<b> {
    public a(b bVar) {
        super(bVar);
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 6 && i11 != 7) {
            return super.f(i11);
        }
        return v(i11);
    }

    public String v(int i11) {
        return ((b) this.f9060a).r(i11) + " pixels";
    }
}