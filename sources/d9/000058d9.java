package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.model.Stripe3ds2AuthResult;
import ezvcard.property.Gender;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public enum TransactionStatus {
    VerificationSuccessful("Y"),
    VerificationDenied(Gender.NONE),
    VerificationNotPerformed(Gender.UNKNOWN),
    VerificationAttempted("A"),
    ChallengeAdditionalAuth(Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE),
    ChallengeDecoupledAuth("D"),
    VerificationRejected("R"),
    InformationOnly("I");
    
    public static final Companion Companion = new Companion(null);
    private final String code;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TransactionStatus fromCode(String str) {
            if (str == null) {
                return null;
            }
            TransactionStatus[] values = TransactionStatus.values();
            int i11 = 0;
            int length = values.length;
            while (i11 < length) {
                TransactionStatus transactionStatus = values[i11];
                i11++;
                if (s.c(transactionStatus.getCode(), str)) {
                    return transactionStatus;
                }
            }
            return null;
        }
    }

    TransactionStatus(String str) {
        this.code = str;
    }

    public final String getCode() {
        return this.code;
    }
}