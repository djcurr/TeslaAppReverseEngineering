package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.AddressType;
import ezvcard.parameter.VCardParameters;
import ezvcard.util.GeoUri;
import ezvcard.util.h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import vw.c;

/* loaded from: classes5.dex */
public class Address extends VCardProperty implements HasAltId {
    private final List<String> countries;
    private final List<String> extendedAddresses;
    private final List<String> localities;
    private final List<String> poBoxes;
    private final List<String> postalCodes;
    private final List<String> regions;
    private final List<String> streetAddresses;

    public Address() {
        this.poBoxes = new ArrayList(1);
        this.extendedAddresses = new ArrayList(1);
        this.streetAddresses = new ArrayList(1);
        this.localities = new ArrayList(1);
        this.regions = new ArrayList(1);
        this.postalCodes = new ArrayList(1);
        this.countries = new ArrayList(1);
    }

    private static String first(List<String> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private static String getAddressFull(List<String> list) {
        if (list.isEmpty()) {
            return null;
        }
        return h.a(list, ",");
    }

    private static void set(List<String> list, String str) {
        list.clear();
        if (str != null) {
            list.add(str);
        }
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<c> list, VCardVersion vCardVersion, VCard vCard) {
        for (AddressType addressType : getTypes()) {
            if (addressType != AddressType.f25388c && !addressType.c(vCardVersion)) {
                list.add(new c(9, addressType.b()));
            }
        }
        if (vCardVersion == VCardVersion.V2_1) {
            if (this.poBoxes.size() > 1 || this.extendedAddresses.size() > 1 || this.streetAddresses.size() > 1 || this.localities.size() > 1 || this.regions.size() > 1 || this.postalCodes.size() > 1 || this.countries.size() > 1) {
                list.add(new c(35, new Object[0]));
            }
        }
    }

    @Override // ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            Address address = (Address) obj;
            return this.countries.equals(address.countries) && this.extendedAddresses.equals(address.extendedAddresses) && this.localities.equals(address.localities) && this.poBoxes.equals(address.poBoxes) && this.postalCodes.equals(address.postalCodes) && this.regions.equals(address.regions) && this.streetAddresses.equals(address.streetAddresses);
        }
        return false;
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.n();
    }

    public List<String> getCountries() {
        return this.countries;
    }

    public String getCountry() {
        return first(this.countries);
    }

    public String getExtendedAddress() {
        return first(this.extendedAddresses);
    }

    public String getExtendedAddressFull() {
        return getAddressFull(this.extendedAddresses);
    }

    public List<String> getExtendedAddresses() {
        return this.extendedAddresses;
    }

    public GeoUri getGeo() {
        return this.parameters.r();
    }

    public String getLabel() {
        return this.parameters.t();
    }

    @Override // ezvcard.property.VCardProperty
    public String getLanguage() {
        return super.getLanguage();
    }

    public List<String> getLocalities() {
        return this.localities;
    }

    public String getLocality() {
        return first(this.localities);
    }

    @Override // ezvcard.property.VCardProperty
    public List<ezvcard.parameter.c> getPids() {
        return super.getPids();
    }

    public String getPoBox() {
        return first(this.poBoxes);
    }

    public List<String> getPoBoxes() {
        return this.poBoxes;
    }

    public String getPostalCode() {
        return first(this.postalCodes);
    }

    public List<String> getPostalCodes() {
        return this.postalCodes;
    }

    @Override // ezvcard.property.VCardProperty
    public Integer getPref() {
        return super.getPref();
    }

    public String getRegion() {
        return first(this.regions);
    }

    public List<String> getRegions() {
        return this.regions;
    }

    public String getStreetAddress() {
        return first(this.streetAddresses);
    }

    public String getStreetAddressFull() {
        return getAddressFull(this.streetAddresses);
    }

    public List<String> getStreetAddresses() {
        return this.streetAddresses;
    }

    public String getTimezone() {
        return this.parameters.A();
    }

    public List<AddressType> getTypes() {
        VCardParameters vCardParameters = this.parameters;
        vCardParameters.getClass();
        return new VCardParameters.c<AddressType>(vCardParameters) { // from class: ezvcard.property.Address.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                vCardParameters.getClass();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // ezvcard.parameter.VCardParameters.d
            public AddressType _asObject(String str) {
                return AddressType.d(str);
            }
        };
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        return (((((((((((((super.hashCode() * 31) + this.countries.hashCode()) * 31) + this.extendedAddresses.hashCode()) * 31) + this.localities.hashCode()) * 31) + this.poBoxes.hashCode()) * 31) + this.postalCodes.hashCode()) * 31) + this.regions.hashCode()) * 31) + this.streetAddresses.hashCode();
    }

    @Override // ezvcard.property.HasAltId
    public void setAltId(String str) {
        this.parameters.G(str);
    }

    public void setCountry(String str) {
        set(this.countries, str);
    }

    public void setExtendedAddress(String str) {
        set(this.extendedAddresses, str);
    }

    public void setGeo(GeoUri geoUri) {
        this.parameters.I(geoUri);
    }

    public void setLabel(String str) {
        this.parameters.L(str);
    }

    @Override // ezvcard.property.VCardProperty
    public void setLanguage(String str) {
        super.setLanguage(str);
    }

    public void setLocality(String str) {
        set(this.localities, str);
    }

    public void setPoBox(String str) {
        set(this.poBoxes, str);
    }

    public void setPostalCode(String str) {
        set(this.postalCodes, str);
    }

    @Override // ezvcard.property.VCardProperty
    public void setPref(Integer num) {
        super.setPref(num);
    }

    public void setRegion(String str) {
        set(this.regions, str);
    }

    public void setStreetAddress(String str) {
        set(this.streetAddresses, str);
    }

    public void setTimezone(String str) {
        this.parameters.R(str);
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("poBoxes", this.poBoxes);
        linkedHashMap.put("extendedAddresses", this.extendedAddresses);
        linkedHashMap.put("streetAddresses", this.streetAddresses);
        linkedHashMap.put("localities", this.localities);
        linkedHashMap.put("regions", this.regions);
        linkedHashMap.put("postalCodes", this.postalCodes);
        linkedHashMap.put("countries", this.countries);
        return linkedHashMap;
    }

    @Override // ezvcard.property.VCardProperty
    public Address copy() {
        return new Address(this);
    }

    public Address(Address address) {
        super(address);
        this.poBoxes = new ArrayList(address.poBoxes);
        this.extendedAddresses = new ArrayList(address.extendedAddresses);
        this.streetAddresses = new ArrayList(address.streetAddresses);
        this.localities = new ArrayList(address.localities);
        this.regions = new ArrayList(address.regions);
        this.postalCodes = new ArrayList(address.postalCodes);
        this.countries = new ArrayList(address.countries);
    }
}