package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.TelephoneType;
import ezvcard.parameter.VCardParameters;
import ezvcard.util.TelUri;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.i18n.TextBundle;
import vw.c;

/* loaded from: classes5.dex */
public class Telephone extends VCardProperty implements HasAltId {
    private String text;
    private TelUri uri;

    public Telephone(String str) {
        setText(str);
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<c> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.uri == null && this.text == null) {
            list.add(new c(8, new Object[0]));
        }
        if (this.uri != null && (vCardVersion == VCardVersion.V2_1 || vCardVersion == VCardVersion.V3_0)) {
            list.add(new c(19, new Object[0]));
        }
        for (TelephoneType telephoneType : getTypes()) {
            if (telephoneType != TelephoneType.f25403c && !telephoneType.c(vCardVersion)) {
                list.add(new c(9, telephoneType.b()));
            }
        }
    }

    @Override // ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            Telephone telephone = (Telephone) obj;
            String str = this.text;
            if (str == null) {
                if (telephone.text != null) {
                    return false;
                }
            } else if (!str.equals(telephone.text)) {
                return false;
            }
            TelUri telUri = this.uri;
            if (telUri == null) {
                if (telephone.uri != null) {
                    return false;
                }
            } else if (!telUri.equals(telephone.uri)) {
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

    public List<TelephoneType> getTypes() {
        VCardParameters vCardParameters = this.parameters;
        vCardParameters.getClass();
        return new VCardParameters.c<TelephoneType>(vCardParameters) { // from class: ezvcard.property.Telephone.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                vCardParameters.getClass();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // ezvcard.parameter.VCardParameters.d
            public TelephoneType _asObject(String str) {
                return TelephoneType.d(str);
            }
        };
    }

    public TelUri getUri() {
        return this.uri;
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TelUri telUri = this.uri;
        return hashCode2 + (telUri != null ? telUri.hashCode() : 0);
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

    public void setUri(TelUri telUri) {
        this.text = null;
        this.uri = telUri;
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("uri", this.uri);
        linkedHashMap.put(TextBundle.TEXT_ENTRY, this.text);
        return linkedHashMap;
    }

    @Override // ezvcard.property.VCardProperty
    public Telephone copy() {
        return new Telephone(this);
    }

    public Telephone(TelUri telUri) {
        setUri(telUri);
    }

    public Telephone(Telephone telephone) {
        super(telephone);
        this.text = telephone.text;
        this.uri = telephone.uri;
    }
}