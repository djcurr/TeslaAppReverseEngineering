package com.plaid.link;

import com.plaid.link.event.LinkEvent;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes2.dex */
public final class Plaid$clearLinkEventListener$1 extends u implements l<LinkEvent, b0> {
    public static final Plaid$clearLinkEventListener$1 INSTANCE = new Plaid$clearLinkEventListener$1();

    public Plaid$clearLinkEventListener$1() {
        super(1);
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(LinkEvent linkEvent) {
        invoke2(linkEvent);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LinkEvent it2) {
        s.g(it2, "it");
    }
}