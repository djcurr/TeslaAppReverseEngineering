package com.stripe.android.ui.core.forms;

import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.AuBankAccountNumberSpec;
import com.stripe.android.ui.core.elements.AuBecsDebitMandateTextSpec;
import com.stripe.android.ui.core.elements.BsbSpec;
import com.stripe.android.ui.core.elements.Capitalization;
import com.stripe.android.ui.core.elements.EmailSpec;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.KeyboardType;
import com.stripe.android.ui.core.elements.LayoutSpec;
import com.stripe.android.ui.core.elements.SimpleTextSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class AuBecsDebitSpecKt {
    private static final LayoutSpec AuBecsDebitForm = LayoutSpec.Companion.create(new EmailSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null), new BsbSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null), new AuBankAccountNumberSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null), new SimpleTextSpec(IdentifierSpec.Companion.getName(), R.string.au_becs_account_name, Capitalization.Words, KeyboardType.Text, false, 16, (DefaultConstructorMarker) null), new AuBecsDebitMandateTextSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null));

    public static final LayoutSpec getAuBecsDebitForm() {
        return AuBecsDebitForm;
    }
}