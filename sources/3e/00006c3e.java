package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.ImppType;
import ezvcard.parameter.VCardParameters;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import vw.b;
import vw.c;

@b({VCardVersion.V3_0, VCardVersion.V4_0})
/* loaded from: classes5.dex */
public class Impp extends VCardProperty implements HasAltId {
    private static final String AIM = "aim";
    private static final String ICQ = "icq";
    private static final String IRC = "irc";
    private static final String MSN = "msnim";
    private static final String SIP = "sip";
    private static final String SKYPE = "skype";
    private static final String XMPP = "xmpp";
    private static final String YAHOO = "ymsgr";
    private URI uri;

    public Impp(String str) {
        setUri(str);
    }

    public static Impp aim(String str) {
        return new Impp(AIM, str);
    }

    public static Impp icq(String str) {
        return new Impp(ICQ, str);
    }

    public static Impp irc(String str) {
        return new Impp(IRC, str);
    }

    private boolean isProtocol(String str) {
        URI uri = this.uri;
        return uri != null && str.equals(uri.getScheme());
    }

    public static Impp msn(String str) {
        return new Impp(MSN, str);
    }

    public static Impp sip(String str) {
        return new Impp(SIP, str);
    }

    public static Impp skype(String str) {
        return new Impp(SKYPE, str);
    }

    public static Impp xmpp(String str) {
        return new Impp(XMPP, str);
    }

    public static Impp yahoo(String str) {
        return new Impp(YAHOO, str);
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<c> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.uri == null) {
            list.add(new c(8, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            Impp impp = (Impp) obj;
            URI uri = this.uri;
            if (uri == null) {
                if (impp.uri != null) {
                    return false;
                }
            } else if (!uri.equals(impp.uri)) {
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

    public String getHandle() {
        URI uri = this.uri;
        if (uri == null) {
            return null;
        }
        return uri.getSchemeSpecificPart();
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

    public String getProtocol() {
        URI uri = this.uri;
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public List<ImppType> getTypes() {
        VCardParameters vCardParameters = this.parameters;
        vCardParameters.getClass();
        return new VCardParameters.c<ImppType>(vCardParameters) { // from class: ezvcard.property.Impp.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                vCardParameters.getClass();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // ezvcard.parameter.VCardParameters.d
            public ImppType _asObject(String str) {
                return ImppType.d(str);
            }
        };
    }

    public URI getUri() {
        return this.uri;
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        URI uri = this.uri;
        return hashCode + (uri == null ? 0 : uri.hashCode());
    }

    public boolean isAim() {
        return isProtocol(AIM);
    }

    public boolean isIcq() {
        return isProtocol(ICQ);
    }

    public boolean isIrc() {
        return isProtocol(IRC);
    }

    public boolean isMsn() {
        return isProtocol(MSN);
    }

    public boolean isSip() {
        return isProtocol(SIP);
    }

    public boolean isSkype() {
        return isProtocol(SKYPE);
    }

    public boolean isXmpp() {
        return isProtocol(XMPP);
    }

    public boolean isYahoo() {
        return isProtocol(YAHOO);
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
        setUri(str == null ? null : URI.create(str));
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("uri", this.uri);
        return linkedHashMap;
    }

    @Override // ezvcard.property.VCardProperty
    public Impp copy() {
        return new Impp(this);
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public Impp(URI uri) {
        setUri(uri);
    }

    public void setUri(String str, String str2) {
        try {
            this.uri = new URI(str, str2, null);
        } catch (URISyntaxException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public Impp(String str, String str2) {
        setUri(str, str2);
    }

    public Impp(Impp impp) {
        super(impp);
        this.uri = impp.uri;
    }
}