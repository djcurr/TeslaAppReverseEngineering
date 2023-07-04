package com.stripe.android.ui.core.forms;

import com.stripe.android.ui.core.elements.EmailSpec;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.KlarnaCountrySpec;
import com.stripe.android.ui.core.elements.KlarnaHelper;
import com.stripe.android.ui.core.elements.LayoutSpec;
import com.stripe.android.ui.core.elements.StaticTextSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class KlarnaSpecKt {
    private static final LayoutSpec KlarnaForm;
    private static final StaticTextSpec klarnaHeader;

    static {
        StaticTextSpec staticTextSpec = new StaticTextSpec(IdentifierSpec.Companion.Generic("klarna_header"), KlarnaHelper.getKlarnaHeader$default(KlarnaHelper.INSTANCE, null, 1, null));
        klarnaHeader = staticTextSpec;
        KlarnaForm = LayoutSpec.Companion.create(staticTextSpec, new EmailSpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null), new KlarnaCountrySpec((IdentifierSpec) null, 1, (DefaultConstructorMarker) null));
    }

    public static final LayoutSpec getKlarnaForm() {
        return KlarnaForm;
    }

    public static final StaticTextSpec getKlarnaHeader() {
        return klarnaHeader;
    }
}