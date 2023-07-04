package com.plaid.internal;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;

/* loaded from: classes2.dex */
public final class ha implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f18706a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f18707b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18708c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f18709d;

    /* renamed from: e  reason: collision with root package name */
    public final PlaidInstitutionHeaderItem f18710e;

    /* renamed from: f  reason: collision with root package name */
    public final PlaidPrimaryButton f18711f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f18712g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f18713h;

    public ha(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, TextView textView2, LinearLayout linearLayout3, PlaidInstitutionHeaderItem plaidInstitutionHeaderItem, PlaidNavigationBar plaidNavigationBar, PlaidPrimaryButton plaidPrimaryButton, ImageView imageView, LinearLayout linearLayout4) {
        this.f18706a = linearLayout;
        this.f18707b = textView;
        this.f18708c = textView2;
        this.f18709d = linearLayout3;
        this.f18710e = plaidInstitutionHeaderItem;
        this.f18711f = plaidPrimaryButton;
        this.f18712g = imageView;
        this.f18713h = linearLayout4;
    }

    @Override // b5.a
    public View getRoot() {
        return this.f18706a;
    }
}