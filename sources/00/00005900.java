package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.stripe.android.stripe3ds2.databinding.StripeBrandZoneViewBinding;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class BrandZoneView extends LinearLayout {
    private final ImageView issuerImageView;
    private final ImageView paymentSystemImageView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrandZoneView(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrandZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ BrandZoneView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final ImageView getIssuerImageView$3ds2sdk_release() {
        return this.issuerImageView;
    }

    public final ImageView getPaymentSystemImageView$3ds2sdk_release() {
        return this.paymentSystemImageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandZoneView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        StripeBrandZoneViewBinding inflate = StripeBrandZoneViewBinding.inflate(LayoutInflater.from(context), this);
        s.f(inflate, "inflate(\n            Lay…           this\n        )");
        ImageView imageView = inflate.issuerImage;
        s.f(imageView, "viewBinding.issuerImage");
        this.issuerImageView = imageView;
        ImageView imageView2 = inflate.paymentSystemImage;
        s.f(imageView2, "viewBinding.paymentSystemImage");
        this.paymentSystemImageView = imageView2;
    }
}