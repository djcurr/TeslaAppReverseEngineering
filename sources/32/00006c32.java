package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.util.PartialDate;
import java.util.Date;
import vw.b;

@b({VCardVersion.V4_0})
/* loaded from: classes5.dex */
public class Deathdate extends DateOrTimeProperty {
    public Deathdate(Date date) {
        super(date);
    }

    public Deathdate(Date date, boolean z11) {
        super(date, z11);
    }

    @Override // ezvcard.property.VCardProperty
    public Deathdate copy() {
        return new Deathdate(this);
    }

    public Deathdate(PartialDate partialDate) {
        super(partialDate);
    }

    public Deathdate(String str) {
        super(str);
    }

    public Deathdate(Deathdate deathdate) {
        super(deathdate);
    }
}