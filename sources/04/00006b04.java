package expo.modules.kotlin.records;

import expo.modules.kotlin.exception.ValidationException;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lexpo/modules/kotlin/records/ArraySizeValidator;", "Lexpo/modules/kotlin/records/FieldValidator;", "", "value", "Lvz/b0;", "validate", "([Ljava/lang/Object;)V", "", "min", "I", "max", "<init>", "(II)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ArraySizeValidator implements FieldValidator<Object[]> {
    private final int max;
    private final int min;

    public ArraySizeValidator(int i11, int i12) {
        this.min = i11;
        this.max = i12;
    }

    @Override // expo.modules.kotlin.records.FieldValidator
    public void validate(Object[] value) {
        s.g(value, "value");
        if (value.length < this.min || value.length > this.max) {
            int i11 = this.min;
            int i12 = this.max;
            int length = value.length;
            throw new ValidationException("Number of elements in the array should be between " + i11 + " and " + i12 + ", got " + length);
        }
    }
}