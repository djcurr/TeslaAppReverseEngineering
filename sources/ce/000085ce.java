package m10;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f38264a;

    /* renamed from: b  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f38265b;

    public c(T t11, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        this.f38264a = t11;
        this.f38265b = gVar;
    }

    public final T a() {
        return this.f38264a;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b() {
        return this.f38265b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return kotlin.jvm.internal.s.c(this.f38264a, cVar.f38264a) && kotlin.jvm.internal.s.c(this.f38265b, cVar.f38265b);
        }
        return false;
    }

    public int hashCode() {
        T t11 = this.f38264a;
        int hashCode = (t11 == null ? 0 : t11.hashCode()) * 31;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar = this.f38265b;
        return hashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public String toString() {
        return "EnhancementResult(result=" + this.f38264a + ", enhancementAnnotations=" + this.f38265b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}