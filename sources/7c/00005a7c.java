package com.stripe.android.ui.core.elements;

import c30.b;
import ch.qos.logback.core.CoreConstants;
import e30.f;
import f30.d;
import g30.f1;
import g30.q1;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;

@a
/* loaded from: classes6.dex */
public final class EmailSpec extends FormItemSpec {
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

        public final b<EmailSpec> serializer() {
            return EmailSpec$$serializer.INSTANCE;
        }
    }

    public EmailSpec() {
        this((IdentifierSpec) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EmailSpec(int i11, IdentifierSpec identifierSpec, q1 q1Var) {
        super(null);
        if ((i11 & 0) != 0) {
            f1.a(i11, 0, EmailSpec$$serializer.INSTANCE.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.apiPath = IdentifierSpec.Companion.getEmail();
        } else {
            this.apiPath = identifierSpec;
        }
    }

    public static /* synthetic */ EmailSpec copy$default(EmailSpec emailSpec, IdentifierSpec identifierSpec, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = emailSpec.getApiPath();
        }
        return emailSpec.copy(identifierSpec);
    }

    public static final void write$Self(EmailSpec self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        boolean z11 = true;
        if (!output.k(serialDesc, 0) && s.c(self.getApiPath(), IdentifierSpec.Companion.getEmail())) {
            z11 = false;
        }
        if (z11) {
            output.q(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        }
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final EmailSpec copy(IdentifierSpec apiPath) {
        s.g(apiPath, "apiPath");
        return new EmailSpec(apiPath);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmailSpec) && s.c(getApiPath(), ((EmailSpec) obj).getApiPath());
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public int hashCode() {
        return getApiPath().hashCode();
    }

    public String toString() {
        return "EmailSpec(apiPath=" + getApiPath() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final SectionElement transform(Map<IdentifierSpec, String> initialValues) {
        s.g(initialValues, "initialValues");
        return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new EmailElement(getApiPath(), initialValues.get(IdentifierSpec.Companion.getEmail()), null, 4, null), null, 2, null);
    }

    public /* synthetic */ EmailSpec(IdentifierSpec identifierSpec, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? IdentifierSpec.Companion.getEmail() : identifierSpec);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSpec(IdentifierSpec apiPath) {
        super(null);
        s.g(apiPath, "apiPath");
        this.apiPath = apiPath;
    }
}