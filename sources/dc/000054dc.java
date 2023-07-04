package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public abstract class PaymentOptionResult implements Parcelable {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_RESULT = "extra_activity_result";
    private final List<PaymentMethod> paymentMethods;
    private final int resultCode;

    /* loaded from: classes6.dex */
    public static final class Canceled extends PaymentOptionResult {
        private final Throwable mostRecentError;
        private final List<PaymentMethod> paymentMethods;
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                kotlin.jvm.internal.s.g(parcel, "parcel");
                Throwable th2 = (Throwable) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        arrayList2.add(parcel.readParcelable(Canceled.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new Canceled(th2, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i11) {
                return new Canceled[i11];
            }
        }

        public /* synthetic */ Canceled(Throwable th2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(th2, (i11 & 2) != 0 ? null : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Canceled copy$default(Canceled canceled, Throwable th2, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = canceled.mostRecentError;
            }
            if ((i11 & 2) != 0) {
                list = canceled.getPaymentMethods();
            }
            return canceled.copy(th2, list);
        }

        public final Throwable component1() {
            return this.mostRecentError;
        }

        public final List<PaymentMethod> component2() {
            return getPaymentMethods();
        }

        public final Canceled copy(Throwable th2, List<PaymentMethod> list) {
            return new Canceled(th2, list);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Canceled) {
                Canceled canceled = (Canceled) obj;
                return kotlin.jvm.internal.s.c(this.mostRecentError, canceled.mostRecentError) && kotlin.jvm.internal.s.c(getPaymentMethods(), canceled.getPaymentMethods());
            }
            return false;
        }

        public final Throwable getMostRecentError() {
            return this.mostRecentError;
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionResult
        public List<PaymentMethod> getPaymentMethods() {
            return this.paymentMethods;
        }

        public int hashCode() {
            Throwable th2 = this.mostRecentError;
            return ((th2 == null ? 0 : th2.hashCode()) * 31) + (getPaymentMethods() != null ? getPaymentMethods().hashCode() : 0);
        }

        public String toString() {
            return "Canceled(mostRecentError=" + this.mostRecentError + ", paymentMethods=" + getPaymentMethods() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeSerializable(this.mostRecentError);
            List<PaymentMethod> list = this.paymentMethods;
            if (list == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(list.size());
            for (PaymentMethod paymentMethod : list) {
                out.writeParcelable(paymentMethod, i11);
            }
        }

        public Canceled(Throwable th2, List<PaymentMethod> list) {
            super(0, list, null);
            this.mostRecentError = th2;
            this.paymentMethods = list;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PaymentOptionResult fromIntent$paymentsheet_release(Intent intent) {
            if (intent == null) {
                return null;
            }
            return (PaymentOptionResult) intent.getParcelableExtra("extra_activity_result");
        }
    }

    /* loaded from: classes6.dex */
    public static final class Failed extends PaymentOptionResult {
        private final Throwable error;
        private final List<PaymentMethod> paymentMethods;
        public static final Parcelable.Creator<Failed> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Failed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                kotlin.jvm.internal.s.g(parcel, "parcel");
                Throwable th2 = (Throwable) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        arrayList2.add(parcel.readParcelable(Failed.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new Failed(th2, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i11) {
                return new Failed[i11];
            }
        }

        public /* synthetic */ Failed(Throwable th2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(th2, (i11 & 2) != 0 ? null : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Failed copy$default(Failed failed, Throwable th2, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = failed.error;
            }
            if ((i11 & 2) != 0) {
                list = failed.getPaymentMethods();
            }
            return failed.copy(th2, list);
        }

        public final Throwable component1() {
            return this.error;
        }

        public final List<PaymentMethod> component2() {
            return getPaymentMethods();
        }

        public final Failed copy(Throwable error, List<PaymentMethod> list) {
            kotlin.jvm.internal.s.g(error, "error");
            return new Failed(error, list);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Failed) {
                Failed failed = (Failed) obj;
                return kotlin.jvm.internal.s.c(this.error, failed.error) && kotlin.jvm.internal.s.c(getPaymentMethods(), failed.getPaymentMethods());
            }
            return false;
        }

        public final Throwable getError() {
            return this.error;
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionResult
        public List<PaymentMethod> getPaymentMethods() {
            return this.paymentMethods;
        }

        public int hashCode() {
            return (this.error.hashCode() * 31) + (getPaymentMethods() == null ? 0 : getPaymentMethods().hashCode());
        }

        public String toString() {
            return "Failed(error=" + this.error + ", paymentMethods=" + getPaymentMethods() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeSerializable(this.error);
            List<PaymentMethod> list = this.paymentMethods;
            if (list == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(list.size());
            for (PaymentMethod paymentMethod : list) {
                out.writeParcelable(paymentMethod, i11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(Throwable error, List<PaymentMethod> list) {
            super(0, null, 2, null);
            kotlin.jvm.internal.s.g(error, "error");
            this.error = error;
            this.paymentMethods = list;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Succeeded extends PaymentOptionResult {
        private final List<PaymentMethod> paymentMethods;
        private final PaymentSelection paymentSelection;
        public static final Parcelable.Creator<Succeeded> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Succeeded> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Succeeded createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                kotlin.jvm.internal.s.g(parcel, "parcel");
                PaymentSelection paymentSelection = (PaymentSelection) parcel.readParcelable(Succeeded.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        arrayList2.add(parcel.readParcelable(Succeeded.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new Succeeded(paymentSelection, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Succeeded[] newArray(int i11) {
                return new Succeeded[i11];
            }
        }

        public /* synthetic */ Succeeded(PaymentSelection paymentSelection, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentSelection, (i11 & 2) != 0 ? null : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Succeeded copy$default(Succeeded succeeded, PaymentSelection paymentSelection, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paymentSelection = succeeded.paymentSelection;
            }
            if ((i11 & 2) != 0) {
                list = succeeded.getPaymentMethods();
            }
            return succeeded.copy(paymentSelection, list);
        }

        public final PaymentSelection component1() {
            return this.paymentSelection;
        }

        public final List<PaymentMethod> component2() {
            return getPaymentMethods();
        }

        public final Succeeded copy(PaymentSelection paymentSelection, List<PaymentMethod> list) {
            kotlin.jvm.internal.s.g(paymentSelection, "paymentSelection");
            return new Succeeded(paymentSelection, list);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Succeeded) {
                Succeeded succeeded = (Succeeded) obj;
                return kotlin.jvm.internal.s.c(this.paymentSelection, succeeded.paymentSelection) && kotlin.jvm.internal.s.c(getPaymentMethods(), succeeded.getPaymentMethods());
            }
            return false;
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionResult
        public List<PaymentMethod> getPaymentMethods() {
            return this.paymentMethods;
        }

        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public int hashCode() {
            return (this.paymentSelection.hashCode() * 31) + (getPaymentMethods() == null ? 0 : getPaymentMethods().hashCode());
        }

        public String toString() {
            return "Succeeded(paymentSelection=" + this.paymentSelection + ", paymentMethods=" + getPaymentMethods() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeParcelable(this.paymentSelection, i11);
            List<PaymentMethod> list = this.paymentMethods;
            if (list == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(list.size());
            for (PaymentMethod paymentMethod : list) {
                out.writeParcelable(paymentMethod, i11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Succeeded(PaymentSelection paymentSelection, List<PaymentMethod> list) {
            super(-1, null, 2, null);
            kotlin.jvm.internal.s.g(paymentSelection, "paymentSelection");
            this.paymentSelection = paymentSelection;
            this.paymentMethods = list;
        }
    }

    private PaymentOptionResult(int i11, List<PaymentMethod> list) {
        this.resultCode = i11;
        this.paymentMethods = list;
    }

    public /* synthetic */ PaymentOptionResult(int i11, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, list);
    }

    public List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final Bundle toBundle() {
        return r3.b.a(vz.v.a("extra_activity_result", this));
    }

    public /* synthetic */ PaymentOptionResult(int i11, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : list, null);
    }
}