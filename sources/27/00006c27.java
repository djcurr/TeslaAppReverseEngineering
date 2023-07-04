package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import vw.b;
import vw.c;

@b({VCardVersion.V2_1, VCardVersion.V3_0})
/* loaded from: classes5.dex */
public class Agent extends VCardProperty {
    private String url;
    private VCard vcard;

    public Agent() {
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<c> list, VCardVersion vCardVersion, VCard vCard) {
        NumberFormat integerInstance;
        int intValue;
        if (this.url == null && this.vcard == null) {
            list.add(new c(8, new Object[0]));
        }
        if (this.vcard != null) {
            NumberFormat.getIntegerInstance().setMinimumIntegerDigits(2);
            Iterator<Map.Entry<VCardProperty, List<c>>> it2 = this.vcard.s(vCardVersion).iterator();
            while (it2.hasNext()) {
                Map.Entry<VCardProperty, List<c>> next = it2.next();
                VCardProperty key = next.getKey();
                for (c cVar : next.getValue()) {
                    String str = "";
                    String simpleName = key == null ? "" : key.getClass().getSimpleName();
                    if (cVar.a().intValue() >= 0) {
                        str = "W" + integerInstance.format(intValue);
                    }
                    list.add(new c(10, simpleName, str, cVar.b()));
                }
            }
        }
    }

    @Override // ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            Agent agent = (Agent) obj;
            String str = this.url;
            if (str == null) {
                if (agent.url != null) {
                    return false;
                }
            } else if (!str.equals(agent.url)) {
                return false;
            }
            VCard vCard = this.vcard;
            if (vCard == null) {
                if (agent.vcard != null) {
                    return false;
                }
            } else if (!vCard.equals(agent.vcard)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String getUrl() {
        return this.url;
    }

    public VCard getVCard() {
        return this.vcard;
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        VCard vCard = this.vcard;
        return hashCode2 + (vCard != null ? vCard.hashCode() : 0);
    }

    public void setUrl(String str) {
        this.url = str;
        this.vcard = null;
    }

    public void setVCard(VCard vCard) {
        this.vcard = vCard;
        this.url = null;
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("url", this.url);
        linkedHashMap.put("vcard", this.vcard);
        return linkedHashMap;
    }

    public Agent(String str) {
        setUrl(str);
    }

    @Override // ezvcard.property.VCardProperty
    public Agent copy() {
        return new Agent(this);
    }

    public Agent(VCard vCard) {
        setVCard(vCard);
    }

    public Agent(Agent agent) {
        super(agent);
        this.url = agent.url;
        VCard vCard = agent.vcard;
        this.vcard = vCard == null ? null : new VCard(vCard);
    }
}