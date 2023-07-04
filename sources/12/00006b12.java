package expo.modules.kotlin.records;

import g00.a;
import java.lang.annotation.Annotation;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import n00.f;
import n00.p;
import o00.b;
import o00.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/records/IsCollectionNotEmptyBinder;", "Lexpo/modules/kotlin/records/ValidationBinder;", "", "annotation", "Ln00/p;", "fieldType", "Lexpo/modules/kotlin/records/FieldValidator;", "bind", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class IsCollectionNotEmptyBinder implements ValidationBinder {
    @Override // expo.modules.kotlin.records.ValidationBinder
    public FieldValidator<?> bind(Annotation annotation, p fieldType) {
        s.g(annotation, "annotation");
        s.g(fieldType, "fieldType");
        boolean z11 = annotation instanceof IsNotEmpty;
        if (s.c(fieldType, d.c(m0.b(int[].class), null, false, null, 7, null))) {
            return new IsNotEmptyIntArrayValidator();
        }
        if (s.c(fieldType, d.c(m0.b(double[].class), null, false, null, 7, null))) {
            return new IsNotEmptyDoubleArrayValidator();
        }
        if (s.c(fieldType, d.c(m0.b(float[].class), null, false, null, 7, null))) {
            return new IsNotEmptyFloatArrayValidator();
        }
        f c11 = fieldType.c();
        Objects.requireNonNull(c11, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        n00.d dVar = (n00.d) c11;
        if (!b.i(dVar, m0.b(Object[].class)) && !a.b(dVar).isArray()) {
            return new IsNotEmptyCollectionValidator();
        }
        return new IsNotEmptyArrayValidator();
    }
}