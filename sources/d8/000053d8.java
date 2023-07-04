package com.stripe.android.payments.bankaccount.ui;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class CollectBankAccountViewEffect {

    /* loaded from: classes6.dex */
    public static final class FinishWithResult extends CollectBankAccountViewEffect {
        public static final int $stable = 0;
        private final CollectBankAccountResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinishWithResult(CollectBankAccountResult result) {
            super(null);
            s.g(result, "result");
            this.result = result;
        }

        public static /* synthetic */ FinishWithResult copy$default(FinishWithResult finishWithResult, CollectBankAccountResult collectBankAccountResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                collectBankAccountResult = finishWithResult.result;
            }
            return finishWithResult.copy(collectBankAccountResult);
        }

        public final CollectBankAccountResult component1() {
            return this.result;
        }

        public final FinishWithResult copy(CollectBankAccountResult result) {
            s.g(result, "result");
            return new FinishWithResult(result);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FinishWithResult) && s.c(this.result, ((FinishWithResult) obj).result);
        }

        public final CollectBankAccountResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "FinishWithResult(result=" + this.result + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes6.dex */
    public static final class OpenConnectionsFlow extends CollectBankAccountViewEffect {
        public static final int $stable = 0;
        private final String financialConnectionsSessionSecret;
        private final String publishableKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenConnectionsFlow(String publishableKey, String financialConnectionsSessionSecret) {
            super(null);
            s.g(publishableKey, "publishableKey");
            s.g(financialConnectionsSessionSecret, "financialConnectionsSessionSecret");
            this.publishableKey = publishableKey;
            this.financialConnectionsSessionSecret = financialConnectionsSessionSecret;
        }

        public static /* synthetic */ OpenConnectionsFlow copy$default(OpenConnectionsFlow openConnectionsFlow, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = openConnectionsFlow.publishableKey;
            }
            if ((i11 & 2) != 0) {
                str2 = openConnectionsFlow.financialConnectionsSessionSecret;
            }
            return openConnectionsFlow.copy(str, str2);
        }

        public final String component1() {
            return this.publishableKey;
        }

        public final String component2() {
            return this.financialConnectionsSessionSecret;
        }

        public final OpenConnectionsFlow copy(String publishableKey, String financialConnectionsSessionSecret) {
            s.g(publishableKey, "publishableKey");
            s.g(financialConnectionsSessionSecret, "financialConnectionsSessionSecret");
            return new OpenConnectionsFlow(publishableKey, financialConnectionsSessionSecret);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OpenConnectionsFlow) {
                OpenConnectionsFlow openConnectionsFlow = (OpenConnectionsFlow) obj;
                return s.c(this.publishableKey, openConnectionsFlow.publishableKey) && s.c(this.financialConnectionsSessionSecret, openConnectionsFlow.financialConnectionsSessionSecret);
            }
            return false;
        }

        public final String getFinancialConnectionsSessionSecret() {
            return this.financialConnectionsSessionSecret;
        }

        public final String getPublishableKey() {
            return this.publishableKey;
        }

        public int hashCode() {
            return (this.publishableKey.hashCode() * 31) + this.financialConnectionsSessionSecret.hashCode();
        }

        public String toString() {
            return "OpenConnectionsFlow(publishableKey=" + this.publishableKey + ", financialConnectionsSessionSecret=" + this.financialConnectionsSessionSecret + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    private CollectBankAccountViewEffect() {
    }

    public /* synthetic */ CollectBankAccountViewEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}