package x0;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final a f56571a;

    /* renamed from: b  reason: collision with root package name */
    private final a f56572b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f56573c;

    /* loaded from: classes.dex */
    public static final class a {
    }

    public final a a() {
        return this.f56572b;
    }

    public final boolean b() {
        return this.f56573c;
    }

    public final a c() {
        return this.f56571a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return kotlin.jvm.internal.s.c(this.f56571a, jVar.f56571a) && kotlin.jvm.internal.s.c(this.f56572b, jVar.f56572b) && this.f56573c == jVar.f56573c;
        }
        return false;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return "Selection(start=" + this.f56571a + ", end=" + this.f56572b + ", handlesCrossed=" + this.f56573c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}