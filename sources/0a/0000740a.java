package i1;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private int f29555a;

    public b() {
        this(0, 1, null);
    }

    public b(int i11) {
        this.f29555a = i11;
    }

    public final int a() {
        return this.f29555a;
    }

    public final void b(int i11) {
        this.f29555a += i11;
    }

    public final void c(int i11) {
        this.f29555a = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f29555a == ((b) obj).f29555a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f29555a);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f29555a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ b(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}