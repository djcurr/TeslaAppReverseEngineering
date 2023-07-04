package x7;

import android.graphics.Path;
import c8.r;
import java.util.List;
import y7.a;

/* loaded from: classes.dex */
public class q implements m, a.b {

    /* renamed from: b  reason: collision with root package name */
    private final boolean f57320b;

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.a f57321c;

    /* renamed from: d  reason: collision with root package name */
    private final y7.a<?, Path> f57322d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f57323e;

    /* renamed from: a  reason: collision with root package name */
    private final Path f57319a = new Path();

    /* renamed from: f  reason: collision with root package name */
    private final b f57324f = new b();

    public q(com.airbnb.lottie.a aVar, d8.b bVar, c8.p pVar) {
        pVar.b();
        this.f57320b = pVar.d();
        this.f57321c = aVar;
        y7.a<c8.m, Path> l11 = pVar.c().l();
        this.f57322d = l11;
        bVar.h(l11);
        l11.a(this);
    }

    private void c() {
        this.f57323e = false;
        this.f57321c.invalidateSelf();
    }

    @Override // y7.a.b
    public void a() {
        c();
    }

    @Override // x7.c
    public void b(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVar = list.get(i11);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.i() == r.a.SIMULTANEOUSLY) {
                    this.f57324f.a(sVar);
                    sVar.c(this);
                }
            }
        }
    }

    @Override // x7.m
    public Path getPath() {
        if (this.f57323e) {
            return this.f57319a;
        }
        this.f57319a.reset();
        if (this.f57320b) {
            this.f57323e = true;
            return this.f57319a;
        }
        Path h11 = this.f57322d.h();
        if (h11 == null) {
            return this.f57319a;
        }
        this.f57319a.set(h11);
        this.f57319a.setFillType(Path.FillType.EVEN_ODD);
        this.f57324f.b(this.f57319a);
        this.f57323e = true;
        return this.f57319a;
    }
}