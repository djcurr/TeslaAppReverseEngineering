package com.adyen.checkout.card.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.core.exception.ModelSerializationException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;
import p7.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001\"B1\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0012\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R!\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006#"}, d2 = {"Lcom/adyen/checkout/card/api/model/BinLookupResponse;", "Lp7/c;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lvz/b0;", "writeToParcel", "", "Lcom/adyen/checkout/card/api/model/Brand;", "component1", "", "component2", "component3", BinLookupResponse.BRANDS, BinLookupResponse.ISSUING_COUNTRY_CODE, BinLookupResponse.REQUEST_ID, "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/util/List;", "getBrands", "()Ljava/util/List;", "Ljava/lang/String;", "getIssuingCountryCode", "()Ljava/lang/String;", "getRequestId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "b", "card_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class BinLookupResponse extends c {
    private static final String BRANDS = "brands";
    private static final String ISSUING_COUNTRY_CODE = "issuingCountryCode";
    private static final String REQUEST_ID = "requestId";
    private final List<Brand> brands;
    private final String issuingCountryCode;
    private final String requestId;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<BinLookupResponse> CREATOR = new c.a(BinLookupResponse.class);
    private static final c.b<BinLookupResponse> SERIALIZER = new a();

    /* loaded from: classes.dex */
    public static final class a implements c.b<BinLookupResponse> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public BinLookupResponse a(JSONObject jsonObject) {
            s.g(jsonObject, "jsonObject");
            try {
                return new BinLookupResponse(d.c(jsonObject.optJSONArray(BinLookupResponse.BRANDS), Brand.Companion.a()), p7.b.b(jsonObject, BinLookupResponse.ISSUING_COUNTRY_CODE), p7.b.b(jsonObject, BinLookupResponse.REQUEST_ID));
            } catch (JSONException e11) {
                throw new ModelSerializationException(BinLookupResponse.class, e11);
            }
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(BinLookupResponse modelObject) {
            s.g(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(BinLookupResponse.BRANDS, d.f(modelObject.getBrands(), Brand.Companion.a()));
                jSONObject.putOpt(BinLookupResponse.ISSUING_COUNTRY_CODE, modelObject.getIssuingCountryCode());
                jSONObject.putOpt(BinLookupResponse.REQUEST_ID, modelObject.getRequestId());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(BinLookupResponse.class, e11);
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

        public final c.b<BinLookupResponse> a() {
            return BinLookupResponse.SERIALIZER;
        }
    }

    public BinLookupResponse() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ BinLookupResponse(List list, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BinLookupResponse copy$default(BinLookupResponse binLookupResponse, List list, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = binLookupResponse.brands;
        }
        if ((i11 & 2) != 0) {
            str = binLookupResponse.issuingCountryCode;
        }
        if ((i11 & 4) != 0) {
            str2 = binLookupResponse.requestId;
        }
        return binLookupResponse.copy(list, str, str2);
    }

    public static final c.b<BinLookupResponse> getSERIALIZER() {
        return Companion.a();
    }

    public final List<Brand> component1() {
        return this.brands;
    }

    public final String component2() {
        return this.issuingCountryCode;
    }

    public final String component3() {
        return this.requestId;
    }

    public final BinLookupResponse copy(List<Brand> list, String str, String str2) {
        return new BinLookupResponse(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BinLookupResponse) {
            BinLookupResponse binLookupResponse = (BinLookupResponse) obj;
            return s.c(this.brands, binLookupResponse.brands) && s.c(this.issuingCountryCode, binLookupResponse.issuingCountryCode) && s.c(this.requestId, binLookupResponse.requestId);
        }
        return false;
    }

    public final List<Brand> getBrands() {
        return this.brands;
    }

    public final String getIssuingCountryCode() {
        return this.issuingCountryCode;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        List<Brand> list = this.brands;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.issuingCountryCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.requestId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BinLookupResponse(brands=" + this.brands + ", issuingCountryCode=" + ((Object) this.issuingCountryCode) + ", requestId=" + ((Object) this.requestId) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        s.g(parcel, "parcel");
        p7.a.d(parcel, SERIALIZER.b(this));
    }

    public BinLookupResponse(List<Brand> list, String str, String str2) {
        this.brands = list;
        this.issuingCountryCode = str;
        this.requestId = str2;
    }
}