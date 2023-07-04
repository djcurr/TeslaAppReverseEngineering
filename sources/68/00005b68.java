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
public final class StaticTextSpec extends FormItemSpec {
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

        public final b<StaticTextSpec> serializer() {
            return StaticTextSpec$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StaticTextSpec(int i11, IdentifierSpec identifierSpec, int i12, q1 q1Var) {
        super(null);
        if (2 != (i11 & 2)) {
            f1.a(i11, 2, StaticTextSpec$$serializer.INSTANCE.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.apiPath = IdentifierSpec.Companion.Generic("static_text");
        } else {
            this.apiPath = identifierSpec;
        }
        this.stringResId = i12;
    }

    public static /* synthetic */ StaticTextSpec copy$default(StaticTextSpec staticTextSpec, IdentifierSpec identifierSpec, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            identifierSpec = staticTextSpec.getApiPath();
        }
        if ((i12 & 2) != 0) {
            i11 = staticTextSpec.stringResId;
        }
        return staticTextSpec.copy(identifierSpec, i11);
    }

    public static final void write$Self(StaticTextSpec self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        if (output.k(serialDesc, 0) || !s.c(self.getApiPath(), IdentifierSpec.Companion.Generic("static_text"))) {
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

    public final StaticTextSpec copy(IdentifierSpec apiPath, int i11) {
        s.g(apiPath, "apiPath");
        return new StaticTextSpec(apiPath, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StaticTextSpec) {
            StaticTextSpec staticTextSpec = (StaticTextSpec) obj;
            return s.c(getApiPath(), staticTextSpec.getApiPath()) && this.stringResId == staticTextSpec.stringResId;
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
        return "StaticTextSpec(apiPath=" + getApiPath() + ", stringResId=" + this.stringResId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final FormElement transform() {
        return new StaticTextElement(getApiPath(), this.stringResId, null, 4, null);
    }

    public /* synthetic */ StaticTextSpec(IdentifierSpec identifierSpec, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? IdentifierSpec.Companion.Generic("static_text") : identifierSpec, i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticTextSpec(IdentifierSpec apiPath, int i11) {
        super(null);
        s.g(apiPath, "apiPath");
        this.apiPath = apiPath;
        this.stringResId = i11;
    }
}