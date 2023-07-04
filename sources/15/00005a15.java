package com.stripe.android.ui.core.elements;

import android.content.Context;
import c30.b;
import ch.qos.logback.core.CoreConstants;
import e30.f;
import f30.d;
import g30.f1;
import g30.q1;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;

@a
/* loaded from: classes6.dex */
public final class CardDetailsSectionSpec extends FormItemSpec {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final IdentifierSpec apiPath;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<CardDetailsSectionSpec> serializer() {
            return CardDetailsSectionSpec$$serializer.INSTANCE;
        }
    }

    public CardDetailsSectionSpec() {
        this((IdentifierSpec) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardDetailsSectionSpec(int i11, IdentifierSpec identifierSpec, q1 q1Var) {
        super(null);
        if ((i11 & 0) != 0) {
            f1.a(i11, 0, CardDetailsSectionSpec$$serializer.INSTANCE.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.apiPath = IdentifierSpec.Companion.Generic("card_details");
        } else {
            this.apiPath = identifierSpec;
        }
    }

    public static /* synthetic */ CardDetailsSectionSpec copy$default(CardDetailsSectionSpec cardDetailsSectionSpec, IdentifierSpec identifierSpec, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = cardDetailsSectionSpec.getApiPath();
        }
        return cardDetailsSectionSpec.copy(identifierSpec);
    }

    public static final void write$Self(CardDetailsSectionSpec self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        boolean z11 = true;
        if (!output.k(serialDesc, 0) && s.c(self.getApiPath(), IdentifierSpec.Companion.Generic("card_details"))) {
            z11 = false;
        }
        if (z11) {
            output.q(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        }
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final CardDetailsSectionSpec copy(IdentifierSpec apiPath) {
        s.g(apiPath, "apiPath");
        return new CardDetailsSectionSpec(apiPath);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardDetailsSectionSpec) && s.c(getApiPath(), ((CardDetailsSectionSpec) obj).getApiPath());
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public int hashCode() {
        return getApiPath().hashCode();
    }

    public String toString() {
        return "CardDetailsSectionSpec(apiPath=" + getApiPath() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final FormElement transform(Context context, Map<IdentifierSpec, String> initialValues, Set<IdentifierSpec> viewOnlyFields) {
        s.g(context, "context");
        s.g(initialValues, "initialValues");
        s.g(viewOnlyFields, "viewOnlyFields");
        return new CardDetailsSectionElement(context, initialValues, viewOnlyFields, getApiPath(), null, 16, null);
    }

    public /* synthetic */ CardDetailsSectionSpec(IdentifierSpec identifierSpec, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? IdentifierSpec.Companion.Generic("card_details") : identifierSpec);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsSectionSpec(IdentifierSpec apiPath) {
        super(null);
        s.g(apiPath, "apiPath");
        this.apiPath = apiPath;
    }
}