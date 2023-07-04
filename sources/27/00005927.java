package com.stripe.android.stripe3ds2.views;

import androidx.fragment.app.Fragment;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.transactions.UiType;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ChallengeFragmentFactory extends androidx.fragment.app.l {
    private final ChallengeActionHandler challengeActionHandler;
    private final ErrorReporter errorReporter;
    private final ErrorRequestExecutor errorRequestExecutor;
    private final UiType initialUiType;
    private final IntentData intentData;
    private final TransactionTimer transactionTimer;
    private final StripeUiCustomization uiCustomization;
    private final zz.g workContext;

    public ChallengeFragmentFactory(StripeUiCustomization uiCustomization, TransactionTimer transactionTimer, ErrorRequestExecutor errorRequestExecutor, ErrorReporter errorReporter, ChallengeActionHandler challengeActionHandler, UiType uiType, IntentData intentData, zz.g workContext) {
        s.g(uiCustomization, "uiCustomization");
        s.g(transactionTimer, "transactionTimer");
        s.g(errorRequestExecutor, "errorRequestExecutor");
        s.g(errorReporter, "errorReporter");
        s.g(challengeActionHandler, "challengeActionHandler");
        s.g(intentData, "intentData");
        s.g(workContext, "workContext");
        this.uiCustomization = uiCustomization;
        this.transactionTimer = transactionTimer;
        this.errorRequestExecutor = errorRequestExecutor;
        this.errorReporter = errorReporter;
        this.challengeActionHandler = challengeActionHandler;
        this.initialUiType = uiType;
        this.intentData = intentData;
        this.workContext = workContext;
    }

    @Override // androidx.fragment.app.l
    public Fragment instantiate(ClassLoader classLoader, String className) {
        s.g(classLoader, "classLoader");
        s.g(className, "className");
        if (s.c(className, ChallengeFragment.class.getName())) {
            return new ChallengeFragment(this.uiCustomization, this.transactionTimer, this.errorRequestExecutor, this.errorReporter, this.challengeActionHandler, this.initialUiType, this.intentData, this.workContext);
        }
        Fragment instantiate = super.instantiate(classLoader, className);
        s.f(instantiate, "{\n                super.… className)\n            }");
        return instantiate;
    }
}