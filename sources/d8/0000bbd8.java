package w1;

import ch.qos.logback.core.CoreConstants;
import j00.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import s1.l;
import t1.b0;
import t1.d0;
import t1.h0;
import v1.e;
import x2.k;
import x2.o;
import x2.p;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: f  reason: collision with root package name */
    private final h0 f55355f;

    /* renamed from: g  reason: collision with root package name */
    private final long f55356g;

    /* renamed from: h  reason: collision with root package name */
    private final long f55357h;

    /* renamed from: i  reason: collision with root package name */
    private int f55358i;

    /* renamed from: j  reason: collision with root package name */
    private final long f55359j;

    /* renamed from: k  reason: collision with root package name */
    private float f55360k;

    /* renamed from: l  reason: collision with root package name */
    private b0 f55361l;

    public /* synthetic */ a(h0 h0Var, long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(h0Var, (i11 & 2) != 0 ? k.f56947b.a() : j11, (i11 & 4) != 0 ? p.a(h0Var.getWidth(), h0Var.getHeight()) : j12, null);
    }

    public /* synthetic */ a(h0 h0Var, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(h0Var, j11, j12);
    }

    private final long l(long j11, long j12) {
        if (k.h(j11) >= 0 && k.i(j11) >= 0 && o.g(j12) >= 0 && o.f(j12) >= 0 && o.g(j12) <= this.f55355f.getWidth() && o.f(j12) <= this.f55355f.getHeight()) {
            return j12;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // w1.b
    protected boolean a(float f11) {
        this.f55360k = f11;
        return true;
    }

    @Override // w1.b
    protected boolean b(b0 b0Var) {
        this.f55361l = b0Var;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(this.f55355f, aVar.f55355f) && k.g(this.f55356g, aVar.f55356g) && o.e(this.f55357h, aVar.f55357h) && d0.d(k(), aVar.k());
        }
        return false;
    }

    @Override // w1.b
    public long h() {
        return p.b(this.f55359j);
    }

    public int hashCode() {
        return (((((this.f55355f.hashCode() * 31) + k.j(this.f55356g)) * 31) + o.h(this.f55357h)) * 31) + d0.e(k());
    }

    @Override // w1.b
    protected void j(e eVar) {
        int c11;
        int c12;
        s.g(eVar, "<this>");
        h0 h0Var = this.f55355f;
        long j11 = this.f55356g;
        long j12 = this.f55357h;
        c11 = c.c(l.i(eVar.c()));
        c12 = c.c(l.g(eVar.c()));
        e.b.c(eVar, h0Var, j11, j12, 0L, p.a(c11, c12), this.f55360k, null, this.f55361l, 0, k(), 328, null);
    }

    public final int k() {
        return this.f55358i;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.f55355f + ", srcOffset=" + ((Object) k.k(this.f55356g)) + ", srcSize=" + ((Object) o.i(this.f55357h)) + ", filterQuality=" + ((Object) d0.f(k())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private a(h0 h0Var, long j11, long j12) {
        this.f55355f = h0Var;
        this.f55356g = j11;
        this.f55357h = j12;
        this.f55358i = d0.f51387a.a();
        this.f55359j = l(j11, j12);
        this.f55360k = 1.0f;
    }
}