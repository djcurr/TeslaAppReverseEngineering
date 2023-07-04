package com.stripe.android.link.ui.paymentmethod;

import c1.i;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.model.LinkAccount;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentMethodScreenKt$PaymentMethodBody$4 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ NonFallbackInjector $injector;
    final /* synthetic */ LinkAccount $linkAccount;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodScreenKt$PaymentMethodBody$4(LinkAccount linkAccount, NonFallbackInjector nonFallbackInjector, int i11) {
        super(2);
        this.$linkAccount = linkAccount;
        this.$injector = nonFallbackInjector;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        PaymentMethodScreenKt.PaymentMethodBody(this.$linkAccount, this.$injector, iVar, this.$$changed | 1);
    }
}