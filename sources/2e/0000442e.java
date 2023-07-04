package com.plaid.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Oauth$OAuthPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.i7;
import com.plaid.internal.m7;
import com.plaid.link.R;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class i7 extends pd<m7> {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f18824f = 0;

    /* renamed from: e  reason: collision with root package name */
    public ga f18825e;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18826a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f18827b;

        static {
            int[] iArr = new int[m7.c.values().length];
            iArr[m7.c.BEFORE.ordinal()] = 1;
            iArr[m7.c.DURING.ordinal()] = 2;
            iArr[m7.c.AFTER.ordinal()] = 3;
            f18826a = iArr;
            int[] iArr2 = new int[Oauth$OAuthPane.Rendering.Content.b.values().length];
            iArr2[Oauth$OAuthPane.Rendering.Content.b.DETAIL_TEXT.ordinal()] = 1;
            iArr2[Oauth$OAuthPane.Rendering.Content.b.DETAIL_ORDERED_LIST.ordinal()] = 2;
            iArr2[Oauth$OAuthPane.Rendering.Content.b.DETAIL_NOT_SET.ordinal()] = 3;
            f18827b = iArr2;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.oauth.OAuthFragment$onViewCreated$1", f = "OAuthFragment.kt", l = {47}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f18828a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e<vz.p<m7.c, Oauth$OAuthPane.Rendering>> f18829b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ i7 f18830c;

        /* loaded from: classes2.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.f {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ i7 f18831a;

            public a(i7 i7Var) {
                this.f18831a = i7Var;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                vz.p pVar = (vz.p) obj;
                int i11 = i7.f18824f;
                this.f18831a.a((m7.c) pVar.c(), (Oauth$OAuthPane.Rendering) pVar.d());
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlinx.coroutines.flow.e<? extends vz.p<? extends m7.c, Oauth$OAuthPane.Rendering>> eVar, i7 i7Var, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f18829b = eVar;
            this.f18830c = i7Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(this.f18829b, this.f18830c, dVar);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new b(this.f18829b, this.f18830c, dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f18828a;
            if (i11 == 0) {
                vz.r.b(obj);
                kotlinx.coroutines.flow.e<vz.p<m7.c, Oauth$OAuthPane.Rendering>> eVar = this.f18829b;
                a aVar = new a(this.f18830c);
                this.f18828a = 1;
                if (eVar.collect(aVar, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.oauth.OAuthFragment$onViewCreated$combinedFlow$1", f = "OAuthFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements h00.q<m7.c, Oauth$OAuthPane.Rendering, zz.d<? super vz.p<? extends m7.c, ? extends Oauth$OAuthPane.Rendering>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f18832a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f18833b;

        public c(zz.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // h00.q
        public Object invoke(m7.c cVar, Oauth$OAuthPane.Rendering rendering, zz.d<? super vz.p<? extends m7.c, ? extends Oauth$OAuthPane.Rendering>> dVar) {
            c cVar2 = new c(dVar);
            cVar2.f18832a = cVar;
            cVar2.f18833b = rendering;
            return cVar2.invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            vz.r.b(obj);
            return new vz.p((m7.c) this.f18832a, (Oauth$OAuthPane.Rendering) this.f18833b);
        }
    }

    public i7() {
        super(m7.class);
    }

    @Override // com.plaid.internal.pd
    public m7 a(vd paneId, y7 component) {
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(component, "component");
        return new m7(paneId, component);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_oauth_fragment, viewGroup, false);
        int i11 = R.id.button_content;
        LinearLayout linearLayout = (LinearLayout) b5.b.a(inflate, i11);
        if (linearLayout != null) {
            i11 = R.id.content;
            TextView textView = (TextView) b5.b.a(inflate, i11);
            if (textView != null) {
                i11 = R.id.detailList;
                LinearLayout linearLayout2 = (LinearLayout) b5.b.a(inflate, i11);
                if (linearLayout2 != null) {
                    i11 = R.id.header;
                    TextView textView2 = (TextView) b5.b.a(inflate, i11);
                    if (textView2 != null) {
                        i11 = R.id.institution_right;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) b5.b.a(inflate, i11);
                        if (appCompatImageView != null) {
                            i11 = R.id.loading_dots;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) b5.b.a(inflate, i11);
                            if (appCompatImageView2 != null) {
                                i11 = R.id.plaid_navigation;
                                PlaidNavigationBar plaidNavigationBar = (PlaidNavigationBar) b5.b.a(inflate, i11);
                                if (plaidNavigationBar != null) {
                                    i11 = R.id.primaryButton;
                                    PlaidPrimaryButton plaidPrimaryButton = (PlaidPrimaryButton) b5.b.a(inflate, i11);
                                    if (plaidPrimaryButton != null) {
                                        LinearLayout linearLayout3 = (LinearLayout) inflate;
                                        ga gaVar = new ga(linearLayout3, linearLayout, textView, linearLayout2, textView2, appCompatImageView, appCompatImageView2, plaidNavigationBar, plaidPrimaryButton);
                                        kotlin.jvm.internal.s.f(gaVar, "inflate(inflater, container, false)");
                                        this.f18825e = gaVar;
                                        kotlin.jvm.internal.s.f(linearLayout3, "binding.root");
                                        return linearLayout3;
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
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new b(kotlinx.coroutines.flow.g.w(kotlinx.coroutines.flow.g.a(b().f19024h), kotlinx.coroutines.flow.g.a(b().f19025i), new c(null)), this, null), 3, null);
    }

    public final void a(m7.c cVar, Oauth$OAuthPane.Rendering rendering) {
        Oauth$OAuthPane.Rendering.Content before;
        String a11;
        int i11;
        ga gaVar;
        String str;
        Common$LocalizedString title;
        m00.i j11;
        String a12;
        int i12 = a.f18826a[cVar.ordinal()];
        if (i12 == 1) {
            before = rendering.getBefore();
        } else if (i12 == 2) {
            before = rendering.getDuring();
        } else if (i12 != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            before = rendering.getAfter();
        }
        if (rendering.hasInstitution()) {
            ga gaVar2 = this.f18825e;
            if (gaVar2 == null) {
                kotlin.jvm.internal.s.x("binding");
                gaVar2 = null;
            }
            AppCompatImageView appCompatImageView = gaVar2.f18672e;
            kotlin.jvm.internal.s.f(appCompatImageView, "binding.institutionRight");
            a4.a(appCompatImageView, rendering.getInstitution().getLogo());
        }
        if (before.hasHeader()) {
            ga gaVar3 = this.f18825e;
            if (gaVar3 == null) {
                kotlin.jvm.internal.s.x("binding");
                gaVar3 = null;
            }
            TextView textView = gaVar3.f18671d;
            kotlin.jvm.internal.s.f(textView, "binding.header");
            Common$LocalizedString header = before.getHeader();
            if (header == null) {
                a12 = null;
            } else {
                Resources resources = getResources();
                kotlin.jvm.internal.s.f(resources, "resources");
                Context context = getContext();
                a12 = z6.a(header, resources, context == null ? null : context.getPackageName(), 0, 4);
            }
            jc.a(textView, a12);
        }
        ga gaVar4 = this.f18825e;
        if (gaVar4 == null) {
            kotlin.jvm.internal.s.x("binding");
            gaVar4 = null;
        }
        gaVar4.f18670c.removeAllViews();
        Oauth$OAuthPane.Rendering.Content.b detailCase = before.getDetailCase();
        int i13 = detailCase == null ? -1 : a.f18827b[detailCase.ordinal()];
        if (i13 == 1) {
            ga gaVar5 = this.f18825e;
            if (gaVar5 == null) {
                kotlin.jvm.internal.s.x("binding");
                gaVar5 = null;
            }
            TextView textView2 = gaVar5.f18669b;
            kotlin.jvm.internal.s.f(textView2, "binding.content");
            Common$LocalizedString detailText = before.getDetailText();
            if (detailText == null) {
                a11 = null;
            } else {
                Resources resources2 = getResources();
                kotlin.jvm.internal.s.f(resources2, "resources");
                Context context2 = getContext();
                a11 = z6.a(detailText, resources2, context2 == null ? null : context2.getPackageName(), 0, 4);
            }
            jc.a(textView2, a11);
        } else if (i13 == 2) {
            ga gaVar6 = this.f18825e;
            if (gaVar6 == null) {
                kotlin.jvm.internal.s.x("binding");
                gaVar6 = null;
            }
            TextView textView3 = gaVar6.f18669b;
            kotlin.jvm.internal.s.f(textView3, "binding.content");
            textView3.setVisibility(8);
            Oauth$OAuthPane.Rendering.Content.OrderedList detailOrderedList = before.getDetailOrderedList();
            List<Common$LocalizedString> itemsList = detailOrderedList == null ? null : detailOrderedList.getItemsList();
            if (itemsList == null) {
                itemsList = wz.w.i();
            }
            j11 = wz.w.j(itemsList);
            int c11 = j11.c();
            int e11 = j11.e();
            if (c11 <= e11) {
                while (true) {
                    int i14 = c11 + 1;
                    ga gaVar7 = this.f18825e;
                    if (gaVar7 == null) {
                        kotlin.jvm.internal.s.x("binding");
                        gaVar7 = null;
                    }
                    LinearLayout linearLayout = gaVar7.f18670c;
                    Common$LocalizedString common$LocalizedString = itemsList.get(c11);
                    kotlin.jvm.internal.s.f(common$LocalizedString, "items[i]");
                    Common$LocalizedString common$LocalizedString2 = common$LocalizedString;
                    LayoutInflater layoutInflater = getLayoutInflater();
                    ga gaVar8 = this.f18825e;
                    if (gaVar8 == null) {
                        kotlin.jvm.internal.s.x("binding");
                        gaVar8 = null;
                    }
                    ia a13 = ia.a(layoutInflater, gaVar8.f18670c, false);
                    a13.f18847d.setText(String.valueOf(i14));
                    TextView textView4 = a13.f18846c;
                    kotlin.jvm.internal.s.f(textView4, "this.label");
                    Resources resources3 = getResources();
                    kotlin.jvm.internal.s.f(resources3, "resources");
                    Context context3 = getContext();
                    jc.a(textView4, z6.a(common$LocalizedString2, resources3, context3 == null ? null : context3.getPackageName(), 0, 4));
                    TextView textView5 = a13.f18845b;
                    kotlin.jvm.internal.s.f(textView5, "this.detail");
                    textView5.setVisibility(8);
                    ConstraintLayout constraintLayout = a13.f18844a;
                    kotlin.jvm.internal.s.f(constraintLayout, "inflate(layoutInflater, …isible = false\n    }.root");
                    linearLayout.addView(constraintLayout);
                    if (c11 == e11) {
                        break;
                    }
                    c11 = i14;
                }
            }
        } else if (i13 == 3) {
            ga gaVar9 = this.f18825e;
            if (gaVar9 == null) {
                kotlin.jvm.internal.s.x("binding");
                gaVar9 = null;
            }
            TextView textView6 = gaVar9.f18669b;
            kotlin.jvm.internal.s.f(textView6, "binding.content");
            textView6.setVisibility(8);
        }
        if (before.hasButton()) {
            ga gaVar10 = this.f18825e;
            if (gaVar10 == null) {
                kotlin.jvm.internal.s.x("binding");
                gaVar10 = null;
            }
            PlaidPrimaryButton plaidPrimaryButton = gaVar10.f18674g;
            kotlin.jvm.internal.s.f(plaidPrimaryButton, "binding.primaryButton");
            Common$ButtonContent button = before.getButton();
            if (button == null || (title = button.getTitle()) == null) {
                str = null;
            } else {
                Resources resources4 = getResources();
                kotlin.jvm.internal.s.f(resources4, "resources");
                Context context4 = getContext();
                str = z6.a(title, resources4, context4 == null ? null : context4.getPackageName(), 0, 4);
            }
            jc.a(plaidPrimaryButton, str);
            ga gaVar11 = this.f18825e;
            if (gaVar11 == null) {
                kotlin.jvm.internal.s.x("binding");
                gaVar11 = null;
            }
            gaVar11.f18674g.setOnClickListener(new View.OnClickListener() { // from class: qq.j
                {
                    i7.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i7.a(i7.this, view);
                }
            });
        }
        int i15 = a.f18826a[cVar.ordinal()];
        if (i15 == 1) {
            i11 = R.drawable.plaid_loading_dots_top_animation;
        } else if (i15 == 2) {
            i11 = R.drawable.plaid_loading_dots_top_4;
        } else if (i15 != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            i11 = R.drawable.plaid_loading_dots_bottom_animation;
        }
        ga gaVar12 = this.f18825e;
        if (gaVar12 == null) {
            kotlin.jvm.internal.s.x("binding");
            gaVar12 = null;
        }
        gaVar12.f18673f.setImageResource(i11);
        ga gaVar13 = this.f18825e;
        if (gaVar13 == null) {
            kotlin.jvm.internal.s.x("binding");
            gaVar13 = null;
        }
        if (gaVar13.f18673f.getDrawable() instanceof Animatable) {
            ga gaVar14 = this.f18825e;
            if (gaVar14 == null) {
                kotlin.jvm.internal.s.x("binding");
                gaVar = null;
            } else {
                gaVar = gaVar14;
            }
            Drawable drawable = gaVar.f18673f.getDrawable();
            Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
            ((Animatable) drawable).start();
        }
    }

    public static final void a(i7 this$0, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        m7 b11 = this$0.b();
        Pane$PaneRendering pane$PaneRendering = b11.f19026j;
        if (pane$PaneRendering == null) {
            kotlin.jvm.internal.s.x("pane");
            pane$PaneRendering = null;
        }
        Oauth$OAuthPane.Rendering oauth = pane$PaneRendering.getOauth();
        kotlin.jvm.internal.s.e(oauth);
        b11.a(oauth);
        v20.k.d(androidx.lifecycle.q0.a(b11), null, null, new n7(b11, oauth, null), 3, null);
    }
}