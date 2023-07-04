package com.plaid.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.plaid.link.R;

/* loaded from: classes2.dex */
public final class ia implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f18844a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f18845b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18846c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18847d;

    public ia(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f18844a = constraintLayout;
        this.f18845b = textView;
        this.f18846c = textView2;
        this.f18847d = textView3;
    }

    public static ia a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.plaid_ordered_list_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        int i11 = R.id.detail;
        TextView textView = (TextView) b5.b.a(inflate, i11);
        if (textView != null) {
            i11 = R.id.label;
            TextView textView2 = (TextView) b5.b.a(inflate, i11);
            if (textView2 != null) {
                i11 = R.id.number;
                TextView textView3 = (TextView) b5.b.a(inflate, i11);
                if (textView3 != null) {
                    return new ia((ConstraintLayout) inflate, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // b5.a
    public View getRoot() {
        return this.f18844a;
    }
}