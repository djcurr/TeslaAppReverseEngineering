package com.plaid.internal;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.core.ui_components.PlaidSecondaryButton;

/* loaded from: classes2.dex */
public final class x8 implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f19826a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f19827b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19828c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f19829d;

    /* renamed from: e  reason: collision with root package name */
    public final View f19830e;

    /* renamed from: f  reason: collision with root package name */
    public final PlaidPrimaryButton f19831f;

    /* renamed from: g  reason: collision with root package name */
    public final PlaidSecondaryButton f19832g;

    /* renamed from: h  reason: collision with root package name */
    public final RecyclerView f19833h;

    public x8(LinearLayout linearLayout, TextView textView, TextView textView2, ImageView imageView, View view, PlaidNavigationBar plaidNavigationBar, PlaidPrimaryButton plaidPrimaryButton, PlaidSecondaryButton plaidSecondaryButton, RecyclerView recyclerView) {
        this.f19826a = linearLayout;
        this.f19827b = textView;
        this.f19828c = textView2;
        this.f19829d = imageView;
        this.f19830e = view;
        this.f19831f = plaidPrimaryButton;
        this.f19832g = plaidSecondaryButton;
        this.f19833h = recyclerView;
    }

    @Override // b5.a
    public View getRoot() {
        return this.f19826a;
    }
}