package f10;

import java.util.Collections;
import java.util.List;
import k20.d0;
import l10.r;
import w00.s0;
import w00.v0;

/* loaded from: classes5.dex */
public interface j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f25542a = new a();

    /* loaded from: classes5.dex */
    static class a implements j {
        a() {
        }

        private static /* synthetic */ void c(int i11) {
            Object[] objArr = new Object[3];
            switch (i11) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i11 == 5 || i11 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // f10.j
        public void a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, List<String> list) {
            if (bVar == null) {
                c(5);
            }
            if (list == null) {
                c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // f10.j
        public b b(r rVar, w00.c cVar, d0 d0Var, d0 d0Var2, List<v0> list, List<s0> list2) {
            if (rVar == null) {
                c(0);
            }
            if (cVar == null) {
                c(1);
            }
            if (d0Var == null) {
                c(2);
            }
            if (list == null) {
                c(3);
            }
            if (list2 == null) {
                c(4);
            }
            return new b(d0Var, d0Var2, list, list2, Collections.emptyList(), false);
        }
    }

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final d0 f25543a;

        /* renamed from: b  reason: collision with root package name */
        private final d0 f25544b;

        /* renamed from: c  reason: collision with root package name */
        private final List<v0> f25545c;

        /* renamed from: d  reason: collision with root package name */
        private final List<s0> f25546d;

        /* renamed from: e  reason: collision with root package name */
        private final List<String> f25547e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f25548f;

        public b(d0 d0Var, d0 d0Var2, List<v0> list, List<s0> list2, List<String> list3, boolean z11) {
            if (d0Var == null) {
                a(0);
            }
            if (list == null) {
                a(1);
            }
            if (list2 == null) {
                a(2);
            }
            if (list3 == null) {
                a(3);
            }
            this.f25543a = d0Var;
            this.f25544b = d0Var2;
            this.f25545c = list;
            this.f25546d = list2;
            this.f25547e = list3;
            this.f25548f = z11;
        }

        private static /* synthetic */ void a(int i11) {
            String str = (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : 3];
            switch (i11) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i11 == 4) {
                objArr[1] = "getReturnType";
            } else if (i11 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i11 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i11 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        public List<String> b() {
            List<String> list = this.f25547e;
            if (list == null) {
                a(7);
            }
            return list;
        }

        public d0 c() {
            return this.f25544b;
        }

        public d0 d() {
            d0 d0Var = this.f25543a;
            if (d0Var == null) {
                a(4);
            }
            return d0Var;
        }

        public List<s0> e() {
            List<s0> list = this.f25546d;
            if (list == null) {
                a(6);
            }
            return list;
        }

        public List<v0> f() {
            List<v0> list = this.f25545c;
            if (list == null) {
                a(5);
            }
            return list;
        }

        public boolean g() {
            return this.f25548f;
        }
    }

    void a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, List<String> list);

    b b(r rVar, w00.c cVar, d0 d0Var, d0 d0Var2, List<v0> list, List<s0> list2);
}