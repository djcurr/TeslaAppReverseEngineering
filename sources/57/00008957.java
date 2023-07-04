package n2;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final long f40319a;

    /* renamed from: b  reason: collision with root package name */
    private final long f40320b;

    /* renamed from: c  reason: collision with root package name */
    private final int f40321c;

    private p(long j11, long j12, int i11) {
        this.f40319a = j11;
        this.f40320b = j12;
        this.f40321c = i11;
        if (!x2.s.g(c())) {
            if (!(!x2.s.g(a()))) {
                throw new IllegalArgumentException("height cannot be TextUnit.Unspecified".toString());
            }
            return;
        }
        throw new IllegalArgumentException("width cannot be TextUnit.Unspecified".toString());
    }

    public /* synthetic */ p(long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, i11);
    }

    public final long a() {
        return this.f40320b;
    }

    public final int b() {
        return this.f40321c;
    }

    public final long c() {
        return this.f40319a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return x2.r.e(c(), pVar.c()) && x2.r.e(a(), pVar.a()) && q.i(b(), pVar.b());
        }
        return false;
    }

    public int hashCode() {
        return (((x2.r.i(c()) * 31) + x2.r.i(a())) * 31) + q.j(b());
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) x2.r.j(c())) + ", height=" + ((Object) x2.r.j(a())) + ", placeholderVerticalAlign=" + ((Object) q.k(b())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}