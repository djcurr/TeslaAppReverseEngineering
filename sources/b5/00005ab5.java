package com.stripe.android.ui.core.elements;

import c30.b;
import ch.qos.logback.core.CoreConstants;
import e30.f;
import f30.d;
import g30.f1;
import g30.q1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;

@a
/* loaded from: classes6.dex */
public final class MandateTextSpec extends FormItemSpec {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final IdentifierSpec apiPath;
    private final int stringResId;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<MandateTextSpec> serializer() {
            return MandateTextSpec$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MandateTextSpec(int i11, IdentifierSpec identifierSpec, int i12, q1 q1Var) {
        super(null);
        if (2 != (i11 & 2)) {
            f1.a(i11, 2, MandateTextSpec$$serializer.INSTANCE.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.apiPath = IdentifierSpec.Companion.Generic("mandate");
        } else {
            this.apiPath = identifierSpec;
        }
        this.stringResId = i12;
    }

    public static /* synthetic */ MandateTextSpec copy$default(MandateTextSpec mandateTextSpec, IdentifierSpec identifierSpec, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            identifierSpec = mandateTextSpec.getApiPath();
        }
        if ((i12 & 2) != 0) {
            i11 = mandateTextSpec.stringResId;
        }
        return mandateTextSpec.copy(identifierSpec, i11);
    }

    public static final void write$Self(MandateTextSpec self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        if (output.k(serialDesc, 0) || !s.c(self.getApiPath(), IdentifierSpec.Companion.Generic("mandate"))) {
            output.q(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        }
        output.n(serialDesc, 1, self.stringResId);
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final int component2() {
        return this.stringResId;
    }

    public final MandateTextSpec copy(IdentifierSpec apiPath, int i11) {
        s.g(apiPath, "apiPath");
        return new MandateTextSpec(apiPath, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MandateTextSpec) {
            MandateTextSpec mandateTextSpec = (MandateTextSpec) obj;
            return s.c(getApiPath(), mandateTextSpec.getApiPath()) && this.stringResId == mandateTextSpec.stringResId;
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
        return "MandateTextSpec(apiPath=" + getApiPath() + ", stringResId=" + this.stringResId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final FormElement transform(String merchantName) {
        s.g(merchantName, "merchantName");
        return new MandateTextElement(getApiPath(), this.stringResId, merchantName, null, 8, null);
    }

    public /* synthetic */ MandateTextSpec(IdentifierSpec identifierSpec, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? IdentifierSpec.Companion.Generic("mandate") : identifierSpec, i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MandateTextSpec(IdentifierSpec apiPath, int i11) {
        super(null);
        s.g(apiPath, "apiPath");
        this.apiPath = apiPath;
        this.stringResId = i11;
    }
}