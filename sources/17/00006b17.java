package expo.modules.kotlin.records;

import expo.modules.kotlin.exception.ValidationException;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/records/IsNotEmptyFloatArrayValidator;", "Lexpo/modules/kotlin/records/FieldValidator;", "", "value", "Lvz/b0;", "validate", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class IsNotEmptyFloatArrayValidator implements FieldValidator<float[]> {
    @Override // expo.modules.kotlin.records.FieldValidator
    public void validate(float[] value) {
        s.g(value, "value");
        if (value.length == 0) {
            throw new ValidationException("Array is empty");
        }
    }
}