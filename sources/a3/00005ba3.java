package com.stripe.android.ui.core.forms;

import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.LayoutSpec;
import com.stripe.android.ui.core.elements.NameSpec;
import com.stripe.android.ui.core.elements.TranslationId;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class BancontactSpecKt {
    private static final LayoutSpec BancontactForm = LayoutSpec.Companion.create(new NameSpec((IdentifierSpec) null, (TranslationId) null, 3, (DefaultConstructorMarker) null));

    public static final LayoutSpec getBancontactForm() {
        return BancontactForm;
    }
}