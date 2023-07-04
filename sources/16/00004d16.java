package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b5.a;
import b5.b;
import com.stripe.android.R;
import com.stripe.android.view.SelectShippingMethodWidget;

/* loaded from: classes2.dex */
public final class ShippingMethodPageBinding implements a {
    private final FrameLayout rootView;
    public final SelectShippingMethodWidget selectShippingMethodWidget;

    private ShippingMethodPageBinding(FrameLayout frameLayout, SelectShippingMethodWidget selectShippingMethodWidget) {
        this.rootView = frameLayout;
        this.selectShippingMethodWidget = selectShippingMethodWidget;
    }

    public static ShippingMethodPageBinding bind(View view) {
        int i11 = R.id.select_shipping_method_widget;
        SelectShippingMethodWidget selectShippingMethodWidget = (SelectShippingMethodWidget) b.a(view, i11);
        if (selectShippingMethodWidget != null) {
            return new ShippingMethodPageBinding((FrameLayout) view, selectShippingMethodWidget);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static ShippingMethodPageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ShippingMethodPageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.shipping_method_page, viewGroup, false);
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