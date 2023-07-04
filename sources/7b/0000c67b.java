package zz;

import h00.p;
import java.io.Serializable;
import kotlin.jvm.internal.s;
import zz.g;

/* loaded from: classes5.dex */
public final class h implements g, Serializable {

    /* renamed from: a */
    public static final h f61280a = new h();

    private h() {
    }

    @Override // zz.g
    public <R> R fold(R r11, p<? super R, ? super g.b, ? extends R> operation) {
        s.g(operation, "operation");
        return r11;
    }

    @Override // zz.g
    public <E extends g.b> E get(g.c<E> key) {
        s.g(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // zz.g
    public g minusKey(g.c<?> key) {
        s.g(key, "key");
        return this;
    }

    @Override // zz.g
    public g plus(g context) {
        s.g(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}