package com.plaid.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.plaid.link.R;

/* loaded from: classes2.dex */
public final class p8 extends CardView {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f19218a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f19219b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        setRadius(getResources().getDimensionPixelSize(R.dimen.plaid_space_1x));
        addView(LayoutInflater.from(context).inflate(R.layout.plaid_card_content, (ViewGroup) this, false));
        View findViewById = findViewById(R.id.plaid_card_label);
        kotlin.jvm.internal.s.f(findViewById, "findViewById(R.id.plaid_card_label)");
        this.f19218a = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.plaid_card_title);
        kotlin.jvm.internal.s.f(findViewById2, "findViewById(R.id.plaid_card_title)");
        this.f19219b = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.plaid_card_detail);
        kotlin.jvm.internal.s.f(findViewById3, "findViewById(R.id.plaid_card_detail)");
        this.f19220c = (TextView) findViewById3;
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PlaidCard, 0, 0);
        kotlin.jvm.internal.s.f(obtainStyledAttributes, "context.obtainStyledAttr…e.PlaidCard, 0, 0\n      )");
        setLabel(obtainStyledAttributes.getText(R.styleable.PlaidCard_plaid_label));
        CharSequence text = obtainStyledAttributes.getText(R.styleable.PlaidCard_plaid_title);
        if (text != null) {
            setTitle(text);
        }
        setDetail(obtainStyledAttributes.getText(R.styleable.PlaidCard_plaid_detail));
        obtainStyledAttributes.recycle();
    }

    public final void setDetail(CharSequence charSequence) {
        this.f19220c.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        this.f19220c.setText(charSequence);
    }

    public final void setLabel(CharSequence charSequence) {
        this.f19218a.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        this.f19218a.setText(charSequence);
    }

    public final void setTitle(CharSequence title) {
        kotlin.jvm.internal.s.g(title, "title");
        this.f19219b.setText(title);
    }
}