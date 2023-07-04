package t00;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k20.a1;
import k20.d0;
import k20.e0;
import k20.f1;
import k20.k0;
import k20.k1;
import k20.w0;
import org.spongycastle.crypto.tls.CipherSuite;
import t00.k;
import w00.a0;
import w00.f0;
import w00.i0;
import w00.j0;
import w00.s;
import x00.a;
import x00.c;
import y00.x;

/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: f */
    public static final u10.f f51283f = u10.f.i("<built-ins module>");

    /* renamed from: a */
    private x f51284a;

    /* renamed from: b */
    private j20.i<x> f51285b;

    /* renamed from: c */
    private final j20.i<e> f51286c;

    /* renamed from: d */
    private final j20.g<u10.f, w00.c> f51287d;

    /* renamed from: e */
    private final j20.n f51288e;

    /* loaded from: classes5.dex */
    public class a implements h00.a<Collection<f0>> {
        a() {
            h.this = r1;
        }

        @Override // h00.a
        /* renamed from: a */
        public Collection<f0> invoke() {
            return Arrays.asList(h.this.r().R(k.f51317l), h.this.r().R(k.f51319n), h.this.r().R(k.f51320o), h.this.r().R(k.f51318m));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements h00.a<e> {
        b() {
            h.this = r1;
        }

        @Override // h00.a
        /* renamed from: a */
        public e invoke() {
            i[] values;
            EnumMap enumMap = new EnumMap(i.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (i iVar : i.values()) {
                k0 q11 = h.this.q(iVar.getTypeName().b());
                k0 q12 = h.this.q(iVar.getArrayTypeName().b());
                enumMap.put((EnumMap) iVar, (i) q12);
                hashMap.put(q11, q12);
                hashMap2.put(q12, q11);
            }
            return new e(enumMap, hashMap, hashMap2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c implements h00.l<u10.f, w00.c> {
        c() {
            h.this = r1;
        }

        @Override // h00.l
        /* renamed from: a */
        public w00.c invoke(u10.f fVar) {
            w00.e e11 = h.this.s().e(fVar, d10.d.FROM_BUILTINS);
            if (e11 != null) {
                if (e11 instanceof w00.c) {
                    return (w00.c) e11;
                }
                throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + e11);
            }
            throw new AssertionError("Built-in class " + k.f51317l.c(fVar) + " is not found");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class d implements h00.a<Void> {

        /* renamed from: a */
        final /* synthetic */ x f51292a;

        d(x xVar) {
            h.this = r1;
            this.f51292a = xVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public Void invoke() {
            if (h.this.f51284a != null) {
                throw new AssertionError("Built-ins module is already set: " + h.this.f51284a + " (attempting to reset to " + this.f51292a + ")");
            }
            h.this.f51284a = this.f51292a;
            return null;
        }
    }

    /* loaded from: classes5.dex */
    public static class e {

        /* renamed from: a */
        public final Map<i, k0> f51294a;

        /* renamed from: b */
        public final Map<d0, k0> f51295b;

        /* renamed from: c */
        public final Map<k0, k0> f51296c;

        /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i11 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private e(Map<i, k0> map, Map<d0, k0> map2, Map<k0, k0> map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.f51294a = map;
            this.f51295b = map2;
            this.f51296c = map3;
        }
    }

    public h(j20.n nVar) {
        if (nVar == null) {
            a(0);
        }
        this.f51288e = nVar;
        nVar.b(new a());
        this.f51286c = nVar.b(new b());
        this.f51287d = nVar.e(new c());
    }

    private static d0 A(d0 d0Var, w00.x xVar) {
        u10.b h11;
        u10.b a11;
        w00.c a12;
        if (d0Var == null) {
            a(71);
        }
        if (xVar == null) {
            a(72);
        }
        w00.e n11 = d0Var.H0().n();
        if (n11 == null) {
            return null;
        }
        o oVar = o.f51359a;
        if (!oVar.b(n11.getName()) || (h11 = a20.a.h(n11)) == null || (a11 = oVar.a(h11)) == null || (a12 = s.a(xVar, a11)) == null) {
            return null;
        }
        return a12.n();
    }

    public static boolean A0(d0 d0Var) {
        if (d0Var == null) {
            a(142);
        }
        return k0(d0Var, k.a.f51330e);
    }

    public static boolean B0(d0 d0Var) {
        if (d0Var == null) {
            a(132);
        }
        return v0(d0Var) || y0(d0Var) || w0(d0Var) || x0(d0Var);
    }

    public static i N(d0 d0Var) {
        if (d0Var == null) {
            a(92);
        }
        w00.e n11 = d0Var.H0().n();
        if (n11 == null) {
            return null;
        }
        return P(n11);
    }

    public static i P(w00.i iVar) {
        if (iVar == null) {
            a(77);
        }
        if (k.a.f51335g0.contains(iVar.getName())) {
            return k.a.f51339i0.get(w10.d.m(iVar));
        }
        return null;
    }

    private w00.c Q(i iVar) {
        if (iVar == null) {
            a(16);
        }
        return p(iVar.getTypeName().b());
    }

    public static i S(w00.i iVar) {
        if (iVar == null) {
            a(76);
        }
        if (k.a.f51333f0.contains(iVar.getName())) {
            return k.a.f51337h0.get(w10.d.m(iVar));
        }
        return null;
    }

    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i12 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 145:
            case 146:
            case 148:
            case 156:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
            case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
            case SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 147:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384 /* 161 */:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i11) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i11) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                objArr[2] = "isUShortArray";
                break;
            case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                objArr[2] = "isUIntArray";
                break;
            case SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 144:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 145:
                objArr[2] = "isMemberOfAny";
                break;
            case 146:
            case 147:
                objArr[2] = "isEnum";
                break;
            case 148:
            case 149:
                objArr[2] = "isComparable";
                break;
            case 150:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 151:
                objArr[2] = "isListOrNullableList";
                break;
            case 152:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 153:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 154:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 155:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 156:
                objArr[2] = "isThrowable";
                break;
            case 157:
                objArr[2] = "isKClass";
                break;
            case 158:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 159:
                objArr[2] = "isCloneable";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384 /* 161 */:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(format);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean a0(w00.c cVar) {
        if (cVar == null) {
            a(108);
        }
        return e(cVar, k.a.f51324b);
    }

    public static boolean b0(d0 d0Var) {
        if (d0Var == null) {
            a(139);
        }
        return f0(d0Var, k.a.f51324b);
    }

    public static boolean c0(d0 d0Var) {
        if (d0Var == null) {
            a(88);
        }
        return f0(d0Var, k.a.f51336h);
    }

    public static boolean d0(w00.c cVar) {
        if (cVar == null) {
            a(89);
        }
        return e(cVar, k.a.f51336h) || P(cVar) != null;
    }

    private static boolean e(w00.e eVar, u10.d dVar) {
        if (eVar == null) {
            a(103);
        }
        if (dVar == null) {
            a(104);
        }
        return eVar.getName().equals(dVar.i()) && dVar.equals(w10.d.m(eVar));
    }

    public static boolean e0(w00.i iVar) {
        if (iVar == null) {
            a(9);
        }
        return w10.d.r(iVar, t00.b.class, false) != null;
    }

    private static boolean f0(d0 d0Var, u10.d dVar) {
        if (d0Var == null) {
            a(97);
        }
        if (dVar == null) {
            a(98);
        }
        return u0(d0Var.H0(), dVar);
    }

    private static boolean g0(d0 d0Var, u10.d dVar) {
        if (d0Var == null) {
            a(134);
        }
        if (dVar == null) {
            a(135);
        }
        return f0(d0Var, dVar) && !d0Var.I0();
    }

    public static boolean h0(d0 d0Var) {
        if (d0Var == null) {
            a(141);
        }
        return n0(d0Var);
    }

    public static boolean i0(w00.i iVar) {
        if (iVar == null) {
            a(160);
        }
        if (iVar.a().getAnnotations().b1(k.a.f51344n)) {
            return true;
        }
        if (iVar instanceof i0) {
            i0 i0Var = (i0) iVar;
            boolean L = i0Var.L();
            j0 getter = i0Var.getGetter();
            w00.k0 setter = i0Var.getSetter();
            if (getter != null && i0(getter)) {
                if (!L) {
                    return true;
                }
                if (setter != null && i0(setter)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean j0(w00.c cVar) {
        if (cVar == null) {
            a(157);
        }
        return e(cVar, k.a.Q);
    }

    private static boolean k0(d0 d0Var, u10.d dVar) {
        if (d0Var == null) {
            a(105);
        }
        if (dVar == null) {
            a(106);
        }
        return !d0Var.I0() && f0(d0Var, dVar);
    }

    public static boolean l0(d0 d0Var) {
        if (d0Var == null) {
            a(136);
        }
        return m0(d0Var) && !f1.m(d0Var);
    }

    public static boolean m0(d0 d0Var) {
        if (d0Var == null) {
            a(138);
        }
        return f0(d0Var, k.a.f51326c);
    }

    public static boolean n0(d0 d0Var) {
        if (d0Var == null) {
            a(140);
        }
        return b0(d0Var) && d0Var.I0();
    }

    public static boolean o0(d0 d0Var) {
        if (d0Var == null) {
            a(91);
        }
        w00.e n11 = d0Var.H0().n();
        return (n11 == null || P(n11) == null) ? false : true;
    }

    private w00.c p(String str) {
        if (str == null) {
            a(14);
        }
        w00.c invoke = this.f51287d.invoke(u10.f.f(str));
        if (invoke == null) {
            a(15);
        }
        return invoke;
    }

    public static boolean p0(w00.c cVar) {
        if (cVar == null) {
            a(96);
        }
        return S(cVar) != null;
    }

    public k0 q(String str) {
        if (str == null) {
            a(46);
        }
        k0 n11 = p(str).n();
        if (n11 == null) {
            a(47);
        }
        return n11;
    }

    public static boolean q0(d0 d0Var) {
        if (d0Var == null) {
            a(94);
        }
        return !d0Var.I0() && r0(d0Var);
    }

    public static boolean r0(d0 d0Var) {
        if (d0Var == null) {
            a(95);
        }
        w00.e n11 = d0Var.H0().n();
        return (n11 instanceof w00.c) && p0((w00.c) n11);
    }

    public static boolean s0(w00.c cVar) {
        if (cVar == null) {
            a(107);
        }
        return e(cVar, k.a.f51324b) || e(cVar, k.a.f51326c);
    }

    public static boolean t0(d0 d0Var) {
        return d0Var != null && k0(d0Var, k.a.f51334g);
    }

    public static boolean u0(w0 w0Var, u10.d dVar) {
        if (w0Var == null) {
            a(101);
        }
        if (dVar == null) {
            a(102);
        }
        w00.e n11 = w0Var.n();
        return (n11 instanceof w00.c) && e(n11, dVar);
    }

    public static boolean v0(d0 d0Var) {
        if (d0Var == null) {
            a(128);
        }
        return g0(d0Var, k.a.f51325b0.j());
    }

    public static boolean w0(d0 d0Var) {
        if (d0Var == null) {
            a(com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
        }
        return g0(d0Var, k.a.f51329d0.j());
    }

    public static boolean x0(d0 d0Var) {
        if (d0Var == null) {
            a(com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE);
        }
        return g0(d0Var, k.a.f51331e0.j());
    }

    public static boolean y0(d0 d0Var) {
        if (d0Var == null) {
            a(com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
        }
        return g0(d0Var, k.a.f51327c0.j());
    }

    public static boolean z0(w00.i iVar) {
        if (iVar == null) {
            a(10);
        }
        while (iVar != null) {
            if (iVar instanceof a0) {
                return ((a0) iVar).e().i(k.f51316k);
            }
            iVar = iVar.b();
        }
        return false;
    }

    public k0 B() {
        k0 R = R(i.FLOAT);
        if (R == null) {
            a(60);
        }
        return R;
    }

    public w00.c C(int i11) {
        return p(k.b(i11));
    }

    public void C0(x xVar) {
        if (xVar == null) {
            a(1);
        }
        this.f51288e.a(new d(xVar));
    }

    public k0 D() {
        k0 R = R(i.INT);
        if (R == null) {
            a(58);
        }
        return R;
    }

    public w00.c E() {
        w00.c o11 = o(k.a.Q.l());
        if (o11 == null) {
            a(21);
        }
        return o11;
    }

    public k0 F() {
        k0 R = R(i.LONG);
        if (R == null) {
            a(59);
        }
        return R;
    }

    public w00.c G() {
        return p("Nothing");
    }

    public k0 H() {
        k0 n11 = G().n();
        if (n11 == null) {
            a(48);
        }
        return n11;
    }

    public k0 I() {
        k0 O0 = i().O0(true);
        if (O0 == null) {
            a(51);
        }
        return O0;
    }

    public k0 J() {
        k0 O0 = H().O0(true);
        if (O0 == null) {
            a(49);
        }
        return O0;
    }

    public w00.c K() {
        return p("Number");
    }

    public k0 L() {
        k0 n11 = K().n();
        if (n11 == null) {
            a(55);
        }
        return n11;
    }

    protected x00.c M() {
        c.b bVar = c.b.f56636a;
        if (bVar == null) {
            a(4);
        }
        return bVar;
    }

    public k0 O(i iVar) {
        if (iVar == null) {
            a(73);
        }
        k0 k0Var = this.f51286c.invoke().f51294a.get(iVar);
        if (k0Var == null) {
            a(74);
        }
        return k0Var;
    }

    public k0 R(i iVar) {
        if (iVar == null) {
            a(53);
        }
        k0 n11 = Q(iVar).n();
        if (n11 == null) {
            a(54);
        }
        return n11;
    }

    public k0 T() {
        k0 R = R(i.SHORT);
        if (R == null) {
            a(57);
        }
        return R;
    }

    public j20.n U() {
        j20.n nVar = this.f51288e;
        if (nVar == null) {
            a(6);
        }
        return nVar;
    }

    public w00.c V() {
        return p("String");
    }

    public k0 W() {
        k0 n11 = V().n();
        if (n11 == null) {
            a(65);
        }
        return n11;
    }

    public w00.c X(int i11) {
        w00.c o11 = o(k.f51309d.c(u10.f.f(k.d(i11))));
        if (o11 == null) {
            a(18);
        }
        return o11;
    }

    public w00.c Y() {
        return p("Unit");
    }

    public k0 Z() {
        k0 n11 = Y().n();
        if (n11 == null) {
            a(64);
        }
        return n11;
    }

    public void f(boolean z11) {
        x xVar = new x(f51283f, this.f51288e, this, null);
        this.f51284a = xVar;
        xVar.O0(t00.a.f51275a.a().a(this.f51288e, this.f51284a, v(), M(), g(), z11));
        x xVar2 = this.f51284a;
        xVar2.U0(xVar2);
    }

    protected x00.a g() {
        a.C1295a c1295a = a.C1295a.f56634a;
        if (c1295a == null) {
            a(3);
        }
        return c1295a;
    }

    public w00.c h() {
        return p("Any");
    }

    public k0 i() {
        k0 n11 = h().n();
        if (n11 == null) {
            a(50);
        }
        return n11;
    }

    public w00.c j() {
        return p("Array");
    }

    public d0 k(d0 d0Var) {
        d0 A;
        if (d0Var == null) {
            a(67);
        }
        if (c0(d0Var)) {
            if (d0Var.G0().size() == 1) {
                d0 type = d0Var.G0().get(0).getType();
                if (type == null) {
                    a(68);
                }
                return type;
            }
            throw new IllegalStateException();
        }
        d0 o11 = f1.o(d0Var);
        k0 k0Var = this.f51286c.invoke().f51296c.get(o11);
        if (k0Var != null) {
            return k0Var;
        }
        w00.x h11 = w10.d.h(o11);
        if (h11 == null || (A = A(o11, h11)) == null) {
            throw new IllegalStateException("not array: " + d0Var);
        }
        return A;
    }

    public k0 l(k1 k1Var, d0 d0Var) {
        if (k1Var == null) {
            a(82);
        }
        if (d0Var == null) {
            a(83);
        }
        k0 m11 = m(k1Var, d0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b());
        if (m11 == null) {
            a(84);
        }
        return m11;
    }

    public k0 m(k1 k1Var, d0 d0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (k1Var == null) {
            a(78);
        }
        if (d0Var == null) {
            a(79);
        }
        if (gVar == null) {
            a(80);
        }
        k0 g11 = e0.g(gVar, j(), Collections.singletonList(new a1(k1Var, d0Var)));
        if (g11 == null) {
            a(81);
        }
        return g11;
    }

    public k0 n() {
        k0 R = R(i.BOOLEAN);
        if (R == null) {
            a(63);
        }
        return R;
    }

    public w00.c o(u10.c cVar) {
        if (cVar == null) {
            a(12);
        }
        w00.c c11 = w00.o.c(r(), cVar, d10.d.FROM_BUILTINS);
        if (c11 == null) {
            a(13);
        }
        return c11;
    }

    public x r() {
        if (this.f51284a == null) {
            this.f51284a = this.f51285b.invoke();
        }
        x xVar = this.f51284a;
        if (xVar == null) {
            a(7);
        }
        return xVar;
    }

    public d20.h s() {
        d20.h m11 = r().R(k.f51317l).m();
        if (m11 == null) {
            a(11);
        }
        return m11;
    }

    public k0 t() {
        k0 R = R(i.BYTE);
        if (R == null) {
            a(56);
        }
        return R;
    }

    public k0 u() {
        k0 R = R(i.CHAR);
        if (R == null) {
            a(62);
        }
        return R;
    }

    public Iterable<x00.b> v() {
        List singletonList = Collections.singletonList(new u00.a(this.f51288e, r()));
        if (singletonList == null) {
            a(5);
        }
        return singletonList;
    }

    public w00.c w() {
        w00.c o11 = o(k.a.C);
        if (o11 == null) {
            a(34);
        }
        return o11;
    }

    public w00.c x() {
        return p("Comparable");
    }

    public k0 y() {
        k0 I = I();
        if (I == null) {
            a(52);
        }
        return I;
    }

    public k0 z() {
        k0 R = R(i.DOUBLE);
        if (R == null) {
            a(61);
        }
        return R;
    }
}