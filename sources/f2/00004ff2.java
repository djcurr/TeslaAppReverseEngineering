package com.stripe.android.link.ui.inline;

import h00.a;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class LinkInlineSignupViewKt$LinkInlineSignup$4$1$1$1$1 extends u implements a<b0> {
    final /* synthetic */ a<b0> $onUserInteracted;
    final /* synthetic */ a<b0> $toggleExpanded;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInlineSignupViewKt$LinkInlineSignup$4$1$1$1$1(a<b0> aVar, a<b0> aVar2) {
        super(0);
        this.$toggleExpanded = aVar;
        this.$onUserInteracted = aVar2;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$toggleExpanded.invoke();
        this.$onUserInteracted.invoke();
    }
}