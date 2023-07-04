package com.stripe.android.link.ui.inline;

import c1.i;
import com.stripe.android.link.injection.NonFallbackInjector;
import h00.a;
import h00.l;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class LinkInlineSignupViewKt$LinkInlineSignup$3 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ NonFallbackInjector $injector;
    final /* synthetic */ l<Boolean, b0> $onSelected;
    final /* synthetic */ l<UserInput, b0> $onUserInput;
    final /* synthetic */ a<b0> $onUserInteracted;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkInlineSignupViewKt$LinkInlineSignup$3(NonFallbackInjector nonFallbackInjector, boolean z11, a<b0> aVar, l<? super Boolean, b0> lVar, l<? super UserInput, b0> lVar2, int i11) {
        super(2);
        this.$injector = nonFallbackInjector;
        this.$enabled = z11;
        this.$onUserInteracted = aVar;
        this.$onSelected = lVar;
        this.$onUserInput = lVar2;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        LinkInlineSignupViewKt.LinkInlineSignup(this.$injector, this.$enabled, this.$onUserInteracted, this.$onSelected, this.$onUserInput, iVar, this.$$changed | 1);
    }
}