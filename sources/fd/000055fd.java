package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import b5.a;
import b5.b;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class StripeGooglePayButtonBinding implements a {
    public final ImageView googlePayButtonContent;
    public final RelativeLayout googlePayButtonIcon;
    public final PrimaryButton primaryButton;
    private final View rootView;

    private StripeGooglePayButtonBinding(View view, ImageView imageView, RelativeLayout relativeLayout, PrimaryButton primaryButton) {
        this.rootView = view;
        this.googlePayButtonContent = imageView;
        this.googlePayButtonIcon = relativeLayout;
        this.primaryButton = primaryButton;
    }

    public static StripeGooglePayButtonBinding bind(View view) {
        int i11 = R.id.google_pay_button_content;
        ImageView imageView = (ImageView) b.a(view, i11);
        if (imageView != null) {
            i11 = R.id.google_pay_button_icon;
            RelativeLayout relativeLayout = (RelativeLayout) b.a(view, i11);
            if (relativeLayout != null) {
                i11 = R.id.primary_button;
                PrimaryButton primaryButton = (PrimaryButton) b.a(view, i11);
                if (primaryButton != null) {
                    return new StripeGooglePayButtonBinding(view, imageView, relativeLayout, primaryButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static StripeGooglePayButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.stripe_google_pay_button, viewGroup);
        return bind(viewGroup);
    }

    @Override // b5.a
    public View getRoot() {
        return this.rootView;
    }
}