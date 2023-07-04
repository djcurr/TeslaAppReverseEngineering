package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.RelatedType;
import ezvcard.parameter.VCardParameters;
import ezvcard.util.TelUri;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.i18n.TextBundle;
import vw.b;
import vw.c;

@b({VCardVersion.V4_0})
/* loaded from: classes5.dex */
public class Related extends VCardProperty implements HasAltId {
    private String text;
    private String uri;

    public Related() {
    }

    public static Related email(String str) {
        return new Related("mailto:" + str);
    }

    public static Related im(String str, String str2) {
        return new Related(str + ":" + str2);
    }

    public static Related telephone(TelUri telUri) {
        return new Related(telUri.toString());
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<c> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.uri == null && this.text == null) {
            list.add(new c(8, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            Related related = (Related) obj;
            String str = this.text;
            if (str == null) {
                if (related.text != null) {
                    return false;
                }
            } else if (!str.equals(related.text)) {
                return false;
            }
            String str2 = this.uri;
            if (str2 == null) {
                if (related.uri != null) {
                    return false;
                }
            } else if (!str2.equals(related.uri)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.n();
    }

    @Override // ezvcard.property.VCardProperty
    public List<ezvcard.parameter.c> getPids() {
        return super.getPids();
    }

    @Override // ezvcard.property.VCardProperty
    public Integer getPref() {
        return super.getPref();
    }

    public String getText() {
        return this.text;
    }

    public List<RelatedType> getTypes() {
        VCardParameters vCardParameters = this.parameters;
        vCardParameters.getClass();
        return new VCardParameters.c<RelatedType>(vCardParameters) { // from class: ezvcard.property.Related.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                vCardParameters.getClass();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // ezvcard.parameter.VCardParameters.d
            public RelatedType _asObject(String str) {
                return RelatedType.d(str);
            }
        };
    }

    public String getUri() {
        return this.uri;
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uri;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // ezvcard.property.HasAltId
    public void setAltId(String str) {
        this.parameters.G(str);
    }

    @Override // ezvcard.property.VCardProperty
    public void setPref(Integer num) {
        super.setPref(num);
    }

    public void setText(String str) {
        this.text = str;
        this.uri = null;
    }

    public void setUri(String str) {
        this.uri = str;
        this.text = null;
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("uri", this.uri);
        linkedHashMap.put(TextBundle.TEXT_ENTRY, this.text);
        return linkedHashMap;
    }

    public Related(String str) {
        setUri(str);
    }

    @Override // ezvcard.property.VCardProperty
    public Related copy() {
        return new Related(this);
    }

    public Related(Related related) {
        super(related);
        this.uri = related.uri;
        this.text = related.text;
    }
}