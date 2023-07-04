package com.adyen.checkout.components.model.payments.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.core.exception.ModelSerializationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B+\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/adyen/checkout/components/model/payments/response/Threeds2Action;", "Lcom/adyen/checkout/components/model/payments/response/Action;", "Landroid/os/Parcel;", "dest", "", "flags", "Lvz/b0;", "writeToParcel", "", Threeds2Action.TOKEN, "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", Threeds2Action.SUBTYPE, "getSubtype", Threeds2Action.AUTHORISATION_TOKEN, "getAuthorisationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "b", cg.c.f9084i, "components-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class Threeds2Action extends Action {
    public static final String ACTION_TYPE = "threeDS2";
    private static final String AUTHORISATION_TOKEN = "authorisationToken";
    private static final String SUBTYPE = "subtype";
    private static final String TOKEN = "token";
    private final String authorisationToken;
    private final String subtype;
    private final String token;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<Threeds2Action> CREATOR = new c.a(Threeds2Action.class);
    public static final c.b<Threeds2Action> SERIALIZER = new a();

    /* loaded from: classes.dex */
    public static final class a implements c.b<Threeds2Action> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public Threeds2Action a(JSONObject jsonObject) {
            s.g(jsonObject, "jsonObject");
            try {
                Threeds2Action threeds2Action = new Threeds2Action(p7.b.b(jsonObject, Threeds2Action.TOKEN), p7.b.b(jsonObject, Threeds2Action.SUBTYPE), p7.b.b(jsonObject, Threeds2Action.AUTHORISATION_TOKEN));
                threeds2Action.setType(p7.b.b(jsonObject, "type"));
                threeds2Action.setPaymentData(p7.b.b(jsonObject, "paymentData"));
                threeds2Action.setPaymentMethodType(p7.b.b(jsonObject, Action.PAYMENT_METHOD_TYPE));
                return threeds2Action;
            } catch (JSONException e11) {
                throw new ModelSerializationException(Threeds2Action.class, e11);
            }
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(Threeds2Action modelObject) {
            s.g(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("paymentData", modelObject.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, modelObject.getPaymentMethodType());
                jSONObject.putOpt(Threeds2Action.TOKEN, modelObject.getToken());
                jSONObject.putOpt(Threeds2Action.SUBTYPE, modelObject.getSubtype());
                jSONObject.putOpt(Threeds2Action.AUTHORISATION_TOKEN, modelObject.getAuthorisationToken());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(Threeds2Action.class, e11);
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
    }

    /* loaded from: classes.dex */
    public enum c {
        FINGERPRINT("fingerprint"),
        CHALLENGE("challenge");
        
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
                c cVar = c.FINGERPRINT;
                if (!s.c(value, cVar.getValue())) {
                    cVar = c.CHALLENGE;
                    if (!s.c(value, cVar.getValue())) {
                        throw new IllegalArgumentException(s.p("No Subtype matches the value of: ", value));
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

    public Threeds2Action() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ Threeds2Action(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }

    public final String getAuthorisationToken() {
        return this.authorisationToken;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final String getToken() {
        return this.token;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i11) {
        s.g(dest, "dest");
        p7.a.d(dest, SERIALIZER.b(this));
    }

    public Threeds2Action(String str, String str2, String str3) {
        this.token = str;
        this.subtype = str2;
        this.authorisationToken = str3;
    }
}