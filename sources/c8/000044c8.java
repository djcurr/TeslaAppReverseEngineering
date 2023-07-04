package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.sc;
import java.util.List;

/* loaded from: classes2.dex */
public final class nc extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ oc f19100a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(oc ocVar) {
        super(0);
        this.f19100a = ocVar;
    }

    @Override // h00.a
    /* renamed from: invoke */
    public vz.b0 mo11invoke() {
        oc ocVar = this.f19100a;
        int i11 = oc.f19182g;
        sc b11 = ocVar.b();
        b11.getClass();
        sc.b bVar = sc.b.f19463a;
        b11.a(sc.b.f19466d, (List<Common$SDKEvent>) null);
        return vz.b0.f54756a;
    }
}