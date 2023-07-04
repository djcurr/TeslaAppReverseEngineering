package expo.modules.kotlin.records;

import expo.modules.kotlin.exception.ValidationException;
import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B'\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00028\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00028\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0011"}, d2 = {"Lexpo/modules/kotlin/records/NumericRangeValidator;", "", "T", "Lexpo/modules/kotlin/records/FieldValidator;", "value", "Lvz/b0;", "validate", "(Ljava/lang/Comparable;)V", "from", "Ljava/lang/Comparable;", "to", "", "fromInclusive", "Z", "toInclusive", "<init>", "(Ljava/lang/Comparable;Ljava/lang/Comparable;ZZ)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class NumericRangeValidator<T extends Comparable<? super T>> implements FieldValidator<T> {
    private final T from;
    private final boolean fromInclusive;

    /* renamed from: to  reason: collision with root package name */
    private final T f25324to;
    private final boolean toInclusive;

    public NumericRangeValidator(T from, T to2, boolean z11, boolean z12) {
        s.g(from, "from");
        s.g(to2, "to");
        this.from = from;
        this.f25324to = to2;
        this.fromInclusive = z11;
        this.toInclusive = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // expo.modules.kotlin.records.FieldValidator
    public /* bridge */ /* synthetic */ void validate(Object obj) {
        validate((NumericRangeValidator<T>) ((Comparable) obj));
    }

    public void validate(T value) {
        s.g(value, "value");
        if (value.compareTo(this.from) < 0 || this.f25324to.compareTo(value) < 0 || ((s.c(value, this.from) && !this.fromInclusive) || (s.c(value, this.f25324to) && !this.toInclusive))) {
            T t11 = this.from;
            String str = this.fromInclusive ? "<=" : "<";
            String str2 = this.toInclusive ? "<=" : "<";
            T t12 = this.f25324to;
            throw new ValidationException("Value should be in range " + t11 + " " + str + " 'value' " + str2 + " " + t12 + ", got " + value);
        }
    }
}