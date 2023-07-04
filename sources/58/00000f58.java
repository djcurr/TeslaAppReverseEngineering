package c1;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class x1<T> implements v1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f8715a;

    public x1(T t11) {
        this.f8715a = t11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1) && kotlin.jvm.internal.s.c(getValue(), ((x1) obj).getValue());
    }

    @Override // c1.v1
    public T getValue() {
        return this.f8715a;
    }

    public int hashCode() {
        if (getValue() == null) {
            return 0;
        }
        return getValue().hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + getValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}