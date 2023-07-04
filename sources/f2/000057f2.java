package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import b5.a;
import b5.b;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.views.BrandZoneView;
import com.stripe.android.stripe3ds2.views.ChallengeZoneView;
import com.stripe.android.stripe3ds2.views.InformationZoneView;

/* loaded from: classes6.dex */
public final class StripeChallengeFragmentBinding implements a {
    public final BrandZoneView caBrandZone;
    public final ChallengeZoneView caChallengeZone;
    public final InformationZoneView caInformationZone;
    private final ScrollView rootView;

    private StripeChallengeFragmentBinding(ScrollView scrollView, BrandZoneView brandZoneView, ChallengeZoneView challengeZoneView, InformationZoneView informationZoneView) {
        this.rootView = scrollView;
        this.caBrandZone = brandZoneView;
        this.caChallengeZone = challengeZoneView;
        this.caInformationZone = informationZoneView;
    }

    public static StripeChallengeFragmentBinding bind(View view) {
        int i11 = R.id.ca_brand_zone;
        BrandZoneView brandZoneView = (BrandZoneView) b.a(view, i11);
        if (brandZoneView != null) {
            i11 = R.id.ca_challenge_zone;
            ChallengeZoneView challengeZoneView = (ChallengeZoneView) b.a(view, i11);
            if (challengeZoneView != null) {
                i11 = R.id.ca_information_zone;
                InformationZoneView informationZoneView = (InformationZoneView) b.a(view, i11);
                if (informationZoneView != null) {
                    return new StripeChallengeFragmentBinding((ScrollView) view, brandZoneView, challengeZoneView, informationZoneView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static StripeChallengeFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeChallengeFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.stripe_challenge_fragment, viewGroup, false);
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