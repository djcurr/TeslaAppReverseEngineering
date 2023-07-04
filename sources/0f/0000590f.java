package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.databinding.StripeChallengeActivityBinding;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class ChallengeActivity$viewBinding$2 extends u implements h00.a<StripeChallengeActivityBinding> {
    final /* synthetic */ ChallengeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$viewBinding$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final StripeChallengeActivityBinding invoke() {
        StripeChallengeActivityBinding inflate = StripeChallengeActivityBinding.inflate(this.this$0.getLayoutInflater());
        s.f(inflate, "inflate(layoutInflater)");
        return inflate;
    }
}