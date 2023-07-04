package ku;

import java.util.List;
import tt.l;
import wz.w;

/* loaded from: classes6.dex */
public interface e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f35884a = a.f35885a;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f35885a = new a();

        private a() {
        }

        public final e a() {
            return g.f35886f.a();
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {
        public static /* synthetic */ void a(e eVar, tt.h hVar, long j11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementMetricForActiveTraces");
            }
            if ((i11 & 2) != 0) {
                j11 = 1;
            }
            eVar.l(hVar, j11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void b(e eVar, l lVar, List list, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTrace");
            }
            if ((i11 & 2) != 0) {
                list = w.i();
            }
            eVar.j(lVar, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void c(e eVar, l lVar, List list, List list2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopTrace");
            }
            if ((i11 & 2) != 0) {
                list = w.i();
            }
            if ((i11 & 4) != 0) {
                list2 = w.i();
            }
            eVar.e(lVar, list, list2);
        }
    }

    static e d() {
        return f35884a.a();
    }

    void a(l lVar, String str, List<ku.a> list);

    f b(String str, tt.e eVar, long j11);

    void c(l lVar);

    void e(l lVar, List<ku.a> list, List<tt.i> list2);

    i f(l lVar, List<ku.a> list);

    void g(l lVar, String str, List<ku.a> list);

    void h(l lVar);

    void i(tt.g gVar);

    void j(l lVar, List<ku.a> list);

    void k(tt.f fVar);

    void l(tt.h hVar, long j11);
}