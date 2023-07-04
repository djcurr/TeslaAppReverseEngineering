package ke;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import je.f;
import je.g;
import je.h;
import je.p;
import je.q;
import md.k;

/* loaded from: classes3.dex */
public class a implements me.c {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f34573a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f34574b;

    /* renamed from: c  reason: collision with root package name */
    private d f34575c;

    /* renamed from: d  reason: collision with root package name */
    private final c f34576d;

    /* renamed from: e  reason: collision with root package name */
    private final f f34577e;

    /* renamed from: f  reason: collision with root package name */
    private final g f34578f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f34573a = colorDrawable;
        if (tf.b.d()) {
            tf.b.a("GenericDraweeHierarchy()");
        }
        this.f34574b = bVar.o();
        this.f34575c = bVar.r();
        g gVar = new g(colorDrawable);
        this.f34578f = gVar;
        int i11 = 1;
        int size = bVar.i() != null ? bVar.i().size() : 1;
        int i12 = (size == 0 ? 1 : size) + (bVar.l() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i12 + 6];
        drawableArr[0] = h(bVar.e(), null);
        drawableArr[1] = h(bVar.j(), bVar.k());
        drawableArr[2] = g(gVar, bVar.d(), bVar.c(), bVar.b());
        drawableArr[3] = h(bVar.m(), bVar.n());
        drawableArr[4] = h(bVar.p(), bVar.q());
        drawableArr[5] = h(bVar.g(), bVar.h());
        if (i12 > 0) {
            if (bVar.i() != null) {
                i11 = 0;
                for (Drawable drawable : bVar.i()) {
                    drawableArr[i11 + 6] = h(drawable, null);
                    i11++;
                }
            }
            if (bVar.l() != null) {
                drawableArr[i11 + 6] = h(bVar.l(), null);
            }
        }
        f fVar = new f(drawableArr, false, 2);
        this.f34577e = fVar;
        fVar.w(bVar.f());
        c cVar = new c(e.e(fVar, this.f34575c));
        this.f34576d = cVar;
        cVar.mutate();
        u();
        if (tf.b.d()) {
            tf.b.b();
        }
    }

    private void B(float f11) {
        Drawable b11 = this.f34577e.b(3);
        if (b11 == null) {
            return;
        }
        if (f11 >= 0.999f) {
            if (b11 instanceof Animatable) {
                ((Animatable) b11).stop();
            }
            k(3);
        } else {
            if (b11 instanceof Animatable) {
                ((Animatable) b11).start();
            }
            i(3);
        }
        b11.setLevel(Math.round(f11 * 10000.0f));
    }

    private Drawable g(Drawable drawable, q.c cVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return e.g(drawable, cVar, pointF);
    }

    private Drawable h(Drawable drawable, q.c cVar) {
        return e.f(e.d(drawable, this.f34575c, this.f34574b), cVar);
    }

    private void i(int i11) {
        if (i11 >= 0) {
            this.f34577e.l(i11);
        }
    }

    private void j() {
        k(1);
        k(2);
        k(3);
        k(4);
        k(5);
    }

    private void k(int i11) {
        if (i11 >= 0) {
            this.f34577e.m(i11);
        }
    }

    private je.c p(int i11) {
        je.c c11 = this.f34577e.c(i11);
        if (c11.r() instanceof h) {
            c11 = (h) c11.r();
        }
        return c11.r() instanceof p ? (p) c11.r() : c11;
    }

    private p r(int i11) {
        je.c p11 = p(i11);
        if (p11 instanceof p) {
            return (p) p11;
        }
        return e.k(p11, q.c.f33449a);
    }

    private boolean s(int i11) {
        return p(i11) instanceof p;
    }

    private void t() {
        this.f34578f.g(this.f34573a);
    }

    private void u() {
        f fVar = this.f34577e;
        if (fVar != null) {
            fVar.g();
            this.f34577e.j();
            j();
            i(1);
            this.f34577e.n();
            this.f34577e.i();
        }
    }

    private void x(int i11, Drawable drawable) {
        if (drawable == null) {
            this.f34577e.f(i11, null);
            return;
        }
        p(i11).g(e.d(drawable, this.f34575c, this.f34574b));
    }

    public void A(Drawable drawable, q.c cVar) {
        x(1, drawable);
        r(1).C(cVar);
    }

    public void C(Drawable drawable) {
        x(3, drawable);
    }

    public void D(d dVar) {
        this.f34575c = dVar;
        e.j(this.f34576d, dVar);
        for (int i11 = 0; i11 < this.f34577e.e(); i11++) {
            e.i(p(i11), this.f34575c, this.f34574b);
        }
    }

    @Override // me.c
    public void a(Throwable th2) {
        this.f34577e.g();
        j();
        if (this.f34577e.b(4) != null) {
            i(4);
        } else {
            i(1);
        }
        this.f34577e.i();
    }

    @Override // me.c
    public void b(Throwable th2) {
        this.f34577e.g();
        j();
        if (this.f34577e.b(5) != null) {
            i(5);
        } else {
            i(1);
        }
        this.f34577e.i();
    }

    @Override // me.c
    public void c(float f11, boolean z11) {
        if (this.f34577e.b(3) == null) {
            return;
        }
        this.f34577e.g();
        B(f11);
        if (z11) {
            this.f34577e.n();
        }
        this.f34577e.i();
    }

    @Override // me.b
    public Drawable d() {
        return this.f34576d;
    }

    @Override // me.c
    public void e(Drawable drawable, float f11, boolean z11) {
        Drawable d11 = e.d(drawable, this.f34575c, this.f34574b);
        d11.mutate();
        this.f34578f.g(d11);
        this.f34577e.g();
        j();
        i(2);
        B(f11);
        if (z11) {
            this.f34577e.n();
        }
        this.f34577e.i();
    }

    @Override // me.c
    public void f(Drawable drawable) {
        this.f34576d.x(drawable);
    }

    @Override // me.b
    public Rect getBounds() {
        return this.f34576d.getBounds();
    }

    public void l(RectF rectF) {
        this.f34578f.u(rectF);
    }

    public PointF m() {
        if (s(2)) {
            return r(2).z();
        }
        return null;
    }

    public q.c n() {
        if (s(2)) {
            return r(2).A();
        }
        return null;
    }

    public int o() {
        return this.f34577e.q();
    }

    public d q() {
        return this.f34575c;
    }

    @Override // me.c
    public void reset() {
        t();
        u();
    }

    public void v(q.c cVar) {
        k.g(cVar);
        r(2).C(cVar);
    }

    public void w(Drawable drawable) {
        x(0, drawable);
    }

    public void y(int i11) {
        this.f34577e.w(i11);
    }

    public void z(f.a aVar) {
        this.f34577e.v(aVar);
    }
}