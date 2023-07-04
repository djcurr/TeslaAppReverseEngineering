package com.stripe.android.payments.core.authentication.threeds2;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.transaction.InitChallengeArgs;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class NextStep {

    /* loaded from: classes6.dex */
    public static final class Complete extends NextStep {
        public static final int $stable = 8;
        private final PaymentFlowResult.Unvalidated result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Complete(PaymentFlowResult.Unvalidated result) {
            super(null);
            s.g(result, "result");
            this.result = result;
        }

        public static /* synthetic */ Complete copy$default(Complete complete, PaymentFlowResult.Unvalidated unvalidated, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                unvalidated = complete.result;
            }
            return complete.copy(unvalidated);
        }

        public final PaymentFlowResult.Unvalidated component1() {
            return this.result;
        }

        public final Complete copy(PaymentFlowResult.Unvalidated result) {
            s.g(result, "result");
            return new Complete(result);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Complete) && s.c(this.result, ((Complete) obj).result);
        }

        public final PaymentFlowResult.Unvalidated getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "Complete(result=" + this.result + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes6.dex */
    public static final class StartChallenge extends NextStep {
        public static final int $stable = 8;
        private final InitChallengeArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartChallenge(InitChallengeArgs args) {
            super(null);
            s.g(args, "args");
            this.args = args;
        }

        public static /* synthetic */ StartChallenge copy$default(StartChallenge startChallenge, InitChallengeArgs initChallengeArgs, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                initChallengeArgs = startChallenge.args;
            }
            return startChallenge.copy(initChallengeArgs);
        }

        public final InitChallengeArgs component1() {
            return this.args;
        }

        public final StartChallenge copy(InitChallengeArgs args) {
            s.g(args, "args");
            return new StartChallenge(args);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartChallenge) && s.c(this.args, ((StartChallenge) obj).args);
        }

        public final InitChallengeArgs getArgs() {
            return this.args;
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            return "StartChallenge(args=" + this.args + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes6.dex */
    public static final class StartFallback extends NextStep {
        public static final int $stable = 8;
        private final PaymentBrowserAuthContract.Args args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartFallback(PaymentBrowserAuthContract.Args args) {
            super(null);
            s.g(args, "args");
            this.args = args;
        }

        public static /* synthetic */ StartFallback copy$default(StartFallback startFallback, PaymentBrowserAuthContract.Args args, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                args = startFallback.args;
            }
            return startFallback.copy(args);
        }

        public final PaymentBrowserAuthContract.Args component1() {
            return this.args;
        }

        public final StartFallback copy(PaymentBrowserAuthContract.Args args) {
            s.g(args, "args");
            return new StartFallback(args);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartFallback) && s.c(this.args, ((StartFallback) obj).args);
        }

        public final PaymentBrowserAuthContract.Args getArgs() {
            return this.args;
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            return "StartFallback(args=" + this.args + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    private NextStep() {
    }

    public /* synthetic */ NextStep(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}