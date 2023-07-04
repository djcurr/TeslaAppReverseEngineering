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
public final class NameSpec extends FormItemSpec {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final IdentifierSpec apiPath;
    private final TranslationId labelTranslationId;
    private final SimpleTextSpec simpleTextSpec;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<NameSpec> serializer() {
            return NameSpec$$serializer.INSTANCE;
        }
    }

    public NameSpec() {
        this((IdentifierSpec) null, (TranslationId) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NameSpec(int i11, IdentifierSpec identifierSpec, TranslationId translationId, q1 q1Var) {
        super(null);
        if ((i11 & 0) != 0) {
            f1.a(i11, 0, NameSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.apiPath = (i11 & 1) == 0 ? IdentifierSpec.Companion.getName() : identifierSpec;
        if ((i11 & 2) == 0) {
            this.labelTranslationId = TranslationId.AddressName;
        } else {
            this.labelTranslationId = translationId;
        }
        this.simpleTextSpec = new SimpleTextSpec(getApiPath(), this.labelTranslationId.getResourceId(), Capitalization.Words, KeyboardType.Text, false, 16, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ NameSpec copy$default(NameSpec nameSpec, IdentifierSpec identifierSpec, TranslationId translationId, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = nameSpec.getApiPath();
        }
        if ((i11 & 2) != 0) {
            translationId = nameSpec.labelTranslationId;
        }
        return nameSpec.copy(identifierSpec, translationId);
    }

    public static /* synthetic */ void getLabelTranslationId$annotations() {
    }

    private static /* synthetic */ void getSimpleTextSpec$annotations() {
    }

    public static final void write$Self(NameSpec self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        if (output.k(serialDesc, 0) || !s.c(self.getApiPath(), IdentifierSpec.Companion.getName())) {
            output.q(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        }
        if (output.k(serialDesc, 1) || self.labelTranslationId != TranslationId.AddressName) {
            output.q(serialDesc, 1, TranslationId$$serializer.INSTANCE, self.labelTranslationId);
        }
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final TranslationId component2() {
        return this.labelTranslationId;
    }

    public final NameSpec copy(IdentifierSpec apiPath, TranslationId labelTranslationId) {
        s.g(apiPath, "apiPath");
        s.g(labelTranslationId, "labelTranslationId");
        return new NameSpec(apiPath, labelTranslationId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NameSpec) {
            NameSpec nameSpec = (NameSpec) obj;
            return s.c(getApiPath(), nameSpec.getApiPath()) && this.labelTranslationId == nameSpec.labelTranslationId;
        }
        return false;
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final TranslationId getLabelTranslationId() {
        return this.labelTranslationId;
    }

    public int hashCode() {
        return (getApiPath().hashCode() * 31) + this.labelTranslationId.hashCode();
    }

    public String toString() {
        return "NameSpec(apiPath=" + getApiPath() + ", labelTranslationId=" + this.labelTranslationId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final SectionElement transform(Map<IdentifierSpec, String> initialValues) {
        s.g(initialValues, "initialValues");
        return this.simpleTextSpec.transform(initialValues);
    }

    public /* synthetic */ NameSpec(IdentifierSpec identifierSpec, TranslationId translationId, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? IdentifierSpec.Companion.getName() : identifierSpec, (i11 & 2) != 0 ? TranslationId.AddressName : translationId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NameSpec(IdentifierSpec apiPath, TranslationId labelTranslationId) {
        super(null);
        s.g(apiPath, "apiPath");
        s.g(labelTranslationId, "labelTranslationId");
        this.apiPath = apiPath;
        this.labelTranslationId = labelTranslationId;
        this.simpleTextSpec = new SimpleTextSpec(getApiPath(), labelTranslationId.getResourceId(), Capitalization.Words, KeyboardType.Text, false, 16, (DefaultConstructorMarker) null);
    }
}