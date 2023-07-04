package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.databinding.StripeChallengeFragmentBinding;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class ChallengeActivity$fragmentViewBinding$2 extends u implements h00.a<StripeChallengeFragmentBinding> {
    final /* synthetic */ ChallengeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$fragmentViewBinding$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final StripeChallengeFragmentBinding invoke() {
        return this.this$0.getFragment$3ds2sdk_release().getViewBinding$3ds2sdk_release();
    }
}