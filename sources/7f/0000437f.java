package com.plaid.internal.core.ui_components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.plaid.link.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class PlaidSellingPoint extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f18468a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f18469b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidSellingPoint(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidSellingPoint(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ PlaidSellingPoint(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void setIcon(Drawable drawable) {
        s.g(drawable, "drawable");
        this.f18468a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void setSubtitle(CharSequence subtitle) {
        s.g(subtitle, "subtitle");
        this.f18469b.setText(subtitle);
    }

    public final void setTitle(CharSequence title) {
        s.g(title, "title");
        this.f18468a.setText(title);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidSellingPoint(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        setOrientation(1);
        LinearLayout.inflate(context, R.layout.plaid_selling_point, this);
        View findViewById = findViewById(R.id.plaid_title);
        s.f(findViewById, "findViewById(R.id.plaid_title)");
        this.f18468a = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.plaid_subtitle);
        s.f(findViewById2, "findViewById(R.id.plaid_subtitle)");
        this.f18469b = (TextView) findViewById2;
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PlaidSellingPoint, 0, 0);
        s.f(obtainStyledAttributes, "context.obtainStyledAttr…ellingPoint, 0, 0\n      )");
        CharSequence text = obtainStyledAttributes.getText(R.styleable.PlaidSellingPoint_plaid_title);
        s.f(text, "typedArray.getText(R.sty…SellingPoint_plaid_title)");
        setTitle(text);
        CharSequence text2 = obtainStyledAttributes.getText(R.styleable.PlaidSellingPoint_plaid_subtitle);
        s.f(text2, "typedArray.getText(R.sty…lingPoint_plaid_subtitle)");
        setSubtitle(text2);
        obtainStyledAttributes.recycle();
    }
}