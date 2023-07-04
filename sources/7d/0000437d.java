package com.plaid.internal.core.ui_components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.j;
import com.plaid.internal.core.ui_components.PlaidSearchView;
import com.plaid.link.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import l3.h;

/* loaded from: classes2.dex */
public final class PlaidSearchView extends j {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidSearchView(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ PlaidSearchView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public static final void a(PlaidSearchView this$0, View view, boolean z11) {
        s.g(this$0, "this$0");
        if (z11) {
            this$0.setBackgroundResource(R.drawable.plaid_search_focused_background);
        } else {
            this$0.setBackgroundResource(R.drawable.plaid_search_background);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidSearchView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        setFocusable(true);
        setFocusableInTouchMode(true);
        setHint(getResources().getString(17039372));
        setMinimumHeight((int) getResources().getDimension(R.dimen.plaid_navigation_height));
        setMinWidth((int) getResources().getDimension(R.dimen.plaid_space_6x));
        setCompoundDrawablesRelativeWithIntrinsicBounds(h.f(getResources(), R.drawable.plaid_search_black_800, null), (Drawable) null, (Drawable) null, (Drawable) null);
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: rq.e
            {
                PlaidSearchView.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                PlaidSearchView.a(PlaidSearchView.this, view, z11);
            }
        });
    }
}