package t6;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.model.payments.Amount;
import com.adyen.checkout.core.exception.CheckoutException;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class c extends e7.f {
    public static final Parcelable.Creator<c> CREATOR;

    /* renamed from: d  reason: collision with root package name */
    private final Amount f51672d;

    /* loaded from: classes.dex */
    public static final class a extends e7.c<c> {

        /* renamed from: d  reason: collision with root package name */
        private Amount f51673d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String clientKey) {
            super(context, clientKey);
            kotlin.jvm.internal.s.g(context, "context");
            kotlin.jvm.internal.s.g(clientKey, "clientKey");
            Amount EMPTY = Amount.EMPTY;
            kotlin.jvm.internal.s.f(EMPTY, "EMPTY");
            this.f51673d = EMPTY;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // e7.c
        /* renamed from: h */
        public c b() {
            return new c(this);
        }

        public final Amount i() {
            return this.f51673d;
        }

        public a j(Amount amount) {
            kotlin.jvm.internal.s.g(amount, "amount");
            if (m7.a.isSupported(amount.getCurrency()) && amount.getValue() >= 0) {
                this.f51673d = amount;
                return this;
            }
            throw new CheckoutException("Currency is not valid.");
        }

        public a k(com.adyen.checkout.core.api.d builderEnvironment) {
            kotlin.jvm.internal.s.g(builderEnvironment, "builderEnvironment");
            return (a) super.f(builderEnvironment);
        }

        public a l(Locale builderShopperLocale) {
            kotlin.jvm.internal.s.g(builderShopperLocale, "builderShopperLocale");
            return (a) super.g(builderShopperLocale);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<c> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            if (parcel == null) {
                return null;
            }
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public c[] newArray(int i11) {
            return new c[i11];
        }
    }

    /* renamed from: t6.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1147c {
        private C1147c() {
        }

        public /* synthetic */ C1147c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C1147c(null);
        CREATOR = new b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a builder) {
        super(builder.e(), builder.d(), builder.c());
        kotlin.jvm.internal.s.g(builder, "builder");
        this.f51672d = builder.i();
    }

    public Amount d() {
        return this.f51672d;
    }

    @Override // e7.f, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        kotlin.jvm.internal.s.g(parcel, "parcel");
        super.writeToParcel(parcel, i11);
        p7.a.d(parcel, Amount.SERIALIZER.b(d()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.s.g(parcel, "parcel");
        Amount createFromParcel = Amount.CREATOR.createFromParcel(parcel);
        kotlin.jvm.internal.s.f(createFromParcel, "CREATOR.createFromParcel(parcel)");
        this.f51672d = createFromParcel;
    }
}