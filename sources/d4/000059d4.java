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
public final class AffirmTextSpec extends FormItemSpec {
    public static final Companion Companion = new Companion(null);
    private final IdentifierSpec apiPath;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<AffirmTextSpec> serializer() {
            return AffirmTextSpec$$serializer.INSTANCE;
        }
    }

    public AffirmTextSpec() {
        this((IdentifierSpec) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AffirmTextSpec(int i11, IdentifierSpec identifierSpec, q1 q1Var) {
        super(null);
        if ((i11 & 0) != 0) {
            f1.a(i11, 0, AffirmTextSpec$$serializer.INSTANCE.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.apiPath = IdentifierSpec.Companion.Generic("affirm_header");
        } else {
            this.apiPath = identifierSpec;
        }
    }

    public static /* synthetic */ AffirmTextSpec copy$default(AffirmTextSpec affirmTextSpec, IdentifierSpec identifierSpec, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = affirmTextSpec.getApiPath();
        }
        return affirmTextSpec.copy(identifierSpec);
    }

    public static final void write$Self(AffirmTextSpec self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        boolean z11 = true;
        if (!output.k(serialDesc, 0) && s.c(self.getApiPath(), IdentifierSpec.Companion.Generic("affirm_header"))) {
            z11 = false;
        }
        if (z11) {
            output.q(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        }
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final AffirmTextSpec copy(IdentifierSpec apiPath) {
        s.g(apiPath, "apiPath");
        return new AffirmTextSpec(apiPath);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AffirmTextSpec) && s.c(getApiPath(), ((AffirmTextSpec) obj).getApiPath());
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public int hashCode() {
        return getApiPath().hashCode();
    }

    public String toString() {
        return "AffirmTextSpec(apiPath=" + getApiPath() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final FormElement transform() {
        return new AffirmHeaderElement(getApiPath(), null, 2, null);
    }

    public /* synthetic */ AffirmTextSpec(IdentifierSpec identifierSpec, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? IdentifierSpec.Companion.Generic("affirm_header") : identifierSpec);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AffirmTextSpec(IdentifierSpec apiPath) {
        super(null);
        s.g(apiPath, "apiPath");
        this.apiPath = apiPath;
    }
}