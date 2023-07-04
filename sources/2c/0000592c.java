package com.stripe.android.stripe3ds2.views;

import androidx.fragment.app.Fragment;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ChallengeProgressFragmentFactory extends androidx.fragment.app.l {
    private final Integer accentColor;
    private final String directoryServerName;
    private final SdkTransactionId sdkTransactionId;

    public ChallengeProgressFragmentFactory(String directoryServerName, SdkTransactionId sdkTransactionId, Integer num) {
        s.g(directoryServerName, "directoryServerName");
        s.g(sdkTransactionId, "sdkTransactionId");
        this.directoryServerName = directoryServerName;
        this.sdkTransactionId = sdkTransactionId;
        this.accentColor = num;
    }

    @Override // androidx.fragment.app.l
    public Fragment instantiate(ClassLoader classLoader, String className) {
        s.g(classLoader, "classLoader");
        s.g(className, "className");
        if (s.c(className, ChallengeProgressFragment.class.getName())) {
            return new ChallengeProgressFragment(this.directoryServerName, this.sdkTransactionId, this.accentColor);
        }
        Fragment instantiate = super.instantiate(classLoader, className);
        s.f(instantiate, "{\n                super.… className)\n            }");
        return instantiate;
    }
}