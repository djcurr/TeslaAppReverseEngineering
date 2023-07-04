package pc;

import cc.h;

/* loaded from: classes.dex */
public class a extends h<b> {
    public a(b bVar) {
        super(bVar);
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 5) {
            return super.f(i11);
        }
        return v();
    }

    public String v() {
        Integer l11 = ((b) this.f9060a).l(5);
        if (l11 == null) {
            return null;
        }
        int intValue = l11.intValue();
        if (intValue != 16) {
            if (intValue != 17) {
                if (intValue != 19) {
                    return "Unknown extension code " + l11;
                }
                return "Thumbnail stored using 3 bytes/pixel";
            }
            return "Thumbnail stored using 1 byte/pixel";
        }
        return "Thumbnail coded using JPEG";
    }
}