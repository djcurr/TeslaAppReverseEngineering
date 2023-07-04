package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Patterns;
import com.stripe.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class EmailEditText extends StripeEditText {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmailEditText(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmailEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ EmailEditText(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? g.a.A : i11);
    }

    public final String getEmail() {
        boolean w11;
        String string;
        w11 = kotlin.text.v.w(getFieldText$payments_core_release());
        if (w11) {
            string = getResources().getString(R.string.becs_widget_email_required);
        } else {
            string = !Patterns.EMAIL_ADDRESS.matcher(getFieldText$payments_core_release()).matches() ? getResources().getString(R.string.becs_widget_email_invalid) : null;
        }
        setErrorMessage$payments_core_release(string);
        String fieldText$payments_core_release = getFieldText$payments_core_release();
        if (getErrorMessage$payments_core_release() == null) {
            return fieldText$payments_core_release;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
    }
}