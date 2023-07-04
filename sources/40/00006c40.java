package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.parameter.InterestLevel;
import vw.b;

@b({VCardVersion.V4_0})
/* loaded from: classes5.dex */
public class Interest extends TextProperty implements HasAltId {
    public Interest(String str) {
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

    public InterestLevel getLevel() {
        String v11 = this.parameters.v();
        if (v11 == null) {
            return null;
        }
        return InterestLevel.d(v11);
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

    public void setLevel(InterestLevel interestLevel) {
        this.parameters.N(interestLevel == null ? null : interestLevel.b());
    }

    @Override // ezvcard.property.VCardProperty
    public void setPref(Integer num) {
        super.setPref(num);
    }

    public void setType(String str) {
        this.parameters.S(str);
    }

    public Interest(Interest interest) {
        super(interest);
    }

    @Override // ezvcard.property.VCardProperty
    public Interest copy() {
        return new Interest(this);
    }
}