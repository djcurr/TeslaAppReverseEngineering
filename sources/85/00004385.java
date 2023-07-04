package com.plaid.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCards$ButtonWithCardsPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.core.ui_components.PlaidTertiaryButton;
import com.plaid.internal.f0;
import com.plaid.link.R;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class d0 extends pd<f0> {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f18477g = 0;

    /* renamed from: e  reason: collision with root package name */
    public m8 f18478e;

    /* renamed from: f  reason: collision with root package name */
    public final e0 f18479f;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.buttonwithcards.ButtonWithCardsFragment$onViewCreated$1", f = "ButtonWithCardsFragment.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f18480a;

        /* renamed from: com.plaid.internal.d0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0338a implements kotlinx.coroutines.flow.f, kotlin.jvm.internal.m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d0 f18482a;

            public C0338a(d0 d0Var) {
                this.f18482a = d0Var;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                d0 d0Var = this.f18482a;
                int i11 = d0.f18477g;
                d0Var.a((ButtonWithCards$ButtonWithCardsPane.Rendering) obj);
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
                return new kotlin.jvm.internal.a(2, this.f18482a, d0.class, "bindView", "bindView(Lcom/plaid/internal/core/protos/link/workflow/nodes/panes/ButtonWithCards$ButtonWithCardsPane$Rendering;)V", 4);
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
            int i11 = this.f18480a;
            if (i11 == 0) {
                vz.r.b(obj);
                d0 d0Var = d0.this;
                int i12 = d0.f18477g;
                kotlinx.coroutines.flow.y a11 = kotlinx.coroutines.flow.g.a(d0Var.b().f18557h);
                C0338a c0338a = new C0338a(d0.this);
                this.f18480a = 1;
                if (a11.collect(c0338a, this) == d11) {
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

    public d0() {
        super(f0.class);
        this.f18479f = new e0();
    }

    public static final void b(d0 this$0, View view) {
        List<Common$SDKEvent> m11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        f0 b11 = this$0.b();
        b11.getClass();
        f0.b bVar = f0.b.f18564a;
        ButtonWithCards$ButtonWithCardsPane.Actions.b bVar2 = f0.b.f18566c;
        ButtonWithCards$ButtonWithCardsPane.Rendering.Events events = b11.f18559j;
        m11 = wz.w.m(events == null ? null : events.getOnSecondaryButtonTap());
        b11.a(bVar2, m11);
    }

    @Override // com.plaid.internal.pd
    public f0 a(vd paneId, y7 component) {
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(component, "component");
        return new f0(paneId, component);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_button_with_cards_fragment, viewGroup, false);
        int i11 = R.id.button_with_cards_header;
        TextView textView = (TextView) b5.b.a(inflate, i11);
        if (textView != null) {
            i11 = R.id.button_with_cards_header_image;
            ImageView imageView = (ImageView) b5.b.a(inflate, i11);
            if (imageView != null) {
                i11 = R.id.button_with_cards_recycler;
                RecyclerView recyclerView = (RecyclerView) b5.b.a(inflate, i11);
                if (recyclerView != null) {
                    i11 = R.id.plaid_institution;
                    PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = (PlaidInstitutionHeaderItem) b5.b.a(inflate, i11);
                    if (plaidInstitutionHeaderItem != null) {
                        i11 = R.id.plaid_navigation;
                        PlaidNavigationBar plaidNavigationBar = (PlaidNavigationBar) b5.b.a(inflate, i11);
                        if (plaidNavigationBar != null) {
                            i11 = R.id.primaryButton;
                            PlaidPrimaryButton plaidPrimaryButton = (PlaidPrimaryButton) b5.b.a(inflate, i11);
                            if (plaidPrimaryButton != null) {
                                i11 = R.id.scrollable_content;
                                LinearLayout linearLayout = (LinearLayout) b5.b.a(inflate, i11);
                                if (linearLayout != null) {
                                    i11 = R.id.secondaryButton;
                                    PlaidTertiaryButton plaidTertiaryButton = (PlaidTertiaryButton) b5.b.a(inflate, i11);
                                    if (plaidTertiaryButton != null) {
                                        LinearLayout linearLayout2 = (LinearLayout) inflate;
                                        m8 m8Var = new m8(linearLayout2, textView, imageView, recyclerView, plaidInstitutionHeaderItem, plaidNavigationBar, plaidPrimaryButton, linearLayout, plaidTertiaryButton);
                                        kotlin.jvm.internal.s.f(m8Var, "inflate(inflater, container, false)");
                                        this.f18478e = m8Var;
                                        return linearLayout2;
                                    }
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
        m8 m8Var = this.f18478e;
        if (m8Var == null) {
            kotlin.jvm.internal.s.x("binding");
            m8Var = null;
        }
        m8Var.f19040d.setAdapter(this.f18479f);
        m8 m8Var2 = this.f18478e;
        if (m8Var2 == null) {
            kotlin.jvm.internal.s.x("binding");
            m8Var2 = null;
        }
        RecyclerView recyclerView = m8Var2.f19040d;
        recyclerView.setHasFixedSize(true);
        Resources resources = recyclerView.getResources();
        kotlin.jvm.internal.s.f(resources, "resources");
        int i11 = R.dimen.plaid_space_1x;
        kotlin.jvm.internal.s.g(resources, "resources");
        recyclerView.addItemDecoration(new qa(resources.getDimensionPixelSize(i11)));
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new a(null), 3, null);
    }

    public final void a(ButtonWithCards$ButtonWithCardsPane.Rendering rendering) {
        Common$LocalizedString title;
        String str;
        Common$LocalizedString title2;
        String a11;
        if (rendering.hasInstitution()) {
            m8 m8Var = this.f18478e;
            if (m8Var == null) {
                kotlin.jvm.internal.s.x("binding");
                m8Var = null;
            }
            PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = m8Var.f19041e;
            kotlin.jvm.internal.s.f(plaidInstitutionHeaderItem, "binding.plaidInstitution");
            k9.a(plaidInstitutionHeaderItem, rendering.getInstitution());
        }
        if (rendering.hasHeaderAsset()) {
            m8 m8Var2 = this.f18478e;
            if (m8Var2 == null) {
                kotlin.jvm.internal.s.x("binding");
                m8Var2 = null;
            }
            ImageView imageView = m8Var2.f19039c;
            kotlin.jvm.internal.s.f(imageView, "binding.buttonWithCardsHeaderImage");
            a4.a(imageView, rendering.getHeaderAsset());
        }
        if (rendering.hasHeader()) {
            m8 m8Var3 = this.f18478e;
            if (m8Var3 == null) {
                kotlin.jvm.internal.s.x("binding");
                m8Var3 = null;
            }
            TextView textView = m8Var3.f19038b;
            kotlin.jvm.internal.s.f(textView, "binding.buttonWithCardsHeader");
            Common$LocalizedString header = rendering.getHeader();
            if (header == null) {
                a11 = null;
            } else {
                Resources resources = getResources();
                kotlin.jvm.internal.s.f(resources, "resources");
                Context context = getContext();
                a11 = z6.a(header, resources, context == null ? null : context.getPackageName(), 0, 4);
            }
            jc.a(textView, a11);
        }
        e0 e0Var = this.f18479f;
        List<ButtonWithCards$ButtonWithCardsPane.Rendering.Card> cards = rendering.getCardsList();
        kotlin.jvm.internal.s.f(cards, "buttonWithCards.cardsList");
        e0Var.getClass();
        kotlin.jvm.internal.s.g(cards, "cards");
        e0Var.f18512a.clear();
        e0Var.f18512a.addAll(cards);
        e0Var.notifyDataSetChanged();
        if (rendering.hasButton()) {
            m8 m8Var4 = this.f18478e;
            if (m8Var4 == null) {
                kotlin.jvm.internal.s.x("binding");
                m8Var4 = null;
            }
            PlaidPrimaryButton plaidPrimaryButton = m8Var4.f19042f;
            plaidPrimaryButton.setOnClickListener(new View.OnClickListener() { // from class: qq.c
                {
                    com.plaid.internal.d0.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.plaid.internal.d0.a(com.plaid.internal.d0.this, view);
                }
            });
            kotlin.jvm.internal.s.f(plaidPrimaryButton, "");
            Common$ButtonContent button = rendering.getButton();
            if (button == null || (title2 = button.getTitle()) == null) {
                str = null;
            } else {
                Resources resources2 = plaidPrimaryButton.getResources();
                kotlin.jvm.internal.s.f(resources2, "resources");
                Context context2 = plaidPrimaryButton.getContext();
                str = z6.a(title2, resources2, context2 == null ? null : context2.getPackageName(), 0, 4);
            }
            jc.a(plaidPrimaryButton, str);
        }
        if (rendering.hasSecondaryButton()) {
            m8 m8Var5 = this.f18478e;
            if (m8Var5 == null) {
                kotlin.jvm.internal.s.x("binding");
                m8Var5 = null;
            }
            PlaidTertiaryButton plaidTertiaryButton = m8Var5.f19043g;
            plaidTertiaryButton.setOnClickListener(new View.OnClickListener() { // from class: qq.d
                {
                    com.plaid.internal.d0.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.plaid.internal.d0.b(com.plaid.internal.d0.this, view);
                }
            });
            kotlin.jvm.internal.s.f(plaidTertiaryButton, "");
            Common$ButtonContent secondaryButton = rendering.getSecondaryButton();
            if (secondaryButton != null && (title = secondaryButton.getTitle()) != null) {
                Resources resources3 = plaidTertiaryButton.getResources();
                kotlin.jvm.internal.s.f(resources3, "resources");
                Context context3 = plaidTertiaryButton.getContext();
                r2 = z6.a(title, resources3, context3 != null ? context3.getPackageName() : null, 0, 4);
            }
            jc.a(plaidTertiaryButton, r2);
        }
    }

    public static final void a(d0 this$0, View view) {
        List<Common$SDKEvent> m11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        f0 b11 = this$0.b();
        b11.getClass();
        f0.b bVar = f0.b.f18564a;
        ButtonWithCards$ButtonWithCardsPane.Actions.b bVar2 = f0.b.f18565b;
        ButtonWithCards$ButtonWithCardsPane.Rendering.Events events = b11.f18559j;
        m11 = wz.w.m(events == null ? null : events.getOnButtonTap());
        b11.a(bVar2, m11);
    }
}