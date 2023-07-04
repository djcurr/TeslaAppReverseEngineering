package x7;

import c8.r;
import java.util.ArrayList;
import java.util.List;
import y7.a;

/* loaded from: classes.dex */
public class s implements c, a.b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f57330a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a.b> f57331b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final r.a f57332c;

    /* renamed from: d  reason: collision with root package name */
    private final y7.a<?, Float> f57333d;

    /* renamed from: e  reason: collision with root package name */
    private final y7.a<?, Float> f57334e;

    /* renamed from: f  reason: collision with root package name */
    private final y7.a<?, Float> f57335f;

    public s(d8.b bVar, c8.r rVar) {
        rVar.c();
        this.f57330a = rVar.g();
        this.f57332c = rVar.f();
        y7.a<Float, Float> l11 = rVar.e().l();
        this.f57333d = l11;
        y7.a<Float, Float> l12 = rVar.b().l();
        this.f57334e = l12;
        y7.a<Float, Float> l13 = rVar.d().l();
        this.f57335f = l13;
        bVar.h(l11);
        bVar.h(l12);
        bVar.h(l13);
        l11.a(this);
        l12.a(this);
        l13.a(this);
    }

    @Override // y7.a.b
    public void a() {
        for (int i11 = 0; i11 < this.f57331b.size(); i11++) {
            this.f57331b.get(i11).a();
        }
    }

    @Override // x7.c
    public void b(List<c> list, List<c> list2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(a.b bVar) {
        this.f57331b.add(bVar);
    }

    public y7.a<?, Float> d() {
        return this.f57334e;
    }

    public y7.a<?, Float> f() {
        return this.f57335f;
    }

    public y7.a<?, Float> h() {
        return this.f57333d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r.a i() {
        return this.f57332c;
    }

    public boolean j() {
        return this.f57330a;
    }
}