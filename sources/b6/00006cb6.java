package f10;

import l10.l;
import l10.n;
import l10.q;
import w00.i0;

/* loaded from: classes5.dex */
public interface g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f25535a = new a();

    /* loaded from: classes5.dex */
    static class a implements g {
        a() {
        }

        private static /* synthetic */ void f(int i11) {
            Object[] objArr = new Object[3];
            switch (i11) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i11) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // f10.g
        public void a(l lVar, kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
            if (lVar == null) {
                f(3);
            }
            if (dVar == null) {
                f(4);
            }
        }

        @Override // f10.g
        public void b(l10.g gVar, w00.c cVar) {
            if (gVar == null) {
                f(7);
            }
            if (cVar == null) {
                f(8);
            }
        }

        @Override // f10.g
        public w00.c c(u10.c cVar) {
            if (cVar == null) {
                f(0);
                return null;
            }
            return null;
        }

        @Override // f10.g
        public void d(n nVar, i0 i0Var) {
            if (nVar == null) {
                f(5);
            }
            if (i0Var == null) {
                f(6);
            }
        }

        @Override // f10.g
        public void e(q qVar, kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
            if (qVar == null) {
                f(1);
            }
            if (hVar == null) {
                f(2);
            }
        }
    }

    void a(l lVar, kotlin.reflect.jvm.internal.impl.descriptors.d dVar);

    void b(l10.g gVar, w00.c cVar);

    w00.c c(u10.c cVar);

    void d(n nVar, i0 i0Var);

    void e(q qVar, kotlin.reflect.jvm.internal.impl.descriptors.h hVar);
}