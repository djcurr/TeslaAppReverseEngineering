package com.stripe.android.link;

import h00.l;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
/* synthetic */ class LinkActivity$onCreate$2 extends p implements l<LinkActivityResult, b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkActivity$onCreate$2(Object obj) {
        super(1, obj, LinkActivity.class, "dismiss", "dismiss(Lcom/stripe/android/link/LinkActivityResult;)V", 0);
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(LinkActivityResult linkActivityResult) {
        invoke2(linkActivityResult);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LinkActivityResult p02) {
        s.g(p02, "p0");
        ((LinkActivity) this.receiver).dismiss(p02);
    }
}