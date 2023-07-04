package t1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t1.u0;

/* loaded from: classes.dex */
public final class j implements q0 {

    /* renamed from: a */
    private final Path f51458a;

    /* renamed from: b */
    private final RectF f51459b;

    /* renamed from: c */
    private final float[] f51460c;

    /* renamed from: d */
    private final Matrix f51461d;

    public j() {
        this(null, 1, null);
    }

    public j(Path internalPath) {
        kotlin.jvm.internal.s.g(internalPath, "internalPath");
        this.f51458a = internalPath;
        this.f51459b = new RectF();
        this.f51460c = new float[8];
        this.f51461d = new Matrix();
    }

    private final boolean p(s1.h hVar) {
        if (!Float.isNaN(hVar.i())) {
            if (!Float.isNaN(hVar.l())) {
                if (!Float.isNaN(hVar.j())) {
                    if (!Float.isNaN(hVar.e())) {
                        return true;
                    }
                    throw new IllegalStateException("Rect.bottom is NaN".toString());
                }
                throw new IllegalStateException("Rect.right is NaN".toString());
            }
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        throw new IllegalStateException("Rect.left is NaN".toString());
    }

    @Override // t1.q0
    public void a(s1.h rect) {
        kotlin.jvm.internal.s.g(rect, "rect");
        if (p(rect)) {
            this.f51459b.set(v0.b(rect));
            this.f51458a.addRect(this.f51459b, Path.Direction.CCW);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // t1.q0
    public boolean b() {
        return this.f51458a.isConvex();
    }

    @Override // t1.q0
    public void c(float f11, float f12) {
        this.f51458a.rMoveTo(f11, f12);
    }

    @Override // t1.q0
    public void close() {
        this.f51458a.close();
    }

    @Override // t1.q0
    public void d(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f51458a.rCubicTo(f11, f12, f13, f14, f15, f16);
    }

    @Override // t1.q0
    public void e(float f11, float f12, float f13, float f14) {
        this.f51458a.quadTo(f11, f12, f13, f14);
    }

    @Override // t1.q0
    public void f(float f11, float f12, float f13, float f14) {
        this.f51458a.rQuadTo(f11, f12, f13, f14);
    }

    @Override // t1.q0
    public void g(int i11) {
        Path.FillType fillType;
        Path path = this.f51458a;
        if (s0.f(i11, s0.f51503b.a())) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    @Override // t1.q0
    public s1.h getBounds() {
        this.f51458a.computeBounds(this.f51459b, true);
        RectF rectF = this.f51459b;
        return new s1.h(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // t1.q0
    public void h(q0 path, long j11) {
        kotlin.jvm.internal.s.g(path, "path");
        Path path2 = this.f51458a;
        if (path instanceof j) {
            path2.addPath(((j) path).q(), s1.f.l(j11), s1.f.m(j11));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // t1.q0
    public void i(long j11) {
        this.f51461d.reset();
        this.f51461d.setTranslate(s1.f.l(j11), s1.f.m(j11));
        this.f51458a.transform(this.f51461d);
    }

    @Override // t1.q0
    public boolean isEmpty() {
        return this.f51458a.isEmpty();
    }

    @Override // t1.q0
    public void j(s1.j roundRect) {
        kotlin.jvm.internal.s.g(roundRect, "roundRect");
        this.f51459b.set(roundRect.e(), roundRect.g(), roundRect.f(), roundRect.a());
        this.f51460c[0] = s1.a.d(roundRect.h());
        this.f51460c[1] = s1.a.e(roundRect.h());
        this.f51460c[2] = s1.a.d(roundRect.i());
        this.f51460c[3] = s1.a.e(roundRect.i());
        this.f51460c[4] = s1.a.d(roundRect.c());
        this.f51460c[5] = s1.a.e(roundRect.c());
        this.f51460c[6] = s1.a.d(roundRect.b());
        this.f51460c[7] = s1.a.e(roundRect.b());
        this.f51458a.addRoundRect(this.f51459b, this.f51460c, Path.Direction.CCW);
    }

    @Override // t1.q0
    public boolean k(q0 path1, q0 path2, int i11) {
        Path.Op op2;
        kotlin.jvm.internal.s.g(path1, "path1");
        kotlin.jvm.internal.s.g(path2, "path2");
        u0.a aVar = u0.f51508a;
        if (u0.f(i11, aVar.a())) {
            op2 = Path.Op.DIFFERENCE;
        } else if (u0.f(i11, aVar.b())) {
            op2 = Path.Op.INTERSECT;
        } else if (u0.f(i11, aVar.c())) {
            op2 = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op2 = u0.f(i11, aVar.d()) ? Path.Op.UNION : Path.Op.XOR;
        }
        Path path = this.f51458a;
        if (path1 instanceof j) {
            Path q11 = ((j) path1).q();
            if (path2 instanceof j) {
                return path.op(q11, ((j) path2).q(), op2);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // t1.q0
    public void l(float f11, float f12) {
        this.f51458a.moveTo(f11, f12);
    }

    @Override // t1.q0
    public void m(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f51458a.cubicTo(f11, f12, f13, f14, f15, f16);
    }

    @Override // t1.q0
    public void n(float f11, float f12) {
        this.f51458a.rLineTo(f11, f12);
    }

    @Override // t1.q0
    public void o(float f11, float f12) {
        this.f51458a.lineTo(f11, f12);
    }

    public final Path q() {
        return this.f51458a;
    }

    @Override // t1.q0
    public void reset() {
        this.f51458a.reset();
    }

    public /* synthetic */ j(Path path, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new Path() : path);
    }
}