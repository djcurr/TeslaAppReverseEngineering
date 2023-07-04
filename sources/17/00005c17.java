package com.stripe.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.databinding.BecsDebitWidgetBinding;
import com.stripe.android.view.BecsDebitBanks;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.x0;

/* loaded from: classes6.dex */
public final class BecsDebitWidget extends FrameLayout {
    public static final int $stable = 8;
    private ValidParamsCallback validParamsCallback;
    private final vz.k viewBinding$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.BecsDebitWidget$2 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.u implements h00.l<BecsDebitBanks.Bank, vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2() {
            super(1);
            BecsDebitWidget.this = r1;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(BecsDebitBanks.Bank bank) {
            invoke2(bank);
            return vz.b0.f54756a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:101:0x00a1, code lost:
            if (r0.equals("03") == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x00a4, code lost:
            r5 = 6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x00ac, code lost:
            if (r0.equals("01") == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x00b5, code lost:
            if (r0.equals("00") == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0083, code lost:
            if (r0.equals("73") == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x008c, code lost:
            if (r0.equals("08") == false) goto L45;
         */
        /* renamed from: invoke */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke2(com.stripe.android.view.BecsDebitBanks.Bank r5) {
            /*
                r4 = this;
                r0 = 0
                if (r5 == 0) goto L1f
                com.stripe.android.view.BecsDebitWidget r1 = com.stripe.android.view.BecsDebitWidget.this
                com.stripe.android.databinding.BecsDebitWidgetBinding r1 = r1.getViewBinding$payments_core_release()
                com.google.android.material.textfield.TextInputLayout r1 = r1.bsbTextInputLayout
                java.lang.String r2 = r5.getName()
                r1.setHelperText(r2)
                com.stripe.android.view.BecsDebitWidget r1 = com.stripe.android.view.BecsDebitWidget.this
                com.stripe.android.databinding.BecsDebitWidgetBinding r1 = r1.getViewBinding$payments_core_release()
                com.google.android.material.textfield.TextInputLayout r1 = r1.bsbTextInputLayout
                r2 = 1
                r1.setHelperTextEnabled(r2)
                goto L36
            L1f:
                com.stripe.android.view.BecsDebitWidget r1 = com.stripe.android.view.BecsDebitWidget.this
                com.stripe.android.databinding.BecsDebitWidgetBinding r1 = r1.getViewBinding$payments_core_release()
                com.google.android.material.textfield.TextInputLayout r1 = r1.bsbTextInputLayout
                r1.setHelperText(r0)
                com.stripe.android.view.BecsDebitWidget r1 = com.stripe.android.view.BecsDebitWidget.this
                com.stripe.android.databinding.BecsDebitWidgetBinding r1 = r1.getViewBinding$payments_core_release()
                com.google.android.material.textfield.TextInputLayout r1 = r1.bsbTextInputLayout
                r2 = 0
                r1.setHelperTextEnabled(r2)
            L36:
                com.stripe.android.view.BecsDebitWidget r1 = com.stripe.android.view.BecsDebitWidget.this
                com.stripe.android.databinding.BecsDebitWidgetBinding r1 = r1.getViewBinding$payments_core_release()
                com.stripe.android.view.BecsDebitAccountNumberEditText r1 = r1.accountNumberEditText
                if (r5 != 0) goto L41
                goto L4d
            L41:
                java.lang.String r5 = r5.getPrefix()
                if (r5 != 0) goto L48
                goto L4d
            L48:
                r0 = 2
                java.lang.String r0 = kotlin.text.m.i1(r5, r0)
            L4d:
                r5 = 9
                if (r0 == 0) goto Lb7
                int r2 = r0.hashCode()
                r3 = 1536(0x600, float:2.152E-42)
                if (r2 == r3) goto Laf
                r3 = 1537(0x601, float:2.154E-42)
                if (r2 == r3) goto La6
                r3 = 1539(0x603, float:2.157E-42)
                if (r2 == r3) goto L9b
                r3 = 1542(0x606, float:2.161E-42)
                if (r2 == r3) goto L8f
                r3 = 1544(0x608, float:2.164E-42)
                if (r2 == r3) goto L86
                r5 = 1756(0x6dc, float:2.46E-42)
                if (r2 == r5) goto L7d
                r5 = 1784(0x6f8, float:2.5E-42)
                if (r2 == r5) goto L72
                goto Lb7
            L72:
                java.lang.String r5 = "80"
                boolean r5 = r0.equals(r5)
                if (r5 != 0) goto L7b
                goto Lb7
            L7b:
                r5 = 4
                goto Lb8
            L7d:
                java.lang.String r5 = "73"
                boolean r5 = r0.equals(r5)
                if (r5 != 0) goto La4
                goto Lb7
            L86:
                java.lang.String r2 = "08"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto Lb8
                goto Lb7
            L8f:
                java.lang.String r5 = "06"
                boolean r5 = r0.equals(r5)
                if (r5 != 0) goto L98
                goto Lb7
            L98:
                r5 = 8
                goto Lb8
            L9b:
                java.lang.String r5 = "03"
                boolean r5 = r0.equals(r5)
                if (r5 != 0) goto La4
                goto Lb7
            La4:
                r5 = 6
                goto Lb8
            La6:
                java.lang.String r2 = "01"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto Lb8
                goto Lb7
            Laf:
                java.lang.String r2 = "00"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto Lb8
            Lb7:
                r5 = 5
            Lb8:
                r1.setMinLength(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.BecsDebitWidget.AnonymousClass2.invoke2(com.stripe.android.view.BecsDebitBanks$Bank):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.BecsDebitWidget$3 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3() {
            super(0);
            BecsDebitWidget.this = r1;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            BecsDebitWidget.this.getViewBinding$payments_core_release().accountNumberTextInputLayout.requestFocus();
        }
    }

    /* loaded from: classes6.dex */
    public interface ValidParamsCallback {
        void onInputChanged(boolean z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitWidget(Context context) {
        this(context, null, 0, null, 14, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitWidget(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, null, 8, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ BecsDebitWidget(Context context, AttributeSet attributeSet, int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? "" : str);
    }

    public static final /* synthetic */ boolean access$isInputValid(BecsDebitWidget becsDebitWidget) {
        return becsDebitWidget.isInputValid();
    }

    private final void applyAttributes(AttributeSet attributeSet) {
        Context context = getContext();
        kotlin.jvm.internal.s.f(context, "context");
        int[] BecsDebitWidget = R.styleable.BecsDebitWidget;
        kotlin.jvm.internal.s.f(BecsDebitWidget, "BecsDebitWidget");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BecsDebitWidget, 0, 0);
        kotlin.jvm.internal.s.f(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        String string = obtainStyledAttributes.getString(R.styleable.BecsDebitWidget_companyName);
        if (string != null) {
            getViewBinding$payments_core_release().mandateAcceptanceTextView.setCompanyName(string);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isInputValid() {
        /*
            r6 = this;
            com.stripe.android.databinding.BecsDebitWidgetBinding r0 = r6.getViewBinding$payments_core_release()
            com.stripe.android.view.StripeEditText r0 = r0.nameEditText
            java.lang.String r0 = r0.getFieldText$payments_core_release()
            com.stripe.android.databinding.BecsDebitWidgetBinding r1 = r6.getViewBinding$payments_core_release()
            com.stripe.android.view.EmailEditText r1 = r1.emailEditText
            java.lang.String r1 = r1.getEmail()
            com.stripe.android.databinding.BecsDebitWidgetBinding r2 = r6.getViewBinding$payments_core_release()
            com.stripe.android.view.BecsDebitBsbEditText r2 = r2.bsbEditText
            java.lang.String r2 = r2.getBsb$payments_core_release()
            com.stripe.android.databinding.BecsDebitWidgetBinding r3 = r6.getViewBinding$payments_core_release()
            com.stripe.android.view.BecsDebitAccountNumberEditText r3 = r3.accountNumberEditText
            java.lang.String r3 = r3.getAccountNumber()
            boolean r0 = kotlin.text.m.w(r0)
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L5b
            if (r1 == 0) goto L3b
            boolean r0 = kotlin.text.m.w(r1)
            if (r0 == 0) goto L39
            goto L3b
        L39:
            r0 = r5
            goto L3c
        L3b:
            r0 = r4
        L3c:
            if (r0 != 0) goto L5b
            if (r2 == 0) goto L49
            boolean r0 = kotlin.text.m.w(r2)
            if (r0 == 0) goto L47
            goto L49
        L47:
            r0 = r5
            goto L4a
        L49:
            r0 = r4
        L4a:
            if (r0 != 0) goto L5b
            if (r3 == 0) goto L57
            boolean r0 = kotlin.text.m.w(r3)
            if (r0 == 0) goto L55
            goto L57
        L55:
            r0 = r5
            goto L58
        L57:
            r0 = r4
        L58:
            if (r0 != 0) goto L5b
            goto L5c
        L5b:
            r4 = r5
        L5c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.BecsDebitWidget.isInputValid():boolean");
    }

    private final void verifyCompanyName() {
        if (!getViewBinding$payments_core_release().mandateAcceptanceTextView.isValid$payments_core_release()) {
            throw new IllegalArgumentException("A company name is required to render a BecsDebitWidget.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x009e, code lost:
        if (r2 != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c2 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.stripe.android.model.PaymentMethodCreateParams getParams() {
        /*
            r12 = this;
            com.stripe.android.databinding.BecsDebitWidgetBinding r0 = r12.getViewBinding$payments_core_release()
            com.stripe.android.view.StripeEditText r0 = r0.nameEditText
            java.lang.String r4 = r0.getFieldText$payments_core_release()
            com.stripe.android.databinding.BecsDebitWidgetBinding r0 = r12.getViewBinding$payments_core_release()
            com.stripe.android.view.EmailEditText r0 = r0.emailEditText
            java.lang.String r3 = r0.getEmail()
            com.stripe.android.databinding.BecsDebitWidgetBinding r0 = r12.getViewBinding$payments_core_release()
            com.stripe.android.view.BecsDebitBsbEditText r0 = r0.bsbEditText
            java.lang.String r0 = r0.getBsb$payments_core_release()
            com.stripe.android.databinding.BecsDebitWidgetBinding r1 = r12.getViewBinding$payments_core_release()
            com.stripe.android.view.BecsDebitAccountNumberEditText r1 = r1.accountNumberEditText
            java.lang.String r1 = r1.getAccountNumber()
            com.stripe.android.databinding.BecsDebitWidgetBinding r2 = r12.getViewBinding$payments_core_release()
            com.stripe.android.view.StripeEditText r2 = r2.nameEditText
            boolean r5 = kotlin.text.m.w(r4)
            r2.setShouldShowError(r5)
            com.stripe.android.databinding.BecsDebitWidgetBinding r2 = r12.getViewBinding$payments_core_release()
            com.stripe.android.view.EmailEditText r2 = r2.emailEditText
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L48
            boolean r7 = kotlin.text.m.w(r3)
            if (r7 == 0) goto L46
            goto L48
        L46:
            r7 = r5
            goto L49
        L48:
            r7 = r6
        L49:
            r2.setShouldShowError(r7)
            com.stripe.android.databinding.BecsDebitWidgetBinding r2 = r12.getViewBinding$payments_core_release()
            com.stripe.android.view.BecsDebitBsbEditText r2 = r2.bsbEditText
            if (r0 == 0) goto L5d
            boolean r7 = kotlin.text.m.w(r0)
            if (r7 == 0) goto L5b
            goto L5d
        L5b:
            r7 = r5
            goto L5e
        L5d:
            r7 = r6
        L5e:
            r2.setShouldShowError(r7)
            com.stripe.android.databinding.BecsDebitWidgetBinding r2 = r12.getViewBinding$payments_core_release()
            com.stripe.android.view.BecsDebitAccountNumberEditText r2 = r2.accountNumberEditText
            if (r1 == 0) goto L72
            boolean r7 = kotlin.text.m.w(r1)
            if (r7 == 0) goto L70
            goto L72
        L70:
            r7 = r5
            goto L73
        L72:
            r7 = r6
        L73:
            r2.setShouldShowError(r7)
            boolean r2 = kotlin.text.m.w(r4)
            if (r2 != 0) goto Lc2
            if (r3 == 0) goto L87
            boolean r2 = kotlin.text.m.w(r3)
            if (r2 == 0) goto L85
            goto L87
        L85:
            r2 = r5
            goto L88
        L87:
            r2 = r6
        L88:
            if (r2 != 0) goto Lc2
            if (r0 == 0) goto L95
            boolean r2 = kotlin.text.m.w(r0)
            if (r2 == 0) goto L93
            goto L95
        L93:
            r2 = r5
            goto L96
        L95:
            r2 = r6
        L96:
            if (r2 != 0) goto Lc2
            if (r1 == 0) goto La0
            boolean r2 = kotlin.text.m.w(r1)
            if (r2 == 0) goto La1
        La0:
            r5 = r6
        La1:
            if (r5 == 0) goto La4
            goto Lc2
        La4:
            com.stripe.android.model.PaymentMethodCreateParams$Companion r8 = com.stripe.android.model.PaymentMethodCreateParams.Companion
            com.stripe.android.model.PaymentMethodCreateParams$AuBecsDebit r9 = new com.stripe.android.model.PaymentMethodCreateParams$AuBecsDebit
            r9.<init>(r0, r1)
            com.stripe.android.model.PaymentMethod$BillingDetails r0 = new com.stripe.android.model.PaymentMethod$BillingDetails
            r2 = 0
            r5 = 0
            r6 = 9
            r7 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1 = 0
            r10 = 4
            r11 = 0
            r6 = r8
            r7 = r9
            r8 = r0
            r9 = r1
            com.stripe.android.model.PaymentMethodCreateParams r0 = com.stripe.android.model.PaymentMethodCreateParams.Companion.create$default(r6, r7, r8, r9, r10, r11)
            return r0
        Lc2:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.BecsDebitWidget.getParams():com.stripe.android.model.PaymentMethodCreateParams");
    }

    public final ValidParamsCallback getValidParamsCallback() {
        return this.validParamsCallback;
    }

    public final BecsDebitWidgetBinding getViewBinding$payments_core_release() {
        return (BecsDebitWidgetBinding) this.viewBinding$delegate.getValue();
    }

    public final void setValidParamsCallback(ValidParamsCallback validParamsCallback) {
        kotlin.jvm.internal.s.g(validParamsCallback, "<set-?>");
        this.validParamsCallback = validParamsCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecsDebitWidget(Context context, AttributeSet attributeSet, int i11, String companyName) {
        super(context, attributeSet, i11);
        vz.k a11;
        Set<StripeEditText> i12;
        Set<StripeEditText> i13;
        boolean w11;
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(companyName, "companyName");
        a11 = vz.m.a(new BecsDebitWidget$viewBinding$2(context, this));
        this.viewBinding$delegate = a11;
        this.validParamsCallback = new ValidParamsCallback() { // from class: com.stripe.android.view.BecsDebitWidget$validParamsCallback$1
            @Override // com.stripe.android.view.BecsDebitWidget.ValidParamsCallback
            public void onInputChanged(boolean z11) {
            }
        };
        if (Build.VERSION.SDK_INT >= 26) {
            getViewBinding$payments_core_release().nameEditText.setAutofillHints(new String[]{"name"});
            getViewBinding$payments_core_release().emailEditText.setAutofillHints(new String[]{"emailAddress"});
        }
        i12 = x0.i(getViewBinding$payments_core_release().nameEditText, getViewBinding$payments_core_release().emailEditText, getViewBinding$payments_core_release().bsbEditText, getViewBinding$payments_core_release().accountNumberEditText);
        for (StripeEditText field : i12) {
            kotlin.jvm.internal.s.f(field, "field");
            field.addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.BecsDebitWidget$_init_$lambda-1$$inlined$doAfterTextChanged$1
                {
                    BecsDebitWidget.this = this;
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    BecsDebitWidget.this.getValidParamsCallback().onInputChanged(BecsDebitWidget.access$isInputValid(BecsDebitWidget.this));
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
                }
            });
        }
        getViewBinding$payments_core_release().bsbEditText.setOnBankChangedCallback(new AnonymousClass2());
        getViewBinding$payments_core_release().bsbEditText.setOnCompletedCallback(new AnonymousClass3());
        EmailEditText emailEditText = getViewBinding$payments_core_release().emailEditText;
        StripeEditText stripeEditText = getViewBinding$payments_core_release().nameEditText;
        kotlin.jvm.internal.s.f(stripeEditText, "viewBinding.nameEditText");
        emailEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(stripeEditText));
        BecsDebitBsbEditText becsDebitBsbEditText = getViewBinding$payments_core_release().bsbEditText;
        EmailEditText emailEditText2 = getViewBinding$payments_core_release().emailEditText;
        kotlin.jvm.internal.s.f(emailEditText2, "viewBinding.emailEditText");
        becsDebitBsbEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(emailEditText2));
        BecsDebitAccountNumberEditText becsDebitAccountNumberEditText = getViewBinding$payments_core_release().accountNumberEditText;
        BecsDebitBsbEditText becsDebitBsbEditText2 = getViewBinding$payments_core_release().bsbEditText;
        kotlin.jvm.internal.s.f(becsDebitBsbEditText2, "viewBinding.bsbEditText");
        becsDebitAccountNumberEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(becsDebitBsbEditText2));
        getViewBinding$payments_core_release().nameEditText.setErrorMessage$payments_core_release(getResources().getString(R.string.becs_widget_name_required));
        StripeEditText stripeEditText2 = getViewBinding$payments_core_release().nameEditText;
        TextInputLayout textInputLayout = getViewBinding$payments_core_release().nameTextInputLayout;
        kotlin.jvm.internal.s.f(textInputLayout, "viewBinding.nameTextInputLayout");
        stripeEditText2.setErrorMessageListener(new ErrorListener(textInputLayout));
        EmailEditText emailEditText3 = getViewBinding$payments_core_release().emailEditText;
        TextInputLayout textInputLayout2 = getViewBinding$payments_core_release().emailTextInputLayout;
        kotlin.jvm.internal.s.f(textInputLayout2, "viewBinding.emailTextInputLayout");
        emailEditText3.setErrorMessageListener(new ErrorListener(textInputLayout2));
        BecsDebitBsbEditText becsDebitBsbEditText3 = getViewBinding$payments_core_release().bsbEditText;
        TextInputLayout textInputLayout3 = getViewBinding$payments_core_release().bsbTextInputLayout;
        kotlin.jvm.internal.s.f(textInputLayout3, "viewBinding.bsbTextInputLayout");
        becsDebitBsbEditText3.setErrorMessageListener(new ErrorListener(textInputLayout3));
        BecsDebitAccountNumberEditText becsDebitAccountNumberEditText2 = getViewBinding$payments_core_release().accountNumberEditText;
        TextInputLayout textInputLayout4 = getViewBinding$payments_core_release().accountNumberTextInputLayout;
        kotlin.jvm.internal.s.f(textInputLayout4, "viewBinding.accountNumberTextInputLayout");
        becsDebitAccountNumberEditText2.setErrorMessageListener(new ErrorListener(textInputLayout4));
        i13 = x0.i(getViewBinding$payments_core_release().nameEditText, getViewBinding$payments_core_release().emailEditText);
        for (final StripeEditText field2 : i13) {
            kotlin.jvm.internal.s.f(field2, "field");
            field2.addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.BecsDebitWidget$_init_$lambda-3$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    StripeEditText.this.setShouldShowError(false);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
                }
            });
        }
        w11 = kotlin.text.v.w(companyName);
        companyName = w11 ^ true ? companyName : null;
        if (companyName != null) {
            getViewBinding$payments_core_release().mandateAcceptanceTextView.setCompanyName(companyName);
        }
        applyAttributes(attributeSet);
        verifyCompanyName();
    }
}