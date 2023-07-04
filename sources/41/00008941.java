package n2;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import t1.a1;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: s */
    public static final a f40262s = new a(null);

    /* renamed from: t */
    private static final a0 f40263t = new a0(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, 0, null, 262143, null);

    /* renamed from: a */
    private final long f40264a;

    /* renamed from: b */
    private final long f40265b;

    /* renamed from: c */
    private final r2.l f40266c;

    /* renamed from: d */
    private final r2.j f40267d;

    /* renamed from: e */
    private final r2.k f40268e;

    /* renamed from: f */
    private final r2.e f40269f;

    /* renamed from: g */
    private final String f40270g;

    /* renamed from: h */
    private final long f40271h;

    /* renamed from: i */
    private final w2.a f40272i;

    /* renamed from: j */
    private final w2.g f40273j;

    /* renamed from: k */
    private final t2.f f40274k;

    /* renamed from: l */
    private final long f40275l;

    /* renamed from: m */
    private final w2.e f40276m;

    /* renamed from: n */
    private final a1 f40277n;

    /* renamed from: o */
    private final w2.d f40278o;

    /* renamed from: p */
    private final w2.f f40279p;

    /* renamed from: q */
    private final long f40280q;

    /* renamed from: r */
    private final w2.i f40281r;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a0 a() {
            return a0.f40263t;
        }
    }

    private a0(long j11, long j12, r2.l lVar, r2.j jVar, r2.k kVar, r2.e eVar, String str, long j13, w2.a aVar, w2.g gVar, t2.f fVar, long j14, w2.e eVar2, a1 a1Var, w2.d dVar, w2.f fVar2, long j15, w2.i iVar) {
        this.f40264a = j11;
        this.f40265b = j12;
        this.f40266c = lVar;
        this.f40267d = jVar;
        this.f40268e = kVar;
        this.f40269f = eVar;
        this.f40270g = str;
        this.f40271h = j13;
        this.f40272i = aVar;
        this.f40273j = gVar;
        this.f40274k = fVar;
        this.f40275l = j14;
        this.f40276m = eVar2;
        this.f40277n = a1Var;
        this.f40278o = dVar;
        this.f40279p = fVar2;
        this.f40280q = j15;
        this.f40281r = iVar;
        if (x2.s.g(n())) {
            return;
        }
        if (x2.r.h(n()) >= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + x2.r.h(n()) + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public /* synthetic */ a0(long j11, long j12, r2.l lVar, r2.j jVar, r2.k kVar, r2.e eVar, String str, long j13, w2.a aVar, w2.g gVar, t2.f fVar, long j14, w2.e eVar2, a1 a1Var, w2.d dVar, w2.f fVar2, long j15, w2.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, lVar, jVar, kVar, eVar, str, j13, aVar, gVar, fVar, j14, eVar2, a1Var, dVar, fVar2, j15, iVar);
    }

    public static /* synthetic */ a0 c(a0 a0Var, long j11, long j12, r2.l lVar, r2.j jVar, r2.k kVar, r2.e eVar, String str, long j13, w2.a aVar, w2.g gVar, t2.f fVar, long j14, w2.e eVar2, a1 a1Var, w2.d dVar, w2.f fVar2, long j15, w2.i iVar, int i11, Object obj) {
        return a0Var.b((i11 & 1) != 0 ? a0Var.f() : j11, (i11 & 2) != 0 ? a0Var.i() : j12, (i11 & 4) != 0 ? a0Var.f40266c : lVar, (i11 & 8) != 0 ? a0Var.j() : jVar, (i11 & 16) != 0 ? a0Var.k() : kVar, (i11 & 32) != 0 ? a0Var.f40269f : eVar, (i11 & 64) != 0 ? a0Var.f40270g : str, (i11 & 128) != 0 ? a0Var.m() : j13, (i11 & 256) != 0 ? a0Var.e() : aVar, (i11 & 512) != 0 ? a0Var.f40273j : gVar, (i11 & 1024) != 0 ? a0Var.f40274k : fVar, (i11 & 2048) != 0 ? a0Var.d() : j14, (i11 & 4096) != 0 ? a0Var.f40276m : eVar2, (i11 & PKIFailureInfo.certRevoked) != 0 ? a0Var.f40277n : a1Var, (i11 & 16384) != 0 ? a0Var.q() : dVar, (i11 & 32768) != 0 ? a0Var.s() : fVar2, (i11 & 65536) != 0 ? a0Var.n() : j15, (i11 & 131072) != 0 ? a0Var.f40281r : iVar);
    }

    public final a0 b(long j11, long j12, r2.l lVar, r2.j jVar, r2.k kVar, r2.e eVar, String str, long j13, w2.a aVar, w2.g gVar, t2.f fVar, long j14, w2.e eVar2, a1 a1Var, w2.d dVar, w2.f fVar2, long j15, w2.i iVar) {
        return new a0(j11, j12, lVar, jVar, kVar, eVar, str, j13, aVar, gVar, fVar, j14, eVar2, a1Var, dVar, fVar2, j15, iVar, null);
    }

    public final long d() {
        return this.f40275l;
    }

    public final w2.a e() {
        return this.f40272i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return t1.a0.n(f(), a0Var.f()) && x2.r.e(i(), a0Var.i()) && kotlin.jvm.internal.s.c(this.f40266c, a0Var.f40266c) && kotlin.jvm.internal.s.c(j(), a0Var.j()) && kotlin.jvm.internal.s.c(k(), a0Var.k()) && kotlin.jvm.internal.s.c(this.f40269f, a0Var.f40269f) && kotlin.jvm.internal.s.c(this.f40270g, a0Var.f40270g) && x2.r.e(m(), a0Var.m()) && kotlin.jvm.internal.s.c(e(), a0Var.e()) && kotlin.jvm.internal.s.c(this.f40273j, a0Var.f40273j) && kotlin.jvm.internal.s.c(this.f40274k, a0Var.f40274k) && t1.a0.n(d(), a0Var.d()) && kotlin.jvm.internal.s.c(this.f40276m, a0Var.f40276m) && kotlin.jvm.internal.s.c(this.f40277n, a0Var.f40277n) && kotlin.jvm.internal.s.c(q(), a0Var.q()) && kotlin.jvm.internal.s.c(s(), a0Var.s()) && x2.r.e(n(), a0Var.n()) && kotlin.jvm.internal.s.c(this.f40281r, a0Var.f40281r);
        }
        return false;
    }

    public final long f() {
        return this.f40264a;
    }

    public final r2.e g() {
        return this.f40269f;
    }

    public final String h() {
        return this.f40270g;
    }

    public int hashCode() {
        int t11 = ((t1.a0.t(f()) * 31) + x2.r.i(i())) * 31;
        r2.l lVar = this.f40266c;
        int hashCode = (t11 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        r2.j j11 = j();
        int g11 = (hashCode + (j11 == null ? 0 : r2.j.g(j11.i()))) * 31;
        r2.k k11 = k();
        int i11 = (g11 + (k11 == null ? 0 : r2.k.i(k11.m()))) * 31;
        r2.e eVar = this.f40269f;
        int hashCode2 = (i11 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str = this.f40270g;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + x2.r.i(m())) * 31;
        w2.a e11 = e();
        int f11 = (hashCode3 + (e11 == null ? 0 : w2.a.f(e11.h()))) * 31;
        w2.g gVar = this.f40273j;
        int hashCode4 = (f11 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        t2.f fVar = this.f40274k;
        int hashCode5 = (((hashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31) + t1.a0.t(d())) * 31;
        w2.e eVar2 = this.f40276m;
        int hashCode6 = (hashCode5 + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        a1 a1Var = this.f40277n;
        int hashCode7 = (hashCode6 + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        w2.d q11 = q();
        int k12 = (hashCode7 + (q11 == null ? 0 : w2.d.k(q11.m()))) * 31;
        w2.f s11 = s();
        int j12 = (((k12 + (s11 == null ? 0 : w2.f.j(s11.l()))) * 31) + x2.r.i(n())) * 31;
        w2.i iVar = this.f40281r;
        return j12 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final long i() {
        return this.f40265b;
    }

    public final r2.j j() {
        return this.f40267d;
    }

    public final r2.k k() {
        return this.f40268e;
    }

    public final r2.l l() {
        return this.f40266c;
    }

    public final long m() {
        return this.f40271h;
    }

    public final long n() {
        return this.f40280q;
    }

    public final t2.f o() {
        return this.f40274k;
    }

    public final a1 p() {
        return this.f40277n;
    }

    public final w2.d q() {
        return this.f40278o;
    }

    public final w2.e r() {
        return this.f40276m;
    }

    public final w2.f s() {
        return this.f40279p;
    }

    public final w2.g t() {
        return this.f40273j;
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) t1.a0.u(f())) + ", fontSize=" + ((Object) x2.r.j(i())) + ", fontWeight=" + this.f40266c + ", fontStyle=" + j() + ", fontSynthesis=" + k() + ", fontFamily=" + this.f40269f + ", fontFeatureSettings=" + ((Object) this.f40270g) + ", letterSpacing=" + ((Object) x2.r.j(m())) + ", baselineShift=" + e() + ", textGeometricTransform=" + this.f40273j + ", localeList=" + this.f40274k + ", background=" + ((Object) t1.a0.u(d())) + ", textDecoration=" + this.f40276m + ", shadow=" + this.f40277n + ", textAlign=" + q() + ", textDirection=" + s() + ", lineHeight=" + ((Object) x2.r.j(n())) + ", textIndent=" + this.f40281r + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final w2.i u() {
        return this.f40281r;
    }

    public final a0 v(n other) {
        kotlin.jvm.internal.s.g(other, "other");
        return new a0(y(), x().g(other));
    }

    public final a0 w(a0 a0Var) {
        return (a0Var == null || kotlin.jvm.internal.s.c(a0Var, f40263t)) ? this : new a0(y().o(a0Var.y()), x().g(a0Var.x()));
    }

    public final n x() {
        return new n(q(), s(), n(), this.f40281r, null);
    }

    public final s y() {
        return new s(f(), i(), this.f40266c, j(), k(), this.f40269f, this.f40270g, m(), e(), this.f40273j, this.f40274k, d(), this.f40276m, this.f40277n, null);
    }

    public /* synthetic */ a0(long j11, long j12, r2.l lVar, r2.j jVar, r2.k kVar, r2.e eVar, String str, long j13, w2.a aVar, w2.g gVar, t2.f fVar, long j14, w2.e eVar2, a1 a1Var, w2.d dVar, w2.f fVar2, long j15, w2.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? t1.a0.f51365b.f() : j11, (i11 & 2) != 0 ? x2.r.f56957b.a() : j12, (i11 & 4) != 0 ? null : lVar, (i11 & 8) != 0 ? null : jVar, (i11 & 16) != 0 ? null : kVar, (i11 & 32) != 0 ? null : eVar, (i11 & 64) != 0 ? null : str, (i11 & 128) != 0 ? x2.r.f56957b.a() : j13, (i11 & 256) != 0 ? null : aVar, (i11 & 512) != 0 ? null : gVar, (i11 & 1024) != 0 ? null : fVar, (i11 & 2048) != 0 ? t1.a0.f51365b.f() : j14, (i11 & 4096) != 0 ? null : eVar2, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : a1Var, (i11 & 16384) != 0 ? null : dVar, (i11 & 32768) != 0 ? null : fVar2, (i11 & 65536) != 0 ? x2.r.f56957b.a() : j15, (i11 & 131072) != 0 ? null : iVar, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(s spanStyle, n paragraphStyle) {
        this(spanStyle.c(), spanStyle.f(), spanStyle.i(), spanStyle.g(), spanStyle.h(), spanStyle.d(), spanStyle.e(), spanStyle.j(), spanStyle.b(), spanStyle.n(), spanStyle.k(), spanStyle.a(), spanStyle.m(), spanStyle.l(), paragraphStyle.d(), paragraphStyle.e(), paragraphStyle.c(), paragraphStyle.f(), null);
        kotlin.jvm.internal.s.g(spanStyle, "spanStyle");
        kotlin.jvm.internal.s.g(paragraphStyle, "paragraphStyle");
    }
}