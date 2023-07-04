package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import b5.a;
import b5.b;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;

/* loaded from: classes6.dex */
public final class StripeInformationZoneViewBinding implements a {
    public final AppCompatImageView expandArrow;
    public final LinearLayout expandContainer;
    public final ThreeDS2TextView expandLabel;
    public final ThreeDS2TextView expandText;
    private final LinearLayout rootView;
    public final AppCompatImageView whyArrow;
    public final LinearLayout whyContainer;
    public final ThreeDS2TextView whyLabel;
    public final ThreeDS2TextView whyText;

    private StripeInformationZoneViewBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout2, ThreeDS2TextView threeDS2TextView, ThreeDS2TextView threeDS2TextView2, AppCompatImageView appCompatImageView2, LinearLayout linearLayout3, ThreeDS2TextView threeDS2TextView3, ThreeDS2TextView threeDS2TextView4) {
        this.rootView = linearLayout;
        this.expandArrow = appCompatImageView;
        this.expandContainer = linearLayout2;
        this.expandLabel = threeDS2TextView;
        this.expandText = threeDS2TextView2;
        this.whyArrow = appCompatImageView2;
        this.whyContainer = linearLayout3;
        this.whyLabel = threeDS2TextView3;
        this.whyText = threeDS2TextView4;
    }

    public static StripeInformationZoneViewBinding bind(View view) {
        int i11 = R.id.expand_arrow;
        AppCompatImageView appCompatImageView = (AppCompatImageView) b.a(view, i11);
        if (appCompatImageView != null) {
            i11 = R.id.expand_container;
            LinearLayout linearLayout = (LinearLayout) b.a(view, i11);
            if (linearLayout != null) {
                i11 = R.id.expand_label;
                ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) b.a(view, i11);
                if (threeDS2TextView != null) {
                    i11 = R.id.expand_text;
                    ThreeDS2TextView threeDS2TextView2 = (ThreeDS2TextView) b.a(view, i11);
                    if (threeDS2TextView2 != null) {
                        i11 = R.id.why_arrow;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) b.a(view, i11);
                        if (appCompatImageView2 != null) {
                            i11 = R.id.why_container;
                            LinearLayout linearLayout2 = (LinearLayout) b.a(view, i11);
                            if (linearLayout2 != null) {
                                i11 = R.id.why_label;
                                ThreeDS2TextView threeDS2TextView3 = (ThreeDS2TextView) b.a(view, i11);
                                if (threeDS2TextView3 != null) {
                                    i11 = R.id.why_text;
                                    ThreeDS2TextView threeDS2TextView4 = (ThreeDS2TextView) b.a(view, i11);
                                    if (threeDS2TextView4 != null) {
                                        return new StripeInformationZoneViewBinding((LinearLayout) view, appCompatImageView, linearLayout, threeDS2TextView, threeDS2TextView2, appCompatImageView2, linearLayout2, threeDS2TextView3, threeDS2TextView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static StripeInformationZoneViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeInformationZoneViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.stripe_information_zone_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}