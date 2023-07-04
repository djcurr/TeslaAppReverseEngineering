package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentContainerView;
import b5.a;
import b5.b;
import com.stripe.android.link.ui.inline.LinkInlineSignupView;
import com.stripe.android.paymentsheet.R;

/* loaded from: classes6.dex */
public final class FragmentPaymentsheetAddPaymentMethodBinding implements a {
    public final LinkInlineSignupView linkInlineSignup;
    public final FragmentContainerView paymentMethodFragmentContainer;
    public final ComposeView paymentMethodsRecycler;
    private final LinearLayout rootView;

    private FragmentPaymentsheetAddPaymentMethodBinding(LinearLayout linearLayout, LinkInlineSignupView linkInlineSignupView, FragmentContainerView fragmentContainerView, ComposeView composeView) {
        this.rootView = linearLayout;
        this.linkInlineSignup = linkInlineSignupView;
        this.paymentMethodFragmentContainer = fragmentContainerView;
        this.paymentMethodsRecycler = composeView;
    }

    public static FragmentPaymentsheetAddPaymentMethodBinding bind(View view) {
        int i11 = R.id.link_inline_signup;
        LinkInlineSignupView linkInlineSignupView = (LinkInlineSignupView) b.a(view, i11);
        if (linkInlineSignupView != null) {
            i11 = R.id.payment_method_fragment_container;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) b.a(view, i11);
            if (fragmentContainerView != null) {
                i11 = R.id.payment_methods_recycler;
                ComposeView composeView = (ComposeView) b.a(view, i11);
                if (composeView != null) {
                    return new FragmentPaymentsheetAddPaymentMethodBinding((LinearLayout) view, linkInlineSignupView, fragmentContainerView, composeView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static FragmentPaymentsheetAddPaymentMethodBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPaymentsheetAddPaymentMethodBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.fragment_paymentsheet_add_payment_method, viewGroup, false);
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