package com.plaid.internal;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.core.ui_components.PlaidSecondaryButton;

/* loaded from: classes2.dex */
public final class sa implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f19436a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f19437b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19438c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f19439d;

    /* renamed from: e  reason: collision with root package name */
    public final PlaidInstitutionHeaderItem f19440e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f19441f;

    /* renamed from: g  reason: collision with root package name */
    public final PlaidPrimaryButton f19442g;

    /* renamed from: h  reason: collision with root package name */
    public final PlaidSecondaryButton f19443h;

    public sa(LinearLayout linearLayout, TextView textView, TextView textView2, LinearLayout linearLayout2, PlaidInstitutionHeaderItem plaidInstitutionHeaderItem, PlaidNavigationBar plaidNavigationBar, ImageView imageView, PlaidPrimaryButton plaidPrimaryButton, PlaidSecondaryButton plaidSecondaryButton, LinearLayout linearLayout3, LinearLayout linearLayout4) {
        this.f19436a = linearLayout;
        this.f19437b = textView;
        this.f19438c = textView2;
        this.f19439d = linearLayout2;
        this.f19440e = plaidInstitutionHeaderItem;
        this.f19441f = imageView;
        this.f19442g = plaidPrimaryButton;
        this.f19443h = plaidSecondaryButton;
    }

    @Override // b5.a
    public View getRoot() {
        return this.f19436a;
    }
}