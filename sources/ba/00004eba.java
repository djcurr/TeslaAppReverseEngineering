package com.stripe.android.link;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.view.ActivityStarter;
import f.a;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import r3.b;
import vz.v;

/* loaded from: classes6.dex */
public final class LinkActivityContract extends a<Args, LinkActivityResult> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_ARGS = "com.stripe.android.link.LinkActivityContract.extra_args";
    public static final String EXTRA_RESULT = "com.stripe.android.link.LinkActivityContract.extra_result";

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Result implements ActivityStarter.Result {
        private final LinkActivityResult linkResult;
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Result((LinkActivityResult) parcel.readParcelable(Result.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i11) {
                return new Result[i11];
            }
        }

        public Result(LinkActivityResult linkResult) {
            s.g(linkResult, "linkResult");
            this.linkResult = linkResult;
        }

        public static /* synthetic */ Result copy$default(Result result, LinkActivityResult linkActivityResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                linkActivityResult = result.linkResult;
            }
            return result.copy(linkActivityResult);
        }

        public final LinkActivityResult component1() {
            return this.linkResult;
        }

        public final Result copy(LinkActivityResult linkResult) {
            s.g(linkResult, "linkResult");
            return new Result(linkResult);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && s.c(this.linkResult, ((Result) obj).linkResult);
        }

        public final LinkActivityResult getLinkResult() {
            return this.linkResult;
        }

        public int hashCode() {
            return this.linkResult.hashCode();
        }

        @Override // com.stripe.android.view.ActivityStarter.Result
        public Bundle toBundle() {
            return b.a(v.a(LinkActivityContract.EXTRA_RESULT, this));
        }

        public String toString() {
            return "Result(linkResult=" + this.linkResult + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeParcelable(this.linkResult, i11);
        }
    }

    @Override // f.a
    public Intent createIntent(Context context, Args input) {
        s.g(context, "context");
        s.g(input, "input");
        Intent putExtra = new Intent(context, LinkActivity.class).putExtra(EXTRA_ARGS, input);
        s.f(putExtra, "Intent(context, LinkActi…tExtra(EXTRA_ARGS, input)");
        return putExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // f.a
    public LinkActivityResult parseResult(int i11, Intent intent) {
        Result result;
        LinkActivityResult linkActivityResult = null;
        if (intent != null && (result = (Result) intent.getParcelableExtra(EXTRA_RESULT)) != null) {
            linkActivityResult = result.getLinkResult();
        }
        return linkActivityResult == null ? LinkActivityResult.Canceled.INSTANCE : linkActivityResult;
    }

    /* loaded from: classes6.dex */
    public static final class Args implements ActivityStarter.Args {
        private final boolean completePayment;
        private final String customerEmail;
        private final InjectionParams injectionParams;
        private final String merchantName;
        private final StripeIntent stripeIntent;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Args fromIntent$link_release(Intent intent) {
                s.g(intent, "intent");
                return (Args) intent.getParcelableExtra(LinkActivityContract.EXTRA_ARGS);
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Args((StripeIntent) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : InjectionParams.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        /* loaded from: classes6.dex */
        public static final class InjectionParams implements Parcelable {
            public static final Parcelable.Creator<InjectionParams> CREATOR = new Creator();
            private final boolean enableLogging;
            private final String injectorKey;
            private final Set<String> productUsage;
            private final String publishableKey;
            private final String stripeAccountId;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<InjectionParams> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InjectionParams createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new InjectionParams(readString, linkedHashSet, parcel.readInt() != 0, parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final InjectionParams[] newArray(int i11) {
                    return new InjectionParams[i11];
                }
            }

            public InjectionParams(@InjectorKey String injectorKey, Set<String> productUsage, boolean z11, String publishableKey, String str) {
                s.g(injectorKey, "injectorKey");
                s.g(productUsage, "productUsage");
                s.g(publishableKey, "publishableKey");
                this.injectorKey = injectorKey;
                this.productUsage = productUsage;
                this.enableLogging = z11;
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
            }

            public static /* synthetic */ InjectionParams copy$default(InjectionParams injectionParams, String str, Set set, boolean z11, String str2, String str3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = injectionParams.injectorKey;
                }
                Set<String> set2 = set;
                if ((i11 & 2) != 0) {
                    set2 = injectionParams.productUsage;
                }
                Set set3 = set2;
                if ((i11 & 4) != 0) {
                    z11 = injectionParams.enableLogging;
                }
                boolean z12 = z11;
                if ((i11 & 8) != 0) {
                    str2 = injectionParams.publishableKey;
                }
                String str4 = str2;
                if ((i11 & 16) != 0) {
                    str3 = injectionParams.stripeAccountId;
                }
                return injectionParams.copy(str, set3, z12, str4, str3);
            }

            public final String component1() {
                return this.injectorKey;
            }

            public final Set<String> component2() {
                return this.productUsage;
            }

            public final boolean component3() {
                return this.enableLogging;
            }

            public final String component4() {
                return this.publishableKey;
            }

            public final String component5() {
                return this.stripeAccountId;
            }

            public final InjectionParams copy(@InjectorKey String injectorKey, Set<String> productUsage, boolean z11, String publishableKey, String str) {
                s.g(injectorKey, "injectorKey");
                s.g(productUsage, "productUsage");
                s.g(publishableKey, "publishableKey");
                return new InjectionParams(injectorKey, productUsage, z11, publishableKey, str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof InjectionParams) {
                    InjectionParams injectionParams = (InjectionParams) obj;
                    return s.c(this.injectorKey, injectionParams.injectorKey) && s.c(this.productUsage, injectionParams.productUsage) && this.enableLogging == injectionParams.enableLogging && s.c(this.publishableKey, injectionParams.publishableKey) && s.c(this.stripeAccountId, injectionParams.stripeAccountId);
                }
                return false;
            }

            public final boolean getEnableLogging() {
                return this.enableLogging;
            }

            public final String getInjectorKey() {
                return this.injectorKey;
            }

            public final Set<String> getProductUsage() {
                return this.productUsage;
            }

            public final String getPublishableKey() {
                return this.publishableKey;
            }

            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = ((this.injectorKey.hashCode() * 31) + this.productUsage.hashCode()) * 31;
                boolean z11 = this.enableLogging;
                int i11 = z11;
                if (z11 != 0) {
                    i11 = 1;
                }
                int hashCode2 = (((hashCode + i11) * 31) + this.publishableKey.hashCode()) * 31;
                String str = this.stripeAccountId;
                return hashCode2 + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "InjectionParams(injectorKey=" + this.injectorKey + ", productUsage=" + this.productUsage + ", enableLogging=" + this.enableLogging + ", publishableKey=" + this.publishableKey + ", stripeAccountId=" + ((Object) this.stripeAccountId) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.injectorKey);
                Set<String> set = this.productUsage;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
                out.writeInt(this.enableLogging ? 1 : 0);
                out.writeString(this.publishableKey);
                out.writeString(this.stripeAccountId);
            }
        }

        public Args(StripeIntent stripeIntent, boolean z11, String merchantName, String str, InjectionParams injectionParams) {
            s.g(stripeIntent, "stripeIntent");
            s.g(merchantName, "merchantName");
            this.stripeIntent = stripeIntent;
            this.completePayment = z11;
            this.merchantName = merchantName;
            this.customerEmail = str;
            this.injectionParams = injectionParams;
        }

        public static /* synthetic */ Args copy$default(Args args, StripeIntent stripeIntent, boolean z11, String str, String str2, InjectionParams injectionParams, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                stripeIntent = args.stripeIntent;
            }
            if ((i11 & 2) != 0) {
                z11 = args.completePayment;
            }
            boolean z12 = z11;
            if ((i11 & 4) != 0) {
                str = args.merchantName;
            }
            String str3 = str;
            if ((i11 & 8) != 0) {
                str2 = args.customerEmail;
            }
            String str4 = str2;
            if ((i11 & 16) != 0) {
                injectionParams = args.injectionParams;
            }
            return args.copy(stripeIntent, z12, str3, str4, injectionParams);
        }

        public final StripeIntent component1$link_release() {
            return this.stripeIntent;
        }

        public final boolean component2$link_release() {
            return this.completePayment;
        }

        public final String component3$link_release() {
            return this.merchantName;
        }

        public final String component4$link_release() {
            return this.customerEmail;
        }

        public final InjectionParams component5$link_release() {
            return this.injectionParams;
        }

        public final Args copy(StripeIntent stripeIntent, boolean z11, String merchantName, String str, InjectionParams injectionParams) {
            s.g(stripeIntent, "stripeIntent");
            s.g(merchantName, "merchantName");
            return new Args(stripeIntent, z11, merchantName, str, injectionParams);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Args) {
                Args args = (Args) obj;
                return s.c(this.stripeIntent, args.stripeIntent) && this.completePayment == args.completePayment && s.c(this.merchantName, args.merchantName) && s.c(this.customerEmail, args.customerEmail) && s.c(this.injectionParams, args.injectionParams);
            }
            return false;
        }

        public final boolean getCompletePayment$link_release() {
            return this.completePayment;
        }

        public final String getCustomerEmail$link_release() {
            return this.customerEmail;
        }

        public final InjectionParams getInjectionParams$link_release() {
            return this.injectionParams;
        }

        public final String getMerchantName$link_release() {
            return this.merchantName;
        }

        public final StripeIntent getStripeIntent$link_release() {
            return this.stripeIntent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.stripeIntent.hashCode() * 31;
            boolean z11 = this.completePayment;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int hashCode2 = (((hashCode + i11) * 31) + this.merchantName.hashCode()) * 31;
            String str = this.customerEmail;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            InjectionParams injectionParams = this.injectionParams;
            return hashCode3 + (injectionParams != null ? injectionParams.hashCode() : 0);
        }

        public String toString() {
            return "Args(stripeIntent=" + this.stripeIntent + ", completePayment=" + this.completePayment + ", merchantName=" + this.merchantName + ", customerEmail=" + ((Object) this.customerEmail) + ", injectionParams=" + this.injectionParams + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeParcelable(this.stripeIntent, i11);
            out.writeInt(this.completePayment ? 1 : 0);
            out.writeString(this.merchantName);
            out.writeString(this.customerEmail);
            InjectionParams injectionParams = this.injectionParams;
            if (injectionParams == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            injectionParams.writeToParcel(out, i11);
        }

        public /* synthetic */ Args(StripeIntent stripeIntent, boolean z11, String str, String str2, InjectionParams injectionParams, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(stripeIntent, z11, str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : injectionParams);
        }
    }
}