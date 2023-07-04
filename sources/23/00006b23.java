package expo.modules.kotlin.records;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@Target({})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002R\u0013\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0013\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/records/Size;", "", "", "min", "()I", "max", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
@BindUsing(binder = SizeBinder.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes5.dex */
public @interface Size {
    int max() default Integer.MAX_VALUE;

    int min() default 0;
}