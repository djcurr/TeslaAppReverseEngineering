package n2;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import t1.a0;
import t1.a1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final long f40386a;

    /* renamed from: b  reason: collision with root package name */
    private final long f40387b;

    /* renamed from: c  reason: collision with root package name */
    private final r2.l f40388c;

    /* renamed from: d  reason: collision with root package name */
    private final r2.j f40389d;

    /* renamed from: e  reason: collision with root package name */
    private final r2.k f40390e;

    /* renamed from: f  reason: collision with root package name */
    private final r2.e f40391f;

    /* renamed from: g  reason: collision with root package name */
    private final String f40392g;

    /* renamed from: h  reason: collision with root package name */
    private final long f40393h;

    /* renamed from: i  reason: collision with root package name */
    private final w2.a f40394i;

    /* renamed from: j  reason: collision with root package name */
    private final w2.g f40395j;

    /* renamed from: k  reason: collision with root package name */
    private final t2.f f40396k;

    /* renamed from: l  reason: collision with root package name */
    private final long f40397l;

    /* renamed from: m  reason: collision with root package name */
    private final w2.e f40398m;

    /* renamed from: n  reason: collision with root package name */
    private final a1 f40399n;

    private s(long j11, long j12, r2.l lVar, r2.j jVar, r2.k kVar, r2.e eVar, String str, long j13, w2.a aVar, w2.g gVar, t2.f fVar, long j14, w2.e eVar2, a1 a1Var) {
        this.f40386a = j11;
        this.f40387b = j12;
        this.f40388c = lVar;
        this.f40389d = jVar;
        this.f40390e = kVar;
        this.f40391f = eVar;
        this.f40392g = str;
        this.f40393h = j13;
        this.f40394i = aVar;
        this.f40395j = gVar;
        this.f40396k = fVar;
        this.f40397l = j14;
        this.f40398m = eVar2;
        this.f40399n = a1Var;
    }

    public /* synthetic */ s(long j11, long j12, r2.l lVar, r2.j jVar, r2.k kVar, r2.e eVar, String str, long j13, w2.a aVar, w2.g gVar, t2.f fVar, long j14, w2.e eVar2, a1 a1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, lVar, jVar, kVar, eVar, str, j13, aVar, gVar, fVar, j14, eVar2, a1Var);
    }

    public final long a() {
        return this.f40397l;
    }

    public final w2.a b() {
        return this.f40394i;
    }

    public final long c() {
        return this.f40386a;
    }

    public final r2.e d() {
        return this.f40391f;
    }

    public final String e() {
        return this.f40392g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return t1.a0.n(c(), sVar.c()) && x2.r.e(f(), sVar.f()) && kotlin.jvm.internal.s.c(this.f40388c, sVar.f40388c) && kotlin.jvm.internal.s.c(g(), sVar.g()) && kotlin.jvm.internal.s.c(h(), sVar.h()) && kotlin.jvm.internal.s.c(this.f40391f, sVar.f40391f) && kotlin.jvm.internal.s.c(this.f40392g, sVar.f40392g) && x2.r.e(j(), sVar.j()) && kotlin.jvm.internal.s.c(b(), sVar.b()) && kotlin.jvm.internal.s.c(this.f40395j, sVar.f40395j) && kotlin.jvm.internal.s.c(this.f40396k, sVar.f40396k) && t1.a0.n(a(), sVar.a()) && kotlin.jvm.internal.s.c(this.f40398m, sVar.f40398m) && kotlin.jvm.internal.s.c(this.f40399n, sVar.f40399n);
        }
        return false;
    }

    public final long f() {
        return this.f40387b;
    }

    public final r2.j g() {
        return this.f40389d;
    }

    public final r2.k h() {
        return this.f40390e;
    }

    public int hashCode() {
        int t11 = ((t1.a0.t(c()) * 31) + x2.r.i(f())) * 31;
        r2.l lVar = this.f40388c;
        int hashCode = (t11 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        r2.j g11 = g();
        int g12 = (hashCode + (g11 == null ? 0 : r2.j.g(g11.i()))) * 31;
        r2.k h11 = h();
        int i11 = (g12 + (h11 == null ? 0 : r2.k.i(h11.m()))) * 31;
        r2.e eVar = this.f40391f;
        int hashCode2 = (i11 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str = this.f40392g;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + x2.r.i(j())) * 31;
        w2.a b11 = b();
        int f11 = (hashCode3 + (b11 == null ? 0 : w2.a.f(b11.h()))) * 31;
        w2.g gVar = this.f40395j;
        int hashCode4 = (f11 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        t2.f fVar = this.f40396k;
        int hashCode5 = (((hashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31) + t1.a0.t(a())) * 31;
        w2.e eVar2 = this.f40398m;
        int hashCode6 = (hashCode5 + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        a1 a1Var = this.f40399n;
        return hashCode6 + (a1Var != null ? a1Var.hashCode() : 0);
    }

    public final r2.l i() {
        return this.f40388c;
    }

    public final long j() {
        return this.f40393h;
    }

    public final t2.f k() {
        return this.f40396k;
    }

    public final a1 l() {
        return this.f40399n;
    }

    public final w2.e m() {
        return this.f40398m;
    }

    public final w2.g n() {
        return this.f40395j;
    }

    public final s o(s sVar) {
        long j11;
        if (sVar == null) {
            return this;
        }
        long c11 = sVar.c();
        a0.a aVar = t1.a0.f51365b;
        if (!(c11 != aVar.f())) {
            c11 = c();
        }
        long j12 = c11;
        r2.e eVar = sVar.f40391f;
        if (eVar == null) {
            eVar = this.f40391f;
        }
        r2.e eVar2 = eVar;
        long f11 = !x2.s.g(sVar.f()) ? sVar.f() : f();
        r2.l lVar = sVar.f40388c;
        if (lVar == null) {
            lVar = this.f40388c;
        }
        r2.l lVar2 = lVar;
        r2.j g11 = sVar.g();
        if (g11 == null) {
            g11 = g();
        }
        r2.j jVar = g11;
        r2.k h11 = sVar.h();
        if (h11 == null) {
            h11 = h();
        }
        r2.k kVar = h11;
        String str = sVar.f40392g;
        if (str == null) {
            str = this.f40392g;
        }
        String str2 = str;
        if (!x2.s.g(sVar.j())) {
            j11 = sVar.j();
        } else {
            j11 = j();
        }
        long j13 = j11;
        w2.a b11 = sVar.b();
        if (b11 == null) {
            b11 = b();
        }
        w2.a aVar2 = b11;
        w2.g gVar = sVar.f40395j;
        if (gVar == null) {
            gVar = this.f40395j;
        }
        w2.g gVar2 = gVar;
        t2.f fVar = sVar.f40396k;
        if (fVar == null) {
            fVar = this.f40396k;
        }
        t2.f fVar2 = fVar;
        long a11 = sVar.a();
        if (!(a11 != aVar.f())) {
            a11 = a();
        }
        long j14 = a11;
        w2.e eVar3 = sVar.f40398m;
        if (eVar3 == null) {
            eVar3 = this.f40398m;
        }
        w2.e eVar4 = eVar3;
        a1 a1Var = sVar.f40399n;
        if (a1Var == null) {
            a1Var = this.f40399n;
        }
        return new s(j12, f11, lVar2, jVar, kVar, eVar2, str2, j13, aVar2, gVar2, fVar2, j14, eVar4, a1Var, null);
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) t1.a0.u(c())) + ", fontSize=" + ((Object) x2.r.j(f())) + ", fontWeight=" + this.f40388c + ", fontStyle=" + g() + ", fontSynthesis=" + h() + ", fontFamily=" + this.f40391f + ", fontFeatureSettings=" + ((Object) this.f40392g) + ", letterSpacing=" + ((Object) x2.r.j(j())) + ", baselineShift=" + b() + ", textGeometricTransform=" + this.f40395j + ", localeList=" + this.f40396k + ", background=" + ((Object) t1.a0.u(a())) + ", textDecoration=" + this.f40398m + ", shadow=" + this.f40399n + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ s(long j11, long j12, r2.l lVar, r2.j jVar, r2.k kVar, r2.e eVar, String str, long j13, w2.a aVar, w2.g gVar, t2.f fVar, long j14, w2.e eVar2, a1 a1Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? t1.a0.f51365b.f() : j11, (i11 & 2) != 0 ? x2.r.f56957b.a() : j12, (i11 & 4) != 0 ? null : lVar, (i11 & 8) != 0 ? null : jVar, (i11 & 16) != 0 ? null : kVar, (i11 & 32) != 0 ? null : eVar, (i11 & 64) != 0 ? null : str, (i11 & 128) != 0 ? x2.r.f56957b.a() : j13, (i11 & 256) != 0 ? null : aVar, (i11 & 512) != 0 ? null : gVar, (i11 & 1024) != 0 ? null : fVar, (i11 & 2048) != 0 ? t1.a0.f51365b.f() : j14, (i11 & 4096) != 0 ? null : eVar2, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : a1Var, null);
    }
}