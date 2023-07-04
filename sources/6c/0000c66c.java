package zz;

import h00.p;
import kotlin.jvm.internal.s;
import zz.g;

/* loaded from: classes5.dex */
public abstract class a implements g.b {
    private final g.c<?> key;

    public a(g.c<?> key) {
        s.g(key, "key");
        this.key = key;
    }

    @Override // zz.g
    public <R> R fold(R r11, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r11, pVar);
    }

    @Override // zz.g.b, zz.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // zz.g.b
    public g.c<?> getKey() {
        return this.key;
    }

    @Override // zz.g
    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // zz.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}