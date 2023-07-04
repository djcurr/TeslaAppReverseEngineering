package com.stripe.android.link.ui.wallet;

import c1.i;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.model.LinkAccount;
import h00.l;
import h00.p;
import h00.q;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class WalletScreenKt$WalletBody$6 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ NonFallbackInjector $injector;
    final /* synthetic */ LinkAccount $linkAccount;
    final /* synthetic */ l<q<? super p0.i, ? super i, ? super Integer, b0>, b0> $showBottomSheetContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletScreenKt$WalletBody$6(LinkAccount linkAccount, NonFallbackInjector nonFallbackInjector, l<? super q<? super p0.i, ? super i, ? super Integer, b0>, b0> lVar, int i11) {
        super(2);
        this.$linkAccount = linkAccount;
        this.$injector = nonFallbackInjector;
        this.$showBottomSheetContent = lVar;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        WalletScreenKt.WalletBody(this.$linkAccount, this.$injector, this.$showBottomSheetContent, iVar, this.$$changed | 1);
    }
}