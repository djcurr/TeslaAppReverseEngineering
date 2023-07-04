package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.parameter.c;
import java.util.List;
import vw.b;

@b({VCardVersion.V4_0})
/* loaded from: classes5.dex */
public class Language extends TextProperty implements HasAltId {
    public Language(String str) {
        super(str);
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.n();
    }

    @Override // ezvcard.property.VCardProperty
    public List<c> getPids() {
        return super.getPids();
    }

    @Override // ezvcard.property.VCardProperty
    public Integer getPref() {
        return super.getPref();
    }

    public String getType() {
        return this.parameters.B();
    }

    @Override // ezvcard.property.HasAltId
    public void setAltId(String str) {
        this.parameters.G(str);
    }

    @Override // ezvcard.property.VCardProperty
    public void setPref(Integer num) {
        super.setPref(num);
    }

    public void setType(String str) {
        this.parameters.S(str);
    }

    public Language(Language language) {
        super(language);
    }

    @Override // ezvcard.property.VCardProperty
    public Language copy() {
        return new Language(this);
    }
}