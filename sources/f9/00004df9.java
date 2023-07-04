package com.stripe.android.googlepaylauncher;

import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.googlepaylauncher.GooglePayLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class GooglePayConfigConversionKtxKt {

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GooglePayLauncher.BillingAddressConfig.Format.values().length];
            iArr[GooglePayLauncher.BillingAddressConfig.Format.Min.ordinal()] = 1;
            iArr[GooglePayLauncher.BillingAddressConfig.Format.Full.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GooglePayPaymentMethodLauncher.BillingAddressConfig.Format.values().length];
            iArr2[GooglePayPaymentMethodLauncher.BillingAddressConfig.Format.Min.ordinal()] = 1;
            iArr2[GooglePayPaymentMethodLauncher.BillingAddressConfig.Format.Full.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final GooglePayJsonFactory.BillingAddressParameters convert(GooglePayLauncher.BillingAddressConfig billingAddressConfig) {
        GooglePayJsonFactory.BillingAddressParameters.Format format;
        s.g(billingAddressConfig, "<this>");
        boolean isRequired$payments_core_release = billingAddressConfig.isRequired$payments_core_release();
        int i11 = WhenMappings.$EnumSwitchMapping$0[billingAddressConfig.getFormat$payments_core_release().ordinal()];
        if (i11 == 1) {
            format = GooglePayJsonFactory.BillingAddressParameters.Format.Min;
        } else if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            format = GooglePayJsonFactory.BillingAddressParameters.Format.Full;
        }
        return new GooglePayJsonFactory.BillingAddressParameters(isRequired$payments_core_release, format, billingAddressConfig.isPhoneNumberRequired$payments_core_release());
    }

    public static final GooglePayJsonFactory.BillingAddressParameters convert(GooglePayPaymentMethodLauncher.BillingAddressConfig billingAddressConfig) {
        GooglePayJsonFactory.BillingAddressParameters.Format format;
        s.g(billingAddressConfig, "<this>");
        boolean isRequired = billingAddressConfig.isRequired();
        int i11 = WhenMappings.$EnumSwitchMapping$1[billingAddressConfig.getFormat().ordinal()];
        if (i11 == 1) {
            format = GooglePayJsonFactory.BillingAddressParameters.Format.Min;
        } else if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            format = GooglePayJsonFactory.BillingAddressParameters.Format.Full;
        }
        return new GooglePayJsonFactory.BillingAddressParameters(isRequired, format, billingAddressConfig.isPhoneNumberRequired());
    }
}