package com.adyen.checkout.adyen3ds2.model;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u001b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/model/SubmitFingerprintRequest;", "Lp7/c;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lvz/b0;", "writeToParcel", "", "component1", "component2", "encodedFingerprint", "paymentData", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getEncodedFingerprint", "()Ljava/lang/String;", "getPaymentData", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "b", "3ds2_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class SubmitFingerprintRequest extends c {
    private static final String FINGERPRINT = "fingerprintResult";
    private static final String PAYMENT_DATA = "paymentData";
    private final String encodedFingerprint;
    private final String paymentData;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<SubmitFingerprintRequest> CREATOR = new c.a(SubmitFingerprintRequest.class);
    private static final c.b<SubmitFingerprintRequest> SERIALIZER = new a();

    /* loaded from: classes.dex */
    public static final class a implements c.b<SubmitFingerprintRequest> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public SubmitFingerprintRequest a(JSONObject jsonObject) {
            s.g(jsonObject, "jsonObject");
            try {
                return new SubmitFingerprintRequest(p7.b.b(jsonObject, SubmitFingerprintRequest.FINGERPRINT), p7.b.b(jsonObject, "paymentData"));
            } catch (JSONException e11) {
                throw new ModelSerializationException(SubmitFingerprintRequest.class, e11);
            }
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(SubmitFingerprintRequest modelObject) {
            s.g(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(SubmitFingerprintRequest.FINGERPRINT, modelObject.getEncodedFingerprint());
                jSONObject.putOpt("paymentData", modelObject.getPaymentData());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(SubmitFingerprintRequest.class, e11);
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

        public final c.b<SubmitFingerprintRequest> a() {
            return SubmitFingerprintRequest.SERIALIZER;
        }
    }

    public SubmitFingerprintRequest(String str, String str2) {
        this.encodedFingerprint = str;
        this.paymentData = str2;
    }

    public static /* synthetic */ SubmitFingerprintRequest copy$default(SubmitFingerprintRequest submitFingerprintRequest, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = submitFingerprintRequest.encodedFingerprint;
        }
        if ((i11 & 2) != 0) {
            str2 = submitFingerprintRequest.paymentData;
        }
        return submitFingerprintRequest.copy(str, str2);
    }

    public static final c.b<SubmitFingerprintRequest> getSERIALIZER() {
        return Companion.a();
    }

    public final String component1() {
        return this.encodedFingerprint;
    }

    public final String component2() {
        return this.paymentData;
    }

    public final SubmitFingerprintRequest copy(String str, String str2) {
        return new SubmitFingerprintRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SubmitFingerprintRequest) {
            SubmitFingerprintRequest submitFingerprintRequest = (SubmitFingerprintRequest) obj;
            return s.c(this.encodedFingerprint, submitFingerprintRequest.encodedFingerprint) && s.c(this.paymentData, submitFingerprintRequest.paymentData);
        }
        return false;
    }

    public final String getEncodedFingerprint() {
        return this.encodedFingerprint;
    }

    public final String getPaymentData() {
        return this.paymentData;
    }

    public int hashCode() {
        String str = this.encodedFingerprint;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentData;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SubmitFingerprintRequest(encodedFingerprint=" + ((Object) this.encodedFingerprint) + ", paymentData=" + ((Object) this.paymentData) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        s.g(parcel, "parcel");
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}