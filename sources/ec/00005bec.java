package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.stripe.android.databinding.AddPaymentMethodCardViewBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.ShippingInformation;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class AddPaymentMethodCardView extends AddPaymentMethodView {
    private final BillingAddressFields billingAddressFields;
    private final ShippingInfoWidget billingAddressWidget;
    private final CardMultilineWidget cardMultilineWidget;

    /* loaded from: classes6.dex */
    public static final class OnEditorActionListenerImpl implements TextView.OnEditorActionListener {
        private final AddPaymentMethodActivity activity;
        private final AddPaymentMethodCardView addPaymentMethodCardView;
        private final KeyboardController keyboardController;

        public OnEditorActionListenerImpl(AddPaymentMethodActivity activity, AddPaymentMethodCardView addPaymentMethodCardView, KeyboardController keyboardController) {
            kotlin.jvm.internal.s.g(activity, "activity");
            kotlin.jvm.internal.s.g(addPaymentMethodCardView, "addPaymentMethodCardView");
            kotlin.jvm.internal.s.g(keyboardController, "keyboardController");
            this.activity = activity;
            this.addPaymentMethodCardView = addPaymentMethodCardView;
            this.keyboardController = keyboardController;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
            if (i11 == 6) {
                if (this.addPaymentMethodCardView.getCreateParams() != null) {
                    this.keyboardController.hide();
                }
                this.activity.onActionSave();
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BillingAddressFields.values().length];
            iArr[BillingAddressFields.Full.ordinal()] = 1;
            iArr[BillingAddressFields.None.ordinal()] = 2;
            iArr[BillingAddressFields.PostalCode.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodCardView(Context context) {
        this(context, null, 0, null, 14, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodCardView(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, null, 8, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ AddPaymentMethodCardView(Context context, AttributeSet attributeSet, int i11, BillingAddressFields billingAddressFields, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? BillingAddressFields.PostalCode : billingAddressFields);
    }

    private final PaymentMethod.BillingDetails getBillingDetails() {
        ShippingInformation shippingInformation;
        if (this.billingAddressFields != BillingAddressFields.Full || (shippingInformation = this.billingAddressWidget.getShippingInformation()) == null) {
            return null;
        }
        return PaymentMethod.BillingDetails.Companion.create(shippingInformation);
    }

    private final void initEnterListeners(AddPaymentMethodActivity addPaymentMethodActivity) {
        OnEditorActionListenerImpl onEditorActionListenerImpl = new OnEditorActionListenerImpl(addPaymentMethodActivity, this, new KeyboardController(addPaymentMethodActivity));
        this.cardMultilineWidget.getCardNumberEditText().setOnEditorActionListener(onEditorActionListenerImpl);
        this.cardMultilineWidget.getExpiryDateEditText().setOnEditorActionListener(onEditorActionListenerImpl);
        this.cardMultilineWidget.getCvcEditText().setOnEditorActionListener(onEditorActionListenerImpl);
        this.cardMultilineWidget.getPostalCodeEditText$payments_core_release().setOnEditorActionListener(onEditorActionListenerImpl);
    }

    @Override // com.stripe.android.view.AddPaymentMethodView
    public PaymentMethodCreateParams getCreateParams() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.billingAddressFields.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return this.cardMultilineWidget.getPaymentMethodCreateParams();
                }
                throw new NoWhenBranchMatchedException();
            }
            return this.cardMultilineWidget.getPaymentMethodCreateParams();
        }
        PaymentMethodCreateParams.Card paymentMethodCard = this.cardMultilineWidget.getPaymentMethodCard();
        PaymentMethod.BillingDetails billingDetails = getBillingDetails();
        if (paymentMethodCard == null || billingDetails == null) {
            return null;
        }
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, paymentMethodCard, billingDetails, (Map) null, 4, (Object) null);
    }

    @Override // com.stripe.android.view.AddPaymentMethodView
    public void setCommunicatingProgress(boolean z11) {
        this.cardMultilineWidget.setEnabled(!z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodCardView(Context context, AttributeSet attributeSet, int i11, BillingAddressFields billingAddressFields) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(billingAddressFields, "billingAddressFields");
        this.billingAddressFields = billingAddressFields;
        AddPaymentMethodCardViewBinding inflate = AddPaymentMethodCardViewBinding.inflate(LayoutInflater.from(context), this, true);
        kotlin.jvm.internal.s.f(inflate, "inflate(\n            Lay…           true\n        )");
        CardMultilineWidget cardMultilineWidget = inflate.cardMultilineWidget;
        kotlin.jvm.internal.s.f(cardMultilineWidget, "viewBinding.cardMultilineWidget");
        this.cardMultilineWidget = cardMultilineWidget;
        cardMultilineWidget.setShouldShowPostalCode(billingAddressFields == BillingAddressFields.PostalCode);
        ShippingInfoWidget shippingInfoWidget = inflate.billingAddressWidget;
        kotlin.jvm.internal.s.f(shippingInfoWidget, "viewBinding.billingAddressWidget");
        this.billingAddressWidget = shippingInfoWidget;
        if (billingAddressFields == BillingAddressFields.Full) {
            shippingInfoWidget.setVisibility(0);
        }
        AddPaymentMethodActivity addPaymentMethodActivity = context instanceof AddPaymentMethodActivity ? (AddPaymentMethodActivity) context : null;
        if (addPaymentMethodActivity == null) {
            return;
        }
        initEnterListeners(addPaymentMethodActivity);
    }
}