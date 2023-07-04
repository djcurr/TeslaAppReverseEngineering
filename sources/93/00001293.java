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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001!B1\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000bHÆ\u0003J3\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\bHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R!\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/adyen/checkout/card/api/model/BinLookupRequest;", "Lp7/c;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lvz/b0;", "writeToParcel", "", "component1", "component2", "", "component3", BinLookupRequest.ENCRYPTED_BIN, BinLookupRequest.REQUEST_ID, BinLookupRequest.SUPPORTED_BRANDS, "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getEncryptedBin", "()Ljava/lang/String;", "getRequestId", "Ljava/util/List;", "getSupportedBrands", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Companion", "b", "card_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class BinLookupRequest extends c {
    private static final String ENCRYPTED_BIN = "encryptedBin";
    private static final String REQUEST_ID = "requestId";
    private static final String SUPPORTED_BRANDS = "supportedBrands";
    private final String encryptedBin;
    private final String requestId;
    private final List<String> supportedBrands;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<BinLookupRequest> CREATOR = new c.a(BinLookupRequest.class);
    private static final c.b<BinLookupRequest> SERIALIZER = new a();

    /* loaded from: classes.dex */
    public static final class a implements c.b<BinLookupRequest> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public BinLookupRequest a(JSONObject jsonObject) {
            s.g(jsonObject, "jsonObject");
            try {
                return new BinLookupRequest(p7.b.b(jsonObject, BinLookupRequest.ENCRYPTED_BIN), p7.b.b(jsonObject, BinLookupRequest.REQUEST_ID), p7.b.c(jsonObject, BinLookupRequest.SUPPORTED_BRANDS));
            } catch (JSONException e11) {
                throw new ModelSerializationException(BinLookupRequest.class, e11);
            }
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(BinLookupRequest modelObject) {
            s.g(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(BinLookupRequest.ENCRYPTED_BIN, modelObject.getEncryptedBin());
                jSONObject.putOpt(BinLookupRequest.REQUEST_ID, modelObject.getRequestId());
                jSONObject.putOpt(BinLookupRequest.SUPPORTED_BRANDS, p7.a.c(modelObject.getSupportedBrands()));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(BinLookupRequest.class, e11);
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

        public final c.b<BinLookupRequest> a() {
            return BinLookupRequest.SERIALIZER;
        }
    }

    public BinLookupRequest() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ BinLookupRequest(String str, String str2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BinLookupRequest copy$default(BinLookupRequest binLookupRequest, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = binLookupRequest.encryptedBin;
        }
        if ((i11 & 2) != 0) {
            str2 = binLookupRequest.requestId;
        }
        if ((i11 & 4) != 0) {
            list = binLookupRequest.supportedBrands;
        }
        return binLookupRequest.copy(str, str2, list);
    }

    public static final c.b<BinLookupRequest> getSERIALIZER() {
        return Companion.a();
    }

    public final String component1() {
        return this.encryptedBin;
    }

    public final String component2() {
        return this.requestId;
    }

    public final List<String> component3() {
        return this.supportedBrands;
    }

    public final BinLookupRequest copy(String str, String str2, List<String> list) {
        return new BinLookupRequest(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BinLookupRequest) {
            BinLookupRequest binLookupRequest = (BinLookupRequest) obj;
            return s.c(this.encryptedBin, binLookupRequest.encryptedBin) && s.c(this.requestId, binLookupRequest.requestId) && s.c(this.supportedBrands, binLookupRequest.supportedBrands);
        }
        return false;
    }

    public final String getEncryptedBin() {
        return this.encryptedBin;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final List<String> getSupportedBrands() {
        return this.supportedBrands;
    }

    public int hashCode() {
        String str = this.encryptedBin;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.requestId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.supportedBrands;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "BinLookupRequest(encryptedBin=" + ((Object) this.encryptedBin) + ", requestId=" + ((Object) this.requestId) + ", supportedBrands=" + this.supportedBrands + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        s.g(parcel, "parcel");
        p7.a.d(parcel, SERIALIZER.b(this));
    }

    public BinLookupRequest(String str, String str2, List<String> list) {
        this.encryptedBin = str;
        this.requestId = str2;
        this.supportedBrands = list;
    }
}