package com.stripe.android.link.ui.verification;

import c1.i;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.ui.core.elements.OTPElement;
import h00.a;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class VerificationScreenKt$VerificationBody$8 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ String $email;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ int $headerStringResId;
    final /* synthetic */ boolean $isProcessing;
    final /* synthetic */ int $messageStringResId;
    final /* synthetic */ a<b0> $onBack;
    final /* synthetic */ a<b0> $onChangeEmailClick;
    final /* synthetic */ a<b0> $onResendCodeClick;
    final /* synthetic */ OTPElement $otpElement;
    final /* synthetic */ String $redactedPhoneNumber;
    final /* synthetic */ boolean $showChangeEmailMessage;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenKt$VerificationBody$8(int i11, int i12, boolean z11, String str, String str2, OTPElement oTPElement, boolean z12, ErrorMessage errorMessage, a<b0> aVar, a<b0> aVar2, a<b0> aVar3, int i13, int i14) {
        super(2);
        this.$headerStringResId = i11;
        this.$messageStringResId = i12;
        this.$showChangeEmailMessage = z11;
        this.$redactedPhoneNumber = str;
        this.$email = str2;
        this.$otpElement = oTPElement;
        this.$isProcessing = z12;
        this.$errorMessage = errorMessage;
        this.$onBack = aVar;
        this.$onChangeEmailClick = aVar2;
        this.$onResendCodeClick = aVar3;
        this.$$changed = i13;
        this.$$changed1 = i14;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        VerificationScreenKt.VerificationBody(this.$headerStringResId, this.$messageStringResId, this.$showChangeEmailMessage, this.$redactedPhoneNumber, this.$email, this.$otpElement, this.$isProcessing, this.$errorMessage, this.$onBack, this.$onChangeEmailClick, this.$onResendCodeClick, iVar, this.$$changed | 1, this.$$changed1);
    }
}