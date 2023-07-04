package la;

import la.h;

/* loaded from: classes.dex */
public class g extends bb.g<ha.b, ja.c<?>> implements h {

    /* renamed from: d  reason: collision with root package name */
    private h.a f37138d;

    public g(long j11) {
        super(j11);
    }

    @Override // la.h
    public void a(int i11) {
        if (i11 >= 40) {
            d();
        } else if (i11 >= 20 || i11 == 15) {
            m(h() / 2);
        }
    }

    @Override // la.h
    public /* bridge */ /* synthetic */ ja.c b(ha.b bVar) {
        return (ja.c) super.l(bVar);
    }

    @Override // la.h
    public void c(h.a aVar) {
        this.f37138d = aVar;
    }

    @Override // la.h
    public /* bridge */ /* synthetic */ ja.c e(ha.b bVar, ja.c cVar) {
        return (ja.c) super.k(bVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bb.g
    /* renamed from: n */
    public int i(ja.c<?> cVar) {
        if (cVar == null) {
            return super.i(null);
        }
        return cVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bb.g
    /* renamed from: o */
    public void j(ha.b bVar, ja.c<?> cVar) {
        h.a aVar = this.f37138d;
        if (aVar == null || cVar == null) {
            return;
        }
        aVar.c(cVar);
    }
}