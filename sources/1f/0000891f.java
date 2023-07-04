package n10;

import kotlin.NoWhenBranchMatchedException;
import n10.j;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes5.dex */
final class l implements k<j> {

    /* renamed from: a  reason: collision with root package name */
    public static final l f40219a = new l();

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40220a;

        static {
            int[] iArr = new int[t00.i.values().length];
            iArr[t00.i.BOOLEAN.ordinal()] = 1;
            iArr[t00.i.CHAR.ordinal()] = 2;
            iArr[t00.i.BYTE.ordinal()] = 3;
            iArr[t00.i.SHORT.ordinal()] = 4;
            iArr[t00.i.INT.ordinal()] = 5;
            iArr[t00.i.FLOAT.ordinal()] = 6;
            iArr[t00.i.LONG.ordinal()] = 7;
            iArr[t00.i.DOUBLE.ordinal()] = 8;
            f40220a = iArr;
        }
    }

    private l() {
    }

    @Override // n10.k
    /* renamed from: g */
    public j b(j possiblyPrimitiveType) {
        kotlin.jvm.internal.s.g(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (possiblyPrimitiveType instanceof j.d) {
            j.d dVar = (j.d) possiblyPrimitiveType;
            if (dVar.i() != null) {
                String f11 = b20.d.c(dVar.i().getWrapperFqName()).f();
                kotlin.jvm.internal.s.f(f11, "byFqNameWithoutInnerClas…apperFqName).internalName");
                return e(f11);
            }
            return possiblyPrimitiveType;
        }
        return possiblyPrimitiveType;
    }

    @Override // n10.k
    /* renamed from: h */
    public j a(String representation) {
        b20.e eVar;
        j cVar;
        kotlin.jvm.internal.s.g(representation, "representation");
        representation.length();
        char charAt = representation.charAt(0);
        b20.e[] values = b20.e.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                eVar = null;
                break;
            }
            eVar = values[i11];
            if (eVar.getDesc().charAt(0) == charAt) {
                break;
            }
            i11++;
        }
        if (eVar == null) {
            if (charAt == 'V') {
                return new j.d(null);
            }
            if (charAt == '[') {
                String substring = representation.substring(1);
                kotlin.jvm.internal.s.f(substring, "(this as java.lang.String).substring(startIndex)");
                cVar = new j.a(a(substring));
            } else {
                if (charAt == 'L') {
                    kotlin.text.w.P(representation, ';', false, 2, null);
                }
                String substring2 = representation.substring(1, representation.length() - 1);
                kotlin.jvm.internal.s.f(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                cVar = new j.c(substring2);
            }
            return cVar;
        }
        return new j.d(eVar);
    }

    @Override // n10.k
    /* renamed from: i */
    public j.c e(String internalName) {
        kotlin.jvm.internal.s.g(internalName, "internalName");
        return new j.c(internalName);
    }

    @Override // n10.k
    /* renamed from: j */
    public j c(t00.i primitiveType) {
        kotlin.jvm.internal.s.g(primitiveType, "primitiveType");
        switch (a.f40220a[primitiveType.ordinal()]) {
            case 1:
                return j.f40207a.a();
            case 2:
                return j.f40207a.c();
            case 3:
                return j.f40207a.b();
            case 4:
                return j.f40207a.h();
            case 5:
                return j.f40207a.f();
            case 6:
                return j.f40207a.e();
            case 7:
                return j.f40207a.g();
            case 8:
                return j.f40207a.d();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // n10.k
    /* renamed from: k */
    public j f() {
        return e("java/lang/Class");
    }

    @Override // n10.k
    /* renamed from: l */
    public String d(j type) {
        String desc;
        kotlin.jvm.internal.s.g(type, "type");
        if (type instanceof j.a) {
            return kotlin.jvm.internal.s.p("[", d(((j.a) type).i()));
        }
        if (type instanceof j.d) {
            b20.e i11 = ((j.d) type).i();
            return (i11 == null || (desc = i11.getDesc()) == null) ? "V" : desc;
        } else if (type instanceof j.c) {
            return Matrix.MATRIX_TYPE_RANDOM_LT + ((j.c) type).i() + ';';
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}