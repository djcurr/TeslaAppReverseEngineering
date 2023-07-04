package com.stripe.android.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public enum CardFunding {
    Credit("credit"),
    Debit("debit"),
    Prepaid("prepaid"),
    Unknown("unknown");
    
    public static final Companion Companion = new Companion(null);
    private final String code;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CardFunding fromCode(String str) {
            CardFunding[] values;
            for (CardFunding cardFunding : CardFunding.values()) {
                if (s.c(cardFunding.getCode(), str)) {
                    return cardFunding;
                }
            }
            return null;
        }
    }

    CardFunding(String str) {
        this.code = str;
    }

    public final String getCode() {
        return this.code;
    }
}