package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import vw.b;
import vw.c;

@b({VCardVersion.V4_0})
/* loaded from: classes5.dex */
public class ClientPidMap extends VCardProperty {
    private Integer pid;
    private String uri;

    public ClientPidMap(Integer num, String str) {
        this.pid = num;
        this.uri = str;
    }

    public static ClientPidMap random(Integer num) {
        String uuid = UUID.randomUUID().toString();
        return new ClientPidMap(num, "urn:uuid:" + uuid);
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<c> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.pid == null && this.uri == null) {
            list.add(new c(8, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            ClientPidMap clientPidMap = (ClientPidMap) obj;
            Integer num = this.pid;
            if (num == null) {
                if (clientPidMap.pid != null) {
                    return false;
                }
            } else if (!num.equals(clientPidMap.pid)) {
                return false;
            }
            String str = this.uri;
            if (str == null) {
                if (clientPidMap.uri != null) {
                    return false;
                }
            } else if (!str.equals(clientPidMap.uri)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Integer getPid() {
        return this.pid;
    }

    public String getUri() {
        return this.uri;
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Integer num = this.pid;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.uri;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public void setPid(Integer num) {
        this.pid = num;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pid", this.pid);
        linkedHashMap.put("uri", this.uri);
        return linkedHashMap;
    }

    @Override // ezvcard.property.VCardProperty
    public ClientPidMap copy() {
        return new ClientPidMap(this);
    }

    public ClientPidMap(ClientPidMap clientPidMap) {
        super(clientPidMap);
        this.pid = clientPidMap.pid;
        this.uri = clientPidMap.uri;
    }
}