package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class ChallengeZoneSelectView$userEntry$1 extends u implements h00.l<ChallengeResponseData.ChallengeSelectOption, CharSequence> {
    public static final ChallengeZoneSelectView$userEntry$1 INSTANCE = new ChallengeZoneSelectView$userEntry$1();

    ChallengeZoneSelectView$userEntry$1() {
        super(1);
    }

    @Override // h00.l
    public final CharSequence invoke(ChallengeResponseData.ChallengeSelectOption it2) {
        s.g(it2, "it");
        return it2.getName();
    }
}