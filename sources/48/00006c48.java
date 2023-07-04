package ezvcard.property;

import ezvcard.VCardVersion;
import vw.b;

@b({VCardVersion.V2_1, VCardVersion.V3_0})
/* loaded from: classes5.dex */
public class Mailer extends TextProperty {
    public Mailer(String str) {
        super(str);
    }

    public Mailer(Mailer mailer) {
        super(mailer);
    }

    @Override // ezvcard.property.VCardProperty
    public Mailer copy() {
        return new Mailer(this);
    }
}