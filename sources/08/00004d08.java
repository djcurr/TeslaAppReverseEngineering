package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import b5.a;
import com.stripe.android.R;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CardBrandSpinnerDropdownBinding implements a {
    private final AppCompatTextView rootView;
    public final AppCompatTextView textView;

    private CardBrandSpinnerDropdownBinding(AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = appCompatTextView;
        this.textView = appCompatTextView2;
    }

    public static CardBrandSpinnerDropdownBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        AppCompatTextView appCompatTextView = (AppCompatTextView) view;
        return new CardBrandSpinnerDropdownBinding(appCompatTextView, appCompatTextView);
    }

    public static CardBrandSpinnerDropdownBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CardBrandSpinnerDropdownBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.card_brand_spinner_dropdown, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public AppCompatTextView getRoot() {
        return this.rootView;
    }
}