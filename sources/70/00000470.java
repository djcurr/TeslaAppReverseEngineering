package androidx.compose.ui.platform;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    private long f2900a;

    /* renamed from: b  reason: collision with root package name */
    private long f2901b;

    /* renamed from: c  reason: collision with root package name */
    private r2.l f2902c;

    /* renamed from: d  reason: collision with root package name */
    private r2.j f2903d;

    /* renamed from: e  reason: collision with root package name */
    private r2.k f2904e;

    /* renamed from: f  reason: collision with root package name */
    private r2.e f2905f;

    /* renamed from: g  reason: collision with root package name */
    private String f2906g;

    /* renamed from: h  reason: collision with root package name */
    private long f2907h;

    /* renamed from: i  reason: collision with root package name */
    private w2.a f2908i;

    /* renamed from: j  reason: collision with root package name */
    private w2.g f2909j;

    /* renamed from: k  reason: collision with root package name */
    private t2.f f2910k;

    /* renamed from: l  reason: collision with root package name */
    private long f2911l;

    /* renamed from: m  reason: collision with root package name */
    private w2.e f2912m;

    /* renamed from: n  reason: collision with root package name */
    private t1.a1 f2913n;

    private e1(long j11, long j12, r2.l lVar, r2.j jVar, r2.k kVar, r2.e eVar, String str, long j13, w2.a aVar, w2.g gVar, t2.f fVar, long j14, w2.e eVar2, t1.a1 a1Var) {
        this.f2900a = j11;
        this.f2901b = j12;
        this.f2902c = lVar;
        this.f2903d = jVar;
        this.f2904e = kVar;
        this.f2905f = eVar;
        this.f2906g = str;
        this.f2907h = j13;
        this.f2908i = aVar;
        this.f2909j = gVar;
        this.f2910k = fVar;
        this.f2911l = j14;
        this.f2912m = eVar2;
        this.f2913n = a1Var;
    }

    public /* synthetic */ e1(long j11, long j12, r2.l lVar, r2.j jVar, r2.k kVar, r2.e eVar, String str, long j13, w2.a aVar, w2.g gVar, t2.f fVar, long j14, w2.e eVar2, t1.a1 a1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, lVar, jVar, kVar, eVar, str, j13, aVar, gVar, fVar, j14, eVar2, a1Var);
    }

    public final long a() {
        return this.f2911l;
    }

    public final w2.a b() {
        return this.f2908i;
    }

    public final long c() {
        return this.f2900a;
    }

    public final long d() {
        return this.f2901b;
    }

    public final r2.j e() {
        return this.f2903d;
    }

    public final r2.k f() {
        return this.f2904e;
    }

    public final long g() {
        return this.f2907h;
    }

    public final void h(long j11) {
        this.f2911l = j11;
    }

    public final void i(w2.a aVar) {
        this.f2908i = aVar;
    }

    public final void j(long j11) {
        this.f2900a = j11;
    }

    public final void k(String str) {
        this.f2906g = str;
    }

    public final void l(long j11) {
        this.f2901b = j11;
    }

    public final void m(r2.j jVar) {
        this.f2903d = jVar;
    }

    public final void n(r2.k kVar) {
        this.f2904e = kVar;
    }

    public final void o(r2.l lVar) {
        this.f2902c = lVar;
    }

    public final void p(long j11) {
        this.f2907h = j11;
    }

    public final void q(t1.a1 a1Var) {
        this.f2913n = a1Var;
    }

    public final void r(w2.e eVar) {
        this.f2912m = eVar;
    }

    public final void s(w2.g gVar) {
        this.f2909j = gVar;
    }

    public final n2.s t() {
        return new n2.s(c(), d(), this.f2902c, e(), f(), this.f2905f, this.f2906g, g(), b(), this.f2909j, this.f2910k, a(), this.f2912m, this.f2913n, null);
    }

    public /* synthetic */ e1(long j11, long j12, r2.l lVar, r2.j jVar, r2.k kVar, r2.e eVar, String str, long j13, w2.a aVar, w2.g gVar, t2.f fVar, long j14, w2.e eVar2, t1.a1 a1Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? t1.a0.f51365b.f() : j11, (i11 & 2) != 0 ? x2.r.f56957b.a() : j12, (i11 & 4) != 0 ? null : lVar, (i11 & 8) != 0 ? null : jVar, (i11 & 16) != 0 ? null : kVar, (i11 & 32) != 0 ? null : eVar, (i11 & 64) != 0 ? null : str, (i11 & 128) != 0 ? x2.r.f56957b.a() : j13, (i11 & 256) != 0 ? null : aVar, (i11 & 512) != 0 ? null : gVar, (i11 & 1024) != 0 ? null : fVar, (i11 & 2048) != 0 ? t1.a0.f51365b.f() : j14, (i11 & 4096) != 0 ? null : eVar2, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : a1Var, null);
    }
}