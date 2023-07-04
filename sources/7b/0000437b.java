package com.plaid.internal.core.ui_components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.link.R;
import h00.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes2.dex */
public final class PlaidNavigationBar extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f18464a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f18465b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18466c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f18467d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidNavigationBar(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidNavigationBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ PlaidNavigationBar(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public static final void a(l lVar, View view) {
        lVar.invoke(view);
    }

    public static final void b(l lVar, View view) {
        lVar.invoke(view);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.plaid_navigation_height), 1073741824));
    }

    public final void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f18464a.setVisibility(onClickListener != null ? 0 : 4);
        this.f18464a.setOnClickListener(onClickListener);
    }

    public final void setOnExitClickListener(View.OnClickListener onClickListener) {
        this.f18467d.setVisibility(onClickListener != null ? 0 : 4);
        this.f18467d.setOnClickListener(onClickListener);
    }

    public final void setText(CharSequence charSequence) {
        this.f18466c.setVisibility(0);
        this.f18465b.setVisibility(8);
        this.f18466c.setText(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidNavigationBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        setOrientation(0);
        LinearLayout.inflate(context, R.layout.plaid_navigation, this);
        View findViewById = findViewById(R.id.plaid_back_icon);
        s.f(findViewById, "findViewById(R.id.plaid_back_icon)");
        this.f18464a = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.plaid_logo);
        s.f(findViewById2, "findViewById(R.id.plaid_logo)");
        this.f18465b = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.plaid_navbar_title);
        s.f(findViewById3, "findViewById(R.id.plaid_navbar_title)");
        this.f18466c = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.plaid_close_icon);
        s.f(findViewById4, "findViewById(R.id.plaid_close_icon)");
        this.f18467d = (ImageView) findViewById4;
    }

    public final void setOnBackClickListener(final l<? super View, b0> lVar) {
        this.f18464a.setVisibility(lVar != null ? 0 : 4);
        this.f18464a.setOnClickListener(lVar == null ? null : new View.OnClickListener() { // from class: rq.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlaidNavigationBar.a(l.this, view);
            }
        });
    }

    public final void setOnExitClickListener(final l<? super View, b0> lVar) {
        this.f18467d.setVisibility(lVar != null ? 0 : 4);
        this.f18467d.setOnClickListener(lVar == null ? null : new View.OnClickListener() { // from class: rq.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlaidNavigationBar.b(l.this, view);
            }
        });
    }
}