package com.plaid.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonList$ButtonListPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.j8;
import com.plaid.internal.s;
import com.plaid.link.R;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class r extends pd<s> {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f19330g = 0;

    /* renamed from: e  reason: collision with root package name */
    public k8 f19331e;

    /* renamed from: f  reason: collision with root package name */
    public final j8 f19332f;

    /* loaded from: classes2.dex */
    public static final class a implements j8.a {
        public a() {
        }

        @Override // com.plaid.internal.j8.a
        public void a(int i11) {
            Common$ButtonContent buttonOne;
            ButtonList$ButtonListPane.Actions.b bVar;
            ButtonList$ButtonListPane.Rendering.Events events;
            r rVar = r.this;
            int i12 = r.f19330g;
            s b11 = rVar.b();
            b11.getClass();
            Common$SDKEvent common$SDKEvent = null;
            if (i11 == 0) {
                Pane$PaneRendering pane$PaneRendering = b11.f19390i;
                if (pane$PaneRendering == null) {
                    kotlin.jvm.internal.s.x("pane");
                    pane$PaneRendering = null;
                }
                buttonOne = pane$PaneRendering.getButtonList().getButtonOne();
            } else if (i11 == 1) {
                Pane$PaneRendering pane$PaneRendering2 = b11.f19390i;
                if (pane$PaneRendering2 == null) {
                    kotlin.jvm.internal.s.x("pane");
                    pane$PaneRendering2 = null;
                }
                buttonOne = pane$PaneRendering2.getButtonList().getButtonTwo();
            } else if (i11 == 2) {
                Pane$PaneRendering pane$PaneRendering3 = b11.f19390i;
                if (pane$PaneRendering3 == null) {
                    kotlin.jvm.internal.s.x("pane");
                    pane$PaneRendering3 = null;
                }
                buttonOne = pane$PaneRendering3.getButtonList().getButtonThree();
            } else if (i11 == 3) {
                Pane$PaneRendering pane$PaneRendering4 = b11.f19390i;
                if (pane$PaneRendering4 == null) {
                    kotlin.jvm.internal.s.x("pane");
                    pane$PaneRendering4 = null;
                }
                buttonOne = pane$PaneRendering4.getButtonList().getButtonFour();
            } else if (i11 == 4) {
                Pane$PaneRendering pane$PaneRendering5 = b11.f19390i;
                if (pane$PaneRendering5 == null) {
                    kotlin.jvm.internal.s.x("pane");
                    pane$PaneRendering5 = null;
                }
                buttonOne = pane$PaneRendering5.getButtonList().getButtonFive();
            } else {
                throw new r5("Unknown button number was tapped");
            }
            if (b11.a(buttonOne, (h00.l<? super Common$LocalAction, Boolean>) null)) {
                if (i11 == 0) {
                    s.b bVar2 = s.b.f19396a;
                    bVar = s.b.f19397b;
                } else if (i11 == 1) {
                    s.b bVar3 = s.b.f19396a;
                    bVar = s.b.f19398c;
                } else if (i11 == 2) {
                    s.b bVar4 = s.b.f19396a;
                    bVar = s.b.f19399d;
                } else if (i11 == 3) {
                    s.b bVar5 = s.b.f19396a;
                    bVar = s.b.f19400e;
                } else if (i11 == 4) {
                    s.b bVar6 = s.b.f19396a;
                    bVar = s.b.f19401f;
                } else {
                    throw new r5("Unknown button number was tapped");
                }
                if (i11 == 0) {
                    ButtonList$ButtonListPane.Rendering.Events events2 = b11.f19391j;
                    if (events2 != null) {
                        common$SDKEvent = events2.getOnButtonOneTap();
                    }
                } else if (i11 == 1) {
                    ButtonList$ButtonListPane.Rendering.Events events3 = b11.f19391j;
                    if (events3 != null) {
                        common$SDKEvent = events3.getOnButtonTwoTap();
                    }
                } else if (i11 == 2) {
                    ButtonList$ButtonListPane.Rendering.Events events4 = b11.f19391j;
                    if (events4 != null) {
                        common$SDKEvent = events4.getOnButtonThreeTap();
                    }
                } else if (i11 == 3) {
                    ButtonList$ButtonListPane.Rendering.Events events5 = b11.f19391j;
                    if (events5 != null) {
                        common$SDKEvent = events5.getOnButtonFourTap();
                    }
                } else if (i11 == 4 && (events = b11.f19391j) != null) {
                    common$SDKEvent = events.getOnButtonFiveTap();
                }
                b11.a(bVar, common$SDKEvent);
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.buttonwithlist.ButtonListFragment$onViewCreated$1", f = "ButtonListFragment.kt", l = {51}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19334a;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a implements kotlinx.coroutines.flow.f, kotlin.jvm.internal.m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ r f19336a;

            public a(r rVar) {
                this.f19336a = rVar;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                String a11;
                String a12;
                ButtonList$ButtonListPane.Rendering rendering = (ButtonList$ButtonListPane.Rendering) obj;
                r rVar = this.f19336a;
                int i11 = r.f19330g;
                rVar.getClass();
                if (rendering.hasInstitution()) {
                    k8 k8Var = rVar.f19331e;
                    if (k8Var == null) {
                        kotlin.jvm.internal.s.x("binding");
                        k8Var = null;
                    }
                    PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = k8Var.f18935f;
                    kotlin.jvm.internal.s.f(plaidInstitutionHeaderItem, "binding.plaidInstitution");
                    k9.a(plaidInstitutionHeaderItem, rendering.getInstitution());
                }
                if (rendering.hasMessage()) {
                    k8 k8Var2 = rVar.f19331e;
                    if (k8Var2 == null) {
                        kotlin.jvm.internal.s.x("binding");
                        k8Var2 = null;
                    }
                    TextView textView = k8Var2.f18933d;
                    kotlin.jvm.internal.s.f(textView, "binding.plaidButtonMessage");
                    Common$LocalizedString message = rendering.getMessage();
                    if (message == null) {
                        a12 = null;
                    } else {
                        Resources resources = rVar.getResources();
                        kotlin.jvm.internal.s.f(resources, "resources");
                        Context context = rVar.getContext();
                        a12 = z6.a(message, resources, context == null ? null : context.getPackageName(), 0, 4);
                    }
                    jc.a(textView, a12);
                }
                if (rendering.hasMessageDetail()) {
                    k8 k8Var3 = rVar.f19331e;
                    if (k8Var3 == null) {
                        kotlin.jvm.internal.s.x("binding");
                        k8Var3 = null;
                    }
                    TextView textView2 = k8Var3.f18934e;
                    kotlin.jvm.internal.s.f(textView2, "binding.plaidButtonMessageDetail");
                    Common$LocalizedString messageDetail = rendering.getMessageDetail();
                    if (messageDetail == null) {
                        a11 = null;
                    } else {
                        Resources resources2 = rVar.getResources();
                        kotlin.jvm.internal.s.f(resources2, "resources");
                        Context context2 = rVar.getContext();
                        a11 = z6.a(messageDetail, resources2, context2 == null ? null : context2.getPackageName(), 0, 4);
                    }
                    jc.a(textView2, a11);
                }
                if (rendering.hasDisclaimer()) {
                    k8 k8Var4 = rVar.f19331e;
                    if (k8Var4 == null) {
                        kotlin.jvm.internal.s.x("binding");
                        k8Var4 = null;
                    }
                    TextView textView3 = k8Var4.f18931b;
                    kotlin.jvm.internal.s.f(textView3, "binding.plaidButtonDisclaimer");
                    Common$LocalizedString disclaimer = rendering.getDisclaimer();
                    if (disclaimer != null) {
                        Resources resources3 = rVar.getResources();
                        kotlin.jvm.internal.s.f(resources3, "resources");
                        Context context3 = rVar.getContext();
                        r2 = z6.a(disclaimer, resources3, context3 != null ? context3.getPackageName() : null, 0, 4);
                    }
                    jc.a(textView3, r2);
                }
                ArrayList buttons = new ArrayList();
                if (rendering.hasButtonOne()) {
                    Common$ButtonContent buttonOne = rendering.getButtonOne();
                    kotlin.jvm.internal.s.f(buttonOne, "buttonList.buttonOne");
                    buttons.add(buttonOne);
                }
                if (rendering.hasButtonTwo()) {
                    Common$ButtonContent buttonTwo = rendering.getButtonTwo();
                    kotlin.jvm.internal.s.f(buttonTwo, "buttonList.buttonTwo");
                    buttons.add(buttonTwo);
                }
                if (rendering.hasButtonThree()) {
                    Common$ButtonContent buttonThree = rendering.getButtonThree();
                    kotlin.jvm.internal.s.f(buttonThree, "buttonList.buttonThree");
                    buttons.add(buttonThree);
                }
                if (rendering.hasButtonFour()) {
                    Common$ButtonContent buttonFour = rendering.getButtonFour();
                    kotlin.jvm.internal.s.f(buttonFour, "buttonList.buttonFour");
                    buttons.add(buttonFour);
                }
                if (rendering.hasButtonFive()) {
                    Common$ButtonContent buttonFive = rendering.getButtonFive();
                    kotlin.jvm.internal.s.f(buttonFive, "buttonList.buttonFive");
                    buttons.add(buttonFive);
                }
                j8 j8Var = rVar.f19332f;
                j8Var.getClass();
                kotlin.jvm.internal.s.g(buttons, "buttons");
                j8Var.f18887b.clear();
                j8Var.f18887b.addAll(buttons);
                j8Var.notifyDataSetChanged();
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
                return new kotlin.jvm.internal.a(2, this.f19336a, r.class, "bindView", "bindView(Lcom/plaid/internal/core/protos/link/workflow/nodes/panes/ButtonList$ButtonListPane$Rendering;)V", 4);
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
        /* renamed from: invoke */
        public Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new b(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f19334a;
            if (i11 == 0) {
                vz.r.b(obj);
                r rVar = r.this;
                int i12 = r.f19330g;
                kotlinx.coroutines.flow.y a11 = kotlinx.coroutines.flow.g.a(rVar.b().f19389h);
                a aVar = new a(r.this);
                this.f19334a = 1;
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

    public r() {
        super(s.class);
        this.f19332f = new j8(new a());
    }

    @Override // com.plaid.internal.pd
    public s a(vd paneId, y7 component) {
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(component, "component");
        return new s(paneId, component);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_button_list_fragment, viewGroup, false);
        int i11 = R.id.plaid_button_disclaimer;
        TextView textView = (TextView) b5.b.a(inflate, i11);
        if (textView != null) {
            i11 = R.id.plaid_button_list_content;
            RecyclerView recyclerView = (RecyclerView) b5.b.a(inflate, i11);
            if (recyclerView != null) {
                i11 = R.id.plaid_button_message;
                TextView textView2 = (TextView) b5.b.a(inflate, i11);
                if (textView2 != null) {
                    i11 = R.id.plaid_button_message_detail;
                    TextView textView3 = (TextView) b5.b.a(inflate, i11);
                    if (textView3 != null) {
                        i11 = R.id.plaid_institution;
                        PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = (PlaidInstitutionHeaderItem) b5.b.a(inflate, i11);
                        if (plaidInstitutionHeaderItem != null) {
                            i11 = R.id.plaid_navigation;
                            PlaidNavigationBar plaidNavigationBar = (PlaidNavigationBar) b5.b.a(inflate, i11);
                            if (plaidNavigationBar != null) {
                                LinearLayout linearLayout = (LinearLayout) inflate;
                                k8 k8Var = new k8(linearLayout, textView, recyclerView, textView2, textView3, plaidInstitutionHeaderItem, plaidNavigationBar);
                                kotlin.jvm.internal.s.f(k8Var, "inflate(inflater, container, false)");
                                this.f19331e = k8Var;
                                return linearLayout;
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
        k8 k8Var = this.f19331e;
        if (k8Var == null) {
            kotlin.jvm.internal.s.x("binding");
            k8Var = null;
        }
        RecyclerView recyclerView = k8Var.f18932c;
        Resources resources = getResources();
        kotlin.jvm.internal.s.f(resources, "resources");
        int i11 = R.dimen.plaid_space_1x;
        kotlin.jvm.internal.s.g(resources, "resources");
        recyclerView.addItemDecoration(new qa(resources.getDimensionPixelSize(i11)));
        k8 k8Var2 = this.f19331e;
        if (k8Var2 == null) {
            kotlin.jvm.internal.s.x("binding");
            k8Var2 = null;
        }
        k8Var2.f18932c.setAdapter(this.f19332f);
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new b(null), 3, null);
    }
}