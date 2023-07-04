package d2;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final long f23410a;

    /* renamed from: b  reason: collision with root package name */
    private final long f23411b;

    /* renamed from: c  reason: collision with root package name */
    private final long f23412c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f23413d;

    /* renamed from: e  reason: collision with root package name */
    private final long f23414e;

    /* renamed from: f  reason: collision with root package name */
    private final long f23415f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f23416g;

    /* renamed from: h  reason: collision with root package name */
    private final d f23417h;

    /* renamed from: i  reason: collision with root package name */
    private final int f23418i;

    /* renamed from: j  reason: collision with root package name */
    private List<e> f23419j;

    /* renamed from: k  reason: collision with root package name */
    private long f23420k;

    private u(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, d dVar, int i11) {
        this.f23410a = j11;
        this.f23411b = j12;
        this.f23412c = j13;
        this.f23413d = z11;
        this.f23414e = j14;
        this.f23415f = j15;
        this.f23416g = z12;
        this.f23417h = dVar;
        this.f23418i = i11;
        this.f23420k = s1.f.f49950b.c();
    }

    public /* synthetic */ u(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, d dVar, int i11, List list, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, z11, j14, j15, z12, dVar, i11, list, j16);
    }

    public /* synthetic */ u(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, z11, j14, j15, z12, dVar, i11);
    }

    public final u a(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, d consumed, int i11, List<e> historical) {
        kotlin.jvm.internal.s.g(consumed, "consumed");
        kotlin.jvm.internal.s.g(historical, "historical");
        return new u(j11, j12, j13, z11, j14, j15, z12, consumed, i11, historical, l(), null);
    }

    public final u c(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, d consumed, int i11) {
        kotlin.jvm.internal.s.g(consumed, "consumed");
        return new u(j11, j12, j13, z11, j14, j15, z12, consumed, i11, f(), l(), null);
    }

    public final d e() {
        return this.f23417h;
    }

    public final List<e> f() {
        List<e> i11;
        List<e> list = this.f23419j;
        if (list == null) {
            i11 = wz.w.i();
            return i11;
        }
        return list;
    }

    public final long g() {
        return this.f23410a;
    }

    public final long h() {
        return this.f23412c;
    }

    public final boolean i() {
        return this.f23413d;
    }

    public final long j() {
        return this.f23415f;
    }

    public final boolean k() {
        return this.f23416g;
    }

    public final long l() {
        return this.f23420k;
    }

    public final int m() {
        return this.f23418i;
    }

    public final long n() {
        return this.f23411b;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) t.f(g())) + ", uptimeMillis=" + this.f23411b + ", position=" + ((Object) s1.f.s(h())) + ", pressed=" + this.f23413d + ", previousUptimeMillis=" + this.f23414e + ", previousPosition=" + ((Object) s1.f.s(j())) + ", previousPressed=" + this.f23416g + ", consumed=" + this.f23417h + ", type=" + ((Object) e0.i(m())) + ", historical=" + f() + ",scrollDelta=" + ((Object) s1.f.s(l())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private u(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, d dVar, int i11, List<e> list, long j16) {
        this(j11, j12, j13, z11, j14, j15, z12, dVar, i11, null);
        this.f23419j = list;
        this.f23420k = j16;
    }
}