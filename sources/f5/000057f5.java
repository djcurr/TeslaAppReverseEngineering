package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import b5.a;
import b5.b;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;

/* loaded from: classes6.dex */
public final class StripeChallengeZoneSingleSelectViewBinding implements a {
    public final ThreeDS2TextView label;
    private final LinearLayout rootView;
    public final RadioGroup selectGroup;

    private StripeChallengeZoneSingleSelectViewBinding(LinearLayout linearLayout, ThreeDS2TextView threeDS2TextView, RadioGroup radioGroup) {
        this.rootView = linearLayout;
        this.label = threeDS2TextView;
        this.selectGroup = radioGroup;
    }

    public static StripeChallengeZoneSingleSelectViewBinding bind(View view) {
        int i11 = R.id.label;
        ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) b.a(view, i11);
        if (threeDS2TextView != null) {
            i11 = R.id.select_group;
            RadioGroup radioGroup = (RadioGroup) b.a(view, i11);
            if (radioGroup != null) {
                return new StripeChallengeZoneSingleSelectViewBinding((LinearLayout) view, threeDS2TextView, radioGroup);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static StripeChallengeZoneSingleSelectViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeChallengeZoneSingleSelectViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.stripe_challenge_zone_single_select_view, viewGroup, false);
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