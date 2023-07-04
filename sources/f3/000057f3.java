package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b5.a;
import b5.b;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.stripe3ds2.R;

/* loaded from: classes6.dex */
public final class StripeChallengeSubmitDialogBinding implements a {
    public final CircularProgressIndicator progressBar;
    private final FrameLayout rootView;

    private StripeChallengeSubmitDialogBinding(FrameLayout frameLayout, CircularProgressIndicator circularProgressIndicator) {
        this.rootView = frameLayout;
        this.progressBar = circularProgressIndicator;
    }

    public static StripeChallengeSubmitDialogBinding bind(View view) {
        int i11 = R.id.progress_bar;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) b.a(view, i11);
        if (circularProgressIndicator != null) {
            return new StripeChallengeSubmitDialogBinding((FrameLayout) view, circularProgressIndicator);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static StripeChallengeSubmitDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeChallengeSubmitDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.stripe_challenge_submit_dialog, viewGroup, false);
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