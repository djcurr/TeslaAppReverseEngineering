package com.plaid.link;

import com.plaid.internal.e7;
import com.plaid.internal.z2;
import com.plaid.link.event.LinkEvent;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes2.dex */
public final class Plaid$setLinkEventListener$1 extends u implements l<LinkEvent, b0> {
    public final /* synthetic */ l<LinkEvent, b0> $linkEventListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Plaid$setLinkEventListener$1(l<? super LinkEvent, b0> lVar) {
        super(1);
        this.$linkEventListener = lVar;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(LinkEvent linkEvent) {
        invoke2(linkEvent);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LinkEvent event) {
        s.g(event, "event");
        ((z2) Plaid.getComponent$link_sdk_release()).i().a(new e7(event.getEventName().getJson(), event.getMetadata().toMap()));
        this.$linkEventListener.invoke(event);
    }
}