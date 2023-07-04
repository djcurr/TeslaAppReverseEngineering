package y20;

import zz.g;

/* loaded from: classes5.dex */
public final class j implements zz.g {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f59049a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zz.g f59050b;

    public j(Throwable th2, zz.g gVar) {
        this.f59049a = th2;
        this.f59050b = gVar;
    }

    @Override // zz.g
    public <R> R fold(R r11, h00.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) this.f59050b.fold(r11, pVar);
    }

    @Override // zz.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) this.f59050b.get(cVar);
    }

    @Override // zz.g
    public zz.g minusKey(g.c<?> cVar) {
        return this.f59050b.minusKey(cVar);
    }

    @Override // zz.g
    public zz.g plus(zz.g gVar) {
        return this.f59050b.plus(gVar);
    }
}