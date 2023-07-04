package k20;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class q {
    private static /* synthetic */ void a(int i11) {
        String str = i11 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i11 != 4 ? 3 : 2];
        switch (i11) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i11 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i11 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i11 == 4) {
            throw new IllegalStateException(format);
        }
    }

    public static d1 b(List<w00.s0> list, b1 b1Var, w00.i iVar, List<w00.s0> list2) {
        if (list == null) {
            a(0);
        }
        if (b1Var == null) {
            a(1);
        }
        if (iVar == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        d1 c11 = c(list, b1Var, iVar, list2, null);
        if (c11 != null) {
            return c11;
        }
        throw new AssertionError("Substitution failed");
    }

    public static d1 c(List<w00.s0> list, b1 b1Var, w00.i iVar, List<w00.s0> list2, boolean[] zArr) {
        if (list == null) {
            a(5);
        }
        if (b1Var == null) {
            a(6);
        }
        if (iVar == null) {
            a(7);
        }
        if (list2 == null) {
            a(8);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i11 = 0;
        for (w00.s0 s0Var : list) {
            y00.k0 M0 = y00.k0.M0(iVar, s0Var.mo140getAnnotations(), s0Var.v(), s0Var.k(), s0Var.getName(), i11, w00.n0.f55303a, s0Var.K());
            hashMap.put(s0Var.mo234i(), new a1(M0.n()));
            hashMap2.put(s0Var, M0);
            list2.add(M0);
            i11++;
        }
        x0 j11 = x0.j(hashMap);
        d1 h11 = d1.h(b1Var, j11);
        d1 h12 = d1.h(b1Var.h(), j11);
        for (w00.s0 s0Var2 : list) {
            y00.k0 k0Var = (y00.k0) hashMap2.get(s0Var2);
            for (d0 d0Var : s0Var2.getUpperBounds()) {
                w00.e n11 = d0Var.H0().n();
                d0 p11 = (((n11 instanceof w00.s0) && n20.a.j((w00.s0) n11)) ? h11 : h12).p(d0Var, k1.OUT_VARIANCE);
                if (p11 == null) {
                    return null;
                }
                if (p11 != d0Var && zArr != null) {
                    zArr[0] = true;
                }
                k0Var.I0(p11);
            }
            k0Var.Q0();
        }
        return h11;
    }
}