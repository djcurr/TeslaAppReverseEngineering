package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b5.a;
import b5.b;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.R;
import com.stripe.android.view.PaymentMethodsRecyclerView;

/* loaded from: classes2.dex */
public final class PaymentMethodsActivityBinding implements a {
    public final CoordinatorLayout coordinator;
    public final FrameLayout footerContainer;
    public final LinearProgressIndicator progressBar;
    public final PaymentMethodsRecyclerView recycler;
    private final CoordinatorLayout rootView;
    public final Toolbar toolbar;

    private PaymentMethodsActivityBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, FrameLayout frameLayout, LinearProgressIndicator linearProgressIndicator, PaymentMethodsRecyclerView paymentMethodsRecyclerView, Toolbar toolbar) {
        this.rootView = coordinatorLayout;
        this.coordinator = coordinatorLayout2;
        this.footerContainer = frameLayout;
        this.progressBar = linearProgressIndicator;
        this.recycler = paymentMethodsRecyclerView;
        this.toolbar = toolbar;
    }

    public static PaymentMethodsActivityBinding bind(View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i11 = R.id.footer_container;
        FrameLayout frameLayout = (FrameLayout) b.a(view, i11);
        if (frameLayout != null) {
            i11 = R.id.progress_bar;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) b.a(view, i11);
            if (linearProgressIndicator != null) {
                i11 = R.id.recycler;
                PaymentMethodsRecyclerView paymentMethodsRecyclerView = (PaymentMethodsRecyclerView) b.a(view, i11);
                if (paymentMethodsRecyclerView != null) {
                    i11 = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) b.a(view, i11);
                    if (toolbar != null) {
                        return new PaymentMethodsActivityBinding(coordinatorLayout, coordinatorLayout, frameLayout, linearProgressIndicator, paymentMethodsRecyclerView, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static PaymentMethodsActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PaymentMethodsActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.payment_methods_activity, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}