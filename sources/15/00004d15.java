package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import b5.a;
import b5.b;
import com.stripe.android.R;
import com.stripe.android.view.ShippingInfoWidget;

/* loaded from: classes2.dex */
public final class ShippingInfoPageBinding implements a {
    private final ScrollView rootView;
    public final ShippingInfoWidget shippingInfoWidget;

    private ShippingInfoPageBinding(ScrollView scrollView, ShippingInfoWidget shippingInfoWidget) {
        this.rootView = scrollView;
        this.shippingInfoWidget = shippingInfoWidget;
    }

    public static ShippingInfoPageBinding bind(View view) {
        int i11 = R.id.shipping_info_widget;
        ShippingInfoWidget shippingInfoWidget = (ShippingInfoWidget) b.a(view, i11);
        if (shippingInfoWidget != null) {
            return new ShippingInfoPageBinding((ScrollView) view, shippingInfoWidget);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static ShippingInfoPageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ShippingInfoPageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.shipping_info_page, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public ScrollView getRoot() {
        return this.rootView;
    }
}