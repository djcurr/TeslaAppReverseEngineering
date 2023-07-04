package com.adyen.checkout.components.model.payments.response;

import android.os.Parcel;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.Amount;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ModelSerializationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;
import p7.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/adyen/checkout/components/model/payments/response/BalanceResult;", "Lp7/c;", "Landroid/os/Parcel;", "dest", "", "flags", "Lvz/b0;", "writeToParcel", "Lcom/adyen/checkout/components/model/payments/Amount;", "component1", "component2", BalanceResult.BALANCE, BalanceResult.TRANSACTION_LIMIT, "copy", "", "toString", "hashCode", "", "other", "", "equals", "Lcom/adyen/checkout/components/model/payments/Amount;", "getBalance", "()Lcom/adyen/checkout/components/model/payments/Amount;", "getTransactionLimit", "<init>", "(Lcom/adyen/checkout/components/model/payments/Amount;Lcom/adyen/checkout/components/model/payments/Amount;)V", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class BalanceResult extends c {
    private static final String BALANCE = "balance";
    private static final String TRANSACTION_LIMIT = "transactionLimit";
    private final Amount balance;
    private final Amount transactionLimit;
    public static final b Companion = new b(null);
    public static final c.a<BalanceResult> CREATOR = new c.a<>(BalanceResult.class);
    public static final c.b<BalanceResult> SERIALIZER = new a();

    /* loaded from: classes.dex */
    public static final class a implements c.b<BalanceResult> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public BalanceResult a(JSONObject jsonObject) {
            s.g(jsonObject, "jsonObject");
            JSONObject optJSONObject = jsonObject.optJSONObject(BalanceResult.BALANCE);
            c.b<Amount> bVar = Amount.SERIALIZER;
            Amount amount = (Amount) d.b(optJSONObject, bVar);
            if (amount != null) {
                return new BalanceResult(amount, (Amount) d.b(jsonObject.optJSONObject(BalanceResult.TRANSACTION_LIMIT), bVar));
            }
            throw new CheckoutException("Balance not found");
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(BalanceResult modelObject) {
            s.g(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                Amount balance = modelObject.getBalance();
                c.b<Amount> bVar = Amount.SERIALIZER;
                jSONObject.putOpt(BalanceResult.BALANCE, d.e(balance, bVar));
                jSONObject.putOpt(BalanceResult.TRANSACTION_LIMIT, d.e(modelObject.getTransactionLimit(), bVar));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(BalanceResult.class, e11);
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

    public BalanceResult(Amount balance, Amount amount) {
        s.g(balance, "balance");
        this.balance = balance;
        this.transactionLimit = amount;
    }

    public static /* synthetic */ BalanceResult copy$default(BalanceResult balanceResult, Amount amount, Amount amount2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            amount = balanceResult.balance;
        }
        if ((i11 & 2) != 0) {
            amount2 = balanceResult.transactionLimit;
        }
        return balanceResult.copy(amount, amount2);
    }

    public final Amount component1() {
        return this.balance;
    }

    public final Amount component2() {
        return this.transactionLimit;
    }

    public final BalanceResult copy(Amount balance, Amount amount) {
        s.g(balance, "balance");
        return new BalanceResult(balance, amount);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BalanceResult) {
            BalanceResult balanceResult = (BalanceResult) obj;
            return s.c(this.balance, balanceResult.balance) && s.c(this.transactionLimit, balanceResult.transactionLimit);
        }
        return false;
    }

    public final Amount getBalance() {
        return this.balance;
    }

    public final Amount getTransactionLimit() {
        return this.transactionLimit;
    }

    public int hashCode() {
        int hashCode = this.balance.hashCode() * 31;
        Amount amount = this.transactionLimit;
        return hashCode + (amount == null ? 0 : amount.hashCode());
    }

    public String toString() {
        return "BalanceResult(balance=" + this.balance + ", transactionLimit=" + this.transactionLimit + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i11) {
        s.g(dest, "dest");
        p7.a.d(dest, SERIALIZER.b(this));
    }
}