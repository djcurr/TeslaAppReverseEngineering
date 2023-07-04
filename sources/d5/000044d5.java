package com.plaid.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelection$GridSelectionPane;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.o3;
import com.plaid.internal.q3;
import com.plaid.link.R;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class o3 extends pd<q3> {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f19127g = 0;

    /* renamed from: e  reason: collision with root package name */
    public h9 f19128e;

    /* renamed from: f  reason: collision with root package name */
    public final p3 f19129f;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.gridselection.GridSelectionFragment$onViewCreated$1", f = "GridSelectionFragment.kt", l = {48}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19130a;

        /* renamed from: com.plaid.internal.o3$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0345a implements kotlinx.coroutines.flow.f, kotlin.jvm.internal.m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ o3 f19132a;

            public C0345a(o3 o3Var) {
                this.f19132a = o3Var;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                o3 o3Var = this.f19132a;
                int i11 = o3.f19127g;
                o3Var.a((GridSelection$GridSelectionPane.Rendering) obj);
                vz.b0 b0Var = vz.b0.f54756a;
                a00.d.d();
                return b0Var;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof kotlinx.coroutines.flow.f) && (obj instanceof kotlin.jvm.internal.m)) {
                    return kotlin.jvm.internal.s.c(getFunctionDelegate(), ((kotlin.jvm.internal.m) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.m
            public final vz.g<?> getFunctionDelegate() {
                return new kotlin.jvm.internal.a(2, this.f19132a, o3.class, "bindView", "bindView(Lcom/plaid/internal/core/protos/link/workflow/nodes/panes/GridSelection$GridSelectionPane$Rendering;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public a(zz.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(dVar);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new a(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f19130a;
            if (i11 == 0) {
                vz.r.b(obj);
                o3 o3Var = o3.this;
                int i12 = o3.f19127g;
                kotlinx.coroutines.flow.y a11 = kotlinx.coroutines.flow.g.a(o3Var.b().f19294h);
                C0345a c0345a = new C0345a(o3.this);
                this.f19130a = 1;
                if (a11.collect(c0345a, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public o3() {
        super(q3.class);
        this.f19129f = new p3();
    }

    @Override // com.plaid.internal.pd
    public q3 a(vd paneId, y7 component) {
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(component, "component");
        return new q3(paneId, component);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_grid_selection_fragment, viewGroup, false);
        int i11 = R.id.plaidGrid;
        RecyclerView recyclerView = (RecyclerView) b5.b.a(inflate, i11);
        if (recyclerView != null) {
            i11 = R.id.plaidHeader;
            TextView textView = (TextView) b5.b.a(inflate, i11);
            if (textView != null) {
                i11 = R.id.plaid_institution;
                PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = (PlaidInstitutionHeaderItem) b5.b.a(inflate, i11);
                if (plaidInstitutionHeaderItem != null) {
                    i11 = R.id.plaid_navigation;
                    PlaidNavigationBar plaidNavigationBar = (PlaidNavigationBar) b5.b.a(inflate, i11);
                    if (plaidNavigationBar != null) {
                        i11 = R.id.plaidPrompt;
                        TextView textView2 = (TextView) b5.b.a(inflate, i11);
                        if (textView2 != null) {
                            i11 = R.id.plaidScrollableLayout;
                            LinearLayout linearLayout = (LinearLayout) b5.b.a(inflate, i11);
                            if (linearLayout != null) {
                                i11 = R.id.primaryButton;
                                PlaidPrimaryButton plaidPrimaryButton = (PlaidPrimaryButton) b5.b.a(inflate, i11);
                                if (plaidPrimaryButton != null) {
                                    LinearLayout linearLayout2 = (LinearLayout) inflate;
                                    h9 h9Var = new h9(linearLayout2, recyclerView, textView, plaidInstitutionHeaderItem, plaidNavigationBar, textView2, linearLayout, plaidPrimaryButton, linearLayout2);
                                    kotlin.jvm.internal.s.f(h9Var, "inflate(inflater, container, false)");
                                    this.f19128e = h9Var;
                                    return h9Var.f18705g;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // com.plaid.internal.pd, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.s.g(view, "view");
        super.onViewCreated(view, bundle);
        h9 h9Var = this.f19128e;
        if (h9Var == null) {
            kotlin.jvm.internal.s.x("binding");
            h9Var = null;
        }
        h9Var.f18700b.setLayoutManager(new GridLayoutManager(getContext(), 3));
        h9 h9Var2 = this.f19128e;
        if (h9Var2 == null) {
            kotlin.jvm.internal.s.x("binding");
            h9Var2 = null;
        }
        h9Var2.f18700b.setAdapter(this.f19129f);
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new a(null), 3, null);
    }

    public final void a(GridSelection$GridSelectionPane.Rendering rendering) {
        List<GridSelection$GridSelectionPane.Rendering.Selection> selectionsList;
        if (rendering.hasHeader()) {
            h9 h9Var = this.f19128e;
            if (h9Var == null) {
                kotlin.jvm.internal.s.x("binding");
                h9Var = null;
            }
            TextView textView = h9Var.f18701c;
            Common$LocalizedString header = rendering.getHeader();
            kotlin.jvm.internal.s.f(header, "rendering.header");
            Resources resources = getResources();
            kotlin.jvm.internal.s.f(resources, "resources");
            Context context = getContext();
            textView.setText(z6.a(header, resources, context == null ? null : context.getPackageName(), 0, 4));
        }
        if (rendering.hasHeaderAsset()) {
            rendering.getHeaderAsset();
        }
        if (rendering.hasInstitution()) {
            h9 h9Var2 = this.f19128e;
            if (h9Var2 == null) {
                kotlin.jvm.internal.s.x("binding");
                h9Var2 = null;
            }
            PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = h9Var2.f18702d;
            kotlin.jvm.internal.s.f(plaidInstitutionHeaderItem, "binding.plaidInstitution");
            k9.a(plaidInstitutionHeaderItem, rendering.getInstitution());
        }
        if (rendering.hasButton()) {
            h9 h9Var3 = this.f19128e;
            if (h9Var3 == null) {
                kotlin.jvm.internal.s.x("binding");
                h9Var3 = null;
            }
            PlaidPrimaryButton plaidPrimaryButton = h9Var3.f18704f;
            Common$LocalizedString title = rendering.getButton().getTitle();
            kotlin.jvm.internal.s.f(title, "rendering.button.title");
            Resources resources2 = getResources();
            kotlin.jvm.internal.s.f(resources2, "resources");
            Context context2 = getContext();
            plaidPrimaryButton.setText(z6.a(title, resources2, context2 == null ? null : context2.getPackageName(), 0, 4));
            h9 h9Var4 = this.f19128e;
            if (h9Var4 == null) {
                kotlin.jvm.internal.s.x("binding");
                h9Var4 = null;
            }
            h9Var4.f18704f.setOnClickListener(new View.OnClickListener() { // from class: qq.s
                {
                    o3.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o3.a(o3.this, view);
                }
            });
        }
        kotlin.jvm.internal.s.f(rendering.getSelectionsList(), "rendering.selectionsList");
        if (!selectionsList.isEmpty()) {
            GridSelection$GridSelectionPane.Rendering.Selection selection = rendering.getSelectionsList().get(0);
            kotlin.jvm.internal.s.f(selection, "rendering.selectionsList[0]");
            GridSelection$GridSelectionPane.Rendering.Selection selection2 = selection;
            Common$LocalizedString prompt = selection2.hasPrompt() ? selection2.getPrompt() : null;
            h9 h9Var5 = this.f19128e;
            if (h9Var5 == null) {
                kotlin.jvm.internal.s.x("binding");
                h9Var5 = null;
            }
            TextView textView2 = h9Var5.f18703e;
            if (prompt != null) {
                Resources resources3 = getResources();
                kotlin.jvm.internal.s.f(resources3, "resources");
                Context context3 = getContext();
                r5 = z6.a(prompt, resources3, context3 != null ? context3.getPackageName() : null, 0, 4);
            }
            textView2.setText(r5);
            p3 p3Var = this.f19129f;
            f1 selectionBehavior = selection2.getBehavior();
            kotlin.jvm.internal.s.f(selectionBehavior, "selection.behavior");
            List<Common$GridSelectionImageItem> items = selection2.getItemsList();
            kotlin.jvm.internal.s.f(items, "selection.itemsList");
            p3Var.getClass();
            kotlin.jvm.internal.s.g(selectionBehavior, "selectionBehavior");
            kotlin.jvm.internal.s.g(items, "items");
            p3Var.f19208c = selectionBehavior;
            p3Var.f19206a.clear();
            p3Var.f19206a.addAll(items);
            p3Var.notifyDataSetChanged();
        }
    }

    public static final void a(o3 this$0, View view) {
        List d11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        q3 b11 = this$0.b();
        Set<String> selectedIds = this$0.f19129f.f19207b;
        b11.getClass();
        kotlin.jvm.internal.s.g(selectedIds, "selectedIds");
        q3.b bVar = q3.b.f19301a;
        kotlin.jvm.internal.s.g(selectedIds, "selectedIds");
        GridSelection$GridSelectionPane.Actions.b newBuilder = GridSelection$GridSelectionPane.Actions.newBuilder();
        GridSelection$GridSelectionPane.Actions.SubmitAction.a newBuilder2 = GridSelection$GridSelectionPane.Actions.SubmitAction.newBuilder();
        d11 = wz.v.d(GridSelection$GridSelectionPane.Actions.SubmitAction.Response.newBuilder().a(selectedIds).build());
        GridSelection$GridSelectionPane.Actions.b a11 = newBuilder.a(newBuilder2.a(d11));
        kotlin.jvm.internal.s.f(a11, "newBuilder()\n        .se…)\n            )\n        )");
        q3.a(b11, a11, null, 2);
    }
}