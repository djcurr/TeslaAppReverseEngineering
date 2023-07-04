package v2;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f53880a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53881b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53882c;

    public d(Object span, int i11, int i12) {
        s.g(span, "span");
        this.f53880a = span;
        this.f53881b = i11;
        this.f53882c = i12;
    }

    public final Object a() {
        return this.f53880a;
    }

    public final int b() {
        return this.f53881b;
    }

    public final int c() {
        return this.f53882c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return s.c(this.f53880a, dVar.f53880a) && this.f53881b == dVar.f53881b && this.f53882c == dVar.f53882c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f53880a.hashCode() * 31) + Integer.hashCode(this.f53881b)) * 31) + Integer.hashCode(this.f53882c);
    }

    public String toString() {
        return "SpanRange(span=" + this.f53880a + ", start=" + this.f53881b + ", end=" + this.f53882c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}