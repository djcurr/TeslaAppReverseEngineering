package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.parameter.c;
import java.util.List;
import vw.b;

@b({VCardVersion.V4_0})
/* loaded from: classes5.dex */
public class CalendarUri extends UriProperty implements HasAltId {
    public CalendarUri(String str) {
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

    public CalendarUri(CalendarUri calendarUri) {
        super(calendarUri);
    }

    @Override // ezvcard.property.VCardProperty
    public CalendarUri copy() {
        return new CalendarUri(this);
    }
}