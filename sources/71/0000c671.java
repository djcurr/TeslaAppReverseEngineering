package zz;

import kotlin.jvm.internal.s;
import zz.g;

/* loaded from: classes5.dex */
public interface e extends g.b {

    /* renamed from: h3 */
    public static final b f61277h3 = b.f61278a;

    /* loaded from: classes5.dex */
    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> key) {
            s.g(key, "key");
            if (key instanceof zz.b) {
                zz.b bVar = (zz.b) key;
                if (bVar.a(eVar.getKey())) {
                    E e11 = (E) bVar.b(eVar);
                    if (e11 instanceof g.b) {
                        return e11;
                    }
                    return null;
                }
                return null;
            } else if (e.f61277h3 == key) {
                return eVar;
            } else {
                return null;
            }
        }

        public static g b(e eVar, g.c<?> key) {
            s.g(key, "key");
            if (!(key instanceof zz.b)) {
                return e.f61277h3 == key ? h.f61280a : eVar;
            }
            zz.b bVar = (zz.b) key;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f61280a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements g.c<e> {

        /* renamed from: a */
        static final /* synthetic */ b f61278a = new b();

        private b() {
        }
    }

    void C(d<?> dVar);

    <T> d<T> D0(d<? super T> dVar);
}