package d8;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import c8.h;
import c8.m;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d8.e;
import f8.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y7.a;
import y7.p;

/* loaded from: classes.dex */
public abstract class b implements x7.e, a.b, a8.f {
    BlurMaskFilter A;

    /* renamed from: a */
    private final Path f23777a = new Path();

    /* renamed from: b */
    private final Matrix f23778b = new Matrix();

    /* renamed from: c */
    private final Paint f23779c = new w7.a(1);

    /* renamed from: d */
    private final Paint f23780d = new w7.a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: e */
    private final Paint f23781e = new w7.a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: f */
    private final Paint f23782f;

    /* renamed from: g */
    private final Paint f23783g;

    /* renamed from: h */
    private final RectF f23784h;

    /* renamed from: i */
    private final RectF f23785i;

    /* renamed from: j */
    private final RectF f23786j;

    /* renamed from: k */
    private final RectF f23787k;

    /* renamed from: l */
    private final String f23788l;

    /* renamed from: m */
    final Matrix f23789m;

    /* renamed from: n */
    final com.airbnb.lottie.a f23790n;

    /* renamed from: o */
    final e f23791o;

    /* renamed from: p */
    private y7.h f23792p;

    /* renamed from: q */
    private y7.d f23793q;

    /* renamed from: r */
    private b f23794r;

    /* renamed from: s */
    private b f23795s;

    /* renamed from: t */
    private List<b> f23796t;

    /* renamed from: u */
    private final List<y7.a<?, ?>> f23797u;

    /* renamed from: v */
    final p f23798v;

    /* renamed from: w */
    private boolean f23799w;

    /* renamed from: x */
    private boolean f23800x;

    /* renamed from: y */
    private Paint f23801y;

    /* renamed from: z */
    float f23802z;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23803a;

        /* renamed from: b */
        static final /* synthetic */ int[] f23804b;

