package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentContainerView;
import b5.a;
import b5.b;
import com.stripe.android.stripe3ds2.R;

/* loaded from: classes6.dex */
public final class StripeChallengeActivityBinding implements a {
    public final FragmentContainerView fragmentContainer;
    private final FrameLayout rootView;

    private StripeChallengeActivityBinding(FrameLayout frameLayout, FragmentContainerView fragmentContainerView) {
        this.rootView = frameLayout;
        this.fragmentContainer = fragmentContainerView;
    }

    public static StripeChallengeActivityBinding bind(View view) {
        int i11 = R.id.fragment_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) b.a(view, i11);
        if (fragmentContainerView != null) {
            return new StripeChallengeActivityBinding((FrameLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static StripeChallengeActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeChallengeActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.stripe_challenge_activity, viewGroup, false);
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