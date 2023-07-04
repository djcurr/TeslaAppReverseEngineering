package yw;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Address;
import ih.e;

/* loaded from: classes5.dex */
public class a extends g1<Address> {
    public a() {
        super(Address.class, "ADR");
    }

    private static Address j(e.a aVar) {
        Address address = new Address();
        String b11 = aVar.b();
        if (b11 != null) {
            address.getPoBoxes().add(b11);
        }
        String b12 = aVar.b();
        if (b12 != null) {
            address.getExtendedAddresses().add(b12);
        }
        String b13 = aVar.b();
        if (b13 != null) {
            address.getStreetAddresses().add(b13);
        }
        String b14 = aVar.b();
        if (b14 != null) {
            address.getLocalities().add(b14);
        }
        String b15 = aVar.b();
        if (b15 != null) {
            address.getRegions().add(b15);
        }
        String b16 = aVar.b();
        if (b16 != null) {
            address.getPostalCodes().add(b16);
        }
        String b17 = aVar.b();
        if (b17 != null) {
            address.getCountries().add(b17);
        }
        return address;
    }

    private static Address k(e.b bVar) {
        Address address = new Address();
        address.getPoBoxes().addAll(bVar.b());
        address.getExtendedAddresses().addAll(bVar.b());
        address.getStreetAddresses().addAll(bVar.b());
        address.getLocalities().addAll(bVar.b());
        address.getRegions().addAll(bVar.b());
        address.getPostalCodes().addAll(bVar.b());
        address.getCountries().addAll(bVar.b());
        return address;
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f25378e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.g1
    /* renamed from: i */
    public Address b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        if (aVar.d() == VCardVersion.V2_1) {
            return j(new e.a(str));
        }
        return k(new e.b(str));
    }
}