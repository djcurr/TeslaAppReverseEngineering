package t1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import t1.g0;

/* loaded from: classes.dex */
public final class y0 implements g0 {

    /* renamed from: d  reason: collision with root package name */
    private float f51523d;

    /* renamed from: e  reason: collision with root package name */
    private float f51524e;

    /* renamed from: f  reason: collision with root package name */
    private float f51525f;

    /* renamed from: g  reason: collision with root package name */
    private float f51526g;

    /* renamed from: h  reason: collision with root package name */
    private float f51527h;

    /* renamed from: i  reason: collision with root package name */
    private float f51528i;

    /* renamed from: m  reason: collision with root package name */
    private boolean f51532m;

    /* renamed from: o  reason: collision with root package name */
    private x0 f51534o;

    /* renamed from: a  reason: collision with root package name */
    private float f51520a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    private float f51521b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    private float f51522c = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    private float f51529j = 8.0f;

    /* renamed from: k  reason: collision with root package name */
    private long f51530k = h1.f51446b.a();

    /* renamed from: l  reason: collision with root package name */
    private c1 f51531l = w0.a();

    /* renamed from: n  reason: collision with root package name */
    private x2.d f51533n = x2.f.b(1.0f, BitmapDescriptorFactory.HUE_RED, 2, null);

    @Override // t1.g0
    public void B(boolean z11) {
        this.f51532m = z11;
    }

    public float C() {
        return this.f51520a;
    }

    public float D() {
        return this.f51521b;
    }

    @Override // x2.d
    public int G(float f11) {
        return g0.a.b(this, f11);
    }

    @Override // t1.g0
    public void H(long j11) {
        this.f51530k = j11;
    }

    public float J() {
        return this.f51525f;
    }

    public c1 L() {
        return this.f51531l;
    }

    @Override // x2.d
    public float M(long j11) {
        return g0.a.d(this, j11);
    }

    @Override // t1.g0
    public void Q(float f11) {
        this.f51525f = f11;
    }

    public long S() {
        return this.f51530k;
    }

    public float T() {
        return this.f51523d;
    }

    public float U() {
        return this.f51524e;
    }

    public final void X() {
        f(1.0f);
        m(1.0f);
        b(1.0f);
        n(BitmapDescriptorFactory.HUE_RED);
        d(BitmapDescriptorFactory.HUE_RED);
        Q(BitmapDescriptorFactory.HUE_RED);
        j(BitmapDescriptorFactory.HUE_RED);
        k(BitmapDescriptorFactory.HUE_RED);
        l(BitmapDescriptorFactory.HUE_RED);
        i(8.0f);
        H(h1.f51446b.a());
        x(w0.a());
        B(false);
        g(null);
    }

    public final void Y(x2.d dVar) {
        kotlin.jvm.internal.s.g(dVar, "<set-?>");
        this.f51533n = dVar;
    }

    public float a() {
        return this.f51522c;
    }

    @Override // t1.g0
    public void b(float f11) {
        this.f51522c = f11;
    }

    @Override // x2.d
    public float b0(int i11) {
        return g0.a.c(this, i11);
    }

    @Override // x2.d
    public float c0() {
        return this.f51533n.c0();
    }

    @Override // t1.g0
    public void d(float f11) {
        this.f51524e = f11;
    }

    @Override // t1.g0
    public void f(float f11) {
        this.f51520a = f11;
    }

    @Override // t1.g0
    public void g(x0 x0Var) {
    }

    @Override // x2.d
    public float getDensity() {
        return this.f51533n.getDensity();
    }

    public float h() {
        return this.f51529j;
    }

    @Override // t1.g0
    public void i(float f11) {
        this.f51529j = f11;
    }

    @Override // x2.d
    public float i0(float f11) {
        return g0.a.e(this, f11);
    }

    @Override // t1.g0
    public void j(float f11) {
        this.f51526g = f11;
    }

    @Override // t1.g0
    public void k(float f11) {
        this.f51527h = f11;
    }

    @Override // t1.g0
    public void l(float f11) {
        this.f51528i = f11;
    }

    @Override // x2.d
    public int l0(long j11) {
        return g0.a.a(this, j11);
    }

    @Override // t1.g0
    public void m(float f11) {
        this.f51521b = f11;
    }

    @Override // t1.g0
    public void n(float f11) {
        this.f51523d = f11;
    }

    public boolean o() {
        return this.f51532m;
    }

    public x0 p() {
        return this.f51534o;
    }

    @Override // x2.d
    public long p0(long j11) {
        return g0.a.f(this, j11);
    }

    public float t() {
        return this.f51526g;
    }

    public float u() {
        return this.f51527h;
    }

    public float v() {
        return this.f51528i;
    }

    @Override // t1.g0
    public void x(c1 c1Var) {
        kotlin.jvm.internal.s.g(c1Var, "<set-?>");
        this.f51531l = c1Var;
    }
}