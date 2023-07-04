package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebview$ButtonWithWebviewPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;

/* loaded from: classes2.dex */
public final class o0 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p0 f19119a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var) {
        super(0);
        this.f19119a = p0Var;
    }

    @Override // h00.a
    public vz.b0 invoke() {
        p0 p0Var = this.f19119a;
        int i11 = p0.f19197f;
        s0 b11 = p0Var.b();
        ButtonWithWebview$ButtonWithWebviewPane.Actions.b buttonWithWebviewPaneDisclaimerAction = (ButtonWithWebview$ButtonWithWebviewPane.Actions.b) b11.f19406k.getValue();
        kotlin.jvm.internal.s.f(buttonWithWebviewPaneDisclaimerAction, "buttonWithWebviewPaneDisclaimerAction");
        b11.a(buttonWithWebviewPaneDisclaimerAction, (Common$SDKEvent) null);
        return vz.b0.f54756a;
    }
}