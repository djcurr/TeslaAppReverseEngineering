package e2;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final long f24528a;

    /* renamed from: b  reason: collision with root package name */
    private final long f24529b;

    private b(long j11, long j12) {
        this.f24528a = j11;
        this.f24529b = j12;
    }

    public /* synthetic */ b(long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12);
    }

    public final long a() {
        return this.f24528a;
    }

    public final long b() {
        return this.f24529b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return s1.f.j(this.f24528a, bVar.f24528a) && this.f24529b == bVar.f24529b;
        }
        return false;
    }

    public int hashCode() {
        return (s1.f.n(this.f24528a) * 31) + Long.hashCode(this.f24529b);
    }

    public String toString() {
        return "PointAtTime(point=" + ((Object) s1.f.s(this.f24528a)) + ", time=" + this.f24529b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}