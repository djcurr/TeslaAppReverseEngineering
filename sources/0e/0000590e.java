package com.stripe.android.stripe3ds2.views;

import android.os.Bundle;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class ChallengeActivity$viewArgs$2 extends u implements h00.a<ChallengeViewArgs> {
    final /* synthetic */ ChallengeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$viewArgs$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final ChallengeViewArgs invoke() {
        ChallengeViewArgs.Companion companion = ChallengeViewArgs.Companion;
        Bundle extras = this.this$0.getIntent().getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        s.f(extras, "intent.extras ?: Bundle.EMPTY");
        return companion.create(extras);
    }
}