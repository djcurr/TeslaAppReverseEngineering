package com.stripe.android.ui.core.elements;

import c30.b;
import ch.qos.logback.core.CoreConstants;
import e30.f;
import f30.d;
import g30.f1;
import g30.q1;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;
import wz.s0;

@a
/* loaded from: classes6.dex */
public final class DropdownSpec extends FormItemSpec {
    private final IdentifierSpec apiPath;
    private final List<DropdownItemSpec> items;
    private final TranslationId labelTranslationId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<DropdownSpec> serializer() {
            return DropdownSpec$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DropdownSpec(int i11, IdentifierSpec identifierSpec, TranslationId translationId, List list, q1 q1Var) {
        super(null);
        if (7 != (i11 & 7)) {
            f1.a(i11, 7, DropdownSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.apiPath = identifierSpec;
        this.labelTranslationId = translationId;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DropdownSpec copy$default(DropdownSpec dropdownSpec, IdentifierSpec identifierSpec, TranslationId translationId, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = dropdownSpec.getApiPath();
        }
        if ((i11 & 2) != 0) {
            translationId = dropdownSpec.labelTranslationId;
        }
        if ((i11 & 4) != 0) {
            list = dropdownSpec.items;
        }
        return dropdownSpec.copy(identifierSpec, translationId, list);
    }

    public static /* synthetic */ void getApiPath$annotations() {
    }

    public static /* synthetic */ void getItems$annotations() {
    }

    public static /* synthetic */ void getLabelTranslationId$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionElement transform$default(DropdownSpec dropdownSpec, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = s0.i();
        }
        return dropdownSpec.transform(map);
    }

    public static final void write$Self(DropdownSpec self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        output.q(serialDesc, 0, IdentifierSpec$$serializer.INSTANCE, self.getApiPath());
        output.q(serialDesc, 1, TranslationId$$serializer.INSTANCE, self.labelTranslationId);
        output.q(serialDesc, 2, new g30.f(DropdownItemSpec$$serializer.INSTANCE), self.items);
    }

    public final IdentifierSpec component1() {
        return getApiPath();
    }

    public final TranslationId component2() {
        return this.labelTranslationId;
    }

    public final List<DropdownItemSpec> component3() {
        return this.items;
    }

    public final DropdownSpec copy(IdentifierSpec apiPath, TranslationId labelTranslationId, List<DropdownItemSpec> items) {
        s.g(apiPath, "apiPath");
        s.g(labelTranslationId, "labelTranslationId");
        s.g(items, "items");
        return new DropdownSpec(apiPath, labelTranslationId, items);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DropdownSpec) {
            DropdownSpec dropdownSpec = (DropdownSpec) obj;
            return s.c(getApiPath(), dropdownSpec.getApiPath()) && this.labelTranslationId == dropdownSpec.labelTranslationId && s.c(this.items, dropdownSpec.items);
        }
        return false;
    }

    @Override // com.stripe.android.ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public final List<DropdownItemSpec> getItems() {
        return this.items;
    }

    public final TranslationId getLabelTranslationId() {
        return this.labelTranslationId;
    }

    public int hashCode() {
        return (((getApiPath().hashCode() * 31) + this.labelTranslationId.hashCode()) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "DropdownSpec(apiPath=" + getApiPath() + ", labelTranslationId=" + this.labelTranslationId + ", items=" + this.items + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final SectionElement transform(Map<IdentifierSpec, String> initialValues) {
        s.g(initialValues, "initialValues");
        return FormItemSpec.createSectionElement$payments_ui_core_release$default(this, new SimpleDropdownElement(getApiPath(), new DropdownFieldController(new SimpleDropdownConfig(this.labelTranslationId.getResourceId(), this.items), initialValues.get(getApiPath()))), null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropdownSpec(IdentifierSpec apiPath, TranslationId labelTranslationId, List<DropdownItemSpec> items) {
        super(null);
        s.g(apiPath, "apiPath");
        s.g(labelTranslationId, "labelTranslationId");
        s.g(items, "items");
        this.apiPath = apiPath;
        this.labelTranslationId = labelTranslationId;
        this.items = items;
    }
}