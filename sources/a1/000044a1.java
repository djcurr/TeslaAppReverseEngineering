package com.plaid.internal;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.core.ui_components.PlaidTertiaryButton;

/* loaded from: classes2.dex */
public final class m8 implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f19037a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f19038b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f19039c;

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f19040d;

    /* renamed from: e  reason: collision with root package name */
    public final PlaidInstitutionHeaderItem f19041e;

    /* renamed from: f  reason: collision with root package name */
    public final PlaidPrimaryButton f19042f;

    /* renamed from: g  reason: collision with root package name */
    public final PlaidTertiaryButton f19043g;

    public m8(LinearLayout linearLayout, TextView textView, ImageView imageView, RecyclerView recyclerView, PlaidInstitutionHeaderItem plaidInstitutionHeaderItem, PlaidNavigationBar plaidNavigationBar, PlaidPrimaryButton plaidPrimaryButton, LinearLayout linearLayout2, PlaidTertiaryButton plaidTertiaryButton) {
        this.f19037a = linearLayout;
        this.f19038b = textView;
        this.f19039c = imageView;
        this.f19040d = recyclerView;
        this.f19041e = plaidInstitutionHeaderItem;
        this.f19042f = plaidPrimaryButton;
        this.f19043g = plaidTertiaryButton;
    }

    @Override // b5.a
    public View getRoot() {
        return this.f19037a;
    }
}