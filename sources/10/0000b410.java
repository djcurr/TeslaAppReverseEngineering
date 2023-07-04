package t1;

import android.graphics.Paint;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class h implements o0 {

    /* renamed from: a  reason: collision with root package name */
    private Paint f51439a = i.i();

    /* renamed from: b  reason: collision with root package name */
    private int f51440b = p.f51470a.B();

    /* renamed from: c  reason: collision with root package name */
    private Shader f51441c;

    /* renamed from: d  reason: collision with root package name */
    private b0 f51442d;

    /* renamed from: e  reason: collision with root package name */
    private r0 f51443e;

    @Override // t1.o0
    public long a() {
        return i.c(this.f51439a);
    }

    @Override // t1.o0
    public void b(float f11) {
        i.j(this.f51439a, f11);
    }

    @Override // t1.o0
    public void c(int i11) {
        i.q(this.f51439a, i11);
    }

    @Override // t1.o0
    public void d(int i11) {
        this.f51440b = i11;
        i.k(this.f51439a, i11);
    }

    @Override // t1.o0
    public b0 e() {
        return this.f51442d;
    }

    @Override // t1.o0
    public void f(b0 b0Var) {
        this.f51442d = b0Var;
        i.m(this.f51439a, b0Var);
    }

    @Override // t1.o0
    public void g(int i11) {
        i.n(this.f51439a, i11);
    }

    @Override // t1.o0
    public float h() {
        return i.b(this.f51439a);
    }

    @Override // t1.o0
    public int i() {
        return i.e(this.f51439a);
    }

    @Override // t1.o0
    public void j(int i11) {
        i.r(this.f51439a, i11);
    }

    @Override // t1.o0
    public void k(r0 r0Var) {
        i.o(this.f51439a, r0Var);
        this.f51443e = r0Var;
    }

    @Override // t1.o0
    public void l(long j11) {
        i.l(this.f51439a, j11);
    }

    @Override // t1.o0
    public r0 m() {
        return this.f51443e;
    }

    @Override // t1.o0
    public int n() {
        return this.f51440b;
    }

    @Override // t1.o0
    public int o() {
        return i.f(this.f51439a);
    }

    @Override // t1.o0
    public float p() {
        return i.g(this.f51439a);
    }

    @Override // t1.o0
    public Paint q() {
        return this.f51439a;
    }

    @Override // t1.o0
    public void r(Shader shader) {
        this.f51441c = shader;
        i.p(this.f51439a, shader);
    }

    @Override // t1.o0
    public Shader s() {
        return this.f51441c;
    }

    @Override // t1.o0
    public void t(float f11) {
        i.s(this.f51439a, f11);
    }

    @Override // t1.o0
    public int u() {
        return i.d(this.f51439a);
    }

    @Override // t1.o0
    public void v(int i11) {
        i.u(this.f51439a, i11);
    }

    @Override // t1.o0
    public void w(float f11) {
        i.t(this.f51439a, f11);
    }

    @Override // t1.o0
    public float x() {
        return i.h(this.f51439a);
    }
}