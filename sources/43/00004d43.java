package com.stripe.android.financialconnections;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public abstract class FinancialConnectionsSheetViewEffect {

    /* loaded from: classes2.dex */
    public static final class FinishWithResult extends FinancialConnectionsSheetViewEffect {
        private final FinancialConnectionsSheetActivityResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinishWithResult(FinancialConnectionsSheetActivityResult result) {
            super(null);
            s.g(result, "result");
            this.result = result;
        }

        public static /* synthetic */ FinishWithResult copy$default(FinishWithResult finishWithResult, FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                financialConnectionsSheetActivityResult = finishWithResult.result;
            }
            return finishWithResult.copy(financialConnectionsSheetActivityResult);
        }

        public final FinancialConnectionsSheetActivityResult component1() {
            return this.result;
        }

        public final FinishWithResult copy(FinancialConnectionsSheetActivityResult result) {
            s.g(result, "result");
            return new FinishWithResult(result);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FinishWithResult) && s.c(this.result, ((FinishWithResult) obj).result);
        }

        public final FinancialConnectionsSheetActivityResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "FinishWithResult(result=" + this.result + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes2.dex */
    public static final class OpenAuthFlowWithUrl extends FinancialConnectionsSheetViewEffect {
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenAuthFlowWithUrl(String url) {
            super(null);
            s.g(url, "url");
            this.url = url;
        }

        public static /* synthetic */ OpenAuthFlowWithUrl copy$default(OpenAuthFlowWithUrl openAuthFlowWithUrl, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = openAuthFlowWithUrl.url;
            }
            return openAuthFlowWithUrl.copy(str);
        }

        public final String component1() {
            return this.url;
        }

        public final OpenAuthFlowWithUrl copy(String url) {
            s.g(url, "url");
            return new OpenAuthFlowWithUrl(url);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenAuthFlowWithUrl) && s.c(this.url, ((OpenAuthFlowWithUrl) obj).url);
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "OpenAuthFlowWithUrl(url=" + this.url + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    private FinancialConnectionsSheetViewEffect() {
    }

    public /* synthetic */ FinancialConnectionsSheetViewEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}