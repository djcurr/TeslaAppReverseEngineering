package com.stripe.android.paymentsheet.flowcontroller;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.SavedSelection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class InitData implements Parcelable {
    public static final Parcelable.Creator<InitData> CREATOR = new Creator();
    private final ClientSecret clientSecret;
    private final PaymentSheet.Configuration config;
    private final boolean isGooglePayReady;
    private final List<PaymentMethod> paymentMethods;
    private final SavedSelection savedSelection;
    private final StripeIntent stripeIntent;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<InitData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InitData createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            PaymentSheet.Configuration createFromParcel = parcel.readInt() == 0 ? null : PaymentSheet.Configuration.CREATOR.createFromParcel(parcel);
            ClientSecret clientSecret = (ClientSecret) parcel.readParcelable(InitData.class.getClassLoader());
            StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(InitData.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(parcel.readParcelable(InitData.class.getClassLoader()));
            }
            return new InitData(createFromParcel, clientSecret, stripeIntent, arrayList, (SavedSelection) parcel.readParcelable(InitData.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InitData[] newArray(int i11) {
            return new InitData[i11];
        }
    }

    public InitData(PaymentSheet.Configuration configuration, ClientSecret clientSecret, StripeIntent stripeIntent, List<PaymentMethod> paymentMethods, SavedSelection savedSelection, boolean z11) {
        s.g(clientSecret, "clientSecret");
        s.g(stripeIntent, "stripeIntent");
        s.g(paymentMethods, "paymentMethods");
        s.g(savedSelection, "savedSelection");
        this.config = configuration;
        this.clientSecret = clientSecret;
        this.stripeIntent = stripeIntent;
        this.paymentMethods = paymentMethods;
        this.savedSelection = savedSelection;
        this.isGooglePayReady = z11;
    }

    public static /* synthetic */ InitData copy$default(InitData initData, PaymentSheet.Configuration configuration, ClientSecret clientSecret, StripeIntent stripeIntent, List list, SavedSelection savedSelection, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            configuration = initData.config;
        }
        if ((i11 & 2) != 0) {
            clientSecret = initData.clientSecret;
        }
        ClientSecret clientSecret2 = clientSecret;
        if ((i11 & 4) != 0) {
            stripeIntent = initData.stripeIntent;
        }
        StripeIntent stripeIntent2 = stripeIntent;
        List<PaymentMethod> list2 = list;
        if ((i11 & 8) != 0) {
            list2 = initData.paymentMethods;
        }
        List list3 = list2;
        if ((i11 & 16) != 0) {
            savedSelection = initData.savedSelection;
        }
        SavedSelection savedSelection2 = savedSelection;
        if ((i11 & 32) != 0) {
            z11 = initData.isGooglePayReady;
        }
        return initData.copy(configuration, clientSecret2, stripeIntent2, list3, savedSelection2, z11);
    }

    public final PaymentSheet.Configuration component1() {
        return this.config;
    }

    public final ClientSecret component2() {
        return this.clientSecret;
    }

    public final StripeIntent component3() {
        return this.stripeIntent;
    }

    public final List<PaymentMethod> component4() {
        return this.paymentMethods;
    }

    public final SavedSelection component5() {
        return this.savedSelection;
    }

    public final boolean component6() {
        return this.isGooglePayReady;
    }

    public final InitData copy(PaymentSheet.Configuration configuration, ClientSecret clientSecret, StripeIntent stripeIntent, List<PaymentMethod> paymentMethods, SavedSelection savedSelection, boolean z11) {
        s.g(clientSecret, "clientSecret");
        s.g(stripeIntent, "stripeIntent");
        s.g(paymentMethods, "paymentMethods");
        s.g(savedSelection, "savedSelection");
        return new InitData(configuration, clientSecret, stripeIntent, paymentMethods, savedSelection, z11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InitData) {
            InitData initData = (InitData) obj;
            return s.c(this.config, initData.config) && s.c(this.clientSecret, initData.clientSecret) && s.c(this.stripeIntent, initData.stripeIntent) && s.c(this.paymentMethods, initData.paymentMethods) && s.c(this.savedSelection, initData.savedSelection) && this.isGooglePayReady == initData.isGooglePayReady;
        }
        return false;
    }

    public final ClientSecret getClientSecret() {
        return this.clientSecret;
    }

    public final PaymentSheet.Configuration getConfig() {
        return this.config;
    }

    public final List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final SavedSelection getSavedSelection() {
        return this.savedSelection;
    }

    public final StripeIntent getStripeIntent() {
        return this.stripeIntent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        PaymentSheet.Configuration configuration = this.config;
        int hashCode = (((((((((configuration == null ? 0 : configuration.hashCode()) * 31) + this.clientSecret.hashCode()) * 31) + this.stripeIntent.hashCode()) * 31) + this.paymentMethods.hashCode()) * 31) + this.savedSelection.hashCode()) * 31;
        boolean z11 = this.isGooglePayReady;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public final boolean isGooglePayReady() {
        return this.isGooglePayReady;
    }

    public String toString() {
        return "InitData(config=" + this.config + ", clientSecret=" + this.clientSecret + ", stripeIntent=" + this.stripeIntent + ", paymentMethods=" + this.paymentMethods + ", savedSelection=" + this.savedSelection + ", isGooglePayReady=" + this.isGooglePayReady + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        PaymentSheet.Configuration configuration = this.config;
        if (configuration == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            configuration.writeToParcel(out, i11);
        }
        out.writeParcelable(this.clientSecret, i11);
        out.writeParcelable(this.stripeIntent, i11);
        List<PaymentMethod> list = this.paymentMethods;
        out.writeInt(list.size());
        for (PaymentMethod paymentMethod : list) {
            out.writeParcelable(paymentMethod, i11);
        }
        out.writeParcelable(this.savedSelection, i11);
        out.writeInt(this.isGooglePayReady ? 1 : 0);
    }
}