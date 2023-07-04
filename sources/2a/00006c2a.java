package ezvcard.property;

import ezvcard.util.PartialDate;
import java.util.Date;

/* loaded from: classes5.dex */
public class Birthday extends DateOrTimeProperty {
    public Birthday(Date date) {
        super(date);
    }

    public Birthday(Date date, boolean z11) {
        super(date, z11);
    }

    @Override // ezvcard.property.VCardProperty
    public Birthday copy() {
        return new Birthday(this);
    }

    public Birthday(PartialDate partialDate) {
        super(partialDate);
    }

    public Birthday(String str) {
        super(str);
    }

    public Birthday(Birthday birthday) {
        super(birthday);
    }
}