        static {
            int[] iArr = new int[h.a.values().length];
            f23804b = iArr;
            try {
                iArr[h.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23804b[h.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23804b[h.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23804b[h.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f23803a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23803a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23803a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23803a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23803a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23803a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23803a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public b(com.airbnb.lottie.a aVar, e eVar) {
        w7.a aVar2 = new w7.a(1);
        this.f23782f = aVar2;
        this.f23783g = new w7.a(PorterDuff.Mode.CLEAR);
        this.f23784h = new RectF();
        this.f23785i = new RectF();
        this.f23786j = new RectF();
        this.f23787k = new RectF();
        this.f23789m = new Matrix();
        this.f23797u = new ArrayList();
        this.f23799w = true;
        this.f23802z = BitmapDescriptorFactory.HUE_RED;
        this.f23790n = aVar;
        this.f23791o = eVar;
        this.f23788l = eVar.i() + "#draw";
        if (eVar.h() == e.b.INVERT) {
            aVar2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        p b11 = eVar.w().b();
        this.f23798v = b11;
        b11.b(this);
        if (eVar.g() != null && !eVar.g().isEmpty()) {
            y7.h hVar = new y7.h(eVar.g());
            this.f23792p = hVar;
            for (y7.a<m, Path> aVar3 : hVar.a()) {
                aVar3.a(this);
            }
            for (y7.a<Integer, Integer> aVar4 : this.f23792p.c()) {
                h(aVar4);
                aVar4.a(this);
            }
        }
        M();
    }

    private void A(RectF rectF, Matrix matrix) {
        this.f23785i.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        if (y()) {
            int size = this.f23792p.b().size();
            for (int i11 = 0; i11 < size; i11++) {
                c8.h hVar = this.f23792p.b().get(i11);
                Path h11 = this.f23792p.a().get(i11).h();
                if (h11 != null) {
                    this.f23777a.set(h11);
                    this.f23777a.transform(matrix);
                    int i12 = a.f23804b[hVar.a().ordinal()];
                    if (i12 == 1 || i12 == 2) {
                        return;
                    }
                    if ((i12 == 3 || i12 == 4) && hVar.d()) {
                        return;
                    }
                    this.f23777a.computeBounds(this.f23787k, false);
                    if (i11 == 0) {
                        this.f23785i.set(this.f23787k);
                    } else {
                        RectF rectF2 = this.f23785i;
                        rectF2.set(Math.min(rectF2.left, this.f23787k.left), Math.min(this.f23785i.top, this.f23787k.top), Math.max(this.f23785i.right, this.f23787k.right), Math.max(this.f23785i.bottom, this.f23787k.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f23785i)) {
                return;
            }
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
    }

    private void B(RectF rectF, Matrix matrix) {
        if (z() && this.f23791o.h() != e.b.INVERT) {
            this.f23786j.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.f23794r.e(this.f23786j, matrix, true);
            if (rectF.intersect(this.f23786j)) {
                return;
            }
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
    }

    private void C() {
        this.f23790n.invalidateSelf();
    }

    public /* synthetic */ void D() {
        L(this.f23793q.p() == 1.0f);
    }

    private void E(float f11) {
        this.f23790n.q().n().a(this.f23791o.i(), f11);
    }

    private void L(boolean z11) {
        if (z11 != this.f23799w) {
            this.f23799w = z11;
            C();
        }
    }

    private void M() {
        if (!this.f23791o.e().isEmpty()) {
            y7.d dVar = new y7.d(this.f23791o.e());
            this.f23793q = dVar;
            dVar.l();
            this.f23793q.a(new a.b() { // from class: d8.a
                {
                    b.this = this;
                }

                @Override // y7.a.b
                public final void a() {
                    b.this.D();
                }
            });
            L(this.f23793q.h().floatValue() == 1.0f);
            h(this.f23793q);
            return;
        }
        L(true);
    }

    private void i(Canvas canvas, Matrix matrix, y7.a<m, Path> aVar, y7.a<Integer, Integer> aVar2) {
        this.f23777a.set(aVar.h());
        this.f23777a.transform(matrix);
        this.f23779c.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f23777a, this.f23779c);
    }

    private void j(Canvas canvas, Matrix matrix, y7.a<m, Path> aVar, y7.a<Integer, Integer> aVar2) {
        h8.h.m(canvas, this.f23784h, this.f23780d);
        this.f23777a.set(aVar.h());
        this.f23777a.transform(matrix);
        this.f23779c.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f23777a, this.f23779c);
        canvas.restore();
    }

    private void k(Canvas canvas, Matrix matrix, y7.a<m, Path> aVar, y7.a<Integer, Integer> aVar2) {
        h8.h.m(canvas, this.f23784h, this.f23779c);
        canvas.drawRect(this.f23784h, this.f23779c);
        this.f23777a.set(aVar.h());
        this.f23777a.transform(matrix);
        this.f23779c.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f23777a, this.f23781e);
        canvas.restore();
    }

    private void l(Canvas canvas, Matrix matrix, y7.a<m, Path> aVar, y7.a<Integer, Integer> aVar2) {
        h8.h.m(canvas, this.f23784h, this.f23780d);
        canvas.drawRect(this.f23784h, this.f23779c);
        this.f23781e.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f23777a.set(aVar.h());
        this.f23777a.transform(matrix);
        canvas.drawPath(this.f23777a, this.f23781e);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, y7.a<m, Path> aVar, y7.a<Integer, Integer> aVar2) {
        h8.h.m(canvas, this.f23784h, this.f23781e);
        canvas.drawRect(this.f23784h, this.f23779c);
        this.f23781e.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f23777a.set(aVar.h());
        this.f23777a.transform(matrix);
        canvas.drawPath(this.f23777a, this.f23781e);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix) {
        v7.c.a("Layer#saveLayer");
        h8.h.n(canvas, this.f23784h, this.f23780d, 19);
        if (Build.VERSION.SDK_INT < 28) {
            r(canvas);
        }
        v7.c.b("Layer#saveLayer");
        for (int i11 = 0; i11 < this.f23792p.b().size(); i11++) {
            c8.h hVar = this.f23792p.b().get(i11);
            y7.a<m, Path> aVar = this.f23792p.a().get(i11);
            y7.a<Integer, Integer> aVar2 = this.f23792p.c().get(i11);
            int i12 = a.f23804b[hVar.a().ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    if (i11 == 0) {
                        this.f23779c.setColor(-16777216);
                        this.f23779c.setAlpha(255);
                        canvas.drawRect(this.f23784h, this.f23779c);
                    }
                    if (hVar.d()) {
                        m(canvas, matrix, aVar, aVar2);
                    } else {
                        o(canvas, matrix, aVar);
                    }
                } else if (i12 != 3) {
                    if (i12 == 4) {
                        if (hVar.d()) {
                            k(canvas, matrix, aVar, aVar2);
                        } else {
                            i(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (hVar.d()) {
                    l(canvas, matrix, aVar, aVar2);
                } else {
                    j(canvas, matrix, aVar, aVar2);
                }
            } else if (p()) {
                this.f23779c.setAlpha(255);
                canvas.drawRect(this.f23784h, this.f23779c);
            }
        }
        v7.c.a("Layer#restoreLayer");
        canvas.restore();
        v7.c.b("Layer#restoreLayer");
    }

    private void o(Canvas canvas, Matrix matrix, y7.a<m, Path> aVar) {
        this.f23777a.set(aVar.h());
        this.f23777a.transform(matrix);
        canvas.drawPath(this.f23777a, this.f23781e);
    }

    private boolean p() {
        if (this.f23792p.a().isEmpty()) {
            return false;
        }
        for (int i11 = 0; i11 < this.f23792p.b().size(); i11++) {
            if (this.f23792p.b().get(i11).a() != h.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void q() {
        if (this.f23796t != null) {
            return;
        }
        if (this.f23795s == null) {
            this.f23796t = Collections.emptyList();
            return;
        }
        this.f23796t = new ArrayList();
        for (b bVar = this.f23795s; bVar != null; bVar = bVar.f23795s) {
            this.f23796t.add(bVar);
        }
    }

    private void r(Canvas canvas) {
        v7.c.a("Layer#clearLayer");
        RectF rectF = this.f23784h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f23783g);
        v7.c.b("Layer#clearLayer");
    }

    public static b t(c cVar, e eVar, com.airbnb.lottie.a aVar, v7.d dVar) {
        switch (a.f23803a[eVar.f().ordinal()]) {
            case 1:
                return new g(aVar, eVar, cVar);
            case 2:
                return new c(aVar, eVar, dVar.o(eVar.m()), dVar);
            case 3:
                return new h(aVar, eVar);
            case 4:
                return new d(aVar, eVar);
            case 5:
                return new f(aVar, eVar);
            case 6:
                return new i(aVar, eVar);
            default:
                h8.d.c("Unknown layer type " + eVar.f());
                return null;
        }
    }

    public void F(y7.a<?, ?> aVar) {
        this.f23797u.remove(aVar);
    }

    void G(a8.e eVar, int i11, List<a8.e> list, a8.e eVar2) {
    }

    public void H(b bVar) {
        this.f23794r = bVar;
    }

    public void I(boolean z11) {
        if (z11 && this.f23801y == null) {
            this.f23801y = new w7.a();
        }
        this.f23800x = z11;
    }

    public void J(b bVar) {
        this.f23795s = bVar;
    }

    public void K(float f11) {
        this.f23798v.j(f11);
        if (this.f23792p != null) {
            for (int i11 = 0; i11 < this.f23792p.a().size(); i11++) {
                this.f23792p.a().get(i11).m(f11);
            }
        }
        y7.d dVar = this.f23793q;
        if (dVar != null) {
            dVar.m(f11);
        }
        b bVar = this.f23794r;
        if (bVar != null) {
            bVar.K(f11);
        }
        for (int i12 = 0; i12 < this.f23797u.size(); i12++) {
            this.f23797u.get(i12).m(f11);
        }
    }

    @Override // y7.a.b
    public void a() {
        C();
    }

    @Override // x7.c
    public void b(List<x7.c> list, List<x7.c> list2) {
    }

    @Override // a8.f
    public <T> void c(T t11, i8.c<T> cVar) {
        this.f23798v.c(t11, cVar);
    }

    @Override // a8.f
    public void d(a8.e eVar, int i11, List<a8.e> list, a8.e eVar2) {
        b bVar = this.f23794r;
        if (bVar != null) {
            a8.e a11 = eVar2.a(bVar.getName());
            if (eVar.c(this.f23794r.getName(), i11)) {
                list.add(a11.i(this.f23794r));
            }
            if (eVar.h(getName(), i11)) {
                this.f23794r.G(eVar, eVar.e(this.f23794r.getName(), i11) + i11, list, a11);
            }
        }
        if (eVar.g(getName(), i11)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i11)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i11)) {
                G(eVar, i11 + eVar.e(getName(), i11), list, eVar2);
            }
        }
    }

    @Override // x7.e
    public void e(RectF rectF, Matrix matrix, boolean z11) {
        this.f23784h.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        q();
        this.f23789m.set(matrix);
        if (z11) {
            List<b> list = this.f23796t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f23789m.preConcat(this.f23796t.get(size).f23798v.f());
                }
            } else {
                b bVar = this.f23795s;
                if (bVar != null) {
                    this.f23789m.preConcat(bVar.f23798v.f());
                }
            }
        }
        this.f23789m.preConcat(this.f23798v.f());
    }

    @Override // x7.e
    public void g(Canvas canvas, Matrix matrix, int i11) {
        Paint paint;
        v7.c.a(this.f23788l);
        if (this.f23799w && !this.f23791o.x()) {
            q();
            v7.c.a("Layer#parentMatrix");
            this.f23778b.reset();
            this.f23778b.set(matrix);
            for (int size = this.f23796t.size() - 1; size >= 0; size--) {
                this.f23778b.preConcat(this.f23796t.get(size).f23798v.f());
            }
            v7.c.b("Layer#parentMatrix");
            int intValue = (int) ((((i11 / 255.0f) * (this.f23798v.h() == null ? 100 : this.f23798v.h().h().intValue())) / 100.0f) * 255.0f);
            if (!z() && !y()) {
                this.f23778b.preConcat(this.f23798v.f());
                v7.c.a("Layer#drawLayer");
                s(canvas, this.f23778b, intValue);
                v7.c.b("Layer#drawLayer");
                E(v7.c.b(this.f23788l));
                return;
            }
            v7.c.a("Layer#computeBounds");
            e(this.f23784h, this.f23778b, false);
            B(this.f23784h, matrix);
            this.f23778b.preConcat(this.f23798v.f());
            A(this.f23784h, this.f23778b);
            if (!this.f23784h.intersect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, canvas.getWidth(), canvas.getHeight())) {
                this.f23784h.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            v7.c.b("Layer#computeBounds");
            if (this.f23784h.width() >= 1.0f && this.f23784h.height() >= 1.0f) {
                v7.c.a("Layer#saveLayer");
                this.f23779c.setAlpha(255);
                h8.h.m(canvas, this.f23784h, this.f23779c);
                v7.c.b("Layer#saveLayer");
                r(canvas);
                v7.c.a("Layer#drawLayer");
                s(canvas, this.f23778b, intValue);
                v7.c.b("Layer#drawLayer");
                if (y()) {
                    n(canvas, this.f23778b);
                }
                if (z()) {
                    v7.c.a("Layer#drawMatte");
                    v7.c.a("Layer#saveLayer");
                    h8.h.n(canvas, this.f23784h, this.f23782f, 19);
                    v7.c.b("Layer#saveLayer");
                    r(canvas);
                    this.f23794r.g(canvas, matrix, intValue);
                    v7.c.a("Layer#restoreLayer");
                    canvas.restore();
                    v7.c.b("Layer#restoreLayer");
                    v7.c.b("Layer#drawMatte");
                }
                v7.c.a("Layer#restoreLayer");
                canvas.restore();
                v7.c.b("Layer#restoreLayer");
            }
            if (this.f23800x && (paint = this.f23801y) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.f23801y.setColor(-251901);
                this.f23801y.setStrokeWidth(4.0f);
                canvas.drawRect(this.f23784h, this.f23801y);
                this.f23801y.setStyle(Paint.Style.FILL);
                this.f23801y.setColor(1357638635);
                canvas.drawRect(this.f23784h, this.f23801y);
            }
            E(v7.c.b(this.f23788l));
            return;
        }
        v7.c.b(this.f23788l);
    }

    @Override // x7.c
    public String getName() {
        return this.f23791o.i();
    }

    public void h(y7.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f23797u.add(aVar);
    }

    abstract void s(Canvas canvas, Matrix matrix, int i11);

    public c8.a u() {
        return this.f23791o.a();
    }

    public BlurMaskFilter v(float f11) {
        if (this.f23802z == f11) {
            return this.A;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f11 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.A = blurMaskFilter;
        this.f23802z = f11;
        return blurMaskFilter;
    }

    public j w() {
        return this.f23791o.c();
    }

    public e x() {
        return this.f23791o;
    }

    boolean y() {
        y7.h hVar = this.f23792p;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    boolean z() {
        return this.f23794r != null;
    }
}