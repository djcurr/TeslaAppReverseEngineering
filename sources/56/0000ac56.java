package q00;

import a10.m;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.spongycastle.pqc.math.linearalgebra.Matrix;
import w00.n0;
import wz.s0;
import y10.q;

/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    private static final u10.c f47199a = new u10.c("kotlin.jvm.JvmStatic");

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v3, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v5, types: [byte[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=char[], code=short[], for r7v4, types: [char[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [double[]] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v7, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v8, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v9, types: [long[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.Object a(y10.b r6, java.lang.ClassLoader r7) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q00.l0.a(y10.b, java.lang.ClassLoader):java.lang.Object");
    }

    public static final f<?> b(Object obj) {
        f<?> fVar = (f) (!(obj instanceof f) ? null : obj);
        if (fVar == null) {
            fVar = c(obj);
        }
        return fVar != null ? fVar : d(obj);
    }

    public static final l c(Object obj) {
        l lVar = (l) (!(obj instanceof l) ? null : obj);
        if (lVar != null) {
            return lVar;
        }
        if (!(obj instanceof kotlin.jvm.internal.o)) {
            obj = null;
        }
        kotlin.jvm.internal.o oVar = (kotlin.jvm.internal.o) obj;
        n00.c compute = oVar != null ? oVar.compute() : null;
        return compute instanceof l ? compute : null;
    }

    public static final u<?> d(Object obj) {
        u<?> uVar = (u) (!(obj instanceof u) ? null : obj);
        if (uVar != null) {
            return uVar;
        }
        if (!(obj instanceof kotlin.jvm.internal.g0)) {
            obj = null;
        }
        kotlin.jvm.internal.g0 g0Var = (kotlin.jvm.internal.g0) obj;
        n00.c compute = g0Var != null ? g0Var.compute() : null;
        return compute instanceof u ? compute : null;
    }

    public static final List<Annotation> e(kotlin.reflect.jvm.internal.impl.descriptors.annotations.a computeAnnotations) {
        kotlin.jvm.internal.s.g(computeAnnotations, "$this$computeAnnotations");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g mo140getAnnotations = computeAnnotations.mo140getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : mo140getAnnotations) {
            n0 f11 = cVar.f();
            Annotation annotation = null;
            if (f11 instanceof a10.b) {
                annotation = ((a10.b) f11).d();
            } else if (f11 instanceof m.a) {
                b10.n c11 = ((m.a) f11).c();
                if (!(c11 instanceof b10.c)) {
                    c11 = null;
                }
                b10.c cVar2 = (b10.c) c11;
                if (cVar2 != null) {
                    annotation = cVar2.P();
                }
            } else {
                annotation = o(cVar);
            }
            if (annotation != null) {
                arrayList.add(annotation);
            }
        }
        return arrayList;
    }

    public static final Class<?> f(Class<?> createArrayType) {
        kotlin.jvm.internal.s.g(createArrayType, "$this$createArrayType");
        return Array.newInstance(createArrayType, 0).getClass();
    }

    public static final Object g(Type type) {
        kotlin.jvm.internal.s.g(type, "type");
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            if (kotlin.jvm.internal.s.c(type, Boolean.TYPE)) {
                return Boolean.FALSE;
            }
            if (kotlin.jvm.internal.s.c(type, Character.TYPE)) {
                return Character.valueOf((char) 0);
            }
            if (kotlin.jvm.internal.s.c(type, Byte.TYPE)) {
                return Byte.valueOf((byte) 0);
            }
            if (kotlin.jvm.internal.s.c(type, Short.TYPE)) {
                return Short.valueOf((short) 0);
            }
            if (kotlin.jvm.internal.s.c(type, Integer.TYPE)) {
                return 0;
            }
            if (kotlin.jvm.internal.s.c(type, Float.TYPE)) {
                return Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
            }
            if (kotlin.jvm.internal.s.c(type, Long.TYPE)) {
                return 0L;
            }
            if (kotlin.jvm.internal.s.c(type, Double.TYPE)) {
                return Double.valueOf(0.0d);
            }
            if (kotlin.jvm.internal.s.c(type, Void.TYPE)) {
                throw new IllegalStateException("Parameter with void type is illegal");
            }
            throw new UnsupportedOperationException("Unknown primitive: " + type);
        }
        return null;
    }

    public static final <M extends kotlin.reflect.jvm.internal.impl.protobuf.o, D extends kotlin.reflect.jvm.internal.impl.descriptors.a> D h(Class<?> moduleAnchor, M proto, r10.c nameResolver, r10.g typeTable, r10.a metadataVersion, h00.p<? super g20.v, ? super M, ? extends D> createDescriptor) {
        List<p10.s> Z;
        kotlin.jvm.internal.s.g(moduleAnchor, "moduleAnchor");
        kotlin.jvm.internal.s.g(proto, "proto");
        kotlin.jvm.internal.s.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.s.g(typeTable, "typeTable");
        kotlin.jvm.internal.s.g(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.s.g(createDescriptor, "createDescriptor");
        a10.k a11 = c0.a(moduleAnchor);
        if (proto instanceof p10.i) {
            Z = ((p10.i) proto).Y();
        } else if (!(proto instanceof p10.n)) {
            throw new IllegalStateException(("Unsupported message: " + proto).toString());
        } else {
            Z = ((p10.n) proto).Z();
        }
        List<p10.s> typeParameters = Z;
        g20.j a12 = a11.a();
        w00.x b11 = a11.b();
        r10.i b12 = r10.i.f49075b.b();
        kotlin.jvm.internal.s.f(typeParameters, "typeParameters");
        return createDescriptor.mo160invoke(new g20.v(new g20.l(a12, nameResolver, b11, typeTable, b12, metadataVersion, null, null, typeParameters)), proto);
    }

    public static final w00.l0 i(kotlin.reflect.jvm.internal.impl.descriptors.a instanceReceiverParameter) {
        kotlin.jvm.internal.s.g(instanceReceiverParameter, "$this$instanceReceiverParameter");
        if (instanceReceiverParameter.J() != null) {
            w00.i mo223b = instanceReceiverParameter.mo223b();
            Objects.requireNonNull(mo223b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return ((w00.c) mo223b).E0();
        }
        return null;
    }

    public static final u10.c j() {
        return f47199a;
    }

    public static final boolean k(n00.p isInlineClassType) {
        k20.d0 r11;
        kotlin.jvm.internal.s.g(isInlineClassType, "$this$isInlineClassType");
        if (!(isInlineClassType instanceof x)) {
            isInlineClassType = null;
        }
        x xVar = (x) isInlineClassType;
        return (xVar == null || (r11 = xVar.r()) == null || !w10.f.c(r11)) ? false : true;
    }

    private static final Class<?> l(ClassLoader classLoader, String str, String str2, int i11) {
        String C;
        String z11;
        if (kotlin.jvm.internal.s.c(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(CoreConstants.DOT);
        C = kotlin.text.v.C(str2, CoreConstants.DOT, CoreConstants.DOLLAR, false, 4, null);
        sb2.append(C);
        String sb3 = sb2.toString();
        if (i11 > 0) {
            StringBuilder sb4 = new StringBuilder();
            z11 = kotlin.text.v.z("[", i11);
            sb4.append(z11);
            sb4.append(Matrix.MATRIX_TYPE_RANDOM_LT);
            sb4.append(sb3);
            sb4.append(';');
            sb3 = sb4.toString();
        }
        return a10.e.a(classLoader, sb3);
    }

    private static final Class<?> m(ClassLoader classLoader, u10.b bVar, int i11) {
        v00.c cVar = v00.c.f53787a;
        u10.d j11 = bVar.b().j();
        kotlin.jvm.internal.s.f(j11, "kotlinClassId.asSingleFqName().toUnsafe()");
        u10.b o11 = cVar.o(j11);
        if (o11 != null) {
            bVar = o11;
        }
        String b11 = bVar.h().b();
        kotlin.jvm.internal.s.f(b11, "javaClassId.packageFqName.asString()");
        String b12 = bVar.i().b();
        kotlin.jvm.internal.s.f(b12, "javaClassId.relativeClassName.asString()");
        return l(classLoader, b11, b12, i11);
    }

    static /* synthetic */ Class n(ClassLoader classLoader, u10.b bVar, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return m(classLoader, bVar, i11);
    }

    private static final Annotation o(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        Map t11;
        w00.c f11 = a20.a.f(cVar);
        Class<?> p11 = f11 != null ? p(f11) : null;
        if (!(p11 instanceof Class)) {
            p11 = null;
        }
        if (p11 != null) {
            Set<Map.Entry<u10.f, y10.g<?>>> entrySet = cVar.g().entrySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = entrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                u10.f fVar = (u10.f) entry.getKey();
                ClassLoader classLoader = p11.getClassLoader();
                kotlin.jvm.internal.s.f(classLoader, "annotationClass.classLoader");
                Object r11 = r((y10.g) entry.getValue(), classLoader);
                vz.p a11 = r11 != null ? vz.v.a(fVar.b(), r11) : null;
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
            t11 = s0.t(arrayList);
            return (Annotation) r00.b.d(p11, t11, null, 4, null);
        }
        return null;
    }

    public static final Class<?> p(w00.c toJavaClass) {
        kotlin.jvm.internal.s.g(toJavaClass, "$this$toJavaClass");
        n0 source = toJavaClass.f();
        kotlin.jvm.internal.s.f(source, "source");
        if (source instanceof n10.q) {
            n10.o d11 = ((n10.q) source).d();
            Objects.requireNonNull(d11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((a10.f) d11).d();
        } else if (source instanceof m.a) {
            b10.n c11 = ((m.a) source).c();
            Objects.requireNonNull(c11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((b10.j) c11).getElement();
        } else {
            u10.b h11 = a20.a.h(toJavaClass);
            if (h11 != null) {
                return m(b10.b.f(toJavaClass.getClass()), h11, 0);
            }
            return null;
        }
    }

    public static final n00.t q(w00.q toKVisibility) {
        kotlin.jvm.internal.s.g(toKVisibility, "$this$toKVisibility");
        if (kotlin.jvm.internal.s.c(toKVisibility, w00.p.f55309e)) {
            return n00.t.PUBLIC;
        }
        if (kotlin.jvm.internal.s.c(toKVisibility, w00.p.f55307c)) {
            return n00.t.PROTECTED;
        }
        if (kotlin.jvm.internal.s.c(toKVisibility, w00.p.f55308d)) {
            return n00.t.INTERNAL;
        }
        if (kotlin.jvm.internal.s.c(toKVisibility, w00.p.f55305a) || kotlin.jvm.internal.s.c(toKVisibility, w00.p.f55306b)) {
            return n00.t.PRIVATE;
        }
        return null;
    }

    private static final Object r(y10.g<?> gVar, ClassLoader classLoader) {
        if (gVar instanceof y10.a) {
            return o(((y10.a) gVar).b());
        }
        if (gVar instanceof y10.b) {
            return a((y10.b) gVar, classLoader);
        }
        if (gVar instanceof y10.j) {
            vz.p<? extends u10.b, ? extends u10.f> b11 = ((y10.j) gVar).b();
            u10.f b12 = b11.b();
            Class n11 = n(classLoader, b11.a(), 0, 4, null);
            if (n11 != null) {
                return j0.a(n11, b12.b());
            }
            return null;
        } else if (gVar instanceof y10.q) {
            q.b b13 = ((y10.q) gVar).b();
            if (b13 instanceof q.b.C1339b) {
                q.b.C1339b c1339b = (q.b.C1339b) b13;
                return m(classLoader, c1339b.b(), c1339b.a());
            } else if (b13 instanceof q.b.a) {
                w00.e n12 = ((q.b.a) b13).a().H0().n();
                if (!(n12 instanceof w00.c)) {
                    n12 = null;
                }
                w00.c cVar = (w00.c) n12;
                if (cVar != null) {
                    return p(cVar);
                }
                return null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if ((gVar instanceof y10.k) || (gVar instanceof y10.s)) {
            return null;
        } else {
            return gVar.b();
        }
    }
}