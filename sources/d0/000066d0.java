package e10;

import java.util.HashMap;
import java.util.Map;
import w00.z0;

/* loaded from: classes5.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    public static final w00.q f24482a;

    /* renamed from: b  reason: collision with root package name */
    public static final w00.q f24483b;

    /* renamed from: c  reason: collision with root package name */
    public static final w00.q f24484c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map<z0, w00.q> f24485d;

    /* loaded from: classes5.dex */
    static class a extends w00.n {
        a(z0 z0Var) {
            super(z0Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // w00.q
        public boolean e(e20.d dVar, w00.m mVar, w00.i iVar) {
            if (mVar == null) {
                g(0);
            }
            if (iVar == null) {
                g(1);
            }
            return r.d(mVar, iVar);
        }
    }

    /* loaded from: classes5.dex */
    static class b extends w00.n {
        b(z0 z0Var) {
            super(z0Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // w00.q
        public boolean e(e20.d dVar, w00.m mVar, w00.i iVar) {
            if (mVar == null) {
                g(0);
            }
            if (iVar == null) {
                g(1);
            }
            return r.e(dVar, mVar, iVar);
        }
    }

    /* loaded from: classes5.dex */
    static class c extends w00.n {
        c(z0 z0Var) {
            super(z0Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // w00.q
        public boolean e(e20.d dVar, w00.m mVar, w00.i iVar) {
            if (mVar == null) {
                g(0);
            }
            if (iVar == null) {
                g(1);
            }
            return r.e(dVar, mVar, iVar);
        }
    }

    static {
        a aVar = new a(z00.a.f60038c);
        f24482a = aVar;
        b bVar = new b(z00.c.f60040c);
        f24483b = bVar;
        c cVar = new c(z00.b.f60039c);
        f24484c = cVar;
        f24485d = new HashMap();
        f(aVar);
        f(bVar);
        f(cVar);
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 5 || i11 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 5 || i11 == 6) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i11 == 5 || i11 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i11 == 2 || i11 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i11 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i11 != 5 && i11 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        if (i11 != 5 && i11 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(w00.i iVar, w00.i iVar2) {
        if (iVar == null) {
            a(2);
        }
        if (iVar2 == null) {
            a(3);
        }
        w00.a0 a0Var = (w00.a0) w10.d.r(iVar, w00.a0.class, false);
        w00.a0 a0Var2 = (w00.a0) w10.d.r(iVar2, w00.a0.class, false);
        return (a0Var2 == null || a0Var == null || !a0Var.e().equals(a0Var2.e())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(e20.d dVar, w00.m mVar, w00.i iVar) {
        if (mVar == null) {
            a(0);
        }
        if (iVar == null) {
            a(1);
        }
        if (d(w10.d.M(mVar), iVar)) {
            return true;
        }
        return w00.p.f55307c.e(dVar, mVar, iVar);
    }

    private static void f(w00.q qVar) {
        f24485d.put(qVar.b(), qVar);
    }

    public static w00.q g(z0 z0Var) {
        if (z0Var == null) {
            a(4);
        }
        w00.q qVar = f24485d.get(z0Var);
        if (qVar == null) {
            w00.q j11 = w00.p.j(z0Var);
            if (j11 == null) {
                a(5);
            }
            return j11;
        }
        return qVar;
    }
}