package ezvcard.property;

import ezvcard.VCardVersion;
import vw.b;

@b({VCardVersion.V3_0})
/* loaded from: classes5.dex */
public class SourceDisplayText extends TextProperty {
    public SourceDisplayText(String str) {
        super(str);
    }

    public SourceDisplayText(SourceDisplayText sourceDisplayText) {
        super(sourceDisplayText);
    }

    @Override // ezvcard.property.VCardProperty
    public SourceDisplayText copy() {
        return new SourceDisplayText(this);
    }
}