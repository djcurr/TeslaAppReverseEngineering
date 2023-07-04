package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b5.a;
import b5.b;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;

/* loaded from: classes6.dex */
public final class StripeChallengeZoneMultiSelectViewBinding implements a {
    public final ThreeDS2TextView label;
    private final LinearLayout rootView;
    public final LinearLayout selectGroup;

    private StripeChallengeZoneMultiSelectViewBinding(LinearLayout linearLayout, ThreeDS2TextView threeDS2TextView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.label = threeDS2TextView;
        this.selectGroup = linearLayout2;
    }

    public static StripeChallengeZoneMultiSelectViewBinding bind(View view) {
        int i11 = R.id.label;
        ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) b.a(view, i11);
        if (threeDS2TextView != null) {
            i11 = R.id.select_group;
            LinearLayout linearLayout = (LinearLayout) b.a(view, i11);
            if (linearLayout != null) {
                return new StripeChallengeZoneMultiSelectViewBinding((LinearLayout) view, threeDS2TextView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static StripeChallengeZoneMultiSelectViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeChallengeZoneMultiSelectViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.stripe_challenge_zone_multi_select_view, viewGroup, false);
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