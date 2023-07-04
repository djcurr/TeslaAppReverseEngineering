package ezvcard.property;

import ezvcard.VCardVersion;
import vw.b;

@b({VCardVersion.V4_0})
/* loaded from: classes5.dex */
public class Deathplace extends PlaceProperty {
    public Deathplace() {
    }

    public Deathplace(double d11, double d12) {
        super(d11, d12);
    }

    @Override // ezvcard.property.VCardProperty
    public Deathplace copy() {
        return new Deathplace(this);
    }

    public Deathplace(String str) {
        super(str);
    }

    public Deathplace(Deathplace deathplace) {
        super(deathplace);
    }
}