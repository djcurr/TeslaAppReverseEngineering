package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import b5.a;
import b5.b;
import com.stripe.android.stripe3ds2.R;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class StripeBrandZoneViewBinding implements a {
    public final ImageView issuerImage;
    public final ImageView paymentSystemImage;
    private final View rootView;

    private StripeBrandZoneViewBinding(View view, ImageView imageView, ImageView imageView2) {
        this.rootView = view;
        this.issuerImage = imageView;
        this.paymentSystemImage = imageView2;
    }

    public static StripeBrandZoneViewBinding bind(View view) {
        int i11 = R.id.issuer_image;
        ImageView imageView = (ImageView) b.a(view, i11);
        if (imageView != null) {
            i11 = R.id.payment_system_image;
            ImageView imageView2 = (ImageView) b.a(view, i11);
            if (imageView2 != null) {
                return new StripeBrandZoneViewBinding(view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static StripeBrandZoneViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.stripe_brand_zone_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // b5.a
    public View getRoot() {
        return this.rootView;
    }
}