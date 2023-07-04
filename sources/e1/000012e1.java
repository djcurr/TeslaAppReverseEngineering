package com.adyen.checkout.components.model.payments.request;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u001b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u001b\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/adyen/checkout/components/model/payments/request/Installments;", "Lp7/c;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lvz/b0;", "writeToParcel", "", "component1", "component2", "()Ljava/lang/Integer;", Installments.PLAN, "value", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/adyen/checkout/components/model/payments/request/Installments;", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getPlan", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getValue", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class Installments extends c {
    private static final String PLAN = "plan";
    private static final String VALUE = "value";
    private final String plan;
    private final Integer value;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<Installments> CREATOR = new c.a(Installments.class);
    public static final c.b<Installments> SERIALIZER = new a();

    /* loaded from: classes.dex */
    public static final class a implements c.b<Installments> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public Installments a(JSONObject jsonObject) {
            s.g(jsonObject, "jsonObject");
            try {
                return new Installments(jsonObject.getString(Installments.PLAN), Integer.valueOf(jsonObject.optInt("value", 1)));
            } catch (JSONException e11) {
                throw new ModelSerializationException(Installments.class, e11);
            }
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(Installments modelObject) {
            s.g(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(Installments.PLAN, modelObject.getPlan());
                jSONObject.putOpt("value", modelObject.getValue());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(Installments.class, e11);
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

    public Installments(String str, Integer num) {
        this.plan = str;
        this.value = num;
    }

    public static /* synthetic */ Installments copy$default(Installments installments, String str, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = installments.plan;
        }
        if ((i11 & 2) != 0) {
            num = installments.value;
        }
        return installments.copy(str, num);
    }

    public final String component1() {
        return this.plan;
    }

    public final Integer component2() {
        return this.value;
    }

    public final Installments copy(String str, Integer num) {
        return new Installments(str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Installments) {
            Installments installments = (Installments) obj;
            return s.c(this.plan, installments.plan) && s.c(this.value, installments.value);
        }
        return false;
    }

    public final String getPlan() {
        return this.plan;
    }

    public final Integer getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.plan;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.value;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "Installments(plan=" + ((Object) this.plan) + ", value=" + this.value + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        s.g(parcel, "parcel");
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}