package d8;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d8.e;
import java.util.ArrayList;
import java.util.List;
import v7.j;
import y7.q;

/* loaded from: classes.dex */
public class c extends b {
    private y7.a<Float, Float> B;
    private final List<b> C;
    private final RectF D;
    private final RectF E;
    private final Paint F;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f23805a;

        static {
            int[] iArr = new int[e.b.values().length];
            f23805a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23805a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(com.airbnb.lottie.a aVar, e eVar, List<e> list, v7.d dVar) {
        super(aVar, eVar);
        int i11;
        b bVar;
        this.C = new ArrayList();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new Paint();
        b8.b u11 = eVar.u();
        if (u11 != null) {
            y7.a<Float, Float> l11 = u11.l();
            this.B = l11;
            h(l11);
            this.B.a(this);
        } else {
            this.B = null;
        }
        androidx.collection.d dVar2 = new androidx.collection.d(dVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = list.get(size);
            b t11 = b.t(this, eVar2, aVar, dVar);
            if (t11 != null) {
                dVar2.j(t11.x().d(), t11);
                if (bVar2 != null) {
                    bVar2.H(t11);
                    bVar2 = null;
                } else {
                    this.C.add(0, t11);
                    int i12 = a.f23805a[eVar2.h().ordinal()];
                    if (i12 == 1 || i12 == 2) {
                        bVar2 = t11;
                    }
                }
            }
            size--;
        }
        for (i11 = 0; i11 < dVar2.m(); i11++) {
            b bVar3 = (b) dVar2.f(dVar2.i(i11));
            if (bVar3 != null && (bVar = (b) dVar2.f(bVar3.x().j())) != null) {
                bVar3.J(bVar);
            }
        }
    }

    @Override // d8.b
    protected void G(a8.e eVar, int i11, List<a8.e> list, a8.e eVar2) {
        for (int i12 = 0; i12 < this.C.size(); i12++) {
            this.C.get(i12).d(eVar, i11, list, eVar2);
        }
    }

    @Override // d8.b
    public void I(boolean z11) {
        super.I(z11);
        for (b bVar : this.C) {
            bVar.I(z11);
        }
    }

    @Override // d8.b
    public void K(float f11) {
        super.K(f11);
        if (this.B != null) {
            f11 = ((this.B.h().floatValue() * this.f23791o.b().i()) - this.f23791o.b().p()) / (this.f23790n.q().e() + 0.01f);
        }
        if (this.B == null) {
            f11 -= this.f23791o.r();
        }
        if (this.f23791o.v() != BitmapDescriptorFactory.HUE_RED && !"__container".equals(this.f23791o.i())) {
            f11 /= this.f23791o.v();
        }
        for (int size = this.C.size() - 1; size >= 0; size--) {
            this.C.get(size).K(f11);
        }
    }

    @Override // d8.b, a8.f
    public <T> void c(T t11, i8.c<T> cVar) {
        super.c(t11, cVar);
        if (t11 == j.E) {
            if (cVar == null) {
                y7.a<Float, Float> aVar = this.B;
                if (aVar != null) {
                    aVar.n(null);
                    return;
                }
                return;
            }
            q qVar = new q(cVar);
            this.B = qVar;
            qVar.a(this);
            h(this.B);
        }
    }

    @Override // d8.b, x7.e
    public void e(RectF rectF, Matrix matrix, boolean z11) {
        super.e(rectF, matrix, z11);
        for (int size = this.C.size() - 1; size >= 0; size--) {
            this.D.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.C.get(size).e(this.D, this.f23789m, true);
            rectF.union(this.D);
        }
    }

    @Override // d8.b
    void s(Canvas canvas, Matrix matrix, int i11) {
        v7.c.a("CompositionLayer#draw");
        this.E.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f23791o.l(), this.f23791o.k());
        matrix.mapRect(this.E);
        boolean z11 = this.f23790n.J() && this.C.size() > 1 && i11 != 255;
        if (z11) {
            this.F.setAlpha(i11);
            h8.h.m(canvas, this.E, this.F);
        } else {
            canvas.save();
        }
        if (z11) {
            i11 = 255;
        }
        for (int size = this.C.size() - 1; size >= 0; size--) {
            if (!this.E.isEmpty() ? canvas.clipRect(this.E) : true) {
                this.C.get(size).g(canvas, matrix, i11);
            }
        }
        canvas.restore();
        v7.c.b("CompositionLayer#draw");
    }
}