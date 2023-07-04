package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import b5.a;
import b5.b;
import com.stripe.android.R;
import com.stripe.android.view.CardWidgetProgressView;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CardBrandViewBinding implements a {
    public final ImageView icon;
    public final CardWidgetProgressView progress;
    private final View rootView;

    private CardBrandViewBinding(View view, ImageView imageView, CardWidgetProgressView cardWidgetProgressView) {
        this.rootView = view;
        this.icon = imageView;
        this.progress = cardWidgetProgressView;
    }

    public static CardBrandViewBinding bind(View view) {
        int i11 = R.id.icon;
        ImageView imageView = (ImageView) b.a(view, i11);
        if (imageView != null) {
            i11 = R.id.progress;
            CardWidgetProgressView cardWidgetProgressView = (CardWidgetProgressView) b.a(view, i11);
            if (cardWidgetProgressView != null) {
                return new CardBrandViewBinding(view, imageView, cardWidgetProgressView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static CardBrandViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.card_brand_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // b5.a
    public View getRoot() {
        return this.rootView;
    }
}