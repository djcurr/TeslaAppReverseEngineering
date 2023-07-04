package com.stripe.android.stripe3ds2.views;

import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class ChallengeActivity$fragment$2 extends u implements h00.a<ChallengeFragment> {
    final /* synthetic */ ChallengeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$fragment$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final ChallengeFragment invoke() {
        return (ChallengeFragment) this.this$0.getViewBinding$3ds2sdk_release().fragmentContainer.getFragment();
    }
}