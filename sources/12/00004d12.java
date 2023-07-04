package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b5.a;
import b5.b;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.R;
import com.stripe.android.view.PaymentAuthWebView;

/* loaded from: classes2.dex */
public final class PaymentAuthWebViewActivityBinding implements a {
    public final CircularProgressIndicator progressBar;
    private final CoordinatorLayout rootView;
    public final Toolbar toolbar;
    public final PaymentAuthWebView webView;
    public final FrameLayout webViewContainer;

    private PaymentAuthWebViewActivityBinding(CoordinatorLayout coordinatorLayout, CircularProgressIndicator circularProgressIndicator, Toolbar toolbar, PaymentAuthWebView paymentAuthWebView, FrameLayout frameLayout) {
        this.rootView = coordinatorLayout;
        this.progressBar = circularProgressIndicator;
        this.toolbar = toolbar;
        this.webView = paymentAuthWebView;
        this.webViewContainer = frameLayout;
    }

    public static PaymentAuthWebViewActivityBinding bind(View view) {
        int i11 = R.id.progress_bar;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) b.a(view, i11);
        if (circularProgressIndicator != null) {
            i11 = R.id.toolbar;
            Toolbar toolbar = (Toolbar) b.a(view, i11);
            if (toolbar != null) {
                i11 = R.id.web_view;
                PaymentAuthWebView paymentAuthWebView = (PaymentAuthWebView) b.a(view, i11);
                if (paymentAuthWebView != null) {
                    i11 = R.id.web_view_container;
                    FrameLayout frameLayout = (FrameLayout) b.a(view, i11);
                    if (frameLayout != null) {
                        return new PaymentAuthWebViewActivityBinding((CoordinatorLayout) view, circularProgressIndicator, toolbar, paymentAuthWebView, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static PaymentAuthWebViewActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PaymentAuthWebViewActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.payment_auth_web_view_activity, viewGroup, false);
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