package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.databinding.StripeChallengeSubmitDialogBinding;
import com.stripe.android.stripe3ds2.views.ChallengeSubmitDialogFactory;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class ChallengeSubmitDialogFactory$ChallengeSubmitDialog$viewBinding$2 extends u implements h00.a<StripeChallengeSubmitDialogBinding> {
    final /* synthetic */ ChallengeSubmitDialogFactory.ChallengeSubmitDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeSubmitDialogFactory$ChallengeSubmitDialog$viewBinding$2(ChallengeSubmitDialogFactory.ChallengeSubmitDialog challengeSubmitDialog) {
        super(0);
        this.this$0 = challengeSubmitDialog;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final StripeChallengeSubmitDialogBinding invoke() {
        StripeChallengeSubmitDialogBinding inflate = StripeChallengeSubmitDialogBinding.inflate(this.this$0.getLayoutInflater());
        s.f(inflate, "inflate(layoutInflater)");
        return inflate;
    }
}