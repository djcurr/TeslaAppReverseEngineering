package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import b5.a;
import b5.b;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.stripe.android.link.ui.LinkButtonView;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.ui.GooglePayButton;
import com.stripe.android.paymentsheet.ui.PrimaryButton;

/* loaded from: classes6.dex */
public final class ActivityPaymentSheetBinding implements a {
    public final AppBarLayout appbar;
    public final LinearLayout bottomSheet;
    public final View bottomSpacer;
    public final FrameLayout buttonContainer;
    public final PrimaryButton buyButton;
    public final CoordinatorLayout coordinator;
    public final FragmentContainerView fragmentContainer;
    public final LinearLayout fragmentContainerParent;
    public final GooglePayButton googlePayButton;
    public final ComposeView googlePayDivider;
    public final ComposeView header;
    public final ComposeView linkAuth;
    public final LinkButtonView linkButton;
    public final TextView message;
    public final ComposeView notes;
    private final CoordinatorLayout rootView;
    public final ScrollView scrollView;
    public final TextView testmode;
    public final MaterialToolbar toolbar;
    public final LinearLayout topContainer;
    public final TextView topMessage;

    private ActivityPaymentSheetBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, LinearLayout linearLayout, View view, FrameLayout frameLayout, PrimaryButton primaryButton, CoordinatorLayout coordinatorLayout2, FragmentContainerView fragmentContainerView, LinearLayout linearLayout2, GooglePayButton googlePayButton, ComposeView composeView, ComposeView composeView2, ComposeView composeView3, LinkButtonView linkButtonView, TextView textView, ComposeView composeView4, ScrollView scrollView, TextView textView2, MaterialToolbar materialToolbar, LinearLayout linearLayout3, TextView textView3) {
        this.rootView = coordinatorLayout;
        this.appbar = appBarLayout;
        this.bottomSheet = linearLayout;
        this.bottomSpacer = view;
        this.buttonContainer = frameLayout;
        this.buyButton = primaryButton;
        this.coordinator = coordinatorLayout2;
        this.fragmentContainer = fragmentContainerView;
        this.fragmentContainerParent = linearLayout2;
        this.googlePayButton = googlePayButton;
        this.googlePayDivider = composeView;
        this.header = composeView2;
        this.linkAuth = composeView3;
        this.linkButton = linkButtonView;
        this.message = textView;
        this.notes = composeView4;
        this.scrollView = scrollView;
        this.testmode = textView2;
        this.toolbar = materialToolbar;
        this.topContainer = linearLayout3;
        this.topMessage = textView3;
    }

    public static ActivityPaymentSheetBinding bind(View view) {
        View a11;
        int i11 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) b.a(view, i11);
        if (appBarLayout != null) {
            i11 = R.id.bottom_sheet;
            LinearLayout linearLayout = (LinearLayout) b.a(view, i11);
            if (linearLayout != null && (a11 = b.a(view, (i11 = R.id.bottom_spacer))) != null) {
                i11 = R.id.button_container;
                FrameLayout frameLayout = (FrameLayout) b.a(view, i11);
                if (frameLayout != null) {
                    i11 = R.id.buy_button;
                    PrimaryButton primaryButton = (PrimaryButton) b.a(view, i11);
                    if (primaryButton != null) {
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                        i11 = R.id.fragment_container;
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) b.a(view, i11);
                        if (fragmentContainerView != null) {
                            i11 = R.id.fragment_container_parent;
                            LinearLayout linearLayout2 = (LinearLayout) b.a(view, i11);
                            if (linearLayout2 != null) {
                                i11 = R.id.google_pay_button;
                                GooglePayButton googlePayButton = (GooglePayButton) b.a(view, i11);
                                if (googlePayButton != null) {
                                    i11 = R.id.google_pay_divider;
                                    ComposeView composeView = (ComposeView) b.a(view, i11);
                                    if (composeView != null) {
                                        i11 = R.id.header;
                                        ComposeView composeView2 = (ComposeView) b.a(view, i11);
                                        if (composeView2 != null) {
                                            i11 = R.id.link_auth;
                                            ComposeView composeView3 = (ComposeView) b.a(view, i11);
                                            if (composeView3 != null) {
                                                i11 = R.id.link_button;
                                                LinkButtonView linkButtonView = (LinkButtonView) b.a(view, i11);
                                                if (linkButtonView != null) {
                                                    i11 = R.id.message;
                                                    TextView textView = (TextView) b.a(view, i11);
                                                    if (textView != null) {
                                                        i11 = R.id.notes;
                                                        ComposeView composeView4 = (ComposeView) b.a(view, i11);
                                                        if (composeView4 != null) {
                                                            i11 = R.id.scroll_view;
                                                            ScrollView scrollView = (ScrollView) b.a(view, i11);
                                                            if (scrollView != null) {
                                                                i11 = R.id.testmode;
                                                                TextView textView2 = (TextView) b.a(view, i11);
                                                                if (textView2 != null) {
                                                                    i11 = R.id.toolbar;
                                                                    MaterialToolbar materialToolbar = (MaterialToolbar) b.a(view, i11);
                                                                    if (materialToolbar != null) {
                                                                        i11 = R.id.top_container;
                                                                        LinearLayout linearLayout3 = (LinearLayout) b.a(view, i11);
                                                                        if (linearLayout3 != null) {
                                                                            i11 = R.id.top_message;
                                                                            TextView textView3 = (TextView) b.a(view, i11);
                                                                            if (textView3 != null) {
                                                                                return new ActivityPaymentSheetBinding(coordinatorLayout, appBarLayout, linearLayout, a11, frameLayout, primaryButton, coordinatorLayout, fragmentContainerView, linearLayout2, googlePayButton, composeView, composeView2, composeView3, linkButtonView, textView, composeView4, scrollView, textView2, materialToolbar, linearLayout3, textView3);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    public static ActivityPaymentSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPaymentSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.activity_payment_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}