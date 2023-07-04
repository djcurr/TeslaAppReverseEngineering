package com.plaid.internal;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.core.ui_components.PlaidSecondaryButton;
import com.plaid.internal.core.ui_components.PlaidTertiaryButton;
import com.plaid.internal.j8;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class j8 extends RecyclerView.h<b> {

    /* renamed from: a  reason: collision with root package name */
    public final a f18886a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Common$ButtonContent> f18887b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup.LayoutParams f18888c;

    /* loaded from: classes2.dex */
    public interface a {
        void a(int i11);
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.e0 {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f18889a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TextView buttonView) {
            super(buttonView);
            kotlin.jvm.internal.s.g(buttonView, "buttonView");
            this.f18889a = buttonView;
        }
    }

    public j8(a listener) {
        kotlin.jvm.internal.s.g(listener, "listener");
        this.f18886a = listener;
        this.f18887b = new ArrayList();
        this.f18888c = new ViewGroup.LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a */
    public void onBindViewHolder(b holder, final int i11) {
        kotlin.jvm.internal.s.g(holder, "holder");
        Common$ButtonContent content = this.f18887b.get(i11);
        holder.getClass();
        kotlin.jvm.internal.s.g(content, "content");
        TextView textView = holder.f18889a;
        Common$LocalizedString title = content.getTitle();
        String str = null;
        if (title != null) {
            Resources resources = holder.f18889a.getResources();
            kotlin.jvm.internal.s.f(resources, "buttonView.resources");
            str = z6.a(title, resources, null, 0, 6);
        }
        textView.setText(str);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: qq.n
            {
                j8.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j8.a(j8.this, i11, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f18887b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i11) {
        if (i11 != 0) {
            return i11 != 1 ? 3 : 2;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public b onCreateViewHolder(ViewGroup parent, int i11) {
        androidx.appcompat.widget.e plaidPrimaryButton;
        kotlin.jvm.internal.s.g(parent, "parent");
        if (i11 == 1) {
            Context context = parent.getContext();
            kotlin.jvm.internal.s.f(context, "parent.context");
            plaidPrimaryButton = new PlaidPrimaryButton(context, null, 0, 6, null);
            plaidPrimaryButton.setLayoutParams(new ViewGroup.LayoutParams(this.f18888c));
        } else if (i11 == 2) {
            Context context2 = parent.getContext();
            kotlin.jvm.internal.s.f(context2, "parent.context");
            plaidPrimaryButton = new PlaidSecondaryButton(context2, null, 0, 6, null);
            plaidPrimaryButton.setLayoutParams(new ViewGroup.LayoutParams(this.f18888c));
        } else if (i11 == 3) {
            Context context3 = parent.getContext();
            kotlin.jvm.internal.s.f(context3, "parent.context");
            plaidPrimaryButton = new PlaidTertiaryButton(context3, null, 0, 6, null);
            plaidPrimaryButton.setLayoutParams(new ViewGroup.LayoutParams(this.f18888c));
        } else {
            throw new t5(kotlin.jvm.internal.s.p("View type unsupported: ", Integer.valueOf(i11)), null, null);
        }
        return new b(plaidPrimaryButton);
    }

    public static final void a(j8 this$0, int i11, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.f18886a.a(i11);
    }
}