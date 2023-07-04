package com.stripe.android.ui.core.elements;

import java.util.List;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;

/* loaded from: classes6.dex */
public final class AddressController implements SectionFieldErrorController {
    public static final int $stable = 8;
    private final e<FieldError> error;
    private final e<List<SectionFieldElement>> fieldsFlowable;
    private final Integer label;

    /* JADX WARN: Multi-variable type inference failed */
    public AddressController(e<? extends List<? extends SectionFieldElement>> fieldsFlowable) {
        s.g(fieldsFlowable, "fieldsFlowable");
        this.fieldsFlowable = fieldsFlowable;
        this.error = g.G(fieldsFlowable, new AddressController$special$$inlined$flatMapLatest$1(null));
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldErrorController
    public e<FieldError> getError() {
        return this.error;
    }

    public final e<List<SectionFieldElement>> getFieldsFlowable() {
        return this.fieldsFlowable;
    }

    public final Integer getLabel() {
        return this.label;
    }
}