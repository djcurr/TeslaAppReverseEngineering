package com.stripe.android.stripe3ds2.transaction;

import android.content.Context;
import android.content.Intent;
import com.stripe.android.stripe3ds2.views.ChallengeActivity;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import f.a;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ChallengeContract extends a<ChallengeViewArgs, ChallengeResult> {
    @Override // f.a
    public Intent createIntent(Context context, ChallengeViewArgs input) {
        s.g(context, "context");
        s.g(input, "input");
        Intent putExtras = new Intent(context, ChallengeActivity.class).putExtras(input.toBundle());
        s.f(putExtras, "Intent(context, Challeng…tExtras(input.toBundle())");
        return putExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // f.a
    public ChallengeResult parseResult(int i11, Intent intent) {
        return ChallengeResult.Companion.fromIntent(intent);
    }
}