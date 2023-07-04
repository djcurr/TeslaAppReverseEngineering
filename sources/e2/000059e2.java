package com.stripe.android.ui.core.elements;

import c30.b;
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
public final class AuBankAccountNumberSpec extends FormItemSpec {
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

        public final b<AuBankAccountNumberSpec> serializer() {
            return AuBankAccountNumberSpec$$serializer.INSTANCE;
        }
    }

    public AuBankAccountNumberSpec() {
        this((IdentifierSpec) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuBankAccountNumberSpec(int i11, IdentifierSpec identifierSpec, q1 q1Var) {
        super(null);
        if ((i11 & 0) != 0) {
            f1.a(i11, 0, AuBankAccountNumberSpec$$serializer.INSTANCE.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.apiPath = IdentifierSpec.Companion.Generic("au_becs_debit[account_number]");
        } else {
            this.apiPath = identifierSpec;
        }
    }

    public static final void write$Self(AuBankAccountNumberSpec self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        boolean z11 = true;
        if (!output.k(serialDesc, 0) && s.c(self.getApiPath(), IdentifierSpec.Companion.Generic("au_becs_debit[account_number]"))) {
            z11 = false;
        }
        if (z11) {
            output.q(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        }
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final SectionElement transform(Map<IdentifierSpec, String> initialValues) {
        s.g(initialValues, "initialValues");
        return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new SimpleTextElement(getApiPath(), new SimpleTextFieldController(new AuBankAccountNumberConfig(), false, initialValues.get(getApiPath()), 2, null)), null, 2, null);
    }

    public /* synthetic */ AuBankAccountNumberSpec(IdentifierSpec identifierSpec, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? IdentifierSpec.Companion.Generic("au_becs_debit[account_number]") : identifierSpec);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuBankAccountNumberSpec(IdentifierSpec apiPath) {
        super(null);
        s.g(apiPath, "apiPath");
        this.apiPath = apiPath;
    }
}