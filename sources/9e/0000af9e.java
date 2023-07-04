package r00;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Method;
import k20.d0;
import kotlin.jvm.internal.s;
import q00.b0;
import w00.i0;
import w00.l0;
import w00.w0;

/* loaded from: classes5.dex */
public final class h {
    public static final Object a(Object obj, kotlin.reflect.jvm.internal.impl.descriptors.b descriptor) {
        d0 e11;
        Class<?> h11;
        Method f11;
        s.g(descriptor, "descriptor");
        return (((descriptor instanceof i0) && w10.f.d((w0) descriptor)) || (e11 = e(descriptor)) == null || (h11 = h(e11)) == null || (f11 = f(h11, descriptor)) == null) ? obj : f11.invoke(obj, new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0058, code lost:
        if (w10.f.c(r0) != true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0062, code lost:
        if (g(r6) == false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <M extends java.lang.reflect.Member> r00.d<M> b(r00.d<? extends M> r5, kotlin.reflect.jvm.internal.impl.descriptors.b r6, boolean r7) {
        /*
            java.lang.String r0 = "$this$createInlineClassAwareCallerIfNeeded"
            kotlin.jvm.internal.s.g(r5, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.s.g(r6, r0)
            boolean r0 = w10.f.a(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L64
            java.util.List r0 = r6.h()
            java.lang.String r3 = "descriptor.valueParameters"
            kotlin.jvm.internal.s.f(r0, r3)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L27
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L27
        L25:
            r0 = r1
            goto L4c
        L27:
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L25
            java.lang.Object r3 = r0.next()
            w00.v0 r3 = (w00.v0) r3
            java.lang.String r4 = "it"
            kotlin.jvm.internal.s.f(r3, r4)
            k20.d0 r3 = r3.getType()
            java.lang.String r4 = "it.type"
            kotlin.jvm.internal.s.f(r3, r4)
            boolean r3 = w10.f.c(r3)
            if (r3 == 0) goto L2b
            r0 = r2
        L4c:
            if (r0 != 0) goto L64
            k20.d0 r0 = r6.getReturnType()
            if (r0 == 0) goto L5a
            boolean r0 = w10.f.c(r0)
            if (r0 == r2) goto L64
        L5a:
            boolean r0 = r5 instanceof r00.c
            if (r0 != 0) goto L65
            boolean r0 = g(r6)
            if (r0 == 0) goto L65
        L64:
            r1 = r2
        L65:
            if (r1 == 0) goto L6d
            r00.g r0 = new r00.g
            r0.<init>(r6, r5, r7)
            r5 = r0
        L6d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r00.h.b(r00.d, kotlin.reflect.jvm.internal.impl.descriptors.b, boolean):r00.d");
    }

    public static /* synthetic */ d c(d dVar, kotlin.reflect.jvm.internal.impl.descriptors.b bVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return b(dVar, bVar, z11);
    }

    public static final Method d(Class<?> getBoxMethod, kotlin.reflect.jvm.internal.impl.descriptors.b descriptor) {
        s.g(getBoxMethod, "$this$getBoxMethod");
        s.g(descriptor, "descriptor");
        try {
            Method declaredMethod = getBoxMethod.getDeclaredMethod("box-impl", f(getBoxMethod, descriptor).getReturnType());
            s.f(declaredMethod, "getDeclaredMethod(\"box\" …d(descriptor).returnType)");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new b0("No box method found in inline class: " + getBoxMethod + " (calling " + descriptor + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    private static final d0 e(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0 N = bVar.N();
        l0 J = bVar.J();
        if (N != null) {
            return N.getType();
        }
        if (J == null) {
            return null;
        }
        if (bVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
            return J.getType();
        }
        w00.i mo223b = bVar.mo223b();
        if (!(mo223b instanceof w00.c)) {
            mo223b = null;
        }
        w00.c cVar = (w00.c) mo223b;
        if (cVar != null) {
            return cVar.n();
        }
        return null;
    }

    public static final Method f(Class<?> getUnboxMethod, kotlin.reflect.jvm.internal.impl.descriptors.b descriptor) {
        s.g(getUnboxMethod, "$this$getUnboxMethod");
        s.g(descriptor, "descriptor");
        try {
            Method declaredMethod = getUnboxMethod.getDeclaredMethod("unbox-impl", new Class[0]);
            s.f(declaredMethod, "getDeclaredMethod(\"unbox…FOR_INLINE_CLASS_MEMBERS)");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new b0("No unbox method found in inline class: " + getUnboxMethod + " (calling " + descriptor + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    private static final boolean g(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        d0 e11 = e(bVar);
        return e11 != null && w10.f.c(e11);
    }

    public static final Class<?> h(d0 toInlineClass) {
        s.g(toInlineClass, "$this$toInlineClass");
        return i(toInlineClass.H0().n());
    }

    public static final Class<?> i(w00.i iVar) {
        if ((iVar instanceof w00.c) && w10.f.b(iVar)) {
            w00.c cVar = (w00.c) iVar;
            Class<?> p11 = q00.l0.p(cVar);
            if (p11 != null) {
                return p11;
            }
            throw new b0("Class object for the class " + cVar.getName() + " cannot be found (classId=" + a20.a.h((w00.e) iVar) + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        return null;
    }
}