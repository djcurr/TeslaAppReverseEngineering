package w2;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x2.r;
import x2.s;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c  reason: collision with root package name */
    public static final a f55424c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final i f55425d = new i(0, 0, 3, null);

    /* renamed from: a  reason: collision with root package name */
    private final long f55426a;

    /* renamed from: b  reason: collision with root package name */
    private final long f55427b;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a() {
            return i.f55425d;
        }
    }

    private i(long j11, long j12) {
        this.f55426a = j11;
        this.f55427b = j12;
    }

    public /* synthetic */ i(long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12);
    }

    public final long b() {
        return this.f55426a;
    }

    public final long c() {
        return this.f55427b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return r.e(b(), iVar.b()) && r.e(c(), iVar.c());
        }
        return false;
    }

    public int hashCode() {
        return (r.i(b()) * 31) + r.i(c());
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) r.j(b())) + ", restLine=" + ((Object) r.j(c())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ i(long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? s.f(0) : j11, (i11 & 2) != 0 ? s.f(0) : j12, null);
    }
}