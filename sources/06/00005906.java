package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.observability.Stripe3ds2ErrorReporterConfig;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class ChallengeActivity$errorReporter$2 extends u implements h00.a<DefaultErrorReporter> {
    final /* synthetic */ ChallengeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$errorReporter$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final DefaultErrorReporter invoke() {
        ChallengeViewArgs viewArgs;
        Context applicationContext = this.this$0.getApplicationContext();
        s.f(applicationContext, "applicationContext");
        viewArgs = this.this$0.getViewArgs();
        return new DefaultErrorReporter(applicationContext, new Stripe3ds2ErrorReporterConfig(viewArgs.getSdkTransactionId$3ds2sdk_release()), null, null, null, null, null, 0, 252, null);
    }
}