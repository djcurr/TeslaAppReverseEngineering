package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordion$ButtonWithAccordionPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.z;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f19655a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar) {
        super(0);
        this.f19655a = xVar;
    }

    @Override // h00.a
    public vz.b0 invoke() {
        x xVar = this.f19655a;
        int i11 = x.f19718f;
        z b11 = xVar.b();
        b11.getClass();
        z.b bVar = z.b.f19921a;
        Object value = z.b.f19924d.getValue();
        kotlin.jvm.internal.s.f(value, "<get-disclaimerTap>(...)");
        b11.a((ButtonWithAccordion$ButtonWithAccordionPane.Actions.b) value, (Common$SDKEvent) null);
        return vz.b0.f54756a;
    }
}