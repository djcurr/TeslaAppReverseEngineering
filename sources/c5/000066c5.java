package e10;

import kotlin.reflect.jvm.internal.impl.descriptors.b;
import w00.i0;

/* loaded from: classes5.dex */
public final class k {
    private static /* synthetic */ void a(int i11) {
        Object[] objArr = new Object[3];
        if (i11 == 1 || i11 == 2) {
            objArr[0] = "companionObject";
        } else if (i11 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i11 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i11 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i11 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        w00.r r02;
        if (bVar == null) {
            a(3);
        }
        if ((bVar instanceof i0) && (r02 = ((i0) bVar).r0()) != null && r02.getAnnotations().b1(y.f24510b)) {
            return true;
        }
        return bVar.getAnnotations().b1(y.f24510b);
    }

    public static boolean c(w00.i iVar) {
        if (iVar == null) {
            a(1);
        }
        return w10.d.x(iVar) && w10.d.w(iVar.b()) && !d((w00.c) iVar);
    }

    public static boolean d(w00.c cVar) {
        if (cVar == null) {
            a(2);
        }
        return t00.d.a(t00.c.f51279a, cVar);
    }

    public static boolean e(i0 i0Var) {
        if (i0Var == null) {
            a(0);
        }
        if (i0Var.getKind() == b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (c(i0Var.b())) {
            return true;
        }
        return w10.d.x(i0Var.b()) && b(i0Var);
    }
}