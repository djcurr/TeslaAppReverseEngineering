package com.stripe.android.financialconnections.analytics;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.networking.AnalyticsEvent;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.s0;

/* loaded from: classes2.dex */
public final class FinancialConnectionsAnalyticsEvent implements AnalyticsEvent {
    private final Map<String, String> additionalParams;
    private final Code eventCode;
    private final String eventName;

    /* loaded from: classes2.dex */
    public enum Code {
        SheetPresented("sheet.presented"),
        SheetClosed("sheet.closed"),
        SheetFailed("sheet.failed");
        
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String PREFIX = "stripe_android.connections";
        private final String code;

        /* loaded from: classes2.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        Code(String str) {
            this.code = str;
        }

        public final String getCode$financial_connections_release() {
            return this.code;
        }

        @Override // java.lang.Enum
        public String toString() {
            return s.p("stripe_android.connections.", this.code);
        }
    }

    public FinancialConnectionsAnalyticsEvent(Code eventCode, Map<String, String> additionalParams) {
        s.g(eventCode, "eventCode");
        s.g(additionalParams, "additionalParams");
        this.eventCode = eventCode;
        this.additionalParams = additionalParams;
        this.eventName = eventCode.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FinancialConnectionsAnalyticsEvent copy$default(FinancialConnectionsAnalyticsEvent financialConnectionsAnalyticsEvent, Code code, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            code = financialConnectionsAnalyticsEvent.eventCode;
        }
        if ((i11 & 2) != 0) {
            map = financialConnectionsAnalyticsEvent.additionalParams;
        }
        return financialConnectionsAnalyticsEvent.copy(code, map);
    }

    public final Code component1() {
        return this.eventCode;
    }

    public final Map<String, String> component2() {
        return this.additionalParams;
    }

    public final FinancialConnectionsAnalyticsEvent copy(Code eventCode, Map<String, String> additionalParams) {
        s.g(eventCode, "eventCode");
        s.g(additionalParams, "additionalParams");
        return new FinancialConnectionsAnalyticsEvent(eventCode, additionalParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FinancialConnectionsAnalyticsEvent) {
            FinancialConnectionsAnalyticsEvent financialConnectionsAnalyticsEvent = (FinancialConnectionsAnalyticsEvent) obj;
            return this.eventCode == financialConnectionsAnalyticsEvent.eventCode && s.c(this.additionalParams, financialConnectionsAnalyticsEvent.additionalParams);
        }
        return false;
    }

    public final Map<String, String> getAdditionalParams() {
        return this.additionalParams;
    }

    public final Code getEventCode() {
        return this.eventCode;
    }

    @Override // com.stripe.android.core.networking.AnalyticsEvent
    public String getEventName() {
        return this.eventName;
    }

    public int hashCode() {
        return (this.eventCode.hashCode() * 31) + this.additionalParams.hashCode();
    }

    public String toString() {
        return "FinancialConnectionsAnalyticsEvent(eventCode=" + this.eventCode + ", additionalParams=" + this.additionalParams + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ FinancialConnectionsAnalyticsEvent(Code code, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(code, (i11 & 2) != 0 ? s0.i() : map);
    }
}