package com.plaid.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Transition;
import com.plaid.internal.core.ui_components.PlaidLoadingView;
import com.plaid.internal.wa;
import com.plaid.internal.xd;
import com.stripe.android.paymentsheet.ui.PrimaryButtonAnimator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class pd<VM extends xd> extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    public static final a f19253d = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Class<VM> f19254a;

    /* renamed from: b  reason: collision with root package name */
    public VM f19255b;

    /* renamed from: c  reason: collision with root package name */
    public final vz.k f19256c;

    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19257a;

        static {
            int[] iArr = new int[Common$LocalAction.a.values().length];
            iArr[Common$LocalAction.a.SHOW_MODAL.ordinal()] = 1;
            iArr[Common$LocalAction.a.HIDE_MODAL.ordinal()] = 2;
            iArr[Common$LocalAction.a.GO_BACK.ordinal()] = 3;
            iArr[Common$LocalAction.a.FOCUS_INPUT.ordinal()] = 4;
            f19257a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.a<vd> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pd<VM> f19258a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(pd<VM> pdVar) {
            super(0);
            this.f19258a = pdVar;
        }

        @Override // h00.a
        public vd invoke() {
            Bundle arguments = this.f19258a.getArguments();
            vd vdVar = arguments == null ? null : (vd) arguments.getParcelable("workflow_pane_id");
            if (vdVar != null) {
                return vdVar;
            }
            throw new RuntimeException("Needs pane id");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<Common$LocalAction, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pd<VM> f19259a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h00.l<String, vz.b0> f19260b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ h00.a<vz.b0> f19261c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(pd<VM> pdVar, h00.l<? super String, vz.b0> lVar, h00.a<vz.b0> aVar) {
            super(1);
            this.f19259a = pdVar;
            this.f19260b = lVar;
            this.f19261c = aVar;
        }

        @Override // h00.l
        public Boolean invoke(Common$LocalAction common$LocalAction) {
            Common$LocalAction it2 = common$LocalAction;
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(pd.a(this.f19259a, it2, this.f19260b, this.f19261c));
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.l<Pane$Transition, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pd<VM> f19262a;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f19263a;

            static {
                int[] iArr = new int[Pane$Transition.b.values().length];
                iArr[Pane$Transition.b.RISING_TIDE.ordinal()] = 1;
                f19263a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(pd<VM> pdVar) {
            super(1);
            this.f19262a = pdVar;
        }

        @Override // h00.l
        public vz.b0 invoke(Pane$Transition pane$Transition) {
            Pane$Transition pane$Transition2 = pane$Transition;
            if (pane$Transition2 == null) {
                this.f19262a.a((long) PrimaryButtonAnimator.HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION);
            } else {
                Pane$Transition.b styleCase = pane$Transition2.getStyleCase();
                if ((styleCase == null ? -1 : a.f19263a[styleCase.ordinal()]) == 1) {
                    pd<VM> pdVar = this.f19262a;
                    Pane$Transition.RisingTide risingTide = pane$Transition2.getRisingTide();
                    pdVar.getClass();
                    if (risingTide != null) {
                        v20.k.d(androidx.lifecycle.q0.a(pdVar.b()), null, null, new sd(risingTide, pdVar, null), 3, null);
                    }
                } else {
                    this.f19262a.a(0L);
                }
            }
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.l<y7, xd> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pd<VM> f19264a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(pd<VM> pdVar) {
            super(1);
            this.f19264a = pdVar;
        }

        @Override // h00.l
        public xd invoke(y7 y7Var) {
            y7 component = y7Var;
            kotlin.jvm.internal.s.g(component, "component");
            pd<VM> pdVar = this.f19264a;
            vd modelId = (vd) pdVar.f19256c.getValue();
            kotlin.jvm.internal.s.f(modelId, "modelId");
            return pdVar.a(modelId, component);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.l<Common$LocalAction, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pd<VM> f19265a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h00.l<String, vz.b0> f19266b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ h00.a<vz.b0> f19267c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(pd<VM> pdVar, h00.l<? super String, vz.b0> lVar, h00.a<vz.b0> aVar) {
            super(1);
            this.f19265a = pdVar;
            this.f19266b = lVar;
            this.f19267c = aVar;
        }

        @Override // h00.l
        public Boolean invoke(Common$LocalAction common$LocalAction) {
            Common$LocalAction it2 = common$LocalAction;
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(pd.a(this.f19265a, it2, this.f19266b, this.f19267c));
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.WorkflowPaneFragment$onViewCreated$1", f = "WorkflowPaneFragment.kt", l = {103, 108, 112}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Object f19268a;

        /* renamed from: b  reason: collision with root package name */
        public Object f19269b;

        /* renamed from: c  reason: collision with root package name */
        public Object f19270c;

        /* renamed from: d  reason: collision with root package name */
        public Object f19271d;

        /* renamed from: e  reason: collision with root package name */
        public int f19272e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ pd<VM> f19273f;

        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<View, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ pd<VM> f19274a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(pd<VM> pdVar) {
                super(1);
                this.f19274a = pdVar;
            }

            @Override // h00.l
            public vz.b0 invoke(View view) {
                View it2 = view;
                kotlin.jvm.internal.s.g(it2, "it");
                androidx.fragment.app.h activity = this.f19274a.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return vz.b0.f54756a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<View, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ pd<VM> f19275a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(pd<VM> pdVar) {
                super(1);
                this.f19275a = pdVar;
            }

            @Override // h00.l
            public vz.b0 invoke(View view) {
                View it2 = view;
                kotlin.jvm.internal.s.g(it2, "it");
                this.f19275a.b().a();
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(pd<VM> pdVar, zz.d<? super h> dVar) {
            super(2, dVar);
            this.f19273f = pdVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new h(this.f19273f, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new h(this.f19273f, dVar).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00d6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 258
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.pd.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.WorkflowPaneFragment$showDefaultTransition$1", f = "WorkflowPaneFragment.kt", l = {243}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19276a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f19277b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ pd<VM> f19278c;

        /* loaded from: classes2.dex */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ pd<VM> f19279a;

            public a(pd<VM> pdVar) {
                this.f19279a = pdVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                kotlin.jvm.internal.s.g(animation, "animation");
                View view = this.f19279a.getView();
                if (view == null) {
                    return;
                }
                view.setVisibility(8);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(long j11, pd<VM> pdVar, zz.d<? super i> dVar) {
            super(2, dVar);
            this.f19277b = j11;
            this.f19278c = pdVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new i(this.f19277b, this.f19278c, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new i(this.f19277b, this.f19278c, dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            List<String> messages;
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            d11 = a00.d.d();
            int i11 = this.f19276a;
            if (i11 == 0) {
                vz.r.b(obj);
                long j11 = this.f19277b;
                this.f19276a = 1;
                if (v20.y0.b(j11, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            View view = this.f19278c.getView();
            if (view != null && (animate = view.animate()) != null && (alpha = animate.alpha(BitmapDescriptorFactory.HUE_RED)) != null && (duration = alpha.setDuration(PrimaryButtonAnimator.HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION)) != null) {
                duration.setListener(new a(this.f19278c));
            }
            pd<VM> pdVar = this.f19278c;
            a aVar = pd.f19253d;
            PlaidLoadingView b11 = ((ud) pdVar.requireActivity()).b();
            if (b11 != null) {
                messages = wz.w.i();
                int i12 = PlaidLoadingView.f18456e;
                kotlin.jvm.internal.s.g(messages, "messages");
                b11.a(0, 100, 0L, 32000L, messages, b11.f18458b);
            }
            return vz.b0.f54756a;
        }
    }

    public pd(Class<VM> viewModelClass) {
        vz.k a11;
        kotlin.jvm.internal.s.g(viewModelClass, "viewModelClass");
        this.f19254a = viewModelClass;
        a11 = vz.m.a(new c(this));
        this.f19256c = a11;
    }

    public final pd<VM> a(vd paneId) {
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(paneId, "paneId");
        setArguments(r3.b.a(vz.v.a("workflow_pane_id", paneId)));
        return this;
    }

    public abstract VM a(vd vdVar, y7 y7Var);

    public final VM b() {
        VM vm2 = this.f19255b;
        if (vm2 != null) {
            return vm2;
        }
        kotlin.jvm.internal.s.x("viewModel");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        ObjectAnimator objectAnimator;
        super.onCreate(bundle);
        PlaidLoadingView b11 = ((ud) requireActivity()).b();
        if (b11 != null && (objectAnimator = b11.f18460d) != null) {
            objectAnimator.end();
        }
        androidx.fragment.app.h activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type com.plaid.internal.workflow.panes.WorkflowViewModelFactoryProvider");
        androidx.lifecycle.p0 a11 = new androidx.lifecycle.s0(this, ((ae) activity).a(new f(this))).a(this.f19254a);
        kotlin.jvm.internal.s.f(a11, "ViewModelProvider(this, …tory).get(viewModelClass)");
        VM vm2 = (VM) a11;
        kotlin.jvm.internal.s.g(vm2, "<set-?>");
        this.f19255b = vm2;
        VM b12 = b();
        e listener = new e(this);
        b12.getClass();
        kotlin.jvm.internal.s.g(listener, "listener");
        b12.f19844f = listener;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.s.g(view, "view");
        super.onViewCreated(view, bundle);
        Object systemService = view.getContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new h(this, null), 3, null);
    }

    public static final boolean a(pd pdVar, Common$LocalAction action, h00.l lVar, h00.a aVar) {
        pdVar.getClass();
        Common$LocalAction.a actionCase = action.getActionCase();
        int i11 = actionCase == null ? -1 : b.f19257a[actionCase.ordinal()];
        if (i11 == 1) {
            qd submitAction = new qd(aVar);
            kotlin.jvm.internal.s.g(action, "action");
            kotlin.jvm.internal.s.g(submitAction, "submitAction");
            if (action.hasShowModal()) {
                Common$Modal showModal = action.getShowModal();
                if (showModal != null) {
                    v20.k.d(androidx.lifecycle.q0.a(pdVar.b()), null, null, new rd(pdVar, showModal, submitAction, null), 3, null);
                } else {
                    wa.a.b(wa.f19678a, kotlin.jvm.internal.s.p("Did not have modal model for ", action), false, 2);
                }
            }
        } else if (i11 == 2) {
            Fragment h02 = pdVar.getChildFragmentManager().h0("PlaidModal");
            if (h02 != null) {
                pdVar.getChildFragmentManager().m().o(h02).i();
            }
        } else if (i11 == 3) {
            androidx.fragment.app.h activity = pdVar.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        } else if (i11 != 4) {
            wa.a.b(wa.f19678a, kotlin.jvm.internal.s.p("Unknown localAction: ", action), false, 2);
            return true;
        } else {
            if (lVar != null) {
                String focusInput = action.getFocusInput();
                kotlin.jvm.internal.s.f(focusInput, "action.focusInput");
                lVar.invoke(focusInput);
            }
            if (lVar == null) {
                return true;
            }
        }
        return action.getAlsoSubmitAction();
    }

    public final void a(Common$ButtonContent buttonContent, h00.a<vz.b0> submitAction, h00.l<? super String, vz.b0> lVar) {
        kotlin.jvm.internal.s.g(buttonContent, "buttonContent");
        kotlin.jvm.internal.s.g(submitAction, "submitAction");
        if (b().a(buttonContent, new d(this, lVar, submitAction))) {
            submitAction.invoke();
        }
    }

    public final void a(Common$LocalAction localAction, h00.l<? super String, vz.b0> lVar, h00.a<vz.b0> submitAction) {
        kotlin.jvm.internal.s.g(localAction, "localAction");
        kotlin.jvm.internal.s.g(submitAction, "submitAction");
        if (b().a(localAction, new g(this, lVar, submitAction))) {
            submitAction.invoke();
        }
    }

    public final void a(long j11) {
        v20.k.d(androidx.lifecycle.q0.a(b()), null, null, new i(j11, this, null), 3, null);
    }
}