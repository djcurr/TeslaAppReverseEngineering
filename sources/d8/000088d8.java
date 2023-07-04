package n00;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class a implements GenericArrayType, Type {

    /* renamed from: a  reason: collision with root package name */
    private final Type f40136a;

    public a(Type elementType) {
        kotlin.jvm.internal.s.g(elementType, "elementType");
        this.f40136a = elementType;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && kotlin.jvm.internal.s.c(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.f40136a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        String h11;
        StringBuilder sb2 = new StringBuilder();
        h11 = w.h(this.f40136a);
        sb2.append(h11);
        sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        return sb2.toString();
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}