package com.plaid.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.plaid.internal.g8;
import com.plaid.link.R;

/* loaded from: classes2.dex */
public final class g8 extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f18660a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f18661b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18662c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18663d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18664e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        setOrientation(1);
        LinearLayout.inflate(context, R.layout.plaid_bottom_sheet, this);
        View findViewById = findViewById(R.id.plaid_image);
        kotlin.jvm.internal.s.f(findViewById, "findViewById(R.id.plaid_image)");
        this.f18660a = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.plaid_bottom_sheet_title);
        kotlin.jvm.internal.s.f(findViewById2, "findViewById(R.id.plaid_bottom_sheet_title)");
        this.f18661b = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.plaid_bottom_sheet_summary);
        kotlin.jvm.internal.s.f(findViewById3, "findViewById(R.id.plaid_bottom_sheet_summary)");
        this.f18662c = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.plaid_bottom_sheet_primary_button);
        kotlin.jvm.internal.s.f(findViewById4, "findViewById(R.id.plaid_…tom_sheet_primary_button)");
        this.f18663d = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.plaid_bottom_sheet_secondary_button);
        kotlin.jvm.internal.s.f(findViewById5, "findViewById(R.id.plaid_…m_sheet_secondary_button)");
        this.f18664e = (TextView) findViewById5;
        setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.plaid_space_2x));
    }

    public final void a(String str, final h00.l<? super View, vz.b0> action) {
        kotlin.jvm.internal.s.g(action, "action");
        jc.a(this.f18663d, str);
        this.f18663d.setOnClickListener(new View.OnClickListener() { // from class: qq.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g8.a(action, view);
            }
        });
    }

    public final void b(String str, final h00.l<? super View, vz.b0> action) {
        kotlin.jvm.internal.s.g(action, "action");
        if (str.length() == 0) {
            this.f18664e.setVisibility(8);
        } else {
            this.f18664e.setVisibility(0);
            this.f18664e.setText(str);
        }
        this.f18664e.setOnClickListener(new View.OnClickListener() { // from class: qq.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g8.b(action, view);
            }
        });
    }

    public final void setImage(Drawable drawable) {
        if (drawable == null) {
            this.f18660a.setVisibility(8);
            return;
        }
        this.f18660a.setVisibility(0);
        this.f18660a.setImageDrawable(drawable);
    }

    public final void setSummary(String str) {
        jc.a(this.f18662c, str);
    }

    public final void setTitle(String str) {
        jc.a(this.f18661b, str);
    }

    public static final void a(h00.l tmp0, View view) {
        kotlin.jvm.internal.s.g(tmp0, "$tmp0");
        tmp0.invoke(view);
    }

    public static final void b(h00.l tmp0, View view) {
        kotlin.jvm.internal.s.g(tmp0, "$tmp0");
        tmp0.invoke(view);
    }
}