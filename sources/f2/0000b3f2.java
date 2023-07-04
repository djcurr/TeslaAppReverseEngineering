package t1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import t1.u;

/* loaded from: classes.dex */
public final class b implements u {

    /* renamed from: a  reason: collision with root package name */
    private Canvas f51379a;

    /* renamed from: b  reason: collision with root package name */
    private final vz.k f51380b;

    /* renamed from: c  reason: collision with root package name */
    private final vz.k f51381c;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<Rect> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f51382a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Rect invoke() {
            return new Rect();
        }
    }

    /* renamed from: t1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C1140b extends kotlin.jvm.internal.u implements h00.a<Rect> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1140b f51383a = new C1140b();

        C1140b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Rect invoke() {
            return new Rect();
        }
    }

    public b() {
        Canvas canvas;
        canvas = c.f51386a;
        this.f51379a = canvas;
        kotlin.b bVar = kotlin.b.NONE;
        this.f51380b = vz.l.b(bVar, C1140b.f51383a);
        this.f51381c = vz.l.b(bVar, a.f51382a);
    }

    private final Rect v() {
        return (Rect) this.f51381c.getValue();
    }

    private final Rect x() {
        return (Rect) this.f51380b.getValue();
    }

    @Override // t1.u
    public void a(float f11, float f12, float f13, float f14, int i11) {
        this.f51379a.clipRect(f11, f12, f13, f14, z(i11));
    }

    @Override // t1.u
    public void b(float f11, float f12) {
        this.f51379a.translate(f11, f12);
    }

    @Override // t1.u
    public void c(q0 path, int i11) {
        kotlin.jvm.internal.s.g(path, "path");
        Canvas canvas = this.f51379a;
        if (path instanceof j) {
            canvas.clipPath(((j) path).q(), z(i11));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // t1.u
    public void d(float f11, float f12, float f13, float f14, o0 paint) {
        kotlin.jvm.internal.s.g(paint, "paint");
        this.f51379a.drawRect(f11, f12, f13, f14, paint.q());
    }

    @Override // t1.u
    public void e(float f11, float f12) {
        this.f51379a.scale(f11, f12);
    }

    @Override // t1.u
    public void f(float f11, float f12, float f13, float f14, float f15, float f16, boolean z11, o0 paint) {
        kotlin.jvm.internal.s.g(paint, "paint");
        this.f51379a.drawArc(f11, f12, f13, f14, f15, f16, z11, paint.q());
    }

    @Override // t1.u
    public void g(s1.h hVar, int i11) {
        u.a.c(this, hVar, i11);
    }

    @Override // t1.u
    public void h() {
        this.f51379a.restore();
    }

    @Override // t1.u
    public void i() {
        x.f51515a.a(this.f51379a, true);
    }

    @Override // t1.u
    public void j(long j11, long j12, o0 paint) {
        kotlin.jvm.internal.s.g(paint, "paint");
        this.f51379a.drawLine(s1.f.l(j11), s1.f.m(j11), s1.f.l(j12), s1.f.m(j12), paint.q());
    }

    @Override // t1.u
    public void k(float f11) {
        this.f51379a.rotate(f11);
    }

    @Override // t1.u
    public void l(h0 image, long j11, long j12, long j13, long j14, o0 paint) {
        kotlin.jvm.internal.s.g(image, "image");
        kotlin.jvm.internal.s.g(paint, "paint");
        Canvas canvas = this.f51379a;
        Bitmap b11 = f.b(image);
        Rect x11 = x();
        x11.left = x2.k.h(j11);
        x11.top = x2.k.i(j11);
        x11.right = x2.k.h(j11) + x2.o.g(j12);
        x11.bottom = x2.k.i(j11) + x2.o.f(j12);
        vz.b0 b0Var = vz.b0.f54756a;
        Rect v11 = v();
        v11.left = x2.k.h(j13);
        v11.top = x2.k.i(j13);
        v11.right = x2.k.h(j13) + x2.o.g(j14);
        v11.bottom = x2.k.i(j13) + x2.o.f(j14);
        canvas.drawBitmap(b11, x11, v11, paint.q());
    }

    @Override // t1.u
    public void m() {
        this.f51379a.save();
    }

    @Override // t1.u
    public void n() {
        x.f51515a.a(this.f51379a, false);
    }

    @Override // t1.u
    public void o(long j11, float f11, o0 paint) {
        kotlin.jvm.internal.s.g(paint, "paint");
        this.f51379a.drawCircle(s1.f.l(j11), s1.f.m(j11), f11, paint.q());
    }

    @Override // t1.u
    public void p(s1.h hVar, o0 o0Var) {
        u.a.e(this, hVar, o0Var);
    }

    @Override // t1.u
    public void q(float[] matrix) {
        kotlin.jvm.internal.s.g(matrix, "matrix");
        if (l0.a(matrix)) {
            return;
        }
        Matrix matrix2 = new Matrix();
        g.a(matrix2, matrix);
        this.f51379a.concat(matrix2);
    }

    @Override // t1.u
    public void r(float f11, float f12, float f13, float f14, float f15, float f16, o0 paint) {
        kotlin.jvm.internal.s.g(paint, "paint");
        this.f51379a.drawRoundRect(f11, f12, f13, f14, f15, f16, paint.q());
    }

    @Override // t1.u
    public void s(h0 image, long j11, o0 paint) {
        kotlin.jvm.internal.s.g(image, "image");
        kotlin.jvm.internal.s.g(paint, "paint");
        this.f51379a.drawBitmap(f.b(image), s1.f.l(j11), s1.f.m(j11), paint.q());
    }

    @Override // t1.u
    public void t(q0 path, o0 paint) {
        kotlin.jvm.internal.s.g(path, "path");
        kotlin.jvm.internal.s.g(paint, "paint");
        Canvas canvas = this.f51379a;
        if (path instanceof j) {
            canvas.drawPath(((j) path).q(), paint.q());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // t1.u
    public void u(s1.h bounds, o0 paint) {
        kotlin.jvm.internal.s.g(bounds, "bounds");
        kotlin.jvm.internal.s.g(paint, "paint");
        this.f51379a.saveLayer(bounds.i(), bounds.l(), bounds.j(), bounds.e(), paint.q(), 31);
    }

    public final Canvas w() {
        return this.f51379a;
    }

    public final void y(Canvas canvas) {
        kotlin.jvm.internal.s.g(canvas, "<set-?>");
        this.f51379a = canvas;
    }

    public final Region.Op z(int i11) {
        return z.d(i11, z.f51535a.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }
}