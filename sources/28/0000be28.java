package x0;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private final long f56628a;

    /* renamed from: b  reason: collision with root package name */
    private final long f56629b;

    private x(long j11, long j12) {
        this.f56628a = j11;
        this.f56629b = j12;
    }

    public /* synthetic */ x(long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12);
    }

    public final long a() {
        return this.f56629b;
    }

    public final long b() {
        return this.f56628a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return t1.a0.n(b(), xVar.b()) && t1.a0.n(a(), xVar.a());
        }
        return false;
    }

    public int hashCode() {
        return (t1.a0.t(b()) * 31) + t1.a0.t(a());
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) t1.a0.u(b())) + ", selectionBackgroundColor=" + ((Object) t1.a0.u(a())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}