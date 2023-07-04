package com.stripe.android.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public enum StripeFilePurpose {
    BusinessIcon("business_icon"),
    BusinessLogo("business_logo"),
    CustomerSignature("customer_signature"),
    DisputeEvidence("dispute_evidence"),
    IdentityDocument("identity_document"),
    PciDocument("pci_document"),
    TaxDocumentUserUpload("tax_document_user_upload"),
    IdentityPrivate("identity_private");
    
    public static final Companion Companion = new Companion(null);
    private final String code;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StripeFilePurpose fromCode(String str) {
            StripeFilePurpose[] values;
            for (StripeFilePurpose stripeFilePurpose : StripeFilePurpose.values()) {
                if (s.c(stripeFilePurpose.getCode(), str)) {
                    return stripeFilePurpose;
                }
            }
            return null;
        }
    }

    StripeFilePurpose(String str) {
        this.code = str;
    }

    public final String getCode() {
        return this.code;
    }
}