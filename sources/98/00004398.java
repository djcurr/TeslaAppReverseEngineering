package com.plaid.internal;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCards$ButtonWithCardsPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class e0 extends RecyclerView.h<a> {

    /* renamed from: a  reason: collision with root package name */
    public final List<ButtonWithCards$ButtonWithCardsPane.Rendering.Card> f18512a = new ArrayList();

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.e0 {

        /* renamed from: a  reason: collision with root package name */
        public final p8 f18513a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p8 view) {
            super(view);
            kotlin.jvm.internal.s.g(view, "view");
            this.f18513a = view;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f18512a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(a aVar, int i11) {
        String a11;
        a holder = aVar;
        kotlin.jvm.internal.s.g(holder, "holder");
        ButtonWithCards$ButtonWithCardsPane.Rendering.Card card = this.f18512a.get(i11);
        holder.getClass();
        kotlin.jvm.internal.s.g(card, "card");
        Common$LocalizedString title = card.getTitle();
        String str = null;
        if (title != null) {
            Resources resources = holder.f18513a.getResources();
            kotlin.jvm.internal.s.f(resources, "view.resources");
            String a12 = z6.a(title, resources, null, 0, 6);
            if (a12 != null) {
                holder.f18513a.setTitle(a12);
            }
        }
        p8 p8Var = holder.f18513a;
        Common$LocalizedString detail = card.getDetail();
        if (detail == null) {
            a11 = null;
        } else {
            Resources resources2 = holder.f18513a.getResources();
            kotlin.jvm.internal.s.f(resources2, "view.resources");
            a11 = z6.a(detail, resources2, null, 0, 6);
        }
        p8Var.setDetail(a11);
        p8 p8Var2 = holder.f18513a;
        Common$LocalizedString label = card.getLabel();
        if (label != null) {
            Resources resources3 = holder.f18513a.getResources();
            kotlin.jvm.internal.s.f(resources3, "view.resources");
            str = z6.a(label, resources3, null, 0, 6);
        }
        p8Var2.setLabel(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public a onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.s.g(parent, "parent");
        Context context = parent.getContext();
        kotlin.jvm.internal.s.f(context, "parent.context");
        p8 p8Var = new p8(context, null, 0);
        p8Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new a(p8Var);
    }
}