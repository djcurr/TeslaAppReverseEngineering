package expo.modules.kotlin.records;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import n00.p;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/records/LongRangeBinder;", "Lexpo/modules/kotlin/records/ValidationBinder;", "", "annotation", "Ln00/p;", "fieldType", "Lexpo/modules/kotlin/records/FieldValidator;", "bind", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class LongRangeBinder implements ValidationBinder {
    @Override // expo.modules.kotlin.records.ValidationBinder
    public FieldValidator<?> bind(Annotation annotation, p fieldType) {
        s.g(annotation, "annotation");
        s.g(fieldType, "fieldType");
        LongRange longRange = (LongRange) annotation;
        return new NumericRangeValidator(Long.valueOf(longRange.from()), Long.valueOf(longRange.to()), longRange.fromInclusive(), longRange.toInclusive());
    }
}