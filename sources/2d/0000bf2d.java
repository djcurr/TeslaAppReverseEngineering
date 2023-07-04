package x7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import y7.a;

/* loaded from: classes.dex */
public class p implements e, m, j, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f57309a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final Path f57310b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.a f57311c;

    /* renamed from: d  reason: collision with root package name */
    private final d8.b f57312d;

    /* renamed from: e  reason: collision with root package name */
    private final String f57313e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f57314f;

    /* renamed from: g  reason: collision with root package name */
    private final y7.a<Float, Float> f57315g;

    /* renamed from: h  reason: collision with root package name */
    private final y7.a<Float, Float> f57316h;

    /* renamed from: i  reason: collision with root package name */
    private final y7.p f57317i;

    /* renamed from: j  reason: collision with root package name */
    private d f57318j;

    public p(com.airbnb.lottie.a aVar, d8.b bVar, c8.l lVar) {
        this.f57311c = aVar;
        this.f57312d = bVar;
        this.f57313e = lVar.c();
        this.f57314f = lVar.f();
        y7.a<Float, Float> l11 = lVar.b().l();
        this.f57315g = l11;
        bVar.h(l11);
        l11.a(this);
        y7.a<Float, Float> l12 = lVar.d().l();
        this.f57316h = l12;
        bVar.h(l12);
        l12.a(this);
        y7.p b11 = lVar.e().b();
        this.f57317i = b11;
        b11.a(bVar);
        b11.b(this);
    }

    @Override // y7.a.b
    public void a() {
        this.f57311c.invalidateSelf();
    }

    @Override // x7.c
    public void b(List<c> list, List<c> list2) {
        this.f57318j.b(list, list2);
    }

    @Override // a8.f
    public <T> void c(T t11, i8.c<T> cVar) {
        if (this.f57317i.c(t11, cVar)) {
            return;
        }
        if (t11 == v7.j.f54300u) {
            this.f57315g.n(cVar);
        } else if (t11 == v7.j.f54301v) {
            this.f57316h.n(cVar);
        }
    }

    @Override // a8.f
    public void d(a8.e eVar, int i11, List<a8.e> list, a8.e eVar2) {
        h8.g.m(eVar, i11, list, eVar2, this);
    }

    @Override // x7.e
    public void e(RectF rectF, Matrix matrix, boolean z11) {
        this.f57318j.e(rectF, matrix, z11);
    }

    @Override // x7.j
    public void f(ListIterator<c> listIterator) {
        if (this.f57318j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f57318j = new d(this.f57311c, this.f57312d, "Repeater", this.f57314f, arrayList, null);
    }

    @Override // x7.e
    public void g(Canvas canvas, Matrix matrix, int i11) {
        float floatValue = this.f57315g.h().floatValue();
        float floatValue2 = this.f57316h.h().floatValue();
        float floatValue3 = this.f57317i.i().h().floatValue() / 100.0f;
        float floatValue4 = this.f57317i.e().h().floatValue() / 100.0f;
        for (int i12 = ((int) floatValue) - 1; i12 >= 0; i12--) {
            this.f57309a.set(matrix);
            float f11 = i12;
            this.f57309a.preConcat(this.f57317i.g(f11 + floatValue2));
            this.f57318j.g(canvas, this.f57309a, (int) (i11 * h8.g.k(floatValue3, floatValue4, f11 / floatValue)));
        }
    }

    @Override // x7.c
    public String getName() {
        return this.f57313e;
    }

    @Override // x7.m
    public Path getPath() {
        Path path = this.f57318j.getPath();
        this.f57310b.reset();
        float floatValue = this.f57315g.h().floatValue();
        float floatValue2 = this.f57316h.h().floatValue();
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            this.f57309a.set(this.f57317i.g(i11 + floatValue2));
            this.f57310b.addPath(path, this.f57309a);
        }
        return this.f57310b;
    }
}