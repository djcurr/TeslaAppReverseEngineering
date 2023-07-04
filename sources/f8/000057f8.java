package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import b5.a;
import b5.b;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.views.ThreeDS2WebView;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class StripeChallengeZoneWebViewBinding implements a {
    private final View rootView;
    public final ThreeDS2WebView webView;

    private StripeChallengeZoneWebViewBinding(View view, ThreeDS2WebView threeDS2WebView) {
        this.rootView = view;
        this.webView = threeDS2WebView;
    }

    public static StripeChallengeZoneWebViewBinding bind(View view) {
        int i11 = R.id.web_view;
        ThreeDS2WebView threeDS2WebView = (ThreeDS2WebView) b.a(view, i11);
        if (threeDS2WebView != null) {
            return new StripeChallengeZoneWebViewBinding(view, threeDS2WebView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static StripeChallengeZoneWebViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.stripe_challenge_zone_web_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // b5.a
    public View getRoot() {
        return this.rootView;
    }
}