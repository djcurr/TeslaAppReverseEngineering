package com.stripe.android.ui.core.forms;

import com.stripe.android.ui.core.elements.DropdownItemSpec;
import com.stripe.android.ui.core.elements.DropdownSpec;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.LayoutSpec;
import com.stripe.android.ui.core.elements.NameSpec;
import com.stripe.android.ui.core.elements.TranslationId;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.w;

/* loaded from: classes6.dex */
public final class IdealSpecKt {
    private static final LayoutSpec IdealForm;

    static {
        List l11;
        LayoutSpec.Companion companion = LayoutSpec.Companion;
        IdentifierSpec Generic = IdentifierSpec.Companion.Generic("ideal[bank]");
        TranslationId translationId = TranslationId.IdealBank;
        l11 = w.l(new DropdownItemSpec("abn_amro", "ABN Amro"), new DropdownItemSpec("asn_bank", "ASN Bank"), new DropdownItemSpec("bunq", "bunq B.V.\u200e"), new DropdownItemSpec("handelsbanken", "Handelsbanken"), new DropdownItemSpec("ing", "ING Bank"), new DropdownItemSpec("knab", "Knab"), new DropdownItemSpec("rabobank", "Rabobank"), new DropdownItemSpec("regiobank", "RegioBank"), new DropdownItemSpec("revolut", "Revolut"), new DropdownItemSpec("sns_bank", "SNS Bank"), new DropdownItemSpec("triodos_bank", "Triodos Bank"), new DropdownItemSpec("van_lanschot", "Van Lanschot"), new DropdownItemSpec(null, "Other"));
        IdealForm = companion.create(new NameSpec((IdentifierSpec) null, (TranslationId) null, 3, (DefaultConstructorMarker) null), new DropdownSpec(Generic, translationId, l11));
    }

    public static final LayoutSpec getIdealForm() {
        return IdealForm;
    }
}