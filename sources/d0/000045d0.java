package com.plaid.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Consent$ConsentPane;
import com.plaid.internal.core.ui_components.PlaidSellingPoint;
import com.plaid.link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class vb extends RecyclerView.h<a> {

    /* renamed from: a  reason: collision with root package name */
    public final List<Consent$ConsentPane.Rendering.Section> f19630a = new ArrayList();

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.e0 {

        /* renamed from: a  reason: collision with root package name */
        public final PlaidSellingPoint f19631a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PlaidSellingPoint plaidSellingPoint) {
            super(plaidSellingPoint);
            kotlin.jvm.internal.s.g(plaidSellingPoint, "plaidSellingPoint");
            this.f19631a = plaidSellingPoint;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f19630a.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r1 == null) goto L21;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBindViewHolder(com.plaid.internal.vb.a r14, int r15) {
        /*
            r13 = this;
            com.plaid.internal.vb$a r14 = (com.plaid.internal.vb.a) r14
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.s.g(r14, r0)
            java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Consent$ConsentPane$Rendering$Section> r0 = r13.f19630a
            java.lang.Object r15 = r0.get(r15)
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Consent$ConsentPane$Rendering$Section r15 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Consent.ConsentPane.Rendering.Section) r15
            com.plaid.internal.core.ui_components.PlaidSellingPoint r0 = r14.f19631a
            android.content.res.Resources r0 = r0.getResources()
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString r1 = r15.getHeader()
            r2 = 4
            r3 = 0
            java.lang.String r4 = ""
            java.lang.String r5 = "resources"
            r6 = 0
            if (r1 != 0) goto L23
            goto L3a
        L23:
            kotlin.jvm.internal.s.f(r0, r5)
            com.plaid.internal.core.ui_components.PlaidSellingPoint r7 = r14.f19631a
            android.content.Context r7 = r7.getContext()
            if (r7 != 0) goto L30
            r7 = r6
            goto L34
        L30:
            java.lang.String r7 = r7.getPackageName()
        L34:
            java.lang.String r1 = com.plaid.internal.z6.a(r1, r0, r7, r3, r2)
            if (r1 != 0) goto L3b
        L3a:
            r1 = r4
        L3b:
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString r7 = r15.getDescription()
            if (r7 != 0) goto L42
            goto L5b
        L42:
            kotlin.jvm.internal.s.f(r0, r5)
            com.plaid.internal.core.ui_components.PlaidSellingPoint r5 = r14.f19631a
            android.content.Context r5 = r5.getContext()
            if (r5 != 0) goto L4f
            r5 = r6
            goto L53
        L4f:
            java.lang.String r5 = r5.getPackageName()
        L53:
            java.lang.String r0 = com.plaid.internal.z6.a(r7, r0, r5, r3, r2)
            if (r0 != 0) goto L5a
            goto L5b
        L5a:
            r4 = r0
        L5b:
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance r15 = r15.getIcon()
            java.lang.String r0 = "item.icon"
            kotlin.jvm.internal.s.f(r15, r0)
            java.lang.String r0 = "title"
            kotlin.jvm.internal.s.g(r1, r0)
            java.lang.String r0 = "subtitle"
            kotlin.jvm.internal.s.g(r4, r0)
            java.lang.String r0 = "icon"
            kotlin.jvm.internal.s.g(r15, r0)
            com.plaid.internal.core.ui_components.PlaidSellingPoint r0 = r14.f19631a
            r0.setTitle(r1)
            com.plaid.internal.core.ui_components.PlaidSellingPoint r0 = r14.f19631a
            r0.setSubtitle(r4)
            v20.o0 r7 = v20.p0.b()
            com.plaid.internal.ub r10 = new com.plaid.internal.ub
            r10.<init>(r15, r14, r6)
            r8 = 0
            r9 = 0
            r11 = 3
            r12 = 0
            v20.i.d(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.vb.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public a onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.s.g(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.plaid_selling_point_item, parent, false);
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type com.plaid.internal.core.ui_components.PlaidSellingPoint");
        return new a((PlaidSellingPoint) inflate);
    }
}