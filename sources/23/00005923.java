package com.stripe.android.stripe3ds2.views;

import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class ChallengeFragment$challengeZoneView$2 extends u implements h00.a<ChallengeZoneView> {
    final /* synthetic */ ChallengeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFragment$challengeZoneView$2(ChallengeFragment challengeFragment) {
        super(0);
        this.this$0 = challengeFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final ChallengeZoneView invoke() {
        ChallengeZoneView challengeZoneView = this.this$0.getViewBinding$3ds2sdk_release().caChallengeZone;
        s.f(challengeZoneView, "viewBinding.caChallengeZone");
        return challengeZoneView;
    }
}