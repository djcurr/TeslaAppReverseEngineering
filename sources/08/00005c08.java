package com.stripe.android.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import com.stripe.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class BecsDebitAccountNumberEditText extends StripeEditText {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 9;
    private int minLength;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitAccountNumberEditText(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitAccountNumberEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ BecsDebitAccountNumberEditText(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? g.a.A : i11);
    }

    public final String getAccountNumber() {
        boolean w11;
        String string;
        w11 = kotlin.text.v.w(getFieldText$payments_core_release());
        if (w11) {
            string = getResources().getString(R.string.becs_widget_account_number_required);
        } else {
            string = getFieldText$payments_core_release().length() < this.minLength ? getResources().getString(R.string.becs_widget_account_number_incomplete) : null;
        }
        setErrorMessage$payments_core_release(string);
        String fieldText$payments_core_release = getFieldText$payments_core_release();
        if (getErrorMessage$payments_core_release() == null) {
            return fieldText$payments_core_release;
        }
        return null;
    }

    public final int getMinLength() {
        return this.minLength;
    }

    public final void setMinLength(int i11) {
        this.minLength = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecsDebitAccountNumberEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        this.minLength = 5;
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(9)});
        setInputType(2);
        addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.BecsDebitAccountNumberEditText$special$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                BecsDebitAccountNumberEditText.this.setShouldShowError(false);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
            }
        });
    }
}