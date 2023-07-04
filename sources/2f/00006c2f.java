package ezvcard.property;

import ezvcard.VCardVersion;
import vw.b;

@b({VCardVersion.V3_0})
/* loaded from: classes5.dex */
public class Classification extends TextProperty {
    public Classification(String str) {
        super(str);
    }

    public Classification(Classification classification) {
        super(classification);
    }

    @Override // ezvcard.property.VCardProperty
    public Classification copy() {
        return new Classification(this);
    }
}