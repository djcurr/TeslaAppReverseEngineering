package com.stripe.android.link.ui.inline;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class LinkInlineSignupView$Content$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ LinkInlineSignupView $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInlineSignupView$Content$2(LinkInlineSignupView linkInlineSignupView, int i11) {
        super(2);
        this.$tmp0_rcvr = linkInlineSignupView;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        this.$tmp0_rcvr.Content(iVar, this.$$changed | 1);
    }
}