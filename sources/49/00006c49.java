package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.util.TelUri;
import java.util.List;
import vw.b;
import vw.c;

@b({VCardVersion.V4_0})
/* loaded from: classes5.dex */
public class Member extends UriProperty implements HasAltId {
    public Member(String str) {
        super(str);
    }

    public static Member email(String str) {
        return new Member("mailto:" + str);
    }

    public static Member im(String str, String str2) {
        return new Member(str + ":" + str2);
    }

    public static Member telephone(TelUri telUri) {
        return new Member(telUri.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.property.SimpleProperty, ezvcard.property.VCardProperty
    public void _validate(List<c> list, VCardVersion vCardVersion, VCard vCard) {
        super._validate(list, vCardVersion, vCard);
        if (vCard.i() == null || !vCard.i().isGroup()) {
            list.add(new c(17, new Object[0]));
        }
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.n();
    }

    public String getMediaType() {
        return this.parameters.w();
    }

    @Override // ezvcard.property.VCardProperty
    public List<ezvcard.parameter.c> getPids() {
        return super.getPids();
    }

    @Override // ezvcard.property.VCardProperty
    public Integer getPref() {
        return super.getPref();
    }

    public String getUri() {
        return getValue();
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

    public void setUri(String str) {
        setValue(str);
    }

    public Member(Member member) {
        super(member);
    }

    @Override // ezvcard.property.VCardProperty
    public Member copy() {
        return new Member(this);
    }
}