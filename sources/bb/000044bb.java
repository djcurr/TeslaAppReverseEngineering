package com.plaid.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelect$SearchAndSelectPane;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidSearchView;
import com.plaid.internal.pb;
import com.plaid.internal.sb;
import com.plaid.internal.wa;
import com.plaid.link.R;
import java.util.List;
import kotlin.KotlinNothingValueException;
import v20.a2;

/* loaded from: classes2.dex */
public final class nb extends pd<pb> {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f19082g = 0;

    /* renamed from: e  reason: collision with root package name */
    public pa f19083e;

    /* renamed from: f  reason: collision with root package name */
    public final sb f19084f;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.searchandselect.SearchAndSelectFragment$onViewCreated$1", f = "SearchAndSelectFragment.kt", l = {110}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19094a;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a implements kotlinx.coroutines.flow.f, kotlin.jvm.internal.m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ nb f19096a;

            public a(nb nbVar) {
                this.f19096a = nbVar;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                String a11;
                SearchAndSelect$SearchAndSelectPane.Rendering rendering = (SearchAndSelect$SearchAndSelectPane.Rendering) obj;
                nb nbVar = this.f19096a;
                int i11 = nb.f19082g;
                nbVar.getClass();
                pa paVar = null;
                if (rendering.hasTitle()) {
                    pa paVar2 = nbVar.f19083e;
                    if (paVar2 == null) {
                        kotlin.jvm.internal.s.x("binding");
                        paVar2 = null;
                    }
                    TextView textView = paVar2.f19227d;
                    Common$LocalizedString title = rendering.getTitle();
                    if (title == null) {
                        a11 = null;
                    } else {
                        Resources resources = nbVar.getResources();
                        kotlin.jvm.internal.s.f(resources, "resources");
                        Context context = nbVar.getContext();
                        a11 = z6.a(title, resources, context == null ? null : context.getPackageName(), 0, 4);
                    }
                    textView.setText(a11);
                }
                pa paVar3 = nbVar.f19083e;
                if (paVar3 == null) {
                    kotlin.jvm.internal.s.x("binding");
                    paVar3 = null;
                }
                paVar3.f19226c.addTextChangedListener(new ob(nbVar, rendering));
                sb sbVar = nbVar.f19084f;
                List<Common$ListItem> initialItemsList = rendering.getInitialItemsList();
                kotlin.jvm.internal.s.f(initialItemsList, "rendering.initialItemsList");
                sbVar.a(initialItemsList);
                Common$LocalizedString searchNoResults = rendering.hasSearchNoResults() ? rendering.getSearchNoResults() : null;
                Common$ButtonContent searchNoResultsButton = rendering.hasSearchNoResultsButton() ? rendering.getSearchNoResultsButton() : null;
                sb sbVar2 = nbVar.f19084f;
                sbVar2.getClass();
                sbVar2.f19447c = new vz.p<>(searchNoResults, searchNoResultsButton);
                sbVar2.notifyItemChanged(sbVar2.getItemCount() - 1);
                Common$AttributedLocalizedString endOfResultsButtonText = rendering.hasEndOfResultsButtonText() ? rendering.getEndOfResultsButtonText() : null;
                Common$ButtonContent endOfResultsButton = rendering.hasEndOfResultsButton() ? rendering.getEndOfResultsButton() : null;
                sb sbVar3 = nbVar.f19084f;
                sbVar3.getClass();
                sbVar3.f19448d = new vz.p<>(endOfResultsButtonText, endOfResultsButton);
                sbVar3.notifyItemChanged(sbVar3.getItemCount() - 1);
                pa paVar4 = nbVar.f19083e;
                if (paVar4 == null) {
                    kotlin.jvm.internal.s.x("binding");
                } else {
                    paVar = paVar4;
                }
                paVar.f19225b.scheduleLayoutAnimation();
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
                return new kotlin.jvm.internal.a(2, this.f19096a, nb.class, "bindView", "bindView(Lcom/plaid/internal/core/protos/link/workflow/nodes/panes/SearchAndSelect$SearchAndSelectPane$Rendering;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new b(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f19094a;
            if (i11 == 0) {
                vz.r.b(obj);
                nb nbVar = nb.this;
                int i12 = nb.f19082g;
                kotlinx.coroutines.flow.y a11 = kotlinx.coroutines.flow.g.a(nbVar.b().f19231k);
                a aVar = new a(nb.this);
                this.f19094a = 1;
                if (a11.collect(aVar, this) == d11) {
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

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.searchandselect.SearchAndSelectFragment$onViewCreated$2", f = "SearchAndSelectFragment.kt", l = {113}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19097a;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a implements kotlinx.coroutines.flow.f, kotlin.jvm.internal.m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ sb f19099a;

            public a(sb sbVar) {
                this.f19099a = sbVar;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                this.f19099a.a((List) obj);
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
                return new kotlin.jvm.internal.a(2, this.f19099a, sb.class, "setData", "setData(Ljava/util/List;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new c(dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new c(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f19097a;
            if (i11 == 0) {
                vz.r.b(obj);
                nb nbVar = nb.this;
                int i12 = nb.f19082g;
                kotlinx.coroutines.flow.y a11 = kotlinx.coroutines.flow.g.a(nbVar.b().f19235o);
                a aVar = new a(nb.this.f19084f);
                this.f19097a = 1;
                if (a11.collect(aVar, this) == d11) {
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

    public nb() {
        super(pb.class);
        sb sbVar = new sb();
        sbVar.a(new a());
        this.f19084f = sbVar;
    }

    @Override // com.plaid.internal.pd
    public pb a(vd paneId, y7 component) {
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(component, "component");
        return new pb(paneId, component);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_search_and_select_fragment, viewGroup, false);
        int i11 = R.id.plaid_institution_recycler;
        RecyclerView recyclerView = (RecyclerView) b5.b.a(inflate, i11);
        if (recyclerView != null) {
            i11 = R.id.plaid_institution_search_view;
            PlaidSearchView plaidSearchView = (PlaidSearchView) b5.b.a(inflate, i11);
            if (plaidSearchView != null) {
                i11 = R.id.plaid_navigation;
                PlaidNavigationBar plaidNavigationBar = (PlaidNavigationBar) b5.b.a(inflate, i11);
                if (plaidNavigationBar != null) {
                    i11 = R.id.plaid_search_title;
                    TextView textView = (TextView) b5.b.a(inflate, i11);
                    if (textView != null) {
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        pa paVar = new pa(linearLayout, recyclerView, plaidSearchView, plaidNavigationBar, textView);
                        kotlin.jvm.internal.s.f(paVar, "inflate(inflater, container, false)");
                        this.f19083e = paVar;
                        return linearLayout;
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
        pa paVar = this.f19083e;
        if (paVar == null) {
            kotlin.jvm.internal.s.x("binding");
            paVar = null;
        }
        paVar.f19225b.setAdapter(this.f19084f);
        pa paVar2 = this.f19083e;
        if (paVar2 == null) {
            kotlin.jvm.internal.s.x("binding");
            paVar2 = null;
        }
        paVar2.f19225b.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(getContext(), R.anim.plaid_layout_animation_cascade_down));
        pa paVar3 = this.f19083e;
        if (paVar3 == null) {
            kotlin.jvm.internal.s.x("binding");
            paVar3 = null;
        }
        RecyclerView recyclerView = paVar3.f19225b;
        androidx.recyclerview.widget.i iVar = new androidx.recyclerview.widget.i(getContext(), 1);
        Resources resources = getResources();
        int i11 = R.drawable.plaid_inset_line_divider;
        Context context = getContext();
        iVar.h(resources.getDrawable(i11, context == null ? null : context.getTheme()));
        recyclerView.addItemDecoration(iVar);
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new b(null), 3, null);
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new c(null), 3, null);
    }

    public static final boolean a(nb nbVar, j1 searchBehavior, String query) {
        List m11;
        v20.a2 d11;
        nbVar.getClass();
        if (query == null || query.length() == 0) {
            return false;
        }
        pb b11 = nbVar.b();
        b11.getClass();
        kotlin.jvm.internal.s.g(searchBehavior, "searchBehavior");
        kotlin.jvm.internal.s.g(query, "query");
        SearchAndSelect$SearchAndSelectPane.Rendering.Events events = b11.f19238r;
        Pane$PaneRendering pane$PaneRendering = null;
        m11 = wz.w.m(events == null ? null : events.getOnSearch());
        b11.a(m11);
        int i11 = pb.c.f19248a[searchBehavior.ordinal()];
        if (i11 == 1) {
            b11.a(query, true);
        } else if (i11 != 2) {
            wa.a aVar = wa.f19678a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("searchBehavior: ");
            sb2.append(searchBehavior);
            sb2.append(" was not supported for ");
            Pane$PaneRendering pane$PaneRendering2 = b11.f19236p;
            if (pane$PaneRendering2 == null) {
                kotlin.jvm.internal.s.x("pane");
            } else {
                pane$PaneRendering = pane$PaneRendering2;
            }
            sb2.append((Object) pane$PaneRendering.getPaneNodeId());
            wa.a.c(aVar, sb2.toString(), false, 2);
            b11.a(query, true);
        } else {
            v20.a2 a2Var = b11.f19232l;
            if (a2Var != null) {
                a2.a.a(a2Var, null, 1, null);
            }
            d11 = v20.k.d(androidx.lifecycle.q0.a(b11), null, null, new qb(b11, query, null), 3, null);
            b11.f19232l = d11;
        }
        return true;
    }

    /* loaded from: classes2.dex */
    public static final class a implements sb.d {

        /* renamed from: com.plaid.internal.nb$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0343a extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ nb f19086a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0343a(nb nbVar) {
                super(0);
                this.f19086a = nbVar;
            }

            @Override // h00.a
            public vz.b0 invoke() {
                nb nbVar = this.f19086a;
                int i11 = nb.f19082g;
                pb b11 = nbVar.b();
                b11.getClass();
                pb.b bVar = pb.b.f19244a;
                b11.a(pb.b.f19247d, (Common$SDKEvent) null);
                return vz.b0.f54756a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<String, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ nb f19087a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(nb nbVar) {
                super(1);
                this.f19087a = nbVar;
            }

            @Override // h00.l
            public vz.b0 invoke(String str) {
                String it2 = str;
                kotlin.jvm.internal.s.g(it2, "it");
                nb.a(this.f19087a);
                return vz.b0.f54756a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends kotlin.jvm.internal.u implements h00.l<String, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ nb f19088a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(nb nbVar) {
                super(1);
                this.f19088a = nbVar;
            }

            @Override // h00.l
            public vz.b0 invoke(String str) {
                String it2 = str;
                kotlin.jvm.internal.s.g(it2, "it");
                nb.a(this.f19088a);
                return vz.b0.f54756a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class d extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ nb f19089a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(nb nbVar) {
                super(0);
                this.f19089a = nbVar;
            }

            @Override // h00.a
            public vz.b0 invoke() {
                nb nbVar = this.f19089a;
                int i11 = nb.f19082g;
                pb b11 = nbVar.b();
                b11.getClass();
                pb.b bVar = pb.b.f19244a;
                b11.a(pb.b.f19247d, (Common$SDKEvent) null);
                return vz.b0.f54756a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class e extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ nb f19090a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ String f19091b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(nb nbVar, String str, Common$LocalAction common$LocalAction) {
                super(0);
                this.f19090a = nbVar;
                this.f19091b = str;
            }

            @Override // h00.a
            public vz.b0 invoke() {
                nb nbVar = this.f19090a;
                int i11 = nb.f19082g;
                nbVar.b().a(this.f19091b);
                return vz.b0.f54756a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class f extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ nb f19092a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(nb nbVar) {
                super(0);
                this.f19092a = nbVar;
            }

            @Override // h00.a
            public vz.b0 invoke() {
                nb nbVar = this.f19092a;
                int i11 = nb.f19082g;
                pb b11 = nbVar.b();
                b11.getClass();
                pb.b bVar = pb.b.f19244a;
                SearchAndSelect$SearchAndSelectPane.Actions.b bVar2 = pb.b.f19245b;
                SearchAndSelect$SearchAndSelectPane.Rendering.Events events = b11.f19238r;
                b11.a(bVar2, events == null ? null : events.getOnTapNoResults());
                return vz.b0.f54756a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class g extends kotlin.jvm.internal.u implements h00.l<String, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ nb f19093a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(nb nbVar) {
                super(1);
                this.f19093a = nbVar;
            }

            @Override // h00.l
            public vz.b0 invoke(String str) {
                String it2 = str;
                kotlin.jvm.internal.s.g(it2, "it");
                nb.a(this.f19093a);
                return vz.b0.f54756a;
            }
        }

        public a() {
        }

        @Override // com.plaid.internal.sb.d
        public void a(String institutionId, Common$LocalAction common$LocalAction) {
            kotlin.jvm.internal.s.g(institutionId, "institutionId");
            if (common$LocalAction != null) {
                nb nbVar = nb.this;
                nbVar.a(common$LocalAction, (h00.l<? super String, vz.b0>) null, new e(nbVar, institutionId, common$LocalAction));
                return;
            }
            nb nbVar2 = nb.this;
            int i11 = nb.f19082g;
            nbVar2.b().a(institutionId);
        }

        @Override // com.plaid.internal.sb.d
        public void b(Common$ButtonContent common$ButtonContent) {
            if (common$ButtonContent == null) {
                nb nbVar = nb.this;
                int i11 = nb.f19082g;
                pb b11 = nbVar.b();
                b11.getClass();
                pb.b bVar = pb.b.f19244a;
                SearchAndSelect$SearchAndSelectPane.Actions.b bVar2 = pb.b.f19245b;
                SearchAndSelect$SearchAndSelectPane.Rendering.Events events = b11.f19238r;
                b11.a(bVar2, events == null ? null : events.getOnTapNoResults());
                return;
            }
            nb nbVar2 = nb.this;
            nbVar2.a(common$ButtonContent, new f(nbVar2), new g(nb.this));
        }

        @Override // com.plaid.internal.sb.d
        public void a(Common$ButtonContent common$ButtonContent) {
            if (common$ButtonContent == null) {
                nb nbVar = nb.this;
                int i11 = nb.f19082g;
                pb b11 = nbVar.b();
                b11.getClass();
                pb.b bVar = pb.b.f19244a;
                b11.a(pb.b.f19247d, (Common$SDKEvent) null);
                return;
            }
            nb nbVar2 = nb.this;
            nbVar2.a(common$ButtonContent, new C0343a(nbVar2), new b(nb.this));
        }

        @Override // com.plaid.internal.sb.d
        public void a(Common$LocalAction action) {
            kotlin.jvm.internal.s.g(action, "action");
            nb nbVar = nb.this;
            nbVar.a(action, new c(nbVar), new d(nb.this));
        }
    }

    public static final void a(nb nbVar) {
        pa paVar = nbVar.f19083e;
        pa paVar2 = null;
        if (paVar == null) {
            kotlin.jvm.internal.s.x("binding");
            paVar = null;
        }
        paVar.f19226c.requestFocus();
        pa paVar3 = nbVar.f19083e;
        if (paVar3 == null) {
            kotlin.jvm.internal.s.x("binding");
        } else {
            paVar2 = paVar3;
        }
        paVar2.f19226c.requestFocusFromTouch();
    }
}