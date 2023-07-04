package com.stripe.android.ui.core.elements;

import c30.b;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;
import wz.v;

@a(with = FormItemSpecSerializer.class)
/* loaded from: classes6.dex */
public abstract class FormItemSpec {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<FormItemSpec> serializer() {
            return FormItemSpecSerializer.INSTANCE;
        }
    }

    private FormItemSpec() {
    }

    public /* synthetic */ FormItemSpec(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ SectionElement createSectionElement$payments_ui_core_release$default(FormItemSpec formItemSpec, SectionFieldElement sectionFieldElement, Integer num, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                num = null;
            }
            return formItemSpec.createSectionElement$payments_ui_core_release(sectionFieldElement, num);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSectionElement");
    }

    public static /* synthetic */ void getApiPath$annotations() {
    }

    public final SectionElement createSectionElement$payments_ui_core_release(SectionFieldElement sectionFieldElement, Integer num) {
        List d11;
        s.g(sectionFieldElement, "sectionFieldElement");
        IdentifierSpec Generic = IdentifierSpec.Companion.Generic(s.p(sectionFieldElement.getIdentifier().getV1(), "_section"));
        d11 = v.d(sectionFieldElement.sectionFieldErrorController());
        return new SectionElement(Generic, sectionFieldElement, new SectionController(num, d11));
    }

    public abstract IdentifierSpec getApiPath();
}