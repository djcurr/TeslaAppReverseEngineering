package h20;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;
import kotlin.text.v;

/* loaded from: classes5.dex */
public final class a extends f20.a {

    /* renamed from: m  reason: collision with root package name */
    public static final a f28772m = new a();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private a() {
        /*
            r14 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.f r1 = kotlin.reflect.jvm.internal.impl.protobuf.f.d()
            q10.b.a(r1)
            vz.b0 r0 = vz.b0.f54756a
            java.lang.String r0 = "newInstance().apply(Buil…f::registerAllExtensions)"
            kotlin.jvm.internal.s.f(r1, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<p10.l, java.lang.Integer> r2 = q10.b.f47330a
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.s.f(r2, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<p10.d, java.util.List<p10.b>> r3 = q10.b.f47332c
            java.lang.String r0 = "constructorAnnotation"
            kotlin.jvm.internal.s.f(r3, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<p10.c, java.util.List<p10.b>> r4 = q10.b.f47331b
            java.lang.String r0 = "classAnnotation"
            kotlin.jvm.internal.s.f(r4, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<p10.i, java.util.List<p10.b>> r5 = q10.b.f47333d
            java.lang.String r0 = "functionAnnotation"
            kotlin.jvm.internal.s.f(r5, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<p10.n, java.util.List<p10.b>> r6 = q10.b.f47334e
            java.lang.String r0 = "propertyAnnotation"
            kotlin.jvm.internal.s.f(r6, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<p10.n, java.util.List<p10.b>> r7 = q10.b.f47335f
            java.lang.String r0 = "propertyGetterAnnotation"
            kotlin.jvm.internal.s.f(r7, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<p10.n, java.util.List<p10.b>> r8 = q10.b.f47336g
            java.lang.String r0 = "propertySetterAnnotation"
            kotlin.jvm.internal.s.f(r8, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<p10.g, java.util.List<p10.b>> r9 = q10.b.f47338i
            java.lang.String r0 = "enumEntryAnnotation"
            kotlin.jvm.internal.s.f(r9, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<p10.n, p10.b$b$c> r10 = q10.b.f47337h
            java.lang.String r0 = "compileTimeValue"
            kotlin.jvm.internal.s.f(r10, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<p10.u, java.util.List<p10.b>> r11 = q10.b.f47339j
            java.lang.String r0 = "parameterAnnotation"
            kotlin.jvm.internal.s.f(r11, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<p10.q, java.util.List<p10.b>> r12 = q10.b.f47340k
            java.lang.String r0 = "typeAnnotation"
            kotlin.jvm.internal.s.f(r12, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h$f<p10.s, java.util.List<p10.b>> r13 = q10.b.f47341l
            java.lang.String r0 = "typeParameterAnnotation"
            kotlin.jvm.internal.s.f(r13, r0)
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h20.a.<init>():void");
    }

    private final String o(u10.c cVar) {
        if (cVar.d()) {
            return "default-package";
        }
        String b11 = cVar.g().b();
        s.f(b11, "fqName.shortName().asString()");
        return b11;
    }

    public final String m(u10.c fqName) {
        s.g(fqName, "fqName");
        return s.p(o(fqName), ".kotlin_builtins");
    }

    public final String n(u10.c fqName) {
        String C;
        s.g(fqName, "fqName");
        StringBuilder sb2 = new StringBuilder();
        String b11 = fqName.b();
        s.f(b11, "fqName.asString()");
        C = v.C(b11, CoreConstants.DOT, '/', false, 4, null);
        sb2.append(C);
        sb2.append('/');
        sb2.append(m(fqName));
        return sb2.toString();
    }
}