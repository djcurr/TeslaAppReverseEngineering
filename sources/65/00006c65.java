package ezvcard.property;

import ezvcard.parameter.c;
import java.util.List;

/* loaded from: classes5.dex */
public class Url extends UriProperty implements HasAltId {
    public Url(String str) {
        super(str);
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.n();
    }

    public String getMediaType() {
        return this.parameters.w();
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

    public void setMediaType(String str) {
        this.parameters.O(str);
    }

    @Override // ezvcard.property.VCardProperty
    public void setPref(Integer num) {
        super.setPref(num);
    }

    public void setType(String str) {
        this.parameters.S(str);
    }

    public Url(Url url) {
        super(url);
    }

    @Override // ezvcard.property.VCardProperty
    public Url copy() {
        return new Url(this);
    }
}