package v20;

import zz.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class h3 implements g.b, g.c<h3> {

    /* renamed from: a  reason: collision with root package name */
    public static final h3 f53942a = new h3();

    private h3() {
    }

    @Override // zz.g
    public <R> R fold(R r11, h00.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r11, pVar);
    }

    @Override // zz.g.b, zz.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // zz.g.b
    public g.c<?> getKey() {
        return this;
    }

    @Override // zz.g
    public zz.g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // zz.g
    public zz.g plus(zz.g gVar) {
        return g.b.a.d(this, gVar);
    }
}