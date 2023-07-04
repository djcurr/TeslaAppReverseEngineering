package ezvcard.parameter;

import ezvcard.VCardVersion;

/* loaded from: classes5.dex */
public class AddressType extends VCardParameter {

    /* renamed from: b  reason: collision with root package name */
    private static final d<AddressType> f25387b = new d<>(AddressType.class);
    @vw.b({VCardVersion.V2_1, VCardVersion.V3_0})

    /* renamed from: c  reason: collision with root package name */
    public static final AddressType f25388c;

    static {
        new AddressType("home");
        new AddressType("work");
        new AddressType("dom");
        new AddressType("intl");
        new AddressType("postal");
        new AddressType("parcel");
        f25388c = new AddressType("pref");
    }

    private AddressType(String str) {
        super(str);
    }

    public static AddressType d(String str) {
        return (AddressType) f25387b.e(str);
    }
}