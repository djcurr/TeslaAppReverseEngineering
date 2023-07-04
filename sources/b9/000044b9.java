package com.plaid.internal;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.plaid.internal.n9;
import com.plaid.link.R;

/* loaded from: classes2.dex */
public final class n9 extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f19076a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f19077b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19078c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f19079d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f19080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        setOrientation(1);
        setBackgroundResource(R.drawable.plaid_list_item_background);
        setClickable(true);
        setFocusable(true);
        setEnabled(true);
        setLayoutTransition(new LayoutTransition());
        LinearLayout.inflate(context, R.layout.plaid_list_item_accordion, this);
        View findViewById = findViewById(R.id.icon);
        kotlin.jvm.internal.s.f(findViewById, "findViewById(R.id.icon)");
        this.f19077b = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.title);
        kotlin.jvm.internal.s.f(findViewById2, "findViewById(R.id.title)");
        this.f19078c = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.chevron);
        kotlin.jvm.internal.s.f(findViewById3, "findViewById(R.id.chevron)");
        this.f19079d = (ImageView) findViewById3;
        View findViewById4 = findViewById(R.id.info);
        kotlin.jvm.internal.s.f(findViewById4, "findViewById(R.id.info)");
        this.f19080e = (TextView) findViewById4;
        a();
        setOnClickListener(new View.OnClickListener() { // from class: qq.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n9.a(n9.this, view);
            }
        });
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PlaidListItemAccordion, 0, 0);
        kotlin.jvm.internal.s.f(obtainStyledAttributes, "context.obtainStyledAttr…emAccordion, 0, 0\n      )");
        CharSequence text = obtainStyledAttributes.getText(R.styleable.PlaidListItemAccordion_plaid_title);
        kotlin.jvm.internal.s.f(text, "typedArray.getText(R.sty…temAccordion_plaid_title)");
        setTitle(text);
        CharSequence text2 = obtainStyledAttributes.getText(R.styleable.PlaidListItemAccordion_plaid_info);
        if (text2 != null) {
            setInfo(text2);
        }
        setIcon(obtainStyledAttributes.getDrawable(R.styleable.PlaidListItemAccordion_plaid_image));
        obtainStyledAttributes.recycle();
    }

    public static final void a(n9 this$0, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.f19076a = !this$0.f19076a;
        this$0.a();
    }

    public final void setIcon(Drawable drawable) {
        this.f19077b.setImageDrawable(drawable);
    }

    public final void setIconResId(int i11) {
        this.f19077b.setImageResource(i11);
    }

    public final void setInfo(CharSequence info) {
        kotlin.jvm.internal.s.g(info, "info");
        this.f19080e.setText(info);
    }

    public final void setIsEnabled(Boolean bool) {
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        this.f19078c.setEnabled(bool.booleanValue());
        this.f19080e.setEnabled(bool.booleanValue());
        this.f19077b.setEnabled(bool.booleanValue());
        this.f19079d.setEnabled(bool.booleanValue());
        setEnabled(bool.booleanValue());
    }

    public final void setTitle(CharSequence title) {
        kotlin.jvm.internal.s.g(title, "title");
        this.f19078c.setText(title);
    }

    public final void a() {
        this.f19079d.setImageResource(this.f19076a ? R.drawable.pl_icon_chevron_s1_up : R.drawable.pl_icon_chevron_s1_down);
        this.f19080e.setVisibility(this.f19076a ? 0 : 8);
    }
}