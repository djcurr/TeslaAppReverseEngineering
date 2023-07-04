package com.adyen.checkout.card.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.core.exception.ModelSerializationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0002'(BC\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0003JL\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010\fR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b!\u0010\fR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b#\u0010\u001e¨\u0006)"}, d2 = {"Lcom/adyen/checkout/card/api/model/Brand;", "Lp7/c;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lvz/b0;", "writeToParcel", "", "component1", "", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "component5", "brand", Brand.ENABLE_LUHN_CHECK, Brand.SUPPORTED, Brand.CVC_POLICY, Brand.EXPIRY_DATE_POLICY, "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/card/api/model/Brand;", "toString", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getBrand", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getEnableLuhnCheck", "getSupported", "getCvcPolicy", "getExpiryDatePolicy", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "b", cg.c.f9084i, "card_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class Brand extends p7.c {
    private static final String BRAND = "brand";
    private static final String CVC_POLICY = "cvcPolicy";
    private static final String ENABLE_LUHN_CHECK = "enableLuhnCheck";
    private static final String EXPIRY_DATE_POLICY = "expiryDatePolicy";
    private static final String SUPPORTED = "supported";
    private final String brand;
    private final String cvcPolicy;
    private final Boolean enableLuhnCheck;
    private final String expiryDatePolicy;
    private final Boolean supported;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<Brand> CREATOR = new c.a(Brand.class);
    private static final c.b<Brand> SERIALIZER = new a();

    /* loaded from: classes.dex */
    public static final class a implements c.b<Brand> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public Brand a(JSONObject jsonObject) {
            s.g(jsonObject, "jsonObject");
            try {
                return new Brand(p7.b.b(jsonObject, "brand"), p7.b.a(jsonObject, Brand.ENABLE_LUHN_CHECK), p7.b.a(jsonObject, Brand.SUPPORTED), p7.b.b(jsonObject, Brand.CVC_POLICY), p7.b.b(jsonObject, Brand.EXPIRY_DATE_POLICY));
            } catch (JSONException e11) {
                throw new ModelSerializationException(Brand.class, e11);
            }
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(Brand modelObject) {
            s.g(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("brand", modelObject.getBrand());
                jSONObject.putOpt(Brand.ENABLE_LUHN_CHECK, modelObject.getEnableLuhnCheck());
                jSONObject.putOpt(Brand.SUPPORTED, modelObject.getSupported());
                jSONObject.putOpt(Brand.CVC_POLICY, modelObject.getCvcPolicy());
                jSONObject.putOpt(Brand.EXPIRY_DATE_POLICY, modelObject.getExpiryDatePolicy());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(Brand.class, e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c.b<Brand> a() {
            return Brand.SERIALIZER;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        REQUIRED("required"),
        OPTIONAL("optional"),
        HIDDEN("hidden");
        
        public static final a Companion = new a(null);
        private final String value;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String value) {
                s.g(value, "value");
                c cVar = c.REQUIRED;
                if (!s.c(value, cVar.getValue())) {
                    cVar = c.OPTIONAL;
                    if (!s.c(value, cVar.getValue())) {
                        cVar = c.HIDDEN;
                        if (!s.c(value, cVar.getValue())) {
                            throw new IllegalArgumentException(s.p("No CvcPolicy matches the value of: ", value));
                        }
                    }
                }
                return cVar;
            }
        }

        c(String str) {
            this.value = str;
        }

        public static final c parse(String str) {
            return Companion.a(str);
        }

        public final String getValue() {
            return this.value;
        }
    }

    public Brand() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ Brand(String str, Boolean bool, Boolean bool2, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : bool2, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3);
    }

    public static /* synthetic */ Brand copy$default(Brand brand, String str, Boolean bool, Boolean bool2, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = brand.brand;
        }
        if ((i11 & 2) != 0) {
            bool = brand.enableLuhnCheck;
        }
        Boolean bool3 = bool;
        if ((i11 & 4) != 0) {
            bool2 = brand.supported;
        }
        Boolean bool4 = bool2;
        if ((i11 & 8) != 0) {
            str2 = brand.cvcPolicy;
        }
        String str4 = str2;
        if ((i11 & 16) != 0) {
            str3 = brand.expiryDatePolicy;
        }
        return brand.copy(str, bool3, bool4, str4, str3);
    }

    public static final c.b<Brand> getSERIALIZER() {
        return Companion.a();
    }

    public final String component1() {
        return this.brand;
    }

    public final Boolean component2() {
        return this.enableLuhnCheck;
    }

    public final Boolean component3() {
        return this.supported;
    }

    public final String component4() {
        return this.cvcPolicy;
    }

    public final String component5() {
        return this.expiryDatePolicy;
    }

    public final Brand copy(String str, Boolean bool, Boolean bool2, String str2, String str3) {
        return new Brand(str, bool, bool2, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Brand) {
            Brand brand = (Brand) obj;
            return s.c(this.brand, brand.brand) && s.c(this.enableLuhnCheck, brand.enableLuhnCheck) && s.c(this.supported, brand.supported) && s.c(this.cvcPolicy, brand.cvcPolicy) && s.c(this.expiryDatePolicy, brand.expiryDatePolicy);
        }
        return false;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getCvcPolicy() {
        return this.cvcPolicy;
    }

    public final Boolean getEnableLuhnCheck() {
        return this.enableLuhnCheck;
    }

    public final String getExpiryDatePolicy() {
        return this.expiryDatePolicy;
    }

    public final Boolean getSupported() {
        return this.supported;
    }

    public int hashCode() {
        String str = this.brand;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.enableLuhnCheck;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.supported;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.cvcPolicy;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expiryDatePolicy;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "Brand(brand=" + ((Object) this.brand) + ", enableLuhnCheck=" + this.enableLuhnCheck + ", supported=" + this.supported + ", cvcPolicy=" + ((Object) this.cvcPolicy) + ", expiryDatePolicy=" + ((Object) this.expiryDatePolicy) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        s.g(parcel, "parcel");
        p7.a.d(parcel, SERIALIZER.b(this));
    }

    public Brand(String str, Boolean bool, Boolean bool2, String str2, String str3) {
        this.brand = str;
        this.enableLuhnCheck = bool;
        this.supported = bool2;
        this.cvcPolicy = str2;
        this.expiryDatePolicy = str3;
    }
}