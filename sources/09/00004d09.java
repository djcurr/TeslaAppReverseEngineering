package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import b5.a;
import com.stripe.android.R;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CardBrandSpinnerMainBinding implements a {
    public final AppCompatImageView image;
    private final AppCompatImageView rootView;

    private CardBrandSpinnerMainBinding(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.rootView = appCompatImageView;
        this.image = appCompatImageView2;
    }

    public static CardBrandSpinnerMainBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        AppCompatImageView appCompatImageView = (AppCompatImageView) view;
        return new CardBrandSpinnerMainBinding(appCompatImageView, appCompatImageView);
    }

    public static CardBrandSpinnerMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CardBrandSpinnerMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.card_brand_spinner_main, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public AppCompatImageView getRoot() {
        return this.rootView;
    }
}