package zz;

import h00.p;
import java.io.Serializable;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import zz.g;

/* loaded from: classes5.dex */
public final class c implements g, Serializable {

    /* renamed from: a */
    private final g f61274a;

    /* renamed from: b */
    private final g.b f61275b;

    /* loaded from: classes5.dex */
    static final class a extends u implements p<String, g.b, String> {

        /* renamed from: a */
        public static final a f61276a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final String invoke(String acc, g.b element) {
            s.g(acc, "acc");
            s.g(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public c(g left, g.b element) {
        s.g(left, "left");
        s.g(element, "element");
        this.f61274a = left;
        this.f61275b = element;
    }

    private final boolean b(g.b bVar) {
        return s.c(get(bVar.getKey()), bVar);
    }

    private final boolean c(c cVar) {
        while (b(cVar.f61275b)) {
            g gVar = cVar.f61274a;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                return b((g.b) gVar);
            }
        }
        return false;
    }

    private final int d() {
        int i11 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f61274a;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i11;
            }
            i11++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.d() != d() || !cVar.c(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // zz.g
    public <R> R fold(R r11, p<? super R, ? super g.b, ? extends R> operation) {
        s.g(operation, "operation");
        return operation.invoke((Object) this.f61274a.fold(r11, operation), this.f61275b);
    }

    @Override // zz.g
    public <E extends g.b> E get(g.c<E> key) {
        s.g(key, "key");
        c cVar = this;
        while (true) {
            E e11 = (E) cVar.f61275b.get(key);
            if (e11 != null) {
                return e11;
            }
            g gVar = cVar.f61274a;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                return (E) gVar.get(key);
            }
        }
    }

    public int hashCode() {
        return this.f61274a.hashCode() + this.f61275b.hashCode();
    }

    @Override // zz.g
    public g minusKey(g.c<?> key) {
        s.g(key, "key");
        if (this.f61275b.get(key) != null) {
            return this.f61274a;
        }
        g minusKey = this.f61274a.minusKey(key);
        return minusKey == this.f61274a ? this : minusKey == h.f61280a ? this.f61275b : new c(minusKey, this.f61275b);
    }

    @Override // zz.g
    public g plus(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f61276a)) + ']';
    }
}