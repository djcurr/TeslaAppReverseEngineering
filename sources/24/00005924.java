package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ChallengeFragment$challengeZoneWebView$2 extends u implements h00.a<ChallengeZoneWebView> {
    final /* synthetic */ ChallengeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFragment$challengeZoneWebView$2(ChallengeFragment challengeFragment) {
        super(0);
        this.this$0 = challengeFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final ChallengeZoneWebView invoke() {
        ChallengeResponseData challengeResponseData;
        ChallengeEntryViewFactory challengeEntryViewFactory;
        ChallengeResponseData challengeResponseData2;
        challengeResponseData = this.this$0.cresData;
        ChallengeResponseData challengeResponseData3 = null;
        if (challengeResponseData == null) {
            s.x("cresData");
            challengeResponseData = null;
        }
        if (challengeResponseData.getUiType() == UiType.Html) {
            challengeEntryViewFactory = this.this$0.getChallengeEntryViewFactory();
            challengeResponseData2 = this.this$0.cresData;
            if (challengeResponseData2 == null) {
                s.x("cresData");
            } else {
                challengeResponseData3 = challengeResponseData2;
            }
            return challengeEntryViewFactory.createChallengeEntryWebView(challengeResponseData3);
        }
        return null;
    }
}