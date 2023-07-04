package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ChallengeFragment$uiTypeCode$2 extends u implements h00.a<String> {
    final /* synthetic */ ChallengeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFragment$uiTypeCode$2(ChallengeFragment challengeFragment) {
        super(0);
        this.this$0 = challengeFragment;
    }

    @Override // h00.a
    public final String invoke() {
        ChallengeResponseData challengeResponseData;
        challengeResponseData = this.this$0.cresData;
        if (challengeResponseData == null) {
            s.x("cresData");
            challengeResponseData = null;
        }
        UiType uiType = challengeResponseData.getUiType();
        String code = uiType != null ? uiType.getCode() : null;
        return code == null ? "" : code;
    }
}