package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import b5.a;
import b5.b;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.R;

/* loaded from: classes2.dex */
public final class StripeActivityBinding implements a {
    public final LinearProgressIndicator progressBar;
    private final RelativeLayout rootView;
    public final Toolbar toolbar;
    public final ViewStub viewStub;

    private StripeActivityBinding(RelativeLayout relativeLayout, LinearProgressIndicator linearProgressIndicator, Toolbar toolbar, ViewStub viewStub) {
        this.rootView = relativeLayout;
        this.progressBar = linearProgressIndicator;
        this.toolbar = toolbar;
        this.viewStub = viewStub;
    }

    public static StripeActivityBinding bind(View view) {
        int i11 = R.id.progress_bar;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) b.a(view, i11);
        if (linearProgressIndicator != null) {
            i11 = R.id.toolbar;
            Toolbar toolbar = (Toolbar) b.a(view, i11);
            if (toolbar != null) {
                i11 = R.id.view_stub;
                ViewStub viewStub = (ViewStub) b.a(view, i11);
                if (viewStub != null) {
                    return new StripeActivityBinding((RelativeLayout) view, linearProgressIndicator, toolbar, viewStub);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static StripeActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.stripe_activity, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}