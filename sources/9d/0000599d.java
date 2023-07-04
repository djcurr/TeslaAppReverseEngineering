package com.stripe.android.ui.core.address;

import android.content.res.AssetManager;
import android.content.res.Resources;
import com.stripe.android.ui.core.elements.SectionFieldElement;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import m00.l;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import vz.p;
import vz.v;
import wz.r0;
import wz.x;
import wz.x0;

/* loaded from: classes6.dex */
public final class AddressFieldElementRepository {
    public static final String DEFAULT_COUNTRY_CODE = "ZZ";
    private static final Set<String> supportedCountries;
    private final Map<String, List<SectionFieldElement>> countryFieldMap = new LinkedHashMap();
    private final Resources resources;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDEFAULT_COUNTRY_CODE$payments_ui_core_release$annotations() {
        }

        public static /* synthetic */ void getSupportedCountries$payments_ui_core_release$annotations() {
        }

        public final Set<String> getSupportedCountries$payments_ui_core_release() {
            return AddressFieldElementRepository.supportedCountries;
        }
    }

    static {
        Set<String> i11;
        i11 = x0.i("AC", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CV", "CW", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MK", "ML", "MM", "MN", "MO", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", BouncyCastleProvider.PROVIDER_NAME, "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SZ", "TA", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VN", "VU", "WF", "WS", "XK", "YE", "YT", "ZA", "ZM", "ZW", "ZZ");
        supportedCountries = i11;
    }

    public AddressFieldElementRepository(Resources resources) {
        int t11;
        int e11;
        int d11;
        int e12;
        AssetManager assets;
        this.resources = resources;
        Set<String> set = supportedCountries;
        t11 = x.t(set, 10);
        e11 = r0.e(t11);
        d11 = l.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (Object obj : set) {
            linkedHashMap.put(obj, "addressinfo/" + ((String) obj) + ".json");
        }
        e12 = r0.e(linkedHashMap.size());
        Map<String, ? extends List<CountryAddressSchema>> linkedHashMap2 = new LinkedHashMap<>(e12);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            String str = (String) entry.getValue();
            Resources resources2 = getResources();
            InputStream inputStream = null;
            if (resources2 != null && (assets = resources2.getAssets()) != null) {
                inputStream = assets.open(str);
            }
            List<CountryAddressSchema> parseAddressesSchema = TransformAddressToElementKt.parseAddressesSchema(inputStream);
            if (parseAddressesSchema != null) {
                linkedHashMap2.put(key, parseAddressesSchema);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        initialize(linkedHashMap2);
    }

    public final void add$payments_ui_core_release(String countryCode, List<? extends SectionFieldElement> listElements) {
        s.g(countryCode, "countryCode");
        s.g(listElements, "listElements");
        this.countryFieldMap.put(countryCode, listElements);
    }

    public final List<SectionFieldElement> get$payments_ui_core_release(String str) {
        List<SectionFieldElement> list = str == null ? null : this.countryFieldMap.get(str);
        return list == null ? this.countryFieldMap.get("ZZ") : list;
    }

    public final Resources getResources() {
        return this.resources;
    }

    public final void initialize(String countryCode, ByteArrayInputStream schema) {
        Map<String, ? extends List<CountryAddressSchema>> f11;
        s.g(countryCode, "countryCode");
        s.g(schema, "schema");
        List<CountryAddressSchema> parseAddressesSchema = TransformAddressToElementKt.parseAddressesSchema(schema);
        s.e(parseAddressesSchema);
        f11 = r0.f(v.a(countryCode, parseAddressesSchema));
        initialize(f11);
    }

    private final void initialize(Map<String, ? extends List<CountryAddressSchema>> map) {
        ArrayList<p> arrayList = new ArrayList(map.size());
        for (Map.Entry<String, ? extends List<CountryAddressSchema>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<SectionFieldElement> transformToElementList = TransformAddressToElementKt.transformToElementList(entry.getValue());
            if (transformToElementList != null) {
                arrayList.add(v.a(key, transformToElementList));
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        for (p pVar : arrayList) {
            add$payments_ui_core_release((String) pVar.c(), (List) pVar.d());
        }
    }
}