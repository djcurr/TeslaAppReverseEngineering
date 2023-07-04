package com.stripe.android;

import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.StripeIntent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public abstract class StripeIntentResult<T extends StripeIntent> implements StripeModel {
    public static final int $stable = 0;
    private final int outcomeFromFlow;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Outcome {
        public static final int CANCELED = 3;
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int FAILED = 2;
        public static final int SUCCEEDED = 1;
        public static final int TIMEDOUT = 4;
        public static final int UNKNOWN = 0;

        /* loaded from: classes2.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int CANCELED = 3;
            public static final int FAILED = 2;
            public static final int SUCCEEDED = 1;
            public static final int TIMEDOUT = 4;
            public static final int UNKNOWN = 0;

            private Companion() {
            }
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            iArr[StripeIntent.Status.RequiresAction.ordinal()] = 1;
            iArr[StripeIntent.Status.Canceled.ordinal()] = 2;
            iArr[StripeIntent.Status.RequiresPaymentMethod.ordinal()] = 3;
            iArr[StripeIntent.Status.Succeeded.ordinal()] = 4;
            iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 5;
            iArr[StripeIntent.Status.RequiresConfirmation.ordinal()] = 6;
            iArr[StripeIntent.Status.Processing.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StripeIntent.NextActionType.values().length];
            iArr2[StripeIntent.NextActionType.RedirectToUrl.ordinal()] = 1;
            iArr2[StripeIntent.NextActionType.UseStripeSdk.ordinal()] = 2;
            iArr2[StripeIntent.NextActionType.AlipayRedirect.ordinal()] = 3;
            iArr2[StripeIntent.NextActionType.BlikAuthorize.ordinal()] = 4;
            iArr2[StripeIntent.NextActionType.WeChatPayRedirect.ordinal()] = 5;
            iArr2[StripeIntent.NextActionType.DisplayOxxoDetails.ordinal()] = 6;
            iArr2[StripeIntent.NextActionType.VerifyWithMicrodeposits.ordinal()] = 7;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public StripeIntentResult(int i11) {
        this.outcomeFromFlow = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r3 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int determineOutcome(com.stripe.android.model.StripeIntent.Status r3, int r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L3
            return r4
        L3:
            if (r3 != 0) goto L7
            r3 = -1
            goto Lf
        L7:
            int[] r4 = com.stripe.android.StripeIntentResult.WhenMappings.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r4[r3]
        Lf:
            r4 = 3
            r0 = 0
            r1 = 1
            switch(r3) {
                case 1: goto L35;
                case 2: goto L40;
                case 3: goto L33;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L31;
                case 7: goto L17;
                default: goto L15;
            }
        L15:
            r4 = r0
            goto L40
        L17:
            com.stripe.android.model.StripeIntent r3 = r2.getIntent()
            com.stripe.android.model.PaymentMethod r3 = r3.getPaymentMethod()
            if (r3 != 0) goto L23
        L21:
            r3 = r0
            goto L2f
        L23:
            com.stripe.android.model.PaymentMethod$Type r3 = r3.type
            if (r3 != 0) goto L28
            goto L21
        L28:
            boolean r3 = r3.hasDelayedSettlement()
            if (r3 != r1) goto L21
            r3 = r1
        L2f:
            if (r3 == 0) goto L15
        L31:
            r4 = r1
            goto L40
        L33:
            r4 = 2
            goto L40
        L35:
            com.stripe.android.model.StripeIntent r3 = r2.getIntent()
            boolean r3 = r2.isNextActionSuccessState(r3)
            if (r3 == 0) goto L40
            goto L31
        L40:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeIntentResult.determineOutcome(com.stripe.android.model.StripeIntent$Status, int):int");
    }

    public static /* synthetic */ void getOutcome$annotations() {
    }

    private final boolean isNextActionSuccessState(StripeIntent stripeIntent) {
        StripeIntent.NextActionType nextActionType = stripeIntent.getNextActionType();
        switch (nextActionType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[nextActionType.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return false;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 6:
            case 7:
                return true;
        }
    }

    public abstract String getFailureMessage();

    public abstract T getIntent();

    public final int getOutcome() {
        return determineOutcome(getIntent().getStatus(), this.outcomeFromFlow);
    }
}