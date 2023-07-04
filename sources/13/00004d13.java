package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b5.a;
import b5.b;
import com.stripe.android.R;
import com.stripe.android.view.PaymentFlowViewPager;

/* loaded from: classes2.dex */
public final class PaymentFlowActivityBinding implements a {
    private final FrameLayout rootView;
    public final PaymentFlowViewPager shippingFlowViewpager;

    private PaymentFlowActivityBinding(FrameLayout frameLayout, PaymentFlowViewPager paymentFlowViewPager) {
        this.rootView = frameLayout;
        this.shippingFlowViewpager = paymentFlowViewPager;
    }

    public static PaymentFlowActivityBinding bind(View view) {
        int i11 = R.id.shipping_flow_viewpager;
        PaymentFlowViewPager paymentFlowViewPager = (PaymentFlowViewPager) b.a(view, i11);
        if (paymentFlowViewPager != null) {
            return new PaymentFlowActivityBinding((FrameLayout) view, paymentFlowViewPager);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static PaymentFlowActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PaymentFlowActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.payment_flow_activity, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}