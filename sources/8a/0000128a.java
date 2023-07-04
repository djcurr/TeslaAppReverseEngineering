package com.adyen.checkout.adyen3ds2.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.response.Action;
import com.adyen.checkout.core.exception.ModelSerializationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;
import p7.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001!B%\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010\u0011\u001a\u00020\nHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\""}, d2 = {"Lcom/adyen/checkout/adyen3ds2/model/SubmitFingerprintResponse;", "Lp7/c;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lvz/b0;", "writeToParcel", "Lcom/adyen/checkout/components/model/payments/response/Action;", "component1", "", "component2", "component3", SubmitFingerprintResponse.ACTION, "type", "details", "copy", "toString", "hashCode", "", "other", "", "equals", "Lcom/adyen/checkout/components/model/payments/response/Action;", "getAction", "()Lcom/adyen/checkout/components/model/payments/response/Action;", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getDetails", "<init>", "(Lcom/adyen/checkout/components/model/payments/response/Action;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "b", "3ds2_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class SubmitFingerprintResponse extends c {
    private static final String ACTION = "action";
    private static final String DETAILS = "details";
    private static final String TYPE = "type";
    private final Action action;
    private final String details;
    private final String type;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<SubmitFingerprintResponse> CREATOR = new c.a(SubmitFingerprintResponse.class);
    private static final c.b<SubmitFingerprintResponse> SERIALIZER = new a();

    /* loaded from: classes.dex */
    public static final class a implements c.b<SubmitFingerprintResponse> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public SubmitFingerprintResponse a(JSONObject jsonObject) {
            s.g(jsonObject, "jsonObject");
            try {
                return new SubmitFingerprintResponse((Action) d.b(jsonObject.optJSONObject(SubmitFingerprintResponse.ACTION), Action.SERIALIZER), p7.b.b(jsonObject, "type"), p7.b.b(jsonObject, "details"));
            } catch (JSONException e11) {
                throw new ModelSerializationException(SubmitFingerprintResponse.class, e11);
            }
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(SubmitFingerprintResponse modelObject) {
            s.g(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(SubmitFingerprintResponse.ACTION, modelObject.getAction());
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("details", modelObject.getDetails());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(SubmitFingerprintResponse.class, e11);
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

        public final c.b<SubmitFingerprintResponse> a() {
            return SubmitFingerprintResponse.SERIALIZER;
        }
    }

    public SubmitFingerprintResponse(Action action, String str, String str2) {
        this.action = action;
        this.type = str;
        this.details = str2;
    }

    public static /* synthetic */ SubmitFingerprintResponse copy$default(SubmitFingerprintResponse submitFingerprintResponse, Action action, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            action = submitFingerprintResponse.action;
        }
        if ((i11 & 2) != 0) {
            str = submitFingerprintResponse.type;
        }
        if ((i11 & 4) != 0) {
            str2 = submitFingerprintResponse.details;
        }
        return submitFingerprintResponse.copy(action, str, str2);
    }

    public static final c.b<SubmitFingerprintResponse> getSERIALIZER() {
        return Companion.a();
    }

    public final Action component1() {
        return this.action;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.details;
    }

    public final SubmitFingerprintResponse copy(Action action, String str, String str2) {
        return new SubmitFingerprintResponse(action, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SubmitFingerprintResponse) {
            SubmitFingerprintResponse submitFingerprintResponse = (SubmitFingerprintResponse) obj;
            return s.c(this.action, submitFingerprintResponse.action) && s.c(this.type, submitFingerprintResponse.type) && s.c(this.details, submitFingerprintResponse.details);
        }
        return false;
    }

    public final Action getAction() {
        return this.action;
    }

    public final String getDetails() {
        return this.details;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        Action action = this.action;
        int hashCode = (action == null ? 0 : action.hashCode()) * 31;
        String str = this.type;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.details;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SubmitFingerprintResponse(action=" + this.action + ", type=" + ((Object) this.type) + ", details=" + ((Object) this.details) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        s.g(parcel, "parcel");
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}