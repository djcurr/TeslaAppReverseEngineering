package x7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import y7.a;

/* loaded from: classes.dex */
public class d implements e, m, a.b, a8.f {

    /* renamed from: a */
    private final Paint f57216a;

    /* renamed from: b */
    private final RectF f57217b;

    /* renamed from: c */
    private final Matrix f57218c;

    /* renamed from: d */
    private final Path f57219d;

    /* renamed from: e */
    private final RectF f57220e;

    /* renamed from: f */
    private final String f57221f;

    /* renamed from: g */
    private final boolean f57222g;

    /* renamed from: h */
    private final List<c> f57223h;

    /* renamed from: i */
    private final com.airbnb.lottie.a f57224i;

    /* renamed from: j */
    private List<m> f57225j;

    /* renamed from: k */
    private y7.p f57226k;

    public d(com.airbnb.lottie.a aVar, d8.b bVar, c8.o oVar) {
        this(aVar, bVar, oVar.c(), oVar.d(), f(aVar, bVar, oVar.b()), h(oVar.b()));
    }

    private static List<c> f(com.airbnb.lottie.a aVar, d8.b bVar, List<c8.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            c a11 = list.get(i11).a(aVar, bVar);
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        return arrayList;
    }

    static b8.l h(List<c8.c> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            c8.c cVar = list.get(i11);
            if (cVar instanceof b8.l) {
                return (b8.l) cVar;
            }
        }
        return null;
    }

    private boolean k() {
        int i11 = 0;
        for (int i12 = 0; i12 < this.f57223h.size(); i12++) {
            if ((this.f57223h.get(i12) instanceof e) && (i11 = i11 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // y7.a.b
    public void a() {
        this.f57224i.invalidateSelf();
    }

    @Override // x7.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f57223h.size());
        arrayList.addAll(list);
        for (int size = this.f57223h.size() - 1; size >= 0; size--) {
            c cVar = this.f57223h.get(size);
            cVar.b(arrayList, this.f57223h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // a8.f
    public <T> void c(T t11, i8.c<T> cVar) {
        y7.p pVar = this.f57226k;
        if (pVar != null) {
            pVar.c(t11, cVar);
        }
    }

    @Override // a8.f
    public void d(a8.e eVar, int i11, List<a8.e> list, a8.e eVar2) {
        if (eVar.g(getName(), i11) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i11)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i11)) {
                int e11 = i11 + eVar.e(getName(), i11);
                for (int i12 = 0; i12 < this.f57223h.size(); i12++) {
                    c cVar = this.f57223h.get(i12);
                    if (cVar instanceof a8.f) {
                        ((a8.f) cVar).d(eVar, e11, list, eVar2);
                    }
                }
            }
        }
    }

    @Override // x7.e
    public void e(RectF rectF, Matrix matrix, boolean z11) {
        this.f57218c.set(matrix);
        y7.p pVar = this.f57226k;
        if (pVar != null) {
            this.f57218c.preConcat(pVar.f());
        }
        this.f57220e.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        for (int size = this.f57223h.size() - 1; size >= 0; size--) {
            c cVar = this.f57223h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).e(this.f57220e, this.f57218c, z11);
                rectF.union(this.f57220e);
            }
        }
    }

    @Override // x7.e
    public void g(Canvas canvas, Matrix matrix, int i11) {
        if (this.f57222g) {
            return;
        }
        this.f57218c.set(matrix);
        y7.p pVar = this.f57226k;
        if (pVar != null) {
            this.f57218c.preConcat(pVar.f());
            i11 = (int) (((((this.f57226k.h() == null ? 100 : this.f57226k.h().h().intValue()) / 100.0f) * i11) / 255.0f) * 255.0f);
        }
        boolean z11 = this.f57224i.J() && k() && i11 != 255;
        if (z11) {
            this.f57217b.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            e(this.f57217b, this.f57218c, true);
            this.f57216a.setAlpha(i11);
            h8.h.m(canvas, this.f57217b, this.f57216a);
        }
        if (z11) {
            i11 = 255;
        }
        for (int size = this.f57223h.size() - 1; size >= 0; size--) {
            c cVar = this.f57223h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).g(canvas, this.f57218c, i11);
            }
        }
        if (z11) {
            canvas.restore();
        }
    }

    @Override // x7.c
    public String getName() {
        return this.f57221f;
    }

    @Override // x7.m
    public Path getPath() {
        this.f57218c.reset();
        y7.p pVar = this.f57226k;
        if (pVar != null) {
            this.f57218c.set(pVar.f());
        }
        this.f57219d.reset();
        if (this.f57222g) {
            return this.f57219d;
        }
        for (int size = this.f57223h.size() - 1; size >= 0; size--) {
            c cVar = this.f57223h.get(size);
            if (cVar instanceof m) {
                this.f57219d.addPath(((m) cVar).getPath(), this.f57218c);
            }
        }
        return this.f57219d;
    }

    public List<m> i() {
        if (this.f57225j == null) {
            this.f57225j = new ArrayList();
            for (int i11 = 0; i11 < this.f57223h.size(); i11++) {
                c cVar = this.f57223h.get(i11);
                if (cVar instanceof m) {
                    this.f57225j.add((m) cVar);
                }
            }
        }
        return this.f57225j;
    }

    public Matrix j() {
        y7.p pVar = this.f57226k;
        if (pVar != null) {
            return pVar.f();
        }
        this.f57218c.reset();
        return this.f57218c;
    }

    public d(com.airbnb.lottie.a aVar, d8.b bVar, String str, boolean z11, List<c> list, b8.l lVar) {
        this.f57216a = new w7.a();
        this.f57217b = new RectF();
        this.f57218c = new Matrix();
        this.f57219d = new Path();
        this.f57220e = new RectF();
        this.f57221f = str;
        this.f57224i = aVar;
        this.f57222g = z11;
        this.f57223h = list;
        if (lVar != null) {
            y7.p b11 = lVar.b();
            this.f57226k = b11;
            b11.a(bVar);
            this.f57226k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).f(list.listIterator(list.size()));
        }
    }
}