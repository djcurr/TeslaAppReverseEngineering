package com.stripe.android.paymentsheet.flowcontroller;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.ClientSecret;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import zz.d;

/* loaded from: classes6.dex */
public interface FlowControllerInitializer {

    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object init$default(FlowControllerInitializer flowControllerInitializer, ClientSecret clientSecret, PaymentSheet.Configuration configuration, d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    configuration = null;
                }
                return flowControllerInitializer.init(clientSecret, configuration, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class InitResult {
        public static final int $stable = 0;

        /* loaded from: classes6.dex */
        public static final class Failure extends InitResult {
            public static final int $stable = 8;
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(Throwable throwable) {
                super(null);
                s.g(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Success extends InitResult {
            public static final int $stable = 8;
            private final InitData initData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(InitData initData) {
                super(null);
                s.g(initData, "initData");
                this.initData = initData;
            }

            public static /* synthetic */ Success copy$default(Success success, InitData initData, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    initData = success.initData;
                }
                return success.copy(initData);
            }

            public final InitData component1() {
                return this.initData;
            }

            public final Success copy(InitData initData) {
                s.g(initData, "initData");
                return new Success(initData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && s.c(this.initData, ((Success) obj).initData);
            }

            public final InitData getInitData() {
                return this.initData;
            }

            public int hashCode() {
                return this.initData.hashCode();
            }

            public String toString() {
                return "Success(initData=" + this.initData + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private InitResult() {
        }

        public /* synthetic */ InitResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    Object init(ClientSecret clientSecret, PaymentSheet.Configuration configuration, d<? super InitResult> dVar);
}