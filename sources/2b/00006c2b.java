package ezvcard.property;

import ezvcard.VCardVersion;
import vw.b;

@b({VCardVersion.V4_0})
/* loaded from: classes5.dex */
public class Birthplace extends PlaceProperty {
    public Birthplace() {
    }

    public Birthplace(double d11, double d12) {
        super(d11, d12);
    }

    @Override // ezvcard.property.VCardProperty
    public Birthplace copy() {
        return new Birthplace(this);
    }

    public Birthplace(String str) {
        super(str);
    }

    public Birthplace(Birthplace birthplace) {
        super(birthplace);
    }
}