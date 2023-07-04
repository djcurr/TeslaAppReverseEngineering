package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.stripe.android.model.PaymentMethod;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PaymentMethodsRecyclerView extends RecyclerView {
    private h00.l<? super PaymentMethod, vz.b0> paymentMethodSelectedCallback;
    private PaymentMethod tappedPaymentMethod;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRecyclerView(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ PaymentMethodsRecyclerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final /* synthetic */ void attachItemTouchHelper$payments_core_release(l.i callback) {
        kotlin.jvm.internal.s.g(callback, "callback");
        new androidx.recyclerview.widget.l(callback).g(this);
    }

    public final h00.l<PaymentMethod, vz.b0> getPaymentMethodSelectedCallback$payments_core_release() {
        return this.paymentMethodSelectedCallback;
    }

    public final PaymentMethod getTappedPaymentMethod$payments_core_release() {
        return this.tappedPaymentMethod;
    }

    public final void setPaymentMethodSelectedCallback$payments_core_release(h00.l<? super PaymentMethod, vz.b0> lVar) {
        kotlin.jvm.internal.s.g(lVar, "<set-?>");
        this.paymentMethodSelectedCallback = lVar;
    }

    public final void setTappedPaymentMethod$payments_core_release(PaymentMethod paymentMethod) {
        this.tappedPaymentMethod = paymentMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRecyclerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        this.paymentMethodSelectedCallback = PaymentMethodsRecyclerView$paymentMethodSelectedCallback$1.INSTANCE;
        setHasFixedSize(false);
        setLayoutManager(new LinearLayoutManager(context));
        setItemAnimator(new androidx.recyclerview.widget.g() { // from class: com.stripe.android.view.PaymentMethodsRecyclerView.1
            @Override // androidx.recyclerview.widget.RecyclerView.m
            public void onAnimationFinished(RecyclerView.e0 viewHolder) {
                kotlin.jvm.internal.s.g(viewHolder, "viewHolder");
                super.onAnimationFinished(viewHolder);
                PaymentMethod tappedPaymentMethod$payments_core_release = PaymentMethodsRecyclerView.this.getTappedPaymentMethod$payments_core_release();
                if (tappedPaymentMethod$payments_core_release != null) {
                    PaymentMethodsRecyclerView.this.getPaymentMethodSelectedCallback$payments_core_release().invoke(tappedPaymentMethod$payments_core_release);
                }
                PaymentMethodsRecyclerView.this.setTappedPaymentMethod$payments_core_release(null);
            }
        });
    }
}