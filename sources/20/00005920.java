package com.stripe.android.stripe3ds2.views;

import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class ChallengeFragment$challengeEntryViewFactory$2 extends u implements h00.a<ChallengeEntryViewFactory> {
    final /* synthetic */ ChallengeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFragment$challengeEntryViewFactory$2(ChallengeFragment challengeFragment) {
        super(0);
        this.this$0 = challengeFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final ChallengeEntryViewFactory invoke() {
        androidx.fragment.app.h requireActivity = this.this$0.requireActivity();
        s.f(requireActivity, "requireActivity()");
        return new ChallengeEntryViewFactory(requireActivity);
    }
}