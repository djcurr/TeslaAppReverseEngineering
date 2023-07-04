package n00;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class u implements ParameterizedType, Type {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f40142a;

    /* renamed from: b  reason: collision with root package name */
    private final Type f40143b;

    /* renamed from: c  reason: collision with root package name */
    private final Type[] f40144c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<Type, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f40145a = new a();

        a() {
            super(1, w.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // h00.l
        /* renamed from: d */
        public final String invoke(Type p02) {
            String h11;
            kotlin.jvm.internal.s.g(p02, "p0");
            h11 = w.h(p02);
            return h11;
        }
    }

    public u(Class<?> rawType, Type type, List<? extends Type> typeArguments) {
        kotlin.jvm.internal.s.g(rawType, "rawType");
        kotlin.jvm.internal.s.g(typeArguments, "typeArguments");
        this.f40142a = rawType;
        this.f40143b = type;
        Object[] array = typeArguments.toArray(new Type[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f40144c = (Type[]) array;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (kotlin.jvm.internal.s.c(this.f40142a, parameterizedType.getRawType()) && kotlin.jvm.internal.s.c(this.f40143b, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f40144c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f40143b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f40142a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        String h11;
        String h12;
        StringBuilder sb2 = new StringBuilder();
        Type type = this.f40143b;
        if (type != null) {
            h12 = w.h(type);
            sb2.append(h12);
            sb2.append("$");
            sb2.append(this.f40142a.getSimpleName());
        } else {
            h11 = w.h(this.f40142a);
            sb2.append(h11);
        }
        Type[] typeArr = this.f40144c;
        if (!(typeArr.length == 0)) {
            wz.p.S(typeArr, sb2, null, "<", ">", 0, null, a.f40145a, 50, null);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public int hashCode() {
        int hashCode = this.f40142a.hashCode();
        Type type = this.f40143b;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}