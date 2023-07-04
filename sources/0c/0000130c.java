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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0013\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/components/model/payments/response/Threeds2ChallengeAction;", "Lcom/adyen/checkout/components/model/payments/response/Action;", "Landroid/os/Parcel;", "dest", "", "flags", "Lvz/b0;", "writeToParcel", "", Threeds2ChallengeAction.TOKEN, "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class Threeds2ChallengeAction extends Action {
    public static final String ACTION_TYPE = "threeDS2Challenge";
    private static final String TOKEN = "token";
    private final String token;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<Threeds2ChallengeAction> CREATOR = new c.a(Threeds2ChallengeAction.class);
    public static final c.b<Threeds2ChallengeAction> SERIALIZER = new a();

    /* loaded from: classes.dex */
    public static final class a implements c.b<Threeds2ChallengeAction> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public Threeds2ChallengeAction a(JSONObject jsonObject) {
            s.g(jsonObject, "jsonObject");
            try {
                Threeds2ChallengeAction threeds2ChallengeAction = new Threeds2ChallengeAction(p7.b.b(jsonObject, Threeds2ChallengeAction.TOKEN));
                threeds2ChallengeAction.setType(p7.b.b(jsonObject, "type"));
                threeds2ChallengeAction.setPaymentData(p7.b.b(jsonObject, "paymentData"));
                threeds2ChallengeAction.setPaymentMethodType(p7.b.b(jsonObject, Action.PAYMENT_METHOD_TYPE));
                return threeds2ChallengeAction;
            } catch (JSONException e11) {
                throw new ModelSerializationException(Threeds2Action.class, e11);
            }
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(Threeds2ChallengeAction modelObject) {
            s.g(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("paymentData", modelObject.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, modelObject.getPaymentMethodType());
                jSONObject.putOpt(Threeds2ChallengeAction.TOKEN, modelObject.getToken());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(Threeds2ChallengeAction.class, e11);
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

    public Threeds2ChallengeAction() {
        this(null, 1, null);
    }

    public /* synthetic */ Threeds2ChallengeAction(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str);
    }

    public final String getToken() {
        return this.token;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i11) {
        s.g(dest, "dest");
        p7.a.d(dest, SERIALIZER.b(this));
    }

    public Threeds2ChallengeAction(String str) {
        this.token = str;
    }
}