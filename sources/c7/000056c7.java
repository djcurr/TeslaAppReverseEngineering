package com.stripe.android.paymentsheet.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.StripeIntent;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class FragmentConfig implements Parcelable {
    public static final Parcelable.Creator<FragmentConfig> CREATOR = new Creator();
    private final boolean isGooglePayReady;
    private final SavedSelection savedSelection;
    private final StripeIntent stripeIntent;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<FragmentConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FragmentConfig createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new FragmentConfig((StripeIntent) parcel.readParcelable(FragmentConfig.class.getClassLoader()), parcel.readInt() != 0, (SavedSelection) parcel.readParcelable(FragmentConfig.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FragmentConfig[] newArray(int i11) {
            return new FragmentConfig[i11];
        }
    }

    public FragmentConfig(StripeIntent stripeIntent, boolean z11, SavedSelection savedSelection) {
        s.g(stripeIntent, "stripeIntent");
        s.g(savedSelection, "savedSelection");
        this.stripeIntent = stripeIntent;
        this.isGooglePayReady = z11;
        this.savedSelection = savedSelection;
    }

    public static /* synthetic */ FragmentConfig copy$default(FragmentConfig fragmentConfig, StripeIntent stripeIntent, boolean z11, SavedSelection savedSelection, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            stripeIntent = fragmentConfig.stripeIntent;
        }
        if ((i11 & 2) != 0) {
            z11 = fragmentConfig.isGooglePayReady;
        }
        if ((i11 & 4) != 0) {
            savedSelection = fragmentConfig.savedSelection;
        }
        return fragmentConfig.copy(stripeIntent, z11, savedSelection);
    }

    public final StripeIntent component1() {
        return this.stripeIntent;
    }

    public final boolean component2() {
        return this.isGooglePayReady;
    }

    public final SavedSelection component3() {
        return this.savedSelection;
    }

    public final FragmentConfig copy(StripeIntent stripeIntent, boolean z11, SavedSelection savedSelection) {
        s.g(stripeIntent, "stripeIntent");
        s.g(savedSelection, "savedSelection");
        return new FragmentConfig(stripeIntent, z11, savedSelection);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FragmentConfig) {
            FragmentConfig fragmentConfig = (FragmentConfig) obj;
            return s.c(this.stripeIntent, fragmentConfig.stripeIntent) && this.isGooglePayReady == fragmentConfig.isGooglePayReady && s.c(this.savedSelection, fragmentConfig.savedSelection);
        }
        return false;
    }

    public final SavedSelection getSavedSelection() {
        return this.savedSelection;
    }

    public final StripeIntent getStripeIntent() {
        return this.stripeIntent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.stripeIntent.hashCode() * 31;
        boolean z11 = this.isGooglePayReady;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return ((hashCode + i11) * 31) + this.savedSelection.hashCode();
    }

    public final boolean isGooglePayReady() {
        return this.isGooglePayReady;
    }

    public String toString() {
        return "FragmentConfig(stripeIntent=" + this.stripeIntent + ", isGooglePayReady=" + this.isGooglePayReady + ", savedSelection=" + this.savedSelection + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeParcelable(this.stripeIntent, i11);
        out.writeInt(this.isGooglePayReady ? 1 : 0);
        out.writeParcelable(this.savedSelection, i11);
    }
}