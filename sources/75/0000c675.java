package zz;

import h00.p;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import zz.e;

/* loaded from: classes5.dex */
public interface g {

    /* loaded from: classes5.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zz.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C1414a extends u implements p<g, b, g> {

            /* renamed from: a  reason: collision with root package name */
            public static final C1414a f61279a = new C1414a();

            C1414a() {
                super(2);
            }

            @Override // h00.p
            /* renamed from: a */
            public final g invoke(g acc, b element) {
                zz.c cVar;
                s.g(acc, "acc");
                s.g(element, "element");
                g minusKey = acc.minusKey(element.getKey());
                h hVar = h.f61280a;
                if (minusKey == hVar) {
                    return element;
                }
                e.b bVar = e.f61277h3;
                e eVar = (e) minusKey.get(bVar);
                if (eVar == null) {
                    cVar = new zz.c(minusKey, element);
                } else {
                    g minusKey2 = minusKey.minusKey(bVar);
                    if (minusKey2 == hVar) {
                        return new zz.c(element, eVar);
                    }
                    cVar = new zz.c(new zz.c(minusKey2, element), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g context) {
            s.g(context, "context");
            return context == h.f61280a ? gVar : (g) context.fold(gVar, C1414a.f61279a);
        }
    }

    /* loaded from: classes5.dex */
    public interface b extends g {

        /* loaded from: classes5.dex */
        public static final class a {
            public static <R> R a(b bVar, R r11, p<? super R, ? super b, ? extends R> operation) {
                s.g(operation, "operation");
                return operation.invoke(r11, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> key) {
                s.g(key, "key");
                if (s.c(bVar.getKey(), key)) {
                    return bVar;
                }
                return null;
            }

            public static g c(b bVar, c<?> key) {
                s.g(key, "key");
                return s.c(bVar.getKey(), key) ? h.f61280a : bVar;
            }

            public static g d(b bVar, g context) {
                s.g(context, "context");
                return a.a(bVar, context);
            }
        }

        @Override // zz.g
        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    /* loaded from: classes5.dex */
    public interface c<E extends b> {
    }

    <R> R fold(R r11, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    g minusKey(c<?> cVar);

    g plus(g gVar);
}