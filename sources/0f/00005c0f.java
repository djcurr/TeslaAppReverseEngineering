package com.stripe.android.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import com.stripe.android.R;
import com.stripe.android.view.BecsDebitBanks;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class BecsDebitBsbEditText extends StripeEditText {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final int MAX_LENGTH = 7;
    @Deprecated
    private static final int MIN_VALIDATION_THRESHOLD = 2;
    @Deprecated
    private static final String SEPARATOR = "-";
    private final BecsDebitBanks banks;
    private h00.l<? super BecsDebitBanks.Bank, vz.b0> onBankChangedCallback;
    private h00.a<vz.b0> onCompletedCallback;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitBsbEditText(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitBsbEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ BecsDebitBsbEditText(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? g.a.A : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatBsb(String str) {
        String i12;
        String j12;
        List l11;
        String l02;
        if (str.length() >= 3) {
            i12 = kotlin.text.y.i1(str, 3);
            j12 = kotlin.text.y.j1(str, str.length() - 3);
            l11 = wz.w.l(i12, j12);
            l02 = wz.e0.l0(l11, SEPARATOR, null, null, 0, null, null, 62, null);
            return l02;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BecsDebitBanks.Bank getBank() {
        return this.banks.byPrefix(getFieldText$payments_core_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isComplete() {
        return getBank() != null && getFieldText$payments_core_release().length() == 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateIcon(boolean z11) {
        int i11;
        if (z11) {
            i11 = R.drawable.stripe_ic_bank_error;
        } else {
            i11 = R.drawable.stripe_ic_bank_becs;
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(i11, 0, 0, 0);
    }

    public final String getBsb$payments_core_release() {
        String string;
        if (getFieldText$payments_core_release().length() < 2) {
            string = getResources().getString(R.string.becs_widget_bsb_incomplete);
        } else if (getBank() == null) {
            string = getResources().getString(R.string.becs_widget_bsb_invalid);
        } else {
            string = getFieldText$payments_core_release().length() < 7 ? getResources().getString(R.string.becs_widget_bsb_incomplete) : null;
        }
        setErrorMessage$payments_core_release(string);
        String fieldText$payments_core_release = getFieldText$payments_core_release();
        StringBuilder sb2 = new StringBuilder();
        int length = fieldText$payments_core_release.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = fieldText$payments_core_release.charAt(i11);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "filterTo(StringBuilder(), predicate).toString()");
        if (isComplete()) {
            return sb3;
        }
        return null;
    }

    public final h00.l<BecsDebitBanks.Bank, vz.b0> getOnBankChangedCallback() {
        return this.onBankChangedCallback;
    }

    public final h00.a<vz.b0> getOnCompletedCallback() {
        return this.onCompletedCallback;
    }

    public final void setOnBankChangedCallback(h00.l<? super BecsDebitBanks.Bank, vz.b0> lVar) {
        kotlin.jvm.internal.s.g(lVar, "<set-?>");
        this.onBankChangedCallback = lVar;
    }

    public final void setOnCompletedCallback(h00.a<vz.b0> aVar) {
        kotlin.jvm.internal.s.g(aVar, "<set-?>");
        this.onCompletedCallback = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecsDebitBsbEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        this.banks = new BecsDebitBanks(context, false, 2, (DefaultConstructorMarker) null);
        this.onBankChangedCallback = BecsDebitBsbEditText$onBankChangedCallback$1.INSTANCE;
        this.onCompletedCallback = BecsDebitBsbEditText$onCompletedCallback$1.INSTANCE;
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(7)});
        setInputType(2);
        addTextChangedListener(new StripeTextWatcher() { // from class: com.stripe.android.view.BecsDebitBsbEditText.1
            private String formattedBsb;
            private boolean ignoreChanges;
            private Integer newCursorPosition;

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String str;
                int m11;
                if (this.ignoreChanges) {
                    return;
                }
                this.ignoreChanges = true;
                if (!BecsDebitBsbEditText.this.isLastKeyDelete() && (str = this.formattedBsb) != null) {
                    BecsDebitBsbEditText.this.setText(str);
                    Integer num = this.newCursorPosition;
                    if (num != null) {
                        BecsDebitBsbEditText becsDebitBsbEditText = BecsDebitBsbEditText.this;
                        m11 = m00.l.m(num.intValue(), 0, becsDebitBsbEditText.getFieldText$payments_core_release().length());
                        becsDebitBsbEditText.setSelection(m11);
                    }
                }
                this.formattedBsb = null;
                this.newCursorPosition = null;
                this.ignoreChanges = false;
                boolean z11 = BecsDebitBsbEditText.this.getBank() == null && BecsDebitBsbEditText.this.getFieldText$payments_core_release().length() >= 2;
                BecsDebitBsbEditText becsDebitBsbEditText2 = BecsDebitBsbEditText.this;
                becsDebitBsbEditText2.setErrorMessage$payments_core_release(z11 ? becsDebitBsbEditText2.getResources().getString(R.string.becs_widget_bsb_invalid) : null);
                BecsDebitBsbEditText becsDebitBsbEditText3 = BecsDebitBsbEditText.this;
                becsDebitBsbEditText3.setShouldShowError(becsDebitBsbEditText3.getErrorMessage$payments_core_release() != null);
                BecsDebitBsbEditText.this.getOnBankChangedCallback().invoke(BecsDebitBsbEditText.this.getBank());
                BecsDebitBsbEditText.this.updateIcon(z11);
                if (BecsDebitBsbEditText.this.isComplete()) {
                    BecsDebitBsbEditText.this.getOnCompletedCallback().invoke();
                }
            }

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
                if (!this.ignoreChanges && i12 <= 4) {
                    String obj = charSequence == null ? null : charSequence.toString();
                    if (obj == null) {
                        obj = "";
                    }
                    StringBuilder sb2 = new StringBuilder();
                    int length = obj.length();
                    for (int i15 = 0; i15 < length; i15++) {
                        char charAt = obj.charAt(i15);
                        if (Character.isDigit(charAt)) {
                            sb2.append(charAt);
                        }
                    }
                    String sb3 = sb2.toString();
                    kotlin.jvm.internal.s.f(sb3, "filterTo(StringBuilder(), predicate).toString()");
                    String formatBsb = BecsDebitBsbEditText.this.formatBsb(sb3);
                    this.formattedBsb = formatBsb;
                    this.newCursorPosition = formatBsb != null ? Integer.valueOf(formatBsb.length()) : null;
                }
            }
        });
    }
}