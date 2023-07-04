package d2;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private final long f23427a;

    /* renamed from: b  reason: collision with root package name */
    private final long f23428b;

    /* renamed from: c  reason: collision with root package name */
    private final long f23429c;

    /* renamed from: d  reason: collision with root package name */
    private final long f23430d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f23431e;

    /* renamed from: f  reason: collision with root package name */
    private final int f23432f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f23433g;

    /* renamed from: h  reason: collision with root package name */
    private final List<e> f23434h;

    /* renamed from: i  reason: collision with root package name */
    private final long f23435i;

    private x(long j11, long j12, long j13, long j14, boolean z11, int i11, boolean z12, List<e> list, long j15) {
        this.f23427a = j11;
        this.f23428b = j12;
        this.f23429c = j13;
        this.f23430d = j14;
        this.f23431e = z11;
        this.f23432f = i11;
        this.f23433g = z12;
        this.f23434h = list;
        this.f23435i = j15;
    }

    public /* synthetic */ x(long j11, long j12, long j13, long j14, boolean z11, int i11, boolean z12, List list, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, z11, i11, z12, list, j15);
    }

    public final boolean a() {
        return this.f23431e;
    }

    public final List<e> b() {
        return this.f23434h;
    }

    public final long c() {
        return this.f23427a;
    }

    public final boolean d() {
        return this.f23433g;
    }

    public final long e() {
        return this.f23430d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return t.d(this.f23427a, xVar.f23427a) && this.f23428b == xVar.f23428b && s1.f.j(this.f23429c, xVar.f23429c) && s1.f.j(this.f23430d, xVar.f23430d) && this.f23431e == xVar.f23431e && e0.g(this.f23432f, xVar.f23432f) && this.f23433g == xVar.f23433g && kotlin.jvm.internal.s.c(this.f23434h, xVar.f23434h) && s1.f.j(this.f23435i, xVar.f23435i);
        }
        return false;
    }

    public final long f() {
        return this.f23429c;
    }

    public final long g() {
        return this.f23435i;
    }

    public final int h() {
        return this.f23432f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int e11 = ((((((t.e(this.f23427a) * 31) + Long.hashCode(this.f23428b)) * 31) + s1.f.n(this.f23429c)) * 31) + s1.f.n(this.f23430d)) * 31;
        boolean z11 = this.f23431e;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int h11 = (((e11 + i11) * 31) + e0.h(this.f23432f)) * 31;
        boolean z12 = this.f23433g;
        return ((((h11 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + this.f23434h.hashCode()) * 31) + s1.f.n(this.f23435i);
    }

    public final long i() {
        return this.f23428b;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) t.f(this.f23427a)) + ", uptime=" + this.f23428b + ", positionOnScreen=" + ((Object) s1.f.s(this.f23429c)) + ", position=" + ((Object) s1.f.s(this.f23430d)) + ", down=" + this.f23431e + ", type=" + ((Object) e0.i(this.f23432f)) + ", issuesEnterExit=" + this.f23433g + ", historical=" + this.f23434h + ", scrollDelta=" + ((Object) s1.f.s(this.f23435i)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}