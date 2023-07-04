package g30;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    private static final e30.f[] f27573a = new e30.f[0];

    public static final Set<String> a(e30.f fVar) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        if (fVar instanceof m) {
            return ((m) fVar).a();
        }
        HashSet hashSet = new HashSet(fVar.d());
        int d11 = fVar.d();
        for (int i11 = 0; i11 < d11; i11++) {
            hashSet.add(fVar.e(i11));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] b(List<? extends e30.f> list) {
        if (list == null || list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            Object[] array = list.toArray(new e30.f[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (e30.f[]) array;
        }
        return f27573a;
    }

    public static final n00.d<Object> c(n00.p pVar) {
        kotlin.jvm.internal.s.g(pVar, "<this>");
        n00.f c11 = pVar.c();
        if (c11 instanceof n00.d) {
            return (n00.d) c11;
        }
        if (c11 instanceof n00.q) {
            throw new IllegalStateException(("Captured type paramerer " + c11 + " from generic non-reified function. Such functionality cannot be supported as " + c11 + " is erased, either specify serializer explicitly or make calling function inline with reified " + c11).toString());
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + c11).toString());
    }

    public static final Void d(n00.d<?> dVar) {
        kotlin.jvm.internal.s.g(dVar, "<this>");
        throw new SerializationException("Serializer for class '" + dVar.o() + "' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
    }
}