package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;
import wz.w;

/* loaded from: classes5.dex */
public interface g extends Iterable<c>, i00.a {

    /* renamed from: d1 */
    public static final a f34943d1 = a.f34944a;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f34944a = new a();

        /* renamed from: b */
        private static final g f34945b = new C0650a();

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a$a */
        /* loaded from: classes5.dex */
        public static final class C0650a implements g {
            C0650a() {
            }

            public Void b(u10.c fqName) {
                s.g(fqName, "fqName");
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
            public boolean b1(u10.c cVar) {
                return b.b(this, cVar);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator<c> iterator() {
                List i11;
                i11 = w.i();
                return i11.iterator();
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
            public /* bridge */ /* synthetic */ c l(u10.c cVar) {
                return (c) b(cVar);
            }

            public String toString() {
                return "EMPTY";
            }
        }

        private a() {
        }

        public final g a(List<? extends c> annotations) {
            s.g(annotations, "annotations");
            return annotations.isEmpty() ? f34945b : new h(annotations);
        }

        public final g b() {
            return f34945b;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        public static c a(g gVar, u10.c fqName) {
            c cVar;
            s.g(gVar, "this");
            s.g(fqName, "fqName");
            Iterator<c> it2 = gVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    cVar = null;
                    break;
                }
                cVar = it2.next();
                if (s.c(cVar.e(), fqName)) {
                    break;
                }
            }
            return cVar;
        }

        public static boolean b(g gVar, u10.c fqName) {
            s.g(gVar, "this");
            s.g(fqName, "fqName");
            return gVar.l(fqName) != null;
        }
    }

    boolean b1(u10.c cVar);

    boolean isEmpty();

    c l(u10.c cVar);
}