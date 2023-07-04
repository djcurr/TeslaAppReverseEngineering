package ezvcard.property;

import ezvcard.VCardVersion;
import vw.b;

@b({VCardVersion.V3_0})
/* loaded from: classes5.dex */
public class SortString extends TextProperty {
    public SortString(String str) {
        super(str);
    }

    public SortString(SortString sortString) {
        super(sortString);
    }

    @Override // ezvcard.property.VCardProperty
    public SortString copy() {
        return new SortString(this);
    }
}