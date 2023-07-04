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
public final class KlarnaHeaderStaticTextSpec extends FormItemSpec {
    public static final Companion Companion = new Companion(null);
    private final IdentifierSpec apiPath;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<KlarnaHeaderStaticTextSpec> serializer() {
            return KlarnaHeaderStaticTextSpec$$serializer.INSTANCE;
        }
    }

    public KlarnaHeaderStaticTextSpec() {
        this((IdentifierSpec) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KlarnaHeaderStaticTextSpec(int i11, IdentifierSpec identifierSpec, q1 q1Var) {
        super(null);
        if ((i11 & 0) != 0) {
            f1.a(i11, 0, KlarnaHeaderStaticTextSpec$$serializer.INSTANCE.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.apiPath = IdentifierSpec.Companion.Generic("klarna_header_text");
        } else {
            this.apiPath = identifierSpec;
        }
    }

    public static /* synthetic */ KlarnaHeaderStaticTextSpec copy$default(KlarnaHeaderStaticTextSpec klarnaHeaderStaticTextSpec, IdentifierSpec identifierSpec, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = klarnaHeaderStaticTextSpec.getApiPath();
        }
        return klarnaHeaderStaticTextSpec.copy(identifierSpec);
    }

    public static final void write$Self(KlarnaHeaderStaticTextSpec self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        boolean z11 = true;
        if (!output.k(serialDesc, 0) && s.c(self.getApiPath(), IdentifierSpec.Companion.Generic("klarna_header_text"))) {
            z11 = false;
        }
        if (z11) {
            output.q(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        }
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final KlarnaHeaderStaticTextSpec copy(IdentifierSpec apiPath) {
        s.g(apiPath, "apiPath");
        return new KlarnaHeaderStaticTextSpec(apiPath);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KlarnaHeaderStaticTextSpec) && s.c(getApiPath(), ((KlarnaHeaderStaticTextSpec) obj).getApiPath());
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public int hashCode() {
        return getApiPath().hashCode();
    }

    public String toString() {
        return "KlarnaHeaderStaticTextSpec(apiPath=" + getApiPath() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final FormElement transform() {
        return new StaticTextElement(getApiPath(), KlarnaHelper.getKlarnaHeader$default(KlarnaHelper.INSTANCE, null, 1, null), null, 4, null);
    }

    public /* synthetic */ KlarnaHeaderStaticTextSpec(IdentifierSpec identifierSpec, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? IdentifierSpec.Companion.Generic("klarna_header_text") : identifierSpec);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlarnaHeaderStaticTextSpec(IdentifierSpec apiPath) {
        super(null);
        s.g(apiPath, "apiPath");
        this.apiPath = apiPath;
    }
}