package m10;

import e10.z;
import java.util.List;
import k20.d0;
import wz.e0;
import wz.u;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final b f38357a;

    /* renamed from: b  reason: collision with root package name */
    private static final b f38358b;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38359a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f38360b;

        static {
            int[] iArr = new int[f.values().length];
            iArr[f.READ_ONLY.ordinal()] = 1;
            iArr[f.MUTABLE.ordinal()] = 2;
            f38359a = iArr;
            int[] iArr2 = new int[h.values().length];
            iArr2[h.NULLABLE.ordinal()] = 1;
            iArr2[h.NOT_NULL.ordinal()] = 2;
            f38360b = iArr2;
        }
    }

    static {
        u10.c ENHANCED_NULLABILITY_ANNOTATION = z.f24525o;
        kotlin.jvm.internal.s.f(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f38357a = new b(ENHANCED_NULLABILITY_ANNOTATION);
        u10.c ENHANCED_MUTABILITY_ANNOTATION = z.f24526p;
        kotlin.jvm.internal.s.f(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f38358b = new b(ENHANCED_MUTABILITY_ANNOTATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.g> list) {
        List O0;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                O0 = e0.O0(list);
                return new kotlin.reflect.jvm.internal.impl.descriptors.annotations.k(O0);
            }
            return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.g) u.C0(list);
        }
        throw new IllegalStateException("At least one Annotations object expected".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c<w00.e> e(w00.e eVar, e eVar2, p pVar) {
        if (q.a(pVar) && (eVar instanceof w00.c)) {
            v00.d dVar = v00.d.f53803a;
            f b11 = eVar2.b();
            int i11 = b11 == null ? -1 : a.f38359a[b11.ordinal()];
            if (i11 != 1) {
                if (i11 == 2 && pVar == p.FLEXIBLE_UPPER) {
                    w00.c cVar = (w00.c) eVar;
                    if (dVar.f(cVar)) {
                        return f(dVar.b(cVar));
                    }
                }
            } else if (pVar == p.FLEXIBLE_LOWER) {
                w00.c cVar2 = (w00.c) eVar;
                if (dVar.d(cVar2)) {
                    return f(dVar.a(cVar2));
                }
            }
            return j(eVar);
        }
        return j(eVar);
    }

    private static final <T> c<T> f(T t11) {
        return new c<>(t11, f38358b);
    }

    private static final <T> c<T> g(T t11) {
        return new c<>(t11, f38357a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c<Boolean> h(d0 d0Var, e eVar, p pVar) {
        if (q.a(pVar)) {
            h c11 = eVar.c();
            int i11 = c11 == null ? -1 : a.f38360b[c11.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    return j(Boolean.valueOf(d0Var.I0()));
                }
                return g(Boolean.FALSE);
            }
            return g(Boolean.TRUE);
        }
        return j(Boolean.valueOf(d0Var.I0()));
    }

    public static final boolean i(d0 d0Var) {
        kotlin.jvm.internal.s.g(d0Var, "<this>");
        return r.b(kotlin.reflect.jvm.internal.impl.types.checker.r.f35177a, d0Var);
    }

    private static final <T> c<T> j(T t11) {
        return new c<>(t11, null);
    }
}