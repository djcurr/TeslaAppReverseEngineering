package vz;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class u<A, B, C> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final A f54781a;

    /* renamed from: b  reason: collision with root package name */
    private final B f54782b;

    /* renamed from: c  reason: collision with root package name */
    private final C f54783c;

    public u(A a11, B b11, C c11) {
        this.f54781a = a11;
        this.f54782b = b11;
        this.f54783c = c11;
    }

    public final A a() {
        return this.f54781a;
    }

    public final B b() {
        return this.f54782b;
    }

    public final C c() {
        return this.f54783c;
    }

    public final A d() {
        return this.f54781a;
    }

    public final B e() {
        return this.f54782b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return kotlin.jvm.internal.s.c(this.f54781a, uVar.f54781a) && kotlin.jvm.internal.s.c(this.f54782b, uVar.f54782b) && kotlin.jvm.internal.s.c(this.f54783c, uVar.f54783c);
        }
        return false;
    }

    public final C f() {
        return this.f54783c;
    }

    public int hashCode() {
        A a11 = this.f54781a;
        int hashCode = (a11 == null ? 0 : a11.hashCode()) * 31;
        B b11 = this.f54782b;
        int hashCode2 = (hashCode + (b11 == null ? 0 : b11.hashCode())) * 31;
        C c11 = this.f54783c;
        return hashCode2 + (c11 != null ? c11.hashCode() : 0);
    }

    public String toString() {
        return CoreConstants.LEFT_PARENTHESIS_CHAR + this.f54781a + ", " + this.f54782b + ", " + this.f54783c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}