package com.stripe.android.ui.core.elements;

import c30.b;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.ui.core.R;
import e30.f;
import f30.d;
import g30.f1;
import g30.q1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;

@a
/* loaded from: classes6.dex */
public final class SepaMandateTextSpec extends FormItemSpec {
    public static final Companion Companion = new Companion(null);
    private final IdentifierSpec apiPath;
    private final MandateTextSpec mandateTextSpec;
    private final int stringResId;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<SepaMandateTextSpec> serializer() {
            return SepaMandateTextSpec$$serializer.INSTANCE;
        }
    }

    public SepaMandateTextSpec() {
        this((IdentifierSpec) null, 0, 3, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SepaMandateTextSpec(int i11, IdentifierSpec identifierSpec, int i12, q1 q1Var) {
        super(null);
        if ((i11 & 0) != 0) {
            f1.a(i11, 0, SepaMandateTextSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.apiPath = (i11 & 1) == 0 ? IdentifierSpec.Companion.Generic("sepa_mandate") : identifierSpec;
        if ((i11 & 2) == 0) {
            this.stringResId = R.string.sepa_mandate;
        } else {
            this.stringResId = i12;
        }
        this.mandateTextSpec = new MandateTextSpec(getApiPath(), this.stringResId);
    }

    public static /* synthetic */ SepaMandateTextSpec copy$default(SepaMandateTextSpec sepaMandateTextSpec, IdentifierSpec identifierSpec, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            identifierSpec = sepaMandateTextSpec.getApiPath();
        }
        if ((i12 & 2) != 0) {
            i11 = sepaMandateTextSpec.stringResId;
        }
        return sepaMandateTextSpec.copy(identifierSpec, i11);
    }

    private static /* synthetic */ void getMandateTextSpec$annotations() {
    }

    public static final void write$Self(SepaMandateTextSpec self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        if (output.k(serialDesc, 0) || !s.c(self.getApiPath(), IdentifierSpec.Companion.Generic("sepa_mandate"))) {
            output.q(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        }
        if (output.k(serialDesc, 1) || self.stringResId != R.string.sepa_mandate) {
            output.n(serialDesc, 1, self.stringResId);
        }
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final int component2() {
        return this.stringResId;
    }

    public final SepaMandateTextSpec copy(IdentifierSpec apiPath, int i11) {
        s.g(apiPath, "apiPath");
        return new SepaMandateTextSpec(apiPath, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SepaMandateTextSpec) {
            SepaMandateTextSpec sepaMandateTextSpec = (SepaMandateTextSpec) obj;
            return s.c(getApiPath(), sepaMandateTextSpec.getApiPath()) && this.stringResId == sepaMandateTextSpec.stringResId;
        }
        return false;
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final int getStringResId() {
        return this.stringResId;
    }

    public int hashCode() {
        return (getApiPath().hashCode() * 31) + Integer.hashCode(this.stringResId);
    }

    public String toString() {
        return "SepaMandateTextSpec(apiPath=" + getApiPath() + ", stringResId=" + this.stringResId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final FormElement transform(String merchantName) {
        s.g(merchantName, "merchantName");
        return this.mandateTextSpec.transform(merchantName);
    }

    public /* synthetic */ SepaMandateTextSpec(IdentifierSpec identifierSpec, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? IdentifierSpec.Companion.Generic("sepa_mandate") : identifierSpec, (i12 & 2) != 0 ? R.string.sepa_mandate : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SepaMandateTextSpec(IdentifierSpec apiPath, int i11) {
        super(null);
        s.g(apiPath, "apiPath");
        this.apiPath = apiPath;
        this.stringResId = i11;
        this.mandateTextSpec = new MandateTextSpec(getApiPath(), i11);
    }
}