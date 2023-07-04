package com.plaid.internal;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.core.ui_components.PlaidSecondaryButton;
import com.plaid.internal.workflow.panes.userselection.SelectionView;

/* loaded from: classes2.dex */
public final class ta implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f19528a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f19529b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19530c;

    /* renamed from: d  reason: collision with root package name */
    public final PlaidInstitutionHeaderItem f19531d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f19532e;

    /* renamed from: f  reason: collision with root package name */
    public final PlaidPrimaryButton f19533f;

    /* renamed from: g  reason: collision with root package name */
    public final PlaidSecondaryButton f19534g;

    /* renamed from: h  reason: collision with root package name */
    public final SelectionView f19535h;

    public ta(LinearLayout linearLayout, TextView textView, TextView textView2, PlaidInstitutionHeaderItem plaidInstitutionHeaderItem, PlaidNavigationBar plaidNavigationBar, ImageView imageView, PlaidPrimaryButton plaidPrimaryButton, PlaidSecondaryButton plaidSecondaryButton, SelectionView selectionView, LinearLayout linearLayout2) {
        this.f19528a = linearLayout;
        this.f19529b = textView;
        this.f19530c = textView2;
        this.f19531d = plaidInstitutionHeaderItem;
        this.f19532e = imageView;
        this.f19533f = plaidPrimaryButton;
        this.f19534g = plaidSecondaryButton;
        this.f19535h = selectionView;
    }

    @Override // b5.a
    public View getRoot() {
        return this.f19528a;
    }
}