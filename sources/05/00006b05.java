package expo.modules.kotlin.records;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\f\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002R\u0017\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lexpo/modules/kotlin/records/BindUsing;", "", "Ln00/d;", "binder", "()Ljava/lang/Class;", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public @interface BindUsing {
    Class<?> binder();
}