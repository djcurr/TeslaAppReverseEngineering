package expo.modules.kotlin.records;

import expo.modules.kotlin.exception.ValidationException;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lexpo/modules/kotlin/records/IntArraySizeValidator;", "Lexpo/modules/kotlin/records/FieldValidator;", "", "value", "Lvz/b0;", "validate", "", "min", "I", "max", "<init>", "(II)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class IntArraySizeValidator implements FieldValidator<int[]> {
    private final int max;
    private final int min;

    public IntArraySizeValidator(int i11, int i12) {
        this.min = i11;
        this.max = i12;
    }

    @Override // expo.modules.kotlin.records.FieldValidator
    public void validate(int[] value) {
        s.g(value, "value");
        if (value.length < this.min || value.length > this.max) {
            int i11 = this.min;
            int i12 = this.max;
            int length = value.length;
            throw new ValidationException("Number of elements in the array should be between " + i11 + " and " + i12 + ", got " + length);
        }
    }
}