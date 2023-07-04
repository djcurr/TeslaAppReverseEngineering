package com.stripe.android.ui.core.forms;

import com.stripe.android.ui.core.elements.AffirmTextSpec;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.LayoutSpec;

/* loaded from: classes6.dex */
public final class AffirmSpecKt {
    private static final LayoutSpec AffirmForm;
    private static final AffirmTextSpec affirmHeader;

    static {
        AffirmTextSpec affirmTextSpec = new AffirmTextSpec(IdentifierSpec.Companion.Generic("affirm_header"));
        affirmHeader = affirmTextSpec;
        AffirmForm = LayoutSpec.Companion.create(affirmTextSpec);
    }

    public static final LayoutSpec getAffirmForm() {
        return AffirmForm;
    }

    public static final AffirmTextSpec getAffirmHeader() {
        return affirmHeader;
    }
}