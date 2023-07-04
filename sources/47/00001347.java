package com.adyen.threeds2;

import android.app.Activity;
import com.adyen.threeds2.parameters.ChallengeParameters;

/* loaded from: classes.dex */
public interface Transaction {
    void close();

    void doChallenge(Activity activity, ChallengeParameters challengeParameters, ChallengeStatusReceiver challengeStatusReceiver, int i11);

    AuthenticationRequestParameters getAuthenticationRequestParameters();

    ProgressDialog getProgressView(Activity activity);
}