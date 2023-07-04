package com.stripe.android.payments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b30.a;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.Source;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;

/* loaded from: classes6.dex */
public abstract class PaymentFlowResult {
    public static final int $stable = 0;

    private PaymentFlowResult() {
    }

    public /* synthetic */ PaymentFlowResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* loaded from: classes6.dex */
    public static final class Validated {
        private final boolean canCancelSource;
        private final String clientSecret;
        private final int flowOutcome;
        private final Source source;
        private final String sourceId;
        private final String stripeAccountId;

        public Validated(String clientSecret, int i11, boolean z11, String str, Source source, String str2) {
            s.g(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            this.flowOutcome = i11;
            this.canCancelSource = z11;
            this.sourceId = str;
            this.source = source;
            this.stripeAccountId = str2;
        }

        public static /* synthetic */ Validated copy$default(Validated validated, String str, int i11, boolean z11, String str2, Source source, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = validated.clientSecret;
            }
            if ((i12 & 2) != 0) {
                i11 = validated.flowOutcome;
            }
            int i13 = i11;
            if ((i12 & 4) != 0) {
                z11 = validated.canCancelSource;
            }
            boolean z12 = z11;
            if ((i12 & 8) != 0) {
                str2 = validated.sourceId;
            }
            String str4 = str2;
            if ((i12 & 16) != 0) {
                source = validated.source;
            }
            Source source2 = source;
            if ((i12 & 32) != 0) {
                str3 = validated.stripeAccountId;
            }
            return validated.copy(str, i13, z12, str4, source2, str3);
        }

        public final String component1() {
            return this.clientSecret;
        }

        public final int component2$payments_core_release() {
            return this.flowOutcome;
        }

        public final boolean component3$payments_core_release() {
            return this.canCancelSource;
        }

        public final String component4$payments_core_release() {
            return this.sourceId;
        }

        public final Source component5$payments_core_release() {
            return this.source;
        }

        public final String component6$payments_core_release() {
            return this.stripeAccountId;
        }

        public final Validated copy(String clientSecret, int i11, boolean z11, String str, Source source, String str2) {
            s.g(clientSecret, "clientSecret");
            return new Validated(clientSecret, i11, z11, str, source, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Validated) {
                Validated validated = (Validated) obj;
                return s.c(this.clientSecret, validated.clientSecret) && this.flowOutcome == validated.flowOutcome && this.canCancelSource == validated.canCancelSource && s.c(this.sourceId, validated.sourceId) && s.c(this.source, validated.source) && s.c(this.stripeAccountId, validated.stripeAccountId);
            }
            return false;
        }

