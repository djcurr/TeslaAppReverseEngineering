package vz;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class p<A, B> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final A f54770a;

    /* renamed from: b  reason: collision with root package name */
    private final B f54771b;

    public p(A a11, B b11) {
        this.f54770a = a11;
        this.f54771b = b11;
    }

    public final A a() {
        return this.f54770a;
    }

    public final B b() {
        return this.f54771b;
    }

    public final A c() {
        return this.f54770a;
    }

    public final B d() {
        return this.f54771b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return kotlin.jvm.internal.s.c(this.f54770a, pVar.f54770a) && kotlin.jvm.internal.s.c(this.f54771b, pVar.f54771b);
        }
        return false;
    }

    public int hashCode() {
        A a11 = this.f54770a;
        int hashCode = (a11 == null ? 0 : a11.hashCode()) * 31;
        B b11 = this.f54771b;
        return hashCode + (b11 != null ? b11.hashCode() : 0);
    }

    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + this.f54770a + ", " + this.f54771b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}