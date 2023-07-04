package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.util.GeoUri;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.i18n.TextBundle;
import vw.c;

/* loaded from: classes5.dex */
public class PlaceProperty extends VCardProperty implements HasAltId {
    protected GeoUri geoUri;
    protected String text;
    protected String uri;

    public PlaceProperty() {
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<c> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.uri == null && this.text == null && this.geoUri == null) {
            list.add(new c(8, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            PlaceProperty placeProperty = (PlaceProperty) obj;
            GeoUri geoUri = this.geoUri;
            if (geoUri == null) {
                if (placeProperty.geoUri != null) {
                    return false;
                }
            } else if (!geoUri.equals(placeProperty.geoUri)) {
                return false;
            }
            String str = this.text;
            if (str == null) {
                if (placeProperty.text != null) {
                    return false;
                }
            } else if (!str.equals(placeProperty.text)) {
                return false;
            }
            String str2 = this.uri;
            if (str2 == null) {
                if (placeProperty.uri != null) {
                    return false;
                }
            } else if (!str2.equals(placeProperty.uri)) {
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

    public GeoUri getGeoUri() {
        return this.geoUri;
    }

    @Override // ezvcard.property.VCardProperty
    public String getLanguage() {
        return super.getLanguage();
    }

    public Double getLatitude() {
        GeoUri geoUri = this.geoUri;
        if (geoUri == null) {
            return null;
        }
        return geoUri.j();
    }

    public Double getLongitude() {
        GeoUri geoUri = this.geoUri;
        if (geoUri == null) {
            return null;
        }
        return geoUri.k();
    }

    public String getText() {
        return this.text;
    }

    public String getUri() {
        return this.uri;
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        GeoUri geoUri = this.geoUri;
        int hashCode2 = (hashCode + (geoUri == null ? 0 : geoUri.hashCode())) * 31;
        String str = this.text;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uri;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // ezvcard.property.HasAltId
    public void setAltId(String str) {
        this.parameters.G(str);
    }

    public void setCoordinates(double d11, double d12) {
        setGeoUri(new GeoUri.b(Double.valueOf(d11), Double.valueOf(d12)).l());
    }

    public void setGeoUri(GeoUri geoUri) {
        this.geoUri = geoUri;
        this.uri = null;
        this.text = null;
    }

    @Override // ezvcard.property.VCardProperty
    public void setLanguage(String str) {
        super.setLanguage(str);
    }

    public void setText(String str) {
        this.text = str;
        this.geoUri = null;
        this.uri = null;
    }

    public void setUri(String str) {
        this.uri = str;
        this.geoUri = null;
        this.text = null;
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("geoUri", this.geoUri);
        linkedHashMap.put("uri", this.uri);
        linkedHashMap.put(TextBundle.TEXT_ENTRY, this.text);
        return linkedHashMap;
    }

    public PlaceProperty(double d11, double d12) {
        setCoordinates(d11, d12);
    }

    public PlaceProperty(String str) {
        setText(str);
    }

    public PlaceProperty(PlaceProperty placeProperty) {
        super(placeProperty);
        this.geoUri = placeProperty.geoUri;
        this.uri = placeProperty.uri;
        this.text = placeProperty.text;
    }
}