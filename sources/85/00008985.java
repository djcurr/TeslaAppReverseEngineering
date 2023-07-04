package n2;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t1.q0;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final v f40410a;

    /* renamed from: b  reason: collision with root package name */
    private final d f40411b;

    /* renamed from: c  reason: collision with root package name */
    private final long f40412c;

    /* renamed from: d  reason: collision with root package name */
    private final float f40413d;

    /* renamed from: e  reason: collision with root package name */
    private final float f40414e;

    /* renamed from: f  reason: collision with root package name */
    private final List<s1.h> f40415f;

    private w(v vVar, d dVar, long j11) {
        this.f40410a = vVar;
        this.f40411b = dVar;
        this.f40412c = j11;
        this.f40413d = dVar.f();
        this.f40414e = dVar.j();
        this.f40415f = dVar.w();
    }

    public /* synthetic */ w(v vVar, d dVar, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(vVar, dVar, j11);
    }

    public static /* synthetic */ int o(w wVar, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return wVar.n(i11, z11);
    }

    public final long A() {
        return this.f40412c;
    }

    public final long B(int i11) {
        return this.f40411b.y(i11);
    }

    public final w a(v layoutInput, long j11) {
        kotlin.jvm.internal.s.g(layoutInput, "layoutInput");
        return new w(layoutInput, this.f40411b, j11, null);
    }

    public final w2.c b(int i11) {
        return this.f40411b.b(i11);
    }

    public final s1.h c(int i11) {
        return this.f40411b.c(i11);
    }

    public final s1.h d(int i11) {
        return this.f40411b.d(i11);
    }

    public final boolean e() {
        return this.f40411b.e() || ((float) x2.o.f(A())) < this.f40411b.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (kotlin.jvm.internal.s.c(this.f40410a, wVar.f40410a) && kotlin.jvm.internal.s.c(this.f40411b, wVar.f40411b) && x2.o.e(A(), wVar.A())) {
                if (this.f40413d == wVar.f40413d) {
                    return ((this.f40414e > wVar.f40414e ? 1 : (this.f40414e == wVar.f40414e ? 0 : -1)) == 0) && kotlin.jvm.internal.s.c(this.f40415f, wVar.f40415f);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean f() {
        return ((float) x2.o.g(A())) < this.f40411b.x();
    }

    public final float g() {
        return this.f40413d;
    }

    public final boolean h() {
        return f() || e();
    }

    public int hashCode() {
        return (((((((((this.f40410a.hashCode() * 31) + this.f40411b.hashCode()) * 31) + x2.o.h(A())) * 31) + Float.hashCode(this.f40413d)) * 31) + Float.hashCode(this.f40414e)) * 31) + this.f40415f.hashCode();
    }

    public final float i(int i11, boolean z11) {
        return this.f40411b.h(i11, z11);
    }

    public final float j() {
        return this.f40414e;
    }

    public final v k() {
        return this.f40410a;
    }

    public final float l(int i11) {
        return this.f40411b.k(i11);
    }

    public final int m() {
        return this.f40411b.l();
    }

    public final int n(int i11, boolean z11) {
        return this.f40411b.m(i11, z11);
    }

    public final int p(int i11) {
        return this.f40411b.n(i11);
    }

    public final int q(float f11) {
        return this.f40411b.o(f11);
    }

    public final float r(int i11) {
        return this.f40411b.p(i11);
    }

    public final float s(int i11) {
        return this.f40411b.q(i11);
    }

    public final int t(int i11) {
        return this.f40411b.r(i11);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f40410a + ", multiParagraph=" + this.f40411b + ", size=" + ((Object) x2.o.i(A())) + ", firstBaseline=" + this.f40413d + ", lastBaseline=" + this.f40414e + ", placeholderRects=" + this.f40415f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final float u(int i11) {
        return this.f40411b.s(i11);
    }

    public final d v() {
        return this.f40411b;
    }

    public final int w(long j11) {
        return this.f40411b.t(j11);
    }

    public final w2.c x(int i11) {
        return this.f40411b.u(i11);
    }

    public final q0 y(int i11, int i12) {
        return this.f40411b.v(i11, i12);
    }

    public final List<s1.h> z() {
        return this.f40415f;
    }
}