package x7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public class i extends a {
    private final y7.a<PointF, PointF> A;
    private y7.q B;

    /* renamed from: r  reason: collision with root package name */
    private final String f57269r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f57270s;

    /* renamed from: t  reason: collision with root package name */
    private final androidx.collection.d<LinearGradient> f57271t;

    /* renamed from: u  reason: collision with root package name */
    private final androidx.collection.d<RadialGradient> f57272u;

    /* renamed from: v  reason: collision with root package name */
    private final RectF f57273v;

    /* renamed from: w  reason: collision with root package name */
    private final c8.g f57274w;

    /* renamed from: x  reason: collision with root package name */
    private final int f57275x;

    /* renamed from: y  reason: collision with root package name */
    private final y7.a<c8.d, c8.d> f57276y;

    /* renamed from: z  reason: collision with root package name */
    private final y7.a<PointF, PointF> f57277z;

    public i(com.airbnb.lottie.a aVar, d8.b bVar, c8.f fVar) {
        super(aVar, bVar, fVar.b().toPaintCap(), fVar.g().toPaintJoin(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f57271t = new androidx.collection.d<>();
        this.f57272u = new androidx.collection.d<>();
        this.f57273v = new RectF();
        this.f57269r = fVar.j();
        this.f57274w = fVar.f();
        this.f57270s = fVar.n();
        this.f57275x = (int) (aVar.q().d() / 32.0f);
        y7.a<c8.d, c8.d> l11 = fVar.e().l();
        this.f57276y = l11;
        l11.a(this);
        bVar.h(l11);
        y7.a<PointF, PointF> l12 = fVar.l().l();
        this.f57277z = l12;
        l12.a(this);
        bVar.h(l12);
        y7.a<PointF, PointF> l13 = fVar.d().l();
        this.A = l13;
        l13.a(this);
        bVar.h(l13);
    }

    private int[] i(int[] iArr) {
        y7.q qVar = this.B;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i11 = 0;
            if (iArr.length == numArr.length) {
                while (i11 < iArr.length) {
                    iArr[i11] = numArr[i11].intValue();
                    i11++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i11 < numArr.length) {
                    iArr[i11] = numArr[i11].intValue();
                    i11++;
                }
            }
        }
        return iArr;
    }

    private int j() {
        int round = Math.round(this.f57277z.f() * this.f57275x);
        int round2 = Math.round(this.A.f() * this.f57275x);
        int round3 = Math.round(this.f57276y.f() * this.f57275x);
        int i11 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i11 = i11 * 31 * round2;
        }
        return round3 != 0 ? i11 * 31 * round3 : i11;
    }

    private LinearGradient k() {
        long j11 = j();
        LinearGradient f11 = this.f57271t.f(j11);
        if (f11 != null) {
            return f11;
        }
        PointF h11 = this.f57277z.h();
        PointF h12 = this.A.h();
        c8.d h13 = this.f57276y.h();
        LinearGradient linearGradient = new LinearGradient(h11.x, h11.y, h12.x, h12.y, i(h13.a()), h13.b(), Shader.TileMode.CLAMP);
        this.f57271t.j(j11, linearGradient);
        return linearGradient;
    }

    private RadialGradient l() {
        float f11;
        float f12;
        long j11 = j();
        RadialGradient f13 = this.f57272u.f(j11);
        if (f13 != null) {
            return f13;
        }
        PointF h11 = this.f57277z.h();
        PointF h12 = this.A.h();
        c8.d h13 = this.f57276y.h();
        int[] i11 = i(h13.a());
        float[] b11 = h13.b();
        RadialGradient radialGradient = new RadialGradient(h11.x, h11.y, (float) Math.hypot(h12.x - f11, h12.y - f12), i11, b11, Shader.TileMode.CLAMP);
        this.f57272u.j(j11, radialGradient);
        return radialGradient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x7.a, a8.f
    public <T> void c(T t11, i8.c<T> cVar) {
        super.c(t11, cVar);
        if (t11 == v7.j.L) {
            y7.q qVar = this.B;
            if (qVar != null) {
                this.f57201f.F(qVar);
            }
            if (cVar == null) {
                this.B = null;
                return;
            }
            y7.q qVar2 = new y7.q(cVar);
            this.B = qVar2;
            qVar2.a(this);
            this.f57201f.h(this.B);
        }
    }

    @Override // x7.a, x7.e
    public void g(Canvas canvas, Matrix matrix, int i11) {
        Shader l11;
        if (this.f57270s) {
            return;
        }
        e(this.f57273v, matrix, false);
        if (this.f57274w == c8.g.LINEAR) {
            l11 = k();
        } else {
            l11 = l();
        }
        l11.setLocalMatrix(matrix);
        this.f57204i.setShader(l11);
        super.g(canvas, matrix, i11);
    }

    @Override // x7.c
    public String getName() {
        return this.f57269r;
    }
}