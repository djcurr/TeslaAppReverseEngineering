package expo.modules.kotlin.records;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@Target({})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B$\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006R\u0013\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0013\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0013\u0010\u0007\u001a\u00020\u00068\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/records/DoubleRange;", "", "", "from", "()D", "to", "", "fromInclusive", "()Z", "toInclusive", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
@BindUsing(binder = DoubleRangeBinder.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes5.dex */
public @interface DoubleRange {
    double from();

    boolean fromInclusive() default true;

    double to();

    boolean toInclusive() default true;
}