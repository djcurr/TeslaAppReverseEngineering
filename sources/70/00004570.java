package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInput$UserInputPane;
import com.plaid.internal.x2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class sc extends xd {

    /* renamed from: h  reason: collision with root package name */
    public final kotlinx.coroutines.flow.t<UserInput$UserInputPane.Rendering> f19454h;

    /* renamed from: i  reason: collision with root package name */
    public final c4<ya> f19455i;

    /* renamed from: j  reason: collision with root package name */
    public Pane$PaneRendering f19456j;

    /* renamed from: k  reason: collision with root package name */
    public UserInput$UserInputPane.Rendering.Events f19457k;

    /* renamed from: l  reason: collision with root package name */
    public e4 f19458l;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.userinput.UserInputViewModel$1", f = "UserInputViewModel.kt", l = {41, 52}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Object f19459a;

        /* renamed from: b  reason: collision with root package name */
        public int f19460b;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ vd f19462d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vd vdVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f19462d = vdVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f19462d, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new a(this.f19462d, dVar).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.sc.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19463a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final UserInput$UserInputPane.Actions.b f19464b;

        /* renamed from: c  reason: collision with root package name */
        public static final UserInput$UserInputPane.Actions.b f19465c;

        /* renamed from: d  reason: collision with root package name */
        public static final UserInput$UserInputPane.Actions.b f19466d;

        static {
            UserInput$UserInputPane.Actions.b a11 = UserInput$UserInputPane.Actions.newBuilder().a(UserInput$UserInputPane.Actions.ExitAction.getDefaultInstance());
            kotlin.jvm.internal.s.f(a11, "newBuilder().setExit(Use…ion.getDefaultInstance())");
            f19464b = a11;
            UserInput$UserInputPane.Actions.b a12 = UserInput$UserInputPane.Actions.newBuilder().a(UserInput$UserInputPane.Actions.SecondaryButtonTapAction.getDefaultInstance());
            kotlin.jvm.internal.s.f(a12, "newBuilder().setSecondar…DefaultInstance()\n      )");
            f19465c = a12;
            UserInput$UserInputPane.Actions.b a13 = UserInput$UserInputPane.Actions.newBuilder().a(UserInput$UserInputPane.Actions.ButtonDisclaimerTapAction.getDefaultInstance());
            kotlin.jvm.internal.s.f(a13, "newBuilder().setButtonDi…DefaultInstance()\n      )");
            f19466d = a13;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final UserInput$UserInputPane.Rendering f19467a;

        /* renamed from: b  reason: collision with root package name */
        public final ya f19468b;

        /* loaded from: classes2.dex */
        public static final class a extends c {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UserInput$UserInputPane.Rendering rendering, ya promptWithOutput) {
                super(rendering, promptWithOutput, null);
                kotlin.jvm.internal.s.g(rendering, "rendering");
                kotlin.jvm.internal.s.g(promptWithOutput, "promptWithOutput");
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends c {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(UserInput$UserInputPane.Rendering rendering, ya promptWithOutput) {
                super(rendering, promptWithOutput, null);
                kotlin.jvm.internal.s.g(rendering, "rendering");
                kotlin.jvm.internal.s.g(promptWithOutput, "promptWithOutput");
            }
        }

        public c(UserInput$UserInputPane.Rendering rendering, ya yaVar) {
            this.f19467a = rendering;
            this.f19468b = yaVar;
        }

        public /* synthetic */ c(UserInput$UserInputPane.Rendering rendering, ya yaVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(rendering, yaVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(vd paneId, y7 paneHostComponent) {
        super(paneId, paneHostComponent);
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(paneHostComponent, "paneHostComponent");
        this.f19454h = kotlinx.coroutines.flow.a0.b(1, 0, null, 6, null);
        this.f19455i = new c4<>(null, 1);
        ((lc) ((x2.d0) paneHostComponent.j()).a()).a(this);
        v20.k.d(androidx.lifecycle.q0.a(this), null, null, new a(paneId, null), 3, null);
    }

    @Override // com.plaid.internal.xd
    public void a() {
        b bVar = b.f19463a;
        a(b.f19464b, (List<Common$SDKEvent>) null);
    }

    public final boolean c() {
        int t11;
        int e11;
        int d11;
        List<Common$SDKEvent> m11;
        List<? extends ya> list = this.f19455i.f18245c;
        if (list == null) {
            list = wz.w.i();
        }
        t11 = wz.x.t(list, 10);
        e11 = wz.r0.e(t11);
        d11 = m00.l.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ya yaVar = (ya) it2.next();
            e4 e4Var = this.f19458l;
            if (e4Var == null) {
                kotlin.jvm.internal.s.x("inputEncryption");
                e4Var = null;
            }
            String str = yaVar.f19898b;
            String str2 = str != null ? str : "";
            Common$TextInput input = yaVar.f19897a.getInput();
            String a11 = e4Var.a(str2, input == null ? null : input.getEncryption());
            if (a11 == null) {
                a11 = yaVar.f19898b;
            }
            Common$TextInput input2 = yaVar.f19897a.getInput();
            if (input2 != null) {
                r4 = input2.getId();
            }
            vz.p a12 = vz.v.a(r4, a11);
            linkedHashMap.put(a12.c(), a12.d());
        }
        kotlin.jvm.internal.s.g(linkedHashMap, "<this>");
        LinkedHashMap responseIdsToOutputs = new LinkedHashMap();
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it3.next();
            if (entry.getKey() != null) {
                responseIdsToOutputs.put(entry.getKey(), entry.getValue());
            }
        }
        b bVar = b.f19463a;
        kotlin.jvm.internal.s.g(responseIdsToOutputs, "responseIdsToOutputs");
        UserInput$UserInputPane.Actions.b newBuilder = UserInput$UserInputPane.Actions.newBuilder();
        UserInput$UserInputPane.Actions.SubmitAction.a newBuilder2 = UserInput$UserInputPane.Actions.SubmitAction.newBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : responseIdsToOutputs.entrySet()) {
            UserInput$UserInputPane.Actions.SubmitAction.Response.a newBuilder3 = UserInput$UserInputPane.Actions.SubmitAction.Response.newBuilder();
            String str3 = (String) entry2.getValue();
            if (str3 == null) {
                str3 = "";
            }
            newBuilder3.b(str3);
            newBuilder3.a((String) entry2.getKey());
            UserInput$UserInputPane.Actions.SubmitAction.Response build = newBuilder3.build();
            if (build != null) {
                arrayList.add(build);
            }
        }
        UserInput$UserInputPane.Actions.b a13 = newBuilder.a(newBuilder2.a(arrayList));
        kotlin.jvm.internal.s.f(a13, "newBuilder().setSubmit(\n…      }\n        )\n      )");
        UserInput$UserInputPane.Rendering.Events events = this.f19457k;
        m11 = wz.w.m(events != null ? events.getOnSubmitTap() : null);
        a(a13, m11);
        return true;
    }

    public final void a(UserInput$UserInputPane.Actions.b bVar, List<Common$SDKEvent> list) {
        Pane$PaneRendering pane$PaneRendering = this.f19456j;
        if (pane$PaneRendering == null) {
            kotlin.jvm.internal.s.x("pane");
            pane$PaneRendering = null;
        }
        String paneNodeId = pane$PaneRendering.getPaneNodeId();
        kotlin.jvm.internal.s.f(paneNodeId, "pane.paneNodeId");
        Pane$PaneOutput.a a11 = Pane$PaneOutput.newBuilder().a(bVar);
        kotlin.jvm.internal.s.f(a11, "newBuilder().setUserInput(action)");
        a(paneNodeId, a11, list);
    }
}