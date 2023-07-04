package com.plaid.internal;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.core.ui_components.PlaidSecondaryButton;
import com.plaid.internal.core.ui_components.PlaidTertiaryButton;

/* loaded from: classes2.dex */
public final class i8 implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f18834a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f18835b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18836c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18837d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18838e;

    /* renamed from: f  reason: collision with root package name */
    public final PlaidInstitutionHeaderItem f18839f;

    /* renamed from: g  reason: collision with root package name */
    public final PlaidPrimaryButton f18840g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f18841h;

    /* renamed from: i  reason: collision with root package name */
    public final PlaidSecondaryButton f18842i;

    /* renamed from: j  reason: collision with root package name */
    public final PlaidTertiaryButton f18843j;

    public i8(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, PlaidInstitutionHeaderItem plaidInstitutionHeaderItem, PlaidNavigationBar plaidNavigationBar, PlaidPrimaryButton plaidPrimaryButton, ImageView imageView, PlaidSecondaryButton plaidSecondaryButton, PlaidTertiaryButton plaidTertiaryButton) {
        this.f18834a = linearLayout;
        this.f18835b = textView;
        this.f18836c = textView2;
        this.f18837d = textView3;
        this.f18838e = textView4;
        this.f18839f = plaidInstitutionHeaderItem;
        this.f18840g = plaidPrimaryButton;
        this.f18841h = imageView;
        this.f18842i = plaidSecondaryButton;
        this.f18843j = plaidTertiaryButton;
    }

    @Override // b5.a
    public View getRoot() {
        return this.f18834a;
    }
}