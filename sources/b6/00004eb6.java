package com.stripe.android.link;

import android.content.Intent;
import com.stripe.android.link.LinkActivityContract;
import h00.a;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class LinkActivity$starterArgs$2 extends u implements a<LinkActivityContract.Args> {
    final /* synthetic */ LinkActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkActivity$starterArgs$2(LinkActivity linkActivity) {
        super(0);
        this.this$0 = linkActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final LinkActivityContract.Args invoke() {
        LinkActivityContract.Args.Companion companion = LinkActivityContract.Args.Companion;
        Intent intent = this.this$0.getIntent();
        s.f(intent, "intent");
        LinkActivityContract.Args fromIntent$link_release = companion.fromIntent$link_release(intent);
        if (fromIntent$link_release != null) {
            return fromIntent$link_release;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}