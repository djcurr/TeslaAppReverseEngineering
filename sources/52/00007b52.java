package j7;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f33268a;

    /* renamed from: b  reason: collision with root package name */
    private final f f33269b;

    public a(T t11, f validation) {
        s.g(validation, "validation");
        this.f33268a = t11;
        this.f33269b = validation;
    }

    public final f a() {
        return this.f33269b;
    }

    public final T b() {
        return this.f33268a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(this.f33268a, aVar.f33268a) && s.c(this.f33269b, aVar.f33269b);
        }
        return false;
    }

    public int hashCode() {
        T t11 = this.f33268a;
        return ((t11 == null ? 0 : t11.hashCode()) * 31) + this.f33269b.hashCode();
    }

    public String toString() {
        return "FieldState(value=" + this.f33268a + ", validation=" + this.f33269b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}