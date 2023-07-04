package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b5.a;
import com.stripe.android.R;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class StripeCountryDropdownItemBinding implements a {
    private final TextView rootView;
    public final TextView text1;

    private StripeCountryDropdownItemBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.text1 = textView2;
    }

    public static StripeCountryDropdownItemBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new StripeCountryDropdownItemBinding(textView, textView);
    }

    public static StripeCountryDropdownItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeCountryDropdownItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.stripe_country_dropdown_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public TextView getRoot() {
        return this.rootView;
    }
}