package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.stripe.android.model.PaymentMethodCreateParams;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public abstract class AddPaymentMethodView extends FrameLayout {
    public /* synthetic */ AddPaymentMethodView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public abstract PaymentMethodCreateParams getCreateParams();

    public void setCommunicatingProgress(boolean z11) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
    }
}