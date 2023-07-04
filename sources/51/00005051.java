package com.stripe.android.link.ui.verification;

import c1.i;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.model.LinkAccount;
import h00.a;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class VerificationScreenKt$VerificationBody$6 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $headerStringResId;
    final /* synthetic */ NonFallbackInjector $injector;
    final /* synthetic */ LinkAccount $linkAccount;
    final /* synthetic */ int $messageStringResId;
    final /* synthetic */ a<b0> $onVerificationCompleted;
    final /* synthetic */ boolean $showChangeEmailMessage;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenKt$VerificationBody$6(int i11, int i12, boolean z11, LinkAccount linkAccount, NonFallbackInjector nonFallbackInjector, a<b0> aVar, int i13, int i14) {
        super(2);
        this.$headerStringResId = i11;
        this.$messageStringResId = i12;
        this.$showChangeEmailMessage = z11;
        this.$linkAccount = linkAccount;
        this.$injector = nonFallbackInjector;
        this.$onVerificationCompleted = aVar;
        this.$$changed = i13;
        this.$$default = i14;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        VerificationScreenKt.VerificationBody(this.$headerStringResId, this.$messageStringResId, this.$showChangeEmailMessage, this.$linkAccount, this.$injector, this.$onVerificationCompleted, iVar, this.$$changed | 1, this.$$default);
    }
}