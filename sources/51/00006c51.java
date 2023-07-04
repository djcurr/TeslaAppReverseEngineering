package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import java.util.List;
import vw.b;
import vw.c;

@b({VCardVersion.V3_0})
/* loaded from: classes5.dex */
public class Profile extends TextProperty {
    public Profile() {
        super("VCARD");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.property.SimpleProperty, ezvcard.property.VCardProperty
    public void _validate(List<c> list, VCardVersion vCardVersion, VCard vCard) {
        if ("VCARD".equalsIgnoreCase((String) this.value)) {
            return;
        }
        list.add(new c(18, this.value));
    }

    public Profile(Profile profile) {
        super(profile);
    }

    @Override // ezvcard.property.VCardProperty
    public Profile copy() {
        return new Profile(this);
    }
}