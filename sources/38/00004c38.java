package com.stripe.android.auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import f.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import r3.b;
import vz.v;

/* loaded from: classes2.dex */
public final class PaymentBrowserAuthContract extends a<Args, PaymentFlowResult.Unvalidated> {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_ARGS = "extra_args";

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Args parseArgs$payments_core_release(Intent intent) {
            s.g(intent, "intent");
            return (Args) intent.getParcelableExtra(PaymentBrowserAuthContract.EXTRA_ARGS);
        }
    }

    @Override // f.a
    public Intent createIntent(Context context, Args input) {
        Class cls;
        Window window;
        s.g(context, "context");
        s.g(input, "input");
        boolean z11 = input.hasDefaultReturnUrl$payments_core_release(DefaultReturnUrl.Companion.create(context)) || input.isInstantApp();
        Bundle bundle = Args.copy$default(input, null, 0, null, null, null, false, null, null, false, false, (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null) ? null : Integer.valueOf(window.getStatusBarColor()), null, false, 7167, null).toBundle();
        if (z11) {
            cls = StripeBrowserLauncherActivity.class;
        } else if (!z11) {
            cls = PaymentAuthWebViewActivity.class;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Intent intent = new Intent(context, cls);
        intent.putExtras(bundle);
        return intent;
    }

    @Override // f.a
    public PaymentFlowResult.Unvalidated parseResult(int i11, Intent intent) {
        PaymentFlowResult.Unvalidated unvalidated = intent == null ? null : (PaymentFlowResult.Unvalidated) intent.getParcelableExtra(EXTRA_ARGS);
        return unvalidated == null ? new PaymentFlowResult.Unvalidated(null, 0, null, false, null, null, null, 127, null) : unvalidated;
    }

    /* loaded from: classes2.dex */
    public static final class Args implements Parcelable {
        public static final CREATOR CREATOR = new CREATOR(null);
        private final String clientSecret;
        private final boolean enableLogging;
        private final boolean isInstantApp;
        private final String objectId;
        private final String publishableKey;
        private final int requestCode;
        private final String returnUrl;
        private final boolean shouldCancelIntentOnUserNavigation;
        private final boolean shouldCancelSource;
        private final Integer statusBarColor;
        private final String stripeAccountId;
        private final StripeToolbarCustomization toolbarCustomization;
        private final String url;

        /* loaded from: classes2.dex */
        public static final class CREATOR implements Parcelable.Creator<Args> {
            private CREATOR() {
            }

            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public Args createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Args(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        public Args(String objectId, int i11, String clientSecret, String url, String str, boolean z11, StripeToolbarCustomization stripeToolbarCustomization, String str2, boolean z12, boolean z13, Integer num, String publishableKey, boolean z14) {
            s.g(objectId, "objectId");
            s.g(clientSecret, "clientSecret");
            s.g(url, "url");
            s.g(publishableKey, "publishableKey");
            this.objectId = objectId;
            this.requestCode = i11;
            this.clientSecret = clientSecret;
            this.url = url;
            this.returnUrl = str;
            this.enableLogging = z11;
            this.toolbarCustomization = stripeToolbarCustomization;
            this.stripeAccountId = str2;
            this.shouldCancelSource = z12;
            this.shouldCancelIntentOnUserNavigation = z13;
            this.statusBarColor = num;
            this.publishableKey = publishableKey;
            this.isInstantApp = z14;
        }

        public static /* synthetic */ Args copy$default(Args args, String str, int i11, String str2, String str3, String str4, boolean z11, StripeToolbarCustomization stripeToolbarCustomization, String str5, boolean z12, boolean z13, Integer num, String str6, boolean z14, int i12, Object obj) {
            return args.copy((i12 & 1) != 0 ? args.objectId : str, (i12 & 2) != 0 ? args.requestCode : i11, (i12 & 4) != 0 ? args.clientSecret : str2, (i12 & 8) != 0 ? args.url : str3, (i12 & 16) != 0 ? args.returnUrl : str4, (i12 & 32) != 0 ? args.enableLogging : z11, (i12 & 64) != 0 ? args.toolbarCustomization : stripeToolbarCustomization, (i12 & 128) != 0 ? args.stripeAccountId : str5, (i12 & 256) != 0 ? args.shouldCancelSource : z12, (i12 & 512) != 0 ? args.shouldCancelIntentOnUserNavigation : z13, (i12 & 1024) != 0 ? args.statusBarColor : num, (i12 & 2048) != 0 ? args.publishableKey : str6, (i12 & 4096) != 0 ? args.isInstantApp : z14);
        }

        public final String component1() {
            return this.objectId;
        }

        public final boolean component10() {
            return this.shouldCancelIntentOnUserNavigation;
        }

        public final Integer component11() {
            return this.statusBarColor;
        }

        public final String component12() {
            return this.publishableKey;
        }

        public final boolean component13() {
            return this.isInstantApp;
        }

        public final int component2() {
            return this.requestCode;
        }

        public final String component3() {
            return this.clientSecret;
        }

        public final String component4() {
            return this.url;
        }

        public final String component5() {
            return this.returnUrl;
        }

        public final boolean component6() {
            return this.enableLogging;
        }

        public final StripeToolbarCustomization component7() {
            return this.toolbarCustomization;
        }

        public final String component8() {
            return this.stripeAccountId;
        }

        public final boolean component9() {
            return this.shouldCancelSource;
        }

        public final Args copy(String objectId, int i11, String clientSecret, String url, String str, boolean z11, StripeToolbarCustomization stripeToolbarCustomization, String str2, boolean z12, boolean z13, Integer num, String publishableKey, boolean z14) {
            s.g(objectId, "objectId");
            s.g(clientSecret, "clientSecret");
            s.g(url, "url");
            s.g(publishableKey, "publishableKey");
            return new Args(objectId, i11, clientSecret, url, str, z11, stripeToolbarCustomization, str2, z12, z13, num, publishableKey, z14);
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
                return s.c(this.objectId, args.objectId) && this.requestCode == args.requestCode && s.c(this.clientSecret, args.clientSecret) && s.c(this.url, args.url) && s.c(this.returnUrl, args.returnUrl) && this.enableLogging == args.enableLogging && s.c(this.toolbarCustomization, args.toolbarCustomization) && s.c(this.stripeAccountId, args.stripeAccountId) && this.shouldCancelSource == args.shouldCancelSource && this.shouldCancelIntentOnUserNavigation == args.shouldCancelIntentOnUserNavigation && s.c(this.statusBarColor, args.statusBarColor) && s.c(this.publishableKey, args.publishableKey) && this.isInstantApp == args.isInstantApp;
            }
            return false;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final boolean getEnableLogging() {
            return this.enableLogging;
        }

        public final String getObjectId() {
            return this.objectId;
        }

        public final String getPublishableKey() {
            return this.publishableKey;
        }

        public final int getRequestCode() {
            return this.requestCode;
        }

        public final String getReturnUrl() {
            return this.returnUrl;
        }

        public final boolean getShouldCancelIntentOnUserNavigation() {
            return this.shouldCancelIntentOnUserNavigation;
        }

        public final boolean getShouldCancelSource() {
            return this.shouldCancelSource;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public final StripeToolbarCustomization getToolbarCustomization() {
            return this.toolbarCustomization;
        }

        public final String getUrl() {
            return this.url;
        }

        public final boolean hasDefaultReturnUrl$payments_core_release(DefaultReturnUrl defaultReturnUrl) {
            s.g(defaultReturnUrl, "defaultReturnUrl");
            return s.c(this.returnUrl, defaultReturnUrl.getValue());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((((this.objectId.hashCode() * 31) + Integer.hashCode(this.requestCode)) * 31) + this.clientSecret.hashCode()) * 31) + this.url.hashCode()) * 31;
            String str = this.returnUrl;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            boolean z11 = this.enableLogging;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode2 + i11) * 31;
            StripeToolbarCustomization stripeToolbarCustomization = this.toolbarCustomization;
            int hashCode3 = (i12 + (stripeToolbarCustomization == null ? 0 : stripeToolbarCustomization.hashCode())) * 31;
            String str2 = this.stripeAccountId;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            boolean z12 = this.shouldCancelSource;
            int i13 = z12;
            if (z12 != 0) {
                i13 = 1;
            }
            int i14 = (hashCode4 + i13) * 31;
            boolean z13 = this.shouldCancelIntentOnUserNavigation;
            int i15 = z13;
            if (z13 != 0) {
                i15 = 1;
            }
            int i16 = (i14 + i15) * 31;
            Integer num = this.statusBarColor;
            int hashCode5 = (((i16 + (num != null ? num.hashCode() : 0)) * 31) + this.publishableKey.hashCode()) * 31;
            boolean z14 = this.isInstantApp;
            return hashCode5 + (z14 ? 1 : z14 ? 1 : 0);
        }

        public final boolean isInstantApp() {
            return this.isInstantApp;
        }

        public final Bundle toBundle() {
            return b.a(v.a(PaymentBrowserAuthContract.EXTRA_ARGS, this));
        }

        public String toString() {
            return "Args(objectId=" + this.objectId + ", requestCode=" + this.requestCode + ", clientSecret=" + this.clientSecret + ", url=" + this.url + ", returnUrl=" + ((Object) this.returnUrl) + ", enableLogging=" + this.enableLogging + ", toolbarCustomization=" + this.toolbarCustomization + ", stripeAccountId=" + ((Object) this.stripeAccountId) + ", shouldCancelSource=" + this.shouldCancelSource + ", shouldCancelIntentOnUserNavigation=" + this.shouldCancelIntentOnUserNavigation + ", statusBarColor=" + this.statusBarColor + ", publishableKey=" + this.publishableKey + ", isInstantApp=" + this.isInstantApp + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            s.g(parcel, "parcel");
            parcel.writeString(this.objectId);
            parcel.writeInt(this.requestCode);
            parcel.writeString(this.clientSecret);
            parcel.writeString(this.url);
            parcel.writeString(this.returnUrl);
            parcel.writeByte(this.enableLogging ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.toolbarCustomization, i11);
            parcel.writeString(this.stripeAccountId);
            parcel.writeByte(this.shouldCancelSource ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.shouldCancelIntentOnUserNavigation ? (byte) 1 : (byte) 0);
            parcel.writeValue(this.statusBarColor);
            parcel.writeString(this.publishableKey);
            parcel.writeByte(this.isInstantApp ? (byte) 1 : (byte) 0);
        }

        public /* synthetic */ Args(String str, int i11, String str2, String str3, String str4, boolean z11, StripeToolbarCustomization stripeToolbarCustomization, String str5, boolean z12, boolean z13, Integer num, String str6, boolean z14, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11, str2, str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? false : z11, (i12 & 64) != 0 ? null : stripeToolbarCustomization, (i12 & 128) != 0 ? null : str5, (i12 & 256) != 0 ? false : z12, (i12 & 512) != 0 ? true : z13, (i12 & 1024) != 0 ? null : num, str6, z14);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Args(android.os.Parcel r18) {
            /*
                r17 = this;
                r0 = r18
                java.lang.String r1 = "parcel"
                kotlin.jvm.internal.s.g(r0, r1)
                java.lang.String r1 = r18.readString()
                java.lang.String r2 = ""
                if (r1 != 0) goto L11
                r4 = r2
                goto L12
            L11:
                r4 = r1
            L12:
                int r5 = r18.readInt()
                java.lang.String r1 = r18.readString()
                if (r1 != 0) goto L1e
                r6 = r2
                goto L1f
            L1e:
                r6 = r1
            L1f:
                java.lang.String r1 = r18.readString()
                if (r1 != 0) goto L27
                r7 = r2
                goto L28
            L27:
                r7 = r1
            L28:
                java.lang.String r8 = r18.readString()
                byte r1 = r18.readByte()
                r3 = 1
                r9 = 0
                if (r1 == 0) goto L36
                r1 = r3
                goto L37
            L36:
                r1 = r9
            L37:
                java.lang.Class<com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization> r10 = com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization.class
                java.lang.ClassLoader r10 = r10.getClassLoader()
                android.os.Parcelable r10 = r0.readParcelable(r10)
                com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization r10 = (com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization) r10
                java.lang.String r11 = r18.readString()
                byte r12 = r18.readByte()
                if (r12 == 0) goto L4f
                r12 = r3
                goto L50
            L4f:
                r12 = r9
            L50:
                byte r13 = r18.readByte()
                if (r13 == 0) goto L58
                r13 = r3
                goto L59
            L58:
                r13 = r9
            L59:
                java.lang.Class r14 = java.lang.Integer.TYPE
                java.lang.ClassLoader r14 = r14.getClassLoader()
                java.lang.Object r14 = r0.readValue(r14)
                boolean r15 = r14 instanceof java.lang.Integer
                if (r15 == 0) goto L6a
                java.lang.Integer r14 = (java.lang.Integer) r14
                goto L6b
            L6a:
                r14 = 0
            L6b:
                java.lang.String r15 = r18.readString()
                if (r15 != 0) goto L72
                r15 = r2
            L72:
                byte r0 = r18.readByte()
                if (r0 == 0) goto L7b
                r16 = r3
                goto L7d
            L7b:
                r16 = r9
            L7d:
                r3 = r17
                r9 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.auth.PaymentBrowserAuthContract.Args.<init>(android.os.Parcel):void");
        }
    }
}