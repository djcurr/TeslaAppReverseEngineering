package n00;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class v implements TypeVariable<GenericDeclaration>, Type {

    /* renamed from: a  reason: collision with root package name */
    private final q f40146a;

    public v(q typeParameter) {
        kotlin.jvm.internal.s.g(typeParameter, "typeParameter");
        this.f40146a = typeParameter;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (kotlin.jvm.internal.s.c(getName(), typeVariable.getName()) && kotlin.jvm.internal.s.c(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    public Type[] getBounds() {
        int t11;
        Type c11;
        List<p> upperBounds = this.f40146a.getUpperBounds();
        t11 = wz.x.t(upperBounds, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (p pVar : upperBounds) {
            c11 = w.c(pVar, true);
            arrayList.add(c11);
        }
        Object[] array = arrayList.toArray(new Type[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (Type[]) array;
    }

    @Override // java.lang.reflect.TypeVariable
    public GenericDeclaration getGenericDeclaration() {
        throw new vz.o("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f40146a));
    }

    @Override // java.lang.reflect.TypeVariable
    public String getName() {
        return this.f40146a.getName();
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}