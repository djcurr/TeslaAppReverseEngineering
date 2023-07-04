package com.stripe.android.paymentsheet.model;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import h00.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
public abstract class PaymentSheetViewState {
    private final BaseSheetViewModel.UserErrorMessage errorMessage;

    /* loaded from: classes6.dex */
    public static final class FinishProcessing extends PaymentSheetViewState {
        public static final int $stable = 0;
        private final a<b0> onComplete;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinishProcessing(a<b0> onComplete) {
            super(null, 1, null);
            s.g(onComplete, "onComplete");
            this.onComplete = onComplete;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinishProcessing copy$default(FinishProcessing finishProcessing, a aVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aVar = finishProcessing.onComplete;
            }
            return finishProcessing.copy(aVar);
        }

        public final a<b0> component1() {
            return this.onComplete;
        }

        public final FinishProcessing copy(a<b0> onComplete) {
            s.g(onComplete, "onComplete");
            return new FinishProcessing(onComplete);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FinishProcessing) && s.c(this.onComplete, ((FinishProcessing) obj).onComplete);
        }

        public final a<b0> getOnComplete() {
            return this.onComplete;
        }

        public int hashCode() {
            return this.onComplete.hashCode();
        }

        public String toString() {
            return "FinishProcessing(onComplete=" + this.onComplete + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Reset extends PaymentSheetViewState {
        public static final int $stable = 0;
        private final BaseSheetViewModel.UserErrorMessage message;

        public Reset() {
            this(null, 1, null);
        }

        public /* synthetic */ Reset(BaseSheetViewModel.UserErrorMessage userErrorMessage, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : userErrorMessage);
        }

        private final BaseSheetViewModel.UserErrorMessage component1() {
            return this.message;
        }

        public static /* synthetic */ Reset copy$default(Reset reset, BaseSheetViewModel.UserErrorMessage userErrorMessage, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                userErrorMessage = reset.message;
            }
            return reset.copy(userErrorMessage);
        }

        public final Reset copy(BaseSheetViewModel.UserErrorMessage userErrorMessage) {
            return new Reset(userErrorMessage);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Reset) && s.c(this.message, ((Reset) obj).message);
        }

        public int hashCode() {
            BaseSheetViewModel.UserErrorMessage userErrorMessage = this.message;
            if (userErrorMessage == null) {
                return 0;
            }
            return userErrorMessage.hashCode();
        }

        public String toString() {
            return "Reset(message=" + this.message + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public Reset(BaseSheetViewModel.UserErrorMessage userErrorMessage) {
            super(userErrorMessage, null);
            this.message = userErrorMessage;
        }
    }

    /* loaded from: classes6.dex */
    public static final class StartProcessing extends PaymentSheetViewState {
        public static final int $stable = 0;
        public static final StartProcessing INSTANCE = new StartProcessing();

        private StartProcessing() {
            super(null, null);
        }
    }

    private PaymentSheetViewState(BaseSheetViewModel.UserErrorMessage userErrorMessage) {
        this.errorMessage = userErrorMessage;
    }

    public /* synthetic */ PaymentSheetViewState(BaseSheetViewModel.UserErrorMessage userErrorMessage, DefaultConstructorMarker defaultConstructorMarker) {
        this(userErrorMessage);
    }

    public final BaseSheetViewModel.UserErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    public /* synthetic */ PaymentSheetViewState(BaseSheetViewModel.UserErrorMessage userErrorMessage, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : userErrorMessage, null);
    }
}