        public final boolean getCanCancelSource$payments_core_release() {
            return this.canCancelSource;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final int getFlowOutcome$payments_core_release() {
            return this.flowOutcome;
        }

        public final Source getSource$payments_core_release() {
            return this.source;
        }

        public final String getSourceId$payments_core_release() {
            return this.sourceId;
        }

        public final String getStripeAccountId$payments_core_release() {
            return this.stripeAccountId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.clientSecret.hashCode() * 31) + Integer.hashCode(this.flowOutcome)) * 31;
            boolean z11 = this.canCancelSource;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode + i11) * 31;
            String str = this.sourceId;
            int hashCode2 = (i12 + (str == null ? 0 : str.hashCode())) * 31;
            Source source = this.source;
            int hashCode3 = (hashCode2 + (source == null ? 0 : source.hashCode())) * 31;
            String str2 = this.stripeAccountId;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Validated(clientSecret=" + this.clientSecret + ", flowOutcome=" + this.flowOutcome + ", canCancelSource=" + this.canCancelSource + ", sourceId=" + ((Object) this.sourceId) + ", source=" + this.source + ", stripeAccountId=" + ((Object) this.stripeAccountId) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ Validated(String str, int i11, boolean z11, String str2, Source source, String str3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11, (i12 & 4) != 0 ? false : z11, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : source, (i12 & 32) != 0 ? null : str3);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Unvalidated implements Parcelable {
        private static final String CLIENT_SECRET_INTENT_ERROR = "Invalid client_secret value in result Intent.";
        private static final String EXTRA = "extra_args";
        private final boolean canCancelSource;
        private final String clientSecret;
        private final StripeException exception;
        private final int flowOutcome;
        private final Source source;
        private final String sourceId;
        private final String stripeAccountId;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Unvalidated> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Companion implements b30.a<Unvalidated> {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Unvalidated fromIntent(Intent intent) {
                Unvalidated unvalidated = intent == null ? null : (Unvalidated) intent.getParcelableExtra(Unvalidated.EXTRA);
                return unvalidated == null ? new Unvalidated(null, 0, null, false, null, null, null, 127, null) : unvalidated;
            }

            /* renamed from: newArray */
            public Unvalidated[] m270newArray(int i11) {
                return (Unvalidated[]) a.C0144a.a(this, i11);
            }

            /* renamed from: create */
            public Unvalidated m269create(Parcel parcel) {
                s.g(parcel, "parcel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                Serializable readSerializable = parcel.readSerializable();
                return new Unvalidated(readString, readInt, readSerializable instanceof StripeException ? (StripeException) readSerializable : null, parcel.readInt() == 1, parcel.readString(), (Source) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString());
            }

            public void write(Unvalidated unvalidated, Parcel parcel, int i11) {
                s.g(unvalidated, "<this>");
                s.g(parcel, "parcel");
                parcel.writeString(unvalidated.getClientSecret());
                parcel.writeInt(unvalidated.getFlowOutcome());
                parcel.writeSerializable(unvalidated.getException());
                r0.intValue();
                r0 = unvalidated.getCanCancelSource$payments_core_release() ? 1 : null;
                parcel.writeInt(r0 == null ? 0 : r0.intValue());
                parcel.writeString(unvalidated.getSourceId$payments_core_release());
                parcel.writeParcelable(unvalidated.getSource$payments_core_release(), i11);
                parcel.writeString(unvalidated.getStripeAccountId$payments_core_release());
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Unvalidated> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unvalidated createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return Unvalidated.Companion.m269create(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unvalidated[] newArray(int i11) {
                return new Unvalidated[i11];
            }
        }

        public Unvalidated() {
            this(null, 0, null, false, null, null, null, 127, null);
        }

        public Unvalidated(String str, int i11, StripeException stripeException, boolean z11, String str2, Source source, String str3) {
            this.clientSecret = str;
            this.flowOutcome = i11;
            this.exception = stripeException;
            this.canCancelSource = z11;
            this.sourceId = str2;
            this.source = source;
            this.stripeAccountId = str3;
        }

        public static /* synthetic */ Unvalidated copy$default(Unvalidated unvalidated, String str, int i11, StripeException stripeException, boolean z11, String str2, Source source, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = unvalidated.clientSecret;
            }
            if ((i12 & 2) != 0) {
                i11 = unvalidated.flowOutcome;
            }
            int i13 = i11;
            if ((i12 & 4) != 0) {
                stripeException = unvalidated.exception;
            }
            StripeException stripeException2 = stripeException;
            if ((i12 & 8) != 0) {
                z11 = unvalidated.canCancelSource;
            }
            boolean z12 = z11;
            if ((i12 & 16) != 0) {
                str2 = unvalidated.sourceId;
            }
            String str4 = str2;
            if ((i12 & 32) != 0) {
                source = unvalidated.source;
            }
            Source source2 = source;
            if ((i12 & 64) != 0) {
                str3 = unvalidated.stripeAccountId;
            }
            return unvalidated.copy(str, i13, stripeException2, z12, str4, source2, str3);
        }

        public final String component1() {
            return this.clientSecret;
        }

        public final int component2() {
            return this.flowOutcome;
        }

        public final StripeException component3() {
            return this.exception;
        }

        public final boolean component4$payments_core_release() {
            return this.canCancelSource;
        }

        public final String component5$payments_core_release() {
            return this.sourceId;
        }

        public final Source component6$payments_core_release() {
            return this.source;
        }

        public final String component7$payments_core_release() {
            return this.stripeAccountId;
        }

        public final Unvalidated copy(String str, int i11, StripeException stripeException, boolean z11, String str2, Source source, String str3) {
            return new Unvalidated(str, i11, stripeException, z11, str2, source, str3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Unvalidated) {
                Unvalidated unvalidated = (Unvalidated) obj;
                return s.c(this.clientSecret, unvalidated.clientSecret) && this.flowOutcome == unvalidated.flowOutcome && s.c(this.exception, unvalidated.exception) && this.canCancelSource == unvalidated.canCancelSource && s.c(this.sourceId, unvalidated.sourceId) && s.c(this.source, unvalidated.source) && s.c(this.stripeAccountId, unvalidated.stripeAccountId);
            }
            return false;
        }

        public final boolean getCanCancelSource$payments_core_release() {
            return this.canCancelSource;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final StripeException getException() {
            return this.exception;
        }

        public final int getFlowOutcome() {
            return this.flowOutcome;
        }

        public final Source getSource$payments_core_release() {
            return this.source;
        }

        public final String getSourceId$payments_core_release() {
            return this.sourceId;
        }

        public final String getStripeAccountId$payments_core_release() {
            return this.stripeAccountId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.clientSecret;
            int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.flowOutcome)) * 31;
            StripeException stripeException = this.exception;
            int hashCode2 = (hashCode + (stripeException == null ? 0 : stripeException.hashCode())) * 31;
            boolean z11 = this.canCancelSource;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode2 + i11) * 31;
            String str2 = this.sourceId;
            int hashCode3 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Source source = this.source;
            int hashCode4 = (hashCode3 + (source == null ? 0 : source.hashCode())) * 31;
            String str3 = this.stripeAccountId;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public final /* synthetic */ Bundle toBundle() {
            return r3.b.a(v.a(EXTRA, this));
        }

        public String toString() {
            return "Unvalidated(clientSecret=" + ((Object) this.clientSecret) + ", flowOutcome=" + this.flowOutcome + ", exception=" + this.exception + ", canCancelSource=" + this.canCancelSource + ", sourceId=" + ((Object) this.sourceId) + ", source=" + this.source + ", stripeAccountId=" + ((Object) this.stripeAccountId) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.stripe.android.payments.PaymentFlowResult.Validated validate$payments_core_release() {
            /*
                r8 = this;
                com.stripe.android.core.exception.StripeException r0 = r8.exception
                boolean r1 = r0 instanceof java.lang.Throwable
                if (r1 != 0) goto L37
                java.lang.String r0 = r8.clientSecret
                r1 = 1
                if (r0 == 0) goto L14
                boolean r0 = kotlin.text.m.w(r0)
                if (r0 == 0) goto L12
                goto L14
            L12:
                r0 = 0
                goto L15
            L14:
                r0 = r1
            L15:
                r0 = r0 ^ r1
                if (r0 == 0) goto L2b
                com.stripe.android.payments.PaymentFlowResult$Validated r0 = new com.stripe.android.payments.PaymentFlowResult$Validated
                java.lang.String r2 = r8.clientSecret
                int r3 = r8.flowOutcome
                boolean r4 = r8.canCancelSource
                java.lang.String r5 = r8.sourceId
                com.stripe.android.model.Source r6 = r8.source
                java.lang.String r7 = r8.stripeAccountId
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
            L2b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Invalid client_secret value in result Intent."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L37:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.PaymentFlowResult.Unvalidated.validate$payments_core_release():com.stripe.android.payments.PaymentFlowResult$Validated");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            Companion.write(this, out, i11);
        }

        public /* synthetic */ Unvalidated(String str, int i11, StripeException stripeException, boolean z11, String str2, Source source, String str3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? null : stripeException, (i12 & 8) == 0 ? z11 : false, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? null : source, (i12 & 64) != 0 ? null : str3);
        }
    }
}