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
public final class l8 implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f18970a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f18971b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18972c;

    /* renamed from: d  reason: collision with root package name */
    public final PlaidInstitutionHeaderItem f18973d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f18974e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18975f;

    /* renamed from: g  reason: collision with root package name */
    public final PlaidPrimaryButton f18976g;

    /* renamed from: h  reason: collision with root package name */
    public final PlaidSecondaryButton f18977h;

    public l8(LinearLayout linearLayout, ImageView imageView, TextView textView, PlaidInstitutionHeaderItem plaidInstitutionHeaderItem, LinearLayout linearLayout2, PlaidNavigationBar plaidNavigationBar, TextView textView2, PlaidPrimaryButton plaidPrimaryButton, LinearLayout linearLayout3, PlaidSecondaryButton plaidSecondaryButton) {
        this.f18970a = linearLayout;
        this.f18971b = imageView;
        this.f18972c = textView;
        this.f18973d = plaidInstitutionHeaderItem;
        this.f18974e = linearLayout2;
        this.f18975f = textView2;
        this.f18976g = plaidPrimaryButton;
        this.f18977h = plaidSecondaryButton;
    }

    @Override // b5.a
    public View getRoot() {
        return this.f18970a;
    }
}