package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.parameter.HobbyLevel;
import vw.b;

@b({VCardVersion.V4_0})
/* loaded from: classes5.dex */
public class Hobby extends TextProperty implements HasAltId {
    public Hobby(String str) {
        super(str);
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.n();
    }

    @Override // ezvcard.property.VCardProperty
    public Integer getIndex() {
        return super.getIndex();
    }

    @Override // ezvcard.property.VCardProperty
    public String getLanguage() {
        return super.getLanguage();
    }

    public HobbyLevel getLevel() {
        String v11 = this.parameters.v();
        if (v11 == null) {
            return null;
        }
        return HobbyLevel.d(v11);
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
    public void setIndex(Integer num) {
        super.setIndex(num);
    }

    @Override // ezvcard.property.VCardProperty
    public void setLanguage(String str) {
        super.setLanguage(str);
    }

    public void setLevel(HobbyLevel hobbyLevel) {
        this.parameters.N(hobbyLevel.b());
    }

    @Override // ezvcard.property.VCardProperty
    public void setPref(Integer num) {
        super.setPref(num);
    }

    public void setType(String str) {
        this.parameters.S(str);
    }

    public Hobby(Hobby hobby) {
        super(hobby);
    }

    @Override // ezvcard.property.VCardProperty
    public Hobby copy() {
        return new Hobby(this);
    }
}